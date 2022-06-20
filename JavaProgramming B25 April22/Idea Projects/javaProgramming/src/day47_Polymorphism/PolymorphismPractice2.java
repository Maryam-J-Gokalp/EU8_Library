package day47_Polymorphism;

import day43_OOPAbstractionIntro.employeeTask.Developer;
import day43_OOPAbstractionIntro.employeeTask.Employee;
import day43_OOPAbstractionIntro.employeeTask.Tester;
import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {

    public static void main(String[] args) {
        //FirstArray is given from the day 43 list
        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28, 'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F', 4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Developer("Gulistan", 26, 'F', 6, "Web Developer", 130000),
                new Tester("Yuliya", 28, 'F', 7, "QE", 120000),
                new Developer("Cassendra", 29, 'F', 8, "Front-end Developer", 140000),
                new Tester("Aygu", 25, 'F', 9, "SDET", 130000),
                new Developer("Sophie", 26, 'F', 10, "Back-end Developer", 150000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Developer("Fady", 26, 'F', 12, "Full Stack Developer", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Developer("Enes", 26, 'M', 14, "Full Stack Developer", 142000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000),
        };

        //The4each loop below we use employee as data type coz we can reference to everyObject to the EmployeeObject
        List<Employee> scrumMembers = new ArrayList<>(); //<--Iterate theArrayListAbove Using4eachLoop 2GetEachEmployee

        for (Employee employee : employees) { //<--ParentClassCanReference 2allChildObjectCouldBe tester,developer etc..
            //UseInstanceOfKeyword 2verifyIfEmployeeIsTester if(employee instanceof Tester||employee instanceof Developer)
            //IfCondition isTrueMeansEmployeeNeedToAddIntoTheListAbove --> List<Employee> scrumMembers = new ArrayList<>();
            if (employee instanceof Tester || employee instanceof Developer) {  //VerifyEmployeeIsTesterUseInstanceKeyword
                scrumMembers.add(employee);//<--Then In scrumMembers.add(employee); tpo add the employee
            }
        }

        System.out.println("-------------------------------------------------------");
        //NextUNeedToGetTheListOfTester & addEmployeeFromAboveList-->List<Employee> scrumMembers = new ArrayList<>()
        //ToThe TesterUNeed ToAddToTheListOfTester, TheReferenceTypeOfTheListOfEmployee UCanAddInto theList byCasting
        //IfScrumMemberIsTester INeedToAddIntoArrayListOfTester U getCompilerErrorCoz -->tester.add(scrumMember);
        //ICannotAssignEmployeeToThe SuperReferenceType coz I need toDoCasting-->testers.add((Tester) scrumMember);
        //Then I will be Able to addInto the List coz Parent canReference child&Child cannot reference parent
        //Is that's why referenceType I need To CastInto Tester in order to addInto the list of tester
        List<Tester> testers = new ArrayList<>(); //2AddEmployeeListUMustCastWhenYouAdd
        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) { //ToVerifyList ContainTester&Developer UseArrayListOfEmployee
            if (scrumMember instanceof Tester) { //<--IfScrumMemberIsTesterAddIntoTheList UseInstanceKeyword
                testers.add((Tester) scrumMember); //<--IfScrumMemberIsTester NeedToAddIntoArrayListOfTester
            }
            //SimilarToThe aboveApproach if(scrumMember instanceof Developer){ then I addScrumMemberIntoDeveloperList
            //ReferenceTypeOfScrumMemberIsEmployee ButArrayListOnlyGetAccessDevelopers INeedToCastEmployeeToDeveloper
            if (scrumMember instanceof Developer) {
                developers.add((Developer) scrumMember); //<--INeedToCastEmployeeToDeveloperToAddToTester&DeveloperList
            }
        }
        System.out.println("-------------------------------------------------------");
        //COMPLETE BY YOURSELF WHICH TESTER HAS
        //WhichDeveloper has the maximum Salary? Should apply the same method as tester
        //<--which tester has the maximum salary?//LetsAssumeTheTesterHasThe maximumSalary&ByDefaultLestAssume1stType
        //HasTheMaxim Salary&The CompareWithTheSalaryOf theRemainingTester
        // If TesterHasAGreaterSalaryI shouldReplaceWithThisOn


        // print out information about all Employee object
        Tester testerWithMaxSalary = testers.get(0);

        for (Employee eachTester : testers) {

            if (testerWithMaxSalary instanceof Tester) {
                if (eachTester.getSalary() >= 110000 && eachTester.getSalary() <= 105000) {
                    System.out.println(testerWithMaxSalary);

                }
                Developer developerWithMaxSalary = developers.get(0);
                for (Employee eachDeveloper : developers) {
                    if (developerWithMaxSalary instanceof Developer) {
                        if (eachDeveloper.getSalary() >= 135000 && eachTester.getSalary() <= 135000) {
                            System.out.println(developerWithMaxSalary);
                        }

                    }

                }
            }

        }
    }
}

     ///   2.4 which tester has the maximum salary?
       // 2.5 which developer has the maximum salary?


/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};
    		(import them from day43 package)
	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();
        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();
        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();
        2.4 which tester has the maximum salary?
        2.5 which developer has the maximum salary?
 */