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

        //AddedQuarterfinaldatatoworkwithmoredataforuserinterface
        CompetitorData brazilQuarterFinal = new CompetitorData("Brazil","7");
        CompetitorData portugalQuarterFinal = new CompetitorData("Portugal","5");
        CompetitorData argentinaQuarterFinal = new CompetitorData("Argentina","4");
        CompetitorData mexicoQuarterFinal = new CompetitorData("Mexico","0");
        CompetitorData usaQuarterFinal = new CompetitorData("USA","0");
        CompetitorData englandQuarterFinal = new CompetitorData("England","3");
        CompetitorData russiaQuarterFinal = new CompetitorData("Russia","3");
        CompetitorData franceQuarterFinal = new CompetitorData("France","1");

        CompetitorData brazilSemiFinal = new CompetitorData("Brazil", "3");
        CompetitorData englandSemiFinal = new CompetitorData("England", "1");
        CompetitorData argentinaSemiFinal = new CompetitorData("Argentina", "3");
        CompetitorData russiaSemiFinal = new CompetitorData("Russia", "2");
        CompetitorData brazilFinal = new CompetitorData("Brazil", "4");
        CompetitorData argentinaFinal = new CompetitorData("Argentina", "2");

        //New data added
        MatchData match1QuarterFinal= new MatchData(brazilQuarterFinal,portugalQuarterFinal);
        MatchData match2QuarterFinal= new MatchData(usaQuarterFinal,englandQuarterFinal);
        MatchData match3QuarterFinal= new MatchData(argentinaQuarterFinal,mexicoQuarterFinal);
        MatchData match4QuarterFinal= new MatchData(russiaQuarterFinal,franceQuarterFinal);

        MatchData match1SemiFinal = new MatchData(brazilSemiFinal, englandSemiFinal);
        MatchData match2SemiFinal = new MatchData(argentinaSemiFinal, russiaSemiFinal);
        MatchData match3Final = new MatchData(brazilFinal, argentinaFinal);

        //new data added
        ColomnData QuarterFinalColumn = new ColomnData(Arrays.asList(match1QuarterFinal,match2QuarterFinal,match3QuarterFinal,match4QuarterFinal));

        ColomnData semiFinalColomn = new ColomnData(Arrays.asList(match1SemiFinal, match2SemiFinal));
        ColomnData finalColomn = new ColomnData(Arrays.asList(match3Final));

        bracketsView.setBracketsData(Arrays.asList(QuarterFinalColumn, semiFinalColomn, finalColomn));

    }
}
//This is the one that is being loaded onto the phone currently when run app