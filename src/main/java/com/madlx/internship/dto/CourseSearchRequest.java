package com.madlx.internship.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CourseSearchRequest {
    private String q;
    private Integer minAge;
    private Integer maxAge;
    private String category;
    private String type;
    private Double minPrice ;
    private Double maxPrice;
    private String startDate;
    private String sort ="upcoming";
    private int page = 0;
    private int size = 10;
}
