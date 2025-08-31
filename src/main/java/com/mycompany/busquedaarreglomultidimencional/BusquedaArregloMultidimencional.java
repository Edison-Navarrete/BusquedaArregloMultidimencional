/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedaarreglomultidimencional;

/**
 *
 * @author Edison Navarrete
 */
public class BusquedaArregloMultidimencional {

    public static void main(String[] args) {
        //Escribe un programa que incluya una matriz bidimensional
        //(puede ser una matriz pequeña de 3x3) con valores numéricos.
        int [][] matriz ={
            {7,3,6},//fila 0
            {4,2,1},//fila 1
            {5,8,9}//fila 2
        };
         int busqueda=8;
         
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(""+matriz[i][j]);
            }
            System.out.println( " ");
        }
        
        System.out.println("valor a buscar:"+ busqueda);
        
        // Implementa una función que realice una búsqueda en la matriz para 
        //encontrar un valor específico que definas.
       
        int[] pos=busqueda(matriz,busqueda);
        
         //muestra un mensaje que diga si se encontro o no  el valor y su posicion.
         //si encuentra el valor en la matriz mostrara la columna y fila donde se encuenta
         
    
   
        
        if(pos[0]!=-1){
            System.out.println("valor encrontrado");
            System.out.println("fila:"+pos[0]+", columna:"+pos[1]);
        }else{
            System.out.println("valor no encontrado");
        }
        
    }
    
    //caso contrario devolvera la posicion -1 y -1
    
    static int[] busqueda ( int [][] matriz,int valor){
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
              if (matriz[i][j]==valor){
                return new int[]{i,j};
              }
            }
        }
        return new int[]{-1,-1};
        
    }
}
