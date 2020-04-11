package sekcja10;

public class Main {
    public static void main(String[] args) {

        FootballTeam lech = new FootballTeam("Lech Poznań");
        FootballTeam legia = new FootballTeam("Legia Warszawa");
        FootballTeam widzew = new FootballTeam("Widzew Łódź");

//        Team<VolleyballTeam> volejePn = new VolleyballTeam("Voleje Poznań");
        VolleyballTeam volejePn = new VolleyballTeam("Voleje Poznań");
        VolleyballTeam volej2 = new VolleyballTeam("Volej tim 2");
        VolleyballTeam volej3 = new VolleyballTeam("Volej tim 3");

        widzew.setPoints(1);
        legia.setPoints(3);
        lech.setPoints(6);

        volejePn.setPoints(2);
        volej2.setPoints(6);
        volej3.setPoints(0);

        LeagueTable<FootballTeam> ekstraklasa = new LeagueTable<>("Ekstraklasa");
        LeagueTable<VolleyballTeam> ligaSiatkowki = new LeagueTable<>("1. Liga siatkówki");

        ekstraklasa.addTeam(legia);
        ekstraklasa.addTeam(widzew);
        ekstraklasa.addTeam(lech);
        ekstraklasa.addTeam(lech);

        ligaSiatkowki.addTeam(volejePn);
        ligaSiatkowki.addTeam(volej2);
        ligaSiatkowki.addTeam(volej3);

        System.out.println(ekstraklasa.getName());
        ekstraklasa.printTable();

        System.out.println(ligaSiatkowki.getName());
        ligaSiatkowki.printTable();

        System.out.println(ekstraklasa.getName());
        ekstraklasa.sortTable();
        ekstraklasa.printTable();

        System.out.println(ligaSiatkowki.getName());
        ligaSiatkowki.sortTable();
        ligaSiatkowki.printTable();

    }
}
