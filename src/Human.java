public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    public Human(String firstName,String lastName,String gender,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    public static void sortByIncreaseOfAge(Human []humans){
        for (int i = 0; i <humans.length ; i++) {
            for (int j = 0; j <humans.length-i-1 ; j++) {
                if(humans[j].getAge()>humans[j+1].getAge()){
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }

    public static void printInfo(Human human){
        System.out.println("First name is: " + human.getFirstName());
        System.out.println("Last name is: " + human.getLastName());
        System.out.println("Age is: " + human.getAge());
        System.out.println("--------------------------\n");
    }
    public static Human returnTheYoungestFemale(Human []humans){
        int indexOfTheYoungestFemale = 0;
        for (int i = 0; i <humans.length ; i++) {
            if(humans[i].getGender()=="female"){
                indexOfTheYoungestFemale=i;
                break;
            }
        }
        for (int i = indexOfTheYoungestFemale; i <humans.length ; i++) {
            if(humans[i].getGender()=="female" && humans[i].getAge()<humans[indexOfTheYoungestFemale].getAge()){
                indexOfTheYoungestFemale = i;
            }
        }
        return humans[indexOfTheYoungestFemale];

    }
    public static void to_String(Human []humans){
        for (int i = 0; i <humans.length ; i++) {
            printInfo(humans[i]);
        }
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    //

    public static void main(String[] args) {
        Human []humans = new Human[]{
                new Human("Aram","Vanyan","male",18),
                new Human("Anna","Harutyunyan","female",14),
                new Human("Zara","Ohanyan","female",15),
                new Human("Kara","Sargsyan","female",10)
        };
        printInfo(returnTheYoungestFemale(humans));
        System.out.println();
        sortByIncreaseOfAge(humans);
        to_String(humans);
        //first change
    }
}
