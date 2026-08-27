package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    /* Atributos */
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    /* Composições */
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    /* Composição do tipo tem-muitos, não se instancia no construtor, se instancia por padrão no atributo */

    /* Getters e Setters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    /* Construtores */
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        setName(name);
        setLevel(level);
        setBaseSalary(baseSalary);
        this.department = department;
    }

    /* Métodos */
    /* Como o trabalhador tem que ser associado a um contrato, é ilógico que o programa possa se alterar a lista de contratos dele, o
     * mais correto a se fazer é criar uma lista vazia, como explicado antes e criar métodos para que o usuário possa adicionar e remover
     * esses contratos para o trabalhador */
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    /* Calculo da "comissão" do trabalhador */
    /* A lógica para o cálculo é que o método retorne valor final do que o trabalhador irá receber, ou seja, o salário base + o
    * valor dos contratos em um mês específico */
    public Double income(int year, int month) {
        /* a soma será o salário base por padrão, então a variável soma assume o valor do salário base */
        double sum = baseSalary;
        /* trabalhando com Calendar, deve-se instanciar uma variável com o momento exato, apenas para podermos manipular as datas
        * posteriormente  */
        Calendar cal = Calendar.getInstance();
        /* foreach percorrendo os contratos associados ao funcionário */
        for (HourContract c : contracts) {
            /* ajustando o objeto Calendar para conter a data do contrato c */
            cal.setTime(c.getDate());
            /* Extraindo o ano do contrato */
            int c_year = cal.get(Calendar.YEAR);
            /* extraindo o mês do contrato, como o Calendar tem um array de meses, ele vai de 0 a 11, para ficar no padrão, é
             * necessário somar 1 ao valor, para percorrermos de 1 a 12 */
            int c_month = 1 + cal.get(Calendar.MONTH);
            /* Condição para validar se mês e o ano do contrato informado pelo usuário, corresponde ao mês e ano dos contratos */
            if (year == c_year && month == c_month) {
                /* Somando os valores dos contratos à variável sum, que continha o salário base */
                sum += c.totalValue();
            }
        }
        /* Devolvendo a soma do salário base + valores de contrato */
        return sum;
    }
}
