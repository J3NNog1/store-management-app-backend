package com.jenncodes.storemanagementapplication1.repository;

import com.jenncodes.storemanagementapplication1.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {

}
