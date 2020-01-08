package smacovilanguage.design;

import java.util.List;

import smaCoViLanguage.SmartContract;
import smaCoViLanguage.Term;

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
	
	public String getLabel(SmartContract instruction) {		
			return "";
	}
}
