package cn.itcast.demo;

public class demoAction {
	/**
	 * (1)每次访问servlet的时候，都会执行service方法 
	 * （2）每次访问action方法的时候，会默认访问execute方法。
	 */
	public String execute() {
		return "ok";
	}
}
