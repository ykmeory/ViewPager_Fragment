package com.maxi.updatatest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maxi.updatatest.R;

public class OneFragment extends Fragment{
	private View carView;

	@Override
	public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		carView = inflater.inflate(R.layout.fragment_one, container, false);
		return carView;
	}
	
}