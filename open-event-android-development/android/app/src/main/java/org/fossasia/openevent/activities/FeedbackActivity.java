package org.fossasia.openevent.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.fossasia.openevent.R;
import org.fossasia.openevent.adapters.FeedAdapter;
import org.fossasia.openevent.fragments.BaseFragment;
import org.fossasia.openevent.utils.NetworkUtils;

import java.util.ArrayList;

import butterknife.BindView;

public class FeedbackActivity extends BaseFragment {
    @BindView(R.id.buttonSubmit)
    Button submit;
    @Override
    protected int getLayoutResource() {
        return R.layout.feedback_presentation;
    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        setHasOptionsMenu(true);
//
//        View view = super.onCreateView(inflater, container, savedInstanceState);
//
//        feedItems = new ArrayList<>();
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
//        feedRecyclerView.setLayoutManager(mLayoutManager);
//        feedAdapter = new FeedAdapter(getContext(), (FeedAdapter.AdapterCallback)getActivity(), feedItems);
//        feedRecyclerView.setAdapter(feedAdapter);
//
//        setupProgressBar();
//
//        if(NetworkUtils.haveNetworkConnection(getContext()))
//            showProgressBar(true);
//
//        downloadFeed();
//
//        swipeRefreshLayout.setOnRefreshListener(this::refresh);
//
//        return view;
//    }
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
//    public void SubmitFeedback() {
//        MysqlCon asyncTask;
//        asyncTask = (MysqlCon) new MysqlCon(new MysqlCon.AsyncResponse() {
//
//            @Override
//            public void processFinish(String output) {
//                System.out.print(output);
//            }
//        }).execute();
//    }
}
