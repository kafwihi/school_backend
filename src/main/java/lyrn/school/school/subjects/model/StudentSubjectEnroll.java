package lyrn.school.school.subjects.model;

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
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "subjectselection")
public class StudentSubjectEnroll implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String regno;
    @OneToOne(fetch = FetchType.LAZY, optional = false)

    //@PrimaryKeyJoinColumn()
    @JoinColumn(name = "regno", nullable = false)
    //@JsonIgnore
    @MapsId
    private Student student;


    @Column(nullable = true)
    private Boolean english = true;

    @Column(nullable = true)
    private Boolean kiswahili = true;;
    @Column(nullable = true)
    private Boolean mathematics = true;;
    @Column(nullable = true)
    private Boolean chemistry = true;
    @Column(nullable = true)
    private Boolean biology = true;;
    @Column(nullable = false)
    private Boolean physics = true;;
    @Column(nullable = true)
    private Boolean geography = true;
    @Column(nullable = true)
    private Boolean history = true;
    @Column(nullable = true)
    private Boolean cre = true;
    @Column(nullable = false)
    private Boolean business = true;
    @Column(nullable = false)
    private Boolean agriculture = true;

public StudentSubjectEnroll(){
    super();
}


public Student getStudent() {
    return student;
}
public void  setStudent(Student student) {
    this.student = student;
}

public StudentSubjectEnroll(Boolean english,Boolean kiswahili, Boolean mathematics, Boolean chemistry
,Boolean biology,Boolean physics, Boolean geography, Boolean history
,Boolean cre,Boolean business, Boolean agriculture){
    this.english= english;
    this.kiswahili = kiswahili;
    this.mathematics = mathematics;
    this.chemistry = chemistry;
    this.biology = biology;
    this.physics= physics;
    this.geography = geography;
    this.history = history;
    this.cre = cre;
    this.business = business;
    this.agriculture = agriculture;
    }


    public StudentSubjectEnroll(String regno,Boolean english,Boolean kiswahili, Boolean mathematics, Boolean chemistry
    ,Boolean biology,Boolean physics, Boolean geography, Boolean history
    ,Boolean cre,Boolean business, Boolean agriculture){
        this.regno = regno;
        this.english= english;
        this.kiswahili = kiswahili;
        this.mathematics = mathematics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.physics= physics;
        this.geography = geography;
        this.history = history;
        this.cre = cre;
        this.business = business;
        this.agriculture = agriculture;
        }

    public Boolean isEnglish() {
        return english;
    }

    /**
     * @param english the english to set
     */
    public void setEnglish(Boolean english) {
        this.english = english;
    }

    /**
     * @return Boolean return the kiswahili
     */
    public Boolean isKiswahili() {
        return kiswahili;
    }

    /**
     * @param kiswahili the kiswahili to set
     */
    public void setKiswahili(Boolean kiswahili) {
        this.kiswahili = kiswahili;
    }

    /**
     * @return Boolean return the kiswahili
     */
    public Boolean isPhysics() {
        return physics;
    }

    /**
     * @param physics the physics to set
     */
    public void setPhysics(Boolean physics) {
        this.physics = physics;
    }

    /**
     * @return Boolean return the mathematics
     */
    public Boolean isMathematics() {
        return mathematics;
    }

    /**
     * @param mathematics the mathematics to set
     */
    public void setMathematics(Boolean mathematics) {
        this.mathematics = mathematics;
    }

    /**
     * @return Boolean return the chemistry
     */
    public Boolean isChemistry() {
        return chemistry;
    }

    /**
     * @param chemistry the chemistry to set
     */
    public void setChemistry(Boolean chemistry) {
        this.chemistry = chemistry;
    }

    /**
     * @return Boolean return the biology
     */
    public Boolean isBiology() {
        return biology;
    }

    /**
     * @param biology the biology to set
     */
    public void setBiology(Boolean biology) {
        this.biology = biology;
    }

    /**
     * @return Boolean return the geography
     */
    public Boolean isGeography() {
        return geography;
    }

    /**
     * @param geography the geography to set
     */
    public void setGeography(Boolean geography) {
        this.geography = geography;
    }

    /**
     * @return Boolean return the history
     */
    public Boolean isHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(Boolean history) {
        this.history = history;
    }

    /**
     * @return Boolean return the cre
     */
    public Boolean isCre() {
        return cre;
    }

    /**
     * @param cre the cre to set
     */
    public void setCre(Boolean cre) {
        this.cre = cre;
    }

    /**
     * @return Boolean return the business
     */
    public Boolean isBusiness() {
        return business;
    }

    /**
     * @param business the business to set
     */
    public void setBusiness(Boolean business) {
        this.business = business;
    }

    /**
     * @return Boolean return the agriculture
     */
    public Boolean isAgriculture() {
        return agriculture;
    }

    /**
     * @param agriculture the agriculture to set
     */
    public void setAgriculture(Boolean agriculture) {
        this.agriculture = agriculture;
    }

}