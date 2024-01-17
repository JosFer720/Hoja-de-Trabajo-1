public class Radio implements IRadio {
    public String ON;
    private String frequency;
    public double stationAm;
    private double stationFm;
    public double[] buttonListAM;
    public double[] buttonListFM;

    public Radio(boolean ON, String frequency, double stationAm, double stationFm, double[] buttonListAM, double[] buttonListFM){
        this.ON = "Of";
        this.frequency = "AM";
        this.stationAm = 530;
        this.stationFm = 87.9;
        this.buttonListAM = new double[12];
        this.buttonListFM = new double[12];
    }
    
    public void saveStation(int buttonId, double station){
        if (this.isOn()){
            if (this.isAm()){
                this.buttonListAM[buttonId]=station;
            }
            else{
                this.buttonListFM[buttonId] = station;
            }
        }
        else{
            System.out.println("La radio esta apagada");
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
        if (this.isOn()){
            if (this.isAm()){
                return this.buttonListAM[buttonId];
            }
            else{
                return this.buttonListFM[buttonId];
            }
        }
        else{
            System.out.println("La radio esta apagada");
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
        else{
            System.out.println("La radio esta apagada");
        }
    }

    public double nextStation() {
        if (this.isOn()){
            if (this.isAm()){
                this.stationAm+=10;
                if(this.stationAm>1610) {
                    this.stationAm=530;
                }
                return this.stationAm;
                }
            else {
                this.stationFm+=0.2;
                if(this.stationFm>107.9){
                    this.stationFm=87.9;
                }
                return Math.round(this.stationFm * 10.0)/10.0 ;
            }
        }
        else{
            System.out.println("La radio esta apagada");
        }
        return 0;
}
}