package cn.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JTransitActivity extends android.app.Activity {
    static {
            r0 = 7331(0x1ca3, float:1.0273E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public JTransitActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.finish()
            return
        L6:
            cn.jpush.android.local.ActionHelper r0 = cn.jpush.android.local.ActionHelper.getInstance()     // Catch: java.lang.Throwable -> L19
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L19
            r0.handleNotificationIntent(r1, r4)     // Catch: java.lang.Throwable -> L19
            r3.finish()
            return
        L19:
            r4 = move-exception
            java.lang.String r0 = "JTransitActivity"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r1.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "handle intent failed:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L38
            r1.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.helper.Logger.d(r0, r4)     // Catch: java.lang.Throwable -> L38
            r3.finish()
            return
        L38:
            r4 = move-exception
            r3.finish()
            throw r4
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r1) {
            r0 = this;
            super.onNewIntent(r1)     // Catch: java.lang.Throwable -> L6
            r0.a(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }
}
