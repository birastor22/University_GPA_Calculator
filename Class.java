/**
 * @author Ben Irastorza
 * @version 1.1337
 */
public class Class {
    private String name;
    private String grade;
    private int gradeNum;
    private int credHours;

    /**
     * Class constructor.
     * @param name the name of the class
     * @param grade the letter grade in the class.
     * @param credHours the number credit hours the class is worth
     */
    public Class(String name, String grade, int credHours) {
        this.name = name;
        switch (grade.toUpperCase()) {
            case "A":
                this.grade = grade;
                this.gradeNum = 4;
                break;
            case "B":
                this.grade = grade;
                this.gradeNum = 3;
                break;
            case "C":
                this.grade = grade;
                this.gradeNum = 2;
                break;
            case "D":
                this.grade = grade;
                this.gradeNum = 1;
                break;
            case "F":
                this.grade = grade;
                this.gradeNum = 0;
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (credHours <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.credHours = credHours;
        }
    }

    /**
     * an override of the toString method.
     * @return returns a string representation of a class.
     */
    @Override
    public String toString() {
        return String.format("Course: %s - Grade: %s - Credit Hours: %d\n", name, grade, credHours);
    }

    /**
     * a getter method for the gradeNum field.
     * @return returns the gradeNum field
     */
    public int getGradeNum() {
        return gradeNum;
    }

    /**
     * a getter method for the credHours field.
     * @return returns the credHours field
     */
    public int getCredHours() {
        return credHours;
    }
}
