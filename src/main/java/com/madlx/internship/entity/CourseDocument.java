package com.madlx.internship.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(indexName ="courses")
public class CourseDocument {

    @Id
    private  String id;
    
    @Field(type = FieldType.Text)
    private String title;
    
    @Field(type = FieldType.Text)
    private String description;
    
    @Field(type = FieldType.Keyword)
    private String category;
    
    @Field(type = FieldType.Keyword)
    private String type;
    
    @Field(type = FieldType.Keyword)
    private String gradeRange;
    
    @Field(type = FieldType.Integer)
    private Integer minAge;
    
    @Field(type = FieldType.Integer)
    private Integer maxAge;
    @Field(type = FieldType.Double)
    private Double price;
    @Field(type = FieldType.Date ,format = DateFormat.date_time )
    private Instant nextSessionDate;
}
