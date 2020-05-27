package com.krd.kczx.plat.electric.api;

import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Example: 调用其他微服务接口,以下以调用认证接口为例,认证服务的名称为hdps-auth,必须在spring-gateway中做了路由配置
 * hdps-auth服务中必须有/user/un/{account}/permissions和/permissions接口
 * @author wanghaobin
 * @create 2017-06-21 8:11
 */
@FeignClient(value = "hdps-auth",fallback = UserServiceFallback.class, configuration = HttpMessageConvertersAutoConfiguration.class)
public interface IAuthService {
  @RequestMapping(value="/user/un/{account}/permissions",method = RequestMethod.GET)
  List<Object> getPermissionByAccount(@PathVariable("account") String account);

  @RequestMapping(value="/permissions",method = RequestMethod.GET)
  List<Object> getAllPermissionInfo();
}
