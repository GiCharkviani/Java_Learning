package Section8_Generics;

import java.util.ArrayList;
import java.util.List;

public  class GamePlayer <T extends Player> {

private  String name ;
private List <T> gamePlayersTeam  = new ArrayList<>();

public  GamePlayer(String name){
    this.name  = name;
}

public T  getTeamMember(int playerNumber){
    return gamePlayersTeam.get(playerNumber);
}


public  void  addTeamMember(T  teamMember){
    gamePlayersTeam.add(teamMember);
}


}
