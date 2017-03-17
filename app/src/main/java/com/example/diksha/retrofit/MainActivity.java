package com.example.diksha.retrofit;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CardAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);
        updateUI();
    }
    private void updateUI(){
        //Todo not sure if this is correct.
        FriendsModel friendsModel= new FriendsModel(getApplicationContext());
        List<Friend> friends = friendsModel.getfriends();
        mAdapter = new CardAdapter(friends);
        mRecyclerView.setAdapter(mAdapter);
    }

    public class CardHolder extends RecyclerView.ViewHolder{
        public TextView mname;
        public TextView mroll_no;
        public TextView mBranch;

        public CardHolder(View v){
            super(v);
            mname = (TextView)v.findViewById(R.id.text_view_name);
            mroll_no = (TextView)v.findViewById(R.id.text_view_roll);
            mBranch = (TextView)v.findViewById(R.id.text_view_branch);

        }
    }

    public class CardAdapter extends RecyclerView.Adapter<CardHolder>{
        private List<Friend> mFriends;
        public CardAdapter(List<Friend> friend){
            mFriends = friend;
        }
        @Override
        public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
            return new CardHolder(v);
        }


        @Override
        public void onBindViewHolder(CardHolder holder, int position) {
                   Friend friend = mFriends.get(position);
            holder.mname.setText(friend.getName());
            holder.mroll_no.setText(friend.getRollNo());
            holder.mBranch.setText(friend.getBranch());
        }

        @Override
        public int getItemCount() {
            return mFriends.size();
        }
    }


}

