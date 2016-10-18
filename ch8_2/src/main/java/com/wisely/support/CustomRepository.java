package com.wisely.support;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CustomRepository<T, ID extends Serializable>extends JpaRepository<T, ID> ,JpaSpecificationExecutor<T>{
	
	Page<T> findByAuto(T example,Pageable pageable);
	

}
