package stuff;

public class Test {

    public static void main(String[] args) {

    }

    public synchronized  void aa(){

        synchronized (this){
            System.out.println("sdsdsd");
        }
    }

}
