package com.example.viewmodel;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainViewModel extends ViewModel {


    private String[] allWordsList = new String[] {"animal", "auto", "anecdote", "alphabet", "all", "awesome", "arise", "balloon", "basket", "bench", "best", "birthday", "book", "briefcase", "camera", "camping", "candle", "cat", "cauliflower", "chat", "children", "class", "classic", "classroom", "coffee", "colorful", "cookie", "creative", "cruise", "dance", "daytime", "dinosaur", "doorknob", "dine", "dream", "dusk", "eating", "elephant", "emerald", "eerie", "electric", "finish", "flowers", "follow", "fox", "frame", "free", "frequent", "funnel", "green", "guitar", "grocery", "glass", "great", "giggle", "haircut", "half", "homemade", "happen", "honey", "hurry", "hundred", "ice", "igloo", "invest", "invite", "icon", "introduce", "joke", "jovial", "journal", "jump", "join", "kangaroo", "keyboard", "kitchen", "koala", "kind", "kaleidoscope", "landscape", "late", "laugh", "learning", "lemon", "letter", "lily", "magazine", "marine", "marshmallow", "maze", "meditate", "melody", "minute", "monument", "moon", "motorcycle", "mountain", "music", "north", "nose", "night", "name", "never", "negotiate", "number", "opposite", "octopus", "oak", "order", "open", "polar", "pack", "painting", "person", "picnic", "pillow", "pizza", "podcast", "presentation", "puppy", "puzzle", "recipe", "release", "restaurant", "revolve", "rewind", "room", "run", "secret", "seed", "ship", "shirt", "should", "small", "spaceship", "stargazing", "skill", "street", "style", "sunrise", "taxi", "tidy", "timer", "together", "tooth", "tourist", "travel", "truck", "under", "useful", "unicorn", "unique", "uplift", "uniform", "vase", "violin", "visitor", "vision", "volume", "view", "walrus", "wander", "world", "winter", "well", "whirlwind", "x-ray", "xylophone", "yoga", "yogurt", "yoyo", "you", "year", "yummy", "zebra", "zigzag", "zoology", "zone", "zeal"};
    String shuffledWord = "";
    int randomIteration = (int) (Math.random()*(178));
    String Original=allWordsList[randomIteration];
    public MutableLiveData<String> Str= new MutableLiveData<>();
    public void fun(String str){
        Log.i("Done","hii");
    }
    public void shuffle(){

        ArrayList<Character> Shuffle = new ArrayList<Character>();
        for (int i=0;i<Original.length();i++){
            Shuffle.add(Original.charAt(i));
        }
        Collections.shuffle(Shuffle);
        Iterator<Character> iter = Shuffle.iterator();
        Log.i("shuffled",String.valueOf(Shuffle));
        while(iter.hasNext()){
            shuffledWord+=iter.next();
        }
        Str.setValue(shuffledWord);
        return;
    }
    public void check(Context context, String val){
        Log.i(shuffledWord,val);
        if(val.equals(Original)){
            Log.i("done","Success");

            Toast.makeText(context, "Correct Guess", Toast.LENGTH_LONG).show();

            shuffledWord="";
            randomIteration = (int) (Math.random()*(178));
            Original=allWordsList[randomIteration];
            shuffle();
        }
    }



}