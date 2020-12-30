package pruebas.java;

import java.util.Scanner;

public class MoneyParts {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        double importe=0;
        do{
            try{
                System.out.print("Ingresa el cambio a devolver:");
                importe=sc.nextDouble();
            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                System.out.println("");
                sc.nextLine();
            }
        }
        while(importe<=0);
 
        calcular(importe);
	}

	public static void calcular(double importe)
    {
        double [] monedas={0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 20, 50, 100, 200};
        double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
 
        String resultado = "";
        for(int i=0;i<monedas.length;i++)
        {
            if(importe>=monedas[i])
            {
                devolver[i]=Math.floor(importe/monedas[i]);
                importe=importe-(devolver[i]*monedas[i]);
            }
        }

        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    for(int j=0;j<devolver[i];j++) {
                    	resultado = resultado + monedas[i] + ",";
                    }
                }else{
                    for(int j=0;j<devolver[i];j++) {
                    	resultado = resultado + monedas[i] + ",";
                    }
                }
            }
        }
        System.out.println(resultado);
    }
}
