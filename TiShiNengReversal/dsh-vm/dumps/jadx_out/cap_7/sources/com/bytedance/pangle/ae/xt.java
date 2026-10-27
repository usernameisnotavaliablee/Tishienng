package com.bytedance.pangle.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt extends com.bytedance.pangle.r.j {
    private final com.bytedance.pangle.ZeusPluginInstallListener j;

    public xt(com.bytedance.pangle.ZeusPluginInstallListener r1) {
            r0 = this;
            r0.<init>()
            r0.j = r1
            return
    }

    @Override // com.bytedance.pangle.r
    public void j(java.lang.String r2, int r3, java.lang.String r4) throws android.os.RemoteException {
            r1 = this;
            com.bytedance.pangle.ZeusPluginInstallListener r0 = r1.j
            if (r0 == 0) goto L7
            r0.onPluginInstall(r2, r3, r4)
        L7:
            return
    }
}
