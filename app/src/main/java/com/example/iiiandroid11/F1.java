package com.example.iiiandroid11;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {
    private View mainView;
    private TextView lottery;
    private Button btnLottery, btnTest2, btnTest3;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f1, container, false);

            lottery = mainView.findViewById(R.id.f1_lottery);
            btnLottery = mainView.findViewById(R.id.f1_btn);
            btnLottery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lottery.setText("" + (int) (Math.random() * 49 + 1));
                }
            });

            btnTest2 = mainView.findViewById(R.id.f1_btn2);
            btnTest2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.setMyTitle("Hello, Brad");
                }
            });

            btnTest3 = mainView.findViewById(R.id.f1_btn3);
            btnTest3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mainActivity.getF2().chTitle("I am Brad");
                }
            });

        }
        return mainView;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        mainActivity = (MainActivity)context;
    }
}
