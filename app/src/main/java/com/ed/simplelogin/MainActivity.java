package com.ed.simplelogin;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements LeftListFragment.onSelelectedInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_activity);

        LeftListFragment llf = new LeftListFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.leftcontainer,llf).commit();

    }

    @Override
    public void onColorSelected(int pos) {
        RightFragment rf = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.rightfrag);

        if(rf!=null){
            rf.update(2);
        }
        else{
            Log.d("insde constr","indisde scdc");
            RightFragment newfrag = RightFragment.newInstance(pos);
            Bundle bundle = new Bundle();
            bundle.putInt("color",pos);
            newfrag.setArguments(bundle);

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.rightcontainer, newfrag);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}