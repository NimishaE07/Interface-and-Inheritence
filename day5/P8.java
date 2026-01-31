interface payment{
    void pay();
}
class Upi implements payment{
    public void pay(){
        System.out.println("paying through UPI");
    }
}
class P8{
    public static void main(String[] args){
        Upi gpay = new Upi();
        gpay.pay();
    }
}