package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrangehrmMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Keyword 
{
	@Test
	public void driver() throws IOException
	{
		String res=null;
		OrangehrmMaster om=new OrangehrmMaster();
		String xlpath="F:\\FastTrack\\SeleniumProject\\src\\testData\\Keyword.xlsx";
		String xlout="F:\\FastTrack\\SeleniumProject\\src\\results\\keyres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						
						switch (key)
						{
						case "Launch":
							res=om.org_Launch("http://orangehrm.qedgetech.com");
							
							break;
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":	
							res=om.org_Empreg("QEdge", "Tech");
							break;
						case "Usereg":
							res=om.org_Userreg("QEdge Tech", "QEdge123456", "QEdge123456", "QEdge123456");
							break;
						case "Ulogin":
							res=om.org_Login("QEdge123456", "QEdge123456");
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						
						ws1.getRow(j).createCell(4).setCellValue(res);
						
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
