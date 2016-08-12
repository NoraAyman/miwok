package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Nora on 10/08/2016.
 */

public class WordAdapter extends ArrayAdapter<word> {

    private int mColorResourceID;
    public WordAdapter(Activity context, ArrayList<word> words/*, int colorResourceID*/){
        super(context, 0, words);
       // mColorResourceID= colorResourceID;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView= convertView;
        if(listItemView == null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        word currentWord= getItem(position);
        TextView miwokTextView= (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defualtTextView= (TextView)listItemView.findViewById(R.id.default_text_view);
        defualtTextView.setText(currentWord.getDefaultTranslation());
        ImageView imageView= (ImageView)listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
                imageView.setVisibility(View.GONE);
        }
        //View textContainer= listItemView.findViewById(R.id.text_container);

        return listItemView;
    }

}
