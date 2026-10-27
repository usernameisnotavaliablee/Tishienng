package com.kwad.components.core.proxy.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public java.lang.String WH;
    public long WO;
    public long WP;
    public long WQ;

    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PageMonitorInfo{pageName='"
            r0.<init>(r1)
            java.lang.String r1 = r3.WH
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", pageLaunchTime="
            r0.append(r1)
            long r1 = r3.WO
            r0.append(r1)
            java.lang.String r1 = ", pageCreateTime="
            r0.append(r1)
            long r1 = r3.WP
            r0.append(r1)
            java.lang.String r1 = ", pageResumeTime="
            r0.append(r1)
            long r1 = r3.WQ
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
