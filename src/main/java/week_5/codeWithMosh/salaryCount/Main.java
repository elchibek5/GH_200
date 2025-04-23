package week_5.codeWithMosh.salaryCount;

public class Main {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSslary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSslary + (extraHours * hourlyRate);
    }
}
