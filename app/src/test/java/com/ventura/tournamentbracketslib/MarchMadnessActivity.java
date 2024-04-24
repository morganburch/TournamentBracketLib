package com.ventura.tournamentbracketslib;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.ventura.bracketslib.BracketsView;
import com.ventura.bracketslib.model.ColomnData;
import com.ventura.bracketslib.model.CompetitorData;
import com.ventura.bracketslib.model.MatchData;

import java.util.ArrayList;
import java.util.List;

//Data from March Madness 2024 https://www.ncaa.com/march-madness-live/bracket
//conference 1 East
public class MarchMadnessActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, ExampleFragment.class, null)
                    .commit();
        }

        initialiseBracketsView();
    }

    protected void initialiseBracketsView() {
        BracketsView bracketsView = findViewById(R.id.bracket_view);

        CompetitorData UConnFirst = new CompetitorData("UConn", "91");
        CompetitorData UConnSecond = new CompetitorData("UConn", "75");
        CompetitorData UConnSixteen = new CompetitorData("UConn", "82");
        CompetitorData UConnEight = new CompetitorData("UConn", "77");
        CompetitorData UConnFour = new CompetitorData("UConn", "86");
        CompetitorData UConnFinal = new CompetitorData("UConn", "75");

        CompetitorData ILFirst = new CompetitorData("IL", "85");
        CompetitorData ILSecond = new CompetitorData("IL", "89");
        CompetitorData ILSixteen = new CompetitorData("IL", "72");
        CompetitorData ILEight = new CompetitorData("IL", "77");
        CompetitorData ILFour = new CompetitorData("IL", "52");

        CompetitorData SDFirst = new CompetitorData("SD", "69");
        CompetitorData SDSecond = new CompetitorData("SD", "85");
        CompetitorData SDSixteen = new CompetitorData("SD", "52");

        CompetitorData IowaFirst = new CompetitorData("Iowa", "82");
        CompetitorData IowaSecond = new CompetitorData("Iowa", "67");
        CompetitorData IowaSixteen = new CompetitorData("Iowa", "69");

        CompetitorData NorthwesternFirst = new CompetitorData("Northwestern", "52");
        CompetitorData NorthwesternSecond = new CompetitorData("Northwestern", "58");

        CompetitorData YaleFirst = new CompetitorData("Yale", "91");
        CompetitorData YaleSecond = new CompetitorData("Yale", "75");

        CompetitorData DuqueneseFirst = new CompetitorData("Duquenese", "71");
        CompetitorData DuqueneseSecond = new CompetitorData("Duquenese", "63");

        CompetitorData WashStateFirst = new CompetitorData("WashState", "91");
        CompetitorData WashStateSecond = new CompetitorData("WashState", "75");

        CompetitorData StetsonFirst = new CompetitorData("Stetson", "52");

        CompetitorData FAUFirst = new CompetitorData("FAU", "65");

        CompetitorData UABFirst = new CompetitorData("UAB", "65");

        CompetitorData AuburnFirst = new CompetitorData("Auburn", "76");

        CompetitorData BYUFirst = new CompetitorData("BYU", "67");

        CompetitorData MoreheadFirst = new CompetitorData("Morehead", "69");

        CompetitorData DrakeFirst = new CompetitorData("Drake", "61");

        CompetitorData SouthDakotaFirst = new CompetitorData("SouthDakota", "65");

//conference 2 Midwest
        CompetitorData PurdueFirst = new CompetitorData("Purdue", "78");
        CompetitorData PurdueSecond = new CompetitorData("Purdue", "106");
        CompetitorData PurdueSixteen = new CompetitorData("Purdue", "80");
        CompetitorData PurdueEight = new CompetitorData("Purdue", "72");
        CompetitorData PurdueFour = new CompetitorData("Purdue", "63");
        CompetitorData PurdueFinal = new CompetitorData("Purdue", "60");

        CompetitorData TNStateFirst = new CompetitorData("TNState", "83");
        CompetitorData TNStateSecond = new CompetitorData("TNState", "62");
        CompetitorData TNStateSixteen = new CompetitorData("TNState", "82");
        CompetitorData TNStateEight = new CompetitorData("TNState", "66");

        CompetitorData GonzagaFirst = new CompetitorData("Gonzaga", "86");
        CompetitorData GonzagaSecond = new CompetitorData("Gonzaga", "89");
        CompetitorData GonzagaSixteen = new CompetitorData("Gonzaga", "68");

        CompetitorData CreightonFirst = new CompetitorData("Creighton", "77");
        CompetitorData CreightonSecond = new CompetitorData("Creighton", "86");
        CompetitorData CreightonSixteen = new CompetitorData("Creighton", "75");

        CompetitorData UTStateFirst = new CompetitorData("UTState", "88");
        CompetitorData UTStateSecond = new CompetitorData("UTState", "67");

        CompetitorData KSFirst = new CompetitorData("KS", "93");
        CompetitorData KSSecond = new CompetitorData("KS", "68");

        CompetitorData ORFirst = new CompetitorData("OR", "87");
        CompetitorData ORSecond = new CompetitorData("OR", "73");

        CompetitorData TXFirst = new CompetitorData("TX", "56");
        CompetitorData TXSecond = new CompetitorData("TX", "58");

        CompetitorData GramblingStFirst = new CompetitorData("Grambling St", "50");

        CompetitorData TCUFirst = new CompetitorData("TCU", "72");

        CompetitorData McNeeseFirst = new CompetitorData("McNeese", "65");

        CompetitorData SamfordFirst = new CompetitorData("Samford", "72");

        CompetitorData SCFirst = new CompetitorData("South Carolina", "72");

        CompetitorData Akronirst = new CompetitorData("Akron", "72");

        CompetitorData COSTATEFirst = new CompetitorData("CO STATE", "72");

        CompetitorData StPetersFirst = new CompetitorData("St Peter's", "72");


//MatchData EastMatchData ER1M1 = new MatchData(UConnFirst, StetsonFirst);
        MatchData ER2M1 = new MatchData(UConnSecond, NorthwesternSecond);
        MatchData ER16M1 = new MatchData(UConnSixteen, SDSixteen);
        MatchData ER8M1 = new MatchData(UConnEight, ILEight); //final matchup for this conference
        MatchData ER1M2 = new MatchData(FAUFirst, NorthwesternFirst);
        MatchData ER1M3 = new MatchData(SDFirst, UABFirst);
        MatchData ER2M2 = new MatchData(SDSecond, YaleSecond);
        MatchData ER1M4 = new MatchData(AuburnFirst, YaleFirst);
        MatchData ER1M5 = new MatchData(BYUFirst, DuqueneseFirst);
        MatchData ER2M3 = new MatchData(DuqueneseSecond, ILSecond);
        MatchData ER1M6 = new MatchData(ILFirst, MoreheadFirst);
        MatchData ER1M7 = new MatchData(WashStateFirst, DrakeFirst);
        MatchData ER2M4 = new MatchData(WashStateSecond, IowaSecond);
        MatchData ER1M8 = new MatchData(IowaFirst, SouthDakotaFirst);
        MatchData ER16M2 = new MatchData(ILSixteen, IowaSixteen);

//MatchData Midwest

        MatchData MWR1M1 = new MatchData(GramblingStFirst, PurdueFirst);
        MatchData MWR1M2 = new MatchData(TCUFirst, UTStateFirst);
        MatchData MWR1M3 = new MatchData(McNeeseFirst, GonzagaFirst);
        MatchData MWR1M4 = new MatchData(SamfordFirst, KSFirst);
        MatchData MWR1M5 = new MatchData(SCFirst, ORFirst);
        MatchData MWR1M6 = new MatchData(Akronirst, CreightonFirst);
        MatchData MWR1M7 = new MatchData(COSTATEFirst, TXFirst);
        MatchData MWR1M8 = new MatchData(StPetersFirst, TNStateFirst);
        MatchData MWR2M1 = new MatchData(UTStateSecond, PurdueSecond);
        MatchData MWR2M2 = new MatchData(KSSecond, GonzagaSecond);
        MatchData MWR2M3 = new MatchData(ORSecond, CreightonSecond);
        MatchData MWR2M4 = new MatchData(TXSecond, TNStateSecond);
        MatchData MWR16M1 = new MatchData(GonzagaSixteen, PurdueSixteen);
        MatchData MWR16M2 = new MatchData(CreightonSixteen, TNStateSixteen);
        MatchData MWR8M1 = new MatchData(TNStateEight, PurdueEight);

//ColumnData

// East Group MatchData instances into lists based on their labels
        List<MatchData> eastRound1Matches = new ArrayList<>();
        //eastRound1Matches.add(ER1M1);
        eastRound1Matches.add(ER1M2);
        eastRound1Matches.add(ER1M3);
        eastRound1Matches.add(ER1M4);
        eastRound1Matches.add(ER1M5);
        eastRound1Matches.add(ER1M6);
        eastRound1Matches.add(ER1M7);
        eastRound1Matches.add(ER1M8);

        List<MatchData> eastRound2Matches = new ArrayList<>();
        //eastRound2Matches.add(ER2M1);
        eastRound2Matches.add(ER2M2);
        eastRound2Matches.add(ER2M3);
        eastRound2Matches.add(ER2M4);

        List<MatchData> eastRound16Matches = new ArrayList<>();
        eastRound16Matches.add(ER16M1);
        //eastRound16Matches.add(ER16M2);

// East Create ColomnData instances for each group of matches
        ColomnData eastRound1ColomnData = new ColomnData(eastRound1Matches);
        ColomnData eastRound2ColomnData = new ColomnData(eastRound2Matches);
        ColomnData eastRound16ColomnData = new ColomnData(eastRound16Matches);

// Midwest Group MatchData instances into lists based on their labels
        List<MatchData> midwestRound1Matches = new ArrayList<>();
        midwestRound1Matches.add(MWR1M1);
        midwestRound1Matches.add(MWR1M2);
        midwestRound1Matches.add(MWR1M3);
        midwestRound1Matches.add(MWR1M4);
        midwestRound1Matches.add(MWR1M5);
        midwestRound1Matches.add(MWR1M6);
        midwestRound1Matches.add(MWR1M7);
        midwestRound1Matches.add(MWR1M8);

        List<MatchData> midwestRound2Matches = new ArrayList<>();
        midwestRound2Matches.add(MWR2M1);
        midwestRound2Matches.add(MWR2M2);
        midwestRound2Matches.add(MWR2M3);
        midwestRound2Matches.add(MWR2M4);

        List<MatchData> midwestRound16Matches = new ArrayList<>();
        midwestRound16Matches.add(MWR16M1);
        midwestRound16Matches.add(MWR16M2);

        List<MatchData> midwestRound8Matches = new ArrayList<>();
        midwestRound8Matches.add(MWR8M1);


// Create ColomnData instances for midwest region
        ColomnData midwestRound1ColomnData = new ColomnData(midwestRound1Matches);
        ColomnData midwestRound2ColomnData = new ColomnData(midwestRound2Matches);
        ColomnData midwestRound16ColomnData = new ColomnData(midwestRound16Matches);
        ColomnData midwestRound8ColomnData = new ColomnData(midwestRound8Matches);

//MatchData Final

        MatchData EvMW = new MatchData(UConnFinal, PurdueFinal);
        List<MatchData> FinalMatch = new ArrayList<>();
        FinalMatch.add(EvMW);
        ColomnData FinalMatchColumnData = new ColomnData(FinalMatch);

//TODO conference west


//TODO conference south

    }
}
