
public class test {

	public static void main(String[] args) {
		// To get largest or second largest number
int arr[] = {2,3,66,4,77,8,70};
int g = 0;
int s = 0;
for(int i = 0 ; i<arr.length; i++)
{
	if(g<arr[i])
	{
		s = g;
		g=arr[i];
	}
	if(g>arr[i] && s<arr[i])
	{
		s = arr[i];
	}
}

System.out.println(s +" "+g);
	}

}
