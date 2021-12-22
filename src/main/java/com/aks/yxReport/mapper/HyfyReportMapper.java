package com.aks.yxReport.mapper;

import com.aks.yxReport.pojo.HyfyReport;
import com.aks.yxReport.pojo.HyfyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HyfyReportMapper {
    int countByExample(HyfyReportExample example);

    int deleteByExample(HyfyReportExample example);

    int insert(HyfyReport record);

    int insertSelective(HyfyReport record);

    List<HyfyReport> selectByExample(HyfyReportExample example);

    int updateByExampleSelective(@Param("record") HyfyReport record, @Param("example") HyfyReportExample example);

    int updateByExample(@Param("record") HyfyReport record, @Param("example") HyfyReportExample example);
}