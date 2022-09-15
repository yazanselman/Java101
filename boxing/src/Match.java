public class Match {

        Player f1;
        Player f2;
        int minWeight;
        int maxWeight;
    
    
        Match(Player f1, Player f2, int minWeight, int maxWeight) {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
    
    
        }
    
        void run() {
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("******YENİ ROUND******");
                    int chance = Math.round((float) Math.random());
                    System.out.println("Şans " + chance);
                    if (chance == 0) {
                        this.f1.health = this.f2.hit(this.f1);
                        if (isWin()) {
                            break;
    
                        }
    
    
                    }
                    if (chance == 1) {
                        this.f2.health = this.f1.hit(this.f2);
                        if (isWin()) {
                            break;
                        }
    
                    }
    
                    System.out.println(this.f1.name + " Sağlık :" + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık :" + this.f2.health);
    
                }
            } else {
                System.out.println("Sikletler uyuşmuyor!");
            }
    
    
        }
    
    
        boolean isCheck() {
            return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
        }
    
        boolean isWin() {
            if (this.f1.health == 0) {
                System.out.println(f2.name + " Kazandı!");
                return true;
    
            }
            if (this.f2.health == 0) {
                System.out.println(f1.name + " Kazandı!");
                return true;
            }
            return false;
    
        }
    
    
    
}
