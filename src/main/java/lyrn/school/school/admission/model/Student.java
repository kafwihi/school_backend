package lyrn.school.school.admission.model;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lyrn.school.school.examination.model.StudentEnroll;
import lyrn.school.school.subjects.model.StudentSubjectEnroll;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@MappedSuperclass
@Entity
@Table(name = "admission")
public class Student implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "username")
    private String username;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private List<StudentEnroll> studentEnrollment;

    @OneToOne(mappedBy = "student", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JsonIgnore
    private StudentSubjectEnroll subjectsection;


    private String firstname;
    private String midname;
    private String lastname;
    private String dob;
    private String contact;
    private String level;
    private String stream;
    private String progress;
    public Student(){
        super();
    }
    public Student(String username,StudentSubjectEnroll subjectsection){
        this.username = username;
        this.subjectsection = subjectsection;
        this.subjectsection.setStudent(this);

    }
    public Student(String username, String firstname,String midname,
    String lastname, String dob, String contact, String level,String stream,String progress) {
        super();
        this.username = username;
        this.firstname = firstname;
        this.midname = midname;
        this.lastname=lastname;
        this.dob = dob;
        this.contact = contact;
        this.level = level;
        this.stream=stream;
        this.progress = progress;
    }



    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return String return the midname
     */
    public String getMidname() {
        return midname;
    }

    /**
     * @param midname the midname to set
     */
    public void setMidname(String midname) {
        this.midname = midname;
    }

    /**
     * @return String return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return String return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return String return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return String return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return String return the stream
     */
    public String getStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * @return String return the progress
     */
    public String getProgress() {
        return progress;
    }

    /**
     * @param progress the progress to set
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }

	public Optional<Student> map(Object object) {
		return null;
	}

    /*public StudentSubjectEnroll getStudentSubjectEnroll() {
        return subjectsection;
    }

    /**
     * @param username the username to set
     */
   /* public void setStudentSubjectEnroll(StudentSubjectEnroll subjectsection) {
        this.subjectsection = subjectsection;
    }*/
}