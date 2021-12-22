package com.aks.yxReport.controller;

import com.aks.yxReport.service.impl.DgfkReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DgfkReportController {

    @Autowired
    private DgfkReportServiceImpl dgfkReportService;

    @RequestMapping(value = "/getAllDgfk")
    public Object getAllDgfk(){

        return dgfkReportService.getAllDgfkReport();
    }

}
