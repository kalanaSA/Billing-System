package bs;

import com.sun.org.apache.xpath.internal.operations.Number;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ParentBilling {
        
    public double Chrome;
    public double Copper;
    public double Plastic;
    public double Travel;
    public double Labour;
    public double cTax;
    
    
    public double pChrome=7.8;
    public double pCopper=5.5;
    public double pPlastic=3.5;
    public double pTravel=5.0;
    public double pLabour=45;
    public double pTax=0.9;
    public double pVAT=0.9;
    
    public double itemCost;
    
    
    //-----------------total cost of items----------------------------
    
    public double GetAmount(){
        
        itemCost = Chrome + Copper + Plastic + Travel+ Labour;
        return itemCost;
    
    }
    
    //--------------tax calculation-----------------------------------
    
    public double cFindTax(double cAmount){
        
        double FindTax = cAmount - (cAmount * pTax);
        return FindTax;
    
    }
    
    //--------------VAT calculation-----------------------------------
    
    public double cFindVAT(double cAmount){
        
        double FindVAT = cAmount - (cAmount * pVAT);
        return FindVAT;
    
    }
    
    //-----------------exit-------------------------------------------
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
    
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing Systems",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    
    }

    //------------Numbers only---------------------------------------
    
    public void NumbersOnly(java.awt.event.KeyEvent evt){
        
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
                ||(iNumber == KeyEvent.VK_BACK_SPACE)
                ||(iNumber == KeyEvent.VK_DELETE)){
            
            evt.consume();
        }
    }

    
    
}
