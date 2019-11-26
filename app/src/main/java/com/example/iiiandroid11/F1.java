package com.example.iiiandroid11;


import android.os.Bundle;

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
    private Button btnLottery;

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
        }
        return mainView;
    }


}
