package Jogo;

 import java.io.*;
 import java.util.logging.Level;
 import java.util.logging.Logger;
 import sun.audio.*;

/* @author Lucas Nunes */
public class SonsJogo {

   public void play(String caminho) {
       
      InputStream in;
       
       try {     
     
            in = new FileInputStream(caminho);
            AudioStream audio; 
    
             try {       
         
                  audio = new AudioStream(in);
                  AudioPlayer.player.start(audio); 
         
                 } catch (IOException ex) {
                
                     Logger.getLogger(SonsJogo.class.getName()).log(Level.SEVERE, null, ex);
           
                   }

           } catch (FileNotFoundException ex) {
           
        Logger.getLogger(SonsJogo.class.getName()).log(Level.SEVERE, null, ex);
       
     }

   }

 }

