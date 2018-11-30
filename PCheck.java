public class PCheck{
	//determines validity
	public static boolean isValid(String myString){
		String open = "{([" , close = "}])";
		//Stack to keep tack of the braces in the program
		Stack<Character> stk = new Stack<Character>();
		for (int i =0; i<myString; i++){
			if(open.indexOf(myString.charAt(i)) > =0)	//if the brace is part of the open braces
			stk.push(myString.charAt(i));			//add it to the stack
		if (close.indexOf(myString.charAt(i)) >= 0){		//if you find a closing brace at any index in the array
			if(stk.size() > 0){				//check if the stack has any open braces
					if(!(isParenthesesMatching(stk.pop(), myString.charAt(i))))			//if that closing brace matches any open in stack, pop/remove it
					return false;			//otherwise return false
				}else {
					return false;
					}
			}
		}
		return true;
	}
	public static boolean isParenthesesMatching(char c1, c2){
		if (c1 == "[" && c2 == "]"){
			return true;
		}

		if (c1 == "(" && c2 == ")"){
			return true;
		}

		if (c1 == "{" && c2 == "}"){
			return true;
		}
		
		return false;
	}

}
