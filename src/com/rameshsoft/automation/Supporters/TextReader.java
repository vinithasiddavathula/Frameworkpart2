package com.rameshsoft.automation.Supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rameshsoft.automation.Exceptions.FrameworkExceptions;
import com.rameshsoft.automation.Utilities.Filepaths;

public class TextReader {
	
	private String Filepath;
	private File file;
	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	
	
	
	
	
	
	public TextReader(String Filepath) throws IOException, FrameworkExceptions {
		this.Filepath=Filepath;
		 file = new File(Filepath);
		boolean status = file.createNewFile();
		if(status) {
			System.out.println("new file created");
		}
		else {
			FrameworkExceptions exception = new FrameworkExceptions("existing file");
			throw exception;
			//System.out.println("existing file");
		}
		 fw = new FileWriter(file);
		 bw = new BufferedWriter(fw);
		 fr = new FileReader(file);
		 br = new BufferedReader(fr);
		}
	public void writedata(String data) throws IOException, FrameworkExceptions {
		if(bw!=null) {
			bw.write(data);
			bw.newLine();
			bw.flush();
		}
		else {
			System.out.println("bw is pointing to null");
			FrameworkExceptions exception = new FrameworkExceptions("bw is pointing to null");
			throw exception;
		}
	}
	
	public String getdata() throws IOException, FrameworkExceptions {
		String data = "";
		if(br!=null) {
			br.ready();
			data = br.readLine();
		}
		else {
			System.out.println("br is point to null");
			FrameworkExceptions exception = new FrameworkExceptions("br is point to null");
			throw exception;
		}
		return data;
	}
	
	public List<String> gettotaldata() throws IOException, FrameworkExceptions{
		List<String> totaldata = new ArrayList<String>();
		if(br!=null) {
			while(br.ready()) {
				String data = br.readLine();
				totaldata.add(data);
			}
		}
			else {
				System.out.println("br is pointing to null");
				FrameworkExceptions exception = new FrameworkExceptions("br is pointing to null");
				throw exception;
			}
			
		return totaldata;
	}
	
	
	/*public static void main(String[] args) throws IOException, FrameworkExceptions {
		TextReader tr = new TextReader(Filepaths.Textpath);
		tr.writedata("String");
		tr.writedata("int");
		tr.writedata("boolean");
		tr.writedata("hello");
		System.out.println(tr.getdata());
		System.out.println(tr.getdata());
		System.out.println(tr.getdata());

	}*/

}
