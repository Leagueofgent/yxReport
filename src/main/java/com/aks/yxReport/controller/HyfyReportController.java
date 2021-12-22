package com.aks.yxReport.controller;


import com.aks.yxReport.service.impl.HyfyReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gent
 * @date 2021/12/23 0:14
 */

@RestController
public class HyfyReportController {

    @Autowired
    private HyfyReportServiceImpl hyfyReportService;


    @RequestMapping(value = "/getAllHyfy")
    public Object getAllHyfy(){

        return hyfyReportService.getAllHyfy();
    }

}
