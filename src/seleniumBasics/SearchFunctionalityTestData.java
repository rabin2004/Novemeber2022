package seleniumBasics;

import org.testng.annotations.DataProvider;

public class SearchFunctionalityTestData {

	@DataProvider
	public String[] negativeSearchFunctionalityData() {
		String[] data = {	"329805723097590ujskdjflksdfjvnlksdvnlksdnvlksdvn",
							"329805723097591ujskdjflksdfjvnlksdvnlksdnvlksdvn",
							"329805723097592ujskdjflksdfjvnlksdvnlksdnvlksdvn"
							};
		return data;
	}
}
