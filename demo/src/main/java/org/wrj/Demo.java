package org.wrj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("org.wrj.mapper")
public class Demo
{
    public static void main( String[] args )
    {
        SpringApplication.run(Demo.class,args);
    }
}
