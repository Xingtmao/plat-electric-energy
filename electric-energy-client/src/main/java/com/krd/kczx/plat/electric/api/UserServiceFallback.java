package com.krd.kczx.plat.electric.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author iomt
 * @create 2018/3/7.
 */
@Service
@Slf4j
public class UserServiceFallback implements IAuthService {
    @Override
    public List<Object> getPermissionByAccount(@PathVariable("account") String account) {
        log.error("调用{}异常{}","getPermissionByAccount",account);
        return null;
    }

    @Override
    public List<Object> getAllPermissionInfo() {
        log.error("调用{}异常","getPermissionByAccount");
        return null;
    }
}
