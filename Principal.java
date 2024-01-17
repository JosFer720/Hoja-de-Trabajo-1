import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Radio radio = new Radio(true, "AM", 530.0, 87.9, new double[12], new double[12]);

        int option = -1;

        while (option != 0) {
            System.out.println("====Radio====");
            System.out.println("1. Encender o apagar");
            System.out.println("2. Cambiar frecuencia");
            System.out.println("3. Guardar estacion");
            System.out.println("4. Seleccionar estacion guardada ");
            System.out.println("5. Cambiar estacion");
            System.out.println("6. Salir");
            System.out.println("Ingrese su opcion");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    radio.switchOnOff();
                        if (radio.isOn()) {
                            System.out.println("Radio encendida");
                        }
                        else {
                            System.out.println("Radio apagada");
                            }
                    break;
                case 2:
                    radio.switchAMFM();
                        if (radio.isOn()) {
                            System.out.println("Frecuencia cambiada a ");
                            if (radio.isAm()){
                                System.out.println("AM");
                            }
                            else {
                                System.out.println("FM");
                            }
                        }
                        else {
                            System.out.println("La radio esta apagada");
                        }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    double newStation = radio.nextStation();
                    System.out.println("Estacion cambiada a " + newStation);
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestra radio");
                    System.exit(0);
                    break;
                }
            } 
            scanner.close();
        }
    }