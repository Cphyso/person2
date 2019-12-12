
    public class Person {

        private  String name;
        private int age;
        private String gender;
        private String[] interests;
        public Person(String name, int age, String gender, String[] interests){
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.interests = interests;
        }

        // Driver
        public  static void main(String[] args){
            // the output has been slightly edited to accommodate the gender variable that has been declared but not used in the problem description
            Person person = new Person("Ryan", 30, "male", new String[] {"being a hardarse", "agile", "ssd hard drives"});
            String greeting = person.hello();
            System.out.println(greeting);
        }

        private String hello(){
            return "Hello, my name is " + name + " and I am "+ age + " year old " + gender + ". My interests are " + getInterest() + "." ;
        }

        private String getInterest(){
            StringBuilder inter = new StringBuilder();     // reading the array with interests one by one and storing on inter for formatted output
            int len = interests.length;
            for(int i = 0 ; i < len-1; i++) {            // extract all the elements except the last element to carter for " and [insert last element]." like in the expected output.
                inter.append(interests[i]).append(", ");
            }
            return inter + "and " + interests[--len];       // --len get the last element in the array of interests
        }
    }

