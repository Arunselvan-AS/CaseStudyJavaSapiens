package com.sapiens.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapiens.app.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{

}
