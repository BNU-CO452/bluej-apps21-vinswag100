import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Vincent Ogieva 
 */
public class StockDemo
{
// The stock manager.
private StockList stock;

private Random random; 
    
/**
 * Create a StockManager and populate it with at least
 * 10 sample products.
 */
public StockDemo(StockList demo)
{
        this.stock = new StockList();
        this.random = new Random();
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Alloy Bikes"));
        stock.add(new Product(102, "Pogo jumper"));
        stock.add(new Product(103, "Electric Scooter"));
        stock.add(new Product(104, "GTA V"));
        stock.add(new Product(105, "Skateboard"));
        stock.add(new Product(106, "Light saber"));
        stock.add(new Product(107, "jungle rope"));
        stock.add(new Product(108, "Uncharted 5"));
        stock.add(new Product(109, "Playstation 5"));
        stock.add(new Product(110, "Fifa 20"));
        
        
}
     
/**
 * Provide a demonstration of how the ProductList meets all
 * the user requirements by making a delivery of each product 
 * buying it in various amounts and then selling each
 * product by various amounts. Make sure all the requirements
 * have been demonstrated.
 */
public void runDemo()
{
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
}
    
/**
 * This method will buy different quantities of
 * each of the productsin the stock list.
 */
private void buyProducts()
{
    for(int i = 101; i <=110; i++)
        stock.buyProduct(i,random.nextInt(1001));
}

/**
 * This method will buy sell quantities of
 * each of the productsin the stock list.
 */
private void sellProducts()
{
    for(int i = 101; i <=110; i++)
        stock.sellProduct(i,random.nextInt(1001));
}
  
}    