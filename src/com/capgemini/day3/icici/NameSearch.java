package com.capgemini.day3.icici;

public class NameSearch {

	public static String search(String name) {
		String db[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam",
				"Ayan","Dev","Kity","Meery","Smith","Johnson","Bil","Williams","Jones",
				"Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson","Dave"};
		int ct=0;
		for(int i=0;i < db.length; i++)
		{
			if(name.equalsIgnoreCase(db[i]))
			{
				ct++;
			}
		}
		if(ct>0)
		{
			return "Name found with number of occurences: " + ct;
		}
		return "Name not found";
	}

}