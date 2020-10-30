/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Maritza
 */
public class algoritmoDijkstra {
   
    public void AlgDijkstra(int[][] tablaMod, int n, int[][] tablaEnr){
        int pos=HallarMenor(tablaMod,n);
        tablaMod[pos][3]=1;
        for(int i=0;i<n;i++){
            if(tablaEnr[pos][i]!=1000)
            {                    
                if(tablaEnr[pos][i]+tablaMod[pos][1]<tablaMod[i][1])
                {
                    tablaMod[i][1]= tablaEnr[pos][i] + tablaMod[pos][1];
                    tablaMod[i][2]=pos;                                            
                }
            }
        }
    }
    
    public int HallarMenor(int[][] tablaEnr, int n){
        int menor=1000;
        int pos=10;
        for(int i=0; i<n; i++)
        {
            if(tablaEnr[i][1]<= menor && tablaEnr[i][3]!=1)
            {
              menor= tablaEnr[i][1];
              pos=i;
            }  
        }
        return pos;
    }
}
