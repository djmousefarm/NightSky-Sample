
public class Main {

    public static void main(String[] args) {
        // Test your code here
        
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        
        //NightSky NightSky = new NightSky(0.1, 40, 10);
        //NightSky.printLine();
        
        //NightSky NightSky = new NightSky(8, 4);
        //NightSky.print();
  
        }
}
