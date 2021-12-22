package com.aks.yxReport.controller;

import com.aks.yxReport.service.impl.ClbxReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ClbxReportController {

    @Autowired
    ClbxReportServiceImpl clbxReportService;

    @RequestMapping(value = "/getAllClbx")
    public Object getAllClbx(){

        return clbxReportService.getAllClbxReport();
    }

}
