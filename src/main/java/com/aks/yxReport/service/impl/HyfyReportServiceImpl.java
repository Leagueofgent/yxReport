package com.aks.yxReport.service.impl;

import com.aks.yxReport.mapper.HyfyReportMapper;
import com.aks.yxReport.pojo.HyfyReport;
import com.aks.yxReport.service.HyfyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gent
 * @date 2021/12/23 0:09
 */
@Service
public class HyfyReportServiceImpl implements HyfyReportService {

    @Autowired
    private HyfyReportMapper hyfyReportMapper;

    @Override
    public List<HyfyReport> getAllHyfy() {
        return hyfyReportMapper.selectByExample(null);
    }
}
