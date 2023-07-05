package com.greatlearning.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.ecommerce.dao.EcommerceRepository;
import com.greatlearning.ecommerce.entity.Ecommerce;

@Service
public class EcommerceServiceImpl implements EcommerceService {
	@Autowired
	EcommerceRepository repository;

	@Override
	public List<Ecommerce> getAllCustomers() {
		return repository.findAll();
	}

}
