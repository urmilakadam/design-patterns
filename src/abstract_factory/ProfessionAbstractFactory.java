package abstract_factory;

public class ProfessionAbstractFactory extends AbstractFactory{

    @Override
    public Profession getProfession(String professionType){

        switch (professionType) {
            case "Engineer":
                return new Engineer();
            case "Teacher":
                return new Teacher();
            default:
                return null;
        }
    }

}
