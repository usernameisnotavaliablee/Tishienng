package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class m1 {
    private final java.lang.String a;
    private final long b;
    private final java.lang.String c;

    m1(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.b = r0
            java.lang.String r3 = r2.a(r3)
            r2.c = r3
            return
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "xyz.adscope.ad"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "AdScope-ASNP"
            return r2
        Lb:
            java.lang.String r0 = "xyz.adscope.common"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L16
            java.lang.String r2 = "AdScope-Foundation"
            return r2
        L16:
            java.lang.String r2 = ""
            return r2
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long c() {
            r2 = this;
            long r0 = r2.b
            return r0
    }
}
