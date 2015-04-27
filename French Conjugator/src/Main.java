import java.util.*;

public class Main {

	public static void main(String[] args) {
		//this section takes inputs
		Scanner in = new Scanner(System.in);
		cout("typadaverb\n");
        String verbstring = in.nextLine();
        cout("Type Tense\n");
        String infostring1 = in.nextLine();
        cout("Type Subject\n");
        String infostring2 = in.nextLine();
        //this section does some things with the inputs
        char[] fish = verbstring.toCharArray();
        int n = fish.length;
        String ending = String.join("", toString(fish[n-2]), toString(fish[n-1]));
        char[] dickfuckOne = new char[n - 2];
        String dickfucktwoelectricboogaloo = "";
        for (int i = 0; i < fish.length - 2; i++)
        {
            dickfuckOne[i] = fish[i];
            dickfucktwoelectricboogaloo += toString(dickfuckOne[i]);
        }
        //this section does the stuff
        // first layer of switches is the tenses, second layer of switches is the subjects
        switch (infostring1){
        case "1":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        	break;
        case "2":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        	break;
        case "3":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        	break;
        case "4":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        	break;
        case "5":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        	break;
        case "6":
        	switch(infostring2){
        	case "1":
        		break;
        	case "2":
        		break;
        	case "3":
        		break;
        	case "4":
        		break;
        	case "5":
        		break;
        	case "6":
        		break;
        	case "7":
        		break;
        	case "8":
        		break;
        	}
        break;
        }
        cout("\n" + dickfucktwoelectricboogaloo);
        in.next();   
	}
	public static void cout(String in){
		System.out.print(in);
	}
	public static String toString(char in){
		
		String s = new StringBuilder().append("").append(in).toString();
		return s;
	}
	

}
