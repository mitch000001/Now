package org.mitchwork.android.Now;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.view.View;
import android.widget.CompoundButton;

public class FieldDemo extends Activity implements CompoundButton.OnCheckedChangeListener {
	Button btn;
	CheckBox cb;
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		setContentView(R.layout.editfield);
		EditText fld=(EditText)findViewById(R.id.edfield);
		fld.setText("Licensed under the Apache License, version 2.0" +
				"(the \"License\"); you may not use this file " +
				"except in compliance with the License. You may " +
				"obtain a copy of the License at " +
				"http://www.apache.org/license/LICENSE-2.0");
		cb=(CheckBox)findViewById(R.id.checklicense);
		cb.setOnCheckedChangeListener(this);
		btn=(Button)findViewById(R.id.proceed);
		btn.setText("Proceed");
	}
	
	public void proceedClick(View view) {
		startActivity(new Intent("org.mitchwork.android.FIELD"));
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			cb.setText("You accepted the license.");
		}
		else {
			cb.setText("Please check the box to accept the license.");
		}
		
	}
	
}
