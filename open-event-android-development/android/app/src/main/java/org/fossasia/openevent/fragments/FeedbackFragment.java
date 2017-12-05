package org.fossasia.openevent.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.fossasia.openevent.R;
import org.fossasia.openevent.adapters.FeedAdapter;
import org.fossasia.openevent.utils.NetworkUtils;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by I14746 on 10/26/2017.
 */

public class FeedbackFragment extends BaseFragment {
    @BindView(R.id.buttonSubmit)
    Button submit;
    @Override
    protected int getLayoutResource()  {
        return R.layout.feedback_presentation;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        View view = super.onCreateView(inflater, container, savedInstanceState);

        super.onCreate(savedInstanceState);
        submit = (Button) view.findViewById(R.id.buttonSubmit);
        submit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubmitFeedback();

            }
        });

        return view;
    }
    //    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.feedback_presentation);
//        submit = (Button) findViewById(R.id.buttonSubmit);
//        submit.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SubmitFeedback();
//
//            }
//        });
//    }
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
