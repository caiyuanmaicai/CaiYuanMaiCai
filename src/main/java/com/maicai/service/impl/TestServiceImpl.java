package com.maicai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maicai.entity.Test;
import com.maicai.mapper.TestMapper;
import com.maicai.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;

	@Override
	public String test() {

		Test test = new Test();

		// 测试查询--无参数
		String testS = testMapper.test();
		System.out.println(testS);

		// 测试查询--不注解， _param
		String testWithParam = testMapper.testWithParam("1");
		System.out.println(testWithParam);
		// 测试查询--不注解，bean带类型
		String testWithParam1 = testMapper.testWithParam1(test);
		System.out.println(testWithParam1);

		// 测试查询--注解， 注解名
		String testWithParam2 = testMapper.testWithParam2("1");
		System.out.println(testWithParam2);

		// 测试查询--参数查询
		List<String> testWithParam3 = testMapper.testWithParam3("1", test);
		System.out.println(testWithParam3.size());

		// 测试查询--参数查询
		List<Test> testWithParam4 = testMapper.testWithParam4();
		System.out.println(testWithParam4.size());

		// 测试查询--多条数据查询
		Integer testInsert = testMapper.testInsert("1", test);
		System.out.println(testInsert);

		Integer testUpdate = testMapper.testUpdate("1", test);
		System.out.println(testUpdate);

		Integer testDelete = testMapper.testDelete("1", test);
		System.out.println(testDelete);

		return "";
	}

}
