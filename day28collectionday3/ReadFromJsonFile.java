package day28collectionday3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadFromJsonFile {

	public static void main(String[] args) throws IOException 
	{
		ObjectMapper objectMapper=new ObjectMapper();
		//CorporateEmployee ep=objectMapper.readValue(new File("D:\\SCSJSON\\\\sample2.json"), CorporateEmployee.class);
		CorporateEmployee corpEmp=objectMapper.readValue(new File("D:\\SCSJSON\\\\sample2.json"), CorporateEmployee.class);
		System.out.println(corpEmp);
		System.out.println(corpEmp.getEmp().getSalary());
		
		List<Skill> myNewSkills=corpEmp.getSkills();
		for(Skill s:myNewSkills)
			System.out.print(s.getDatabase()+",");
		System.out.println("\n****");
		for(int i=0;i<myNewSkills.size();i++)
		{
			System.out.print(myNewSkills.get(i).getDatabase());
			if(i!=myNewSkills.size()-1)
				System.out.print(",");
		}
	}

}
