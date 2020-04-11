package sekcja10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {
    private String name;
    List<T> table = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (isInTable(team)) {
            // simplest: (table.containt(team))
            System.out.println("Team " + team.getName() + " is already in league table");
            return false;
        } else {
            table.add(team);
            return true;
        }
    }

    private boolean isInTable(T team) {
        for (Team t: table) {
            if (t.getName().equals(team.getName())) {
                return true;
            }
        }
        return false;
    }

    public void sortTable() {
        //table.sort(Team::compareTo); //this also works, but I have done it by accident
        Collections.sort(table);
    }

    public void printTable() {
        for (T t : table) {
            System.out.println(t.getName() + " : " + t.getPoints() + " point(s)");
        }
    }

    public String getName() {
        return name;
    }
}
