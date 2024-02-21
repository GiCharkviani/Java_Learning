package Section8_Generics;

import java.util.ArrayList;
import java.util.List;

public class SportTeam<T extends Player> {
    private String name;
    private List<T> teamMembers = new ArrayList<>();

    public SportTeam(String name) {
        this.name = name;
    }

    public T getTeamMember(int playerNumber) {
        return teamMembers.get(playerNumber);
    }

    public void addTeamMember(T teamMember) {
        this.teamMembers.add(teamMember);
    }

}
