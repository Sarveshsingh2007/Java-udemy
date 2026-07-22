package com.sarvesh.config;

import com.sarvesh.Alien;
import com.sarvesh.Computer;
import com.sarvesh.Desktop;
import com.sarvesh.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.sarvesh")
public class AppConfig {

//    @Bean
//    public Alien alien(Computer computer){   //@Qualifier("desktop") Computer computer
//        Alien obj = new Alien();
//        obj.setAge(21);
//        obj.setCom(computer);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
////    @Bean(name ={"com", "desktop", "desktop1"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
}
