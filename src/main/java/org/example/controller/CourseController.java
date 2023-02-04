package org.example.controller;

import org.example.model.CourseDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
    //create  endpoint to return all the course
    @GetMapping("/getAllCourses")
    List<CourseDetail> getAllCourses(){
        logger.info("added for failing sonar build");
        CourseDetail courseDetail1=new CourseDetail("aws",30);
        CourseDetail courseDetail2=new CourseDetail("devops",45);
        return Arrays.asList(courseDetail1,courseDetail2);
    }

}