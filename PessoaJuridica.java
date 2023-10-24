public class PessoaJuridica extends Pessoa{

    public PessoaJuridica(String nome) {
        super(nome);
    }
    
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
