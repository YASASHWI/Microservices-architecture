package com.example.courseregistrationservice;



import com.example.courseregistrationservice.CourseRegistration;
import com.example.courseregistrationservice.CourseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseregistration")
public class CourseRegistrationController {
	
	
	@GetMapping("/home")
	public String home() {
		return "Welocome To Course Registration";
	}

    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;

    @GetMapping
    public List<CourseRegistration> getAllRegistrations() {
        return courseRegistrationRepository.findAll();
    }

    @PostMapping
    public CourseRegistration registerCourse(@RequestBody CourseRegistration registration) {
        return courseRegistrationRepository.save(registration);
    }

    @GetMapping("/{id}")
    public CourseRegistration getRegistrationById(@PathVariable Long id) {
        return courseRegistrationRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable Long id) {
        courseRegistrationRepository.deleteById(id);
    }
}
