package com.wekooks.shareninja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.*;
import com.tencent.connect.share.QQShare;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	public void OnClickShare(View v) {
	    final Bundle params = new Bundle();
        Tencent mTencent = Tencent.createInstance("1106405049", this);
	    params.putInt(QQShare.SHARE_TO_QQ_KEY_TYPE, QQShare.SHARE_TO_QQ_TYPE_DEFAULT);
	    params.putString(QQShare.SHARE_TO_QQ_TITLE, "饿了么拼手气，第6个领取红包的人得大红包");
	    params.putString(QQShare.SHARE_TO_QQ_SUMMARY,  "手速很重要，手气更重要");
	    params.putString(QQShare.SHARE_TO_QQ_TARGET_URL,  "http://www.wekooks.com/hacking.php");
	    params.putString(QQShare.SHARE_TO_QQ_IMAGE_URL,"http://wekooks.com/img/sagiri2.jpg");
	    params.putString(QQShare.SHARE_TO_QQ_APP_NAME,  "测试应用222222");
	    //params.putInt(QQShare.SHARE_TO_QQ_EXT_INT,  "其他附加功能");
	    mTencent.shareToQQ(MainActivity.this, params, new BaseUiListener());
	}

    public class BaseUiListener implements IUiListener {
        @Override
        public void onComplete(Object o) {}

        @Override
        public void onError(UiError uiError) {}

        @Override
        public void onCancel() {}
    }

}
