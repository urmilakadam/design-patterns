package abstract_factory;

public class AbstractFactoryPatternMainClass {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProvider.getProfession(false);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();

    }
}
