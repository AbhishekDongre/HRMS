package selenium_program;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;


public class EXP_EXCEL {

	public static void main(String[] args) throws Exception{

		FileInputStream file = new FileInputStream("C:\\Jarfiles\\My Data\\Test Data.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		int row = 4;
		String Sr = st.getCell(0,row).getContents();
		System.out.println(Sr);
		String EmpId =st.getCell(1,row).getContents();
		System.out.println(EmpId);
		String EmpName=st.getCell(2,row).getContents();
		System.out.println(EmpName);
		String Salary =st.getCell(3,row).getContents();
		System.out.println(Salary);
	
		
	}

}
