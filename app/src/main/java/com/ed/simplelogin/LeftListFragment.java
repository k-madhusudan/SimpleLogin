package com.ed.simplelogin;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftListFragment extends Fragment {

    onSelelectedInterface mCall;
    public LeftListFragment() {

        // Required empty public constructor
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button red = (Button) view.findViewById(R.id.button);
        Button green = (Button) view.findViewById(R.id.button2);
        Button blue = (Button) view.findViewById(R.id.button3);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCall.onColorSelected(0);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCall.onColorSelected(1);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCall.onColorSelected(2);
            }
        });





    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_left, container, false);


    }


    public interface onSelelectedInterface{
        public void onColorSelected(int pos);
    }


/*
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Send the event to the host activity
        mCall.onColorSelected(position);
    }
*/



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            mCall = (onSelelectedInterface)activity;

        }
        catch(Exception e){
            throw new ClassCastException("Hello");
        }

    }
}
