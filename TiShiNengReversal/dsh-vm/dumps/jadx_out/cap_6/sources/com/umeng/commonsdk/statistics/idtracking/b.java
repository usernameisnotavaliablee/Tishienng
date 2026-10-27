package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends com.umeng.commonsdk.statistics.idtracking.a {
    private static final java.lang.String a = "android_id";
    private android.content.Context b;

    public b(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "android_id"
            r1.<init>(r0)
            r1.b = r2
            return
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public java.lang.String f() {
            r1 = this;
            android.content.Context r0 = r1.b
            java.lang.String r0 = com.umeng.commonsdk.statistics.common.DeviceConfig.getAndroidId(r0)
            return r0
    }
}
