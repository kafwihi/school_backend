package lyrn.school.school.examination.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.validation.constraints.NotBlank;

import lyrn.school.school.admission.model.Student;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examinations")
public class ExamEnroll {
    @Id
    private String serialno;

    @Column(nullable = false)
    private String termserial;
    @Column(nullable = false)
    private String year;
    @Column(nullable = false)
    private String term;

    @Column(nullable = true)
    private int total;
    @Column(nullable = true)
    private String tpoints;
    @Column(nullable = true)
    private String mean_score;
    @Column(nullable = true)
    private int stream_position;
    @Column(nullable = true)
    private int form_position;
/** Subjects marks,grade, points and position */
    //english
    @Column(nullable = true)
    private int com_english;
    private String com_english_grade;
    @Column(nullable = true)
    private int com_english_points;
    @Column(nullable = true)
    private int com_english_position;
     //KISWAHILI
     @Column(nullable = true)
    private int com_kiswahili;
     private String com_kiswahili_grade;
     @Column(nullable = true)

     private int com_kiswahili_points;
     @Column(nullable = true)

     private int com_kiswahili_position;
    //MATHEMATICS
    @Column(nullable = true)

    private int com_mathematics;
    private String com_mathematics_grade;
    @Column(nullable = true)

    private int com_mathematics_points;
    @Column(nullable = true)

    private int com_mathematics_position;
    //CHEMISTRY
    @Column(nullable = true)

    private int com_chemistry;
    private String com_chemistry_grade;
    @Column(nullable = true)

    private int com_chemistry_points;
    @Column(nullable = true)

    private int com_chemistry_position;
    //BILOLOGY
    @Column(nullable = true)

    private int com_biology;
    private String com_biology_grade;
    @Column(nullable = true)
    private int com_biology_points;
    @Column(nullable = true)
    private int com_biology_position;
     //PHYSICS
     @Column(nullable = true)
     private int com_physics;
     private String com_physics_grade;
     @Column(nullable = true)
     private int com_physics_points;
     @Column(nullable = true)
     private int com_physics_position;

