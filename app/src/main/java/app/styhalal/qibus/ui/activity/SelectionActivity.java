package app.styhalal.qibus.ui.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import app.styhalal.qibus.BaseActivity;
import app.styhalal.qibus.R;

public class SelectionActivity extends BaseActivity implements View.OnClickListener {
    /*variable declaration*/
    private Button mBtnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_selection);
        initLayouts();
        initializeListeners();
    }

    /* init layout */
    private void initLayouts() {
        mBtnContinue = findViewById(R.id.btnContinue);

    }

    /* initialize listener */

    @SuppressLint("ClickableViewAccessibility")
    private void initializeListeners() {
        mBtnContinue.setOnClickListener(this);
        mBtnContinue.setStateListAnimator(null);

    }


    /* onClick listener */
    @Override
    public void onClick(View v) {
        if (v == mBtnContinue) {
            startActivity(SignInActivity.class);
            finish();
        }

    }
}
