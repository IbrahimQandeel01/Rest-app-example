package com.example.RestJobApp.service;

import com.example.RestJobApp.model.JobPost;
import com.example.RestJobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo ;

    public void addJob (JobPost jobPost){
        repo.addJop(jobPost);
    }

    public List<JobPost> viewJobs(){
        return repo.viewAllJobs() ;
    }

    public JobPost getJobPost(int id) {
        return repo.getJobPost(id);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int id ) {
        repo.deleteJob(id);
    }
}
