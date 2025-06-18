package com.springrest.Courses.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Courses.DAO.CourseDao;
import com.springrest.Courses.Service.CourseService;
import com.springrest.Courses.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();

	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.findById(courseId).get();

//		return courseDao.getReferenceById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;

	}

	@Override
	public Course updateCourse(Course course) {

		courseDao.save(course);

		return course;
	}

	@Override
	public void deleteCourse(long courseId) {

		Course entity = courseDao.findById(courseId).get();
		courseDao.delete(entity);

	}

}
