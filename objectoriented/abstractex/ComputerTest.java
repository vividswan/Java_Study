package objectoriented.abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new DeskTop();
		computer.display(); // DeskTop display 출력
		computer.turnOff(); // 가상함수에 의해 desktop turnoff 출력
		
		NoteBook myNote = new MyNoteBook();
		
	}

}
