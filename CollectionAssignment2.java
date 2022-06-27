


import java.util.HashSet;

public class Assignment2 {

        public static void main(String[] args) {
            Product x1=new Product("Himachal");
            Product x2=new Product("Yorkshire");
            Product x3=new Product("Fukushima");
            Product x4=new Product("Rockwell");
            Product x5=new Product("Himachal");
            HashSet<Product> Products=new HashSet<Product>();
            Products.add(x1);
            Products.add(x2);
            Products.add(x3);
            Products.add(x4);
            //the duplicate object addition
            Products.add(x5);
            System.out.println(Products);

        }
    }
    class Product{
        private String productName;
        public Product(String productName){
            this.productName=productName;
        }
        @Override
        public String toString(){
            return "Product name: "+productName;
        }

        @Override
        public int hashCode() {

            System.out.println(" --->> Inside Hashcode :- " + this.productName);
            return (int) (productName.length()  + 3);

        }
        public boolean equals(Object obj) {
            System.out.println(" ---------------->> Inside Equals :- "+this.productName);
            if(obj instanceof Product)
            {
                Product product = (Product) obj;

                boolean a = this.productName.equals(product.productName);


                return a;

            }
            else return false;
        }
    }


