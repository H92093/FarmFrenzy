public class Turkey extends DomesticAnimal{
    public static final int turkeyBuyPrice = 200 ;
    public static final int turkeySellPrice = 160 ;
    public static final int turkeyLife = 100 ;

    public Turkey(int x , int y ){
        this.buyPrice = turkeyBuyPrice ;
        this.sellPrice = turkeySellPrice ;
        this.life = turkeyLife ;
        this.x = x ;
        this.y = y ;
        this.time = 0 ;
        this.name = "T" ;
    }

    public void makeProduct(){

    }

}