package C04Interface;

public class C01Cat implements C01AnimalInterface1, C01AnimalInterface2{ // 인터페이스를 implements하는 이유는 강제로 이 메서드를 사용하게, 즉 프로그램의 통일을 위해
    @Override
    public void makeSound() {
        System.out.println("야옹야옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "와 " + b + "가 그루밍 합니다." ;
    }
}
