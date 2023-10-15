package com.otya.namemanagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {

    @Select("SELECT name FROM name")
    List<Name> findAll();

    @Select("SELECT * FROM name WHERE id = #{id}")
    Optional<Name> findById(int id);
}
