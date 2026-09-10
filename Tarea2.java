package co.edu.uniquindio.poo;
/**
 * Jerónimo Aristizábal
 */

public class Tarea2 {
    // 1.imprimir una matriz
    // 2. sumar todos los numeros de una matriz
    // 3. Sumar los numeros de la diagonal de una matriz
    // 4. Dibujar en una matriz un espiral de numeros

    public static void main (String [] args){
        //1:
        int [][] matriz= {{2,5,3,7,5},{9,4,0,2,6}};
        String mensaje= imprimirUnaMatriz(matriz);
        System.out.println(mensaje);

        //2:
        int [][] matriz2={{2,5,7,3,6,9,4,6},{25,5,7,6,3,67,58,34},{2,5,87,43,65,67,8,56},{2,5,6,4,7,7,8,43}};
        int suma= sumarNumerosMatriz(matriz2);
        System.out.println(suma);

        //3:
        int [][] matriz3= {{2,3,4,6,6,4,7,54,5},{2,5,5,7,3,56,78,46,7},{25,43,35,58,34,66,364,6,7},{45,8,5,31,64,5,45,74,5},{23,32,23,56,79,5,35,3,96}};
        int suma2= sumarDiagonalMatriz(matriz3);

        //4:
        int [][] matriz4= new int[5][5];
        matriz4 = crearMatrizEspiral(matriz4);
        String matrizImpresa= imprimirUnaMatriz(matriz4);
        System.out.println("La matriz en espiral quedaría de la siguiente manera: \n"+matrizImpresa);
    }

    //1:
    public static String imprimirUnaMatriz(int [][] matriz){
        String mensaje="";
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                mensaje+=matriz[i][j]+",";
            }
            mensaje+="\n";
        }
        return mensaje;
    }

    //2:
    public static int sumarNumerosMatriz (int [][] matriz){
        int suma=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length;j++){
                suma+=matriz[i][j];
            }
        }
        return suma;
    }

    //3:
    public static int sumarDiagonalMatriz (int [][] matriz){
        int suma=0;
        for(int i=0; i<matriz.length; i++){
            suma+= matriz[i][i];
        }
        return suma;
    }

    //4:
    public static int[][] crearMatrizEspiral(int[][] matriz){
        int filas=matriz.length-1;
        int columnas=matriz[0].length-1;
        int total=matriz.length*matriz[0].length;
        int cont2=0; //maneja las columnas
        int cont=0; //manejas las filas
        int bot1=0; //controla el borde inferior de las filas
        int bot2 =0; //controla el borde inferior de las columnas
        int top1=filas; //controla el borde superior de las filas
        int top2=columnas; //controla el borde superior de las columas
        int i=0;
        while(i<total){ //controla que se pueda ejecutar que sigan existiendo casillas en la matriz
            cont=bot1;
            cont2=bot2;
            for(int j=0;j<=columnas;j++){ //de izquierda a derecha
                matriz[cont][cont2]=i;
                cont2++;
                i++;
            }
            filas--;
            bot1++;
            cont=bot1;
            cont2=top2;
            for(int j=0;j<=filas;j++){ //de arriba a abajo
                matriz[cont][cont2]=i;
                cont++;
                i++;
            }
            columnas--;
            top2--;
            cont=top1;
            cont2=top2;
            for(int j=0;j<=columnas;j++){ //de derecha a izquierda
                matriz[cont][cont2]=i;
                cont2--;
                i++;
            }
            filas--;
            top1--;
            cont=top1;
            cont2=bot2;
            for(int j=0;j<=filas;j++){ //de abajo a arriba
                matriz[cont][cont2]=i;
                cont--;
                i++;
            }
            columnas--;
            bot2++;
        }
        return matriz;
    }

}
