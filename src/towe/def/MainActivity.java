package towe.def;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        // ���� �����, ����� ���������� ��������� ����� ���������� ����������
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

	        // ���� �����, ����� ���������� ���� �������������
	        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

	        // � ��� ���������
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        
	        setContentView(new GameView(this));
	    }
	
    
    @Override
    public void startActivity(Intent intent) {
    	// TODO Auto-generated method stub
    	super.startActivity(intent);
    }
   
    	}

    