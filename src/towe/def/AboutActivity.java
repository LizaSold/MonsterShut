 	package towe.def;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class AboutActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	 // ���� �����, ����� ���������� ��������� ����� ���������� ����������
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // ���� �����, ����� ���������� ���� �������������
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // � ��� ���������
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    	setContentView(R.layout.activity_about);
    }
}