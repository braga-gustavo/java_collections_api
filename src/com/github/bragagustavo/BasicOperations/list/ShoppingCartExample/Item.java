package com.github.bragagustavo.BasicOperations.list.ShoppingCartExample;

public class Item {

    private Double price;
    private String name;
    private Integer ammount;

    public Item(Double price, String name, Integer ammount) {
        this.price = price;
        this.name = name;
        this.ammount = ammount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmmount() {
        return ammount;
    }

    public void setAmmount(Integer ammount) {
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "\n" + "Nome: " + name + "," +
                "\n" + "Preço: R$" + price + ", "
                + "\n" + "Quantidade: " + ammount + "," + "\n";
    }

}
