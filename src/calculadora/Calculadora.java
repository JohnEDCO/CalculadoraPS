/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author JOHN EDWAR
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    private double valorMemoria=0;
    
    private String respuesta;
    private double numero=0;
    
    public void operacionMemoria(int m, String numero){
        
        switch(m){
            
            case 1: 
                valorMemoria+=Double.parseDouble(numero);
                break;
            
            case 2:
                valorMemoria-=Double.parseDouble(numero);
                break;
             
            case 3:
                valorMemoria =0;
                break;
                
            default:
                break;
        }
                
    }
    
    public double getValorMemoria (){
        return valorMemoria;
    }
    
    public void setValorMemoria(String dato){
        
        valorMemoria =Double.parseDouble(dato);
    }
    
    public String operaciones(double numeroEs, String signo){
        
            switch (signo){
                
                case "+": 
                     numero+= numeroEs;
                     respuesta = String.valueOf(numero);
                     System.out.println("resultado"+respuesta);
                     break;
                     
                case "-": 
                     numero-= numeroEs;
                     respuesta = String.valueOf(numero);
                     System.out.println("resultado"+respuesta);
                     break;
                     
                case "*": 
                     numero*= numeroEs;
                     respuesta = String.valueOf(numero);
                     System.out.println("resultado"+respuesta);
                     break; 
                     
                case "/": 
                     numero/= numeroEs;
                     respuesta = String.valueOf(numero);
                     System.out.println("resultado"+respuesta);
                     break;  
                 
                case "%": 
                     numero%= numeroEs;
                     respuesta = String.valueOf(numero);
                     System.out.println("resultado"+respuesta);
                     break;  
                     
                case "^": 
                      double elevadoCuadrado=Math.pow(numeroEs,2);
                      numero=elevadoCuadrado;
                      respuesta =String.valueOf(elevadoCuadrado) ;
                     break; 
                     
                case "√": 
                     double raiz=Math.sqrt(numeroEs);
                     numero=raiz;
                      respuesta =String.valueOf(raiz) ;
                      System.out.println("respuesta: "+respuesta);
                     break;   
                     
                case "1/x": 
                      double sobreX=1/numeroEs;
                      numero=sobreX;
                      respuesta =String.valueOf(sobreX) ;
                     break;      
            }
            return respuesta;
        }
    
    
     public  boolean existePunto(String cadena){
        boolean resultado;
        
        resultado= false;
        
        for (int i=0; i< cadena.length(); i++){
            if(cadena.substring(i, i+1).equals(".")){ // substring me busca desde el inico del ciclo y se va incrementado de 1 y me compara si tiene un punto
            resultado= true; // significa que si lo encuentra un punto se vuelve true  
            break; // si encuentra uno se termina
             }
        }
       
        
        return resultado;
    }
     
    public void setNumero (double numero){
        this.numero = numero;
    }
    public double getNumero(){
        return numero;
    }
     public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }
    public String getRespuesta(){
        return respuesta;
    }
   
}
