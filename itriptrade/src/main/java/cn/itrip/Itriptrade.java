package cn.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.ManagedBean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.itrip.*")
public class Itriptrade
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        SpringApplication.run(Itriptrade.class,args);
    }
}
