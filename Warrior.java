import java.util.ArrayList;
import java.util.List;

public class Warrior {
    
    int exp;
    int level;
    String rank;
    List<String> achievements = new ArrayList<>();

    public Warrior() {
        level = 1;
        exp = 100;
        rank = "Pushover";
    }

    public int level(){
        return getLevel();
    }

    public int experience(){
        return getExp();
    }

    public String rank(){
        if(getLevel()<=9 && getLevel()>=1){
            return "Pushover";
        } else if(getLevel()<=19){
            return "Novice";
        } else if(getLevel()<=29){
            return "Fighter";
        } else if(getLevel()<=39){
            return "Warrior";
        } else if(getLevel()<=49){
            return "Veteran";
        } else if(getLevel()<=59){
            return "Sage";
        } else if(getLevel()<=69){
            return "Elite";
        } else if(getLevel()<=79){
            return "Conqueror";
        } else if(getLevel()<=89){
            return "Champion";
        } else if(getLevel()<=99){
            return "Master";
        } 
        return "Greatest";
    }

    public List<String> achievements(){
        return achievements;
    }

    public String training(String achievement, int expGain, int minLevel){
        if (minLevel>getLevel()) {
            System.out.println("Not strong enough");
            return "Not strong enough";
        } else {
            achievements.add(achievement);
            setExp(getExp()+expGain);
        }   
        return achievement;

    }

    public String battle(int level){
        
        if(level <= 0 || level > 100){
            return "Invalid level";
             // level above or under the acceptable value
        }
        else if(level - getLevel() >= 5 && level/10 != getLevel()/10){
            return "You've been defeated";
            // enemy is at least one rank higher and enemy level is 5 levels or higher than your warrior
        } 
        else if(level - getLevel() >= 1){
            setExp(getExp() + ( 20 * (level - getLevel()) * (level - getLevel())));
            return "Intense fight";
            // enemy one level higher or more
        }   
        else if(level - getLevel() == 0){
            setExp(getExp() + 10); 
            return "A good fight";
            // Same Level
        }
        else if(getLevel() - level == 1){
            setExp(getExp() + 5);
            return "A good fight";
            // your warrior one level higher
        }

        return "Easy fight";
        // your warrior 2 levels higher or more
        
    }

    
    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;

        int levelCounter = 0;

        while (exp >= 100) {
            exp = exp-100;
            levelCounter++;
        }
        if (levelCounter>100) {
            levelCounter = 100;
            this.exp = 10000;
        }
        setLevel(levelCounter);
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
