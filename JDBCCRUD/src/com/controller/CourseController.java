package com.controller;

import com.service.CourseService;

public class CourseController {
	public static void main(String[] args) throws Exception {
		CourseService cs = new CourseService();
		cs.insertCourseDetails();
		cs.updateCourseDetails();
		cs.deleteCourseDetails();
		cs.getCourseDetails();
		
	}
}
