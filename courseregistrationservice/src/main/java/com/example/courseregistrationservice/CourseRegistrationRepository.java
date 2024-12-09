package com.example.courseregistrationservice;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.courseregistrationservice.CourseRegistration;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {}
