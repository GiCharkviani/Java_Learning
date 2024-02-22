package Section8_Generics.Generics;

import java.util.ArrayList;
import java.util.List;

public class GamePlayer<T extends Player, E extends String> {

    private String name;
    private List<T> gamePlayersTeam = new ArrayList<>();

    public GamePlayer(String name) {
        this.name = name;
    }

    public T getTeamMember(int playerNumber) {
        return gamePlayersTeam.get(playerNumber);
    }


    public void addTeamMember(T teamMember) {
        gamePlayersTeam.add(teamMember);
    }

    public void createTeamMember(Class<T> teamMember) {
        var newMember = teamMember.getDeclaredMethods();
        System.out.println(newMember[0]);
    }

    public E getName(int playerNumber) {
        return (E)gamePlayersTeam.get(playerNumber).getFirstName();
    }


}
