
package reservarvuelos;

import java.util.LinkedList;
import java.util.List;

public class Vuelo {
    private String codigoVuelo;
    private int capacidadPasajeros;
    private Aeropuerto aeropuertoSalida;
    private Aeropuerto aeropuertoDestino;
    private List<Pasajero> pasajeros = new LinkedList<>();

    public Vuelo() {
    }

    public Vuelo(String codigoVuelo, int capacidadPasajeros, Aeropuerto aeropuertoSalida, Aeropuerto aeropuertoDestino) {
        this.codigoVuelo = codigoVuelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.aeropuertoSalida = aeropuertoSalida;
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getAeropuertoSalida() {
        return aeropuertoSalida.getNombre();
    }

    public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
        this.aeropuertoSalida = aeropuertoSalida;
    }

    public String getAeropuertoDestino() {
        return aeropuertoDestino.getNombre();
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    
    // METODOS PERSONALIZADOS
    
    
    public boolean reservarAsiento(Pasajero pasajero){
        if(asientosDisponibles() > 0){
            pasajeros.add(pasajero);
            System.out.println("Reserva exitosa para:" + pasajero.getNombre() + " en el vuelo: " + codigoVuelo);
            return true;
        }else{
            System.out.println("No hay asientos disponibles para este vuelo" + codigoVuelo);
            return false;
        }
        
    }
    
    public boolean cancerlarReserva(Pasajero pasajero){
        if(pasajeros.remove(pasajero)){
            System.out.println("Se cancelo la reserva de: " + pasajero.getNombre() + " En el vuelo: " + codigoVuelo);
            return true;
        }else{
            System.out.println("La reserva para " + pasajero.getNombre() + " No fue cancelada");
            return false;
        }
    }
    
    public int asientosDisponibles(){
        return capacidadPasajeros - pasajeros.size();
    }
    
}
