package com.bytedance.msdk.api.activity;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTTransparentActivity extends android.app.Activity {
    static {
            r0 = 20108(0x4e8c, float:2.8177E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public TTTransparentActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void j() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.view.WindowManager$LayoutParams r1 = r0.getAttributes()
            r2 = 0
            r1.alpha = r2
            r0.setAttributes(r1)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(@androidx.annotation.Nullable android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onDestroy() {
            r0 = this;
            super.onDestroy()
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)
            r0.setIntent(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }
}
