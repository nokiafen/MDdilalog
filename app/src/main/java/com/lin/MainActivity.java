package com.lin;

import android.app.Dialog;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.lin.dialog.ShortDialog;
import com.lin.dialog.ShortDialog.OnNegativeListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(30,0,30,0);
         final Dialog   mDialog = new ShortDialog.Builder(this).setTitle("删除商家").setContentView(R.layout.view_dialog,layoutParams).setPositiveButton("A", R.color.colorPrimary,new ShortDialog.OnPositiveListener() {
                @Override
                public void onPositive(Dialog dialog) {
                    Toast.makeText(MainActivity.this,"heheh",Toast.LENGTH_LONG).show();
                }
            }).setNegativeButton("B",R.color.colorAccent, new OnNegativeListener() {
             @Override
             public void onNegative(Dialog dialog) {
                 Toast.makeText(MainActivity.this,"jjkksk",Toast.LENGTH_LONG).show();
             }
         }).create();

        mDialog.show();

    }


}
