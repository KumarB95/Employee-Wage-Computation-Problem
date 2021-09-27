package com.bridgelabz;

class CompanyEmpWage {

    public final String company;
    public final int WAGE_PER_HOUR;
    public final int DAYS_IN_MONTH;
    public int maxHourPerMonth;
    public int wageForMonth;

    public CompanyEmpWage(String company,int WAGE_PER_HOUR,int DAYS_IN_MONTH,int maxHourPerMonth){
        this.company=company;
        this.WAGE_PER_HOUR=WAGE_PER_HOUR;
        this.DAYS_IN_MONTH=DAYS_IN_MONTH;
        this.maxHourPerMonth=maxHourPerMonth;
    }
    public void setTotalEmpWage(int wageForMonth){
        this.wageForMonth=wageForMonth;
    }
    @Override
    public String toString(){
        return "Empolyee wages for "+company+" is :"+wageForMonth;
    }
}

