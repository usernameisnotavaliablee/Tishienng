package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InstrumentedActivity extends android.app.Activity {
    public InstrumentedActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Activity
    protected void onPause() {
            r0 = this;
            super.onPause()
            cn.jpush.android.api.JPushInterface.onPause(r0)
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r0 = this;
            super.onResume()
            cn.jpush.android.api.JPushInterface.onResume(r0)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r0 = this;
            super.onStart()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r0 = this;
            super.onStop()
            return
    }
}
