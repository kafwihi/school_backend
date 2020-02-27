package lyrn.school.school.admission.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Status;

import lyrn.school.school.admission.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    Boolean existsByUsername(String username);
    Student findByUsername(String username);
    Page<Student> findByLevel(String level, Pageable pageable);
    Page<Student> findByLevelAndStream(
        String level, String stream, Pageable pageable);
	Page<Student> findByLevelAndStream(String level, String stream, Status status, Pageable pageable);


}
