package com.example.springJpaMapping.service;

import com.example.springJpaMapping.dto.ProjectDTO;
import com.example.springJpaMapping.entities.Projects;
import com.example.springJpaMapping.mapper.ProjectMapper;
import com.example.springJpaMapping.repository.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
//@RequiredArgsConstructor
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProjectMapper projectMapper;

    public ProjectService(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    public ProjectDTO saveProjects(ProjectDTO projectDTO){
        Projects save =projectRepository.save(projectMapper.toEntity(projectDTO));
        return projectMapper.toDto(save);
    }

    public List<ProjectDTO> getProjects(){
        List<Projects> getProject=projectRepository.findAll();
        return projectMapper.toDto(getProject);
    }

    public ProjectDTO getProjectById(Long id){
        Optional<Projects> getProjectById= projectRepository.findByIdAndQuery(id);
        return  projectMapper.toDto(getProjectById.get());
    }

//    public ProjectDTO UpdateDetails(ProjectDTO projectDTO, Integer id){
//        Optional<Projects> updateDetail=projectRepository.findById(id);
//        if (updateDetail==null){
//            log.info("There is no record with this entry");
//            return null;
//        }
//        projectDTO.setProject_name(projectDTO.getProject_name());
//        projectDTO.setBudget(projectDTO.getBudget());
//        Projects pro = projectRepository.save(projectMapper.toEntity(projectDTO));
//        log.info("Updated details "+ pro);
//        return  projectMapper.toDto(pro);
//    }
}
