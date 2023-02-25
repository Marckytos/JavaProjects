public class Celular {
    public String nombre;
    public String modelo;
    private String IMEI;
    public float almacenamiento;
    public float RAM;
    public String OS;
    public String marca;
   
}
public Celular(){}
public void setNombre(String n){
    this.nombre = n;

}
public String getNombre(){ return this.nombre; }

public void setmodelo(String m){
    this.modelo=m;
}
public String getmodelo(){ return this.modelo; }
public String tostring(){
    String edo = "nombre "+ nombre +"\n";
    edo= edo +"modelo "+ modelo;
    return edo;
}
public void setIMEI(String i){
    this.IMEI=i;
}
public String getIMEI(){return this.IMEI;}

public int marca(String empresa){
    System.out.println(this.nombre + "es de la empresa");
    System.out.println(empresa);
    return 1;
}

public int red(String compañia){
    System.out.print(this.nombre + "Funciona con cualquier compañia");
}


