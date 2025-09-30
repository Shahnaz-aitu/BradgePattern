public class Main {
    public static void main(String[] args) {
        Brand dior= new Dior(new Cream(),new Lipstick());
        dior.getCosmetics();
        Brand chanel= new Chanel(new Cream(),new Lipstick());
        chanel.getCosmetics();
    }
}