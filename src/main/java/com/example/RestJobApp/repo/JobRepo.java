package com.example.RestJobApp.repo;

import com.example.RestJobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
           new JobPost(1,"programmer","front end",3,List.of("php")),
           new JobPost(2,"sales","weak sales",3,List.of("JavaScript")),
           new JobPost(3,"marketing","strong marketing",3,List.of("java"))
        ));

    public List<JobPost> viewAllJobs (){
        return jobs ;
    }

    public void addJop (JobPost jobPost){
        jobs.add(jobPost);
        System.out.println("added");
    }

    public JobPost getJobPost(int id) {
        for(JobPost job : jobs){
            if (job.getPostId() == id)
                return job;
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for (JobPost jobPost1 : jobs){
            if (jobPost1.getPostId() == jobPost.getPostId()){
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
                jobPost1.setReqExperience(jobPost.getReqExperience());
            }
        }
    }

    public void deleteJob(int id ) {
        for (JobPost jobPost : jobs){
            if (jobPost.getPostId() == id){
                jobs.remove(jobPost);
            }
        }
    }
}
