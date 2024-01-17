/**
 * Fernando Ruiz 23065
 * Erick Guerra 23208
 * ALGORITMOS Y ESTRUCTURAS DE DATOS 2016
 */

/**
 * Interfaz que define los métodos para operar una radio.
 */
public interface IRadio {

    /**
     * Guarda la estación actual en el botón especificado.
     *
     * @param buttonId Número del botón (0-11) en el que se guardará la estación.
     * @param station Estación actual a ser guardada.
     */
    void saveStation(int buttonId, double station);

    /**
     * Verifica si la radio está en modo AM.
     *
     * @return true si la radio está en modo AM, false si está en modo FM.
     */
    boolean isAM();

    /**
     * Verifica si la radio está encendida.
     *
     * @return true si la radio está encendida, false si está apagada.
     */
    boolean isOn();

    /**
     * Selecciona la estación guardada en el botón especificado.
     *
     * @param buttonId Número del botón (0-11) que contiene la estación a seleccionar.
     * @return La estación guardada en el botón especificado.
     */
    double selectStation(int buttonId);

    /**
     * Enciende o apaga la radio.
     */
    void switchOnOff();

    /**
     * Cambia la frecuencia de la radio entre AM y FM.
     */
    void switchAMFM();

    /**
     * Cambia a la siguiente estación disponible dependiendo del modo (AM/FM).
     *
     * @return La nueva estación seleccionada.
     */
    double nextStation();
}