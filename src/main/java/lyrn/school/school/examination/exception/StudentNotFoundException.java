package lyrn.school.school.examination.exception;


public class StudentNotFoundException extends Exception {
    private String username;
    public StudentNotFoundException(String username) {
            super(String.format("Student is not found with id : '%s'", username));
            }
    }