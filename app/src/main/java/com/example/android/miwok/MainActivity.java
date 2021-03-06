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

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}

//OLD CODE

//// Find the View that shows the numbers category
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//
//        if (numbers != null) {
//// Set a click listener on that View
//            numbers.setOnClickListener(new View.OnClickListener() {
//                // The code in this method will be executed when the numbers View is clicked on.
//                @Override
//                public void onClick(View view) {
//                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//                    startActivity(numbersIntent);
//                }
//            });
//        }
//
//        TextView family = (TextView) findViewById(R.id.family);
//
//        if (family != null) {
//            family.setOnClickListener(new View.OnClickListener() {
//                // The code in this method will be executed when the numbers View is clicked on.
//                @Override
//                public void onClick(View view) {
//                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//                    startActivity(familyIntent);
//                }
//            });
//        }
//
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        if (colors != null) {
//            colors.setOnClickListener(new View.OnClickListener() {
//                // The code in this method will be executed when the numbers View is clicked on.
//                @Override
//                public void onClick(View view) {
//                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                    startActivity(colorsIntent);
//                }
//            });
//        }
//
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//        if (phrases != null) {
//            phrases.setOnClickListener(new View.OnClickListener() {
//                // The code in this method will be executed when the numbers View is clicked on.
//                @Override
//                public void onClick(View view) {
//                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//                    startActivity(phrasesIntent);
//                }
//            });
//        }