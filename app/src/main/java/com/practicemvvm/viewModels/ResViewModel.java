package com.practicemvvm.viewModels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.practicemvvm.api.ApiInterface;
import com.practicemvvm.api.RetroInstance;
import com.practicemvvm.models.ModelClass;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResViewModel extends ViewModel
{
    private MutableLiveData<ArrayList<ModelClass>>mutableList;

    public ResViewModel() {
        this.mutableList = new MutableLiveData<>();
    }
    public MutableLiveData<ArrayList<ModelClass>> getMutableListObserver(){
        return mutableList;
    }

    public void makeApiCall(){
        ApiInterface apiInterface= RetroInstance.getRetrofitClient().create(ApiInterface.class);
        Call<ArrayList<ModelClass>> call=apiInterface.getData();
        call.enqueue(new Callback<ArrayList<ModelClass>>() {
            @Override
            public void onResponse(Call<ArrayList<ModelClass>> call, Response<ArrayList<ModelClass>> response) {
                mutableList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<ModelClass>> call, Throwable t) {
                mutableList.postValue(null);
            }
        });
    }

}
