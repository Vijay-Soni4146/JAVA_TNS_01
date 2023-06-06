/*Create multiple instances of Product and set their name, price, and quantity.
Call the sell() method for some of the product instances to simulate selling them.
Print the total quantity of products sold using the getTotalSold() method. */

class Product{
    String name;
    int price,quantity;
    int totalsold=0;

    Product(String n,int p,int q){
            this.name=n;
            this.price=p;Prod
            this.quantity=q;
    }

    public void sell(int quantitysold){
        if(quantitysold <= quantity){
            quantity-=quantitysold;
            totalsold+=quantitysold;
            System.out.println("Sold "+quantitysold +" units of " +name);
        }else{
            System.out.println("Not Enough "+quantitysold+" in stock to sell");
        }
    }



    public int getTotalSold(){
        return totalsold;
    }
}


public class Product_Sold {
    public static void main(String[] args) {
        Product p1=new Product("Apple",10,5);
        Product p2=new Product("Nike",12,6);
    
        p1.sell(4);
        p2.sell(6);
    
        int totalsolditem=p1.getTotalSold()+p2.getTotalSold();
        
        System.out.println("Total quantity of product sold is :"+totalsolditem);
    }
}