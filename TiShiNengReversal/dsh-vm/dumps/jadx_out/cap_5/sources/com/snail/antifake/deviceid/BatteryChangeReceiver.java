package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class BatteryChangeReceiver extends android.content.BroadcastReceiver {
    private boolean a;
    private int b;

    public BatteryChangeReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public boolean b() {
            r1 = this;
            boolean r0 = r1.a
            return r0
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r3, android.content.Intent r4) {
            r2 = this;
            java.lang.String r3 = "status"
            r0 = 0
            int r3 = r4.getIntExtra(r3, r0)
            java.lang.String r1 = "level"
            int r4 = r4.getIntExtra(r1, r0)
            r2.b = r4
            r4 = 1
            if (r3 == r4) goto L22
            r1 = 2
            if (r3 == r1) goto L22
            r1 = 3
            if (r3 == r1) goto L1f
            r1 = 4
            if (r3 == r1) goto L1f
            r0 = 5
            if (r3 == r0) goto L22
            return
        L1f:
            r2.a = r0
            return
        L22:
            r2.a = r4
            return
    }
}
