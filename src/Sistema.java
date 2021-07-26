import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static Funcionario cadastrarFuncionario(Funcionario funcionario){
        IO.mostrarTexto("Digite o nome do funcionario: ");
        String nomeFuncionario = IO.digitarValores().nextLine();
        IO.mostrarTexto("Digite o cpf do funcionario: ");
        String cpfFuncionario = IO.digitarValores().nextLine();
        funcionario.setNome(nomeFuncionario);
        funcionario.setCpf(cpfFuncionario);
        return funcionario;
    }

    public static List<Morador> cadastrarMoradores(){
        List<Morador> moradores = new ArrayList<>();
        IO.mostrarTexto("Digite a quantidade de moradores: ");
        int quantidadeDeMoradores=IO.digitarValores().nextInt();
        for (int contador=0; contador<quantidadeDeMoradores; contador++) {
           IO.mostrarTexto("Digite o nome do morador: ");
            String nomeMorador = IO.digitarValores().nextLine();
            IO.mostrarTexto("Digite o cpf do morador: ");
            String cpfMorador = IO.digitarValores().nextLine();
            Morador morador = new Morador();
            morador.setNome(nomeMorador);
            morador.setCpf(cpfMorador);
            moradores.add(morador);
        }

        return moradores;
    }

    public static void cadastrarImovel(){
        Funcionario funcionario = new Funcionario();
        Imovel imovel = new Imovel();
        IO.mostrarTexto("Digite o endereço do imovel: ");
        String enderecoImovel = IO.digitarValores().nextLine();
        IO.mostrarTexto("Digite o valor do aluguel: ");
        double valorAluguel = IO.digitarValores().nextDouble();
        imovel.setEndereco(enderecoImovel);
        imovel.setValorAluguel(valorAluguel);
        imovel.setFuncionario(cadastrarFuncionario(funcionario));
        imovel.setMoradores(cadastrarMoradores());
        ListaDeImoveis.adicionarImovelNaLista(imovel);
    }


    public static void menuOpcoes(){

        IO.mostrarTexto("1 - Cadastrar dados imovel");
        IO.mostrarTexto("2 - Exibir imoveis cadastrados");
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
                cadastrarImovel();
                menuOpcoes();
                break;
            case 2:
                System.out.println("---- Exibir Imoveis cadastrados -----");
                ListaDeImoveis.mostrarListaDeImoveis();
                menuOpcoes();
                break;

        }
    }

    }
}
