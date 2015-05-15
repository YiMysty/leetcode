package leetcode93;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
		if (s.length() <= 3)
			return new ArrayList<String>();
		return returnResult(s, 3, 0);
	}

	public List<String> returnResult(String s, int remains, int pos) {
		List<String> result = new ArrayList<String>();
		if (remains == 0) {
			if (pos >= s.length()) {
				return result;
			}
			String lastPart = s.substring(pos);
			if (!isValid(lastPart))
				return result;
			result.add(s);
			return result;
		}
		for (int i = 1; i <= 3 && pos + i < s.length(); i++) {
			String prefix = s.substring(pos, pos + i);
			if (isValid(prefix)) {
				String IP = s.substring(0, pos + i) + "."
						+ s.substring(pos + i);
				result.addAll(returnResult(IP, remains - 1, pos + i + 1));
			}
		}
		return result;
	}

	public boolean isValid(String prefix) {
		if(prefix.length()>3||prefix.length()<=0)
			return false;
		int ip = Integer.parseInt(prefix);
		if (ip >= 0 && ip <= 255&&(ip+"").length()==prefix.length())
			return true;
		return false;
	}
}