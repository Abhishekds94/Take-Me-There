package com.abhishek.avidprogrammers.takemethere.Utils;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.abhishek.avidprogrammers.takemethere.DB.RestaurantDatabase;

public class RestaurantViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private RestaurantDatabase restaurantDatabase;
    private String id;

    public RestaurantViewModelFactory(RestaurantDatabase restaurantDatabase, String id) {
        this.restaurantDatabase = restaurantDatabase;
        this.id = id;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new RestaurantViewModel(restaurantDatabase, id);
    }
}