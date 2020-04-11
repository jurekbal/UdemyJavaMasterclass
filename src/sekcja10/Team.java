package sekcja10;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team team) {
        if (this.points > team.getPoints()) {
            return -1;
        } else if (this.points < team.getPoints()) {
            return 1;
        }
        return 0;
    }
}
