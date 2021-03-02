package com.shop.mapper;

import com.shop.domain.SampleBoardVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface testBoardMapper {

    @Select("select * from tbl_testBoard where bno > 0")
    public List<SampleBoardVO> getList();
}
