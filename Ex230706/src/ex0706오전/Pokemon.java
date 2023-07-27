package ex0706오전;

public class Pokemon {

	// pokemon의 필드
	private String name;
	private String type;
	private String gender;
	private int hp;
	private int atk;
	private int dpd;
	private String skill;

	// getter 메소드
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getGender() {
		return gender;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDpd() {
		return dpd;
	}

	public String getSkill() {
		return skill;
	}

	// 생성자 메소드
	public Pokemon(String name, String type, String gender, int hp, int atk, int dpd, String skill) {
		super();
		this.name = name;
		this.type = type;
		this.gender = gender;
		this.hp = hp;
		this.atk = atk;
		this.dpd = dpd;
		this.skill = skill;
	}
}
