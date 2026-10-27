package cn.jpush.android.ui;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PushActivity extends android.app.Activity {
    public static final java.lang.String FROM_OTHER_WAY = "from_way";
    public static final java.lang.String FROM_UNION_AD = "from_union_ad";
    private static final java.lang.String TAG = "PushActivity";
    private cn.jpush.android.local.ProxyActivityAction activityAction;

    static {
            r0 = 8976(0x2310, float:1.2578E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public PushActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    public void onBackPressed() {
            r1 = this;
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto L7
            r0.onBackPressed(r1)
        L7:
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
    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto La
            r0.onNewIntent(r1, r2)
        La:
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r1 = this;
            super.onPause()
            cn.jpush.android.local.ProxyActivityAction r0 = r1.activityAction
            if (r0 == 0) goto La
            r0.onPause(r1)
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

    public void showTitleBar() {
            r3 = this;
            cn.jpush.android.local.ProxyActivityAction r0 = r3.activityAction
            if (r0 == 0) goto La
            java.lang.String r1 = "push_show_titlebar"
            r2 = 0
            r0.onEvent(r3, r1, r2)
        La:
            return
    }
}
