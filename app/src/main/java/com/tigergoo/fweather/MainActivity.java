package com.tigergoo.fweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @class :
 * @describe:
 * @author:Ryan
 * @created:2019/3/16 21:21
 */
public class MainActivity extends AppCompatActivity {
    @Override
    /**
     * @author :Ryan
     * @created :
     * @Description :TODO
     * @Param : [savedInstanceState]
     * @Result : void
     * @Exception 
     * @Version : 1.0
     */
    protected void onCreate(Bundle savedInstanceState) {
        //SQLiteDatabase db = LitePal.getDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
