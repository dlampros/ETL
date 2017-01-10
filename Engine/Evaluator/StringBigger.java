package Evaluator;


public class StringBigger extends Evaluator_1T{
	private String checkVal;
	
	
	public StringBigger(int pos, String val){
		super(pos);
		
		checkVal = val;
	}
	
	
	@Override
	public boolean performCheck(String tuple) {
		String[] strtok = tuple.split("\\|");
		if(strtok[position].compareTo(checkVal) > 0)
			return true;
		
		return false;
	
	}
	
}
