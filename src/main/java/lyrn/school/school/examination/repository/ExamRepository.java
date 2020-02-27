package lyrn.school.school.examination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Status;

import lyrn.school.school.examination.model.ExamEnroll;
@Repository
public interface ExamRepository extends JpaRepository<ExamEnroll, String> {


}
