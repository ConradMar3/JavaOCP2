package Book04_StringsArraysCollections.Chapter6_BulkDataOperations.BasicBulkData_page464;

import java.util.ArrayList;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType,
                 String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    public String toString() {
        return name;
    }

    public class Spells {
        public void main(String[] args) {

            ArrayList<Spell> spells = new ArrayList<>();
            spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
            spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
            spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Enlarges something."));
            spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret within someone."));
            spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
            spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));

            for (Spell spell : spells)
                System.out.println(spell.name);
            spells.stream().forEach(s -> System.out.println(s));

            for (Spell spell : spells) {
                if (spell.type == Spell.SpellType.SPELL)
                    System.out.println(spell.name);
            }
            spells.stream()
                    .filter(s -> s.type == Spell.SpellType.SPELL)
                    .forEach(s -> System.out.println(s));

            spells.parallelStream()
                    .filter(s -> s.type == Spell.SpellType.SPELL)
                    .filter(s -> s.name.toLowerCase().startsWith("a"))
                    .forEach(s -> System.out.println(s));
        }
    }
}
