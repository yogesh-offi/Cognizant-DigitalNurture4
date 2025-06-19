public class App {
    public static void main(String[] args) throws Exception {
        Logger logger1 = Logger.getInstance();
        logger1.log("this is the first instance");
        Logger logger2 = Logger.getInstance();
        logger2.log("this is the second instance");
        if(logger1==logger2)
        {
            System.out.println("Both instances are the same");
        }
        else
        {
            System.out.println("Both are different");
        }
    }
}
