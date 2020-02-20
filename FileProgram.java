package lab8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class CopyDataThread extends Thread{
	BufferedReader br;
	FileWriter fw;
	CopyDataThread(BufferedReader br,FileWriter fw){
		this.br=br;
		this.fw=fw;
		}
	public void CopyDataThread1() throws InterruptedException {
	try {
		
		int s=0;
		int count=0;

		while ((s = br.read()) != -1) { // read a line
			fw.write((char)s);
			if((char)s!=' ') {
			//fw.write(" \n");
			count++;
			}
			if(count==10) {
				fw.write(" 10 characters are copied");
				Thread.sleep(5000);
				count=0;
				}
			
			System.out.println((char)s);// write to output file
			fw.flush();
		}
		br.close();
		fw.close();
        System.out.println("file copied");
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
}
}
public class FileProgram{
	 public static void main(String[] args) throws IOException, InterruptedException {
		 FileReader fr = new FileReader("C:/Users/HP1/source.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:/Users/HP1/target.txt", true);
			CopyDataThread ct=new CopyDataThread(br,fw);
			ct.start();
			ct.CopyDataThread1();
			
		}
	}
	