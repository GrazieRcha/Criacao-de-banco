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
public class aMain {
    
    
    private Agencia vAgencia[];
    private int CAgencia[];
    private int TAgencia;
    private int qntdAgencia;
    private Cliente vCliente[];
    private int qntdCliente;
    private int TCliente;
    private String ContaNome[];
    private int CCPF[];
    private int NConta[];
    private int ContaTelefone[];
    private int qntdConta; 
    private int TConta;
    
    
    public aMain(){
        //criação do banco
        System.out.println(" CRIAR BANCO ");
        TAgencia = Input.readInt("Total de agencias cadastradas no banco: ");
        TCliente = Input.readInt("Total de Clientes cadastradas no banco: ");
        TConta = Input.readInt("Total de Contas cadastradas no banco: ");
        vAgencia = new Agencia[TAgencia];
        qntdAgencia = 0;
        vCliente = new Cliente[TCliente];
        qntdCliente = 0;
        ContaNome = new String [TConta];
        CCPF = new int [TConta];
        CAgencia = new int [TConta];
        NConta = new int [TConta];
        ContaTelefone = new int [TConta];
        qntdConta = 0;
        System.out.println("Execuçao concluida, BEM VINDO AO b4nco B3!");
    }
    
    public void Conta(){
        int Agencia, CPF ;
        boolean add = false;
        
        System.out.println("\n   CADASTRO DE CONTA   ");
         CPF = Input.readInt("Numero do CPF: ");
         Agencia = Input.readInt("Numero da Agencia: ");
   
        for(int i=0;i<qntdAgencia;i++){
            if(vAgencia[i].getAgencia() == Agencia){
                for(int j=0;j<qntdCliente;j++){
                    if(vCliente[j].getCPF() == CPF){
                        //CADASTRANDO A CONTA
                        System.out.println("  CADASTRANDO ");
                        System.out.println("Nome do Cliente: "+vCliente[j].getNome());
                        System.out.println("Numero do CPF: "+vCliente[j].getCPF());
                        System.out.println("Numero da Agencia: "+vAgencia[i].getAgencia());
                        NConta[qntdConta] = Input.readInt("Numero da Conta: ");
                        ContaNome[qntdConta] = vCliente[j].getNome();
                        CCPF[qntdConta] = vCliente[j].getCPF();
                        CAgencia[qntdConta] = vAgencia[i].getAgencia();
                        ContaTelefone[qntdConta] = vCliente[j].getTelefone();
                        qntdConta++;
                        add = true;
                    }
                }
            }
        }
        if(add == false){
            //AGENCIA OU CPF ERRADO
            System.out.println("Campo invalido!");
        }
        
    }
    public void adicionarCliente(){
        vCliente[qntdCliente] = new Cliente();
        qntdCliente++;
    }
    
    public void adicionarAgencia(){
        vAgencia[qntdAgencia] = new Agencia();
        qntdAgencia++;
    }
    
    
    public void ContasporAgencia(){
        int ContasporAgencia;
        boolean Encontrou = false;
        // procurando o numero conta e o nome cliente
        System.out.println("\n CONSULTANDO "); 
        ContasporAgencia = Input.readInt("Informe o numero da Agencia: ");
        for(int i=0;i<qntdConta;i++){
            if(CAgencia[i] == ContasporAgencia){
                System.out.println(" Nome do Cliente: "+ContaNome[i] + "Numero da Conta: "+NConta[i]);
                Encontrou = true;
            }
        }
        if(Encontrou == false){
            // Não foi encontrado 
            System.out.println("Falha na busca!");
        }
    }
    
    public void ContasporCPF(){
        int ContasporCPF;
        //CONSULTA DE NUMERA DE AGENCIA E CONTA POR CPF
        boolean Encontrou = false;
        // consulta por cfp 
        System.out.println("\n CONSULTANDO "); 
        ContasporCPF = Input.readInt("Informe o numero do CPF: ");
        for(int i=0;i<qntdConta;i++){
            if(CCPF[i] == ContasporCPF){
                System.out.println("Numero da Agencia: "+CAgencia[i]+" Numero da Conta: "+NConta[i]);
                Encontrou = true;
            }
        }
        if(Encontrou == false){
            // Não encontrou o CPF
            System.out.println("Campo nao encontrado");
        }
    }
    
    public void ClientesporAgencia(){
        // CONSULTA DE NOME E TELEFONE 
        int ClienteporAgencia;
        boolean Encontrou = false;
        System.out.println("\n CONSULTANDO "); 
        ClienteporAgencia = Input.readInt("Qual a Agencia: ");
        for(int i=0;i<qntdConta;i++){
            if(CAgencia[i] == ClienteporAgencia){
                System.out.println("Nome do Cliente: "+ContaNome[i]+" Telefone do Cliente: "+ContaTelefone[i]);
                Encontrou = true;
            }
        }
        if(Encontrou == false){
            System.out.println(" No exist!!!");
        }
    }
    
    public void menu(){
        int escolha=1;
        
        while(escolha !=0){
        
            System.out.println("\n  MENU   ");
            System.out.println("1 - Cadastrar uma conta?");
            System.out.println("2 - Cadastrar um Cliente?");
            System.out.println("3 - Cadastrar uma Agencia?");
            System.out.println("4 - Listagem Cliente por Agencia.");
            System.out.println("5 - Listagem Contas por Cliente.");
            System.out.println("6 - Listagem Contas por Agencia.");
            System.out.println("0 - SAIR ");
            escolha = Input.readInt("O que deseja: ");
            switch(escolha){
                
                case 0:
                    System.out.println("Coming Out"); 
                break;
                
                case 1:
                    Conta();
                break;
                
                case 2 :
                    adicionarCliente();
                break;
                
                case 3:
                    adicionarAgencia();
                break;
                
                case 4:
                    ClientesporAgencia();
                break;
                
                case 5:
                    ContasporCPF();
                break;
                
                case 6:
                    ContasporAgencia();
                    
                default:
                    System.out.println("Escolha nao valida!");
            }
        }
    }
    
    public static void main(String Args[]){
        aMain obj;
        obj = new aMain();
        obj.menu();
    }

}