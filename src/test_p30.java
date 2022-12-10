public class test_p30 {
    public static void main(String[] args){
        Car car1=new Car();
        try{
            car1.setCar(1234,-10.0);
        }catch (CarException e){
            System.out.println("拋出"+e+"了");
        }
        car1.show();
    }
}
