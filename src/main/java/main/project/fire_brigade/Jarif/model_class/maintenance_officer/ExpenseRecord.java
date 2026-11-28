package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

public class ExpenseRecord {

    private String category, month;
    private int year, serviceCount;
    private double totalCost;


    public ExpenseRecord(String category, String month, int year, int serviceCount, double totalCost) {
        this.category = category;
        this.month = month;
        this.year = year;
        this.serviceCount = serviceCount;
        this.totalCost = totalCost;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(int serviceCount) {
        this.serviceCount = serviceCount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    @Override
    public String toString() {
        return "ExpenseRecord{" +
                "category='" + category + '\'' +
                ", month='" + month + '\'' +
                ", year=" + year +
                ", serviceCount=" + serviceCount +
                ", totalCost=" + totalCost +
                '}';
    }




}
