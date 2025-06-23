package Practice.C03Inheritance;

public class AnimalMain {
    public static void main(String[] args) {
//        상속관계의 경우 부모클래스의 타입을 자식클래스의 객체의 타입으로 지정하는 것이 가능
//        부모클래스의 타입을 지정 시, 부모클래스에서 정의된 메서드만 사용 가능.
        Animal1 dog1 = new Dog();
        dog1.sound1();

//        Dog 타입의 객체를 선언하면 어떨까?
//        Dog 타입에는 부모객체의 메서드를 오버라이딩 한 sound1
//        Dog 클래스에서 정의한 메서드 sound2가 있다.
//        sound1, sound2 둘 다 사용할 수 있다.
        Dog dog2 = new Dog();
        dog2.sound1();
        dog2.sound2();
    }
}

class Animal1 {
    void sound1() {
        System.out.println("동물이 소리를 냅니다.");
    }

}

class Dog extends Animal1 {
    @Override
    void sound1() {
        System.out.println("멍멍");
    }
    void sound2() {
        System.out.println("컹컹컹컹");
    }
}

class Cat extends Animal1 {
    @Override
    void sound1() {
        System.out.println("야옹");
    }
    void sound2() {
        System.out.println("미야옹미야옹");
    }
}
