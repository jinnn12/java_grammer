package Practice.C04Interface;

public class P01Cat implements P01AnimalInterface1 {
    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }
    @Override
    public String play1(String a, String b) {
        return a + "가 " + b + "를 그루밍합니다." ;
    }

    public void makeSound2() {
        System.out.println("미야옹");
    }
}
