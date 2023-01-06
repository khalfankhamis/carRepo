public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan abe= new Sedan(10, "gray", 12500, 13);
        Ford abe1=new Ford(20, "yellow", 2532, 5, 6500);
        Ford abe2=new Ford(10, "purple", 350, 3, 6700);
        Car abc=new Car(12, "red", 2600);

        System.out.println("Sedan Sales Price: "+abe.getSalePrice());
        System.out.println("Ford sales : "+abe1.getSalePrice());
        System.out.println("Ford 2 sales :"+abe2.getSalePrice());
        System.out.println("Car Sales Price are: "+abc.getSalePrice());

    }
    
}
