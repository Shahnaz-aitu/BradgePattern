public class Main {
    public static void main(String[] args) {
        Brand brand1= new Dior(new Cream(),new Lipstick());
        brand1.getCosmetics();
        Brand brand2= new Chanel(new Cream(),new Lipstick());
        brand2.getCosmetics();
    }
}