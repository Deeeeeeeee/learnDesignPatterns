package sealde.chapter18;

/**
 * Created by sealde on 8/16/17.
 */
public class GameRole {
    private String vitality;
    private String attack;
    private String defense;

    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + this.vitality);
        System.out.println("攻击力：" + this.attack);
        System.out.println("防御力：" + this.defense);
        System.out.println();
    }

    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vitality, this.attack, this.defense);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void getInitState() {
        this.vitality = "100";
        this.attack = "100";
        this.defense = "100";
    }

    public void fight() {
        this.vitality = "0";
        this.attack = "0";
        this.defense = "0";
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
