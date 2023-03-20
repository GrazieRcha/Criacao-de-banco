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

public class Cliente{

    private String nome; 
    private int Telefone;
    private int cpf;
    private int cpfInd;
    
   //cadastro cliente
    
    Cliente(){
        int Escolha;
        System.out.println("\n  CADASTRO DE CLIENTE ");
        nome = Input.readString("Nome: ");
        Telefone = Input.readInt("Telefone : ");
        cpf = Input.readInt("Informe o CPF: ");
        Escolha = Input.readInt("Foi por indicação? 1 - sim | 2 - Nao: ");
        if(Escolha == 1){
            cpfInd = Input.readInt("Digite o cpf da pessoa que indicou: ");
        }
        System.out.println("CADASTRO REALIZADO COM SUCESSO!!!");
    }
    
    /**
     * @param nome the nome to set
     */
    private void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param Telefone the Telefone to set
     */
    private void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the cpf
     */
    private int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    private void setCpf(int cpf) {
        this.cpf = cpf;
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getCPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}       
         
