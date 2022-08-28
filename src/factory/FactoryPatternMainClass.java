package factory;

public class FactoryPatternMainClass {
    public static void main(String[] args) {

        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession profession = professionFactory.getProfession("Engineer");
        profession.print();

    }
}
