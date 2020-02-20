package lab8;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timertask extends TimerTask {
	public static void main(String[] args) {
		TimerTask tt = new Timertask();
		Timer t = new Timer();
		t.scheduleAtFixedRate(tt, 0, 10*1000);
		System.out.println("Timer Task Started");
		try{
			Thread.sleep(120000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t.cancel();
		System.out.println("TimerTask cancelled");
		try{
			Thread.sleep(30000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("TimerTask started at:"+new Date());
		completeTask();
		System.out.println("TimerTask end at"+new Date());
		
	}
	public void completeTask(){
		try{
			Thread.sleep(20000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	

}
