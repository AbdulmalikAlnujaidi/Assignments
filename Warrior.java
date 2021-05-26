public class Warrior {
    
    int exp;
    int level;
    String rank;

    public Warrior() {
        level = 1;
        exp = 100;
        rank = "Pushover";
    }

    public void level(){
        System.out.println(getLevel()); 
    }

    public void experience(){
        System.out.println(getExp());
    }

    public void rank(){
        if(getLevel()<=9){
            System.out.println("Pushover");
        } else if(getLevel()<=19){
            System.out.println("Novice");
        } else if(getLevel()<=29){
            System.out.println("Fighter");
        } else if(getLevel()<=39){
            System.out.println("Warrior");
        } else if(getLevel()<=49){
            System.out.println("Veteran");
        } else if(getLevel()<=59){
            System.out.println("Sage");
        } else if(getLevel()<=69){
            System.out.println("Elite");
        } else if(getLevel()<=79){
            System.out.println("Conqueror");
        } else if(getLevel()<=89){
            System.out.println("Champion");
        } else if(getLevel()<=99){
            System.out.println("Master");
        } else if(getLevel()==100)
        System.out.println("Greatest");
    }

    public String achiemvements(){
        return "";
    }

    public String training(){
        return "";
    }

    public void battle(int level){
        
        if(level <= 0 || level > 100){
            System.out.println("invalid level");
        }
        else if(level - getLevel() >= 5 && level%10 < getLevel()){
            System.out.println("You've been defeated");
        }
        else if(level - getLevel() >= 1){
            System.out.println("Intense fight!");
        }
        else if(getLevel() - level >= 2){
            System.out.println("Easy fight!");
        }
        else if(getLevel() - level >= 0){
            System.out.println("A good fight!");
        }
    }

    public void rankUp(){
       // if(getExp())
    }

    public void gainExp(){

    }
    
    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
}
