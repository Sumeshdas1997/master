package com.springboot.spring.security.jwt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.spring.security.jwt.app.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer> {

}
