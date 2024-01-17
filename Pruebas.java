import org.junit.*;
import static org.junit.Assert.assertEquals;

<<<<<<< HEAD
// public class Pruebas{
//     @Test
//     public void testNextStation() {
//         Radio radio = new Radio(true, "AM", 530.0, 87.9, new double[12], new double[12]);

//         double initialStation = radio.nextStation();
//         double secondStation = radio.nextStation();

//         assertTrue(initialStation < secondStation);
//     }
// }
=======
public class Pruebas{

    @Test
    public void testsaveStation() {
        Radio radio = new Radio(true, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        radio.saveStation(0, 550);
        assertEquals(550, radio.buttonListAM[0], 0.0);
    }

    @Test
    public void testNextStation(){
        Radio radio = new Radio(true, "AM", 530, 87.9, new double[12], new double[12]);
        radio.switchOnOff();
        assertEquals(540, radio.nextStation(), 0.0);
        assertEquals(550, radio.nextStation(), 0.0);
        assertEquals(560, radio.nextStation(), 0.0);
    }
}
>>>>>>> fdc434cd69d8d984af8040381c646a2b29db599f
