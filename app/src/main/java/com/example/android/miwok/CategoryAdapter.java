package com.example.android.miwok;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by Eric on 12/30/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter{

    final int PAGE_COUNT = 4;
    private Context mContext;

//    private String tabTitles[] = new String[] { context.getString(R.string.category_numbers),"2","3","4"};

//
//    private String tabTitles[] = new String[] { context.getString(R.string.category_numbers), context.getString(R.string.category_family)
//            , context.getString(R.string.category_colors) , context.getString(R.string.category_phrases)};


    public CategoryAdapter(Context context , FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1){
            return mContext.getString(R.string.category_family);
        } else if (position == 2){
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
//
//        // Generate title based on item position
//        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
