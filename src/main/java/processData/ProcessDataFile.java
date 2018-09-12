package processData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProcessDataFile {
	
	/**
	 * This method initiate the load process of the file that contains the data than
	 * it will load, also you can update de SPLIT_PARAM if you have a diferent item for delimit
	 * each field on the line
	 * @author yohan.cucaita
	 * @param path
	 */
	public void initProcess(String path) {

		String obtainLine;
		final String SPLIT_PARAM = "	";
		int lineCelebrity = 0;
		int countCelebrities = 0;
		boolean iscelbrity = false;

		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader buffer = new BufferedReader(fileReader);
			int count = 0;
			while ((obtainLine = buffer.readLine()) != null) {

				count = count + 1;
				String[] lengthWord = obtainLine.split(SPLIT_PARAM);
				iscelbrity = verifyArrayContent(lengthWord);

				if (iscelbrity) {
					countCelebrities = countCelebrities + 1;
					lineCelebrity = count;
				}
			}

			if (countCelebrities == 0) {
				System.out.println("RESULT: There is not any celebrity in the file" );
			}else if(countCelebrities == 1) {
				System.out.println("RESULT: The celebrity is in the line " + lineCelebrity);
			}
			else {
				System.out.println("RESULT: There is more than one celebrity");

			}

			buffer.close();
		} catch (FileNotFoundException e) {

			System.out.println("There is an error load the file" + e.getMessage());
		} catch (IOException e) {

			System.out.println("The process generates this error" + e.getMessage());
		}

	}

	/**
	 * verify the content for each one file lines searching if there is a known
	 * person in the team the values is recieved like "TRUE" or "FALSE" the
	 * information kept on the file could be saved in lowercase
	 * 
	 * @author yohan.cucaita
	 * @param paramArray
	 * @return iscelebrity
	 */
	public boolean verifyArrayContent(String[] paramArray) {

		final String validValue = "TRUE";
		int count = 0;
		boolean iscelebrity = false;

		for (String word : paramArray) {

			if (word.equalsIgnoreCase(validValue)) {
				count = count + 1;
			}
		}

		iscelebrity = (count == 0) ? true:false;
		return iscelebrity;
	}

}
