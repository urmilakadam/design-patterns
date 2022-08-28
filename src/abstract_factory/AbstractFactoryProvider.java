package abstract_factory;

public class AbstractFactoryProvider{

    public static AbstractFactory getProfession(boolean isTrainee) {
       if(isTrainee){
           return new TraineeAbstractFactory();
       }
       return new ProfessionAbstractFactory();
    }
}
