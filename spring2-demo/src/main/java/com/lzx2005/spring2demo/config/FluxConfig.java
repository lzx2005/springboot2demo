package com.lzx2005.spring2demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by Lizhengxian on 2018/2/28.
 */

@Configuration
public class FluxConfig {

    @Bean
    public RouterFunction<ServerResponse> getAll(){
        //RouterFunctions.route()
        return null;
    }

}
