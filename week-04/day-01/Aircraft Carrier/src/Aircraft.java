public class Aircraft {
    int ammo;
    int maxAmmo;
    int baseDamage;

    public Aircraft() {
        this.ammo = 0;
    }

    int fight() {
        int damage = this.baseDamage * this.ammo;
        this.ammo = 0;
        return damage;
    }

    int refill(int amountOfAmmo) {
        int ammoToFill = this.maxAmmo - this.ammo;
        if (ammoToFill < amountOfAmmo) {
            this.ammo += ammoToFill;
            amountOfAmmo -= ammoToFill;
        } else {
            this.ammo += amountOfAmmo;
            amountOfAmmo = 0;
        }
        return amountOfAmmo;
    }

    String getType() {
        if (this instanceof F16)
            return "F16";
        if (this instanceof F35)
            return "F35";
        return "Something Else";
    }

    int allDamage() {
        return this.baseDamage * this.ammo;
    }

    void getStatus() {
        System.out.println("Aircraft type: " + this.getType() + " | Status: Ammo " + this.ammo + " | Base Damage " + this.baseDamage + " | All Damage " + this.allDamage());
    }

    boolean isPriority() {
        return this.getType() == "F35";
    }
}