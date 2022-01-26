package MS;
import java.util.*;
import java.lang.*;

public class PossibleWords {
	private static List<String> printWords(int[] numbers,int len,int numIndex,String s)
	{
		 Character[][] a = null;

		if(len == numIndex)
			return new ArrayList<>(Collections.singleton(s));

			List<String> res = new ArrayList<>();

			for(int i = 0;i < a[numbers[numIndex]].length; i++){
				String sCopy =
						String.copyValueOf(s.toCharArray());
				sCopy = sCopy.concat(a[numbers[numIndex]][i].toString());
				res.addAll(printWords(numbers, len,numIndex + 1,sCopy));
			}
			return res;
}
}
