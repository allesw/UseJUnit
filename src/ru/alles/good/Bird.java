package ru.alles.good;

public abstract class Bird {
    private boolean isFlying;
    private final String name;

    Bird(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("Name is empty!");
        }
        this.isFlying = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public abstract void feed();

    void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "isFlying=" + isFlying +
                ", name='" + name + '\'' +
                '}';
    }
}
