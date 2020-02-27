package lyrn.school.school.admission.controller;

import java.util.List;

import javax.transaction.Status;
import javax.validation.Valid;
import lyrn.school.school.admission.exception.StudentNotFoundException;
import lyrn.school.school.admission.model.Student;
import lyrn.school.school.admission.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lyrn.school.school.admission.repository.StudentRepository;

import java.security.NoSuchAlgorithmException;
@RestController
@RequestMapping("/admission")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    // Get All Students in the school
        @GetMapping("/all")
        public List<Student> getAllStudents() {
            return studentRepository.findAll();
        }

    // Create a new student
         @PostMapping("/admit")
        public Boolean admitStudent(@RequestBody Student student) throws NoSuchAlgorithmException {
            String username = student.getUsername();
            if (studentRepository.existsByUsername(username)){

                return false;//throw new ValidationException("Student already existed");

            }
            studentRepository.save(student);
            return true;
        }

    // Get a Single student
        @GetMapping("/search/{username}")
        public Student getStudentById(@PathVariable(value = "username") String username) throws StudentNotFoundException {
            return studentRepository.findById(username)
                    .orElseThrow(() -> new StudentNotFoundException(username));
        }

         // Get a Single student


         @GetMapping("/searchByLevel/{level}")
         public Page<Student> findStudentByLevel(@PathVariable(value = "level") String level,
                                    Pageable pageable) {
            //String level = student.getLevel();

             if (level == null) {
                 return studentRepository.findAll(pageable);
             } else {
                 return studentRepository.findByLevel(level, pageable);
             }
         }

/*
         @PostMapping("/searchByLevelAndStream")
	public Page<Student> findStudentByLevelAndStream(
				@RequestParam("level") String level,
				@RequestParam("stream") String stream,
				@RequestParam("status") Status status, Pageable pageable) {

		if (level != null) {
			if (stream != null) {
				if (status != null) {
					return studentRepository.findByLevelAndStream(
                                                    level, stream, status, pageable);
				} else {
					return studentRepository.findByLevelAndStream(
                                                    level, stream, pageable);
				}
			} else {
				// other combinations omitted for sanity
			}
		} else {
			// other combinations omitted for sanity
		}
        return null;
	}*/
    // Update a student
       @PutMapping("/update/{username}")
        public Student updateStudent(@PathVariable(value = "username") String username,
                               @Valid @RequestBody Student studentDetails) throws StudentNotFoundException {
    Student student = studentRepository.findById(username).orElseThrow(() -> new StudentNotFoundException("Student " + username + " not found"));

           student.setFirstname(studentDetails.getFirstname());
            student.setFirstname(studentDetails.getFirstname());
            student.setMidname(studentDetails.getMidname());
            student.setLastname(studentDetails.getLastname());
            student.setDob(studentDetails.getDob());
            student.setContact(studentDetails.getContact());
            student.setLevel(studentDetails.getLevel());
            student.setStream(studentDetails.getStream());
    Student updateStudent = studentRepository.save(student);
     return studentRepository.save(updateStudent);
                               }


    // Delete a Note
        @DeleteMapping("/delete/{username}")
        public ResponseEntity<?> deleteStudent(@PathVariable(value = "username") String username) throws StudentNotFoundException {
            Student student = studentRepository.findById(username)
                    .orElseThrow(() -> new StudentNotFoundException(username));

    studentRepository.delete(student);

    return ResponseEntity.ok().build();
        }


        @DeleteMapping("/posts/{postId}")
        public ResponseEntity<?> deletePost(@PathVariable(value = "username") String username)
            throws StudentNotFoundException {
            return studentRepository.findById(username).map(student -> {
                studentRepository.delete(student);
                return ResponseEntity.ok().build();
            }).orElseThrow(() -> new StudentNotFoundException("PostId " + username + " not found"));
        }
}
/**
 * https://www.javaguides.net/2019/08/spring-boot-jpa-hibernate-one-to-one-mapping-example.html
https://www.rbsprogramming.com/articles/jpa-one-to-one-relationship/
https://attacomsian.com/blog/spring-data-jpa-one-to-one-mapping
https://hellokoding.com/jpa-one-to-one-foreign-key-relationship-mapping-example-with-spring-boot-hsql/

 */