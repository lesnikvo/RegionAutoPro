package site.simpleproject.regionautopro.ui.basic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import site.simpleproject.regionautopro.R;

public class BasicFragment extends Fragment implements View.OnClickListener {

    private BasicViewModel mViewModel;

    public static BasicFragment newInstance() {
        return new BasicFragment();
    }

    View basic;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        basic = inflater.inflate(R.layout.fragment_basic, container, false);

        Button button_Civil = basic.findViewById(R.id.button_civil);
        Button button_Police = basic.findViewById(R.id.button_police);
        Button button_Army = basic.findViewById(R.id.button_army);
        Button button_Dip = basic.findViewById(R.id.button_dip);

        button_Civil.setOnClickListener(this);
        button_Police.setOnClickListener(this);
        button_Army.setOnClickListener(this);
        button_Dip.setOnClickListener(this);

        return basic;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BasicViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_civil:
                requireActivity().findViewById(R.id.nav_civil).callOnClick();
                break;
            case R.id.button_police:
                requireActivity().findViewById(R.id.nav_police).callOnClick();
                break;
            case R.id.button_army:
                requireActivity().findViewById(R.id.nav_army).callOnClick();
                break;
            case R.id.button_dip:
                requireActivity().findViewById(R.id.nav_dip).callOnClick();
                break;
        }
    }

}