package com.ss.android.socialbase.appdownloader.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private int[] a;
    private int[] b;

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int a(int[] r1, int r2) {
            int r0 = r2 / 4
            r1 = r1[r0]
            int r2 = r2 % 4
            int r2 = r2 / 2
            if (r2 != 0) goto Lf
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            return r1
        Lf:
            int r1 = r1 >>> 16
            return r1
    }

    public static com.ss.android.socialbase.appdownloader.m.j.d b(com.ss.android.socialbase.appdownloader.m.j.e r6) throws java.io.IOException {
            r0 = 1835009(0x1c0001, float:2.571395E-39)
            com.ss.android.socialbase.appdownloader.m.j.g.a(r6, r0)
            int r0 = r6.g()
            int r1 = r6.g()
            int r2 = r6.g()
            r6.g()
            int r3 = r6.g()
            int r4 = r6.g()
            com.ss.android.socialbase.appdownloader.m.j.d r5 = new com.ss.android.socialbase.appdownloader.m.j.d
            r5.<init>()
            int[] r1 = r6.h(r1)
            r5.a = r1
            if (r2 == 0) goto L2d
            r6.h(r2)
        L2d:
            if (r4 != 0) goto L31
            r1 = r0
            goto L32
        L31:
            r1 = r4
        L32:
            int r1 = r1 - r3
            int r2 = r1 % 4
            java.lang.String r3 = ")."
            if (r2 != 0) goto L66
            int r1 = r1 / 4
            int[] r1 = r6.h(r1)
            r5.b = r1
            if (r4 == 0) goto L65
            int r0 = r0 - r4
            int r1 = r0 % 4
            if (r1 != 0) goto L4e
            int r0 = r0 / 4
            r6.h(r0)
            return r5
        L4e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Style data size is not multiple of 4 ("
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L65:
            return r5
        L66:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "String data size is not multiple of 4 ("
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    public java.lang.String c(int r4) {
            r3 = this;
            if (r4 < 0) goto L2c
            int[] r0 = r3.a
            if (r0 == 0) goto L2c
            int r1 = r0.length
            if (r4 >= r1) goto L2c
            r4 = r0[r4]
            int[] r0 = r3.b
            int r0 = a(r0, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
        L16:
            if (r0 == 0) goto L27
            int r4 = r4 + 2
            int[] r2 = r3.b
            int r2 = a(r2, r4)
            char r2 = (char) r2
            r1.append(r2)
            int r0 = r0 + (-1)
            goto L16
        L27:
            java.lang.String r4 = r1.toString()
            return r4
        L2c:
            r4 = 0
            return r4
    }
}
