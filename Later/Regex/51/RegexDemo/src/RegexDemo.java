import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo
{

	public static void main(String[] args)
	{

		Pattern pattern = Pattern.compile("^(.+)@gmail.com$");

		List<String> emailList = Arrays.asList("peter@yahoo.com",
				"bob@gmail.com", "juli@gmail.com",
				"david@rediff.com");

		for (String email : emailList)
		{
			Matcher matcher = pattern.matcher(email);

			if (matcher.matches())
			{
				System.out.println(email);
			}
		}
	}

}
