package org.fossasia.openevent.fragments;

/**
 * Created by I14746 on 10/26/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.ListView;

import android.os.Bundle;

import org.fossasia.openevent.R;

import butterknife.BindView;


public class MastersFeedback extends BaseFragment {


    @Override
    protected int getLayoutResource() {
        return R.layout.masters_feedback;
    }
    @BindView(R.id.mastersfbSubmit)
    Button submit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        View view = super.onCreateView(inflater, container, savedInstanceState);

        super.onCreate(savedInstanceState);
        submit = (Button) view.findViewById(R.id.mastersfbSubmit);
        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubmitFeedback();

            }
        });

        return view;
    }
    public void SubmitFeedback() {
        MysqlCon asyncTask;
        asyncTask = (MysqlCon) new MysqlCon(new MysqlCon.AsyncResponse() {

            @Override
            public void processFinish(String output) {
                System.out.print(output);
            }
        }).execute();
    }
}

