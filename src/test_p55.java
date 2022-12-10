public class test_p55 {
    public static void main(String[] args){
        Company2 cmp =new Company2();
        Driver2 drv1 = new Driver2(cmp);
        drv1.start();
        Driver2 drv2 = new Driver2(cmp);
        drv2.start();
    }
}
class Company2{
    private  int sum=0;
    public synchronized void add(int a){
        int tmp =sum;
        System.out.println("目前的合計金額是"+tmp+"元");
        System.out.println("賺到"+a+"元了");
        tmp = tmp+a;
        System.out.println("合計金額是"+tmp+"元");
        sum=tmp;
    }
}
class Driver2 extends Thread{
    private Company2 comp;
    public Driver2(Company2 c){
        comp=c;
    }
    public void run(){
        for(int i=0;i<3;i++){
            comp.add(50);
        }
    }
}
