package Q1;


import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        
        ingresso i = new ingresso();
        i.setValor((Float.parseFloat(JOptionPane.showInputDialog(""))));
                        
        ingressoVIP v = new ingressoVIP();
        v.setValorAd(i.getValor());
        v.setValor(Float.parseFloat(JOptionPane.showInputDialog("")));
        
        System.out.println(i.toString());
        System.out.println(v.toString());
        
        
    }

}
