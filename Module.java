// Abstract class representing a module
public abstract class Module {
    // Fields/attributes of a module
    protected String name; // Name of the module
    protected int status; //status – corresponds to the assessment pattern for the module: 0 – coursework only, 1 – exam only, 2 – coursework and exam.
    protected double finalMark; // Final mark for the module

    // Constructor method to create a new module object
    public Module(String name, int status) {
        this.name = name;
        this.status = status;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the status field
    public int getStatus() {
        return status;
    }

    // Setter method for the status field
    public void setStatus(int status) {
        this.status = status;
    }

    // Getter method for the finalMark field
    public double getFinalMark() {
        return finalMark;
    }

    // Setter method for the finalMark field
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

    // Abstract method to calculate the final mark for the module
    public abstract void calculateFinalMark();

}



