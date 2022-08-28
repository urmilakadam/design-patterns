package abstract_factory;

public class TraineeAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String professionType) {
        switch (professionType) {
            case "Trainee Engineer":
                return new TraineeEngineer();
            case "Trainee Teacher":
                return new TraineeTeacher();
            default:
                return null;
        }
    }
}
