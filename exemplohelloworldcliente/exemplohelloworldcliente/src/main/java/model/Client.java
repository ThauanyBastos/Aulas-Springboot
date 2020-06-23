package model;

/**
 * @author Thauany Bastos
 * @version 1.0
 * @since 17/06/2020 - 15:57
 */
public class Client {

    private String nome;
    private String LastName;
    private double income;

    public Client() {
        this.income = 0.0;
    }

    /**
     *
     * @param nome Retorna o nome por parametro
     * @param lastName Retorna o sobrenome por parametro
     */
    public Client(String nome, String lastName) {
        this.nome = nome;
        LastName = lastName;
        this.income = 0.0;
    }

    /**
     *
     * @param nome Retorna o nome por parametro
     * @param lastName Retorna o sobrenome por parametro
     * @param income Retorna a renda por parametro
     */
    public Client(String nome, String lastName, double income) {
        this.nome = nome;
        LastName = lastName;
        this.income = income;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    /**
     *
     * @return a renda do cliente com 10% de acréscimo
     */
    public double calculateIncome() {
        return this.income * 1.10;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
             + "\nLastName: " + this.LastName
             + "\nIncome: " + this.income
             + "\n10%: " + this.calculateIncome();
    }
}
