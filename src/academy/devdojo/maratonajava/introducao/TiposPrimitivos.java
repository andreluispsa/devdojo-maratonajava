package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        int age = 18;
        boolean isActive = true;
        System.out.println("Idade: " + age + " anos");
        System.out.println("Ativo: " + isActive);

        int ageInt = 20;
        long largeNumber = 100000L;
        double salaryDouble = 2000.50;
        float salaryFloat = 2500.50F;
        byte ageByte = 20;
        short ageShort = 20;
        boolean isValid = true;
        char genre = 'M';
        char character = 65; // irá transformar o valor para a tabela ascii
        char characterUnicode = '\u0041'; //irá transformar o valor para a tabela unicode

        System.out.println("Caractere 65 na tabela ascii: "+character);
        System.out.println("Caractere u0041 na tabela unicode: "+characterUnicode);

        String name = "Carlos Eduardo da Silva de Macedo"; // String NÃO É um tipo primitivo, mas sim uma classe

        System.out.println("Nome: "+name);

    }
}
