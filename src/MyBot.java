import org.jibble.pircbot.*;
import java.util.Random;

public class MyBot extends PircBot {
        public MyBot() {
        this.setName("FeDenBot");
    }    	
        
private int limit = 0;
private int amount = 0;
private long startTime = 0;

    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    	Random RNG = new Random();
    	int conchMN = 0;
    	int RNGStorage;
    	int RNGMStorage;
    	String RNGMessage;
    	String limitS = "0";
    	
    	
    		if (amount < limit) {amount++;}	
    				
    				//right here, I am breaking the string message into 2 parts a set number
    				//ov charectars over. the only other way I know how to do this is with 
    				// symbols to start/stop at.
    				
    			        if (message.startsWith("!eep +") && sender.equalsIgnoreCase("exogreenmc")) {
    				eepS = message.substring(6);
   					eep = Integer.parseInt(eepS);
	   				sendMessage(channel,"Tanyas eep count is now " + eep);
				} else {}
    		
    			        if (message.startsWith("!eep") && amount == limit) {
   	   				sendMessage(channel,"tanyas eep count is currently " + eep);
   				} else {}
   				
   				if (message.startsWith("!amount") && sender.equalsIgnoreCase("exogreenmc")) {
   	   				sendMessage(channel,"amount = " + amount);
   				} else {}
   				
   				if (message.startsWith("!anti") && amount == limit) {
    				sendMessage(channel,"Joke Time!");
   				} else {}
   					
    			if (message.startsWith("!arrow") && amount == limit) {
    				sendMessage(channel,"Pak needs arrows Jimmies!!");
    				amount = 0;
   				} else {}
    			
   				if (message.equalsIgnoreCase("boop") && amount == limit) {
    				sendMessage(channel,"Tanya, they boop-ed you");
   				} else {}
   				
   				if (message.equalsIgnoreCase("!bot") && amount == limit) {
    				sendMessage(channel,"Yep, i'm a bot.");
    				amount = 0;
    			} else {}
   				
    			if (message.startsWith("!coffee ") && amount == limit) {
    				sendMessage(channel,"/me gives " + message.substring(8) + " coffee");
    				amount = 0;
   				} else {}
    			
    			if (message.startsWith("!conch") && amount == limit) {
   					String conch[] = new String[13];
   					conch[0] = "It is certain.";
   					conch[1] = "It is decidedly so.";
   					conch[2] = "Better not to tell.";
   					conch[3] = "You may rely on it.";
   					conch[4] = "Don't count on it.";
   					conch[5] = "My reply is no.";
   					conch[6] = "Very doubtful.";
   					conch[7] = "My sources say no.";
   					conch[8] = "Most likely.";
   					conch[9] = "Signs point to yes.";
   					conch[10] = "Outlook doesn't look good.";
   					conch[11] = "The future seems hazy on this.";
   					conch[12] = "Unable to discern.";
   					conchMN = RNG.nextInt(conch.length);
   					sendMessage(channel, "" + conch[conchMN]);
   					amount = 0;
   	        	} else {}
   				
    			if (message.startsWith("!cookie ") && amount == limit) {
    				sendMessage(channel,"/me gives " + message.substring(8) + " a cookie");
    				amount = 0;
   				} else {}
   				
    			if (message.startsWith("!end") && sender.equalsIgnoreCase("exogreenmc")) {
    				quitServer("bye");
    			} else {}

   				if (message.startsWith("!end") && sender.equalsIgnoreCase("ironbeast01")) {
    				quitServer("Iron did it!");
   				} else {}
   				
   				if (message.equalsIgnoreCase("!egnaro") && amount == limit) {
    				sendMessage(channel,"Egnaro!");
    				amount = 0;
   				} else {}
   				
   				if (message.equalsIgnoreCase("!FeBot") && amount == limit) {
    				sendMessage(channel,"My commands are !arrow, !bot, !coffee (name), !conch (question), !cookie (name), !egnaro, !FeBot, !isthis (name), !onion, !orange, !potato, and !rng (number).");
    				amount = 0;
   				} else {}
   				
   				if (message.startsWith("!halp") && amount == limit) {
    				sendMessage(channel,"!help");
    				amount = 0;
   				} else {}
   				
    			if (message.startsWith("!isthis ") && amount == limit) {
    				sendMessage(channel,message.substring(8) + ", no, this is Patrick.");
    				amount = 0;
    			} else {}
    			
