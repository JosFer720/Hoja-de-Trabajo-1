/**
 * Fernando Ruiz 23065
 * Erick Guerra 23208
 * ALGORITMOS Y ESTRUCTURAS DE DATOS 2016
 */

import java.util.Scanner;

/**
 * Esta clase representa un programa principal para controlar una radio.
 */
public class Principal {

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Se crea un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Se crea un objeto Radio con valores iniciales
        Radio radio = new Radio(true, "AM", 530.0, 87.9, new double[12], new double[12]);

        // Variable para almacenar la opción seleccionada por el usuario
        int option = -1;

        // Bucle principal del programa
        while (option != 0) {
            // Menú de opciones
            System.out.println("====Radio====");
            System.out.println("1. Encender o apagar");
            System.out.println("2. Cambiar frecuencia");
            System.out.println("3. Guardar estacion");
            System.out.println("4. Seleccionar estacion guardada");
            System.out.println("5. Cambiar estacion");
            System.out.println("6. Salir");
            System.out.println("Ingrese su opcion");

            // Se lee la opción del usuario
            option = scanner.nextInt();

            // Se ejecuta la opción seleccionada por el usuario
            switch (option) {
                case 1:
                    // Opción para encender o apagar la radio
                    radio.switchOnOff();
                    if (radio.isOn()) {
                        System.out.println("Radio encendida");
                    } else {
                        System.out.println("Radio apagada");
                    }
                    break;
                case 2:
                    // Opción para cambiar la frecuencia (AM/FM)
                    radio.switchAMFM();
                    if (radio.isOn()) {
                        System.out.print("Frecuencia cambiada a ");
                        if (radio.isAm()) {
                            System.out.println("AM");
                        } else {
                            System.out.println("FM");
                        }
                    } else {
                        System.out.println("La radio esta apagada");
                    }
                    break;
                case 3:
                    // Opción para guardar una estación en un botón
                    System.out.println("Ingrese el número de botón (0-11): ");
                    int buttonId = scanner.nextInt();

                    if (buttonId >= 0 && buttonId < 12) {
                        if (radio.isOn()) {
                            double currentStation;
                            if (radio.isAm()) {
                                currentStation = radio.stationAm;
                            } else {
                                currentStation = radio.stationFm;
                            }
                            radio.saveStation(buttonId, currentStation);
                            System.out.println("Estacion actual guardada en el boton " + buttonId);
                        } else {
                            System.out.println("La radio esta apagada.");
                        }
                    } else {
                        System.out.println("Numero de boton no valido.");
                    }
                    break;
                case 4:
                    // Opción para seleccionar una estación guardada en un botón
                    System.out.println("Ingrese el numero de botón (0-11): ");
                    int selectedButton = scanner.nextInt();

                    if (selectedButton >= 0 && selectedButton < 12) {
                        if (radio.isOn()) {
                            double selectedStation = radio.selectStation(selectedButton);
                            System.out.println("Estacion seleccionada del boton " + selectedButton + ": " + selectedStation);
                        } else {
                            System.out.println("La radio esta apagada.");
                        }
                    } else {
                        System.out.println("Numero de boton no valido");
                    }
                    break;
                case 5:
                    // Opción para cambiar a la siguiente estación
                    double newStation = radio.nextStation();
                    System.out.println("Estacion cambiada a " + newStation);
                    break;
                case 6:
                    // Opción para salir del programa
                    System.out.println("Gracias por usar nuestra radio");
                    System.exit(0);
                    break;
            }
        }

        // Se cierra el objeto Scanner al salir del bucle
        scanner.close();
    }
}