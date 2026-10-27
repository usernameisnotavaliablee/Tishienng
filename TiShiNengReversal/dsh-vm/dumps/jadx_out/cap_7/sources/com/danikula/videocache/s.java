package com.danikula.videocache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class s {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;

    public s(java.lang.String r1, long r2, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SourceInfo{url='"
            r0.append(r1)
            java.lang.String r1 = r4.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", length="
            r0.append(r2)
            long r2 = r4.b
            r0.append(r2)
            java.lang.String r2 = ", mime='"
            r0.append(r2)
            java.lang.String r2 = r4.c
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
