package odevjava1;

public class UserManager {
	public void addLessonToUser(Lesson lesson, User user) {
		System.out.println(
				user.name + " " + " kullanıcının ders listesine " + lesson.name + " kursu eklendi!");
		System.out.println("------------------");
	}

	public void remove(Lesson lesson, User user) {
		System.out.println(user.name + " " + " kullanıcının ders listesinden " + lesson.name
				+ " kursu çıkarıldı!");
		System.out.println("-------------------");
	}
}
