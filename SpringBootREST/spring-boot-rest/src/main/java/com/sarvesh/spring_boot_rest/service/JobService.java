package com.sarvesh.spring_boot_rest.service;

import com.sarvesh.spring_boot_rest.model.JobPost;
import com.sarvesh.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;



    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }


    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public String getJobProfile(String postProfile) {
        return repo.findByPostProfile(postProfile)
                .map(JobPost::getPostDesc)
                .orElse("Job not found");
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java DevOps",
                        "Needed well skilled in Kafka, Kubernetes, Spring AI and Spring Security",
                        "1",
                        List.of("Java", "Python", "Kafka", "Kubernetes", "Spring AI", "Spring Security")),

                new JobPost(2, "Backend Developer",
                        "Looking for a skilled backend developer with experience in APIs and databases",
                        "2",
                        List.of("Java", "Spring Boot", "REST API", "MySQL")),

                new JobPost(3, "Frontend Developer",
                        "Need a frontend developer to build responsive and interactive web applications",
                        "3",
                        List.of("HTML", "CSS", "JavaScript", "React.js")),

                new JobPost(4, "Python Developer",
                        "Looking for a Python developer with strong backend and API development skills",
                        "2",
                        List.of("Python", "Django", "Flask", "REST API")),

                new JobPost(5, "Full Stack Developer",
                        "Required a full stack developer to work on modern web applications",
                        "2",
                        List.of("Java", "Spring Boot", "React.js", "PostgreSQL")),

                new JobPost(6, "Cloud Engineer",
                        "Looking for a cloud engineer experienced in deployment and cloud infrastructure",
                        "3",
                        List.of("AWS", "Docker", "Kubernetes", "Jenkins"))
        ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
