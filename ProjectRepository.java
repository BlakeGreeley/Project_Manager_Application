package com.codingdojo.projectmanager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.projectmanager.models.Project;

public interface ProjectRepository extends CrudRepository <Project, Long> {

}
