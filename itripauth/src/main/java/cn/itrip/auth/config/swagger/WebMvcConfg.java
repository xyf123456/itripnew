package cn.itrip.auth.config.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: com.tt.springbootorder.config.swagger.WebMvcConfg
 * @Description: mvc的配置
 * @Author: Administrator
 * @CreateDate: 2019/7/28 0028 下午 10:47
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
@Configuration
//public class WebMvcConfg extends WebMvcConfigurationSupport {
public class WebMvcConfg extends WebMvcConfigurerAdapter {

    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/").setCachePeriod(0);

    }*/

    /**
     * 增加swagger的支持
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
