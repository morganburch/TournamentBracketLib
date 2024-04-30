package com.ventura.tournamentbracketslib;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ventura.bracketslib.BracketsView;
import com.ventura.bracketslib.model.ColomnData;
import com.ventura.bracketslib.model.CompetitorData;
import com.ventura.bracketslib.model.MatchData;

import java.util.Arrays;

public class ExampleFragment extends Fragment {

    public ExampleFragment() {
        super(R.layout.example_fragment);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BracketsView bracketsView = view.findViewById(R.id.bracket_view);

        // Call the function to set the brackets data
        //setBracketsDataPokemon(bracketsView);
        //setBracketsDataResturant(bracketsView);
        //setBracketsDataSonnyAngels(bracketsView);
        //setBracketsDataTemplate(bracketsView);
        setBracketsDataSports(bracketsView);
    }

    private void setBracketsDataPokemon(BracketsView bracketsView) {

        //Adds the Item using CompetitorData
        CompetitorData MewRound1 = new CompetitorData("Mew", "0");
        CompetitorData PsyduckRound1 = new CompetitorData("Psyduck", "1");

        CompetitorData MagikarpRound1 = new CompetitorData("Magikarp", "1");
        CompetitorData SnorlaxRound1 = new CompetitorData("Snorlax", "0");

        CompetitorData BulbasaurRound1 = new CompetitorData("Bulbasaur", "1");
        CompetitorData VaporeanRound1 = new CompetitorData("Vaporean", "0");

        CompetitorData MewtoRound1 = new CompetitorData("Mewtwo", "1");
        CompetitorData OnixRound1 = new CompetitorData("Onix", "0");

        CompetitorData GyaradosRound1 = new CompetitorData("Gyarados", "1");
        CompetitorData PikachuRound1 = new CompetitorData("Pikachu", "0");

        CompetitorData CharmandarRound1 = new CompetitorData("Charmandar", "1");
        CompetitorData CuboneRound1 = new CompetitorData("Cubone", "0");

        CompetitorData gangarRound1 = new CompetitorData("Gangar", "1");
        CompetitorData squirtleRound1 = new CompetitorData("squirtle", "0");

        CompetitorData MrmimeRound1 = new CompetitorData("Mr.Mime", "0");
        CompetitorData EveeRound1 = new CompetitorData("Evee", "1");



        //ROUND2 - Differentiate the items for the second match that would appear in the 2nd colomn and so on

        CompetitorData psyduckRound2 = new CompetitorData("Psyduck", "0");
        CompetitorData MajiKarpRound2 = new CompetitorData("Magikarp", "1");

        CompetitorData GyaradosRound2 = new CompetitorData("Gyarados", "1");
        CompetitorData CharmandarRound2 = new CompetitorData("Charmandar", "0");

        CompetitorData MewtoRound2 = new CompetitorData("Mewtwo", "0");
        CompetitorData BulbasaurRound2 = new CompetitorData("Bulbasaur", "1");

        CompetitorData gangarRound2 = new CompetitorData("Gangar", "1"); //gangar
        CompetitorData EveeRound2 = new CompetitorData("Evee", "0"); //gangar


        //ROUND3
        CompetitorData gangarRound3 = new CompetitorData("Gangar", "0");
        CompetitorData MajiKarpRound3 = new CompetitorData("Magikarp", "1");

        CompetitorData BulbasaurRound3 = new CompetitorData("Bulbasaur", "1");
        CompetitorData GyaradosRound3 = new CompetitorData("Gyarados", "0");

        //ROUND 4
        CompetitorData BulbasaurRound4 = new CompetitorData("Bulbasaur", "0");
        CompetitorData MajiKarpRound4 = new CompetitorData("Magikarp", "1");


        //2 items are Added to a match - group items to a match in order to be paired for that colomn
        MatchData RoundOne_Match1 = new MatchData(MewRound1, PsyduckRound1);
        MatchData RoundOne_Match2 = new MatchData(MagikarpRound1, SnorlaxRound1);
        MatchData RoundOne_Match3 = new MatchData(gangarRound1, squirtleRound1);
        MatchData RoundOne_Match4 = new MatchData(MrmimeRound1, EveeRound1);
        MatchData RoundOne_Match5 = new MatchData(GyaradosRound1, PikachuRound1);
        MatchData RoundOne_Match6 = new MatchData(CharmandarRound1, CuboneRound1);
        MatchData RoundOne_Match7 = new MatchData(MewtoRound1, OnixRound1);
        MatchData RoundOne_Match8 = new MatchData(BulbasaurRound1, VaporeanRound1);
        //Do this for all colomns
        MatchData RoundTwo_Match1 = new MatchData(psyduckRound2,MajiKarpRound2);
        MatchData RoundTwo_Match2 = new MatchData(gangarRound2,EveeRound2);
        MatchData RoundTwo_Match3 = new MatchData(GyaradosRound2,CharmandarRound2);
        MatchData RoundTwo_Match4 = new MatchData(MewtoRound2,BulbasaurRound2);

        MatchData RoundThree_Match1 = new MatchData(MajiKarpRound3,gangarRound3);
        MatchData RoundThree_Match2 = new MatchData(GyaradosRound3, BulbasaurRound3);


        MatchData Round4_Match4 = new MatchData(MajiKarpRound4,BulbasaurRound4);

        //Matches are added to a Colomn
        ColomnData FirstColomn = new ColomnData(Arrays.asList(RoundOne_Match1, RoundOne_Match2, RoundOne_Match3, RoundOne_Match4, RoundOne_Match5, RoundOne_Match6, RoundOne_Match7,RoundOne_Match8));
        ColomnData SecondColomn = new ColomnData(Arrays.asList(RoundTwo_Match1,RoundTwo_Match2,RoundTwo_Match3,RoundTwo_Match4));
        ColomnData ThirdColomn = new ColomnData(Arrays.asList(RoundThree_Match1,RoundThree_Match2));
        ColomnData FourthColomn = new ColomnData(Arrays.asList(Round4_Match4));

        //shows the colomns in display
        bracketsView.setBracketsData(Arrays.asList(FirstColomn, SecondColomn, ThirdColomn, FourthColomn));
    }

