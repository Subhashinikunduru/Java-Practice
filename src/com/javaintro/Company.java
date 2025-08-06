package com.javaintro;

public class Company {
	String empName;
	int experience;
	float Bonus;

	Company(String empName, int years_of_experience) {
		this.empName = empName;
		this.experience = years_of_experience;
	}

	void calBonus() {
		if (experience < 0)
			System.out.println("invalid experience");
		else {
			Bonus = (experience >= 0 && experience <= 1) ? 0
					: (experience >= 2 && experience <= 4) ? 5000 : (experience >= 5 && experience <= 9) ? 10000 : 20000;
		}
	}
	void show() {
		System.out.println("empname:"+empName);
		System.out.println("experience:"+experience);
		System.out.println("bonus:"+Bonus);
	}

	public static void main(String[] args) {
		Company c = new Company("abcd", -5);
		c.calBonus();
        c.show();
	}

}
