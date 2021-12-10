package cn.itcast.goods;

import cn.itcast.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.goods.mapper")
@SpringBootApplication
//定义全局日志配置
@EnableFeignClients(basePackages = "cn.itcast.feign.clients",defaultConfiguration = DefaultFeignConfiguration.class)  //开启自动装配
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
//    创建RestTemplate并注入Spring容器
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    修改负载均衡规则
//    @Bean
//    public IRule randomRule(){
//        return new RandomRule();
//    }
}