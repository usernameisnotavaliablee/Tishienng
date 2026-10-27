package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class q0 extends com.huawei.hms.scankit.p.h5 {
    private static final char[] a = null;
    private static final char[] b = null;
    private static final char[] c = null;
    private static final char d = 0;

    static {
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x001c: FILL_ARRAY_DATA , data: [65, 66, 67, 68} // fill-array
            com.huawei.hms.scankit.p.q0.a = r1
            char[] r2 = new char[r0]
            r2 = {x0024: FILL_ARRAY_DATA , data: [84, 78, 42, 69} // fill-array
            com.huawei.hms.scankit.p.q0.b = r2
            char[] r0 = new char[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [47, 58, 43, 46} // fill-array
            com.huawei.hms.scankit.p.q0.c = r0
            r0 = 0
            char r0 = r1[r0]
            com.huawei.hms.scankit.p.q0.d = r0
            return
    }

    public q0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.scankit.p.h5
    public boolean[] a(java.lang.String r11) {
            r10 = this;
            int r0 = r11.length()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = com.huawei.hms.scankit.p.q0.d
            r0.append(r1)
            r0.append(r11)
            r0.append(r1)
            java.lang.String r11 = r0.toString()
            goto L77
        L1e:
            char r0 = r11.charAt(r2)
            char r0 = java.lang.Character.toUpperCase(r0)
            int r1 = r11.length()
            int r1 = r1 - r3
            char r1 = r11.charAt(r1)
            char r1 = java.lang.Character.toUpperCase(r1)
            char[] r4 = com.huawei.hms.scankit.p.q0.a
            boolean r5 = com.huawei.hms.scankit.p.p0.a(r4, r0)
            boolean r4 = com.huawei.hms.scankit.p.p0.a(r4, r1)
            char[] r6 = com.huawei.hms.scankit.p.q0.b
            boolean r0 = com.huawei.hms.scankit.p.p0.a(r6, r0)
            boolean r1 = com.huawei.hms.scankit.p.p0.a(r6, r1)
            java.lang.String r6 = "Invalid start/end guards: error contents"
            if (r5 == 0) goto L54
            if (r4 == 0) goto L4e
            goto L77
        L4e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r6)
            throw r11
        L54:
            if (r0 == 0) goto L5f
            if (r1 == 0) goto L59
            goto L77
        L59:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r6)
            throw r11
        L5f:
            if (r4 != 0) goto L14b
            if (r1 != 0) goto L14b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = com.huawei.hms.scankit.p.q0.d
            r0.append(r1)
            r0.append(r11)
            r0.append(r1)
            java.lang.String r11 = r0.toString()
        L77:
            r0 = 20
            r1 = 1
        L7a:
            int r4 = r11.length()
            int r4 = r4 - r3
            if (r1 >= r4) goto Ld0
            char r4 = r11.charAt(r1)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto Lcb
            char r4 = r11.charAt(r1)
            r5 = 45
            if (r4 == r5) goto Lcb
            char r4 = r11.charAt(r1)
            r5 = 36
            if (r4 != r5) goto L9c
            goto Lcb
        L9c:
            char[] r4 = com.huawei.hms.scankit.p.q0.c
            char r5 = r11.charAt(r1)
            boolean r4 = com.huawei.hms.scankit.p.p0.a(r4, r5)
            if (r4 == 0) goto Lab
            int r0 = r0 + 10
            goto Lcd
        Lab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot encode : '"
            r2.append(r3)
            char r11 = r11.charAt(r1)
            r2.append(r11)
            r11 = 39
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            throw r0
        Lcb:
            int r0 = r0 + 9
        Lcd:
            int r1 = r1 + 1
            goto L7a
        Ld0:
            int r1 = r11.length()
            int r1 = r1 - r3
            int r0 = r0 + r1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r4 = 0
        Lda:
            int r5 = r11.length()
            if (r1 >= r5) goto L14a
            char r5 = r11.charAt(r1)
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r1 == 0) goto Lf1
            int r6 = r11.length()
            int r6 = r6 - r3
            if (r1 != r6) goto L10d
        Lf1:
            r6 = 42
            if (r5 == r6) goto L10b
            r6 = 69
            if (r5 == r6) goto L108
            r6 = 78
            if (r5 == r6) goto L105
            r6 = 84
            if (r5 == r6) goto L102
            goto L10d
        L102:
            r5 = 65
            goto L10d
        L105:
            r5 = 66
            goto L10d
        L108:
            r5 = 68
            goto L10d
        L10b:
            r5 = 67
        L10d:
            r6 = 0
        L10e:
            char[] r7 = com.huawei.hms.scankit.p.p0.e
            int r8 = r7.length
            if (r6 >= r8) goto L11f
            char r7 = r7[r6]
            if (r5 != r7) goto L11c
            int[] r5 = com.huawei.hms.scankit.p.p0.f
            r5 = r5[r6]
            goto L120
        L11c:
            int r6 = r6 + 1
            goto L10e
        L11f:
            r5 = 0
        L120:
            r6 = 0
            r7 = 1
        L122:
            r8 = 0
        L123:
            r9 = 7
            if (r6 >= r9) goto L13c
            r0[r4] = r7
            int r4 = r4 + 1
            int r9 = 6 - r6
            int r9 = r5 >> r9
            r9 = r9 & r3
            if (r9 == 0) goto L137
            if (r8 != r3) goto L134
            goto L137
        L134:
            int r8 = r8 + 1
            goto L123
        L137:
            r7 = r7 ^ 1
            int r6 = r6 + 1
            goto L122
        L13c:
            int r5 = r11.length()
            int r5 = r5 - r3
            if (r1 >= r5) goto L147
            r0[r4] = r2
            int r4 = r4 + 1
        L147:
            int r1 = r1 + 1
            goto Lda
        L14a:
            return r0
        L14b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r6)
            throw r11
    }
}
