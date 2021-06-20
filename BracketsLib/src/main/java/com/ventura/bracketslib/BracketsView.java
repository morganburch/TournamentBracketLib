package com.ventura.bracketslib;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ventura.bracketslib.fragment.BracketsFragment;
import com.ventura.bracketslib.model.ColomnData;

import java.util.List;

public class BracketsView extends FrameLayout {

    private View view;
    private Context mContext;
    private BracketsFragment bracketFragment;
    private AppCompatActivity mActivity;

    private int backgroundColor;
    private int bracketColor;
    private int textColor;
    private AttributeSet attrs;
    private int defStyleAttr;

    public BracketsView(AppCompatActivity activity) {
        super(activity);
        this.mContext = activity;
        this.mActivity = activity;
        init();
    }

    public BracketsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        this.mActivity = (AppCompatActivity) this.mContext;
        this.attrs = attrs;
        initView(attrs);
        init();
    }


    public BracketsView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        this.mActivity = (AppCompatActivity) this.mContext;
        this.attrs = attrs;
        this.defStyleAttr = defStyleAttr;
        initView(attrs);
        init();
    }

    private void initView(AttributeSet attrs) {
        TypedArray arr = mContext.obtainStyledAttributes(this.attrs,R.styleable.BracketsView,
                this.defStyleAttr,0);
        backgroundColor = arr.getColor(R.styleable.BracketsView_bracketBackgroundColor, 0);
        bracketColor = arr.getColor(R.styleable.BracketsView_bracketColor, 0);
        textColor = arr.getColor(R.styleable.BracketsView_bracketTextColor, 0);
    }

    private void init() {
        this.view = this;
        inflate(mContext, R.layout.layout_bracket_view, this);
        initialiseBracketsFragment();
    }

    private void initialiseBracketsFragment() {
        bracketFragment = new BracketsFragment(backgroundColor, bracketColor, textColor);
        FragmentManager manager = this.mActivity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, bracketFragment, "brackets_home_fragment");
        transaction.commit();
        manager.executePendingTransactions();
    }

    public void setBracketsData(List<ColomnData> colomnList){
        bracketFragment.setBrackets(colomnList);
    }
}
