package console_based_chatbot_for_diabetic_patients;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UtilityMethods {
	
	public static String matchSymptoms( ResultSet rs,Scanner sc) throws SQLException
	{
		String doctorInput="";
		String patientInput="";
		
		
		
		System.out.println();
		
		System.out.print("Your Problem :- ");
		
		patientInput=sc.nextLine();
		
		
		
		 
		ArrayList<String> symptoms = new ArrayList<String>();
		String patientInputArray[]=patientInput.split(",");
		
		ArrayList<String> disease = new ArrayList<String>();
		ArrayList<String> prescription = new ArrayList<String>();
		
		int l=0;
		
		while(rs.next())
		{
				//System.out.println("rs.getString(2):- " + rs.getString(2));
				symptoms.add(rs.getString(2));
				disease.add(rs.getString(4));
				prescription.add(rs.getString(3));
				l=l+1;
		}
		
		int[] count=new int[symptoms.size()];
		
		//System.out.println("symptoms.length:- " + symptoms.size());
		
		int k=0;
		
		int flag=0;

		while(k<symptoms.size())
		{
			
			//System.out.println("symptoms[k]:- " + symptoms.get(k));
			
			String symptomRowArray[]=symptoms.get(k).split(",");
			
			
			
			count[k]=0;
			//System.out.println(" symptomRowArray.length:- " + symptomRowArray.length);
						for( int i=0; i<symptomRowArray.length; i++ )
						{
							//System.out.println("symptomRowArray[i]:- " + symptomRowArray[i]);	
							
								if(count[k]>0)
								{
									//System.out.print("Do you have " + symptomRowArray[i] + " :-");
									patientInput=sc.nextLine();
									if(patientInput.equalsIgnoreCase("yes") || patientInput.equalsIgnoreCase("y"))
									{
										
										count[k]=count[k]+1;
										//System.out.println("count[k]:-" +count[k]);
										continue;
									}
								}
							
							
								
								
								if(count[k]==0 && flag==0)
								{
									//System.out.println("ooo");
									//System.out.println("patientInputArray.length:- " + patientInputArray.length  + "---" + patientInputArray[0]);
									
									for( int j=0; j<patientInputArray.length; j++ )
									{
										//System.out.println("symptomRowArray[i]:- " + symptomRowArray[i] );
										//System.out.println("patientInputArray[j]:- " + patientInputArray[j]);
										
										if(symptomRowArray[i].equals(patientInputArray[j]))
										{
											//System.out.println("true");
											count[k]=count[k]+1;
											flag=1;
											break;
										}
										//else
											//System.out.println("false");
									}
								}
						}
			
			k=k+1;		
		}	
		
		int maxCount=0;
		String finalResult="";
		for(int x=0;x<count.length;x++)
		{
			if(count[x]>maxCount)
			{
				maxCount=count[x];

				finalResult=maxCount+"#"+symptoms.get(x)+"#"+disease.get(x)+"#"+prescription.get(x);
					
			}
		}
		
		return finalResult;
	}

}
