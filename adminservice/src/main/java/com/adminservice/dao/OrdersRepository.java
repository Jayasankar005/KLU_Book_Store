package com.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adminservice.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long>{

}
