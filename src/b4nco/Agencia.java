/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4nco;

/**
 *
 * @author grazi
 */
public class Agencia {

     private int Numero;
     private String Endereco;
   
    //cadastrando
    public Agencia(){
        System.out.println("\n CADASTRO DA AGENCIA ");
        Numero = Input.readInt("Digite o numero da agencia: ");
        Endereco = Input.readString("Digite o endereco: ");
        System.out.println("CASTRADO!!");
    }
    
    public int getAgencia(){
        return getNumero();
    }
    
    public void ImprimeAgencia(){
        System.out.println("Agencia: "+getNumero());
    }

    /**
     * @return the Numero
     */
    public int getNumero() {
        return Numero;
    }

    /**
     * @param Numero the Numero to set
     */
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}
   