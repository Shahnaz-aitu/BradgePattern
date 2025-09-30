abstract class Brand {
    protected Cosmetic cream;
    protected Cosmetic lipstick;

    protected Brand(Cosmetic cream, Cosmetic lipstick) {
        this.cream = cream;
        this.lipstick = lipstick;
    }
    abstract public void getCosmetics();
}
