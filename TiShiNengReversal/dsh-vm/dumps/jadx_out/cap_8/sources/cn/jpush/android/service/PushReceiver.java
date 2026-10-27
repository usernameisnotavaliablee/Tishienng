package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PushReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "PushReceiver";

    public PushReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
            r7 = this;
            boolean r0 = cn.jiguang.v.h.b()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "PushReceiver"
            if (r0 == 0) goto Le
            java.lang.String r8 = "[key-step]Your sdk is disabled already, no receiver task can be handled."
        La:
            cn.jiguang.w.f.d(r1, r8)     // Catch: java.lang.Throwable -> L55
            return
        Le:
            boolean r0 = cn.jiguang.v.i.a()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L17
            java.lang.String r8 = "[key-step]Your sdk is limited already, no receiver task can be handled."
            goto La
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = "onReceive:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r9.getAction()     // Catch: java.lang.Throwable -> L55
            r0.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            cn.jiguang.w.f.c(r1, r0)     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.atomic.AtomicBoolean r0 = cn.jiguang.internal.JConstants.isCallInit     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L3a
            java.lang.String r8 = "please call init"
            goto La
        L3a:
            java.lang.String r0 = "sdktype"
            java.lang.String r2 = r9.getStringExtra(r0)     // Catch: java.lang.Throwable -> L55
            android.content.Context r1 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L55
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L55
            r8 = 1
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L55
            r8 = 0
            r6[r8] = r9     // Catch: java.lang.Throwable -> L55
            r3 = 31
            r4 = 0
            r5 = 0
            cn.jiguang.api.JCoreManager.onEvent(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L55
        L55:
            return
    }
}
