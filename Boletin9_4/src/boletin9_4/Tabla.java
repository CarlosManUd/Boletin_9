package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Tabla {
  public void tablaMultiplicar(){
        int num;
        do{
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero positivo:"));
        if(num > 0){
            System.out.println("Tabla de multiplicar del número " + num + ":");
                for(int i = 1; i < 11; i++){
                    System.out.println(num + " * " + i + " = " + num*i);
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
        }
        }while(num != 0);
        
    }
    
}