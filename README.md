
### electric-client

- 当前模块中只有两种包：
    1. dto 所有接口请求返回参数对象  
    2. api 微服务接口
- 注解
    1. DTO是应对前端多变的需求而使用的，DTO对象不怕多，只是展示用的。

### electric-api
- 只定义所有controller接口：
    1. 请求返回参数调用client
    2. 调用service使用bo类
### electric-service
- 所有业务层、数据接口层在当前模块