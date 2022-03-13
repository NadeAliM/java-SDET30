package java_practice;

public class Wrapper_Classs {
	public static void main(String[] args) {
		byte b=100;
		int k=200;
		
		int a=new Integer(1000);
//		System.out.println(a);
		int arr[]= {a};
		System.out.println(a+" value");
		
		//	i=b;
		Object ob[]= {b,k};
		for(int i=0;i<ob.length;i++) {
			System.out.print(ob[i]+" ");
		}
	}
}
