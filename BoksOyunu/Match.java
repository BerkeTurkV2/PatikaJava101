package BoksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            int i = 1;
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("                          ");
                System.out.println("======== " + i + ". ROUND ========");
                System.out.println("                          ");
                if (this.f1.isWhoStarts()) {
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " Sağlığı ==> " + this.f2.health);
                    if (isWin()) {
                        break;
                    }
                    System.out.println("--------------------------");
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " Sağlığı ==> " + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                    i++;
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " Sağlığı ==> " + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                    System.out.println("--------------------------");
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " Sağlığı ==> " + this.f2.health);
                    if (isWin()) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri aynı değil.");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("                          ");
            System.out.println("======== ROUND SONU ========");
            System.out.println("                          ");
            System.out.println(this.f2.name + " Maçı Kazandı...");
            System.out.println("                          ");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("                          ");
            System.out.println("======== ROUND SONU ========");
            System.out.println("                          ");
            System.out.println(this.f1.name + " Maçı Kazandı...");
            System.out.println("                          ");
            return true;
        }
        return false;
    }
}
