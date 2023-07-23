public class CW001 extends Module {
    private double[] homeworkMarks; // stores the homework marks for the module
    private double projectMark; // stores the project mark for the module

    public CW001(String name) { // constructor method
        super(name, 0); // calls the superclass constructor with the module name and status
        this.homeworkMarks = new double[3]; // initializes the homework marks array with size 3
    }

    public double[] getHomeworkMarks() { // accessor method for homeworkMarks
        return homeworkMarks;
    }

    public void setHomeworkMarks(double mark, int index) { // mutator method for homeworkMarks
    	homeworkMarks[index] = mark; // sets the homework mark at the specified index to the input value
    }

    public double getProjectMark() { // accessor method for projectMark
        return projectMark;
    }

    public void setProjectMark(double projectMark) { // mutator method for projectMark
        this.projectMark = projectMark; // sets the project mark to the input value
    }

    @Override
    public void calculateFinalMark() { // calculates the final mark for the module
        double homeworkavg = (homeworkMarks[0] + homeworkMarks[1] + homeworkMarks[2]) / 3.0; // calculates the average of the homework marks
        finalMark = (homeworkavg * 0.5) + (projectMark * 0.5); // calculates the final mark as the average of the homework marks (weighted 50%) and the project mark (weighted 50%)
    }
    
    // Getter and setter for FinalMark
    public void setfinalmark(double finalmark) {
    	this.finalMark=finalmark;
    }
    
    public double getFinalMark() {
    	return finalMark;
    }
}
