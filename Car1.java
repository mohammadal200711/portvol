public class Car1 {
    final int maxspeed=200;
    final int minspeed;
static  final String Nameassition;
static {
    Nameassition="kia";

}
    public Car1(int minspeed) {

    this.minspeed = minspeed;
    System.out.println(Nameassition);
    }
    public final void showwspeed(){
    System.out.println("maxspeed"+ "" +maxspeed);
    System.out.println("minspeed" +"" +minspeed);

    }
    public void display(final int number){
    System.out.println(number*number);
    }

    @Override
    public String toString() {
        return "Car1{" +
                "maxspeed=" + maxspeed +
                ", minspeed=" + minspeed +"  "+Nameassition;

    }
}
