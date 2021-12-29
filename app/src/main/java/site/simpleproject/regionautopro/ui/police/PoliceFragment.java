package site.simpleproject.regionautopro.ui.police;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import site.simpleproject.regionautopro.R;
import site.simpleproject.regionautopro.ui.SearchClicks;

public class PoliceFragment extends Fragment implements View.OnClickListener {

    private PoliceViewModel policeViewModel;

    TextView numberText, regionText;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        policeViewModel =
                ViewModelProviders.of(this).get(PoliceViewModel.class);
        root = inflater.inflate(R.layout.fragment_civil, container, false);
        numberText = root.findViewById(R.id.numberText);
        regionText = root.findViewById(R.id.regionText);

        numberText.setBackground(getResources().getDrawable(R.drawable.text_rounded_police));

        Button button1 = (Button) root.findViewById(R.id.button1);
        Button button2 = (Button) root.findViewById(R.id.button2);
        Button button3 = (Button) root.findViewById(R.id.button3);
        Button button4 = (Button) root.findViewById(R.id.button4);
        Button button5 = (Button) root.findViewById(R.id.button5);
        Button button6 = (Button) root.findViewById(R.id.button6);
        Button button7 = (Button) root.findViewById(R.id.button7);
        Button button8 = (Button) root.findViewById(R.id.button8);
        Button button9 = (Button) root.findViewById(R.id.button9);
        Button button0 = (Button) root.findViewById(R.id.button0);
        final ImageButton buttonC = (ImageButton) root.findViewById(R.id.buttonC);
        ImageButton buttonSearch = (ImageButton) root.findViewById(R.id.buttonSearch);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonSearch.setOnClickListener(this);

        numberText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (numberText.length()>3){
                    numberText.setText(numberText.getText().toString().substring(0, numberText.getText().length()-1));
                    Toast toast = Toast.makeText(getContext(), "Максимальное число символов 3", Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return root;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                numberText.setText(numberText.getText()+"1");
                break;
            case R.id.button2:
                numberText.setText(numberText.getText()+"2");
                break;
            case R.id.button3:
                numberText.setText(numberText.getText()+"3");
                break;
            case R.id.button4:
                numberText.setText(numberText.getText()+"4");
                break;
            case R.id.button5:
                numberText.setText(numberText.getText()+"5");
                break;
            case R.id.button6:
                numberText.setText(numberText.getText()+"6");
                break;
            case R.id.button7:
                numberText.setText(numberText.getText()+"7");
                break;
            case R.id.button8:
                numberText.setText(numberText.getText()+"8");
                break;
            case R.id.button9:
                numberText.setText(numberText.getText()+"9");
                break;
            case R.id.button0:
                numberText.setText(numberText.getText()+"0");
                break;
            case R.id.buttonC:
                numberText.setText("");
                regionText.setText("");
                break;
            case R.id.buttonSearch:
                //    search(numberText);
                SearchClicks.inputNum(root, "police");
                break;
        }
    }
}