package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class f implements com.danikula.videocache.file.c {
    private static final int a = 4;

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String a(java.lang.String r4) {
            r3 = this;
            r0 = 46
            int r0 = r4.lastIndexOf(r0)
            r1 = 47
            int r1 = r4.lastIndexOf(r1)
            r2 = -1
            if (r0 == r2) goto L24
            if (r0 <= r1) goto L24
            int r1 = r0 + 6
            int r2 = r4.length()
            if (r1 <= r2) goto L24
            int r0 = r0 + 1
            int r1 = r4.length()
            java.lang.String r4 = r4.substring(r0, r1)
            return r4
        L24:
            java.lang.String r4 = ""
            return r4
    }

    @Override // com.danikula.videocache.file.c
    public java.lang.String generate(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.a(r3)
            java.lang.String r3 = com.danikula.videocache.p.d(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lf
            return r3
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
