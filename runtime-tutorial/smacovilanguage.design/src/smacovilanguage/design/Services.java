package smacovilanguage.design;

import java.util.List;

import smaCoViLanguage.SmartContract;
import smaCoViLanguage.Term;
import smaCoViLanguage.Attribute;
import smaCoViLanguage.Deontic;
import smaCoViLanguage.Aim;
import smaCoViLanguage.Main;
import smaCoViLanguage.Condition;
import smaCoViLanguage.SimpleCondition;
import smaCoViLanguage.And;
import smaCoViLanguage.OrElse;


/**
 * The services class used by VSM.
 */
public class Services {
    
	public SmartContract getNextInstruction(SmartContract instruction) {
		Main parentTerm=(Main)instruction.eContainer();
		List<SmartContract> actions=parentTerm.getSmartcontract();
		int position=actions.indexOf(instruction);
		if (position==actions.size()-1) {
			return null;
		}
		else {
			return actions.get(position+1);
		}
	}
	
	public String getLabel(SmartContract instruction) {		
		if (instruction instanceof Attribute) {
			return ((Attribute)instruction).getAttributeName();
		}
		else if (instruction instanceof Deontic) {
			return ((Deontic)instruction).getDeontic();
		}
		else if (instruction instanceof Aim) {
			return ((Aim)instruction).getAim()+" - " +((Aim)instruction).getAimObject() ;
		}
		else if (instruction instanceof Condition) {
			return ((Condition)instruction).getFirstPartCondition()+" "+((Condition)instruction).getOperator() +" "+((Condition)instruction).getLastConditionPart();
		}
		else if (instruction instanceof Term) {
			return ((Term)instruction).getName();
		}
		else
			return "";
	}
}
