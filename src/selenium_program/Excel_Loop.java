package selenium_program;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;


public class Excel_Loop {

	public static void main(String[] args) throws Exception{
    FileInputStream File = new FileInputStream("C:\\Jarfiles\\My Data//WriteData.xlsx");
    Workbook wb = Workbook.getWorkbook(File);
    Sheet st=wb.getSheet(0);
    int rowcount=st.getRows();
    System.out.println("rowcount");
    for(int i=1;i<rowcount;i++)
    {
    String Sr = st.getCell(0,i).getContents();
    System.out.println(Sr);
    String EmpId = st.getCell(1,i).getContents();
    System.out.println(EmpId);
   String EmpName = st.getCell(2,i).getContents();
   System.out.println(EmpName);
    String Salary  = st.getCell(3,i).getContents();
    System.out.println(Salary);
    
    }
    
    

	}

}
