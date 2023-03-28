
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akmal
 */
public class batuGuntingKertas {
    public static void main(String[] args) {
        
        Random random = new Random ();
        int randNum = random.nextInt(3)+1;
        
        String pilihan = JOptionPane.showInputDialog("Masukkan Pilihan Batu/Gunting/Kertas : ");
        
        if (pilihan.equalsIgnoreCase("batu")){
            JOptionPane.showMessageDialog(null, "Kamu memilih batu");
            
            if (randNum == 1){
                JOptionPane.showMessageDialog(null, "Komputer memilih batu");
                JOptionPane.showMessageDialog(null, "SERI");
            }
            
            else if (randNum == 2){
                JOptionPane.showMessageDialog(null, "Komputer memilih gunting");
                JOptionPane.showMessageDialog(null,"KAMU MENANG");
            }    
            
            else if (randNum == 3){
                JOptionPane.showMessageDialog(null, "Komputer memilih kertas");
                JOptionPane.showMessageDialog(null, "KAMU KALAH");
            }
        }
        
        else if (pilihan.equalsIgnoreCase("gunting")){
            JOptionPane.showMessageDialog(null, "Kamu memilih gunting");
            
            if (randNum == 1){
                JOptionPane.showMessageDialog(null, "Komputer memilih batu");
                JOptionPane.showMessageDialog(null, "KAMU KALAH");
            }
            
            else if (randNum == 2){
                JOptionPane.showMessageDialog(null, "Komputer memilih gunting");
                JOptionPane.showMessageDialog(null, "SERI");
            }    
            
            else if (randNum == 3){
                JOptionPane.showMessageDialog(null, "Komputer memilih kertas");
                JOptionPane.showMessageDialog(null, "KAMU MENANG");
            }
        }
        
        else if (pilihan.equalsIgnoreCase("kertas")){
            JOptionPane.showMessageDialog(null, "Kamu Memilih kertas");
            
            if (randNum == 1){
                JOptionPane.showMessageDialog(null, "Komputer memilih batu");
                JOptionPane.showMessageDialog(null, "KAMU MENANG");
            }
            
            else if (randNum == 2){
                JOptionPane.showMessageDialog(null, "Komputer memilih gunting");
                JOptionPane.showMessageDialog(null, "KAMU KALAH");
            }    
            
            else if (randNum == 3){
                JOptionPane.showMessageDialog(null, "Komputer memilih kertas");
                JOptionPane.showMessageDialog(null, "SERI");
            }
                
        }  
        
        else {
            JOptionPane.showMessageDialog(null, "TIDAK ADA INPUT!!!","ALERT",JOptionPane.WARNING_MESSAGE);
        }
    }
}
