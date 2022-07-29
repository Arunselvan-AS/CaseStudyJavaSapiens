package com.sapiens.app.service;

import java.util.List;

import com.sapiens.app.entity.Policy;

public interface PolicyService 
{
	List<Policy> getAllPolicy();
	public Policy savePolicy(Policy policy);
	public Policy updatePolicy(Policy policy);
	public Policy getPolicyByID(Integer id);
}
