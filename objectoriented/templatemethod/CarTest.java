package objectoriented.templatemethod;

public class CarTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		// 시동을 켭니다.
		// 자율 주행합니다.
		// 자동차가 스스로 방향을 바꿉니다.
		// 스스로 멈춥니다.
		// 시동을 끕니다.
		// 자동 세차 합니다.
		
		System.out.println("====================");
		Car manualCar = new ManualCar();
		manualCar.run();
		// 시동을 켭니다.
		// 사람이 운전합니다.
		// 사람이 핸들을 조작합니다.
		// 브레이크를 밟아서 정지합니다.
		// 시동을 끕니다.
	}

}
