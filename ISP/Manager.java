public class Manager implements IManager{

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void hire() {
        System.out.println("Hiring new employee...");
    }

    @Override
    public void train() {
        System.out.println("Training new employee...");
    }

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }
    
}
