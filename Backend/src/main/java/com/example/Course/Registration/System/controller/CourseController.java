package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourse(){
        return courseService.availableCourse();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String enrolledCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseName") String courseName) {
        courseService.enrolledCourse(name, emailId, courseName);
        return "Congratulation! " + name + " Enrollment Successful for " + courseName;
    }
}
