public class Professor extends Pessoa {
    private String especializacao;
    private float salario;

    public void receberAumentar(float aumento) {
        this.salario += aumento;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
