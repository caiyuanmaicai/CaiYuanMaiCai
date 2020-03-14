package com.maicai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maicai.mapper.TestMapper;
import com.maicai.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;

	@Override
	public String test() {

		return testMapper.test();
	}

}
