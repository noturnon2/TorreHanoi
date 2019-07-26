/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cristiano Soares, Luiz Marques e Ricardo Reis
 */
public class CalculoHanoi {
    private int n, inicio, fim, aux;

      public CalculoHanoi(int n) {
        this.setN(n);
        this.setInicio(inicio);
        this.setFim(fim);
        this.setAux(aux);
    }
     /**
     * @param n the n to set
     */ 
     private void setN(int n) {
     this.n = n>1?n:1;     
    }
     
    /**
     * @param inicio the n to set
     */ 
    private void setInicio(int inicio){
     this.inicio = 1;
     }
    
    /**
     * @param fim the n to set
     */ 
    private void setFim(int fim){
     this.fim = 3; 
     }
    
    /**
     * @param aux the n to set
     */
    private void setAux(int aux){
     this.aux = 2;
     }     
     
    public int getN() {
        return n;
    }
    
    private int getInicio() {
        return inicio;
    }
    
    private int getFim() {
        return fim;
    }
    
    private int getAux() {
        return aux;
    }
      
    private String moverDisco(int inicio, int fim) {
       
        return ("\n Vá do pino: " + inicio + " ---> para o pino: " + fim + "<br>");
    }
    private String moverPino(int n, int inicio, int fim, int aux) {
        String  retorno = "";
                
        if (n == 1) {
            //return moverDisco(inicio, fim);
            retorno += moverDisco(inicio, fim);
        }else{
                
            retorno += moverPino(n-1, inicio, aux, fim);
            retorno += moverDisco(inicio, fim);
            retorno += moverPino(n-1, aux, fim, inicio);
            
            }    
        //return moverDisco(inicio, fim);
        return retorno;
        
    }
       /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return moverPino(this.getN(), this.getInicio(), this.getFim(), this.getAux());
    }
}