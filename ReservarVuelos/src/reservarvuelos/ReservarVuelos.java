
package reservarvuelos;


public class ReservarVuelos {


    public static void main(String[] args) {
       
        
        //Crear aeropuertos
        Aeropuerto aero1 = new Aeropuerto("AITJ", "Tijuana", "x100");
        Aeropuerto aero2 = new Aeropuerto("AICM", "CDMX", "x105");
        Aeropuerto aero3 = new Aeropuerto("AIP", "Puebla", "x110");
        
        // Crear vuelos entre esos aeropuertos y agregarlos a la lista de vuelos de cada aeropuerto.
        Vuelo vue1 = new Vuelo("XJ300", 100, aero1, aero2);
        Vuelo vue2 = new Vuelo("HK01", 100, aero2, aero1);
        Vuelo vue3 = new Vuelo("M1000", 2, aero3, aero1);
        
        System.out.println("----Agregando vuelos----");
        aero1.agregarVuelo(vue1);
        aero2.agregarVuelo(vue2);
        aero3.agregarVuelo(vue3);
        
        //Crear pasajeros y hacer reservas en vuelos específicos.
        Pasajero pasa1 = new Pasajero("David Trujeque", "DVTJQ1022");
        Pasajero pasa2 = new Pasajero("Oscar Cervantes", "OCCS03481");
        Pasajero pasa3 = new Pasajero("Angel Lara", "AGLA018934");
        Pasajero pasa4 = new Pasajero("Roberto Gonzales", "RTGS01293");
        Pasajero pasa5 = new Pasajero("Ary Cabanillas", "AYCS231");

        System.out.println("----Reservando asientos----");
        vue1.reservarAsiento(pasa1);
        vue2.reservarAsiento(pasa2);
        vue3.reservarAsiento(pasa3);
        vue3.reservarAsiento(pasa4);
        vue3.reservarAsiento(pasa5);
        
        System.out.println("----Listar vuelos----");
        aero1.listarVuelos();
        aero2.listarVuelos();
        aero3.listarVuelos();
        
        System.out.println("----ASIENTOS DISPONIBLES----");
        System.out.println(vue1.asientosDisponibles());
        System.out.println(vue2.asientosDisponibles());
        System.out.println(vue3.asientosDisponibles());
        
        System.out.println("----CANCELAR RESERVA DE ASIENTO----");
        vue1.cancerlarReserva(pasa1);
        
        System.out.println("----ASIENTOS DISPONIBLES----");
        System.out.println(vue1.asientosDisponibles());
    }
    
}
