package com.yunjia.mapper;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface NsqApp2DevMapper {

    @Insert("INSERT INTO test.user_info   VALUES (#{uid},#{buttonId},#{result})")
    boolean insert2table(@Param(value = "uid") String uid,@Param(value = "buttonId") int buttonId,@Param(value = "result") boolean result);

}
