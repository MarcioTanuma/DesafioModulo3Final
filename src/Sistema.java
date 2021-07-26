import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private static Funcionario funcionario = new Funcionario();
    private static List<Morador> moradores = new ArrayList<>(); // Continuar Cadastro de Moradores

    public static void cadastrarFuncionario(){
        IO.mostrarTexto("Digite o nome do funcionario: ");
        String nomeFuncionario = IO.digitarValores().next();
        IO.mostrarTexto("Digite o cpf do funcionario: ");
        String cpfFuncionario = IO.digitarValores().next();
        funcionario.setNome(nomeFuncionario);
        funcionario.setCpf(cpfFuncionario);
    }

    public static void cadastrarMoradores(){

    }

    public static void menuOpcoes(){
        IO.mostrarTexto("1 - Cadastrar dados imovel");
        IO.mostrarTexto("2 - Cadastrar moradores");
        IO.mostrarTexto("3 - Cadastrar Funcionario");
        IO.mostrarTexto("4- Exibir imoveis cadastrados");
        IO.mostrarTexto("0- Sair do programa");
        opcoes();
    }


    public static void opcoes(){
        int opcao = 99;
    while (opcao!=0) {
        opcao = IO.digitarValores().nextInt();
        switch (opcao) {
            case 1:
                System.out.println("---- Cadastrar Imovel -----");

                break;
            case 2:
                System.out.println("---- Cadastrar Moradores -----");

                break;
            case 3:
                System.out.println("---- Cadastro de funcionarios -----");
                cadastrarFuncionario();
                menuOpcoes();
                break;
            case 4:
                System.out.println("---- Exibir Imoveis cadastrados -----");

                break;
        }
    }

    }
}
