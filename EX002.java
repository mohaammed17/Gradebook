public class EX002 extends Module {
    // Fields specific to EX002 module
    private double examMark;

    // Constructor that takes name parameter and sets status to 1 (exam only)
    public EX002(String name) {
        super(name, 1);
    }

    // Getter and setter for examMark
    public double getExamMark() {
        return examMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    // Overrides the abstract method in Module to calculate finalMark as examMark
    @Override
    public void calculateFinalMark() {
        finalMark = examMark;
    }
    // Getter and setter for FinalMark
    public void setfinalmark(double finalmark) {
    	this.finalMark=finalmark;
    }
    
    public double getFinalMark() {
    	return finalMark;
    }
}

   