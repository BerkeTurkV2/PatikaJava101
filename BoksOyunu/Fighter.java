package BoksOyunu;

public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double whoStarts;

    Fighter(String name, int damage, int health, int weight, double dodge, double whoStarts) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        this.whoStarts = whoStarts;
    }

    int hit(Fighter enemy) {
        System.out.println(this.name + " ==> " + enemy.name + " || " + this.damage + " hasar verdi.");
        if (enemy.isDodge()) {
            System.out.println(enemy.name + " Gelen hasarı engelledi");
            return enemy.health;
        }
        if (enemy.health - this.damage < 0) {
            return 0;
        }
        return enemy.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isWhoStarts() {
        double randomN = Math.random() * 100;
        return randomN <= this.whoStarts;
    }
}
