import java.util.*;
class Start_Program
{
    public static void main()
     {
        //long sentence because it is cool. Count Galeazzo Ciano, foreign minister of Mussolini's government, declared an axis between Germany and Italy, and on 25 November, Germany signed the Anti-Comintern Pact with Japan. Britain, China, Italy, and Poland were also invited to join the Anti-Comintern Pact, but only Italy signed in 1937. Hitler abandoned his plan of an Anglo-German alliance, blaming "inadequate" British leadership.[211] At a meeting in the Reich Chancellery with his foreign ministers and military chiefs that November, Hitler restated his intention of acquiring Lebensraum for the German people. He ordered preparations for war in the East, to begin as early as 1938 and no later than 1943. In the event of his death, the conference minutes, recorded as the Hossbach Memorandum, were to be regarded as his "political testament".[212] He felt that a severe decline in living standards in Germany as a result of the economic crisis could only be stopped by military aggression aimed at seizing Austria and Czechoslovakia.[213][214] Hitler urged quick action before Britain and France gained a permanent lead in the arms race.[213] In early 1938, in the wake of the Blomberg–Fritsch Affair, Hitler asserted control of the military-foreign policy apparatus, dismissing Neurath as foreign minister and appointing himself as War Minister.[209] From early 1938 onwards, Hitler was carrying out a foreign policy ultimately aimed at war.[215].Germany reoccupied the demilitarised zone in the Rhineland in March 1936, in violation of the Versailles Treaty. Hitler also sent troops to Spain to support General Franco during the Spanish Civil War after receiving an appeal for help in July 1936. At the same time, Hitler continued his efforts to create an Anglo-German alliance.[208] In August 1936, in response to a growing economic crisis caused by his rearmament efforts, Hitler ordered Göring to implement a Four Year Plan to prepare Germany for war within the next four years.[209] The plan envisaged an all-out struggle between "Judeo-Bolshevism" and German national socialism, which in Hitler's view required a committed effort of rearmament regardless of the economic costs.[210].Germany withdrew from the League of Nations and the World Disarmament Conference in October 1933.[202] In January 1935, over 90 per cent of the people of the Saarland, then under League of Nations administration, voted to unite with Germany.[203] That March, Hitler announced an expansion of the Wehrmacht to 600,000 members—six times the number permitted by the Versailles Treaty—including development of an air force (Luftwaffe) and an increase in the size of the navy (Kriegsmarine). Britain, France, Italy, and the League of Nations condemned these violations of the Treaty, but did nothing to stop it.[204][205] The Anglo-German Naval Agreement (AGNA) of 18 June allowed German tonnage to increase to 35 per cent of that of the British navy. Hitler called the signing of the AGNA "the happiest day of his life", believing that the agreement marked the beginning of the Anglo-German alliance he had predicted in Mein Kampf.[206] France and Italy were not consulted before the signing, directly undermining the League of Nations and setting the Treaty of Versailles on the path towards irrelevance.[207].As chancellor, Hitler worked against attempts by the NSDAP's opponents to build a majority government. Because of the political stalemate, he asked Hindenburg to again dissolve the Reichstag, and elections were scheduled for early March. On 27 February 1933, the Reichstag building was set on fire. Göring blamed a communist plot, because Dutch communist Marinus van der Lubbe was found in incriminating circumstances inside the burning building.[157] According to Kershaw, the consensus of nearly all historians is that van der Lubbe actually set the fire.[158] Others, including William L. Shirer and Alan Bullock, are of the opinion that the NSDAP itself was responsible.[159][160] At Hitler's urging, Hindenburg responded with the Reichstag Fire Decree of 28 February, which suspended basic rights and allowed detention without trial. The decree was permitted under Article 48 of the Weimar Constitution, which gave the president the power to take emergency measures to protect public safety and order.[161] Activities of the German Communist Party (KPD) were suppressed, and some 4,000 KPD members were arrested.[162].By November 1932, the Nazi Party had the most seats in the German Reichstag but did not have a majority. As a result, no party was able to form a majority parliamentary coalition in support of a candidate for chancellor. Former chancellor Franz von Papen and other conservative leaders persuaded President Paul von Hindenburg to appoint Hitler as chancellor on 30 January 1933. Shortly after, the Reichstag passed the Enabling Act of 1933 which began the process of transforming the Weimar Republic into Nazi Germany, a one-party dictatorship based on the totalitarian and autocratic ideology of National Socialism. Hitler aimed to eliminate Jews from Germany and establish a New Order to counter what he saw as the injustice of the post-World War I international order dominated by Britain and France. His first six years in power resulted in rapid economic recovery from the Great Depression, the abrogation of restrictions imposed on Germany after World War I, and the annexation of territories inhabited by millions of ethnic Germans, which gave him significant popular support.
        Main_Program ob = new Main_Program();
        Scanner sc = new Scanner(System.in);
        Dev ob1 = new Dev();
        int[] keys = new int[2];
        int reciever, sender, Lock, usender;
        keys = ob1.keygen();
        char auto = '\u0000';
        sender = keys[0];
        reciever = keys[1];
        System.out.print("Do you want to auto fill certain things ?(YOU WILL HAVE NO CONTROL OVER THE PROGRMAM) :  ");
        auto = sc.next().charAt(0);
        for(;;)
        {
            Lock = (reciever - 1) * (sender - 1);
            if(Character.toLowerCase(auto) == 'y')
            {
                System.out.println("Enter the Sender's Key(" + sender + ") : " + sender);
                usender = sender;
            }
            else{
                System.out.print("Enter the Sender's Key(" + sender + ") : ");
                usender = sc.nextInt();
            }
            if(usender == sender)
            {
                System.out.print("\f");
                keys = ob.main(Lock, reciever, sender, auto);
                reciever = keys[1];
                sender = keys[0];
            }
            else
                System.out.println("Enter the correct key again");
            }
    }
}