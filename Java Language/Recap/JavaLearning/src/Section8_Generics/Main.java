package Section8_Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList  =  new ArrayList<>();
        LinkedList<String> anyLIst  = new LinkedList<>();

        SportTeam<FootballPlayer> myTeam = new SportTeam<>("Barcelona");
        myTeam.addTeamMember(new FootballPlayer("Leonel", "Messi", 21));
        myTeam.addTeamMember(new FootballPlayer("Naymar", "Magari", 41));
        myTeam.addTeamMember(new FootballPlayer("Cristiano", "Ronaldo", 51));

        FootballPlayer cristiano = myTeam.getTeamMember(2);
        System.out.println(cristiano.getFirstName());


        SportTeam<BasketballPlayer>  ballTeam  =  new SportTeam<>("Laycers");
        ballTeam.addTeamMember(new BasketballPlayer("michel","jordan" ,1));
        ballTeam.addTeamMember(new BasketballPlayer("jud","belingem" ,2));
        ballTeam.addTeamMember(new BasketballPlayer("viktor","boisa" ,3));
        BasketballPlayer michel = ballTeam.getTeamMember(1);
        System.out.println(michel.getFirstName());

        GamePlayer<WitcherPlayers> witcherTeam = new GamePlayer<>("sosio");
        witcherTeam.addTeamMember(new WitcherPlayers("soso" , "gochi",12));
        WitcherPlayers  so = witcherTeam.getTeamMember(0);
        System.out.println(so.getFirstName());
    }
}
