public class TestePessoa {
    public static void main(String args[]){
        PessoaFisica fulano = new PessoaFisica("Fulano de Tal");
        fulano.setIdade(25);
        System.out.println(fulano.getNome() + " tem "+ Mamifero.quantidadeDeOlhos + " olhos e " + fulano.getQuantidadeDePernas() + " pernas...");
        System.out.println(fulano.getNome()+ " tem "+fulano.getIdade()+ " anos...");
        PessoaJuridica dodos = new PessoaJuridica("Dodos Company");
        dodos.setIdade(169);
        System.out.println(dodos.getNome()+ " tem " +dodos.getIdade() + " anos...");
    }
}
