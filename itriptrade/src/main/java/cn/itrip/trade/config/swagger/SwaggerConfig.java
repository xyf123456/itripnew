package cn.itrip.trade.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: com.tt.springbootorder.config.swagger.SwaggerConfig
 * @Description: swagger的核心配置类
 * @Author: Administrator
 * @CreateDate: 2019/7/28 0028 下午 9:03
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
@Configuration
@ComponentScan(basePackages = {"cn.itrip.trade.controller"})
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("爱旅行-认证模块API")
                .termsOfServiceUrl("http://www.itrip.com/auth")
                .contact("爱旅行")
                .version("1.0")
                .build();
    }
}
