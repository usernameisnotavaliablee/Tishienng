package com.bytedance.pangle.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw extends com.bytedance.pangle.ZeusPluginStateListener {
    private final com.bytedance.pangle.r j;
    private final int xt;

    public cw(com.bytedance.pangle.r r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            r0.xt = r2
            return
    }

    public int j() {
            r1 = this;
            int r0 = r1.xt
            return r0
    }

    @Override // com.bytedance.pangle.ZeusPluginStateListener
    public void onStateChangeOnCurThread(java.lang.String r3, int r4, java.lang.Object... r5) {
            r2 = this;
            r0 = 5
            if (r4 == r0) goto L9
            r0 = 7
            if (r4 == r0) goto L9
            r0 = 6
            if (r4 != r0) goto L1c
        L9:
            java.lang.String r0 = ""
            if (r5 == 0) goto L17
            int r1 = r5.length     // Catch: android.os.RemoteException -> L1c
            if (r1 <= 0) goto L17
            r0 = 0
            r5 = r5[r0]     // Catch: android.os.RemoteException -> L1c
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: android.os.RemoteException -> L1c
        L17:
            com.bytedance.pangle.r r5 = r2.j     // Catch: android.os.RemoteException -> L1c
            r5.j(r3, r4, r0)     // Catch: android.os.RemoteException -> L1c
        L1c:
            return
    }
}
