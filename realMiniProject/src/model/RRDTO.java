package model;

public class RRDTO {

	private String stat;
	private int statResult;

	public RRDTO(String stat, int statResult) {
		super();
		this.stat = stat;
		this.statResult = statResult;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public int getStatResult() {
		return statResult;
	}

	public void setStatResult(int statResult) {
		this.statResult = statResult;
	}

}
