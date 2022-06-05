package j_collection;

public class Grades {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int soc;
	private int sci;
	private int oracle;
	private int java;
	private int rank;
	public Grades() {
		
	}
	
	
	public Grades(String name, int kor, int eng, int math, int soc, int sci, int oracle, int java) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.soc = soc;
		this.sci = sci;
		this.oracle = oracle;
		this.java = java;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}
	
	public int getSum() {
		return kor + eng + math + soc + sci + oracle + java;
	}
	
	public double getAvg() {
		return Math.round((double)getSum() / 7*100)/100.0;
	}
	
	private int getRank(int rank) {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%f\t%d",name,kor,eng,math,soc,sci,oracle,java,getSum(),getAvg(),getRank(rank));
	}

	

}
