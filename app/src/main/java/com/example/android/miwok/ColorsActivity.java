/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<word> words= new ArrayList<word>();
        words.add(new word("Red", "Wetetti", R.drawable.color_red));
        words.add(new word("Green", "Chokokki", R.drawable.color_green));
        words.add(new word("Brown", "Takaakki", R.drawable.color_brown));
        words.add(new word("Gray", "Topoppi", R.drawable.color_gray));
        words.add(new word("Black", "Kululli", R.drawable.color_black));
        words.add(new word("White", "Kelelli", R.drawable.color_white));
        words.add(new word("Dusty yellow", "Topiisә", R.drawable.color_dusty_yellow));
        words.add(new word("Mustard yellow", "Chiwiiṭә", R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
