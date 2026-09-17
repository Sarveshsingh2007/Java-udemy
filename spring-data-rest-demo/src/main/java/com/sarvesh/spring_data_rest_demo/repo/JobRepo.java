package com.sarvesh.spring_data_rest_demo.repo;

import com.sarvesh.spring_data_rest_demo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>{
    Optional<JobPost> findByPostProfile(String postProfile);

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword1 );
}