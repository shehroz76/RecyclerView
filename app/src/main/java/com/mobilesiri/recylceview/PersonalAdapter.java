package com.mobilesiri.recylceview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by muffaddal on 1/29/2016.
 */
public class PersonalAdapter extends RecyclerView.Adapter<PersonalAdapter.PersonalViewHolder> {

    private List<PersonalInfo> PersonalList;

    public PersonalAdapter(List<PersonalInfo> PersonalList)
    {
        this.PersonalList = PersonalList;
    }

    @Override
    public int getItemCount()
    {
        return PersonalList.size();
    }


    @Override
    public void onBindViewHolder(PersonalViewHolder PersonalViewHolder, int i)
    {
        PersonalInfo Pi = PersonalList.get(i);
        PersonalViewHolder.tvName.setText(Pi.name);
        PersonalViewHolder.tvFname.setText(Pi.fname);
        PersonalViewHolder.tvEmail.setText(Pi.email);
    }

    @Override
    public PersonalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout. recycle_view_items, viewGroup, false);

        return new PersonalViewHolder(itemView);
    }





    public class PersonalViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName;
        private TextView tvFname;
        private TextView tvEmail;


        public PersonalViewHolder(View v) {
            super(v);
            tvName =  (TextView) v.findViewById(R.id.Name);
            tvFname = (TextView)  v.findViewById(R.id.Fname);
            tvEmail = (TextView)  v.findViewById(R.id.Email);

        }
    }
}
