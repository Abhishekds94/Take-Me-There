package com.abhishek.avidprogrammers.takemethere.Utils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.abhishek.avidprogrammers.takemethere.DB.RestaurantDatabase;
import com.abhishek.avidprogrammers.takemethere.Objects.Restaurant_;

public class RestaurantViewModel extends ViewModel {

    private LiveData<Restaurant_> restaurantLiveData;

    public LiveData<Restaurant_> getRestaurantLiveData() {
        return restaurantLiveData;
    }

    public RestaurantViewModel(RestaurantDatabase restaurantDatabase, String id) {
        restaurantLiveData = restaurantDatabase.restaurantDao().loadSingleRestaurant(id);
    }
}