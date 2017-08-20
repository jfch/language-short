interface Reviewer {
   public void review();
   public void comment();
}

public class InterfaceSample implements Reviewer {

	public static void main(String[] args) {
		  //TODO Auto-generated method stub   
		 InterfaceSample person = new InterfaceSample();
		 person.review();
		 person.comment();
		 System.out.println("sample from class " + person.showclass());	
	}

	@Override
	public void review() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceSample is reviewing");
	}

	@Override
	public void comment() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceSample is commenting");	
	}
	
	public int showclass(){
	      return 273;
	 }	
}
