package com.example.my1;

public class product {
 private String name;
    private int num;
   private int price;
   @Override
     public String toString() {
           return "Product{" +
                          "name='" + name + '\'' +
                               ", num=" + num +
                               ", price=" + price +
                               '}';
        }

           public void setName(String name) {
              this.name = name;
           }

           public void setNum(int num) {
                 this.num = num;
            }

            public void setPrice(int price) {
                 this.price = price;
             }

            public String getName() {
                 return name;
             }

             public int getNum() {
                return num;
             }

             public int getPrice() {
                 return price;
             }
 }

