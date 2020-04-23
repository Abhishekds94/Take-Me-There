<p align="center">
	<img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/app/src/main/res/drawable/logo_s.png" width="220">
</p>
# Take Me There!

Take Me There is an Android application that displays all the nearby restaurants using Zomato API from the User's current location.

This application was developed as a part of [Udacity's Android Nanodegree course](https://www.udacity.com/course/android-developer-nanodegree-by-google--nd801).


## Installation

Clone this repository using,

```
git clone https://github.com/Abhishekds94/Take-Me-There.git
```

## Usage
API keys required,

1. Create an API key for your project on [Zomato](https://developers.zomato.com/api) API console
2. Get an API from Google places console. Follow [this link ](https://developers.google.com/places/web-service/get-api-key) to see how to get your own API key
3. Get a Google AdMob API key. Follow [this link](https://developers.google.com/admob/android/quick-start) to see how to get your own 
4. Now, create a file name ```gradle.properties``` in your project folder and assign the API key values as shown below,
```
API_KEY="<API_KEY_VALUE>"
GOOGLE_API_KEY=<API_KEY_VALUE>
ADMOB_KEY="ca-app-pub-<API_KEY_VALUE>"
``` 
Replace ```<API_KEY_VALUE>``` with the actual ```API_Key``` value.


## Features

1. Helps the user to decide which is the best restaurant to visit by providing a curated list of all nearby restaurants
2. It contains details such as cost for two, user votes and ratings, images, directions
3. Users can also know more about the place that would take them to Zomato's landing page on click to know more about the place
4. Under Settings, Users can set preferences such as distance, Cuisine Preference, Search Radius, and so on.

## Building

You can build the app with Android Studio or with `./gradlew assembleDebug` command.

## Screenshots

<div>
  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img1.jpg" width="220">

  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img2.jpg" width="220">

  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img3.jpg" width="220">
</div>

<div>
  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img4.jpg" width="220">

  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img5.jpg" width="220">

  <img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/img6.jpg" width="220">
</div>

## App Working Video

<a href="http://www.youtube.com/watch?feature=player_embedded&v=YOUTUBE_VIDEO_ID_HERE
" target="_blank"><img src="https://github.com/Abhishekds94/Take-Me-There/blob/master/Screenshots/video.jpg" 
alt="Video Working" width="220" /></a>

## Future Scope
Below are a few of the ideas that I could think of to enhance the application,
* Adding different categories such as Hospitals, Shopping Malls, and so on
* Custom and User interaction based results

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.