package constructores.ejemplo;

public class ConstructoresEjemplo {

    private int Dia;
    private int  Mes;
    private int Año;
    
    public ConstructoresEjemplo(){
        Dia=3;
        Mes=3;
        Año=2021;
        Anuncio();
    }
    
    public ConstructoresEjemplo(int D){
        Dia=D;
        Mes=3;
        Año=2021;
    }
    
    public ConstructoresEjemplo(int D, int M){
        Dia=D;
        Mes=M;
        Año=2021;
    }
    
    public ConstructoresEjemplo(int D, int M, int A){
        Dia=D;
        Mes=M;
        Año=A;
    }
   
    public void Anuncio(){
        System.out.println("Default "+Dia+"/"+Mes+"/"+Año);
    }
    
    public static void main(String[] args) {
        ConstructoresEjemplo Objeto= new ConstructoresEjemplo();
        ConstructoresEjemplo Objeto1= new ConstructoresEjemplo(1);
        System.out.println("1 argumento "+Objeto1.Dia+"/"+Objeto1.Mes+"/"+Objeto1.Año);
        ConstructoresEjemplo Objeto2= new ConstructoresEjemplo(1,2);
        System.out.println("2 argumentos"+Objeto2.Dia+"/"+Objeto2.Mes+"/"+Objeto2.Año);
        ConstructoresEjemplo Objeto3= new ConstructoresEjemplo(1,2,3);
        System.out.println("3 argumentos "+Objeto3.Dia+"/"+Objeto3.Mes+"/"+Objeto3.Año);
    }
    
}
