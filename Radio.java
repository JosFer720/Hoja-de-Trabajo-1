public class Radio implements IRadio {
    private String ON;
    private String frequency;
    private double stationAm;
    private double stationFm;
    private double[] buttonListAM;
    private double[] buttonListFM;

    public Radio(boolean ON, String frequency, double stationAm, double stationFm, double[] buttonListAM, double[] buttonListFM){
        this.ON = "On";
        this.frequency = "AM";
        this.stationAm = 530;
        this.stationFm = 87.9;
        this.buttonListAM = new double[12];
        this.buttonListFM = new double[12];
    }
    
    public void saveStation(int buttonId, double station){
        if (this.isOn()) {
            if (this.isAm()){
                this.buttonListAM[buttonId]=station;
            }
            else{
                this.buttonListFM[buttonId] = station;
            }
        }
    }

    public boolean isAm() {
        if (this.isOn()) {
            return this.frequency == "AM";
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
        if (this.isOn()){
            if (this.isAm()){
                return this.buttonListAM[buttonId];
            }
            else{
                return this.buttonListFM[buttonId];
            }
        }
        return 0;  
    }

    public void switchOnOff() {
        if (this.isOn()){
            this.ON="Off";
        }
        else{
            this.ON="On";
            }
    }

    public void switchAMFM() {
        if (this.isOn()){
            if (this.isAm()){
                this.frequency = "FM";
            }
            else {
                this.frequency = "AM";
            }
        }
    }

    public double nextStation() {
        if (this.isOn()){
            if (this.isAm()){
                if(this.stationAm>1610) {
                    this.stationAm=530;
                    return this.stationAm;
                }
                else{
                    this.stationAm=this.stationAm+10;
                    return this.stationAm;
                }
            }
            else {
                if(this.stationFm>107.9){
                    this.stationFm=87.9;
                    return this.stationFm;
                }
                else{
                    this.stationFm=this.stationFm + 0.2;
                    return this.stationFm;
                }
            }
        }
        return 0;
    }
}