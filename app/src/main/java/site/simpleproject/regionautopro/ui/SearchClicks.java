package site.simpleproject.regionautopro.ui;

import android.view.View;
import android.widget.TextView;

import site.simpleproject.regionautopro.R;

public class SearchClicks {
    public static void inputNum(View root, String fragment) {

        TextView numberText = root.findViewById(R.id.numberText);
        TextView regionText = root.findViewById(R.id.regionText);

        if (numberText.getText().length()>0) {
            switch (fragment) {
                case "civil":
                    switch (numberText.getText().toString()) {
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
                    break;
                case "police":
                    switch (numberText.getText().toString()) {
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
                    break;
                case "army":
                    switch (numberText.getText().toString()) {
                        case "09":
                            regionText.setText(R.string.fass);
                            break;
                        case "10":
                            regionText.setText(R.string.fsbrf);
                            break;
                        case "12":
                            regionText.setText(R.string.psfsbrf);
                            break;
                        case "14":
                            regionText.setText(R.string.zhv);
                            break;
                        case "15":
                            regionText.setText(R.string.fsvngrf);
                            break;
                        case "16":
                            regionText.setText(R.string.sssifsorf);
                            break;
                        case "17":
                            regionText.setText(R.string.csostorf);
                            break;
                        case "18":
                            regionText.setText(R.string.mrfgochs);
                            break;
                        case "20":
                            regionText.setText(R.string.fdsu);
                            break;
                        case "21":
                            regionText.setText(R.string.yvo);
                            break;
                        case "23":
                            regionText.setText(R.string.rvsn);
                            break;
                        case "25":
                            regionText.setText(R.string.vvo);
                            break;
                        case "26":
                            regionText.setText(R.string.tnzsvdvo);
                            break;
                        case "27":
                            regionText.setText(R.string.pvo);
                            break;
                        case "29":
                            regionText.setText(R.string.devcumorf);
                            break;
                        case "32":
                            regionText.setText(R.string.zabaykvo);
                            break;
                        case "34":
                            regionText.setText(R.string.vvs);
                            break;
                        case "35":
                            regionText.setText(R.string.morf);
                            break;
                        case "39":
                            regionText.setText(R.string.dvengumorf);
                            break;
                        case "43":
                            regionText.setText(R.string.zvo);
                            break;
                        case "45":
                            regionText.setText(R.string.vmf);
                            break;
                        case "50":
                            regionText.setText(R.string.vp);
                            break;
                        case "56":
                            regionText.setText(R.string.kv);
                            break;
                        case "65":
                            regionText.setText(R.string.cvo);
                            break;
                        case "67":
                            regionText.setText(R.string.vdv);
                            break;
                        case "76":
                            regionText.setText(R.string.cvo);
                            break;
                        case "77":
                            regionText.setText(R.string.abmr);
                            break;
                        case "81":
                            regionText.setText(R.string.gvsumorf);
                            break;
                        case "82":
                            regionText.setText(R.string.gusmorf);
                            break;
                        case "83":
                            regionText.setText(R.string.guspmorf);
                            break;
                        case "84":
                            regionText.setText(R.string.gkeumorf);
                            break;
                        case "87":
                            regionText.setText(R.string.sibvo);
                            break;
                        case "88":
                            regionText.setText(R.string.cvo);
                            break;
                        case "89":
                            regionText.setText(R.string.krymfo);
                            break;
                        case "90":
                            regionText.setText(R.string.chermf);
                            break;
                        case "91":
                            regionText.setText(R.string.bf);
                            break;
                        case "92":
                            regionText.setText(R.string.tzhkz);
                            break;
                        case "93":
                            regionText.setText(R.string.ogrv);
                            break;
                        case "94":
                            regionText.setText(R.string.grvz);
                            break;
                        case "99":
                            regionText.setText(R.string.vaivsrf);
                            break;
                        default:
                            regionText.setText("Формирование(военный округ) не найдено");
                    }
                    break;
                case "dip":
                    switch (numberText.getText().toString()) {
                        case "001":
                            regionText.setText(R.string.british);
                            break;
                        case "002":
                            regionText.setText(R.string.german);
                            break;
                        case "003":
                            regionText.setText(R.string.kanada);
                            break;
                        case "004":
                            regionText.setText(R.string.usa);
                            break;
                        case "005":
                            regionText.setText(R.string.japan);
                            break;
                        case "006":
                            regionText.setText(R.string.ispan);
                            break;
                        case "007":
                            regionText.setText(R.string.franc);
                            break;
                        case "008":
                            regionText.setText(R.string.belgium);
                            break;
                        case "009":
                            regionText.setText(R.string.grec);
                            break;
                        case "010":
                            regionText.setText(R.string.dania);
                            break;
                        case "011":
                            regionText.setText(R.string.italia);
                            break;
                        case "012":
                            regionText.setText(R.string.lyuksemburg);
                            break;
                        case "013":
                            regionText.setText(R.string.niderland);
                            break;
                        case "014":
                            regionText.setText(R.string.norveg);
                            break;
                        case "015":
                            regionText.setText(R.string.turc);
                            break;
                        case "016":
                            regionText.setText(R.string.avstral);
                            break;
                        case "017":
                            regionText.setText(R.string.austria);
                            break;
                        case "018":
                            regionText.setText(R.string.alzhir);
                            break;
                        case "019":
                            regionText.setText(R.string.egipet);
                            break;
                        case "020":
                            regionText.setText(R.string.ruanda);
                            break;
                        case "021":
                            regionText.setText(R.string.argent);
                            break;
                        case "022":
                            regionText.setText(R.string.afgan);
                            break;
                        case "023":
                            regionText.setText(R.string.myanma);
                            break;
                        case "024":
                            regionText.setText(R.string.bolivia);
                            break;
                        case "025":
                            regionText.setText(R.string.brazil);
                            break;
                        case "026":
                            regionText.setText(R.string.burundi);
                            break;
                        case "027":
                            regionText.setText(R.string.gana);
                            break;
                        case "028":
                            regionText.setText(R.string.bangladash);
                            break;
                        case "029":
                            regionText.setText(R.string.gvinea);
                            break;
                        case "030":
                            regionText.setText(R.string.zambia);
                            break;
                        case "031":
                            regionText.setText(R.string.peru);
                            break;
                        case "032":
                            regionText.setText(R.string.india);
                            break;
                        case "033":
                            regionText.setText(R.string.indonez);
                            break;
                        case "034":
                            regionText.setText(R.string.iordan);
                            break;
                        case "035":
                            regionText.setText(R.string.irak);
                            break;
                        case "036":
                            regionText.setText(R.string.iran);
                            break;
                        case "037":
                            regionText.setText(R.string.irland);
                            break;
                        case "038":
                            regionText.setText(R.string.island);
                            break;
                        case "039":
                            regionText.setText(R.string.kambodzh);
                            break;
                        case "040":
                            regionText.setText(R.string.kenia);
                            break;
                        case "041":
                            regionText.setText(R.string.kipr);
                            break;
                        case "042":
                            regionText.setText(R.string.kongo);
                            break;
                        case "043":
                            regionText.setText(R.string.kostarika);
                            break;
                        case "044":
                            regionText.setText(R.string.kuveyt);
                            break;
                        case "045":
                            regionText.setText(R.string.laos);
                            break;
                        case "047":
                            regionText.setText(R.string.livan);
                            break;
                        case "048":
                            regionText.setText(R.string.livia);
                            break;
                        case "049":
                            regionText.setText(R.string.mali);
                            break;
                        case "050":
                            regionText.setText(R.string.marokko);
                            break;
                        case "051":
                            regionText.setText(R.string.meksika);
                            break;
                        case "052":
                            regionText.setText(R.string.nepal);
                            break;
                        case "053":
                            regionText.setText(R.string.nigeria);
                            break;
                        case "054":
                            regionText.setText(R.string.venes);
                            break;
                        case "055":
                            regionText.setText(R.string.newzeland);
                            break;
                        case "056":
                            regionText.setText(R.string.pakistan);
                            break;
                        case "057":
                            regionText.setText(R.string.burkinafaso);
                            break;
                        case "058":
                            regionText.setText(R.string.senegal);
                            break;
                        case "060":
                            regionText.setText(R.string.somali);
                            break;
                        case "061":
                            regionText.setText(R.string.sudan);
                            break;
                        case "062":
                            regionText.setText(R.string.serraleone);
                            break;
                        case "063":
                            regionText.setText(R.string.tailand);
                            break;
                        case "064":
                            regionText.setText(R.string.tanzania);
                            break;
                        case "065":
                            regionText.setText(R.string.tunis);
                            break;
                        case "066":
                            regionText.setText(R.string.uganda);
                            break;
                        case "067":
                            regionText.setText(R.string.urugvai);
                            break;
                        case "068":
                            regionText.setText(R.string.filip);
                            break;
                        case "069":
                            regionText.setText(R.string.finland);
                            break;
                        case "070":
                            regionText.setText(R.string.shrilanka);
                            break;
                        case "071":
                            regionText.setText(R.string.chad);
                            break;
                        case "072":
                            regionText.setText(R.string.shveicar);
                            break;
                        case "073":
                            regionText.setText(R.string.shvecia);
                            break;
                        case "074":
                            regionText.setText(R.string.ekvador);
                            break;
                        case "075":
                            regionText.setText(R.string.efiopia);
                            break;
                        case "076":
                            regionText.setText(R.string.angola);
                            break;
                        case "077":
                            regionText.setText(R.string.demokratrepublickongo);
                            break;
                        case "078":
                            regionText.setText(R.string.kolumbia);
                            break;
                        case "079":
                            regionText.setText(R.string.kamerun);
                            break;
                        case "080":
                            regionText.setText(R.string.gvineabisua);
                            break;
                        case "081":
                            regionText.setText(R.string.portugal);
                            break;
                        case "082":
                            regionText.setText(R.string.bolgaria);
                            break;
                        case "083":
                            regionText.setText(R.string.vengria);
                            break;
                        case "086":
                            regionText.setText(R.string.polsha);
                            break;
                        case "087":
                            regionText.setText(R.string.kndr);
                            break;
                        case "088":
                            regionText.setText(R.string.kuba);
                            break;
                        case "089":
                            regionText.setText(R.string.mongolia);
                            break;
                        case "090":
                            regionText.setText(R.string.kitay);
                            break;
                        case "091":
                            regionText.setText(R.string.rumyn);
                            break;
                        case "093":
                            regionText.setText(R.string.serbia);
                            break;
                        case "094":
                            regionText.setText(R.string.benin);
                            break;
                        case "095":
                            regionText.setText(R.string.gabon);
                            break;
                        case "097":
                            regionText.setText(R.string.mavritania);
                            break;
                        case "098":
                            regionText.setText(R.string.madagas);
                            break;
                        case "099":
                            regionText.setText(R.string.malayzia);
                            break;
                        case "101":
                            regionText.setText(R.string.singapur);
                            break;
                        case "103":
                            regionText.setText(R.string.centrafrepubl);
                            break;
                        case "105":
                            regionText.setText(R.string.yemen);
                            break;
                        case "107":
                            regionText.setText(R.string.palestina);
                            break;
                        case "108":
                            regionText.setText(R.string.nikaragua);
                            break;
                        case "109":
                            regionText.setText(R.string.mozambik);
                            break;
                        case "110":
                            regionText.setText(R.string.ekvatorgvinea);
                            break;
                        case "111":
                            regionText.setText(R.string.maltorden);
                            break;
                        case "112":
                            regionText.setText(R.string.malta);
                            break;
                        case "115":
                            regionText.setText(R.string.zimbabve);
                            break;
                        case "116":
                            regionText.setText(R.string.oae);
                            break;
                        case "117":
                            regionText.setText(R.string.kotdivuar);
                            break;
                        case "118":
                            regionText.setText(R.string.namibia);
                            break;
                        case "120":
                            regionText.setText(R.string.oman);
                            break;
                        case "121":
                            regionText.setText(R.string.katar);
                            break;
                        case "124":
                            regionText.setText(R.string.korea);
                            break;
                        case "125":
                            regionText.setText(R.string.chili);
                            break;
                        case "126":
                            regionText.setText(R.string.panama);
                            break;
                        case "127":
                            regionText.setText(R.string.izrail);
                            break;
                        case "128":
                            regionText.setText(R.string.severmakedon);
                            break;
                        case "129":
                            regionText.setText(R.string.alban);
                            break;
                        case "131":
                            regionText.setText(R.string.vatikan);
                            break;
                        case "132":
                            regionText.setText(R.string.litva);
                            break;
                        case "133":
                            regionText.setText(R.string.siria);
                            break;
                        case "134":
                            regionText.setText(R.string.estonia);
                            break;
                        case "135":
                            regionText.setText(R.string.latvia);
                            break;
                        case "136":
                            regionText.setText(R.string.bahreyn);
                            break;
                        case "137":
                            regionText.setText(R.string.yuar);
                            break;
                        case "138":
                            regionText.setText(R.string.armen);
                            break;
                        case "140":
                            regionText.setText(R.string.saudarav);
                            break;
                        case "141":
                            regionText.setText(R.string.sloven);
                            break;
                        case "142":
                            regionText.setText(R.string.uzbekist);
                            break;
                        case "143":
                            regionText.setText(R.string.kirgis);
                            break;
                        case "144":
                            regionText.setText(R.string.horvat);
                            break;
                        case "145":
                            regionText.setText(R.string.azerbay);
                            break;
                        case "146":
                            regionText.setText(R.string.ukrain);
                            break;
                        case "147":
                            regionText.setText(R.string.moldavi);
                            break;
                        case "148":
                            regionText.setText(R.string.chehia);
                            break;
                        case "149":
                            regionText.setText(R.string.slovak);
                            break;
                        case "150":
                            regionText.setText(R.string.belorus);
                            break;
                        case "151":
                            regionText.setText(R.string.tadzhikis);
                            break;
                        case "152":
                            regionText.setText(R.string.turkmen);
                            break;
                        case "153":
                            regionText.setText(R.string.kazakhstan);
                            break;
                        case "154":
                            regionText.setText(R.string.gvatemala);
                            break;
                        case "155":
                            regionText.setText(R.string.bosnia);
                            break;
                        case "156":
                            regionText.setText(R.string.eritrea);
                            break;
                        case "157":
                            regionText.setText(R.string.paragvay);
                            break;
                        case "158":
                            regionText.setText(R.string.gruzia);
                            break;
                        case "159":
                            regionText.setText(R.string.bruney);
                            break;
                        case "160":
                            regionText.setText(R.string.gambia);
                            break;
                        case "161":
                            regionText.setText(R.string.vyetnam);
                            break;
                        case "162":
                            regionText.setText(R.string.mavrikiy);
                            break;
                        case "163":
                            regionText.setText(R.string.dominik);
                            break;
                        case "164":
                            regionText.setText(R.string.chernogor);
                            break;
                        case "165":
                            regionText.setText(R.string.yuzhoset);
                            break;
                        case "166":
                            regionText.setText(R.string.abhaz);
                            break;
                        case "167":
                            regionText.setText(R.string.dzhibuti);
                            break;
                        case "168":
                            regionText.setText(R.string.yuzhsudan);
                            break;
                        case "169":
                            regionText.setText(R.string.salvador);
                            break;
                        case "170":
                            regionText.setText(R.string.grenada);
                            break;
                        case "499":
                            regionText.setText(R.string.pes);
                            break;
                        case "500":
                            regionText.setText(R.string.ebrr);
                            break;
                        case "503":
                            regionText.setText(R.string.lag);
                            break;
                        case "504":
                            regionText.setText(R.string.mbrr);
                            break;
                        case "505":
                            regionText.setText(R.string.mvf);
                            break;
                        case "506":
                            regionText.setText(R.string.mopm);
                            break;
                        case "507":
                            regionText.setText(R.string.mfokkkp);
                            break;
                        case "508":
                            regionText.setText(R.string.mkkk);
                            break;
                        case "509":
                            regionText.setText(R.string.mfk);
                            break;
                        case "510":
                            regionText.setText(R.string.oonpr);
                            break;
                        case "511":
                            regionText.setText(R.string.oon);
                            break;
                        case "512":
                            regionText.setText(R.string.yunesko);
                            break;
                        case "514":
                            regionText.setText(R.string.mbes);
                            break;
                        case "515":
                            regionText.setText(R.string.mib);
                            break;
                        case "516":
                            regionText.setText(R.string.moksi);
                            break;
                        case "517":
                            regionText.setText(R.string.mcnti);
                            break;
                        case "520":
                            regionText.setText(R.string.mot);
                            break;
                        case "522":
                            regionText.setText(R.string.kcmk);
                            break;
                        case "523":
                            regionText.setText(R.string.iksng);
                            break;
                        case "524":
                            regionText.setText(R.string.eka);
                            break;
                        case "525":
                            regionText.setText(R.string.epo);
                            break;
                        case "528":
                            regionText.setText(R.string.mb);
                            break;
                        case "530":
                            regionText.setText(R.string.mniipu);
                            break;
                        case "531":
                            regionText.setText(R.string.odkb);
                            break;
                        case "532":
                            regionText.setText(R.string.msksng);
                            break;
                        case "533":
                            regionText.setText(R.string.ssmag);
                            break;
                        case "534":
                            regionText.setText(R.string.ebr);
                            break;
                        case "535":
                            regionText.setText(R.string.mfgsgusng);
                            break;
                        case "555":
                            regionText.setText(R.string.eek);
                            break;
                        case "556":
                            regionText.setText(R.string.pose);
                            break;
                        case "557":
                            regionText.setText(R.string.acgusng);
                            break;
                        case "558":
                            regionText.setText(R.string.egplpdft);
                            break;
                        case "559":
                            regionText.setText(R.string.oiyai);
                            break;
                        case "560":
                            regionText.setText(R.string.zomsesng);
                            break;
                        case "561":
                            regionText.setText(R.string.mcie);
                            break;
                        case "562":
                            regionText.setText(R.string.pvois);
                            break;
                        case "900":
                            regionText.setText(R.string.ku);
                            break;
                        default:
                            regionText.setText("Представительство не найдено");
                    }
                    break;
            }
        }
        else {
            regionText.setText("Введите номер");
        }

    }
}
