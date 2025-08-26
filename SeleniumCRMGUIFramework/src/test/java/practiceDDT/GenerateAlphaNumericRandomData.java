package practiceDDT;

public class GenerateAlphaNumericRandomData {

	public static void main(String[] args) {
		
		//size of the AlphanumericString
		int n=20;
		
		//choose a character random number from this String
		//boundary
		String AlphanumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		//create stringBuffer size of AlphaNumericString
		StringBuffer sb=new StringBuffer(n);
		
		for(int i=0;i<n;i++)
		{
			//create StringBuffer size of AlphanumericSring variable length
			int index=(int)(AlphanumericString.length()* Math.random());
			// add character one by one in end of sb
			sb.append(AlphanumericString.charAt(index));
		}
		System.out.println(sb);
		
		}

}
