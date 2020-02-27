package lyrn.school.school.subjects.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Status;
import javax.validation.Valid;

import lyrn.school.school.admission.model.Student;
import lyrn.school.school.subjects.exception.StudentNotFoundException;
import lyrn.school.school.subjects.model.StudentSubjectEnroll;
import lyrn.school.school.subjects.model.StudentSubjectOperations;
import lyrn.school.school.subjects.repository.StudentSubjectEnrollRepository;
import lyrn.school.school.subjects.repository.StudentSubjectOperationsRepository;

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
@RequestMapping("/subjectselection")
public class StudentSubjectEnrollController {
    @Autowired
    private lyrn.school.school.admission.repository.StudentRepository studentRepository;
    //@Autowired
    private lyrn.school.school.admission.model.Student studentx;
    @Autowired
    StudentSubjectEnrollRepository studentSubjectEnrollRepository;
    @Autowired
    StudentSubjectOperationsRepository studentSubjectOperationsRepository;

   /* @GetMapping("/{username}")
    public Page<StudentSubjectEnroll> getStudentSubject(@PathVariable(value = "username") String username,
       Pageable pageable)  {
            return studentSubjectEnrollRepository.findByStudentUsername(username, pageable);
    }*/

    // Get All Students in the school
    @GetMapping("/all")
    public List<StudentSubjectOperations> getAllStudents() {
        return studentSubjectOperationsRepository.findAll();
    }
// Get a Single student

@GetMapping("/{username}")
public StudentSubjectOperations getStudentById(@PathVariable(value = "username") String username) throws StudentNotFoundException {
    return studentSubjectOperationsRepository.findById(username)
            .orElseThrow(() -> new StudentNotFoundException(username));
}

    @PostMapping("/enroll/{username}")
    public StudentSubjectEnroll enrollStudentSubject(@PathVariable(value = "username") String username,
        @Valid @RequestBody StudentSubjectEnroll stenroll) throws StudentNotFoundException {
            Student student = studentRepository.findById(username)
          .orElseThrow(() -> new StudentNotFoundException("Student " + username + " not found"));
          stenroll.setStudent(student);
          //student.setStudentSubjectEnroll(stenroll);;
            return studentSubjectEnrollRepository.save(stenroll);
    }

    @PutMapping("/update/{username}")
    public StudentSubjectOperations updateStudentSubject(@PathVariable(value = "username") String username,
        @Valid @RequestBody StudentSubjectOperations subjectchoice) throws StudentNotFoundException {
            StudentSubjectOperations studentSubjectOperations = studentSubjectOperationsRepository.findById(username)
          .orElseThrow(() -> new StudentNotFoundException("Student " + username + " not found"));
          studentSubjectOperations.setChemistry(subjectchoice.isChemistry());
          studentSubjectOperations.setBiology(subjectchoice.isBiology());
          studentSubjectOperations.setPhysics(subjectchoice.isPhysics());
          studentSubjectOperations.setGeography(subjectchoice.isGeography());
          studentSubjectOperations.setHistory(subjectchoice.isHistory());
          studentSubjectOperations.setCre(subjectchoice.isCre());
          studentSubjectOperations.setAgriculture(subjectchoice.isAgriculture());
          studentSubjectOperations.setBusiness(subjectchoice.isBusiness());
          StudentSubjectOperations updatedSelection = studentSubjectOperationsRepository.save(studentSubjectOperations);
            return studentSubjectOperationsRepository.save(updatedSelection);

    }
      }

   /**
    * https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
    https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/
    */