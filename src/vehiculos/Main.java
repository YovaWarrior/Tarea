
package vehiculos;


public class Main {
    public static void main(String[] args) {
        Automovil miAuto = new Automovil();
        Motocicleta miMoto = new Motocicleta();
        Avion miAvion = new Avion();
        Helicoptero miHelicoptero = new Helicoptero();
        Velero miVelero = new Velero();
        Yate miYate = new Yate();

        miAuto.encender();
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.apagar();

        miMoto.encender();
        miMoto.acelerar();
        miMoto.frenar();
        miMoto.apagar();

        miAvion.encender();
        miAvion.despegar();
        miAvion.acelerar();
        miAvion.aterrizar();
        miAvion.apagar();

        miHelicoptero.encender();
        miHelicoptero.despegar();
        miHelicoptero.acelerar();
        miHelicoptero.aterrizar();
        miHelicoptero.apagar();

        miVelero.encender();
        miVelero.navegar();
        miVelero.frenar();
        miVelero.atracar();
        miVelero.apagar();

        miYate.encender();
        miYate.navegar();
        miYate.frenar();
        miYate.atracar();
        miYate.apagar();
    }
}
