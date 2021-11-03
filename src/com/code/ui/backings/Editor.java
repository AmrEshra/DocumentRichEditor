package com.code.ui.backings;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

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
		writeToFile(this.textArea);
	}

	private void writeToFile(String textArea) {
		try {
		
			FileOutputStream outputStream = new FileOutputStream("D://RichEditor//"+ Math.random() + ".html");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
             
            bufferedWriter.write(textArea);
            bufferedWriter.close();            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
}
