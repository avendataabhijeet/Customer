package com.customer.dao;

import org.springframework.stereotype.Repository;

import com.customer.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{



}
