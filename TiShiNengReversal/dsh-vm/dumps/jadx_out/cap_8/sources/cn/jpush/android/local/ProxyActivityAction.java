package cn.jpush.android.local;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ProxyActivityAction {
    public ProxyActivityAction() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onBackPressed(android.app.Activity r1);

    public abstract void onConfigurationChanged(android.app.Activity r1, android.content.res.Configuration r2);

    public abstract void onCreate(android.app.Activity r1, android.os.Bundle r2);

    public abstract boolean onCreateOptionsMenu(android.app.Activity r1, android.view.Menu r2);

    public abstract void onDestroy(android.app.Activity r1);

    public abstract void onEvent(android.app.Activity r1, java.lang.String r2, android.os.Bundle r3);

    public abstract boolean onKeyDown(android.app.Activity r1, int r2, android.view.KeyEvent r3);

    public abstract void onNewIntent(android.app.Activity r1, android.content.Intent r2);

    public abstract void onPause(android.app.Activity r1);

    public abstract void onRestart(android.app.Activity r1);

    public abstract void onResume(android.app.Activity r1);

    public abstract void onStart(android.app.Activity r1, android.content.Intent r2);

    public abstract void onStop(android.app.Activity r1);
}
