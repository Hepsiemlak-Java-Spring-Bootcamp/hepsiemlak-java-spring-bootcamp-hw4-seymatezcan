import java.util.List;

import com.emlakburada.dao.AdvertRepository;
import com.emlakburada.dao.UserRepository;
import com.emlakburada.entity.Advert;
import com.emlakburada.entity.User;

public class Main {

	public static void main(String[] args) {

		UserRepository userRepository = new UserRepository();
		userRepository.save(prepareUser(1, "cem","cem@gmail.com"));
		userRepository.save(prepareUser(2, "emir","emir@gmail.com"));

		System.out.println("--find all user--");

		List<User> users = userRepository.findAll();

		users.stream().forEach(user -> System.out.println(user.toString()));

		System.out.println("--find user--");

		User foundUser = userRepository.findOne(2);

		System.out.println(foundUser.toString());


	}

	private static User prepareUser(int id, String name, String email) {
		User user = new User();
		user.id = id;
		user.name = name;
		user.email = "seymatezcan@gmail.com";
		user.bio = "bio";
		return user;
	}

}
