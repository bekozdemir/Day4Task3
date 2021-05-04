package Utilities;

import Entities.Member;

public class Utils {
	public static boolean checkIfValid(Member member) {
		if (!member.getFirstName().isEmpty() && member.getNationaltyId().length()==11) {
			return true; 
		}else {
			return false;
		}
	}
}
