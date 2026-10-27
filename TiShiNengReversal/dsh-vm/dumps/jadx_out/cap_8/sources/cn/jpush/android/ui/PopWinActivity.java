package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PopWinActivity extends android.app.Activity {
    private static final java.lang.String TAG = "PopWinActivity";
    private cn.jpush.android.local.ProxyActivityAction activityAction;

    static {
            r0 = 8975(0x230f, float:1.2577E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public PopWinActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            super.onBackPressed()
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto La
            r0.onBackPressed(r1)
        La:
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r1 = this;
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto L7
            r0.onDestroy(r1)
        L7:
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r1 = this;
            super.onPause()
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto La
            r0.onResume(r1)
        La:
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            super.onResume()
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto La
            r0.onResume(r1)
        La:
            return
    }

    public void startPushActivity(java.lang.String r3) {
            r2 = this;
            cn.jpush.android.local.ProxyActivityAction r0 = r2.activityAction
            if (r0 == 0) goto L15
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "url"
            r0.putString(r1, r3)
            cn.jpush.android.local.ProxyActivityAction r3 = r2.activityAction
            java.lang.String r1 = "start_push_activity"
            r3.onEvent(r2, r1, r0)
        L15:
            return
    }
}
