package factory;

public class ProfessionFactory {

    public Profession getProfession(String professionType){

        switch (professionType) {
            case "Doctor":
                return new Doctor();
            case "Engineer":
                return new Engineer();
            case "Teacher":
                return new Teacher();
            default:
                return null;
        }
    }

}
