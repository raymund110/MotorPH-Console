package com.motorph;

public class SalaryDeduction {

    private double basicSalary;

    private double sssdeduction() {
        final int maxContribution = 25000;
        if ((int) Math.round(basicSalary) < maxContribution) {
            return basicSalary * 0.045;
        }
        return maxContribution * 0.045;
    }

    private double withholdingTax() {
        double withHoldingTax = 0;
        if (basicSalary > 20833 && basicSalary <= 33333) {
            withHoldingTax = (basicSalary - 20833) * 0.15;
        } else if (basicSalary >= 33333 && basicSalary <= 66667) {
            withHoldingTax = 1875 + (basicSalary - 33333) * 0.2;
        } else if (basicSalary >= 66667 && basicSalary <= 166667) {
            withHoldingTax = 8541 + (basicSalary - 66667) * 0.25;
        } else if (basicSalary >= 166667 && basicSalary <= 666667) {
            withHoldingTax = 33541 + (basicSalary - 166667) * 0.3;
        } else if (basicSalary > 666667) {
            withHoldingTax = 183541 + (basicSalary - 666667) * 0.35;
        }
        return withHoldingTax;
    }

    private double pagibigDeduction() {
        final double minimunCompensation = 1500;
        if (basicSalary > minimunCompensation) {
            return basicSalary * 0.02;
        }
        return basicSalary * 0.01;
    }

    private double philHealthDeduction() {
        return basicSalary * 0.05;
    }

    public double totalSalaryDeductions(double basicSalary) {
        this.basicSalary = basicSalary;
        return sssdeduction() + pagibigDeduction() + philHealthDeduction() + withholdingTax();
    }
}