    private void setBracketsDataResturant(BracketsView bracketsView){
        //Adds the Item using CompetitorData
        CompetitorData Mcdonalds_round1 = new CompetitorData("McDonalds", "3");
        CompetitorData Chickfila_round1 = new CompetitorData("Chickfila", "7");
        CompetitorData FiveGuys_round1 = new CompetitorData("FiveGuys","6");
        CompetitorData BurgerKing_round1 = new CompetitorData("BurgerKing","5");
        CompetitorData Popeyes_round1 = new CompetitorData("Popeyes","8");
        CompetitorData KFC_round1 = new CompetitorData("KFC","2");
        CompetitorData Canes_round1 = new CompetitorData("Canes","9");
        CompetitorData DavesHotChicken_round1 = new CompetitorData("Daves Hot Chicken","1");
        CompetitorData Wendys_round1 = new CompetitorData("Wendys","6");
        CompetitorData WhiteCastle_round1 = new CompetitorData("WhiteCastle","4");
        CompetitorData Chipotle_round1 = new CompetitorData("Chipotle","7");
        CompetitorData Subway_round1 = new CompetitorData("Subway","3");
        CompetitorData TacoBell_round1 = new CompetitorData("TacoBell","0");
        CompetitorData Portillos_round1 = new CompetitorData("Portillos","10");
        CompetitorData PizzaHut_round1 = new CompetitorData("PizzaHut","10");
        CompetitorData ShakeShack_round1 = new CompetitorData("ShakeShack","0");

        MatchData firstOf8 = new MatchData(Mcdonalds_round1,Chickfila_round1);
        MatchData secondOf8 = new MatchData(FiveGuys_round1,BurgerKing_round1);
        MatchData thirdOf8 = new MatchData(Popeyes_round1,KFC_round1);
        MatchData fourthOf8 = new MatchData(Canes_round1,DavesHotChicken_round1);
        MatchData fifthOf8 = new MatchData(Wendys_round1,WhiteCastle_round1);
        MatchData sixthOf8 = new MatchData(Chipotle_round1,Subway_round1);
        MatchData seventhOf8 = new MatchData(TacoBell_round1,Portillos_round1);
        MatchData eighthOf8 = new MatchData(PizzaHut_round1,ShakeShack_round1);
        //ROUND2 - Differentiate the items for the second match that would appear in the 2nd colomn and so on
        CompetitorData Chickfila_round2 = new CompetitorData("Chickfila","4");
        CompetitorData FiveGuys_round2 = new CompetitorData("FiveGuys","6");
        CompetitorData Popeyes_round2 = new CompetitorData("Popeyes","6");
        CompetitorData Canes_round2 = new CompetitorData("Canes","4");
        CompetitorData Wendys_round2 = new CompetitorData("Wendys","2");
        CompetitorData Chipotle_round2 = new CompetitorData("Chipotle","8");
        CompetitorData Portillos_round2 = new CompetitorData("Portillos","7");
        CompetitorData PizzaHut_round2 = new CompetitorData("PizzaHut","3");
        //2 items are Added to a match - group items to a match in order to be paired for that colomn
        MatchData firstof4 = new MatchData(Chickfila_round2, FiveGuys_round2);
        MatchData secondof4 = new MatchData(Popeyes_round2, Canes_round2);
        MatchData thirdof4 = new MatchData(Wendys_round2, Chipotle_round2);
        MatchData fourthof4 = new MatchData(Portillos_round2, PizzaHut_round2);

        CompetitorData FiveGuys_round3 = new CompetitorData("FiveGuys", "6");
        CompetitorData Popeyes_round3 = new CompetitorData("Popeyes", "4");
        CompetitorData Portillos_round3 = new CompetitorData("Portillos", "7");
        CompetitorData Chipotle_round3 = new CompetitorData("Chipotle", "3");

        MatchData firstof2 = new MatchData(FiveGuys_round3,Popeyes_round3);
        MatchData secondof2 = new MatchData(Chipotle_round3, Portillos_round3);

        CompetitorData FiveGuys_round4 = new CompetitorData("FiveGuys", "4");
        CompetitorData Portillos_round4 = new CompetitorData("Portillos", "6");

        MatchData Finalround = new MatchData(FiveGuys_round4,Portillos_round4);
        //add those matches to what colomn you want them to appear in
        ColomnData FirstColomn = new ColomnData(Arrays.asList(firstOf8,secondOf8,thirdOf8,fourthOf8,fifthOf8,sixthOf8,seventhOf8,eighthOf8));
        ColomnData SecondColomn = new ColomnData(Arrays.asList(firstof4,secondof4,thirdof4,fourthof4));
        ColomnData ThirdColomn = new ColomnData(Arrays.asList(firstof2,secondof2));
        ColomnData FourthColomn = new ColomnData(Arrays.asList(Finalround));
        //Add all columns that you want to be displayed in the Array List
        bracketsView.setBracketsData(Arrays.asList(FirstColomn,SecondColomn,ThirdColomn,FourthColomn));
    }
    private void setBracketsDataSonnyAngels(BracketsView bracketsView){
        CompetitorData sonnyAngel_round1 = new CompetitorData("Birthday Gift Bear Series","5");
        CompetitorData sonnyAngel2_round1 = new CompetitorData("Flower gift Series","7");
        CompetitorData sonnyAngel3_round1 = new CompetitorData("Animal Series","4");
        CompetitorData sonnyAngel4_round1 = new CompetitorData("Hippers Series","8");
        CompetitorData sonnyAngel5_round1 = new CompetitorData("Wonderland Series","3");
        CompetitorData sonnyAngel6_round1 = new CompetitorData("Gifts of Love Series","9");
        CompetitorData sonnyAngel7_round1 = new CompetitorData("Winter Wonderland Series","2");
        CompetitorData sonnyAngel8_round1 = new CompetitorData("Creatures Series","10");

        MatchData match1 = new MatchData(sonnyAngel_round1,sonnyAngel2_round1);
        MatchData match2 = new MatchData(sonnyAngel3_round1,sonnyAngel4_round1);
        MatchData match3 = new MatchData(sonnyAngel5_round1,sonnyAngel6_round1);
        MatchData match4 = new MatchData(sonnyAngel7_round1,sonnyAngel8_round1);

        CompetitorData sonnyAngel1_round2 = new CompetitorData("Flower gift Series","5");
        CompetitorData sonnyAngel2_round2 = new CompetitorData("Hippers Series","7");
        CompetitorData sonnyAngel3_round2 = new CompetitorData("Gifts of Love Series","8");
        CompetitorData sonnyAngel4_round2 = new CompetitorData("Creatures Series","4");

        MatchData match1Round2 = new MatchData(sonnyAngel1_round2,sonnyAngel2_round2);
        MatchData match2Round2 = new MatchData(sonnyAngel3_round2,sonnyAngel4_round2);

        CompetitorData sonnyAngel1_round3 = new CompetitorData("Hippers Series","6");
        CompetitorData sonnyAngel2_round3 = new CompetitorData("Gifts of Love Series","6");

        MatchData match1Round3 = new MatchData(sonnyAngel1_round3,sonnyAngel2_round3);

        ColomnData first = new ColomnData(Arrays.asList(match1,match2,match3,match4));
        ColomnData sec = new ColomnData(Arrays.asList(match1Round2,match2Round2));
        ColomnData third = new ColomnData(Arrays.asList(match1Round3));

        bracketsView.setBracketsData(Arrays.asList(first,sec,third));
    }
    private void setBracketsDataSports(BracketsView bracketsView){
        CompetitorData playoffsTeam1 = new CompetitorData("Lakers","124");
        CompetitorData playoffsTeam2 = new CompetitorData("Magic","113");
        CompetitorData playoffsTeam3 = new CompetitorData("Celtics","132");
        CompetitorData playoffsTeam4 = new CompetitorData("Knicks","120");
        CompetitorData playoffsTeam5 = new CompetitorData("Clippers","109");
        CompetitorData playoffsTeam6 = new CompetitorData("Bucks","118");
        CompetitorData playoffsTeam7 = new CompetitorData("76ers","125");
        CompetitorData playoffsTeam8 = new CompetitorData("Timberwolves","122");
        CompetitorData playoffsTeam9 = new CompetitorData("Thunder","97");
        CompetitorData playoffsTeam10 = new CompetitorData("Nuggets","112");
        CompetitorData playoffsTeam11 = new CompetitorData("Cavaliers","83");
        CompetitorData playoffsTeam12 = new CompetitorData("Mavericks","96");
        CompetitorData playoffsTeam13 = new CompetitorData("Suns","93");
        CompetitorData playoffsTeam14 = new CompetitorData("Pelicans","92");
        CompetitorData playoffsTeam15 = new CompetitorData("Pacers","125");
        CompetitorData playoffsTeam16 = new CompetitorData("Heat","112");

        MatchData playoffMatch1 = new MatchData(playoffsTeam1,playoffsTeam2);
        MatchData playoffMatch2 = new MatchData(playoffsTeam3,playoffsTeam4);
        MatchData playoffMatch3 = new MatchData(playoffsTeam5,playoffsTeam6);
        MatchData playoffMatch4 = new MatchData(playoffsTeam7,playoffsTeam8);
        MatchData playoffMatch5 = new MatchData(playoffsTeam9,playoffsTeam10);
        MatchData playoffMatch6 = new MatchData(playoffsTeam11,playoffsTeam12);
        MatchData playoffMatch7 = new MatchData(playoffsTeam13,playoffsTeam14);
        MatchData playoffMatch8 = new MatchData(playoffsTeam15,playoffsTeam16);

        ColomnData first = new ColomnData(Arrays.asList(playoffMatch1,playoffMatch2,playoffMatch3,playoffMatch4,playoffMatch5,playoffMatch6,playoffMatch7,playoffMatch8));

        CompetitorData Round1Team1 = new CompetitorData("Lakers","116");
        CompetitorData Round1Team2 = new CompetitorData("Celtics","104");
        CompetitorData Round1Team3 = new CompetitorData("Bucks","122");
        CompetitorData Round1Team4 = new CompetitorData("76ers","114");
        CompetitorData Round1Team5 = new CompetitorData("Nuggets","146");
        CompetitorData Round1Team6 = new CompetitorData("Mavericks","132");
        CompetitorData Round1Team7 = new CompetitorData("Suns","99");
        CompetitorData Round1Team8 = new CompetitorData("Pacers","104");

        MatchData match1Round1 = new MatchData(Round1Team1,Round1Team2);
        MatchData match2Round1 = new MatchData(Round1Team3,Round1Team4);
        MatchData match3Round1 = new MatchData(Round1Team5,Round1Team6);
        MatchData match4Round1 = new MatchData(Round1Team7,Round1Team8);

        ColomnData sec = new ColomnData(Arrays.asList(match1Round1,match2Round1,match3Round1,match4Round1));

        CompetitorData SemiTeam1 = new CompetitorData("Lakers","125");
        CompetitorData SemiTeam2 = new CompetitorData("Bucks","101");
        CompetitorData SemiTeam3 = new CompetitorData("Nuggets","130");
        CompetitorData SemiTeam4 = new CompetitorData("Pacers","111");

        MatchData semiMatch1 = new MatchData(SemiTeam1,SemiTeam2);
        MatchData semiMatch2 = new MatchData(SemiTeam3,SemiTeam4);

        ColomnData third = new ColomnData(Arrays.asList(semiMatch1,semiMatch2));

        CompetitorData FinalTeam1 = new CompetitorData("Lakers","117");
        CompetitorData FinalTeam2 = new CompetitorData("Nuggets","120");

        MatchData finals = new MatchData(FinalTeam1,FinalTeam2);
        ColomnData forth = new ColomnData(Arrays.asList(finals));

        bracketsView.setBracketsData(Arrays.asList(first,sec,third,forth));
    }

    private void setBracketsDataTemplate(BracketsView bracketsView){
        //add the name/items that you want to be included in your tournament bracket
        CompetitorData itemname = new CompetitorData("item_name1", "score");
        CompetitorData itemname2 = new CompetitorData("item_name2", "score");
        CompetitorData itemname3 = new CompetitorData("item_name3", "score");
        CompetitorData itemname4 = new CompetitorData("item_name4", "score");

        CompetitorData Itemname2 = new CompetitorData("item_name2", "Score");
        CompetitorData Itemname4 = new CompetitorData("item_name4", "Score");

        //pair the items up for the matches add as many matches as you want/need
        MatchData match1 = new MatchData(itemname, itemname2);
        MatchData match2 = new MatchData(itemname3,itemname4);
        MatchData match3 = new MatchData(Itemname2, Itemname4);
        //add those matches to the colomn that you want them in
        ColomnData firstColomn = new ColomnData(Arrays.asList(match1,match2));
        ColomnData secondColomn = new ColomnData(Arrays.asList(match3));
        //This is used to show the data in all the colomns
        bracketsView.setBracketsData(Arrays.asList(firstColomn,secondColomn));
        //just add whatever you name the colomns here
    }
}
