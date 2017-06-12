package com.zhou.hai.mapper;

import com.zhou.hai.domain.Photodetail;
import com.zhou.hai.domain.PhotodetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotodetailMapper {
    int countByExample(PhotodetailExample example);

    int deleteByExample(PhotodetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Photodetail record);

    int insertSelective(Photodetail record);

    List<Photodetail> selectByExample(PhotodetailExample example);

    Photodetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Photodetail record, @Param("example") PhotodetailExample example);

    int updateByExample(@Param("record") Photodetail record, @Param("example") PhotodetailExample example);

    int updateByPrimaryKeySelective(Photodetail record);

    int updateByPrimaryKey(Photodetail record);
}