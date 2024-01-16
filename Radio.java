public class Radio implements IRadio {
    private boolean ON;
    private String frequency;
    private double station;
    private double[] buttonListAM;
    private double[] buttonListFM;

    public Radio(boolean ON, String frequency, double station, double[] buttonListAM, double[] buttonListFM){
        this.ON = true;
        this.frequency = "AM";
        this.station = 0;
        this.buttonListAM = new double[12];
        this.buttonListFM = new double[12];
    }
    
     public void saveStation(int buttonId, double station){
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
        return this.ON;
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