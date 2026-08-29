package com.sarvesh.spring_boot_rest.repo;

import com.sarvesh.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

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
                    "",
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

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJobs(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }

    public JobPost getJob(int postId) {
        for(JobPost job: jobs){
            if(job.getPostId() == postId)
                return job;
        }
        return null;
    }

    public String getJobProfile(String postProfile) {
        for (JobPost job : jobs) {
            if (job.getPostProfile().equals(postProfile)) {
                return job.getPostDesc();
            }
        }
        return "job not found";
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs){
            if(jobPost1.getPostId() == jobPost.getPostId()) {
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs){
            if(jobPost.getPostId() == postId){
                jobs.remove(jobPost);
            }
        }
    }
}