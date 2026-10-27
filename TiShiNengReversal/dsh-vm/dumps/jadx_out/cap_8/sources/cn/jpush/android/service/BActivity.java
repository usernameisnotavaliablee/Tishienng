package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BActivity extends android.app.Activity {
    private static final java.lang.String TAG = "BActivity";

    public BActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    private void handleStart() {
            r4 = this;
            java.lang.String r0 = "BActivity"
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L19
            android.content.Intent r2 = r4.getIntent()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1b
            android.content.Intent r2 = r4.getIntent()     // Catch: java.lang.Throwable -> L19
            android.os.Bundle r2 = r2.getExtras()     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r1 = move-exception
            goto L22
        L1b:
            r2 = 0
        L1c:
            r3 = 8
            cn.jiguang.p.g.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L19
            goto L36
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handle start error#"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.c(r0, r1)
        L36:
            r4.finish()     // Catch: java.lang.Throwable -> L3a
            goto L4f
        L3a:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "finish error#"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.w.f.c(r0, r1)
        L4f:
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            java.lang.String r5 = "BActivity"
            java.lang.String r0 = "BActivity oncreate"
            cn.jiguang.w.f.c(r5, r0)
            android.content.Context r5 = r4.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            long r0 = cn.jiguang.d.a.f(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2b
            boolean r5 = cn.jiguang.internal.JConstants.isInstrumentationHookFailed
            if (r5 == 0) goto L2b
            android.content.Context r5 = r4.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            cn.jiguang.api.JCoreManager.init(r5)
        L2b:
            r4.handleStart()
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r2) {
            r1 = this;
            super.onNewIntent(r2)
            java.lang.String r2 = "BActivity"
            java.lang.String r0 = "BActivity onNewIntent"
            cn.jiguang.w.f.c(r2, r0)
            r1.handleStart()
            return
    }
}
