public class Radio implements IRadio {
    private String ON;
    private String frequency;
    private double station;
    private double[] buttonListAM;
    private double[] buttonListFM;

    public Radio(boolean ON, String frequency, double station, double[] buttonListAM, double[] buttonListFM){
        this.ON = "On";
        this.frequency = "AM";
        this.station = 0;
        this.buttonListAM = new double[12];
        this.buttonListFM = new double[12];
    }
    
    public void saveStation(int buttonId, double station){
        boolean prove=isAm();
        if (prove){
            this.buttonListAM[buttonId]=station;
        }
        else{
            this.buttonListFM[buttonId] = station;
        }
    }

    public boolean isAm() {
        if (this.frequency == "AM"){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean isOn() {
        if(this.ON == "On"){
            return true;
        }
        else{
            return false;
        }
    }

    public double selectStation(int buttonId) {
        return this.station;
    }

    public void switchOnOff() {

    }

    public void switchAMFM() {
        
    }

    public double nextStation() {
        return this.buttonListAM[2]+this.buttonListFM[14];
    }

}