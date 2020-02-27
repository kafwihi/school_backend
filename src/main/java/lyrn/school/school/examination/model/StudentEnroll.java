package lyrn.school.school.examination.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.validation.constraints.NotBlank;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lyrn.school.school.admission.model.Student;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "examinations")
public class StudentEnroll implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String serialno;
    @Column(nullable = false)
    private String termserial;
    @Column(nullable = false)
    private String year;
    @Column(nullable = false)
    private String term;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_username", nullable = false)
    //@JsonIgnore
    private Student student;

public StudentEnroll(){
    super();
}

public StudentEnroll(String serialno,String termserial, String year, String term, Student student){
this.serialno= serialno;
this.termserial = termserial;
this.year = year;
this.term = term;
this.student = student;
}
public Student getStudent() {
    return student;
}
public void  setStudent(Student student) {
    this.student = student;
}

    /**
     * @return String return the serialno
     */
    public String getSerialno() {
        return serialno;
    }

    /**
     * @param serialno the serialno to set
     */
    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    /**
     * @return String return the termserial
     */
    public String getTermserial() {
        return termserial;
    }

    /**
     * @param termserial the termserial to set
     */
    public void setTermserial(String termserial) {
        this.termserial = termserial;
    }

    /**
     * @return String return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return String return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }
}