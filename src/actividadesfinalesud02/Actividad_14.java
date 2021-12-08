package actividadesfinalesud02;

import java.util.Scanner;

public class Actividad_14 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num, dec, uni;
        String decenas="", unidades="";
        System.out.println("Ingresa un numero del 1 al 99");

        num=sc.nextInt();
        dec=num/10;
        uni=num%10;
        
        
        	switch(uni){
        	case 1:
    			unidades = "uno";
    			break;
    		case 2:
    			unidades = "dos";
    			break;
    		case 3:
    			unidades = "tres";
    			break;
    		case 4:
    			unidades = "cuatro";
    			break;
    		case 5:
    			unidades = "cinco";
    			break;
    		case 6:
    			unidades = "seis";
    			break;
    		case 7:
    			unidades = "siete";
    			break;
    		case 8:
    			unidades = "ocho";
    			break;
    		case 9:
    			unidades = "nueve";
    			break;
        	}
        
        if(num>=11 && num<=15){

            switch(num){

                case 11: 
                	decenas = "once"; 
                	break;

                case 12: 
                	decenas = "doce"; 
                	break;

                case 13:
                	decenas = "trece"; 
                	break;

                case 14: 
                	decenas = "catorce"; 
                	break;
                case 15: 
                	decenas = "quince"; 
                	break;

            }
         }else{
            	switch(dec){
        		case 1:
        			decenas = "diez";
        			break;
        		case 2:
        			decenas = "veinte";
        			break;
        		case 3:
        			decenas = "treinta";
        			break;
        		case 4:
        			decenas = "cuarenta";
        			break;
        		case 5:
        			decenas = "cincuenta";
        			break;
        		case 6:
        			decenas = "sesenta";
        			break;
        		case 7:
        			decenas = "setenta";
        			break;
        		case 8:
        			decenas = "ochenta";
        			break;
        		case 9:
        			decenas = "noventa";
        			break;
            	} 
            }
            
        if(num<10)	
        	System.out.println(unidades);
        else if(uni==0)
        	System.out.println(decenas);
        else if(num>=11 && num<=15)
        	System.out.println(decenas);
        else
        	System.out.println(decenas+" y "+unidades);
        }
}