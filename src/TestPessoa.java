public class TestPessoa {
    public static void main(String[] args) {
        //instâncias de Pessoa
        Pessoa pessoa1 = new Pessoa("Antonio Junior", 90);
        Pessoa pessoa2 = new Pessoa("João Victor", 28);
        Pessoa pessoa3 = new Pessoa("Antonio Junior", 90);

        System.out.println("## Testando o método toString():");
        System.out.println("Pessoa 1: " + pessoa1.toString());
        System.out.println("Pessoa 2: " + pessoa2);
        System.out.println("Pessoa 3: " + pessoa3);

        System.out.println("\n## Testando o método equals():");
        System.out.println("pessoa1.equals(pessoa2)" + pessoa1.equals(pessoa2));       // false
        System.out.println("pessoa1.equals(pessoa3)" + pessoa1.equals(pessoa3));      // true


        System.out.println("\n## Testando o método hashCode():");
        System.out.println("HashCode Pessoa 1: " + pessoa1.hashCode());
        System.out.println("HashCode Pessoa 2: " + pessoa2.hashCode());
        System.out.println("HashCode Pessoa 3: " + pessoa3.hashCode()); // Deve ser igual ao de pessoa1

        if (pessoa1.equals(pessoa3)) {
            System.out.println("\n## Testando o método hashCode() com equals():");
            System.out.println("HashCode Pessoa 1: " + pessoa1.hashCode());
            System.out.println("HashCode Pessoa 3: " + pessoa3.hashCode());
            System.out.println("São iguais? " + (pessoa1.hashCode() == pessoa3.hashCode()));
        }

        if (!pessoa1.equals(pessoa2)) {
            System.out.println("\nHashCode Pessoa 1: " + pessoa1.hashCode());
            System.out.println("HashCode Pessoa 2: " + pessoa2.hashCode());
            System.out.println("São iguais? " + (pessoa1.hashCode() == pessoa2.hashCode()));
        }
    }
}