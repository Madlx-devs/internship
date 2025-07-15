package com.madlx.internship;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.madlx.internship.entity.CourseDocument;
import com.madlx.internship.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class CourseDataLoader implements CommandLineRunner {
    private  CourseRepository repository;
    private  ObjectMapper mapper;


    @Override
    public void run(String... args) throws Exception {
        InputStream stream = getClass().getResourceAsStream("/sample-courses.json");
        CourseDocument[] courses = mapper.readValue(stream, CourseDocument[].class);
        if (repository.count() == 0) {
            repository.saveAll(Arrays.asList(courses));
        }
    }
}