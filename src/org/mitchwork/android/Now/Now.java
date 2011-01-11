package org.mitchwork.android.Now;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class Now extends Activity {
	Button btn;
	
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        
        btn=new Button(this);
        updateTime();
        setContentView(btn);
    }

	private void updateTime() {
		btn.setText(new Date().toString());
	}

	public void buttonClick(View view) {
		startActivity(new Intent("org.mitchwork.android.FIELD"));
	}
}