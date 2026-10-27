package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
final class g7 extends com.huawei.hms.scankit.p.d0 {
    g7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.d0
    public int a() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.huawei.hms.scankit.p.d0
    int a(char r5, java.lang.StringBuilder r6) {
            r4 = this;
            r0 = 1
            r1 = 32
            if (r5 != r1) goto La
            r5 = 3
            r6.append(r5)
            return r0
        La:
            r2 = 48
            if (r5 < r2) goto L19
            r2 = 57
            if (r5 > r2) goto L19
            int r5 = r5 + (-44)
            char r5 = (char) r5
            r6.append(r5)
            return r0
        L19:
            r2 = 97
            if (r5 < r2) goto L28
            r2 = 122(0x7a, float:1.71E-43)
            if (r5 > r2) goto L28
            int r5 = r5 + (-83)
            char r5 = (char) r5
            r6.append(r5)
            return r0
        L28:
            r2 = 2
            if (r5 >= r1) goto L33
            r0 = 0
            r6.append(r0)
            r6.append(r5)
            return r2
        L33:
            r1 = 33
            if (r5 < r1) goto L44
            r3 = 47
            if (r5 > r3) goto L44
            r6.append(r0)
            int r5 = r5 - r1
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L44:
            r1 = 58
            r3 = 64
            if (r5 < r1) goto L56
            if (r5 > r3) goto L56
            r6.append(r0)
            int r5 = r5 + (-43)
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L56:
            r1 = 91
            if (r5 < r1) goto L68
            r1 = 95
            if (r5 > r1) goto L68
            r6.append(r0)
            int r5 = r5 + (-69)
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L68:
            r0 = 96
            if (r5 != r0) goto L75
            r6.append(r2)
            int r5 = r5 - r0
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L75:
            r1 = 65
            if (r5 < r1) goto L86
            r1 = 90
            if (r5 > r1) goto L86
            r6.append(r2)
            int r5 = r5 - r3
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L86:
            r1 = 123(0x7b, float:1.72E-43)
            if (r5 < r1) goto L97
            r1 = 127(0x7f, float:1.78E-43)
            if (r5 > r1) goto L97
            r6.append(r2)
            int r5 = r5 - r0
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L97:
            java.lang.String r0 = "\u0001\u001e"
            r6.append(r0)
            int r5 = r5 + (-128)
            char r5 = (char) r5
            int r5 = r4.a(r5, r6)
            int r5 = r5 + r2
            return r5
    }
}
