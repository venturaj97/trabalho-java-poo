public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa("Antonio Junior", 90);
        Pessoa pessoaB = new Pessoa("Antonio Junior", 90);
        Pessoa pessoaC = new Pessoa("João", 28);

        System.out.println("--- Demonstração do método toString() ---");
        System.out.println("Pessoa A: " + pessoaA);
        System.out.println("Pessoa C: " + pessoaC);

        System.out.println("\n--- Demonstração do método equals() ---");
        boolean A_eh_igual_B = pessoaA.equals(pessoaB);
        System.out.println("Pessoa A é igual a Pessoa B? " + A_eh_igual_B); // true

        boolean A_eh_igual_C = pessoaA.equals(pessoaC);
        System.out.println("Pessoa A é igual a Pessoa C? " + A_eh_igual_C); // false

        System.out.println("\n--- Demonstração do método hashCode() ---");
        int hashCodeA = pessoaA.hashCode();
        int hashCodeB = pessoaB.hashCode();
        int hashCodeC = pessoaC.hashCode();

        System.out.println("HashCode de Pessoa A: " + hashCodeA);
        System.out.println("HashCode de Pessoa B: " + hashCodeB);
        System.out.println("HashCode de Pessoa C: " + hashCodeC);

        if (A_eh_igual_B) {
            System.out.println("Como Pessoa A é igual a Pessoa B, seus hashCodes são iguais? " + (hashCodeA == hashCodeB)); // true
        }

        if (!A_eh_igual_C) {
            System.out.println("Como Pessoa A é diferente de Pessoa C, seus hashCodes são diferentes? " + (hashCodeA != hashCodeC)); // Provavelmente true
        }
    }
}