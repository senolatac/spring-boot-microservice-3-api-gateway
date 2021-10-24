package com.sha.springbootmicroservice3apigateway.controller;

import com.sha.springbootmicroservice3apigateway.request.CourseServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 10.10.2021
 * @time 13:23
 */
@RestController
@RequestMapping("gateway/course")//pre-path
public class CourseController
{
    @Autowired
    private CourseServiceRequest courseServiceRequest;

    @PostMapping //gateway/course
    public ResponseEntity<?> saveCourse(@RequestBody Object course)
    {
        return new ResponseEntity<>(courseServiceRequest.saveCourse(course), HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}")//gateway/course/{courseId}
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId)
    {
        courseServiceRequest.deleteCourse(courseId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping//gateway/course
    public ResponseEntity<?> getAllCourses()
    {
        return ResponseEntity.ok(courseServiceRequest.getAllCourses());
    }
}
