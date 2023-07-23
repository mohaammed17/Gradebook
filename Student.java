public class Student {
    // Fields/attributes of a student
    private String id; // ID of the student
    private String firstname; // First name of the student
    private String lastname; // Last name of the student
    private CW001 cw001; // Object representing the CW001 module for this student
    private EX002 ex002; // Object representing the EX002 module for this student
    private CE003 ce003; // Object representing the CE003 module for this student

    // Constructor method to create a new student object
    public Student(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.cw001 = new CW001("CW001"); // Initialize the CW001 module object
        this.ex002 = new EX002("EX002"); // Initialize the EX002 module object
        this.ce003 = new CE003("CE003"); // Initialize the CE003 module object
    }

    // Getter method for the ID field
    public String getId() {
        return id;
    }

    // Setter method for the ID field
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for the first name field
    public String getFirstname() {
        return firstname;
    }

    // Setter method for the first name field
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter method for the last name field
    public String getLastname() {
        return lastname;
    }

    // Setter method for the last name field
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Getter method for the CW001 module object
    public CW001 getCw001() {
        return cw001;
    }

    // Setter method for the CW001 module object
    public void setCw001(CW001 cw001) {
        this.cw001 = cw001;
    }

    // Getter method for the EX002 module object
    public EX002 getEx002() {
        return ex002;
    }

    // Setter method for the EX002 module object
    public void setEx002(EX002 ex002) {
        this.ex002 = ex002;
    }

    // Getter method for the CE003 module object
    public CE003 getCe003() {
        return ce003;
    }

    // Setter method for the CE003 module object
    public void setCe003(CE003 ce003) {
        this.ce003 = ce003;
    }

    // Method to print the module marks for a specified module
    public void printmodulemarks(String modulename) {
        switch (modulename) {
            case "CW001":
            	cw001.calculateFinalMark();// call calculateFinalMark() for CW001
            	double homeworkavg = (cw001.getHomeworkMarks()[0] + cw001.getHomeworkMarks()[1] + cw001.getHomeworkMarks()[2]) / 3.0;
            	System.out.println(firstname + "\t" + lastname + "\t" + String.format("%.2f",homeworkavg ) + "%\t" + String.format("%.2f", cw001.getProjectMark()) + "%\t" + String.format("%.2f", cw001.getFinalMark())+"%\t");
                break;
            case "EX002":
            	ex002.calculateFinalMark();// call calculateFinalMark() for EX002
                System.out.println(firstname + "\t" + lastname + "\t" +String.format("%.2f",ex002.getFinalMark()) + "%");
                break;
            case "CE003":
            	ce003.calculateFinalMark();// call calculateFinalMark() for CE003
            	double avghomeworkmarks=((ce003.getHomeworkMarks()[0] + ce003.getHomeworkMarks()[1] + ce003.getHomeworkMarks()[2]+ce003.getHomeworkMarks()[3]))/4;
                System.out.println(firstname + "\t" + lastname + "\t" + String.format("%.2f",avghomeworkmarks)+ "%\t"
                        +String.format("%.2f",ce003.getExamMark())+ "%\t" +String.format("%.2f",ce003.getFinalMark()) + "%");
                break;
               //If the module name is not recognized
            default:
                break;
        }
    }

}

