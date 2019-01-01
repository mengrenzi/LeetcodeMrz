package Thread;

/**
 * ?????????????
 */
public class Stage extends Thread {

	public void run(){
		
		System.out.println("??????????????");
		//????????????????????????
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("???????????");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("?????????????????????????????...");
		
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		//???Runnable?????????
		Thread  armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"???");
		Thread  armyOfRevolt = new Thread(armyTaskOfRevolt,"????????");
		
		//??????????????????
		armyOfSuiDynasty.start();
		armyOfRevolt.start();
		
		//??????????????????????????
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("??????????????????????????????");
		
		Thread  mrCheng = new KeyPersonThread();
		mrCheng.setName("?????");
		
		System.out.println("??????????????????????????????????");
		
		//?????????
		//?????????
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*
		 * ?????????????????
		 */
		mrCheng.start();
		
		//?????????????????????????????????
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("??????????????????????????????????????????????????????????");
		System.out.println("??????????????????");
		
	}
	
	public static void main(String[] args) {
		new Stage().start();

	}

}
