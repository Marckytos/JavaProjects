public class Alumno{
    private String Nombre;
    private int Edad;
    private String carrera;
    private int semestre;
}
//Metodo constructor por defecto
public Alumno(){}
public void setNombre(String n){
    this.Nombre = n;

}

public String getNombre(){ return this.Nombre; }

public void setEdad(int e){
    this.Edad=e;
}
public int getEdad(){ return this.Edad; }
public String tostring(){
    String edo = "Nombre "+ Nombre +"\n";
    edo= edo +"Edad "+ Edad;
    return edo;
}
public int estudiar(String tema){
    System.out.print(this.Nombre + "Estudia");
    System.out.println(tema);
    return 1;
}
public int programar(String tema){
    System.out.print(this.Nombre + "Esta programando");
    return 2;
}



