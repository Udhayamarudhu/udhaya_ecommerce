package com.greatlearning.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.ecommerce.entity.Ecommerce;

@Repository
public interface EcommerceRepository extends JpaRepository<Ecommerce, Integer>{
	

}
