package test;

// class MyTask implements Runnable{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println(i);
//         }
        
//     }
// }


class MyTHread extends  Thread{
    public void run(){
        for(int i=1;i<10;i++)
            System.out.println(i);
    }
}
public class Test {



    public static  void main(String r[]){
        // MyTask mt =  new MyTask();
        // Thread t1 = new Thread(mt);

        // t1.start();

        MyTHread mth= new MyTHread();
        mth.start();

    }
}
