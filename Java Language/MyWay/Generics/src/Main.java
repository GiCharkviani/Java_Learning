import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Without generics
//        ArrayList items = new ArrayList();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        /* Our generics */
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<BaseballPlayer>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("This won't work");
//        brokenTeam.addPlayer("no-one"); // will have exception thrown

        Team<SoccerPlayer> hawthorn = new Team<>("Hawthorn");
        Team<SoccerPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        adelaideCrows.matchResult(melbourne, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3 ,8); // error out

//        adelaideCrows.matchResult(fremantle, 2, 1); // error out
//        adelaideCrows.matchResult(baseballTeam, 1, 1); // error out

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(melbourne.compareTo(adelaideCrows));

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i: n)
            System.out.println(i * 2);
    }
}
