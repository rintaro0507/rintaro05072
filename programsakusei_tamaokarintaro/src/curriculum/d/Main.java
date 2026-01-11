package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Player名を入力してください：");
        Player player = new Player(sc.nextLine());

        Daemon daemon = Daemon.loadDaemon("daemon_status.txt");

        FileWriter log = new FileWriter("battle_log.txt");

        log.write("=== バトル開始 ===\n");
        log.write(player.getName() + " vs " + daemon.getName() + "\n\n");

        Question7 first;
        Question7 second;

        if (player.getSp() > daemon.getSp()) {
            first = player;
            second = daemon;
        } else if (player.getSp() < daemon.getSp()) {
            first = daemon;
            second = player;
        } else {
            if (new Random().nextBoolean()) {
                first = player;
                second = daemon;
            } else {
                first = daemon;
                second = player;
            }
        }

        log.write("先攻：" + first.getName() + "\n\n");

        while (player.isAlive() && daemon.isAlive()) {
            attack(first, second, log);
            if (!second.isAlive()) break;
            attack(second, first, log);
        }

        if (player.isAlive()) {
            log.write("\n勝者：" + player.getName());
        } else {
            log.write("\n勝者：" + daemon.getName());
        }

        log.close();
        sc.close();
    }

    private static void attack(Question7 attacker, Question7 defender, FileWriter log) throws IOException {
        defender.takeDamage(attacker.getAt());
        log.write(attacker.getName() + " の攻撃！ "
                + defender.getName() + " に "
                + attacker.getAt() + " ダメージ（残HP：" + defender.getHp() + "）\n");
    }
}
