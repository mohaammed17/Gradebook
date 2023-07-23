public class CE003 extends Module {
    private double[] homeworkMarks;  // array to store homework marks
    private double examMark;  // variable to store exam mark

    public CE003(String name) {
        super(name, 2);  // calling superclass constructor with name and assessment pattern status
        this.homeworkMarks = new double[4];  // initializing homework marks array
       
    }

    public double[] getHomeworkMarks() {  // accessor method to retrieve homework marks array
        return homeworkMarks;
    }

    public void setHomeworkMarks(double mark, int index) {  // mutator method to set homework mark at specified index
        homeworkMarks[index] = mark;
    }

    public double getExamMark() {  // accessor method to retrieve exam mark
        return examMark;
    }

    public void setExamMark(double examMark) {  // mutator method to set exam mark
        this.examMark = examMark;
    }

    @Override
    public void calculateFinalMark() {  // overriding abstract method to calculate final mark
    	double avghomeworkmarks=(homeworkMarks[0]+homeworkMarks[1]+homeworkMarks[2]+homeworkMarks[3])/4;  // calculating average of homework marks
    	finalMark=(avghomeworkmarks*0.4+examMark*0.6);  // calculating final mark as weighted average of homework and exam marks
    }
    
    // Getter and setter for FinalMark
    public void setfinalmark(double finalmark) {
    	this.finalMark=finalmark;
    }
    
    public double getFinalMark() {
    	return finalMark;
    }
}
