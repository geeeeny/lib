package edu.iot.lib.app;

import edu.iot.lib.view.MenuBar;

public class Application {
	protected MenuBar mainMenu;
	
	public Application() {}
	
	public void init() {
		createMenu();
	}
	
	public void createMenu() {}
	
	public void run() {
		while(true) {
			try {
				mainMenu.execute();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void exit() {
		System.out.println("종료합니다.");
		System.exit(0);
	}

}
