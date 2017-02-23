package br.com.fsinfo.pojo;

import br.com.util.Commands;

public abstract class AbstractOperation implements Operation {

	public AbstractOperation(Commands command){
		this.command = command;
	}
	
	private Commands command;
	private String fromPath;
	private String toPath;
	
	public String getFromPath() {
		return fromPath;
	}
	public void setFromPath(String fromPath) {
		this.fromPath = fromPath;
	}
	public String getToPath() {
		return toPath;
	}
	public void setToPath(String toPath) {
		this.toPath = toPath;
	}
	public Commands getCommand() {
		return command;
	}
	
}
