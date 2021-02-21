package com.lierlin.ThreadTest;

class KeChongRuSuo{
   static synchronized void test1(String str){
        System.out.println(str+"---->1");
        test2(str);
        System.out.println("end" + str);
    }

   static synchronized void test2(String str){
        System.out.println(str+"---->2");
    }
}

class myThread extends Thread{
    String str = null;
    public myThread(String str) {
        this.str = str;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        new KeChongRuSuo().test1(str);
    }
}

 class synchronizedTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myThread th1 = new myThread("1str");
        myThread th2 = new myThread("2str");
        th1.start();
        th2.start();
    }

}