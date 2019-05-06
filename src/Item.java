public class Item {

    private String Iname;
    private String Idate;
    private double IbuyPrice;
    private double IcurrentPrice;

    public Item (String name, String date, double buyPrice, double currentPrice){
       Iname=name;
       Idate=date;
       IbuyPrice=buyPrice;
       IcurrentPrice=currentPrice;
    }

    public void print() {
        System.out.print(Iname+" " + Idate+" " +IbuyPrice+" " +IcurrentPrice);
    }


    public void setCurrentPrice(double price){
        IcurrentPrice=price;
    }
    public double getPrice(){
        return IcurrentPrice;
    }
}
