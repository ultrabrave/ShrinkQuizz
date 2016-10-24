package cl.enexo.shrinkquizz.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import cl.enexo.shrinkquizz.R;
import cl.enexo.shrinkquizz.data.CoolResult;

/**
 * Created by Kevin on 21-10-2016.
 */
public class CoolFragment extends Fragment {
TextInputEditText userName;
    private Switch partywitch;
    private TextView counter;
    private SeekBar drinksseekbar;
    private Button button;
    public CoolFragment() {

    }

    public static CoolFragment newInstance() {
        return new CoolFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cool, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        userName = (TextInputEditText) view.findViewById(R.id.et_name);
        partywitch = (Switch) view.findViewById(R.id.sw_party);
        counter = (TextView) view.findViewById(R.id.tv_counter);
        drinksseekbar = (SeekBar) view.findViewById(R.id.sb_drink);

        drinksseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                counter .setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button = (Button) view.findViewById(R.id.sendBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                Boolean party = partywitch.isChecked();
                int drinks = drinksseekbar.getProgress();

                CoolResult coolresult = new CoolResult(name,party,drinks);
                AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
                dialog.setMessage(coolresult.result());
                dialog.show();
            }
        });
    }
}
