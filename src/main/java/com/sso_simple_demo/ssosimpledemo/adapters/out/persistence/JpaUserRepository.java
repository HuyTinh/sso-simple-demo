package com.sso_simple_demo.ssosimpledemo.adapters.out.persistence;

import com.sso_simple_demo.ssosimpledemo.domain.model.User;
import com.sso_simple_demo.ssosimpledemo.ports.out.UserRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<User, Long>, UserRepositoryPort { }
