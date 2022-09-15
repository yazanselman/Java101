public class Main {
    public static void main(String[] args) {
       
        Player f1 = new Player("Ali", 15, 100, 115,40);
        Player f2 = new Player("Salihe", 20, 90, 95,30);

        Match match=new Match(f1,f2,90,105);
        match.run();
    }
}