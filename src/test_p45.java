public class test_p45 {
    public static void main(String[] args){
        Cars car1 =new Cars("1號車");
        car1.start();
        Cars car2 =new Cars("2號車");
        car2.start();
        for (int i=0;i<5;i++){
            System.out.println("正在進行main()的處理工作");
        }
    }
}
