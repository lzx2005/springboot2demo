package com.lzx2005.spring2demo.config;

import com.lzx2005.spring2demo.dao.UserDao;
import com.lzx2005.spring2demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by Lizhengxian on 2018/2/28.
 */

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
