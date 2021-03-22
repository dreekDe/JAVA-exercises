package MultidimensionalArrays;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerHealth = 18500;
        double bossHealth = 3000000.00;
        double damage = Double.parseDouble(scanner.nextLine());

        int[] playerPos = new int[2];
        playerPos[0] = 7;
        playerPos[1] = 7;

        int cloudHint = 3500;
        int eruptionHint = 6000;

        boolean isInCloud = false;
        String lastDamage = "";

        while (playerHealth > 0) {
            bossHealth -= damage;

            if (isInCloud) {
                playerHealth -= cloudHint;
                isInCloud = false;
            }
            if (playerHealth <= 0) {
                lastDamage = "Plague Cloud";
                break;
            }
            if (bossHealth <= 0) {
                break;
            }
            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            lastDamage = spell;

            boolean isPlayerDamage = checkPlayerIsHit(playerPos[0], playerPos[1], targetRow, targetCol);

            int damageDone = 0;
            if (isPlayerDamage) {
                if ("Cloud".equals(spell)) {
                    damageDone = cloudHint;
                } else {
                    damageDone = eruptionHint;
                }
                boolean canNotMove = canMove(playerPos, targetRow, targetCol);
                if (!canNotMove) {
                    playerHealth -= damageDone;
                    if ("Cloud".equals(spell)) {
                        isInCloud = true;
                    }
                }
            }
        }
        if (bossHealth > 0) {
            System.out.printf("Heigan: %.2f%n", bossHealth);
        } else {
            System.out.println("Heigan: Defeated!");
        }

        if (playerHealth > 0) {
            System.out.printf("Player: %d%n", playerHealth);
        } else {
            lastDamage = lastDamage.equals("Cloud") ? "Plague Cloud" : lastDamage;
            System.out.printf("Player: Killed by %s%n", lastDamage);
        }
        System.out.printf("Final position: %d, %d", playerPos[0], playerPos[1]);
    }


    public static boolean canMove(int[] position, int targetRow, int targetCol) {

        boolean canMove = false;
        int r = position[0];
        int c = position[1];

        if (isInValid(r - 1, c) && !checkPlayerIsHit(r - 1, c, targetRow, targetCol)) {
            r--;
            canMove = true;
        } else if (isInValid(r, c + 1) && !checkPlayerIsHit(r, c + 1, targetRow, targetCol)) {
            c++;
            canMove = true;
        } else if (isInValid(r + 1, c) && !checkPlayerIsHit(r + 1, c, targetRow, targetCol)) {
            r++;
            canMove = true;
        } else if (isInValid(r, c - 1) && !checkPlayerIsHit(r, c - 1, targetRow, targetCol)) {
            c--;
            canMove = true;
        }
        position[0] = r;
        position[1] = c;
        return canMove;
    }

    public static boolean isInValid(int r, int c) {
        return r >= 0 && r < 15 && c >= 0 && c < 15;
    }

    public static boolean checkPlayerIsHit(int row, int col, int targetRow, int targetCol) {
        return row >= targetRow - 1 && row <= targetRow + 1
                && col >= targetCol - 1 && col <= targetCol + 1;
    }
}

