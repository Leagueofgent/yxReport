package com.aks.yxReport.mapper;

import com.aks.yxReport.pojo.ClbxReport;
import com.aks.yxReport.pojo.ClbxReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClbxReportMapper {
    int countByExample(ClbxReportExample example);

    int deleteByExample(ClbxReportExample example);

    int insert(ClbxReport record);

    int insertSelective(ClbxReport record);

    List<ClbxReport> selectByExample(ClbxReportExample example);

    int updateByExampleSelective(@Param("record") ClbxReport record, @Param("example") ClbxReportExample example);

    int updateByExample(@Param("record") ClbxReport record, @Param("example") ClbxReportExample example);
}