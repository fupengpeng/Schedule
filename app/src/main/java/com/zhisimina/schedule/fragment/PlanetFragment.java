package com.zhisimina.schedule.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhisimina.schedule.R;

/**
 * @author fupengpeng
 * @description
 * @date 2018/3/22 0022 17:27
 */
public class PlanetFragment extends Fragment {

    public static final String ARG_PLANET_NUMBER = "planet_number";

    private View view;

    public PlanetFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_default, container, false);
        return view;
    }
}
