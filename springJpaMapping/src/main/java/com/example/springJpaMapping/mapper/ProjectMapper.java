package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.ProjectDTO;
import com.example.springJpaMapping.entities.Projects;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper extends EntityMapper<ProjectDTO, Projects>{
}
