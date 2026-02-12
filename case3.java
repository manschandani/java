class product{
    String name;
    Double price;
    product(String name, Double price){
        this.name= name;
        this.price=price;
    }
}

class shoppingcart{
    product[] products = new product[50];
    int count=0;
    double total= 0;

    void addproduct(product product){
        products[count]= product;
        count++;
        System.out.println("product added: "+ product.name);
    }
    void calculatetotalcost(){
        for(int i= 0; i<count; i++){
            total= total + products[i].price;
        }
        System.out.println("total cost of products in cart: "+ total);
    }
  void removeProduct(String name){
        for(int i = 0; i < count; i++){
            if(products[i].name.equals(name)){
                System.out.println("Removing product: " + name);

                
                for(int j = i; j < count - 1; j++){
                    products[j] = products[j + 1];
                }

                count--;
                return;
            }
        }
        System.out.println("Product not found");
    }

    void displaycart(){
        for(int i =0; i<count; i++){
            System.out.println("product"+ (i+1)+ ":"+ products[i].name+ "price: "+ products[i].price);
        }
    }

}

public class case3{
    public static void main(String[] args){
        product product1 = new product("charger", 200.0);
        product product2= new product("headphones", 500.0);
        product product3= new product("mouse", 400.0); 
        product product4= new product ("pillow", 375.0);

        shoppingcart cart1= new shoppingcart();
        cart1.addproduct(product1);
        cart1.addproduct(product2);
        cart1.addproduct(product3);
        cart1.addproduct(product4);

        cart1.calculatetotalcost();
        cart1.displaycart();
        cart1.removeProduct("headphones");
        cart1.calculatetotalcost();
        cart1.displaycart();

    }
}