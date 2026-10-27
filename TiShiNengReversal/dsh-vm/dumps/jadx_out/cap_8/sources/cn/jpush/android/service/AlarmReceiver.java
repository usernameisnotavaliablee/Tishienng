package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AlarmReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "AlarmReceiver";

    public AlarmReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            java.lang.String r8 = "onReceive"
            java.lang.String r0 = "AlarmReceiver"
            cn.jiguang.w.f.c(r0, r8)
            boolean r8 = cn.jiguang.v.h.b()
            if (r8 == 0) goto L13
            java.lang.String r7 = "[key-step]Your sdk is disabled already, no receiver task can be handled."
            cn.jiguang.w.f.d(r0, r7)
            return
        L13:
            boolean r8 = cn.jiguang.v.i.a()
            if (r8 == 0) goto L1f
            java.lang.String r7 = "[key-step]Your sdk is limited already, no receiver task can be handled."
            cn.jiguang.w.f.d(r0, r7)
            return
        L1f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r8 < r1) goto L2b
            java.lang.String r7 = "sdk is android 12, return"
            cn.jiguang.w.f.d(r0, r7)
            return
        L2b:
            boolean r8 = cn.jiguang.av.b.b(r7)
            if (r8 != 0) goto L37
            java.lang.String r7 = "auto wakeup is closed"
            cn.jiguang.w.f.d(r0, r7)
            return
        L37:
            java.util.concurrent.atomic.AtomicBoolean r8 = cn.jiguang.internal.JConstants.isCallInit
            boolean r8 = r8.get()
            if (r8 != 0) goto L45
            java.lang.String r7 = "please call init"
            cn.jiguang.w.f.d(r0, r7)
            return
        L45:
            cn.jiguang.ad.a.b(r7)
            r8 = 0
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r1 = "JCore"
            r2 = 10
            java.lang.String r3 = "a2"
            r4 = 0
            r0 = r7
            cn.jiguang.api.JCoreManager.onEvent(r0, r1, r2, r3, r4, r5)
            return
    }
}
