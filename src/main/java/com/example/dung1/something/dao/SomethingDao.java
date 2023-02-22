package com.example.dung1.something.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SomethingDao {

    @MapKey("tableName")
    List<Map<String, Object>> findAll();

}
