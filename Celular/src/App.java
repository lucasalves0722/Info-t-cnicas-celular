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

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9F;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi M1 11 Pro";
        celularC.tamanhoTela = 6.81F;
        celularC.espacoArmazenamento = 128;
        celularC.sistemaOperacional = "Android";

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.2f, com %dgb e SO %s\n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);
    }
}
