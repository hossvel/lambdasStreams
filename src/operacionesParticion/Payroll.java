package operacionesParticion;

class Payroll
{
    private String employee;
    private Integer income;
 
    public Payroll(String employee, Integer income)
    {
        this.employee = employee;
        this.income = income;
    }
 
    public Integer getIncome() {
        return income;
    }
 
    // otros getters y setters
 
    @Override
    public String toString() {
        return "[" + employee + ", " + String.valueOf(income) + "]";
    }
 
    public static Payroll max(Payroll x, Payroll y) {
        return x.getIncome() > y.getIncome() ? x : y;
    }
}