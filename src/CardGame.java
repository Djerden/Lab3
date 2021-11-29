import java.util.ArrayList;
import java.util.List;

public class CardGame {
    private List<AbleToWin> players = new ArrayList<AbleToWin>();
    private List<PerformMilitaryService> soldiers = new ArrayList<PerformMilitaryService>();
    private Execution execute = new Execution();
    private Queen q;

    public void addPlayers(AbleToWin ... p) {
        for(AbleToWin i : p) {
            if (i instanceof Queen) {
                q = (Queen) i;
            }
            players.add(i);
        }
    }

    public void addSoldiers(PerformMilitaryService ... s) {
        for(PerformMilitaryService i : s) {
            soldiers.add(i);
        }
    }

    private Soldier chooseSoldier() {
        int rand = (int) (Math.random() * soldiers.size());
        return (Soldier) soldiers.get(rand);
    }

    public void startGame() {
        System.out.println("Игра пошла по-прежнему");
        while(players.size() > 1) {
            int winnum = (int) (Math.random() * players.size());
            Human winner = (Human) players.get(winnum);
            if(winner instanceof Queen) {
                System.out.println("побеждает " +  q.toString());
                q.sayWinPhrase();
            }
            else {
                System.out.println("побеждает " + winner.toString());
                Citizen loser = (Citizen) winner;
                loser.sayWinPhrase();
                if(loser.chanceForForgiveness()) {

                }
                else {
                    q.sayLosePhrase();
                    chooseSoldier().arrest();
                    System.out.println(loser.toString() + " был взят под стражу и теперь ожидает казни");
                    execute.addArrested(loser);
                    players.remove((AbleToWin) loser);
                }
            }
            if(players.size() > 1) {
                System.out.println("осталось " + players.size() + " игроков");
            }
            else {
                System.out.println("осталась только королева\nигра закончена");
            }
        }
        System.out.println();
        // казнить игроков
        execute.executeArrested();

    }
}
