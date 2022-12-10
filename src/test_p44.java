public class test_p44 {
    public static void main(String[] args){
        Cars car1=new Cars("1號車");
        car1.start();
        for(int i=0;i<5;i++){
            System.out.println("正在進行main()的處理工作");
        }
    }
}
class Cars extends Thread{
    private String name;
    public Cars(String nm){
        name =nm;
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("正在進行"+name+"的處理工作");
        }
    }
}
