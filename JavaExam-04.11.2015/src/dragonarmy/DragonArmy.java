package dragonarmy;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<Integer>>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < row; i++) {
            String[] dragon = scanner.nextLine().split(" ");
            String color = dragon[0];
            String name = dragon[1];
            int damage = 45;
            int health = 250;
            int armor = 10;

            if (!dragon[2].contains("null")) {
                damage = Integer.parseInt(dragon[2]);
            }

            if (!dragon[3].contains("null")) {
                health = Integer.parseInt(dragon[3]);
            }

            if (!dragon[4].contains("null")) {
                armor = Integer.parseInt(dragon[4]);
            }

            if ((i == 0) || !dragons.containsKey(color)) {
                dragons.put(color, new LinkedHashMap<>());
            }

            dragons.get(color).put(name, new ArrayList<>());
            dragons.get(color).get(name).add(damage);
            dragons.get(color).get(name).add(health);
            dragons.get(color).get(name).add(armor);
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<Integer>>> linkedHashMapEntry : dragons.entrySet()) {
            String colorDragon = linkedHashMapEntry.getKey();
            LinkedHashMap<String, ArrayList<Integer>> dragonsList = linkedHashMapEntry.getValue();
            ArrayList<String> rowDragons = new ArrayList<>();

            int damageDragons = 0;
            int healthDragons = 0;
            int armorDragons = 0;

            for (Map.Entry<String, ArrayList<Integer>> arrayListEntry : dragonsList.entrySet()) {
                String nameDragon = arrayListEntry.getKey();
                ArrayList<Integer> numbers = arrayListEntry.getValue();
                damageDragons += numbers.get(0);
                healthDragons += numbers.get(1);
                armorDragons += numbers.get(2);

                rowDragons.add("-" + nameDragon + " -> "
                        + "damage: " + numbers.get(0)
                        + ", health: " + numbers.get(1)
                        + ", armor: " + numbers.get(2));
            }

            double dem = (damageDragons * 1.0) / rowDragons.size();
            double hel = (healthDragons * 1.0) / rowDragons.size();
            double arm = (armorDragons * 1.0) / rowDragons.size();

            System.out.printf(colorDragon + "::(%.2f/%.2f/%.2f)", dem, hel, arm);
            System.out.println();
            Collections.sort(rowDragons);
            for (int i = 0; i < rowDragons.size(); i++) {
                System.out.println(rowDragons.get(i));
            }
        }
    }
}
