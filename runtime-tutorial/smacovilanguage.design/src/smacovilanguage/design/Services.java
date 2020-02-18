package smacovilanguage.design;

import java.util.List;

import smaCoViLanguage.SmartContract;
import smaCoViLanguage.Term;
import smaCoViLanguage.Attribute;
import smaCoViLanguage.Deotonic;
import smaCoViLanguage.Aim;
import smaCoViLanguage.Condition;
import smaCoViLanguage.SimpleCondition;
import smaCoViLanguage.And;
import smaCoViLanguage.OrElse;


/**
 * The services class used by VSM.
 */
public class Services {
    
	public SmartContract getNextInstruction(SmartContract instruction) {
		Term parentTerm=(Term)instruction.eContainer();
		List<SmartContract> actions=parentTerm.getSmartcontract();
		int position=actions.indexOf(instruction);
		if (position==actions.size()-1) {
			return null;
		}
		else {
			return actions.get(position+1);
		}
	}
	
//	public String getLabel(SmartContract instruction) {		
//			return "";
//	}
	
	public String getLabel(SmartContract instruction) {		
		if (instruction instanceof Attribute) {
			return ((Attribute)instruction).getAttributeName();
		}
		else if (instruction instanceof Deotonic) {
			return ((Deotonic)instruction).getDeotonic();
		}
		else if (instruction instanceof Aim) {
			return ((Aim)instruction).getAim();
		}
		else if (instruction instanceof Term) {
			return ((Term)instruction).getName();
		}
		else
			return "";
	}
}
