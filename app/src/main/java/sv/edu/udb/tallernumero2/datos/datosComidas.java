package sv.edu.udb.tallernumero2.datos;

public class datosComidas {

    private String key;
    private String fecha;
    private String total;

    public datosComidas( String fecha, String total) {
        this.fecha = fecha;
        this.total = total;
    }

    public datosComidas(){

    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {

        this.key = key;
    }

    public String getFecha() {

        return fecha;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public String getTotal() {

        return total;
    }

    public void setTotal(String total) {

        this.total = total;
    }
}
