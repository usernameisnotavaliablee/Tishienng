package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    public int a;
    public int b;
    public java.lang.String c;

    public d() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1, r0)
            return
    }

    public d(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public d(int r2, java.lang.String r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r0)
            return
    }

    private d(int r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Number: "
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ". Size: "
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ". Id: "
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
