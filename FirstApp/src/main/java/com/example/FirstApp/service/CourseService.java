package com.example.FirstApp.service;

import org.springframework.stereotype.Service;

import com.example.FirstApp.DTO.CourseDTO;
import com.example.FirstApp.mapperImp.CourseMapperImp;
import com.example.FirstApp.model.Course;
import com.example.FirstApp.repository.CourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CourseService {
	
	private CourseRepository courseRepository;
	private static final CourseMapperImp courseMapperImp = new CourseMapperImp();
	
	public CourseDTO createCourseDTO(CourseDTO courseDTO) {
		
		Course course = Course.builder()
				.i_id(courseDTO.getI_id())
                .com_cr(courseDTO.getCom_cr())
                .edu_id(courseDTO.getEdu_id())
                .course_name(courseDTO.getCourse_name())
                .s_date(courseDTO.getS_date())
                .e_date(courseDTO.getE_date())
                .course_addby(courseDTO.getCourse_addby())
                .course_institute_name(courseDTO.getCourse_institute_name())
                .course_attch(courseDTO.getCourse_attch())
                .build();
		
		Course saveCourse = courseRepository.save(course);
        return courseMapperImp.courseToDTO(saveCourse);
        
    }
	

}
