package com.example.springJpaMapping.repository;

import com.example.springJpaMapping.entities.Phone;
import com.example.springJpaMapping.entities.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;


@EnableJpaRepositories
public interface ProjectRepository extends JpaRepository<Projects,Long> {

    @Query(value = "select * from projects  where id =?1 ",nativeQuery = true)
    Optional<Projects> findByIdAndQuery(Long id);
}
