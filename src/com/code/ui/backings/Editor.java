package com.code.ui.backings;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.docx4j.convert.in.xhtml.XHTMLImporterImpl;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;

@ManagedBean(name = "editor")
@RequestScoped
public class Editor {
	String textArea = "<p style=\"text-align: center;\">\r\n" + 
			"	السلام عليكم ورحمة الله</p>\r\n" + 
			"<h3 style=\"color: red; text-align: center;\">\r\n" + 
			"	<img alt=\"angry\" height=\"20\" src=\"http://localhost:7001/DocumentRichEditor/org.richfaces.resources/javax.faces.resource/org.richfaces.ckeditor/plugins/smiley/images/angry_smile.gif\" title=\"angry\" width=\"20\" />test test testfdsfsdfsdfds</h3>\r\n" + 
			"<p style=\"text-align: center;\">\r\n" + 
			"	السلام عليكم ورحمة الله</p>\r\n" + 
			"<p style=\"text-align: center;\">\r\n" + 
			"	السلام عليكم ورحمة الله</p>\r\n" + 
			"<h3 style=\"text-align: center;  color: red; \">\r\n" + 
			"	السلام عليكم ورحمة الله</h3>\r\n" + 
			"<table border=\"1\" cellpadding=\"1\" cellspacing=\"1\" style=\"width:500px;\">\r\n" + 
			"	<tbody>\r\n" + 
			"		<tr>\r\n" + 
			"			<td>\r\n" + 
			"				wtewerert</td>\r\n" + 
			"			<td>\r\n" + 
			"				tert</td>\r\n" + 
			"		</tr>\r\n" + 
			"		<tr>\r\n" + 
			"			<td>\r\n" + 
			"				tretert</td>\r\n" + 
			"			<td>\r\n" + 
			"				retewr</td>\r\n" + 
			"		</tr>\r\n" + 
			"	</tbody>\r\n" + 
			"</table>\r\n" + 
			"<p>\r\n" + 
			"	&nbsp;</p>";

	public String getTextArea() {
		return textArea;
	}

	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
}
