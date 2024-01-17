/**
 * Fernando Ruiz 23065
 * Erick Guerra 23208
 * ALGORITMOS Y ESTRUCTURAS DE DATOS 2016
 */

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class Pruebas{

    @Test
    public void testsaveStation() {
        Radio radio = new Radio(true, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        radio.saveStation(0, 530);
        assertEquals(530, radio.selectStation(0), 0.0);
    }

    @Test
    public void testNextStation(){
        Radio radio = new Radio(true, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        assertEquals(540, radio.nextStation(), 0.0);
        assertEquals(550, radio.nextStation(), 0.0);
        assertEquals(560, radio.nextStation(), 0.0);
    }

    @Test
    public void testSwitchAMFM(){
        Radio radio = new Radio(true, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        assertEquals("AM", radio.frequency);
    }


    @Test
    public void testNextStationInvalid() {
        Radio radio = new Radio(false, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        assertEquals(87.9, radio.stationAm, 0.0);
    }
}
