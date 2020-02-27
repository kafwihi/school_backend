package lyrn.school.school.examination.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Status;
import javax.validation.Valid;

import lyrn.school.school.admission.model.Student;
import lyrn.school.school.examination.exception.StudentNotFoundException;
import lyrn.school.school.examination.model.ExamEnroll;
import lyrn.school.school.examination.model.StudentEnroll;
import lyrn.school.school.examination.repository.ExamRepository;
import lyrn.school.school.examination.repository.StudentExamRepository;

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
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/examination")
public class ExamController {
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private lyrn.school.school.admission.repository.StudentRepository studentRepository;
    @Autowired
    StudentExamRepository studentExamRepository;

    // Get All Students from the examination table
    @GetMapping("/all")
    public List<ExamEnroll> getAllStudents() {
        return examRepository.findAll();
    }
    @PostMapping("/enroll/{studentusername}/exams")
    public StudentEnroll enrollStudent(@PathVariable(value = "studentusername") String studentusername,
        @Valid @RequestBody StudentEnroll stenroll) throws StudentNotFoundException {

            return studentRepository.findById(studentusername).map(student -> {
                stenroll.setStudent(student);
                return studentExamRepository.save(stenroll);
            }).orElseThrow(() -> new StudentNotFoundException("Student " + studentusername + " not found"));

    }

    @PostMapping("/enroll/{username}")
    public StudentEnroll enrollStudentSubject(@PathVariable(value = "username") String username,
        @Valid @RequestBody StudentEnroll stenroll) throws StudentNotFoundException {

            Student student = studentRepository.findById(username)
          .orElseThrow(() -> new StudentNotFoundException("Student " + username + " not found"));
          stenroll.setStudent(student);
          //student.setStudentSubjectEnroll(stenroll);;
            return studentExamRepository.save(stenroll);
    }
    // Create a new student
    /*@DeleteMapping("/posts/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable(value = "username") String username)
        throws StudentNotFoundException {
        return studentRepository.findById(username).map(student -> {
            studentRepository.delete(student);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new StudentNotFoundException("PostId " + username + " not found"));
    }*/


   }

   /**
    * https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
    https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
    */