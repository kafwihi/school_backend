package lyrn.school.school.subjects.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Status;

import lyrn.school.school.subjects.model.StudentSubjectEnroll;
import lyrn.school.school.subjects.model.StudentSubjectOperations;
@Repository
public interface StudentSubjectOperationsRepository extends JpaRepository<StudentSubjectOperations, String> {
  //Page<StudentSubjectOperations> findByStudentUsername(String username, Pageable pageable);
  //Optional<StudentSubjectEnroll> findByIdAndPostId(String username, String usernameString);
 /// Boolean existsBySerialno(String serialno);
  //  StudentEnroll findBySerialno(String serialno);

    //List<StudentEnroll> findByStudentUsername(String studentUsername);
    //Optional<StudentEnroll> findByUsernameAndStudentUsername(String username, String studentUsername);


}
