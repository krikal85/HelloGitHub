package Pruefungsvorbereitung;

public class Übungabend4 {

	public static void main(String[] args) {
	//	System.out.println(countCharX("Hallo"));
	//	System.out.println(changeCharXToY("erxc"));
	//	System.out.println(noX("xtesxtk doxrx x"));
	//System.out.println(arrayContains6(nums,0));
		int[] nums = {11,11,11,1,11,111};
	
	//	System.out.println(count11InArray(nums, 0));
		System.out.println(prettifyWithStars("HALLO"));
	}

	public static int countCharX(String str){
		if (str.isEmpty()){
			return 0;
		}
		else{
			
			return countCharX(str.substring(1))+1;
		}
		
	}
	
	
	public static String changeCharXToY(String str) {
		if (str.isEmpty()){
			return "";
		}
		else{
			if(str.charAt(0)=='x'){
				char c = ' ';
				c = 'y';
				
				return c+changeCharXToY(str.substring(1));
				
				
			}
			else 
				return str.charAt(0)+changeCharXToY(str.substring(1));
				
		}
	}
	public static String noX(String str) {
		if (str.isEmpty()){
			return "";
		}
		else{
			if(str.charAt(0)=='x'){
				
				
				return noX(str.substring(1));
				
				
			}
			else 
				return str.charAt(0)+noX(str.substring(1));
	}
	}
	
	public static boolean arrayContains6(int[] nums, int index) {
		if (nums.length == 0 || index == nums.length){
			System.out.println("if "+index);
			return false; 
		}
		else if(nums[index]==6){
			System.out.println("else if: "+index);
			return true;
		}
		else 
			System.out.println("else"+index);
			return arrayContains6(nums,index+1);
			
	}
	
	public static int count11InArray(int[] nums, int index) {
		if (nums.length == 0 || index == nums.length){
			System.out.println("if "+index);
			return +0; 
		}
		else if(nums[index]==11){
			System.out.println("else if: "+index);
			return count11InArray(nums, index+1)+1;
		}
		else 
			System.out.println("else"+index);
		
			return count11InArray(nums, index+1);
			
		}
	
	public static String prettifyWithStars(String str) {
		if(str.length()==0){
			return "";
		}
		else if(str.length()==1){
			
			return str;
		}
		else{
			char c = ' ';
			c = str.charAt(0);
			return c+"*"+prettifyWithStars(str.substring(1));
		}
				
	}
}
