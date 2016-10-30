package com.ed.simplelogin;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {

    public static int ARG_COLOR;
    public RightFragment() {
        // Required empty public constructor
        //ARG_COLOR = getArguments().getInt("color");
    }


    public static RightFragment newInstance(int colr){
        RightFragment rf = new RightFragment();
        ARG_COLOR = colr;
        return rf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout lr = (LinearLayout) view.findViewById(R.id.rightfrag);

        int col = getArguments().getInt("color");
        Log.d("color is ",""+col);
        if(col == 0){
            lr.setBackgroundColor(Color.RED);
        }
        if(col == 1){
            lr.setBackgroundColor(Color.GREEN);
        }
        if(col == 2){
            lr.setBackgroundColor(Color.BLUE);
        }



    }

    public void update(int color){
        Log.d("INSIDE RF","color value is:"+color);
    }
}