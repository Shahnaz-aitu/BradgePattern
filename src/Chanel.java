public class Chanel extends Brand{
    public Chanel(Cosmetic cream, Cosmetic lipstick) {
        super(cream, lipstick);
    }
    @Override
    public void getCosmetics() {
        System.out.println("Cosmetic of Chanel: ");
        cream.apply();
        lipstick.apply();
    }
}
