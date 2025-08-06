package casestudy;

public class CaseStudy1 {
	int empId;
	int projectsCompleted;
	int overtimeHours;
	double basicSalary;
	float annualSalary;
	 float Bonus;

	public CaseStudy1(int empId, int projectsCompleted, int overtimeHours, double basicSalary) {
		this.empId = empId;
		this.projectsCompleted = projectsCompleted;
		this.overtimeHours = overtimeHours;
		this.basicSalary = basicSalary;
	}

	void calBonus() {
		Bonus = projectsCompleted > 3 && overtimeHours >= 10 ? (float) ((basicSalary * 10) / 100)
				: projectsCompleted > 3 || overtimeHours >=10 ? (float) ((basicSalary * 5) / 100) : 0;
		projectsCompleted++;
	}
	void totalSal() {
		annualSalary=(float) (basicSalary+Bonus);
		
	}
	void show() {
		totalSal();
		System.out.println(empId);
		System.out.println(projectsCompleted);
		System.out.println(annualSalary);
		
	}

	public static void main(String[] args) {
		CaseStudy1 c = new CaseStudy1(1,9,5,50000);
		c.calBonus();
		c.show();
	
		
	}

}
