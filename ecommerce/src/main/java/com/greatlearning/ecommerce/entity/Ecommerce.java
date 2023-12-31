package com.greatlearning.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ecommerce")
public class Ecommerce {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
}
