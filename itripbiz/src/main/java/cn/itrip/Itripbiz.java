package cn.itrip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: cn.itrip.Itripbiz
 * @Description: 爱旅行业务模块核心启动类
 * @Author:      Administrator
 * @CreateDate: 2019/7/29 0029 下午 6:56
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@SpringBootApplication
//这里通过JAVA的配置方式配置成功后，可以将这里注释掉
//@MapperScan(basePackages = {"cn.itrip.dao"})
public class Itripbiz {

    public static void main(String[] args) {
        SpringApplication.run(Itripbiz.class,args);
    }
}
