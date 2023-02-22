package uniderictional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

//		here first we have to create Object for both the calsses
		Rajajinagar rajajinagar = new Rajajinagar();

//		Here **reference variable of Rajajinagar class set the value for Rajajinagar Table.
		rajajinagar.setPin_code(560010);
		rajajinagar.setAddress("Rajajinagar");
		rajajinagar.setBranches(3);

//		for rajajinagar creating one Object is enough because we have rajajinagar as Only one Table.
//		rajajinagar as only one Table.

//		** now we have to create Object 
//		class and after we have to set the value for **EACH OBJECT**

		BranchesofRajajinagar branchesofRajajinagar = new BranchesofRajajinagar();
		branchesofRajajinagar.setBranch_land_mark("Dr.Rajkuamr_road");
		branchesofRajajinagar.setBranch_name("Jspiders");
		branchesofRajajinagar.setBranche_course("Java,Devops,MERN");

		BranchesofRajajinagar branchesofRajajinagar2 = new BranchesofRajajinagar();
		branchesofRajajinagar2.setBranch_land_mark("CHORD_ROAD near to city");
		branchesofRajajinagar2.setBranch_name("Qspiders");
		branchesofRajajinagar2.setBranche_course("Manual_Testing,....");

		BranchesofRajajinagar branchesofRajajinagar3 = new BranchesofRajajinagar();
		branchesofRajajinagar3.setBranch_land_mark("Ammas pastirs");
		branchesofRajajinagar3.setBranch_name("PySpiders");
		branchesofRajajinagar3.setBranche_course("Python,Manual_testing");

//		Store all the Object address into single reference variable by 
//		using **List from Java.util package. and add into
//		List reference variable.

		List<BranchesofRajajinagar> lis_br = new ArrayList<BranchesofRajajinagar>();
		lis_br.add(branchesofRajajinagar);
		lis_br.add(branchesofRajajinagar2);
		lis_br.add(branchesofRajajinagar3);

//		After creating an Obect and set the value for each Objectives.

//		**Now we have given the Direction of mapping

//		OneTOMany, here one is Rajijanagar Table and Many are BranchesofRajajinagar

//		*** For Unidirectional
//		Ensure that mapping annotation provide or not in the relationship creating time.

		rajajinagar.setLst_br(lis_br);

		entityTransaction.begin();
		entityManager.persist(rajajinagar);
		entityManager.persist(branchesofRajajinagar);
		entityManager.persist(branchesofRajajinagar2);
		entityManager.persist(branchesofRajajinagar3);
		entityTransaction.commit();

		System.out.println("Successfuly OneToMany uniderictional Done");
	}
}
