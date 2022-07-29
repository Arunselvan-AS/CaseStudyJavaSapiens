package com.sapiens.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sapiens.app.entity.Policy;
import com.sapiens.app.repository.PolicyRepository;
import com.sapiens.app.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService{
	private PolicyRepository policyRepository;
	
	public PolicyServiceImpl(PolicyRepository policyRepository) {
		super();
		this.policyRepository = policyRepository;
	}
	@Override
	public List<Policy> getAllPolicy() {
		// TODO Auto-generated method stub
		return policyRepository.findAll();
	}

	@Override
	public Policy savePolicy(Policy policy) {
		return policyRepository.save(policy);
	}

	@Override
	public Policy updatePolicy(Policy policy) {
		return policyRepository.save(policy);
	}
	@Override
	public Policy getPolicyByID(Integer id) {
		return policyRepository.findById(id).get();
	}

}
