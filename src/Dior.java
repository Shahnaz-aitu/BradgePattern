public class Dior extends Brand{
    public Dior(Cosmetic cream,Cosmetic lipstick) {
        super(cream, lipstick);
    }
    @Override
    public void getCosmetics(){
        System.out.println("Cosmetics of Dior");
        lipstick.apply();
    }
}
