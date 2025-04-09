package com.example.springJpaMapping.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Projects.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Projects_ {

	
	/**
	 * @see com.example.springJpaMapping.entities.Projects#id
	 **/
	public static volatile SingularAttribute<Projects, Long> id;
	
	/**
	 * @see com.example.springJpaMapping.entities.Projects#projectName
	 **/
	public static volatile SingularAttribute<Projects, String> projectName;
	
	/**
	 * @see com.example.springJpaMapping.entities.Projects#employee
	 **/
	public static volatile SingularAttribute<Projects, Employee> employee;
	
	/**
	 * @see com.example.springJpaMapping.entities.Projects
	 **/
	public static volatile EntityType<Projects> class_;
	
	/**
	 * @see com.example.springJpaMapping.entities.Projects#budget
	 **/
	public static volatile SingularAttribute<Projects, Double> budget;

	public static final String ID = "id";
	public static final String PROJECT_NAME = "projectName";
	public static final String EMPLOYEE = "employee";
	public static final String BUDGET = "budget";

}

