package com.aks.yxReport.service.impl;

import com.aks.yxReport.mapper.DgfkReportMapper;
import com.aks.yxReport.pojo.DgfkReport;
import com.aks.yxReport.service.DgfkReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DgfkReportServiceImpl implements DgfkReportService {

    @Autowired
    private DgfkReportMapper dgfkReportMapper;

    @Override
    public List<DgfkReport> getAllDgfkReport() {
        return dgfkReportMapper.selectByExample(null);
    }
}
