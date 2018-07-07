/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cri1;

/**
 *
 * @author Lalith
 */
public class cri1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cri ci=new cri();
        ci.setVisible(true);
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(50);
                ci.l.setText(Integer.toString(i)+"%");
                crii cii=new crii();
                if(i==100)
                {
                    ci.dispose();
                    cii.show();
                }
            }
        }catch(Exception e){
            
        }
                
        
        // TODO code application logic here
    }
    
}
