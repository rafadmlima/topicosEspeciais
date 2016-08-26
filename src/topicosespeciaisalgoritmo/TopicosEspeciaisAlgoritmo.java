/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicosespeciaisalgoritmo;

/**
 *
 * @author Rafa
 */
public class TopicosEspeciaisAlgoritmo {
    private Double s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
    }
    
   
   
    
    public Double entropiaS(int pMais, int pMenos){
        
        
        s = ((-pMais) * Math.log(pMais) / Math.log(2)) + ((-pMenos) * Math.log(pMenos) / Math.log(2));
        
        
        return s;
    
    }
    
    
    
}
