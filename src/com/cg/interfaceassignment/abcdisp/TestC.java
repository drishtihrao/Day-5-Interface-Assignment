package com.cg.interfaceassignment.abcdisp;
/*
 * Class TestC is used to implement the methods defined in class C
 * the disp1 and disp2 methods are defined in the parent interfaces
 * these methods are overridden in class C and hence can be called using an object of class C
 */
public class TestC {
	public static void main(String args[]) {
		C c = new C();
		c.disp1();
		c.disp2();
	}
}
