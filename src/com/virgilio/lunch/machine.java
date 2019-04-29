package com.virgilio.lunch;


import java.util.Random;


public class machine {
    
    private int[] numeros = new int[300];
    private int numero;
    
    
    
    public void ordem(){
        
        Random r = new Random();
        for(int i=0; i<299; i++){
             numero = r.nextInt(300) + 1;
             for(int j=0; j<299; j++){
                   if(numero == numeros[j] && j != i){
                         numero = r.nextInt(300) + 1;
                   }else{
                        numeros[i] = numero;
                    }
                   }
                }
            }

    public int[] getNumeros() {
        
        return numeros;
        
    }
    
    public void gerar(){
        
         telaSaida telaCliente = new telaSaida();
      
           telaCliente.setVisible(true);
        
    }
     
    public void enviar(int num){
        
       
        
    }
    
    
    
}
