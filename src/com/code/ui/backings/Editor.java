package com.code.ui.backings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "editor")
@RequestScoped
public class Editor {
	String textArea;

	public String getTextArea() {
		return textArea;
	}

	public void setTextArea(String textArea) {
		this.textArea = textArea;
		saveToWord(this.textArea);
	}

	private void saveToWord(String textArea2) {
		// TODO Auto-generated method stub
		
	}

}
