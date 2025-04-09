package com.example.springJpaMapping.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Address.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Address_ {

	
	/**
	 * @see com.example.springJpaMapping.entities.Address#country
	 **/
	public static volatile SingularAttribute<Address, String> country;
	
	/**
	 * @see com.example.springJpaMapping.entities.Address#city
	 **/
	public static volatile SingularAttribute<Address, String> city;
	
	/**
	 * @see com.example.springJpaMapping.entities.Address#street
	 **/
	public static volatile SingularAttribute<Address, String> street;
	
	/**
	 * @see com.example.springJpaMapping.entities.Address#id
	 **/
	public static volatile SingularAttribute<Address, Long> id;
	
	/**
	 * @see com.example.springJpaMapping.entities.Address#employee
	 **/
	public static volatile SingularAttribute<Address, Employee> employee;
	
	/**
	 * @see com.example.springJpaMapping.entities.Address
	 **/
	public static volatile EntityType<Address> class_;

	public static final String COUNTRY = "country";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";

}

