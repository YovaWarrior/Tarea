
package vehiculos;

public class Velero implements VehiculoAcuatico {
    private boolean velaArriba;

    @Override
    public void acelerar() {
        if (velaArriba) {
            System.out.println("El velero aprovecha el viento y aumenta su velocidad.");
        }
    }

    @Override
    public void frenar() {
        System.out.println("El velero reduce su velocidad.");
    }

    @Override
    public void encender() {
        System.out.println("El velero está listo para zarpar con la vela arriba.");
        velaArriba = true;
    }

    @Override
    public void apagar() {
        System.out.println("El velero baja la vela y se prepara para atracar.");
        velaArriba = false;
    }

    @Override
    public void navegar() {
        if (velaArriba) {
            System.out.println("El velero navega aprovechando el viento.");
        }
    }

    @Override
    public void atracar() {
        System.out.println("El velero llega al puerto y se prepara para atracar.");
        velaArriba = false;
    }
}
