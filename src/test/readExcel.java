package test;

public class readExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// download poi -- http://poi.apache.org/download.html
		// poi examples -- https://poi.apache.org/spreadsheet/quick-guide.html
		
		Xls_Reader xl= new Xls_Reader("C:\\magnum\\VimanNagar\\src\\test\\test.xlsx");
		
	int row=	xl.getRowCount("Login");
		System.out.println("Rows : "+row);
		int cols= xl.getColumnCount("Login");
		System.out.println("cols : "+cols);
		
		
		
		System.out.println(xl.getCellData("Login", 2, 5));
		
		System.out.println("___________________________________");
		
		
		for(int i=0;i<=row;i++){
			for(int j=0;j<cols;j++){
				System.out.println(xl.getCellData("Login", j, i+2));
			}
		}
		
		System.out.println("___________________________________");
		
		Object[][] data= new Object[row][cols];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
			data[i][j]=	xl.getCellData("Login", j, i+2);
			}
		}
		
		System.out.println("_______________display data[][]____________________");
		
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[0].length;j++){
			System.out.println(data[i][j]);
			}
		}
		

	}
	
	
	public static Object[][] getData(Xls_Reader xls, String sheetName){
		
		int rows= xls.getRowCount(sheetName);
		int cols= xls.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows][cols];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
			data[i][j]=	xls.getCellData("Login", j, i+2);
			}
		}
		
		return data;
		
	}
	
	
	
	

}
