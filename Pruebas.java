

public class Pruebas{
    @Test
    public void testNextStation() {
        Radio radio = new Radio(true, "AM", 530.0, 87.9, new double[12], new double[12]);

        double initialStation = radio.nextStation();
        double secondStation = radio.nextStation();

        assertTrue(initialStation < secondStation);
    }
}