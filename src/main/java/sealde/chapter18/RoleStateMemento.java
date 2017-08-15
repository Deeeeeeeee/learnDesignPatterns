package sealde.chapter18;

/**
 * Created by sealde on 8/16/17.
 */
public class RoleStateMemento {
    private String vitality;
    private String attack;
    private String defense;

    public RoleStateMemento(String vitality, String attack, String defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public String getVitality() {
        return vitality;
    }

    public void setVitality(String vitality) {
        this.vitality = vitality;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }
}
