public class FoodItem {
    private String name;
    private double price;
    private int quantity;


    FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void displayInfo() {
        System.out.println("Product name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total: "+getTotalPrice());
    }
    public static void main(String[] args){
        FoodItem item1=new Pizza("Margarita",10,2,"large");
        FoodItem item2=new Drink("Margarita", 10, 2, true);

        item1.displayInfo();
        System.out.println(item1.getTotalPrice());
        item2.displayInfo();
        System.out.println(item2.getTotalPrice());

    }
}

    class Pizza extends FoodItem {
        private String size;

        Pizza(String name, double price, int quantity, String size){
        super(name, price, quantity);
        this.size=size;
        }


        @Override
        double getTotalPrice(){
            double total=getPrice()*getQuantity();

            if(size.equals("large")){
               total=total*1.2;
            }
            return total;
        }



    }

    class Drink extends FoodItem {
        private boolean isCold;
        Drink(String name, double price, int quantity, boolean isCold){
            super(name, price, quantity);
        this.isCold=isCold;
        }
    @Override
        double getTotalPrice() {
            double total=getPrice()*getQuantity();
        if(isCold){
           total=total+1;

        }
        return total;
        }
    }





//Tapşırıq 1 — Food Delivery System(10 xal)
//Bir yemək çatdırılma sistemi hazırlayın.
//
//        Tələblər
//FoodItem adlı class yaradın:
//
//name
//        price
//quantity
//Field-lər private olmalıdır.
//
//Constructor vasitəsilə məlumatları qəbul et.
//
//Aşağıdakı methodları yarat:
//
//double getTotalPrice()
//void displayInfo()
//
//getTotalPrice():
//
//price × quantity
//hesablamalıdır.
//
//2. Pizza class-ı yarat
//FoodItem-dan inherit etsin.
//
//Əlavə field:
//
//size
//getTotalPrice() methodunu override et.
//
//Əgər pizza large ölçüdürsə, qiymətə 20% əlavə etsin.
//
//Məsələn:
//
//price = 10
//quantity = 2
//size = large
//
//        total = 24
//3. Drink class-ı yarat
//FoodItem-dan inherit etsin.
//
//Əlavə field:
//
//isCold
//Əgər isCold == true olarsa, qiymətə 1 AZN əlavə et.
//
//getTotalPrice() methodunu override et.
//
//        4. main() daxilində
//Aşağıdakı kimi müxtəlif obyektlər yarat:
//
//FoodItem item1 = new Pizza(...);
//FoodItem item2 = new Drink(...);
//Sonra hər iki obyekt üçün:
//
//        item1.displayInfo();
//System.out.println(item1.getTotalPrice());
//
//        item2.displayInfo();
//System.out.println(item2.getTotalPrice());
//çağır.