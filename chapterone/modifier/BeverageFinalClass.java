package chapterone.modifier;
public final class BeverageFinalClass{

	public void importantMethod(){	
		System.out.println("Important Method From Beverage");
	}
	
	public static void main(String[] args){
		
		BeverageFinalClass bfc = new BeverageFinalClass();
		bfc.importantMethod();
	
	}

}
