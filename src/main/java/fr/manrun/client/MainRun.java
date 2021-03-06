package fr.manrun.client;

import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;

import jogamp.common.Debug;

public class MainRun {
	
	private static GLWindow win = null;
		
	public static void init() {
		GLProfile.initSingleton();
		GLProfile glProfile = GLProfile.get(GLProfile.GL2);
		
		GLCapabilities caps = new GLCapabilities(glProfile);
		
		win = GLWindow.create(caps);
		win.setSize(1280, 720);
		win.setResizable(false);
		
		win.setVisible(true);		

    win.setTitle("ManRun");
		System.out.println("Fin de l'affichage");

	}
	
	public static void main(String[] args) {
		init();
	}

	public static GLWindow getWin() {
		return win;
	}

	public static void setWin(GLWindow win) {
		MainRun.win = win;
	}

}
