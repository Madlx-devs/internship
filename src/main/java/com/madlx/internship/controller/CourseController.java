package com.madlx.internship.controller;


import com.madlx.internship.dto.CourseSearchRequest;
import com.madlx.internship.dto.SearchResult;
import com.madlx.internship.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private CourseService courseService;


    @GetMapping("/api/search")
    public SearchResult searchCourses(
            @RequestParam(required = false) String q,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) Integer minAge,
            @RequestParam(required = false) Integer maxAge,
            @RequestParam(required = false)Double minPrice,
            @RequestParam(required = false)Double maxPrice,
            @RequestParam(required = false)String startDate,
            @RequestParam(defaultValue = "upcoming")String sort,
            @RequestParam(defaultValue = "0")int page,
            @RequestParam(defaultValue ="10")int size
    ){
         return courseService.search(q,category,type,minAge,maxAge,minPrice,maxPrice,startDate,sort,page,size);
    }
}
