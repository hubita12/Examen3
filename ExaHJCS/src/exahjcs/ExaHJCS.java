/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exahjcs;

/**
 *
 * @author Laboratorio
 */
public class ExaHJCS {
    
    public static int[][] trans24HJCS(int xy, int num) {
        int matriz[][] = new int [xy][xy];
        int y=0;
        for (int x = matriz.length-1; x >= 0; x--) {
            if(y>=0/*y!=-1*/){
                for (y = matriz[0].length-1; y >= 0; y--) {
                    matriz[y][x] = num++;
                }
            }else{
                for (y = 0; y < matriz[0].length; y++) {
                    matriz[y][x] = num++;
                }
            }
        }
        return matriz;
}
    
    public int [][] transExtraHJCS(int xy, int num){
        int matriz[][] = new int [xy][xy];
        int y=0;
        for (int x = matriz.length-1; x >= 0; x--) {
            if(y>=0/*y!=-1*/){
                for (y = 0; y < matriz[0].length; y++) {
                    matriz[y][x] = num++;
                }
            }else{
                for (y = matriz[0].length-1; y >= 0; y--) {
                    matriz[y][x] = num++;
                }
            }
        }
        return matriz;
    }
    
    public int [][] trans27HJCS(int xy, int num){
        int matriz[][] = new int [xy][xy];
        int y=0;
        for (int x = matriz.length-1; x >= 0; x--) {
            if(y>=0/*y!=-1*/){
                for (y = matriz[0].length-1; y >= 0; y--) {
                    matriz[x][y] = num++;
                }
            }else{
                for (y = 0; y < matriz[0].length; y++) {
                    matriz[x][y] = num++;
                }
            }
        }
        return matriz;
    }
    
    public int [][] trans35HJCS(int xy, int num){
        int matriz[][] = new int [xy][xy];
        int x,x1,x2,y,y1,y2;
        for (x = matriz.length-1; x >= matriz.length/2; x--) {
            for (y = (xy-1)-x; y <= x; y++) {
                matriz[x][y] = num++;
            }
            for (x1 = y-2; x1 >= (xy-1)-x; x1--) {
                matriz[x1][x] = num++;
            }
            for (y1 = y-2; y1 >= (xy-1)-x; y1--) {
                matriz[x1+1][y1] = num++;
            }
            for (x2 = y1+2; x2 < y-1; x2++) {
                matriz[x2][y1+1] = num++;
            }
        }
        return matriz;
    }
    
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!= -1){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        ExaHJCS obj = new ExaHJCS();
        obj.imprimirMatriz(obj.transExtraHJCS(5, 0));
        //para poder imprimir el algoritmo debe cambiar el nombre del objeto
        
    }
    
}
