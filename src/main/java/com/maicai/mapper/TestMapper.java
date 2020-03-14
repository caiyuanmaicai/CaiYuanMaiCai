package com.maicai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.maicai.entity.Test;

@Mapper
public interface TestMapper {

	// 测试查询
	public String test();

	// 测试带参数
	public String testWithParam(String abc);

	public String testWithParam1(Test test);
	
	//测试带参数2
	public String testWithParam2(@Param("paramA") String p1);

	// 测试带参数
	public List<String> testWithParam3(@Param("paramA") String p1, @Param("test") Test test);

	public List<Test> testWithParam4();

	// 测试插入
	public Integer testInsert(@Param("paramA") String p1, @Param("test") Test test);

	// 测试更新
	public Integer testUpdate(@Param("paramA") String p1, @Param("test") Test test);

	// 测试删除
	public Integer testDelete(@Param("paramA") String p1, @Param("test") Test test);



}
