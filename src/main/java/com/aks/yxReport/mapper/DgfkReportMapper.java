package com.aks.yxReport.mapper;

import com.aks.yxReport.pojo.DgfkReport;
import com.aks.yxReport.pojo.DgfkReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DgfkReportMapper {
    int countByExample(DgfkReportExample example);

    int deleteByExample(DgfkReportExample example);

    int insert(DgfkReport record);

    int insertSelective(DgfkReport record);

    List<DgfkReport> selectByExample(DgfkReportExample example);

    int updateByExampleSelective(@Param("record") DgfkReport record, @Param("example") DgfkReportExample example);

    int updateByExample(@Param("record") DgfkReport record, @Param("example") DgfkReportExample example);
}