package com.zhisimina.schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * @description  
 * @author  fupengpeng
 * @date  2018/3/22 0022 17:27
 */
public class PlanetFragment extends Fragment {

    public static final String ARG_PLANET_NUMBER = "planet_number";


    private int[] mResourceIds = {
            R.drawable.xian,R.drawable.xian,R.drawable.xian,R.drawable.xian
    };

    public PlanetFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        int i = getArguments().getInt(ARG_PLANET_NUMBER);
        if (i == -1) {
            view = inflater.inflate(R.layout.fragment_default, container, false);
            return view;
        }
        view = inflater.inflate(R.layout.fragment_planet, container, false);
        int imageId = mResourceIds[i];
        ((ImageView) view.findViewById(R.id.image)).setImageResource(imageId);
        return view;
    }
}
