import java.util.Scanner;

public class Nokia {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.printf("Thank you for purchasing the Nokia phone please access our wide range of features! %n1-> Phone book%n2-> Messages%n3-> Chat%n4-> Call register%n5-> Tones%n6-> Settings%n7-> Call divert%n8-> Games%n9-> Calculator%n10-> Reminders%n11-> Clock%n12-> Profiles%n13-> SIM services%n");

int userInput = input.nextInt();

switch(userInput){



case 1 :{System.out.println("phone book");

System.out.printf("%n1->Search%n2->Service Nos.%n3->Add name%n4->Erase%n5->Edit%n6->Assign tone%n7->Send b'card%n8->Options%n9->Speed dials%n10->Voice tags%n");

int inputinput = input.nextInt();

switch(inputinput){

case 1: System.out.println("Search");break;

case 2: System.out.println("Service Nos.");break;

case 3: System.out.println("Add name");break;

case 4: System.out.println("Erase");break;

case 5: System.out.println("Edit");break;

case 6: System.out.println("Assign tone");break;

case 7: System.out.println("Send b'card");break;

case 8: {System.out.printf("1->Type of view%n2->Memory Status");

int case8 = input.nextInt();

if(case8==2){System.out.print("Memory Status");
if(case8==1){System.out.print("Type of view");}


}
break;}

case 9: System.out.println("Speed dials");break;

case 10: System.out.println("Voice tags");
}

break;}

case 2:{System.out.println("Messages");

System.out.printf("%n1->Write messages%n2->Inbox%n3->Outbox%n4->Picture messages%n5->Templates%n6->Smileys%n7->Message setting%n8->Info service%n9->Voice mailbox number%n10->Service command editor%n");

int case2 = input.nextInt();

switch(case2){

case 1: System.out.println("Write Messages");break;

case 2: System.out.println("Inbox");break;

case 3: System.out.println("Outbox");break;

case 4: System.out.println("Picture messages");break;

case 5: System.out.println("Templates");break;

case 6: System.out.println("Smileys");break;

case 8: System.out.println("Info service");break;

case 9: System.out.println("Voice mailbox number");break;

case 10: System.out.println("Service command editor");break;

case 7: {System.out.println("Message settings");

 System.out.printf("1->Set 1%n2->Common");

int case7 = input.nextInt();

if(case7==1){ System.out.printf("1->Message centre number%n2->Messages sent as%n3->Messag validity");

int case71 = input.nextInt();

switch(case71){

case 1: System.out.println("Message centre");break;

case 2: System.out.println("Message sent");break;

case 3: System.out.println("Message validity");break;
}


}

 if(case7==2){ System.out.printf("1->Delivery reports%n2->Reply via same centre%n3->Character support");


int case72 = input.nextInt();

switch(case72){


case 1: System.out.println("Delivery reports");break;

case 2: System.out.println("Reply via same centre");break;

case 3: System.out.println("Character support");break;}


}

}



}

break;}

case 3:{ System.out.println("Chat");break;}

case 4:{System.out.println("Call register");

System.out.printf("%n1->Missed calls%n2->Recieved calls%n3->Dialled numbers%n4->Erase recent call lists%n5->Show call duration%n6->Show all costs%n7->Call cost settings%n8->Prepaid credit%n");

int casecall = input.nextInt();

switch(casecall){

case 1: System.out.println("Missed calls");break;

case 2: System.out.println("Recieved calls");break;

case 3: System.out.println("Dialled numbers");break;

case 4: System.out.println("Erase recent call lists");break;

case 5: {System.out.println("Show call duration");

 System.out.printf("%n1->Last call duration%n2->All call's duration%n3->Recieved call's duration%n4->Dialled call's duration%n5->Clear timers%n");

int case5 = input.nextInt();

switch(case5){

case 1: System.out.println("Last call duration");break;

case 2: System.out.println("All call's duration");break;

case 3: System.out.println("Recieved call's duration");break;

case 4: System.out.println("Dialled calls'duration");break;

case 5: System.out.println("Clear timers");break;}

break;}

case 6:{ System.out.println("Show all costs");

 System.out.printf("%n1->Last call cost%n2->All calls' cost%n3->Clear counters%n");

int case6 = input.nextInt();

switch(case6){

case 1: System.out.println("Last call cost");break;

case 2: System.out.println("All calls' cost");break;

case 3: System.out.println("Clear counters");break;

}

break;}

case 7: {System.out.println("Call cost settings");

 System.out.printf("%n1->Call cost limit%n2->Show costs in%n");

int case7 = input.nextInt();

switch(case7){

case 1: System.out.println("Call cost limit");break;

case 2: System.out.println("Show costs in");break;


}





break;}

case 8: System.out.println("Prepaid credit");break;

}

}

case 5:{ System.out.println("Tones");

System.out.printf("%n1->Ringing tone%n2->Ringing volume%n3->Incoming call alert%n4->Composer%n5->Message alert tone%n6->Keypad tones%n7->Warning and game tones%n8->Vibrating alert%n9->Screen saver%n");

int tones = input.nextInt();

switch(tones){

case 1: System.out.println("Ringing tone");break;

case 2: System.out.println("Ringing volume");break;

case 3: System.out.println("Incoming call alert");break;

case 4: System.out.println("Composer");break;

case 5: System.out.println("Message alert tone");break;

case 6: System.out.println("Keypad tones");break;

case 7: System.out.println("Warning and game tones");break;

case 8: System.out.println("Vibrating alert");break;

case 9: System.out.println("Screen saver");break;

}


break;}


case 6:{System.out.println("Settings");

System.out.printf("%n1->Call setiings%n2->Phone settings%n3->Security settings%n4->Restore factory settings%n");

int settings= input.nextInt();

switch(settings){

case 1:{ System.out.println("Call setiings");

System.out.printf("%n1->Automatic redial%n2->Speed dialling%n3->Call waiting options%n4->Own number sending%n5->Phone line in use%n6->Automatic answer%n");

int callsettings = input.nextInt();

switch(callsettings){

case 1: System.out.println("Automatic redial");break;

case 2: System.out.println("Speed dialing");break;

case 3: System.out.println("Call waiting options");break;

case 4: System.out.println("Own number sending");break;

case 5: System.out.println("Phone line in use");break;

case 6: System.out.println("Automatic answer");break;

}


break;}

case 2:{ System.out.println("Phone settings");

System.out.printf("%n1->Language%n2->Cell info display%n3->Welcome note%n4->Network selection%n5->Lights%n6->Confirm SIM service actions%n");

int phonesettings = input.nextInt();

switch(phonesettings){

case 1: System.out.println("Language");break;

case 2: System.out.println("Cell info display");break;

case 3: System.out.println("Welcome note");break;

case 4: System.out.println("Network selection");break;

case 5: System.out.println("Lights");break;

case 6: System.out.println("Confirm SIM service actions");

}


break;}


case 3:{ System.out.println("Security settings");

System.out.printf("%n1->PIN code request%n2->Call barring service%n3->Fixed dialling%n4->Closed user group%n5->Phone security%n6->Change access codes%n");

int securitysettings = input.nextInt();

switch(securitysettings){

case 1: System.out.println("PIN code request");break;

case 2: System.out.println("Call barring service");break;

case 3: System.out.println("Fixed dialing");break;

case 4: System.out.println("Closed user group");break;

case 5: System.out.println("Phone security");break;

case 6: System.out.println("Change access codes");

}


break;}


case 4: System.out.println("Restore factory settings");break;





}



break;}


case 7: System.out.print("Call divert"); break;

case 8: System.out.print("Games"); break;

case 9: System.out.print("Calculator"); break;

case 10: System.out.print("Reminder"); break;

case 11: {System.out.print("Clock"); 

System.out.printf("%n1->Alarm clock%n2->Clock settings%n3->Date settings%n4->Stopwatch%n5->Countdown timer%n6->Auto update of date and time");

int clock = input.nextInt();

switch(clock){

case 1: System.out.print("Alarm clock"); break;

case 2: System.out.print("Clock settings"); break;

case 3: System.out.print("Date settings"); break;

case 4: System.out.print("Stopwatch"); break;

case 5: System.out.print("Countdown timer"); break;

case 6: System.out.print("Auto update of date and time"); 


}


break;} 

case 12: System.out.print("Profiles"); break;

case 13: System.out.print("SIM services"); break;


}
}

}