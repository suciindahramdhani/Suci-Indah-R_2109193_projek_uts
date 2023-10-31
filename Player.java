public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String attack() {
        return name + " is attacking." + "\n" + name + " health before " + health;
    }

    public String healing() {
        this.health += 50;
        return name + " is healing." + "\n" + name + " health after healing " + health;
    }

    public String changeWeapon(String newWeapon) {
        this.weapon = newWeapon;
        return "ChangeWeapon(" + newWeapon + ")";
    }

    public void displayWeapon() {
        System.out.println(name + " weapon now is " + weapon);
    }

    public static void main(String[] args) {
        Player player1 = new Player("Arthur", 100, "Axe");
        System.out.println(player1.attack());
        System.out.println(player1.healing());
        System.out.println(player1.changeWeapon("Sword"));
        player1.displayWeapon();
    }
}