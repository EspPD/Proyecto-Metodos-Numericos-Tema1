package newpackage;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner Lr=new Scanner(System.in);
        double [] num = new double [1499];
        do {
            System.out.println("Escoja una opcion.");
            System.out.println("Formula General             1");
            System.out.println("Formula General inversa     2");
            System.out.println("Metodo Po Shen Loh          3");
            System.out.println("euler x                     4");
            System.out.println("euler -x                    5");
            System.out.println("varianza                    6");
            int opc=Lr.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el valor de 'a','b','c' ");
                    double a =Lr.nextInt();
                    double b =Lr.nextInt();
                    double c =Lr.nextInt();
                    Formulageneral(a,b,c);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                case 2:
                    System.out.println("Ingrese el valor de 'a','b','c' ");
                    double d =Lr.nextInt();
                    double e =Lr.nextInt();
                    double f =Lr.nextInt();
                    FormulageneralInversa(d,e,f);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                case 3:
                    System.out.println("Ingrese el valor de 'a','b','c' ");                             
                    double g =Lr.nextInt();
                    double h =Lr.nextInt();
                    double i =Lr.nextInt();
                    PoShenLoh(g,h,i);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                case 4:
                    System.out.println("Ingrese el valor de x y n ");
                    double j =Lr.nextInt();
                    double k =Lr.nextInt();
                    System.out.println(" el resultado es");
                    euler(j,k);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                case 5:
                    System.out.println("Ingrese el valor de x y n ");
                    double m =Lr.nextInt();
                    double n =Lr.nextInt();
                    System.out.println(" el resultado es");
                    eulernegativo(m,n);
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
                case 6:
                    System.out.println("Ingrese el valor de x y n ");
                    double sum=0;
                    for (int x=0;x<num.length;x++){
                        num[x] = (double) (Math.random()*1)+0;
                        sum=sum+num[x];
                    }
                    double promedio=sum/1500;
                    System.out.println(" el resultado es");
                    System.out.println(varianza(num, promedio));
                    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    break;
            }
        } while (true); 
    }
    public static void Formulageneral(double a,double b,double c){
        double op,x1,x2;
        op=(Math.pow(b,2))-(4*(a)*(c));
        if(op<0){
            System.out.println("No existe solución");
        }
        else{
            x1=(-(b)+ Math.sqrt(op))/(2*(a));
            x2=(-(b)- Math.sqrt(op))/(2*(a));
            System.out.println("El resultado es:");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
    public static void FormulageneralInversa(double a,double b,double c){
        double a1,x1,x2;
        a1=Math.pow(b,2)-(4*a*c);
        if(a1<0){
            System.out.println("No existe solución");
        }
        else{
            x1=(-2*c)/((b)+ Math.sqrt(a1));
            x2=(-2*c)/((b)- Math.sqrt(a1));
            System.out.println("El resultado es:");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
    
    public static void PoShenLoh(double a,double b,double c){
        double op,x1,x2,t,u;
        t=-b/2;
        op=Math.pow(t,2)-(c);
        u=Math.sqrt(op);
        if(op<0){
            System.out.println("No existe solución");
        }
        else{
            x1=(t+(u));
            x2=(t-(u));
            System.out.println("El resultado es:");
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
    
    public static double fac(double x){
        if (x==0)
        return 1;
        else
        return x * fac(x-1);
    }
    
    public static void euler(double x,double n){
        double sum=0;
        for (int i=0; i<n+1; i++) {
            sum = sum+Math.pow(x,i)/(fac(i));
        }
        System.out.println(sum);
    }
    
    public static void eulernegativo(double x,double n){
        double sum=0;
        for (int i=0; i<n+1; i++) {
            sum = sum+1/(Math.pow(x,i)/(fac(i)));
        }
        System.out.println(sum);
    }
    public static double varianza (double x[],double media){
        double varianza = 0;
        for(int i = 0 ; i<10; i++){
            double rango = Math.pow(x[i] - media,2);
            varianza = varianza + rango;
        }
        varianza = varianza / 10;
        return varianza;
    }
    
}