     //GEOGRAPHY
     @Column(nullable = true)
     private int com_geography;
     private String com_geography_grade;
     @Column(nullable = true)
     private int com_geography_points;
     @Column(nullable = true)
     private int com_geography_position;
    //HISTORY
    @Column(nullable = true)
    private int com_history;
    private String com_history_grade;
    @Column(nullable = true)
    private int com_history_points;
    @Column(nullable = true)
    private int com_history_position;
    //CRE
    @Column(nullable = true)
    private int com_cre;
    private String com_cre_grade;
    @Column(nullable = true)
    private int com_cre_points;
    @Column(nullable = true)
    private int com_cre_position;
    //BUSINESS
    @Column(nullable = true)
    private int com_business;
    @Column(nullable = true)
    private String com_business_grade;
    @Column(nullable = true)
    private int com_business_points;
    @Column(nullable = true)
    private int com_business_position;
    //AGRICULTURE
    @Column(nullable = true)
    private int com_agriculture;
    private String com_agriculture_grade;
    @Column(nullable = true)
    private int com_agriculture_points;
    @Column(nullable = true)
    private int com_agriculture_position;
/**MID-TERM CATRS FIELDS */
// CAT ONE COMPRISES ALL SUBJECTS AKA PAPER 1
@Column(nullable = true)
private int ex1_english;
@Column(nullable = true)
private int ex1_kiswahili;
@Column(nullable = true)
private int ex1_mathematics;
@Column(nullable = true)
private int ex1_chemistry;
@Column(nullable = true)
private int ex1_physics;
@Column(nullable = true)
private int ex1_biology;
@Column(nullable = true)
private int ex1_geography;
@Column(nullable = true)
private int ex1_histroy;
@Column(nullable = true)
private int ex1_cre;
@Column(nullable = true)
private int ex1_business;
@Column(nullable = true)
private int ex1_agriculture;


// CAT TWO COMPRISES ALL SUBJECTS AKA PAPER 2
@Column(nullable = true)
private int ex2_english;
@Column(nullable = true)
private int ex2_kiswahili;
@Column(nullable = true)
private int ex2_mathematics;
@Column(nullable = true)
private int ex2_chemistry;
@Column(nullable = true)
private int ex2_biology;
@Column(nullable = true)
private int ex2_physics;
@Column(nullable = true)
private int ex2_geography;
@Column(nullable = true)
private int ex2_histroy;
@Column(nullable = true)
private int ex2_cre;
@Column(nullable = true)
private int ex2_business;
@Column(nullable = true)
private int ex2_agriculture;



// CAT THREE COMPRISES PARTICULAR SUBJECTS AKA PAPER 3
@Column(nullable = true)
private int ex3_english;
@Column(nullable = true)
private int ex3_kiswahili;
@Column(nullable = true)
private int ex3_chemistry;
@Column(nullable = true)
private int ex3_biology;
@Column(nullable = true)
private int ex3_physics;


// CAT FOUR COMPRISES PARTICULAR SUBJECTS AKA PAPER 3 TWO..SERVES AS PAPER THREE
@Column(nullable = true)
private int ex4_english;
@Column(nullable = true)
private int ex4_kiswahili;
@Column(nullable = true)
private int ex4_chemistry;
@Column(nullable = true)
private int ex4_biology;
@Column(nullable = true)
private int ex4_physics;
    public ExamEnroll(){
        super();
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

    /**
     * @return int return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return String return the tpoints
     */
    public String getTpoints() {
        return tpoints;
    }

    /**
     * @param tpoints the tpoints to set
     */
    public void setTpoints(String tpoints) {
        this.tpoints = tpoints;
    }

    /**
     * @return String return the mean_score
     */
    public String getMean_score() {
        return mean_score;
    }

    /**
     * @param mean_score the mean_score to set
     */
    public void setMean_score(String mean_score) {
        this.mean_score = mean_score;
    }

    /**
     * @return int return the stream_position
     */
    public int getStream_position() {
        return stream_position;
    }

    /**
     * @param stream_position the stream_position to set
     */
    public void setStream_position(int stream_position) {
        this.stream_position = stream_position;
    }

    /**
     * @return int return the form_position
     */
    public int getForm_position() {
        return form_position;
    }

    /**
     * @param form_position the form_position to set
     */
    public void setForm_position(int form_position) {
        this.form_position = form_position;
    }

    /**
     * @return int return the com_english
     */
    public int getCom_english() {
        return com_english;
    }

    /**
     * @param com_english the com_english to set
     */
    public void setCom_english(int com_english) {
        this.com_english = com_english;
    }

    /**
     * @return String return the com_english_grade
     */
    public String getCom_english_grade() {
        return com_english_grade;
    }

    /**
     * @param com_english_grade the com_english_grade to set
     */
    public void setCom_english_grade(String com_english_grade) {
        this.com_english_grade = com_english_grade;
    }

    /**
     * @return int return the com_english_points
     */
    public int getCom_english_points() {
        return com_english_points;
    }

    /**
     * @param com_english_points the com_english_points to set
     */
    public void setCom_english_points(int com_english_points) {
        this.com_english_points = com_english_points;
    }

    /**
     * @return int return the com_english_position
     */
    public int getCom_english_position() {
        return com_english_position;
    }

    /**
     * @param com_english_position the com_english_position to set
     */
    public void setCom_english_position(int com_english_position) {
        this.com_english_position = com_english_position;
    }

    /**
     * @return int return the com_kiswahili
     */
    public int getCom_kiswahili() {
        return com_kiswahili;
    }

    /**
     * @param com_kiswahili the com_kiswahili to set
     */
    public void setCom_kiswahili(int com_kiswahili) {
        this.com_kiswahili = com_kiswahili;
    }

    /**
     * @return String return the com_kiswahili_grade
     */
    public String getCom_kiswahili_grade() {
        return com_kiswahili_grade;
    }

    /**
     * @param com_kiswahili_grade the com_kiswahili_grade to set
     */
    public void setCom_kiswahili_grade(String com_kiswahili_grade) {
        this.com_kiswahili_grade = com_kiswahili_grade;
    }

    /**
     * @return int return the com_kiswahili_points
     */
    public int getCom_kiswahili_points() {
        return com_kiswahili_points;
    }

    /**
     * @param com_kiswahili_points the com_kiswahili_points to set
     */
    public void setCom_kiswahili_points(int com_kiswahili_points) {
        this.com_kiswahili_points = com_kiswahili_points;
    }

    /**
     * @return int return the com_kiswahili_position
     */
    public int getCom_kiswahili_position() {
        return com_kiswahili_position;
    }

    /**
     * @param com_kiswahili_position the com_kiswahili_position to set
     */
    public void setCom_kiswahili_position(int com_kiswahili_position) {
        this.com_kiswahili_position = com_kiswahili_position;
    }

    /**
     * @return int return the com_mathematics
     */
    public int getCom_mathematics() {
        return com_mathematics;
    }

    /**
     * @param com_mathematics the com_mathematics to set
     */
    public void setCom_mathematics(int com_mathematics) {
        this.com_mathematics = com_mathematics;
    }

    /**
     * @return String return the com_mathematics_grade
     */
    public String getCom_mathematics_grade() {
        return com_mathematics_grade;
    }

    /**
     * @param com_mathematics_grade the com_mathematics_grade to set
     */
    public void setCom_mathematics_grade(String com_mathematics_grade) {
        this.com_mathematics_grade = com_mathematics_grade;
    }

    /**
     * @return int return the com_mathematics_points
     */
    public int getCom_mathematics_points() {
        return com_mathematics_points;
    }

    /**
     * @param com_mathematics_points the com_mathematics_points to set
     */
    public void setCom_mathematics_points(int com_mathematics_points) {
        this.com_mathematics_points = com_mathematics_points;
    }

    /**
     * @return int return the com_mathematics_position
     */
    public int getCom_mathematics_position() {
        return com_mathematics_position;
    }

    /**
     * @param com_mathematics_position the com_mathematics_position to set
     */
    public void setCom_mathematics_position(int com_mathematics_position) {
        this.com_mathematics_position = com_mathematics_position;
    }

    /**
     * @return int return the com_chemistry
     */
    public int getCom_chemistry() {
        return com_chemistry;
    }

    /**
     * @param com_chemistry the com_chemistry to set
     */
    public void setCom_chemistry(int com_chemistry) {
        this.com_chemistry = com_chemistry;
    }

    /**
     * @return String return the com_chemistry_grade
     */
    public String getCom_chemistry_grade() {
        return com_chemistry_grade;
    }

    /**
     * @param com_chemistry_grade the com_chemistry_grade to set
     */
    public void setCom_chemistry_grade(String com_chemistry_grade) {
        this.com_chemistry_grade = com_chemistry_grade;
    }

    /**
     * @return int return the com_chemistry_points
     */
    public int getCom_chemistry_points() {
        return com_chemistry_points;
    }

    /**
     * @param com_chemistry_points the com_chemistry_points to set
     */
    public void setCom_chemistry_points(int com_chemistry_points) {
        this.com_chemistry_points = com_chemistry_points;
    }

    /**
     * @return int return the com_chemistry_position
     */
    public int getCom_chemistry_position() {
        return com_chemistry_position;
    }

    /**
     * @param com_chemistry_position the com_chemistry_position to set
     */
    public void setCom_chemistry_position(int com_chemistry_position) {
        this.com_chemistry_position = com_chemistry_position;
    }

    /**
     * @return int return the com_biology
     */
    public int getCom_biology() {
        return com_biology;
    }

    /**
     * @param com_biology the com_biology to set
     */
    public void setCom_biology(int com_biology) {
        this.com_biology = com_biology;
    }

    /**
     * @return String return the com_biology_grade
     */
    public String getCom_biology_grade() {
        return com_biology_grade;
    }

    /**
     * @param com_biology_grade the com_biology_grade to set
     */
    public void setCom_biology_grade(String com_biology_grade) {
        this.com_biology_grade = com_biology_grade;
    }

    /**
     * @return int return the com_biology_points
     */
    public int getCom_biology_points() {
        return com_biology_points;
    }

    /**
     * @param com_biology_points the com_biology_points to set
     */
    public void setCom_biology_points(int com_biology_points) {
        this.com_biology_points = com_biology_points;
    }

    /**
     * @return int return the com_biology_position
     */
    public int getCom_biology_position() {
        return com_biology_position;
    }

    /**
     * @param com_biology_position the com_biology_position to set
     */
    public void setCom_biology_position(int com_biology_position) {
        this.com_biology_position = com_biology_position;
    }

    /**
     * @return int return the com_physics
     */
    public int getCom_physics() {
        return com_physics;
    }

    /**
     * @param com_physics the com_physics to set
     */
    public void setCom_physics(int com_physics) {
        this.com_physics = com_physics;
    }

    /**
     * @return String return the com_physics_grade
     */
    public String getCom_physics_grade() {
        return com_physics_grade;
    }

    /**
     * @param com_physics_grade the com_physics_grade to set
     */
    public void setCom_physics_grade(String com_physics_grade) {
        this.com_physics_grade = com_physics_grade;
    }

    /**
     * @return int return the com_physics_points
     */
    public int getCom_physics_points() {
        return com_physics_points;
    }

    /**
     * @param com_physics_points the com_physics_points to set
     */
    public void setCom_physics_points(int com_physics_points) {
        this.com_physics_points = com_physics_points;
    }

    /**
     * @return int return the com_physics_position
     */
    public int getCom_physics_position() {
        return com_physics_position;
    }

    /**
     * @param com_physics_position the com_physics_position to set
     */
    public void setCom_physics_position(int com_physics_position) {
        this.com_physics_position = com_physics_position;
    }

    /**
     * @return int return the com_geography
     */
    public int getCom_geography() {
        return com_geography;
    }

    /**
     * @param com_geography the com_geography to set
     */
    public void setCom_geography(int com_geography) {
        this.com_geography = com_geography;
    }

    /**
     * @return String return the com_geography_grade
     */
    public String getCom_geography_grade() {
        return com_geography_grade;
    }

    /**
     * @param com_geography_grade the com_geography_grade to set
     */
    public void setCom_geography_grade(String com_geography_grade) {
        this.com_geography_grade = com_geography_grade;
    }

    /**
     * @return int return the com_geography_points
     */
    public int getCom_geography_points() {
        return com_geography_points;
    }

    /**
     * @param com_geography_points the com_geography_points to set
     */
    public void setCom_geography_points(int com_geography_points) {
        this.com_geography_points = com_geography_points;
    }

    /**
     * @return int return the com_geography_position
     */
    public int getCom_geography_position() {
        return com_geography_position;
    }

    /**
     * @param com_geography_position the com_geography_position to set
     */
    public void setCom_geography_position(int com_geography_position) {
        this.com_geography_position = com_geography_position;
    }

    /**
     * @return int return the com_history
     */
    public int getCom_history() {
        return com_history;
    }

    /**
     * @param com_history the com_history to set
     */
    public void setCom_history(int com_history) {
        this.com_history = com_history;
    }

    /**
     * @return String return the com_history_grade
     */
    public String getCom_history_grade() {
        return com_history_grade;
    }

    /**
     * @param com_history_grade the com_history_grade to set
     */
    public void setCom_history_grade(String com_history_grade) {
        this.com_history_grade = com_history_grade;
    }

    /**
     * @return int return the com_history_points
     */
    public int getCom_history_points() {
        return com_history_points;
    }

    /**
     * @param com_history_points the com_history_points to set
     */
    public void setCom_history_points(int com_history_points) {
        this.com_history_points = com_history_points;
    }

    /**
     * @return int return the com_history_position
     */
    public int getCom_history_position() {
        return com_history_position;
    }

    /**
     * @param com_history_position the com_history_position to set
     */
    public void setCom_history_position(int com_history_position) {
        this.com_history_position = com_history_position;
    }

    /**
     * @return int return the com_cre
     */
    public int getCom_cre() {
        return com_cre;
    }

    /**
     * @param com_cre the com_cre to set
     */
    public void setCom_cre(int com_cre) {
        this.com_cre = com_cre;
    }

    /**
     * @return String return the com_cre_grade
     */
    public String getCom_cre_grade() {
        return com_cre_grade;
    }

    /**
     * @param com_cre_grade the com_cre_grade to set
     */
    public void setCom_cre_grade(String com_cre_grade) {
        this.com_cre_grade = com_cre_grade;
    }

    /**
     * @return int return the com_cre_points
     */
    public int getCom_cre_points() {
        return com_cre_points;
    }

    /**
     * @param com_cre_points the com_cre_points to set
     */
    public void setCom_cre_points(int com_cre_points) {
        this.com_cre_points = com_cre_points;
    }

    /**
     * @return int return the com_cre_position
     */
    public int getCom_cre_position() {
        return com_cre_position;
    }

    /**
     * @param com_cre_position the com_cre_position to set
     */
    public void setCom_cre_position(int com_cre_position) {
        this.com_cre_position = com_cre_position;
    }

    /**
     * @return int return the com_business
     */
    public int getCom_business() {
        return com_business;
    }

    /**
     * @param com_business the com_business to set
     */
    public void setCom_business(int com_business) {
        this.com_business = com_business;
    }

    /**
     * @return String return the com_business_grade
     */
    public String getCom_business_grade() {
        return com_business_grade;
    }

    /**
     * @param com_business_grade the com_business_grade to set
     */
    public void setCom_business_grade(String com_business_grade) {
        this.com_business_grade = com_business_grade;
    }

    /**
     * @return int return the com_business_points
     */
    public int getCom_business_points() {
        return com_business_points;
    }

    /**
     * @param com_business_points the com_business_points to set
     */
    public void setCom_business_points(int com_business_points) {
        this.com_business_points = com_business_points;
    }

    /**
     * @return int return the com_business_position
     */
    public int getCom_business_position() {
        return com_business_position;
    }

    /**
     * @param com_business_position the com_business_position to set
     */
    public void setCom_business_position(int com_business_position) {
        this.com_business_position = com_business_position;
    }

    /**
     * @return int return the com_agriculture
     */
    public int getCom_agriculture() {
        return com_agriculture;
    }

    /**
     * @param com_agriculture the com_agriculture to set
     */
    public void setCom_agriculture(int com_agriculture) {
        this.com_agriculture = com_agriculture;
    }

    /**
     * @return String return the com_agriculture_grade
     */
    public String getCom_agriculture_grade() {
        return com_agriculture_grade;
    }

    /**
     * @param com_agriculture_grade the com_agriculture_grade to set
     */
    public void setCom_agriculture_grade(String com_agriculture_grade) {
        this.com_agriculture_grade = com_agriculture_grade;
    }

    /**
     * @return int return the com_agriculture_points
     */
    public int getCom_agriculture_points() {
        return com_agriculture_points;
    }

    /**
     * @param com_agriculture_points the com_agriculture_points to set
     */
    public void setCom_agriculture_points(int com_agriculture_points) {
        this.com_agriculture_points = com_agriculture_points;
    }

    /**
     * @return int return the com_agriculture_position
     */
    public int getCom_agriculture_position() {
        return com_agriculture_position;
    }

    /**
     * @param com_agriculture_position the com_agriculture_position to set
     */
    public void setCom_agriculture_position(int com_agriculture_position) {
        this.com_agriculture_position = com_agriculture_position;
    }

    /**
     * @return int return the ex1_english
     */
    public int getEx1_english() {
        return ex1_english;
    }

    /**
     * @param ex1_english the ex1_english to set
     */
    public void setEx1_english(int ex1_english) {
        this.ex1_english = ex1_english;
    }

    /**
     * @return int return the ex1_kiswahili
     */
    public int getEx1_kiswahili() {
        return ex1_kiswahili;
    }

    /**
     * @param ex1_kiswahili the ex1_kiswahili to set
     */
    public void setEx1_kiswahili(int ex1_kiswahili) {
        this.ex1_kiswahili = ex1_kiswahili;
    }

    /**
     * @return int return the ex1_mathematics
     */
    public int getEx1_mathematics() {
        return ex1_mathematics;
    }

    /**
     * @param ex1_mathematics the ex1_mathematics to set
     */
    public void setEx1_mathematics(int ex1_mathematics) {
        this.ex1_mathematics = ex1_mathematics;
    }

    /**
     * @return int return the ex1_chemistry
     */
    public int getEx1_chemistry() {
        return ex1_chemistry;
    }

    /**
     * @param ex1_chemistry the ex1_chemistry to set
     */
    public void setEx1_chemistry(int ex1_chemistry) {
        this.ex1_chemistry = ex1_chemistry;
    }

    /**
     * @return int return the ex1_physics
     */
    public int getEx1_physics() {
        return ex1_physics;
    }

    /**
     * @param ex1_physics the ex1_physics to set
     */
    public void setEx1_physics(int ex1_physics) {
        this.ex1_physics = ex1_physics;
    }

    /**
     * @return int return the ex1_biology
     */
    public int getEx1_biology() {
        return ex1_biology;
    }

    /**
     * @param ex1_biology the ex1_biology to set
     */
    public void setEx1_biology(int ex1_biology) {
        this.ex1_biology = ex1_biology;
    }

    /**
     * @return int return the ex1_geography
     */
    public int getEx1_geography() {
        return ex1_geography;
    }

    /**
     * @param ex1_geography the ex1_geography to set
     */
    public void setEx1_geography(int ex1_geography) {
        this.ex1_geography = ex1_geography;
    }

    /**
     * @return int return the ex1_histroy
     */
    public int getEx1_histroy() {
        return ex1_histroy;
    }

    /**
     * @param ex1_histroy the ex1_histroy to set
     */
    public void setEx1_histroy(int ex1_histroy) {
        this.ex1_histroy = ex1_histroy;
    }

    /**
     * @return int return the ex1_cre
     */
    public int getEx1_cre() {
        return ex1_cre;
    }

    /**
     * @param ex1_cre the ex1_cre to set
     */
    public void setEx1_cre(int ex1_cre) {
        this.ex1_cre = ex1_cre;
    }

    /**
     * @return int return the ex1_business
     */
    public int getEx1_business() {
        return ex1_business;
    }

    /**
     * @param ex1_business the ex1_business to set
     */
    public void setEx1_business(int ex1_business) {
        this.ex1_business = ex1_business;
    }

    /**
     * @return int return the ex1_agriculture
     */
    public int getEx1_agriculture() {
        return ex1_agriculture;
    }

    /**
     * @param ex1_agriculture the ex1_agriculture to set
     */
    public void setEx1_agriculture(int ex1_agriculture) {
        this.ex1_agriculture = ex1_agriculture;
    }

    /**
     * @return int return the ex2_english
     */
    public int getEx2_english() {
        return ex2_english;
    }

    /**
     * @param ex2_english the ex2_english to set
     */
    public void setEx2_english(int ex2_english) {
        this.ex2_english = ex2_english;
    }

    /**
     * @return int return the ex2_kiswahili
     */
    public int getEx2_kiswahili() {
        return ex2_kiswahili;
    }

    /**
     * @param ex2_kiswahili the ex2_kiswahili to set
     */
    public void setEx2_kiswahili(int ex2_kiswahili) {
        this.ex2_kiswahili = ex2_kiswahili;
    }

    /**
     * @return int return the ex2_mathematics
     */
    public int getEx2_mathematics() {
        return ex2_mathematics;
    }

    /**
     * @param ex2_mathematics the ex2_mathematics to set
     */
    public void setEx2_mathematics(int ex2_mathematics) {
        this.ex2_mathematics = ex2_mathematics;
    }

    /**
     * @return int return the ex2_chemistry
     */
    public int getEx2_chemistry() {
        return ex2_chemistry;
    }

    /**
     * @param ex2_chemistry the ex2_chemistry to set
     */
    public void setEx2_chemistry(int ex2_chemistry) {
        this.ex2_chemistry = ex2_chemistry;
    }

    /**
     * @return int return the ex2_biology
     */
    public int getEx2_biology() {
        return ex2_biology;
    }

    /**
     * @param ex2_biology the ex2_biology to set
     */
    public void setEx2_biology(int ex2_biology) {
        this.ex2_biology = ex2_biology;
    }

    /**
     * @return int return the ex2_physics
     */
    public int getEx2_physics() {
        return ex2_physics;
    }

    /**
     * @param ex2_physics the ex2_physics to set
     */
    public void setEx2_physics(int ex2_physics) {
        this.ex2_physics = ex2_physics;
    }

    /**
     * @return int return the ex2_geography
     */
    public int getEx2_geography() {
        return ex2_geography;
    }

    /**
     * @param ex2_geography the ex2_geography to set
     */
    public void setEx2_geography(int ex2_geography) {
        this.ex2_geography = ex2_geography;
    }

    /**
     * @return int return the ex2_histroy
     */
    public int getEx2_histroy() {
        return ex2_histroy;
    }

    /**
     * @param ex2_histroy the ex2_histroy to set
     */
    public void setEx2_histroy(int ex2_histroy) {
        this.ex2_histroy = ex2_histroy;
    }

    /**
     * @return int return the ex2_cre
     */
    public int getEx2_cre() {
        return ex2_cre;
    }

    /**
     * @param ex2_cre the ex2_cre to set
     */
    public void setEx2_cre(int ex2_cre) {
        this.ex2_cre = ex2_cre;
    }

    /**
     * @return int return the ex2_business
     */
    public int getEx2_business() {
        return ex2_business;
    }

    /**
     * @param ex2_business the ex2_business to set
     */
    public void setEx2_business(int ex2_business) {
        this.ex2_business = ex2_business;
    }

    /**
     * @return int return the ex2_agriculture
     */
    public int getEx2_agriculture() {
        return ex2_agriculture;
    }

    /**
     * @param ex2_agriculture the ex2_agriculture to set
     */
    public void setEx2_agriculture(int ex2_agriculture) {
        this.ex2_agriculture = ex2_agriculture;
    }

    /**
     * @return int return the ex3_english
     */
    public int getEx3_english() {
        return ex3_english;
    }

    /**
     * @param ex3_english the ex3_english to set
     */
    public void setEx3_english(int ex3_english) {
        this.ex3_english = ex3_english;
    }

    /**
     * @return int return the ex3_kiswahili
     */
    public int getEx3_kiswahili() {
        return ex3_kiswahili;
    }

    /**
     * @param ex3_kiswahili the ex3_kiswahili to set
     */
    public void setEx3_kiswahili(int ex3_kiswahili) {
        this.ex3_kiswahili = ex3_kiswahili;
    }

    /**
     * @return int return the ex3_chemistry
     */
    public int getEx3_chemistry() {
        return ex3_chemistry;
    }

    /**
     * @param ex3_chemistry the ex3_chemistry to set
     */
    public void setEx3_chemistry(int ex3_chemistry) {
        this.ex3_chemistry = ex3_chemistry;
    }

    /**
     * @return int return the ex3_biology
     */
    public int getEx3_biology() {
        return ex3_biology;
    }

    /**
     * @param ex3_biology the ex3_biology to set
     */
    public void setEx3_biology(int ex3_biology) {
        this.ex3_biology = ex3_biology;
    }

    /**
     * @return int return the ex3_physics
     */
    public int getEx3_physics() {
        return ex3_physics;
    }

    /**
     * @param ex3_physics the ex3_physics to set
     */
    public void setEx3_physics(int ex3_physics) {
        this.ex3_physics = ex3_physics;
    }

    /**
     * @return int return the ex4_english
     */
    public int getEx4_english() {
        return ex4_english;
    }

    /**
     * @param ex4_english the ex4_english to set
     */
    public void setEx4_english(int ex4_english) {
        this.ex4_english = ex4_english;
    }

    /**
     * @return int return the ex4_kiswahili
     */
    public int getEx4_kiswahili() {
        return ex4_kiswahili;
    }

    /**
     * @param ex4_kiswahili the ex4_kiswahili to set
     */
    public void setEx4_kiswahili(int ex4_kiswahili) {
        this.ex4_kiswahili = ex4_kiswahili;
    }

    /**
     * @return int return the ex4_chemistry
     */
    public int getEx4_chemistry() {
        return ex4_chemistry;
    }

    /**
     * @param ex4_chemistry the ex4_chemistry to set
     */
    public void setEx4_chemistry(int ex4_chemistry) {
        this.ex4_chemistry = ex4_chemistry;
    }

    /**
     * @return int return the ex4_biology
     */
    public int getEx4_biology() {
        return ex4_biology;
    }

    /**
     * @param ex4_biology the ex4_biology to set
     */
    public void setEx4_biology(int ex4_biology) {
        this.ex4_biology = ex4_biology;
    }

    /**
     * @return int return the ex4_physics
     */
    public int getEx4_physics() {
        return ex4_physics;
    }

    /**
     * @param ex4_physics the ex4_physics to set
     */
    public void setEx4_physics(int ex4_physics) {
        this.ex4_physics = ex4_physics;
    }

}