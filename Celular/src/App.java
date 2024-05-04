public class App {
    public static void main(String[] args) throws Exception {
        // Iphone 12, tela de 6.1", 256gb
        // Galaxy Note 20 Ultra, tela de 6.9", 256gb
        // Xiaomi M1 11 Pro, tela de 6.81", 128gb

        // Como criar uma variavel?
        // <tipoVariavel> nomeVariavel = valor;
        
        // Declarando um objeto do tipo celular = Instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1F;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "iOS";
    }
}
