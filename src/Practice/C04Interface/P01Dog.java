package Practice.C04Interface;

public class P01Dog implements P01AnimalInterface1 {
    @Override
    public void makeSound() {
        System.out.println("멍멍멍");
    }
    @Override
    public String play1(String a, String b) {
        return a + "와 " + b + "가 산책을 합니다.";
    }

    public void makeSound2() {
        System.out.println("컹컹");
    }
}
