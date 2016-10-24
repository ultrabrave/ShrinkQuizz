package cl.enexo.shrinkquizz.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import cl.enexo.shrinkquizz.R;
import cl.enexo.shrinkquizz.adapters.PagerAdapter;
import cl.enexo.shrinkquizz.data.MatchResult;

public class MatchFragment extends Fragment {
    private TextInputEditText etuser,etlover;
    private RadioGroup radiogroup;

    public MatchFragment() {
    }

    public static MatchFragment newInstance() {
        return new MatchFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etuser = (TextInputEditText) view.findViewById(R.id.et_userName);
        etlover = (TextInputEditText)view.findViewById(R.id.et_loverName);
        radiogroup = (RadioGroup) view.findViewById(R.id.rg_quarter);
        Button btn = (Button) view.findViewById(R.id.sendBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user =  etuser.getText().toString();
                String lover = etlover.getText().toString();

                int radioButtonId = radiogroup.getCheckedRadioButtonId();
                String quarter = "";
                if (radioButtonId != -1)
                {
                    RadioButton radioButton =(RadioButton)  radiogroup.findViewById(radioButtonId);
                    quarter = radioButton.getText().toString();

                    MatchResult matchresult = new MatchResult(user,lover,quarter,getContext());
                    AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                    dialog.setMessage(matchresult.Result());
                    dialog.show();
                }


            }
        });
    }
}
