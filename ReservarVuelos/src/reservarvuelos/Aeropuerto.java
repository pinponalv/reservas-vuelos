
package reservarvuelos;

import java.util.LinkedList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String codigo;
    private List<Vuelo> vuelos = new LinkedList<>();

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String ciudad, String codigo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    
    
    
    
    
    public void agregarVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
        System.out.println("El codigo del vuelo es " 
                + vuelo.getCodigoVuelo() + " que sale del " + vuelo.getAeropuertoDestino()
                + " y se dirije a " + vuelo.getAeropuertoDestino().toString() );
    }
    
    public void listarVuelos(){
        if(vuelos.isEmpty()){
            System.out.println("NO hay vuelos");
        }else{
            for(Vuelo vuelo: vuelos){
                System.out.println("Codigo de vuelo: " + vuelo.getCodigoVuelo() 
                        + " Destino: " + vuelo.getAeropuertoDestino() 
                        + " Capacidad: " + vuelo.getCapacidadPasajeros() 
                        //FALTAN HACIENDOS DISPONIBLES 
                ); 
            }
        }
    }

    
    
    
    
}
