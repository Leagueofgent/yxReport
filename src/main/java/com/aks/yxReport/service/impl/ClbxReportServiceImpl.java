package com.aks.yxReport.service.impl;

import com.aks.yxReport.mapper.ClbxReportMapper;
import com.aks.yxReport.pojo.ClbxReport;
import com.aks.yxReport.service.ClbxReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClbxReportServiceImpl implements ClbxReportService {

    @Autowired
    private ClbxReportMapper clbxReportMapper;

    @Override
    public List<ClbxReport> getAllClbxReport() {
        return clbxReportMapper.selectByExample(null);
    }
}
