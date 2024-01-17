/**
 * Fernando Ruiz 23065
 * Erick Guerra 23208
 * ALGORITMOS Y ESTRUCTURAS DE DATOS 2016
 */

/**
 * Esta clase representa una radio con funcionalidades básicas.
 */
public class Radio implements IRadio {

    // Estado de encendido/apagado de la radio
    public String ON;

    // Frecuencia actual de la radio (AM/FM)
    public String frequency;

    // Estación actual en modo AM
    public double stationAm;

    // Estación actual en modo FM
    public double stationFm;

    // Lista de estaciones guardadas para modo AM
    public double[] buttonListAM;

    // Lista de estaciones guardadas para modo FM
    public double[] buttonListFM;

    /**
     * Constructor de la clase Radio.
     *
     * @param ON Estado inicial de la radio ("On" si está encendida, "Off" si está apagada).
     * @param frequency Frecuencia inicial de la radio ("AM" o "FM").
     * @param stationAm Estación inicial en modo AM.
     * @param stationFm Estación inicial en modo FM.
     * @param buttonListAM Lista de estaciones guardadas para modo AM.
     * @param buttonListFM Lista de estaciones guardadas para modo FM.
     */
    public Radio(boolean ON, String frequency, double stationAm, double stationFm, double[] buttonListAM, double[] buttonListFM) {
        this.ON = "Off";
        this.frequency = "AM";
        this.stationAm = 530;
        this.stationFm = 87.9;
        this.buttonListAM = new double[12];
        this.buttonListFM = new double[12];
    }

    /**
     * Guarda la estación actual en el botón especificado.
     *
     * @param buttonId Número del botón (0-11) en el que se guardará la estación.
     * @param station Estación actual a ser guardada.
     */
    public void saveStation(int buttonId, double station) {
        if (this.isAM()) {
            this.buttonListAM[buttonId] = stationAm;
        } else {
            this.buttonListFM[buttonId] = stationFm;
        }
    }

    /**
     * Verifica si la radio está en modo AM.
     *
     * @return true si la radio está en modo AM, false si está en modo FM.
     */
    public boolean isAM() {
        return this.frequency.equals("AM");
    }

    /**
     * Verifica si la radio está encendida.
     *
     * @return true si la radio está encendida, false si está apagada.
     */
    public boolean isOn() {
        return this.ON.equals("On");
    }

    /**
     * Selecciona la estación guardada en el botón especificado.
     *
     * @param buttonId Número del botón (0-11) que contiene la estación a seleccionar.
     * @return La estación guardada en el botón especificado.
     */
    public double selectStation(int buttonId) {
        if (this.isAM()) {
            return this.buttonListAM[buttonId];
        } else {
            return this.buttonListFM[buttonId];
        }
    }

    /**
     * Enciende o apaga la radio.
     */
    public void switchOnOff() {
        if (this.isOn()) {
            this.ON = "Off";
        } else {
            this.ON = "On";
        }
    }

    /**
     * Cambia la frecuencia de la radio entre AM y FM.
     */
    public void switchAMFM() {
        if (this.isAM()) {
            this.frequency = "FM";
        } else {
            this.frequency = "AM";
        }
    }

    /**
     * Cambia a la siguiente estación disponible dependiendo del modo (AM/FM).
     *
     * @return La nueva estación seleccionada.
     */
    public double nextStation() {
        if (this.isOn()) {
            if (this.isAM()) {
                if (this.stationAm > 1610) {
                    this.stationAm = 530;
                    return this.stationAm;
                } else {
                    this.stationAm = this.stationAm + 10;
                    return this.stationAm;
                }
            } else {
                if (this.stationFm > 107.9) {
                    this.stationFm = 87.9;
                    return this.stationFm;
                } else {
                    this.stationFm = this.stationFm + 0.2;
                    return this.stationFm;
                }
            }
        }
        return 0;
    }
}