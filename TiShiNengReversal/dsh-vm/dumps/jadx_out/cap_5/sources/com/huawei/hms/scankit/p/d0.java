package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
class d0 implements com.huawei.hms.scankit.p.v2 {
    d0() {
            r0 = this;
            r0.<init>()
            return
    }

    private int a(com.huawei.hms.scankit.p.y2 r2, java.lang.StringBuilder r3, java.lang.StringBuilder r4, int r5) {
            r1 = this;
            int r0 = r3.length()
            int r5 = r0 - r5
            r3.delete(r5, r0)
            int r3 = r2.f
            int r3 = r3 + (-1)
            r2.f = r3
            char r3 = r2.c()
            int r3 = r1.a(r3, r4)
            r2.k()
            return r3
    }

    private static java.lang.String a(java.lang.CharSequence r4, int r5) {
            char r0 = r4.charAt(r5)
            int r1 = r5 + 1
            char r1 = r4.charAt(r1)
            r2 = 2
            int r5 = r5 + r2
            char r4 = r4.charAt(r5)
            int r0 = r0 * 1600
            int r1 = r1 * 40
            int r0 = r0 + r1
            int r0 = r0 + r4
            r4 = 1
            int r0 = r0 + r4
            int r5 = r0 / 256
            char r5 = (char) r5
            int r0 = r0 % 256
            char r0 = (char) r0
            java.lang.String r1 = new java.lang.String
            char[] r2 = new char[r2]
            r3 = 0
            r2[r3] = r5
            r2[r4] = r0
            r1.<init>(r2)
            return r1
    }

    static void b(com.huawei.hms.scankit.p.y2 r2, java.lang.StringBuilder r3) {
            r0 = 0
            java.lang.String r1 = a(r3, r0)
            r2.a(r1)
            r2 = 3
            r3.delete(r0, r2)
            return
    }

    public int a() {
            r1 = this;
            r0 = 1
            return r0
    }

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
            r2 = 65
            if (r5 < r2) goto L28
            r2 = 90
            if (r5 > r2) goto L28
            int r5 = r5 + (-51)
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
            if (r5 < r1) goto L56
            r1 = 64
            if (r5 > r1) goto L56
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
            if (r5 < r0) goto L79
            r1 = 127(0x7f, float:1.78E-43)
            if (r5 > r1) goto L79
            r6.append(r2)
            int r5 = r5 - r0
            char r5 = (char) r5
            r6.append(r5)
            return r2
        L79:
            java.lang.String r0 = "\u0001\u001e"
            r6.append(r0)
            int r5 = r5 + (-128)
            char r5 = (char) r5
            int r5 = r4.a(r5, r6)
            int r5 = r5 + r2
            return r5
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(com.huawei.hms.scankit.p.y2 r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r9.i()
            if (r1 == 0) goto L7e
            char r1 = r9.c()
            int r2 = r9.f
            r3 = 1
            int r2 = r2 + r3
            r9.f = r2
            int r1 = r8.a(r1, r0)
            int r2 = r0.length()
            r4 = 3
            int r2 = r2 / r4
            r5 = 2
            int r2 = r2 * 2
            int r6 = r9.a()
            int r6 = r6 + r2
            r9.c(r6)
            com.huawei.hms.scankit.p.d7 r2 = r9.g()
            int r2 = r2.a()
            int r2 = r2 - r6
            boolean r6 = r9.i()
            if (r6 != 0) goto L5f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r0.length()
            int r7 = r7 % r4
            if (r7 != r5) goto L4d
            if (r2 < r5) goto L49
            if (r2 <= r5) goto L4d
        L49:
            int r1 = r8.a(r9, r0, r6, r1)
        L4d:
            int r5 = r0.length()
            int r5 = r5 % r4
            if (r5 != r3) goto L7e
            if (r1 > r4) goto L58
            if (r2 != r3) goto L5a
        L58:
            if (r1 <= r4) goto L7e
        L5a:
            int r1 = r8.a(r9, r0, r6, r1)
            goto L4d
        L5f:
            int r1 = r0.length()
            int r1 = r1 % r4
            if (r1 != 0) goto L5
            java.lang.String r1 = r9.d()
            int r2 = r9.f
            int r3 = r8.a()
            int r1 = com.huawei.hms.scankit.p.d4.a(r1, r2, r3)
            int r2 = r8.a()
            if (r1 == r2) goto L5
            r1 = 0
            r9.b(r1)
        L7e:
            r8.a(r9, r0)
            return
    }

    void a(com.huawei.hms.scankit.p.y2 r7, java.lang.StringBuilder r8) {
            r6 = this;
            int r0 = r8.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 2
            int r0 = r0 * 2
            int r3 = r8.length()
            int r3 = r3 % r1
            int r4 = r7.a()
            int r4 = r4 + r0
            r7.c(r4)
            com.huawei.hms.scankit.p.d7 r0 = r7.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            if (r3 != r2) goto L3b
            r8.append(r4)
        L27:
            int r0 = r8.length()
            if (r0 < r1) goto L31
            b(r7, r8)
            goto L27
        L31:
            boolean r8 = r7.i()
            if (r8 == 0) goto L80
            r7.a(r5)
            goto L80
        L3b:
            r2 = 1
            if (r0 != r2) goto L59
            if (r3 != r2) goto L59
        L40:
            int r0 = r8.length()
            if (r0 < r1) goto L4a
            b(r7, r8)
            goto L40
        L4a:
            boolean r8 = r7.i()
            if (r8 == 0) goto L53
            r7.a(r5)
        L53:
            int r8 = r7.f
            int r8 = r8 - r2
            r7.f = r8
            goto L80
        L59:
            if (r3 != 0) goto L71
        L5b:
            int r2 = r8.length()
            if (r2 < r1) goto L65
            b(r7, r8)
            goto L5b
        L65:
            if (r0 > 0) goto L6d
            boolean r8 = r7.i()
            if (r8 == 0) goto L80
        L6d:
            r7.a(r5)
            goto L80
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "Unexpected case. Please report!"
            r8.<init>(r0)     // Catch: java.lang.Exception -> L79
            throw r8     // Catch: java.lang.Exception -> L79
        L79:
            java.lang.String r8 = "exception"
            java.lang.String r0 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r8, r0)
        L80:
            r7.b(r4)
            return
    }
}
