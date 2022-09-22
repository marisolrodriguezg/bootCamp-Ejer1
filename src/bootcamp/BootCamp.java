
package bootcamp;

public class BootCamp {

    public static void main(String[] args) {
        int resultado=suma(2,3,4);
        System.out.println(resultado);
        Coche miCoche= new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.puertas);
        
        
    }
    public static int suma(int a, int b ,int c){
        
        return a+b+c;
    }
}
    class Coche{
        public int puertas= 0;
        public void IncrementarPuertas(){
            this.puertas++;
        }
        
    }

