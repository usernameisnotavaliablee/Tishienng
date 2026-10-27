package cn.jpush.android.service;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WakedResultReceiver extends android.content.BroadcastReceiver {
    public static final java.lang.String CONTEXT_KEY = "1";
    public static final java.lang.String WAKE_TYPE_KEY = "2";

    public WakedResultReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            return
    }

    public void onWake(int r1) {
            r0 = this;
            return
    }

    public void onWake(android.content.Context r1, int r2) {
            r0 = this;
            return
    }

    public final void onWakeMap(java.util.Map r3) {
            r2 = this;
            java.lang.String r0 = "2"
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto Lf
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L22
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L22
            goto L10
        Lf:
            r0 = -1
        L10:
            r2.onWake(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "1"
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L1e
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L22
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r2.onWake(r3, r0)     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }
}
