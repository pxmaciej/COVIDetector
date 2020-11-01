package CovidDetecter;
import java.util.Scanner;

public class Base {
    
public void name() {
    Scanner in = new Scanner(System.in);
    String tmp;
    String t = "Tak";
    String n = "Nie";
    String nw = "Nie wiem";


    Log.info("Czy jesteś chory?");
    Log.info("Tak, Nie, Nie wiem");
     tmp = in.nextLine();
     /*Czy jesteś chory Tak-------------------------------------------------------------------------*/ 
    if(tmp.equals(t)|| tmp.equals(nw)){
        Log.info("Czy masz gorączke?");
        tmp = in.nextLine();
        /*Czy jesteś chory Tak, Czy masz gorączke Tak-------------------------------------------------------------------------*/ 
        if(tmp.equals(t)){
            Log.info("Czy kaszlesz?");
            tmp = in.nextLine();
            /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak-------------------------------------------------------------------------*/ 
            if(tmp.equals(t)){
                Log.info("Czy doskwierają ci duszności?");
                tmp = in.nextLine();
                /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak, Czy doskwierają ci duszności Tak-------------------------------------------------------------------------*/ 
                if(tmp.equals(t)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak, Czy doskwierają ci duszności TakCzy posiadasz zmysł smaku Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Jesteś zarażony COVID-19");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }//koniec

                /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak,Czy doskierają ci duszności Nie-------------------------------------------------------------------------*/     
                }else if(tmp.equals(n)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak,Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Możesz mieć grypę");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Tak,Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }//koniec
                }
            /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie-------------------------------------------------------------------------*/ 
            }else if(tmp.equals(n)){
                Log.info("Czy doskwierają ci duszności?");
                tmp = in.nextLine();
                /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak-------------------------------------------------------------------------*/ 
                if(tmp.equals(t)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Możesz być przeziębiony");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }//koniec

                /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskierają ci duszności Nie-------------------------------------------------------------------------*/     
                }else if(tmp.equals(n)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Możesz mieć mięc osłabiony układ odpornościowy");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Tak, Czy kaszlesz Nie, Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }
                }
            }//koniec
            
        /*Czy jesteś chory Tak, Czy masz gorączke Nie-------------------------------------------------------------------------*/
        }else if(tmp.equals(n)){
            Log.info("Czy kaszlesz?");
            tmp = in.nextLine();
            /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak-------------------------------------------------------------------------*/ 
            if(tmp.equals(t)){
                Log.info("Czy doskwierają ci duszności?");
                tmp = in.nextLine();
                /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak, Czy doskwierają ci duszności Tak-------------------------------------------------------------------------*/ 
                if(tmp.equals(t)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Możesz mieć grypę");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }//koniec
                /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskierają ci duszności Nie-------------------------------------------------------------------------*/     
                }else if(tmp.equals(n)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak, Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Możesz być przeziębiony");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Tak, Czy doskierają ci duszności Nie, Czy posiadasz zmysł smaku oraz węchu Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Posiadasz większość objawów");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }
                }//koniec
            /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie-------------------------------------------------------------------------*/
            }else if(tmp.equals(n)){
                Log.info("Czy doskwierają ci duszności?");
                tmp = in.nextLine();
                /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak-------------------------------------------------------------------------*/ 
                if(tmp.equals(t)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Jesteś zdrowy");
                        Log.info("Możesz być astmatykiem");
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Tak, Czy posiadasz zmysł smaku Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Jesteś chyba zdrowy");
                        Log.info("Skontaktuj się ze swoim lekarzem!");
                    }
                //koniec
                
                /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Nie-------------------------------------------------------------------------*/
                }else if(tmp.equals(n)){
                    Log.info("Czy posiadasz zmysł smaku oraz węchu?");
                    tmp = in.nextLine();
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Nie, Czy posiadasz zmysł smaku Tak-------------------------------------------------------------------------*/ 
                    if(tmp.equals(t)){
                        Log.info("Jesteś zdrowy");
                        Log.info("Super!");
                    /*Czy jesteś chory Tak, Czy masz gorączke Nie, Czy kaszlesz Nie, Czy doskwierają ci duszności Nie, Czy posiadasz zmysł smaku Nie-------------------------------------------------------------------------*/ 
                    }else if(tmp.equals(n)){
                        Log.info("Jesteś chyba zdrowy jeśli jesteś alergikiem");
                        Log.info("Bądź masz zatkane zatoki");
                    }//koniec
                }
            }
        }
    
    }else if(tmp.equals(n)){
        Log.info("Jesteś Zdrowy!");
    }else{
        Log.info("Zła odpowiedź");
        this.name();
    }
}   
}

  



 


    
