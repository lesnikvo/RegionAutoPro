package site.simpleproject.regionautopro.ui.civil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CivilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CivilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}