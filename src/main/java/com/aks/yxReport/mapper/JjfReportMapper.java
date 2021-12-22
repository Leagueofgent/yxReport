package com.aks.yxReport.mapper;

import com.aks.yxReport.pojo.JjfReport;
import com.aks.yxReport.pojo.JjfReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JjfReportMapper {
    int countByExample(JjfReportExample example);

    int deleteByExample(JjfReportExample example);

    int insert(JjfReport record);

    int insertSelective(JjfReport record);

    List<JjfReport> selectByExample(JjfReportExample example);

    int updateByExampleSelective(@Param("record") JjfReport record, @Param("example") JjfReportExample example);

    int updateByExample(@Param("record") JjfReport record, @Param("example") JjfReportExample example);
}