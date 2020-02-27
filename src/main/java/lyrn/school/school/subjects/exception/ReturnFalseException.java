package lyrn.school.school.subjects.exception;


public class ReturnFalseException extends Exception {
    private String username;
    public Boolean ReturnFalseException() {
           // super(String.format("Student is not found with id : '%s'", username));
           return false;
            }
    }