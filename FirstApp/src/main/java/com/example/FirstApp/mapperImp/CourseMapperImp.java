package com.example.FirstApp.mapperImp;

import org.modelmapper.ModelMapper;

import com.example.FirstApp.DTO.CourseDTO;
import com.example.FirstApp.mapper.CourseMapper;
import com.example.FirstApp.model.Course;


public class CourseMapperImp implements CourseMapper{
	private ModelMapper modelMapper;
	  
	  public CourseMapperImp() {
		  modelMapper = new ModelMapper();
	  }

	@Override
	public Course dtoToCourse(CourseDTO courseDTO) {
		return modelMapper.map(courseDTO, Course.class);
	}

	@Override
	public CourseDTO courseToDTO(Course course) {
		return modelMapper.map(course, CourseDTO.class);
	}

	
}
