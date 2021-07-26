import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private List<Morador> moradores = new ArrayList<>(); //Composição de morador
    private Funcionario funcionario; //Composição de funcionario

    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, List<Morador> moradores, Funcionario funcionario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.moradores = moradores;
        this.funcionario = funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", valorAluguel=" + valorAluguel +
                ", moradores=" + moradores +
                ", funcionario=" + funcionario +
                '}';
    }
}
