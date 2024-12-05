/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;
import java.rmi.Naming;
import pacote.RmiInterface;
import javax.swing.JOptionPane;

/**
 *
 * @author admlab
 */
public class Client {
    public static void main(String[] args){
        try{
            RmiInterface objRmi = (RmiInterface)Naming.lookup("rmi://127.0.0.1:6666/Servidor");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro"+ e.getMessage());
        }
    }
}
