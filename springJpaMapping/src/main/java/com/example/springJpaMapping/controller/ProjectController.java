package com.example.springJpaMapping.controller;

import com.example.springJpaMapping.dto.ProjectDTO;
import com.example.springJpaMapping.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/project")
//@RequiredArgsConstructor
public class ProjectController {

   @Autowired
    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/save")
    public ProjectDTO save(@RequestBody ProjectDTO p ){
        ProjectDTO save=this.projectService.saveProjects(p);
        log.info("Saved project are "+ save);
        return save;
    }


    @GetMapping("/get")
    public List<ProjectDTO> getProject(){
        List<ProjectDTO> getAll=this.projectService.getProjects();
        log.info("Project total list"+ getAll);
        return getAll;
    }

    @GetMapping("/get/{id}")
    public ProjectDTO getBYId(@PathVariable Long id){
        ProjectDTO get=this.projectService.getProjectById(id);
        log.info("Project details by id "+ get);
        return get;
    }

//    @PostMapping("/update/{id}")
//    public ProjectDTO updateDetails(@PathVariable ProjectDTO e ,Integer id){
//        ProjectDTO updateDet=this.projectService.UpdateDetails(e,id);
//        log.info("Projects updated details"+updateDet);
//        return updateDet;
//    }

}