   				if (message.startsWith("!limit") && sender.equalsIgnoreCase("exogreenmc")) {
   					limitS = message.substring(7);
   					limit = Integer.parseInt(limitS);
   					sendMessage(channel,"You may now use the bot commands every " + limit + " messages");
   					amount = 0;
   				} else {}
   				
   				if (message.startsWith("!limit") && sender.equalsIgnoreCase("ironbeast01")) {
   					limitS = message.substring(7);
   					limit = Integer.parseInt(limitS);
   					sendMessage(channel,"You may now use the bot commands every " + limit + " messages");
   					amount = 0;
   				} else {}
   				
   				if (message.startsWith("!lmt") && sender.equalsIgnoreCase("exogreenmc")) {
   	   				sendMessage(channel,"limit = " + limit + " and limitS = " + limitS);
   				} else {}
   				
   				if (message.startsWith("!off") && sender.equalsIgnoreCase("exogreenmc")) {
   					startTime = System.currentTimeMillis();
   				} else {}
   				
   				if (message.startsWith("!onion") && amount == limit) {
    				sendMessage(channel,"Quick! Pak needs an onion!");
    				amount = 0;
   				} else {}
   				
   				if (message.equalsIgnoreCase("!orange") && amount == limit) {
    				sendMessage(channel,"Ooooorange!");
    				amount = 0;
   				} else {}
    			if (message.equalsIgnoreCase("!potato") && amount == limit) {
    				sendMessage(channel,"Poooootato!");
    				amount = 0;
    			} else {}
    			
   				if (message.startsWith("!shovel") && sender.equalsIgnoreCase("tanya3140")) {
   	   				sendMessage(channel,"For the best shoveler I know, Tanya.");
   	   				amount = 0;
   				} else {}
   				
    			if (message.startsWith("!stop") && sender.equalsIgnoreCase("exogreenmc")) {
    				sendMessage(channel,"If its bad for you, you should probally stop.");
   				} else {}
   				
    			if (message.startsWith("test") && sender.equalsIgnoreCase("ironbeast01")){
    				sendMessage(channel,"Flying colors!");
    			} else {}
    			
    			if (message.startsWith("test") && amount == limit) {
    				sendMessage(channel,"Test failed.");
    			} else {}
    			
   				if (message.startsWith("!time") && sender.equalsIgnoreCase("exogreenmc")) {
    				String time = new java.util.Date().toString();
    				sendMessage(channel, sender + ": The time is now " + time);
    			} else {}
   				
   				if (message.startsWith("!quote") && amount == limit) {
    				sendMessage(channel,"http://streamquotestakenwrongway.tumblr.com/");
    				amount = 0;
   				} else {}
   				
   				if (message.startsWith("!rng") && amount == limit) {
    				RNGMessage = message.substring(5);
    				RNGMStorage = Integer.parseInt(RNGMessage);
    				RNGStorage = 1+RNG.nextInt(RNGMStorage);
    				sendMessage(channel, "" + RNGStorage);
    				amount = 0;
   				} else {}
   				
   			}
    	}





//// Author 	: DekuSapling
//// Date 	: 15 June 2014
//
//import org.jibble.pircbot.*;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Collection;
//
//public class MyBot extends PircBot {
//     
//	private int limit = 0;
//	private int amount = 0;
//	private long startTime = 0;
//	
//	// move variables/objects that are hard coded to class variable/object status
//	
//	private Random RNG = new Random ();
//	private ArrayList < Command> publicCommandList = new ArrayList < Command> ();
//	private ArrayList < String> opList = new ArrayList < String> ();
//	
//	// conch messages 
//	// stored as an arraylist, - defined in an array, and added to the arraylist on creation
//	private ArrayList < String> conchMSG = new ArrayList < String> ( Arrays.asList ( 
//			"It is certain.", "It is decidedly so.", "Better not to tell.",
//			"You may rely on it.", "Don't count on it.", "My reply is no.",
//			"Very doubtful.", "My sources say no.", "The future seems hazy on this.",
//			"Signs point to yes.", "Outlook doesn't look good.", "Most likely.",
//			"Unable to discern."));
//	
//	public MyBot () {
//		this.setName ( "FeDenBot");
//		init ();
//    }    
//	
//	public void init () {
		// one time setup call, initiallizes the various patternal commands
