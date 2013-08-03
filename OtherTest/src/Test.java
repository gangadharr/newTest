import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test {

	public static void test(){
		Byte b = new Byte((byte)1);
		Short s = new Short((short)1);
		Integer i = new Integer(1);
		Long l = new Long(1L);
		Double d = new Double(1D);
		String st = "a";
		
		List<String> sL = new ArrayList<>();
		sL.add("A");
		sL.add("B");
		sL.add("C");
		List<Long> lL = new ArrayList<>();
		lL.add(1L);
		lL.add(2L);
		lL.add(3L);
		System.out.println(convertListToDelimiteredString(sL, ","));
		System.out.println(convertListToDelimiteredString(lL, ","));
		
		System.out.println( " " + b + s + i + l + d + st );
		StringBuilder sta = new StringBuilder();
		System.out.println(sta.toString());
	}
	
	
	 public static  String convertListToDelimiteredString(List<? super Long> list, String delimiter) {
		 StringBuffer sb = new StringBuffer();
		 for(Iterator<? extends Object> iter =  list.iterator(); iter.hasNext(); ){
			 sb.append(iter.next());
			 if(iter.hasNext()){
				 sb.append(delimiter);
			 }
		 }
		 return sb.toString();
	 }
	 
	 
	 
	 public static void main(String[] args){
		 test();
	 }
	
}
