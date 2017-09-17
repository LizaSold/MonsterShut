package towe.def;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {
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
       
        	 setContentView(R.layout.activity_splash);

        	 ImageView logo = (ImageView) findViewById(R.id.imageLogo);

        	 Animation starAnim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        	 logo.startAnimation(starAnim);

        	 starAnim.setAnimationListener(new AnimationListener() {

        	 public void onAnimationStart(Animation animation) {
        	 // TODO Auto-generated method stub

        	 }

        	 public void onAnimationRepeat(Animation animation) {
        	 // TODO Auto-generated method stub

        	 }

        	 public void onAnimationEnd(Animation animation) {
        	 // TODO Auto-generated method stub
        	 startActivity(new Intent(SplashActivity.this,
        	Menu.class));
        	/* ����� �� ������� �� ������ ������ ������ ���� ����� ������� �� ����� �
        	��������� ����������, ������� ����� finish()*/
        	 SplashActivity.this.finish();
        	 }
        	 });
    }
}