package com.abc.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.onlinestore.entity.ElectronicDetails;
@Repository
public interface ElectronicDetailsRepository extends JpaRepository<ElectronicDetails,Integer> {
	

}
