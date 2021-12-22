package com.aks.yxReport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages="com.aks")
public class YxReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxReportApplication.class, args);
    }

}
