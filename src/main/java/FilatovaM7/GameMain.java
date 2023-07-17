package FilatovaM7;

public class GameMain  {
    public static void main(String[] args) {

      String result = Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        result = Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        result = Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);


    }
}
