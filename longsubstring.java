
import java.util.*;
public class longsubstring
{
	public static void main(String[] args) {
	String s="abcad";
	int left=0;
	int max=0;
	String ans="";
	HashSet<Character>set=new HashSet<>();
	for(int right=0;right<s.length();right++){
	    char ch=s.charAt(right);
	    while(set.contains(s.charAt(right))){
	        set.remove(s.charAt(left));
	        left++;
	    }
	    set.add(s.charAt(right));
	    if(right-left+1>max){
	        max=right-left+1;
	        ans+=s.charAt(right);
	    }
	    //max=Math.max(max,right-left+1);
	}
	System.out.println(max);
	System.out.println(ans);
	}
}