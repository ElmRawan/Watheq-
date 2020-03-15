package com.example.FirstApp.mapper;

import com.example.FirstApp.DTO.CourseDTO;
import com.example.FirstApp.model.Course;

public interface CourseMapper {
	

	Course dtoToCourse (final CourseDTO courseDTO);
	CourseDTO courseToDTO(final Course course);


}
