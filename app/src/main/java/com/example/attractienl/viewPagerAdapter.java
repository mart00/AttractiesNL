package com.example.attractienl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class viewPagerAdapter extends PagerAdapter{

        private LayoutInflater layoutInflater;
        public Database thedb;
        Context context;

        public viewPagerAdapter(Context context) {
            this.context = context;
            Database thedb = new Database(context);
        }

        private Integer[] images = {
                R.drawable.efteling,
                R.drawable.slagharen,
                R.drawable.drunenseduinen,
                R.drawable.drievliet,
                R.drawable.duinrell,
                R.drawable.julianatoren,
                R.drawable.dolfinarium,
                R.drawable.walibi,
                R.drawable.beeksebergen,
                R.drawable.plopsaland

        };
    public Integer[] getImages() {
        return images;
    }

     String[] namen = {
            "De Efteling",
            "Slagharen",
            "Drunense Duinen",
            "Drievliet",
            "Duinrell",
            "Julianatoren",
            "Dolfinarium",
            "Walibi",
            "Beeksebergen",
            "Plopsaland"

    };

    public String[] getNamen() {
        return namen;
    }

    String[] plaats = {
            "Kaatsheuvel",
            "Slagharen",
            "Drunen",
            "Den Haag",
            "Wassenaar",
            "Apeldoorn",
            "Harderwijk",
            "Biddinghuizen",
            "Hilvarenbeek",
            "De Panne"

    };

    public String[] getPlaats() {
        return plaats;
    }

    @Override
        public int getCount() {
            if (namen == null) return 0;
            return images.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int postition) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(R.layout.image_view, null);

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(images[postition]);

            TextView naam = view.findViewById(R.id.naamItem);
            naam.setText(namen[postition]);

            TextView pla = view.findViewById(R.id.plaats);
            pla.setText(plaats[postition]);

            container.addView(view);

            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

            container.removeView((RelativeLayout) object);
        }

}

