package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class a {
    private static final char[] a = null;

    static {
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            com.huawei.agconnect.config.impl.a.a = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    private static byte[] a(char[] r9) {
            int r0 = r9.length
            r0 = r0 & 1
            if (r0 != 0) goto L5e
            int r0 = r9.length
            int r0 = r0 >> 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 0
        Lc:
            int r3 = r9.length
            if (r1 >= r3) goto L5d
            char r3 = r9[r1]
            r4 = 16
            int r3 = java.lang.Character.digit(r3, r4)
            java.lang.String r5 = "Illegal hexadecimal character at index "
            r6 = -1
            if (r3 == r6) goto L48
            int r7 = r1 + 1
            char r8 = r9[r7]
            int r4 = java.lang.Character.digit(r8, r4)
            if (r4 == r6) goto L33
            int r1 = r1 + 2
            int r3 = r3 << 4
            r3 = r3 | r4
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto Lc
        L33:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L48:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L5d:
            return r0
        L5e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Odd number of characters."
            r9.<init>(r0)
            throw r9
    }

    public static byte[] b(java.lang.String r0) {
            char[] r0 = r0.toCharArray()
            byte[] r0 = a(r0)
            return r0
    }

    public static java.lang.String c(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            char[] r4 = com.huawei.agconnect.config.impl.a.a
            int r5 = r3 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r0.append(r5)
            r3 = r3 & 15
            char r3 = r4[r3]
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L23:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
