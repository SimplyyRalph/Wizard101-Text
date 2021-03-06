package wizard101text.spells.all;

import wizard101text.spells.Spell;
import wizard101text.spells.SpellInterface;
import wizard101text.spells.SpellType;
import wizard101text.spells.WardType;
import wizard101text.src.Character;

public class SpellSpiritShield extends Spell {
	public SpellInterface effect() {
		return new SpellInterface(){
			public boolean effect(Character user, Character opponent) {
				Character.addWard(user, SpellType.DEATH, WardType.SHIELD, 50);
				Character.addWard(user, SpellType.MYTH, WardType.SHIELD, 50);
				Character.addWard(user, SpellType.LIFE, WardType.SHIELD, 50);
				
				return true;
			}
		};
	}
	
	public SpellType type() {
		return SpellType.BALANCE;
	}
	
	public String name() {
		return "Spirit Shield";
	}
	
	public int pips() {
		return 0;
	}
}
