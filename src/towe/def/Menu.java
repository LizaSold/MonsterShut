	package towe.def;
	
	import android.app.Activity;
	import android.content.Intent;
	import android.content.pm.ActivityInfo;
	import android.os.Bundle;
	import android.view.View;
	import android.view.Window;
	import android.view.WindowManager;
	import android.widget.Button;
	public class Menu extends Activity {
		private View startButton;
		 private View exitButton;
		 @Override
		 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 
		 // ���� �����, ����� ���������� ��������� ����� ���������� ����������
	     setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	
	     // ���� �����, ����� ���������� ���� �������������
	     getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
	     // � ��� ���������
	     requestWindowFeature(Window.FEATURE_NO_TITLE);
	    
		 // ���������� �������� �� ����� /res/layout/main
		 setContentView(R.layout.main);
		 // ��������� ������ ������ ���� �� ��������������
		 startButton = (Button) findViewById(R.id.startButton);
		 // ���������� ����������� ������ ������ ����
		// �������� ���������� ������
		 startButton.setOnClickListener(new View.OnClickListener() {
		 @Override
		 public void onClick(View v) {
			// TODO Auto-generated method stub
	    	 startActivity(new Intent(Menu.this, MainActivity.class));
		 }
		 });
		 // ��������� ������ ��������� ����
		 exitButton = (Button) findViewById(R.id.exitButton);
		 // ���������� ����������� ������ ��������� ����
		 exitButton.setOnClickListener(new View.OnClickListener()
		{
		 @Override
		 public void onClick(View v) {
		 // ��������� ����������, ���������� ����������
		finish();
		 }
		 });
		 }
		 
		}


