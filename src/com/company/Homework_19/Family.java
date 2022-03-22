package com.company.Homework_19;

public abstract class Family {
    private int sum;
    private String address;

    public Family(int sum, String address) {
        this.sum = sum;
        this.address = address;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "sum=" + sum +
                ", address='" + address + '\'' +
                '}';
    }
}
