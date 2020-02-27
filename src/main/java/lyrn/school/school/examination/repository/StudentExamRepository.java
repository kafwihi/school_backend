package lyrn.school.school.examination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Status;

import lyrn.school.school.examination.model.StudentEnroll;
@Repository
public interface StudentExamRepository extends JpaRepository<StudentEnroll, String> {
 /// Boolean existsBySerialno(String serialno);
  //  StudentEnroll findBySerialno(String serialno);

    //List<StudentEnroll> findByStudentUsername(String studentUsername);
    //Optional<StudentEnroll> findByUsernameAndStudentUsername(String username, String studentUsername);


}
