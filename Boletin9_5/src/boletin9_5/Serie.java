package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Serie {
     public void serieSuma2(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de veces que desea que se repita la serie:"));
        int contador = 2;
        for(int i = 0; i < num; i++){
            System.out.print(contador + "+");
            contador = contador + 2;
        }
    }
    public void serieSumaResta(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de veces que desea que se repita la serie:"));
        int contador = 1;
        for(int i = 0; i < num; i++){
           if(contador%2==0){
               System.out.print("+" + contador);
           }
           else{
               System.out.print("-" + contador);
           }
           contador++;
        }
    }
    public void serieSuma(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de veces que desea que se repita la serie:"));
        int i;
        int contador1 = 0;
        int contador2 = 1;
        int contador3 = contador1 + contador2;
        for(i = 0; i < num; i++){
            switch (i) {
                case 0:
                    System.out.print(0 + ", ");
                    break;
                case 1:
                    System.out.print(1 + ", ");
                    break;
                default:
                    System.out.print(contador3 + ", ");
                    contador1 = contador2;
                    contador2 = contador3;
                    contador3 = contador1 + contador2;
                    break;
            }
        }
    }
}
