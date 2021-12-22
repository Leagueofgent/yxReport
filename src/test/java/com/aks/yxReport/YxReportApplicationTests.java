package com.aks.yxReport;

import com.aks.yxReport.mapper.ClbxReportMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@MapperScan("com.aks.yxReport")
@SpringBootTest
class YxReportApplicationTests {

    @Autowired
    private ClbxReportMapper clbxReportMapper;

    @Test
    void contextLoads() {
        clbxReportMapper.selectByExample(null);


    }

}
