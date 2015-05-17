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
        case "Present":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
        		break;
        	}
        	break;
        case "PC":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
        		break;
        	}
        	break;
        case "Imperfect":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
        		break;
        	}
        	break;
        case "FP":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
        		break;
        	}
        	break;
        case "FS":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
        		break;
        	}
        	break;
        case "Conditional":
        	switch(infostring2){
        	case "Je":
        		break;
        	case "Tu":
        		break;
        	case "Il":
        		break;
        	case "Elle":
        		break;
        	case "Nous":
        		break;
        	case "Vous":
        		break;
        	case "Ils":
        		break;
        	case "Elles":
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
