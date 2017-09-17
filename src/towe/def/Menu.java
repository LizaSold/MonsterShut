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
		 
		 // если хотим, чтобы приложение постоянно имело портретную ориентацию
	     setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	
	     // если хотим, чтобы приложение было полноэкранным
	     getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
	     // и без заголовка
	     requestWindowFeature(Window.FEATURE_NO_TITLE);
	    
		 // Назначение разметки из файла /res/layout/main
		 setContentView(R.layout.main);
		 // Получение кнопки начала игры по идентификатору
		 startButton = (Button) findViewById(R.id.startButton);
		 // Добавление обработчика кнопки начала игры
		// Создание анонимного класса
		 startButton.setOnClickListener(new View.OnClickListener() {
		 @Override
		 public void onClick(View v) {
			// TODO Auto-generated method stub
	    	 startActivity(new Intent(Menu.this, MainActivity.class));
		 }
		 });
		 // Получение кнопки окончания игры
		 exitButton = (Button) findViewById(R.id.exitButton);
		 // Добавление обработчика кнопки окончания игры
		 exitButton.setOnClickListener(new View.OnClickListener()
		{
		 @Override
		 public void onClick(View v) {
		 // Завершить активности, завершение приложения
		finish();
		 }
		 });
		 }
		 
		}


