package com.example.springJpaMapping.mapper;

import com.example.springJpaMapping.dto.ProjectDTO;
import com.example.springJpaMapping.entities.Projects;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Projects toEntity(ProjectDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Projects projects = new Projects();

        projects.setId( dto.getId() );
        projects.setProjectName( dto.getProjectName() );
        projects.setBudget( dto.getBudget() );
        projects.setEmployee( dto.getEmployee() );

        return projects;
    }

    @Override
    public ProjectDTO toDto(Projects entity) {
        if ( entity == null ) {
            return null;
        }

        ProjectDTO projectDTO = new ProjectDTO();

        projectDTO.setId( entity.getId() );
        projectDTO.setProjectName( entity.getProjectName() );
        projectDTO.setBudget( entity.getBudget() );
        projectDTO.setEmployee( entity.getEmployee() );

        return projectDTO;
    }

    @Override
    public List<Projects> toEntity(List<ProjectDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Projects> list = new ArrayList<Projects>( dtoList.size() );
        for ( ProjectDTO projectDTO : dtoList ) {
            list.add( toEntity( projectDTO ) );
        }

        return list;
    }

    @Override
    public List<ProjectDTO> toDto(List<Projects> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProjectDTO> list = new ArrayList<ProjectDTO>( entityList.size() );
        for ( Projects projects : entityList ) {
            list.add( toDto( projects ) );
        }

        return list;
    }
}
