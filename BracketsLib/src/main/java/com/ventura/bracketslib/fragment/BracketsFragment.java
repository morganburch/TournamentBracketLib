package com.ventura.bracketslib.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.ventura.bracketslib.R;
import com.ventura.bracketslib.adapter.BracketsSectionAdapter;
import com.ventura.bracketslib.application.BracketsApplication;
import com.ventura.bracketslib.customviews.WrapContentHeightViewPager;
import com.ventura.bracketslib.model.ColomnData;
import com.ventura.bracketslib.model.CompetitorData;
import com.ventura.bracketslib.model.MatchData;
import com.ventura.bracketslib.utility.BracketsUtility;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by Emil on 21/10/17.
 */

public class BracketsFragment extends Fragment implements ViewPager.OnPageChangeListener {

    private WrapContentHeightViewPager viewPager;
    private BracketsSectionAdapter sectionAdapter;
    private ArrayList<ColomnData> sectionList;
    private int mNextSelectedScreen;
    private int mCurrentPagerState;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_brackts, container, false);
    }


    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
//        setData();
        intialiseViewPagerAdapter();
    }

    public void setBrackets(int numberOfColumns, List<ColomnData> columnDataList) {
        sectionList = new ArrayList<>();
        sectionList.addAll(columnDataList);
//        if (sectionAdapter != null)
//            sectionAdapter.notifyDataSetChanged();
    }

    private void setData() {
        sectionList = new ArrayList<>();
        ArrayList<MatchData> Colomn1matchesList = new ArrayList<>();
        ArrayList<MatchData> colomn2MatchesList = new ArrayList<>();
        ArrayList<MatchData> colomn3MatchesList = new ArrayList<>();
        CompetitorData competitorOne = new CompetitorData("Manchester United Fc", "2");
        CompetitorData competitorTwo = new CompetitorData("Arsenal", "1");
        CompetitorData competitorThree = new CompetitorData("Chelsea", "2");
        CompetitorData competitorFour = new CompetitorData("Tottenham", "1");
        CompetitorData competitorFive = new CompetitorData("Manchester FC", "2");
        CompetitorData competitorSix = new CompetitorData("Liverpool", "4");
        CompetitorData competitorSeven = new CompetitorData("West ham ", "2");
        CompetitorData competitorEight = new CompetitorData("Bayern munich", "1");
        MatchData matchData1 = new MatchData(competitorOne, competitorTwo);
        MatchData matchData2 = new MatchData(competitorThree, competitorFour);
        MatchData matchData3 = new MatchData(competitorFive, competitorSix);
        MatchData matchData4 = new MatchData(competitorSeven, competitorEight);
        Colomn1matchesList.add(matchData1);
        Colomn1matchesList.add(matchData2);
        Colomn1matchesList.add(matchData3);
        Colomn1matchesList.add(matchData4);
        ColomnData colomnData1 = new ColomnData(Colomn1matchesList);
        sectionList.add(colomnData1);
        CompetitorData competitorNine = new CompetitorData("Manchester United Fc", "2");
        CompetitorData competitorTen = new CompetitorData("Chelsea", "4");
        CompetitorData competitorEleven = new CompetitorData("Liverpool", "2");
        CompetitorData competitorTwelve = new CompetitorData("westham", "1");
        MatchData matchData5 = new MatchData(competitorNine, competitorTen);
        MatchData matchData6 = new MatchData(competitorEleven, competitorTwelve);
        colomn2MatchesList.add(matchData5);
        colomn2MatchesList.add(matchData6);
        ColomnData colomnData2 = new ColomnData(colomn2MatchesList);
        sectionList.add(colomnData2);
        CompetitorData competitorThirteen = new CompetitorData("Chelsea", "2");
        CompetitorData competitorForteen = new CompetitorData("Liverpool", "1");
        MatchData matchData7 = new MatchData(competitorThirteen, competitorForteen);
        colomn3MatchesList.add(matchData7);
        ColomnData colomnData3 = new ColomnData(colomn3MatchesList);
        sectionList.add(colomnData3);

    }

    private void intialiseViewPagerAdapter() {

        sectionAdapter = new BracketsSectionAdapter(getChildFragmentManager(), this.sectionList);
        viewPager.setOffscreenPageLimit(10);
        viewPager.setAdapter(sectionAdapter);
        viewPager.setCurrentItem(0);
        viewPager.setPageMargin(-200);
        viewPager.setHorizontalFadingEdgeEnabled(true);
        viewPager.setFadingEdgeLength(50);

        viewPager.addOnPageChangeListener(this);
        sectionAdapter.notifyDataSetChanged();
    }

    private void initViews(View view) {

        viewPager = view.findViewById(R.id.container);

    }

    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        if (mCurrentPagerState != ViewPager.SCROLL_STATE_SETTLING) {
            // We are moving to next screen on right side
            if (positionOffset > 0.5) {
                // Closer to next screen than to current
                if (position + 1 != mNextSelectedScreen) {
                    mNextSelectedScreen = position + 1;
                    //update view here
                    if (getBracketsFragment(position).getColomnList().get(0).getHeight()
                            != dpToPx(131))
                        getBracketsFragment(position).shrinkView(dpToPx(131));
                    if (getBracketsFragment(position + 1).getColomnList().get(0).getHeight()
                            != dpToPx(131))
                        getBracketsFragment(position + 1).shrinkView(dpToPx(131));
                }
            } else {
                // Closer to current screen than to next
                if (position != mNextSelectedScreen) {
                    mNextSelectedScreen = position;
                    //updateViewhere

                    if (getBracketsFragment(position + 1).getCurrentBracketSize() ==
                            getBracketsFragment(position + 1).getPreviousBracketSize()) {
                        getBracketsFragment(position + 1).shrinkView(dpToPx(131));
                        getBracketsFragment(position).shrinkView(dpToPx(131));
                    } else {
                        int currentFragmentSize = getBracketsFragment(position + 1).getCurrentBracketSize();
                        int previousFragmentSize = getBracketsFragment(position + 1).getPreviousBracketSize();
                        if (currentFragmentSize != previousFragmentSize) {
                            getBracketsFragment(position + 1).expandHeight(dpToPx(262));
                            getBracketsFragment(position).shrinkView(dpToPx(131));
                        }
                    }
                }
            }
        } else {
            // We are moving to next screen left side
            if (positionOffset > 0.5) {
                // Closer to current screen than to next
                if (position + 1 != mNextSelectedScreen) {
                    mNextSelectedScreen = position + 1;
                    //update view for screen

                }
            } else {
                // Closer to next screen than to current
                if (position != mNextSelectedScreen) {
                    mNextSelectedScreen = position;
                    //updateviewfor screem
                }
            }
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public BracketsColomnFragment getBracketsFragment(int position) {
        BracketsColomnFragment bracktsFrgmnt = null;
        if (getChildFragmentManager() != null) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if (fragment instanceof BracketsColomnFragment) {
                        bracktsFrgmnt = (BracketsColomnFragment) fragment;
                        if (bracktsFrgmnt.getSectionNumber() == position)
                            break;
                    }
                }
            }
        }
        return bracktsFrgmnt;
    }
}
