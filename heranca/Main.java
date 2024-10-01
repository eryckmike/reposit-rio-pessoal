public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();


        p1.setNome("Rafael");
        p2.setNome("Maria");
        p3.setNome("Ana");
        p4.setNome("Roberto");
        p1.setSexo("M");
        p4.setSexo("M");
        p2.setIdade(17);

        p2.setCurso("Informatica");
        p3.setSalario(1890.50f);
        p4.setSetor("Estoque");

        p3.receberAumentar(550.50f);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}