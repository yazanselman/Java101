
    public class Player {
        String name;
        int damage;
        int weight;
        int health;
        int dodge;
    
        int firstShoot;
    
    
        Player(String name, int damage, int weight, int health,int dodge) {
            this.name = name;
            this.damage = damage;
            this.weight = weight;
            this.health = health;
            if (dodge>=0 && dodge<=100){
                this.dodge=dodge;
            }else {
                this.dodge=0;
            }
    
    
    
    
        }
    
        int hit(Player ali) {
            System.out.println(this.name + "," + ali.name + "'ye " + this.damage + " hasar vurdu");
            if (ali.isDodge()){
                System.out.println(ali.name+" Gelen hasarı blokladı!");
                return ali.health;
            }
            if (ali.health-this.damage<0){
                return 0;
            }
            return ali.health-this.damage;
    
        }
        boolean isDodge() {
            double randomNumber = Math.random() * 100;
            return randomNumber <= this.dodge;
        }
    
    
    }
