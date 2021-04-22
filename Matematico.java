import java.util.*;
public class Matematico{
    public void main (String[]args){        
    }

    public void mmm(int n, int n1, int n2){

        if(n>=n1 && n>=n2){            
            System.out.println("El mayor es: "+n);
        }else if(n1>=n && n1>=n2){
            System.out.println("El mayor es: "+n1);
        }else if(n2>=n && n2>=n1){
            System.out.println("El mayor es: "+n2);
        }
        if (n>=n1 && n<=n2){
            System.out.println("El del medio es: "+n);
        }else if(n2>=n1 && n2<=n){
            System.out.println("El del medio es: "+n2);
        }else if(n1>=n && n1<=n2 ){
            System.out.println("El del medio es: "+n1);
        }
        if(n<=n1 && n<=n2){
            System.out.println("El menor es: "+n);
        }else if(n1<=n && n1<=n2){
            System.out.println("El menor es: "+n1);
        }else if(n2<=n && n2<=n1){
            System.out.println("El menor es: "+n2);
        }        
    }

    public void area(double lado){
        double area=lado*lado;
        System.out.println("El area del cuadrado es: "+area);
    }

    public void coordenadas(double coor1, double coor2){
        double distancia;
        if (coor1<0 && coor2>coor1){
            distancia=coor2-coor1;
            System.out.println("La distancia entre las coordenadas es "+distancia);
        }else if(coor2<0 && coor1>coor2){
            distancia=coor1-coor2;
            System.out.println("La distancia entre las coordenadas es "+distancia);
        }else if((coor2>0 && coor1>0) && coor1>coor2){
            distancia=coor1-coor2;  
            System.out.println("La distancia entre las coordenadas es "+distancia);
        }else if((coor2>0 && coor1>0) && coor2>coor1){
            distancia=coor2-coor1;  
            System.out.println("La distancia entre las coordenadas es "+distancia);        
        }    
    }

    public void cuadrante(double x, double y){
        if (x>0 && y>0){
            System.out.println("El punto se encuentra en el primer cuadrante");
        }else if (x<0 && y>0){
            System.out.println("El punto se encuentra en el segundo cuadrante");
        }else if (x<0 && y<0){
            System.out.println("El punto se encuentra en el tercer cuadrante");
        }else if (x>0 && y<0){
            System.out.println("El punto se encuentra en el cuarto cuadrante");
        }
    }
}
