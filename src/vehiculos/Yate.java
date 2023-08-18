
package vehiculos;


public class Yate implements VehiculoAcuatico {
    private boolean motorEncendido;

    @Override
    public void acelerar() {
        if (motorEncendido) {
            System.out.println("El yate aumenta su velocidad en el agua.");
        }
    }

    @Override
    public void frenar() {
        System.out.println("El yate reduce su velocidad.");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el motor del yate.");
        motorEncendido = true;
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor del yate y preparándose para atracar.");
        motorEncendido = false;
    }

    @Override
    public void navegar() {
        if (motorEncendido) {
            System.out.println("El yate navega en el agua.");
        }
    }

    @Override
    public void atracar() {
        System.out.println("El yate se acerca al muelle y se prepara para atracar.");
        motorEncendido = false;
    }
}
