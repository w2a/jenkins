package utility;

import core.Page;

public class TestUtil extends Page {
	
	
	
	public static boolean isExecutable(String tcid){
		
		
		for(int rowNum=2; rowNum<=excel.getRowCount("test_suite"); rowNum++){
			if(excel.getCellData("test_suite", "TCID", rowNum).equals(tcid)){
				if(excel.getCellData("test_suite", "Runmode", rowNum).equalsIgnoreCase("Y")){
					
					return true;
				}else{
					
					return false;
				}
				
			}
			
			
			
		}
		return false;
	}

}
