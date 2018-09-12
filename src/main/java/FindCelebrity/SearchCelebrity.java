package FindCelebrity;

import processData.ProcessDataFile;

/**
 * Application for search an celebrity in a team.
 * @author yohan.cucaita
 *
 */
public class SearchCelebrity 
{
    public static void main( String[] args )
    {
    	final String filename="\\Data.txt";
    	final String eliminateFolder="SearchCelebrity";
    	try {
			System.out.println ("Start program");
			String path=System.getProperty("user.dir");
			ProcessDataFile process = new ProcessDataFile();
			process.initProcess(path.replace(eliminateFolder,"")+filename);
			
		} catch (Exception e) {
			System.out.println ("There is a problem try to load the file"+e.getMessage());
		}
    }
}
