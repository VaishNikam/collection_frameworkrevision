/*
Given a credit number in the form of string, mask this credit card no, in such a way that only middle 4 characters are visible to the end user. 
Conditions:
provided string length is greater than or equal to 6 and
the string length is always even
Eg
input = "0123456789"
output = "###3456###"
*/
//string mask
class Solution1{
 public static void main(String args[]){
      String str="0123456789";
	  int n=str.length();
	 //string result="";
	  StringBuilder result= new StringBuilder();  //0123456789
	  //length
	  int start=(n/2)-2;    //10/2-2=3
	  for(int i=0;i<n;i++){
	  if(i>=start && i<start+4){
	     result.append(str.charAt(i));     
	  }
	  else{
	  result.append("#");
	  }
	  }
	  System.out.println(result.toString());
	  
 }
}