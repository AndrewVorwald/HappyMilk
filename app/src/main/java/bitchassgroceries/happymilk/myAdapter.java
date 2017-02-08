package bitchassgroceries.happymilk;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Andrew on 2/7/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> data;

    public MyAdapter(ArrayList<String> list){
        data = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TextView mTextView = (TextView)holder.mLinearLayout.findViewById(R.id.item_name);
        mTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public LinearLayout mLinearLayout;

        public ViewHolder(LinearLayout v){
            super(v);
            mLinearLayout = v;
        }
    }
}
