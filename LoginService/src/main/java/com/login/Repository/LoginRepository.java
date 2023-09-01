package com.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.Entity.LoginEn;

public interface LoginRepository extends JpaRepository<LoginEn, Integer>{

}
