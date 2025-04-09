package com.example.springJpaMapping.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Employee.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Employee_ {

	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#lastName
	 **/
	public static volatile SingularAttribute<Employee, String> lastName;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#firstName
	 **/
	public static volatile SingularAttribute<Employee, String> firstName;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#manager_id
	 **/
	public static volatile SingularAttribute<Employee, Integer> manager_id;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#phone
	 **/
	public static volatile ListAttribute<Employee, Phone> phone;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#project
	 **/
	public static volatile ListAttribute<Employee, Projects> project;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#id
	 **/
	public static volatile SingularAttribute<Employee, Long> id;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee#salary
	 **/
	public static volatile SingularAttribute<Employee, Long> salary;
	
	/**
	 * @see com.example.springJpaMapping.entities.Employee
	 **/
	public static volatile EntityType<Employee> class_;

	public static final String LAST_NAME = "lastName";
	public static final String FIRST_NAME = "firstName";
	public static final String MANAGER_ID = "manager_id";
	public static final String PHONE = "phone";
	public static final String PROJECT = "project";
	public static final String ID = "id";
	public static final String SALARY = "salary";

}

