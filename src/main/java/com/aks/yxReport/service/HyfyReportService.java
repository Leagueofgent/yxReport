package com.aks.yxReport.service;

import com.aks.yxReport.pojo.HyfyReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author gent
 * @date 2021/12/23 0:09
 */
public interface HyfyReportService {

    List<HyfyReport> getAllHyfy();

}
