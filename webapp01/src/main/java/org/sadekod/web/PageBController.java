package org.sadekod.web;

import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;


@ManagedBean(name="PageB")
@SessionScoped
public class PageBController implements Serializable {

	private static final long serialVersionUID = 1L;
	private Random rand;

//	public int getRandomNumber() {
//		System.out.println("[DEBUG] #0001");
//		if(rand == null)
//			rand = new Random();
//		return rand.nextInt(100) + 1;
//	}

/* 	public String getRandomNumber(){
		return "Test";
	} */

}