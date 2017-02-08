package bitchassgroceries.happymilk;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Andrew on 2/7/2017.
 */

public class ListFragment extends Fragment {
    String text;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        text = getArguments().getCharSequence("NAME").toString();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView textView = (TextView) view;
        textView.setText("blah");
        return view;
    }
}
