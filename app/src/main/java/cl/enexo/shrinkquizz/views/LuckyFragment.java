package cl.enexo.shrinkquizz.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import cl.enexo.shrinkquizz.R;
import cl.enexo.shrinkquizz.data.LuckyResult;

/**
 * Created by Kevin on 21-10-2016.
 */
public class LuckyFragment extends Fragment {

    public LuckyFragment() {

    }

    public static LuckyFragment newInstance() {

        return new LuckyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox happy = (CheckBox) view.findViewById(R.id.cb_happy);
        final CheckBox mood = (CheckBox) view.findViewById(R.id.cb_mood);

        mood.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mood.setChecked(isChecked);
            }
        });

        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //boolean hp = happy.isChecked();
            }
        });

        Button btn = (Button) view.findViewById(R.id.sendBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean hp = happy.isChecked();
                LuckyResult luckyresult = new LuckyResult(hp);
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(luckyresult.result());
                dialog.show();

            }
        });
    }
}