//		publicCommandList.addAll ( ( Collection < Command>)Arrays.asList ( 
//				new IntegerPartCommand ( "!eep", "Tanya's eep count is now ", ".", 0, 1), 
//				new SimpleCommand ( "!anti", "Joke Time!"),
//				new SimpleCommand ( "!bot", "Yep, I'm a bot"),
//				new SimpleCommand ( "!arrows", "Pak needs arrows, Jimmies!"),
//				new SimpleCommand ( "!boop", "Tanya, they booped you Kappa"),
//				new SimpleCommand ( "!egnaro", "Egnaro!"),
//				new SimpleCommand ( "!halp", "!help"),
//				new SimpleCommand ( "!quote", "http://streamquotestakenwrongway.tumblr.com/"),
//				new SimpleCommand ( "!orange", "Ooooorange!"),
//				new SimpleCommand (	"!potato", "Poooootato!"),
//				new SimpleCommand ( "!onion", "Quick! Pak needs an onion!"),
//				new SimpleCommand ( "!stop", "If it is bad for you, you should probably stop."),
//				new StringPartCommand ( "!coffee", "/me gives ", " a cup of coffee."),
//				new StringPartCommand ( "!cookie", "/me gives ", " a cookie."),
//				new StringPartCommand ( "!isthis", "", "?! No, this is Patrick!")
//		));
//	}
//	
//	public boolean isOpUser ( String sender) { return opList.contains ( sender);}
//	
//	public void onMessage ( String channel, String sender, String login, 
//							String hostname, String message) {
//
//		if ( message.startsWith ( "!amount")) {
//				sendMessage ( channel, "amount = " + amount);
//		} else if ( message.startsWith ( "!end")) {
//			if ( sender.equalsIgnoreCase ( "exogreenmc")) { quitServer ( "bye");}
//			else if ( sender.equalsIgnoreCase ( "ironbeast01")) { quitServer ( "Iron did it!");}
//			else if ( sender.equalsIgnoreCase( "dekusapling") || sender.equalsIgnoreCase ( "thegreatdekusapling")) { quitServer ( "Deku did it!");}
//		} else if ( message.startsWith ( "!limit") && isOpUser ( sender)) { 
//			limit = Integer.parseInt ( message.substring ( 7));
//			sendMessage(channel,"You may now use the bot commands every " + limit + " messages");
//		} else if ( message.startsWith ( "test")) {
//			if ( isOpUser ( sender)) sendMessage ( channel, "Flying Colors!");
//			else sendMessage ( channel, "Test Failed. Kappa");
//		} else if ( amount >= limit ) {
//			if ( message.startsWith ( "!conch")) {
//				sendMessage ( channel, conchMSG.get( RNG.nextInt ( conchMSG.size ())));
//			} else {		
//				for ( Command c : publicCommandList) {
//					if ( message.startsWith ( c.getQue ())) {
//						sendMessage ( channel, c.process ( message));
//					}
//				}
//			}
//			amount = 0;
//		} else { amount ++;}
//	}
//	
//	protected abstract class Command {
//		String que;
//		public String getQue () { return que;}
//		public String process ( String in) {}
//	}
//	
//	private class SimpleCommand extends Command {
//		String que, output;
//		public SimpleCommand ( String que, String output) { 
//			this.que = que; 
//			this. output = output;
//		}
//		public String getQue () { return que;}
//		public String process ( String in) { return output;}
//	}
//	
//	private class StringPartCommand extends Command {
//		String que, output1, output2;
//		public StringPartCommand ( String que, String output1, String output2) { 
//			this.que = que; 
//			this.output1 = output1;
//			this.output2 = output2;
//		}
//		public String getQue () { return que;}
//		public String process ( String in) {
//			Scanner scan = new Scanner ( in.substring ( que.length ()));
//			String out = output1 + scan.next () + output2;
//			scan.close ();
//			return ( out);
//		}
//	}
//	
//	private class IntegerPartCommand extends Command {
//		String que, output1, output2;
//		int var, shift;
//		public IntegerPartCommand ( String que, String output1, String output2, int var, int shift) {
//			this.que = que;
//			this.output1 = output1;
//			this.output2 = output2;
//			this.var = var;
//			this.shift = shift;
//		}
//		public String getQue () { return que;}
//		public String process ( String in) {
//			var += shift;
//			String out = output1 + var + output2;
//			return ( out);
//		}
//	}
//}
