package Q4;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        novo n = new novo();
        
        n.setPreco((Float.parseFloat(JOptionPane.showInputDialog("Preço: "))));
        n.setEnredeço((JOptionPane.showInputDialog("Endereço: ")));
        n.setAdPreco((Float.parseFloat(JOptionPane.showInputDialog("Adicional: "))));
                        
        velho v = new velho();
        
        v.setPreco((Float.parseFloat(JOptionPane.showInputDialog("Preço: "))));
        v.setEnredeço((JOptionPane.showInputDialog("Endereço: ")));
        v.setDesPreco((Float.parseFloat(JOptionPane.showInputDialog("Desconto: "))));
        
        System.out.println(n.toString());
        System.out.println(v.toString());
        
        
    }
}
