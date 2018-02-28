# Spring Boot 2.0体验

- WebFlux体验
- 新的Maven包
- 打包测试


WebFlux写法：

```java

@Configuration
public class FluxConfig {

    @Autowired
    private UserDao userDao;

    @Bean
    public RouterFunction<ServerResponse> getAll() {
        return RouterFunctions.route(
                RequestPredicates.GET("/get"),
                request -> ServerResponse.ok().body(BodyInserters.fromObject(userDao.getAll()))
        );
    }

}
```

详情可以参考 Spring Boot 2.0 文档:

[Spring Boot 2.0 文档](https://docs.spring.io/spring/docs/5.0.4.RELEASE/spring-framework-reference/web-reactive.html#web-uri-encoding)