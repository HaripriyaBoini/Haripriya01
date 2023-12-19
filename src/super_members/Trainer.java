package super_members;

public class Trainer extends Employee {
	int id;
	Trainer(int employeeId,int trainerId ){
		super.id=employeeId;
		      id=trainerId;
		}
	
		public void show() {
			super.show();			
			System.out.println("TrainerId id="+id);
			
		}
	}


