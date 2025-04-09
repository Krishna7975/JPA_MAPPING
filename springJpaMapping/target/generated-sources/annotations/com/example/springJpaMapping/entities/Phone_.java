package com.example.springJpaMapping.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Phone.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Phone_ {

	
	/**
	 * @see com.example.springJpaMapping.entities.Phone#countryCode
	 **/
	public static volatile SingularAttribute<Phone, Integer> countryCode;
	
	/**
	 * @see com.example.springJpaMapping.entities.Phone#id
	 **/
	public static volatile SingularAttribute<Phone, Long> id;
	
	/**
	 * @see com.example.springJpaMapping.entities.Phone#employee
	 **/
	public static volatile SingularAttribute<Phone, Employee> employee;
	
	/**
	 * @see com.example.springJpaMapping.entities.Phone
	 **/
	public static volatile EntityType<Phone> class_;
	
	/**
	 * @see com.example.springJpaMapping.entities.Phone#phoneNo
	 **/
	public static volatile SingularAttribute<Phone, Integer> phoneNo;

	public static final String COUNTRY_CODE = "countryCode";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String PHONE_NO = "phoneNo";

}

