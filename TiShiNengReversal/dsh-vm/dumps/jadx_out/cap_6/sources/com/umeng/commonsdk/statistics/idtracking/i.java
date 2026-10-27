package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i extends com.umeng.commonsdk.statistics.idtracking.a {
    private static final java.lang.String a = "serial";

    public i() {
            r1 = this;
            java.lang.String r0 = "serial"
            r1.<init>(r0)
            return
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    @android.annotation.TargetApi(9)
    public java.lang.String f() {
            r1 = this;
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getSerial()
            return r0
    }
}
