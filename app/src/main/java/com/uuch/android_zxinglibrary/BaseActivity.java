package com.uuch.android_zxinglibrary;

import android.os.Bundle;

import spa.lyh.cn.peractivity.PermissionActivity;

public class BaseActivity extends PermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

}
