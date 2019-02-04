package Q2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Empregado e = new Empregado();
        
        e.setNome(JOptionPane.showInputDialog("Nome: "));
        e.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
        
        Gerente g = new Gerente();
        
        g.setNome(JOptionPane.showInputDialog("Nome: "));
        g.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
        g.setDepartamento(JOptionPane.showInputDialog("Departamento: "));
        
        Vendedor v = new Vendedor();
        
        v.setNome(JOptionPane.showInputDialog("Nome: "));
        v.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
        v.setComissao(Float.parseFloat(JOptionPane.showInputDialog("Comissao: ")));
        
        
        System.out.println(e.toString());
        System.out.println(g.toString());
        System.out.println(v.toString());
        
    }
    
}
