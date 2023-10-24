public class PessoaFisica extends Pessoa implements Mamifero {

    public PessoaFisica(String nome) {
        super(nome);
    }

    @Override
    public int getQuantidadeDePernas() {
        return 2;
    }
    
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
