package interview.practice.overriding;

public class StaticMethodCall extends OverridingStaticMain {

   public static void show() {
        System.out.println("Please hide, don't show off!");
    }

    public  void display() {
        System.out.println("Display of StaticMethodCall");
    }

    public static void main(String[] args) {
        /*
         * Static method call binding takes place at compile time so below code will work fine.
         * 
         * You can not override main method because its static.
         */
        StaticMethodCall smc = null;
        smc.show();
        OverridingStaticMain.show();
        StaticMethodCall.show();

        OverridingStaticMain osm = new StaticMethodCall();
        osm.display();
       
        OverridingStaticMain osm1 = new OverridingStaticMain();
        osm1.display();
        StaticMethodCall smc1 = new StaticMethodCall();
        smc1.display();
    }
}
