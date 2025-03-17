package com.example.RestJobApp.controller;

import com.example.RestJobApp.model.JobPost;
import com.example.RestJobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3002")
public class HomeController {
    @Autowired
    JobService service ;

    @GetMapping ("jobPosts")
    public List<JobPost> getAllJops (){
        return service.viewJobs();
    }

    @GetMapping("jobPost/{id}")
    public JobPost getJobPost (@PathVariable("id") int id){
        return service.getJobPost(id);
    }

    @PostMapping("jobPost")
    public JobPost addJobPost (@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return jobPost ;
    }
    @PutMapping("jobPost")
    public JobPost updateJobPost (@RequestBody JobPost jobPost ){
        service.updateJob(jobPost);
        return service.getJobPost(jobPost.getPostId());
    }
    @DeleteMapping("jobPost/{id}")
    public String deleteJobPost (@PathVariable("id") int id ){
        service.deleteJob(id);
        return " the job deleted perfectlly ";
    }


}
