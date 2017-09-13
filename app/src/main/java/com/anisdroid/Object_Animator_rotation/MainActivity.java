package com.anisdroid.Object_Animator_rotation;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.animation.*;

public class MainActivity extends Activity 
{
	ImageView iii;
	Button st_bt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		iii = (ImageView) findViewById(R.id.img);

		st_bt = (Button) findViewById(R.id.start_button);
		
		st_bt.setOnClickListener(
		
			new View.OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					
					ObjectAnimator anim = ObjectAnimator.ofFloat(iii,View.ROTATION_Y,0,360);
					anim.setRepeatCount(5);
					anim.setRepeatMode(ValueAnimator.REVERSE);
					anim.setDuration(4000);
					anim.start();
					
				}
				
				
			}
		
		);
		
    }
}
