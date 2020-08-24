# enum 활용(RoleType)

RoleType을 만들 때 열거형(enum)을 활용해보자.

<!--more-->

## enum

enum을 쓰기 전에는 상수를 만들 때 final static 변수를 선언하여 사용하였다.<br>
사용자의 Model을 만들 때 사용자의 네 가지 RoleType을 정해야 한다고 가정하자.<br>
사용자는 `ADMIN`, `GUEST`, `MANAGER`, `MEMBER` 네 가지의 Role이 있다.<br>

```java
	public static final String ADMIN = "ADMIN";
	public static final String GUEST = "GUEST";
	public static final String MANAGER = "MANAGER";
	public static final String MEMBER = "MEMBER";
```

위와 같은 방식으로 정적 상수를 만든 뒤, 필요한 곳에서 할당할 수 있다.<br>

```java
public class RoleType {
	public static final String ADMIN = "ADMIN";
	public static final String GUEST = "GUEST";
	public static final String MANAGER = "MANAGER";
	public static final String MEMBER = "MEMBER";

	public static void main(String[] args) {
		String user1 = RoleType.ADMIN;
		String user2 = RoleType.GUEST;
	}
}
```

static으로 선언되어 있기 때문에, 굳이 인스턴스를 생성하지 않아도 클래스의 이름으로 변수를 참조할 수 있다.<br>
따라서 위와 같은 방법으로 RoleType을 할당해 줄 수 있다.<br>

## 클래스형의 한계

하지만, 만약 프로그래머가 RoleType 클래스를 참조해서 역할을 할당하면 좋겠지만, 그게 아닌 임의의 값을 할당했을 때 실수를 방지할 방법이 없다.<br>

> String user3 = "MEMBERRR";

위와 같이 String 타입에서 발생할 수 있는 오타를 방지할 방법이 없다.<br>

## enum 사용

`enum`을 사용해서 RoleType을 만들어보자.<br>

```java
enum enumRoleType {
	ADMIN, GUEST, MANAGER, MEMBER
}
```

위와 같이 enum을 만들고 각 RoleType을 열거해 주면 사용할 수 있다.<br>

```java
package com.vividswan.blog.test;

public class RoleType {
	public static final String ADMIN = "ADMIN";
	public static final String GUEST = "GUEST";
	public static final String MANAGER = "MANAGER";
	public static final String MEMBER = "MEMBER";

	public static void main(String[] args) {
		String user1 = RoleType.ADMIN;
		String user2 = RoleType.GUEST;

		enumRoleType user3 = enumRoleType.MANAGER;
		enumRoleType user4 = enumRoleType.MEMBER;
	}
}

enum enumRoleType {
	ADMIN, GUEST, MANAGER, MEMBER
}
```

새로 만든 `user3, user4`의 타입이 enum이므로 그 타입에 맞게 할당할 값을 준수해야 한다.<br>
이러한 방식으로 실수를 사전에 방지할 수 있다.<br>