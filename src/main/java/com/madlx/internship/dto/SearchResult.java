package com.madlx.internship.dto;


import com.madlx.internship.entity.CourseDocument;
import lombok.Data;

import java.util.List;

@Data
public class SearchResult {

    private  Long total;
    private List<CourseDocument> courses ;

}
