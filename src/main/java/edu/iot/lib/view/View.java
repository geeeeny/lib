package edu.iot.lib.view;

public class View extends AbstractView{
	
	// 싱글톤(Singletone) 패턴
	private View() {
	}

	private static View view = new View();

	public static View getInstance() {
		return view;
	}

}
