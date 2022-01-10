package AZ;

public class ColumnNameFromGivenColNumber {
	String colName (long n)
    {
        // your code here
        int []arr = new int[10000];
    int i = 0;
    StringBuilder sb=new StringBuilder();
    while (n > 0)
    {
        arr[i] = (int)n % 26;
        n = n / 26;
        i++;
    }

    for(int j = 0; j < i - 1; j++)
    {
        if (arr[j] <= 0)
        {
            arr[j] += 26;
            arr[j + 1] = arr[j + 1] - 1;
        }
    }

    for(int j = i; j >= 0; j--)
    {
        if (arr[j] > 0)
        sb.append((char)('A' + arr[j] - 1));
           
    }
    return String.valueOf(sb);
    }
}
