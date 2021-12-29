package site.simpleproject.regionautopro.ui.civil;

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

public class CivilFragment extends Fragment implements View.OnClickListener {

    private CivilViewModel civilViewModel;

    TextView numberText, regionText;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        civilViewModel =
                ViewModelProviders.of(this).get(CivilViewModel.class);
        root = inflater.inflate(R.layout.fragment_civil, container, false);
        numberText = root.findViewById(R.id.numberText);
        regionText = root.findViewById(R.id.regionText);

        numberText.setBackground(getResources().getDrawable(R.drawable.text_rounded_civil));

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
                SearchClicks.inputNum(root, "civil");
                break;
        }
    }

/*
    public void search(TextView text){

        if (text.getText().length()>0) {
            switch (text.getText().toString()) {
                case "01":
                    regionText.setText(R.string.adygeya);
                    break;
                case "02":
                    regionText.setText(R.string.bash);
                    break;
                case "102":
                    regionText.setText(R.string.bash);
                    break;
                case "702":
                    regionText.setText(R.string.bash);
                    break;
                case "03":
                    regionText.setText(R.string.bur);
                    break;
                case "04":
                    regionText.setText(R.string.altay);
                    break;
                case "05":
                    regionText.setText(R.string.dages);
                    break;
                case "06":
                    regionText.setText(R.string.ingush);
                    break;
                case "07":
                    regionText.setText(R.string.kabard);
                    break;
                case "08":
                    regionText.setText(R.string.kalm);
                    break;
                case "09":
                    regionText.setText(R.string.karach);
                    break;
                case "10":
                    regionText.setText(R.string.karel);
                    break;
                case "11":
                    regionText.setText(R.string.komi);
                    break;
                case "12":
                    regionText.setText(R.string.mariy);
                    break;
                case "13":
                    regionText.setText(R.string.mordov);
                    break;
                case "113":
                    regionText.setText(R.string.mordov);
                    break;
                case "14":
                    regionText.setText(R.string.saha);
                    break;
                case "15":
                    regionText.setText(R.string.sevoset);
                    break;
                case "16":
                    regionText.setText(R.string.tatars);
                    break;
                case "116":
                    regionText.setText(R.string.tatars);
                    break;
                case "716":
                    regionText.setText(R.string.tatars);
                    break;
                case "17":
                    regionText.setText(R.string.tyva);
                    break;
                case "18":
                    regionText.setText(R.string.udmur);
                    break;
                case "19":
                    regionText.setText(R.string.hakas);
                    break;
                case "21":
                    regionText.setText(R.string.chuva);
                    break;
                case "121":
                    regionText.setText(R.string.chuva);
                    break;
                case "22":
                    regionText.setText(R.string.altkray);
                    break;
                case "122":
                    regionText.setText(R.string.altkray);
                    break;
                case "23":
                    regionText.setText(R.string.krdar);
                    break;
                case "93":
                    regionText.setText(R.string.krdar);
                    break;
                case "123":
                    regionText.setText(R.string.krdar);
                    break;
                case "193":
                    regionText.setText(R.string.krdar);
                    break;
                case "24":
                    regionText.setText(R.string.kryar);
                    break;
                case "84":
                    regionText.setText(R.string.kryar);
                    break;
                case "88":
                    regionText.setText(R.string.kryar);
                    break;
                case "124":
                    regionText.setText(R.string.kryar);
                    break;
                case "25":
                    regionText.setText(R.string.prim);
                    break;
                case "125":
                    regionText.setText(R.string.prim);
                    break;
                case "26":
                    regionText.setText(R.string.stavr);
                    break;
                case "126":
                    regionText.setText(R.string.stavr);
                    break;
                case "27":
                    regionText.setText(R.string.habar);
                    break;
                case "127":
                    regionText.setText(R.string.habar);
                    break;
                case "28":
                    regionText.setText(R.string.amur);
                    break;
                case "29":
                    regionText.setText(R.string.arhan);
                    break;
                case "30":
                    regionText.setText(R.string.astrah);
                    break;
                case "31":
                    regionText.setText(R.string.belgor);
                    break;
                case "32":
                    regionText.setText(R.string.bryan);
                    break;
                case "33":
                    regionText.setText(R.string.vladim);
                    break;
                case "34":
                    regionText.setText(R.string.volgog);
                    break;
                case "134":
                    regionText.setText(R.string.volgog);
                    break;
                case "35":
                    regionText.setText(R.string.vologod);
                    break;
                case "36":
                    regionText.setText(R.string.voron);
                    break;
                case "136":
                    regionText.setText(R.string.voron);
                    break;
                case "37":
                    regionText.setText(R.string.ivan);
                    break;
                case "38":
                    regionText.setText(R.string.irkut);
                    break;
                case "85":
                    regionText.setText(R.string.irkut);
                    break;
                case "138":
                    regionText.setText(R.string.irkut);
                    break;
                case "39":
                    regionText.setText(R.string.kalin);
                    break;
                case "91":
                    regionText.setText(R.string.kalin);
                    break;
                case "40":
                    regionText.setText(R.string.kaluzh);
                    break;
                case "41":
                    regionText.setText(R.string.kamcha);
                    break;
                case "42":
                    regionText.setText(R.string.kemer);
                    break;
                case "142":
                    regionText.setText(R.string.kemer);
                    break;
                case "43":
                    regionText.setText(R.string.kirov);
                    break;
                case "44":
                    regionText.setText(R.string.kostrom);
                    break;
                case "45":
                    regionText.setText(R.string.kurgan);
                    break;
                case "46":
                    regionText.setText(R.string.kurs);
                    break;
                case "47":
                    regionText.setText(R.string.lenin);
                    break;
                case "147":
                    regionText.setText(R.string.lenin);
                    break;
                case "48":
                    regionText.setText(R.string.lipec);
                    break;
                case "49":
                    regionText.setText(R.string.magadan);
                    break;
                case "50":
                    regionText.setText(R.string.mos);
                    break;
                case "90":
                    regionText.setText(R.string.mos);
                    break;
                case "150":
                    regionText.setText(R.string.mos);
                    break;
                case "190":
                    regionText.setText(R.string.mos);
                    break;
                case "750":
                    regionText.setText(R.string.mos);
                    break;
                case "790":
                    regionText.setText(R.string.mos);
                    break;
                case "51":
                    regionText.setText(R.string.murman);
                    break;
                case "52":
                    regionText.setText(R.string.nizhe);
                    break;
                case "152":
                    regionText.setText(R.string.nizhe);
                    break;
                case "53":
                    regionText.setText(R.string.novgor);
                    break;
                case "54":
                    regionText.setText(R.string.novosib);
                    break;
                case "154":
                    regionText.setText(R.string.novosib);
                    break;
                case "55":
                    regionText.setText(R.string.omsk);
                    break;
                case "56":
                    regionText.setText(R.string.orenburg);
                    break;
                case "156":
                    regionText.setText(R.string.orenburg);
                    break;
                case "57":
                    regionText.setText(R.string.orl);
                    break;
                case "58":
                    regionText.setText(R.string.penz);
                    break;
                case "59":
                    regionText.setText(R.string.perm);
                    break;
                case "81":
                    regionText.setText(R.string.perm);
                    break;
                case "159":
                    regionText.setText(R.string.perm);
                    break;
                case "60":
                    regionText.setText(R.string.pskov);
                    break;
                case "61":
                    regionText.setText(R.string.rost);
                    break;
                case "161":
                    regionText.setText(R.string.rost);
                    break;
                case "761":
                    regionText.setText(R.string.rost);
                    break;
                case "62":
                    regionText.setText(R.string.ryaz);
                    break;
                case "63":
                    regionText.setText(R.string.samar);
                    break;
                case "163":
                    regionText.setText(R.string.samar);
                    break;
                case "763":
                    regionText.setText(R.string.samar);
                    break;
                case "64":
                    regionText.setText(R.string.sarat);
                    break;
                case "164":
                    regionText.setText(R.string.sarat);
                    break;
                case "65":
                    regionText.setText(R.string.sahal);
                    break;
                case "66":
                    regionText.setText(R.string.sverd);
                    break;
                case "96":
                    regionText.setText(R.string.sverd);
                    break;
                case "196":
                    regionText.setText(R.string.sverd);
                    break;
                case "67":
                    regionText.setText(R.string.smol);
                    break;
                case "68":
                    regionText.setText(R.string.tamb);
                    break;
                case "69":
                    regionText.setText(R.string.tvers);
                    break;
                case "169":
                    regionText.setText(R.string.tvers);
                    break;
                case "70":
                    regionText.setText(R.string.tomsk);
                    break;
                case "71":
                    regionText.setText(R.string.tul);
                    break;
                case "72":
                    regionText.setText(R.string.tym);
                    break;
                case "73":
                    regionText.setText(R.string.ulyan);
                    break;
                case "173":
                    regionText.setText(R.string.ulyan);
                    break;
                case "74":
                    regionText.setText(R.string.chel);
                    break;
                case "174":
                    regionText.setText(R.string.chel);
                    break;
                case "774":
                    regionText.setText(R.string.chel);
                    break;
                case "75":
                    regionText.setText(R.string.zabay);
                    break;
                case "80":
                    regionText.setText(R.string.zabay);
                    break;
                case "76":
                    regionText.setText(R.string.yaros);
                    break;
                case "77":
                    regionText.setText(R.string.moscow);
                    break;
                case "97":
                    regionText.setText(R.string.moscow);
                    break;
                case "99":
                    regionText.setText(R.string.moscow);
                    break;
                case "177":
                    regionText.setText(R.string.moscow);
                    break;
                case "199":
                    regionText.setText(R.string.moscow);
                    break;
                case "197":
                    regionText.setText(R.string.moscow);
                    break;
                case "777":
                    regionText.setText(R.string.moscow);
                    break;
                case "797":
                    regionText.setText(R.string.moscow);
                    break;
                case "799":
                    regionText.setText(R.string.moscow);
                    break;
                case "78":
                    regionText.setText(R.string.piter);
                    break;
                case "98":
                    regionText.setText(R.string.piter);
                    break;
                case "178":
                    regionText.setText(R.string.piter);
                    break;
                case "198":
                    regionText.setText(R.string.piter);
                    break;
                case "79":
                    regionText.setText(R.string.evreys);
                    break;
                case "82":
                    regionText.setText(R.string.krym);
                    break;
                case "83":
                    regionText.setText(R.string.nenec);
                    break;
                case "86":
                    regionText.setText(R.string.hant);
                    break;
                case "186":
                    regionText.setText(R.string.hant);
                    break;
                case "87":
                    regionText.setText(R.string.chyk);
                    break;
                case "89":
                    regionText.setText(R.string.yamal);
                    break;
                case "92":
                    regionText.setText(R.string.sevast);
                    break;
                case "94":
                    regionText.setText(R.string.baykonur);
                    break;
                case "20":
                    regionText.setText(R.string.chechen);
                    break;
                case "95":
                    regionText.setText(R.string.chechen);
                    break;
                default:
                    regionText.setText("Регион не найден");
            }
        }
        else {
            regionText.setText("Введите номер");
            }

    }
 */
}