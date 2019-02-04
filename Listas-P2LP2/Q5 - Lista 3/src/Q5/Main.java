package Q5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Empregado c = new TrabalhadorHora();
        
        c.setNome(JOptionPane.showInputDialog("Nome: "));
        c.setCpf((Integer.parseInt(JOptionPane.showInputDialog("CPF: "))));
        c.setRg((Integer.parseInt(JOptionPane.showInputDialog("RG: "))));
        
        System.out.println("Nome: " + c.getNome()+ ", CPF: " + c.getCpf() + ", RG: " + c.getRg());
    }
    
}
