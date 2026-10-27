package net.sourceforge.pinyin4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class e {
    private static final java.lang.String[] a = null;
    private static final java.lang.String b = "";

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            net.sourceforge.pinyin4j.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String[] a(char r3) {
            java.lang.String[] r3 = d(r3)
            if (r3 == 0) goto L19
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        La:
            int r2 = r3.length
            if (r1 >= r2) goto L18
            r2 = r3[r1]
            java.lang.String r2 = net.sourceforge.pinyin4j.c.a(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L18:
            return r0
        L19:
            java.lang.String[] r3 = net.sourceforge.pinyin4j.e.a
            return r3
    }

    private static java.lang.String[] b(char r4, net.sourceforge.pinyin4j.h r5) {
            java.lang.String[] r4 = d(r4)
            if (r4 == 0) goto L1b
            int r0 = r4.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            net.sourceforge.pinyin4j.h r3 = net.sourceforge.pinyin4j.h.b
            java.lang.String r2 = net.sourceforge.pinyin4j.g.a(r2, r3, r5)
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
        L1b:
            java.lang.String[] r4 = net.sourceforge.pinyin4j.e.a
            return r4
    }

    private static java.lang.String[] c(char r2, net.sourceforge.pinyin4j.format.b r3) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
            java.lang.String[] r2 = d(r2)
            if (r2 == 0) goto L16
            r0 = 0
        L7:
            int r1 = r2.length
            if (r0 >= r1) goto L15
            r1 = r2[r0]
            java.lang.String r1 = net.sourceforge.pinyin4j.d.b(r1, r3)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L7
        L15:
            return r2
        L16:
            java.lang.String[] r2 = net.sourceforge.pinyin4j.e.a
            return r2
    }

    private static java.lang.String[] d(char r1) {
            net.sourceforge.pinyin4j.a r0 = net.sourceforge.pinyin4j.a.d()
            java.lang.String[] r1 = r0.b(r1)
            return r1
    }

    public static java.lang.String[] e(char r0) {
            java.lang.String[] r0 = a(r0)
            return r0
    }

    public static java.lang.String f(java.lang.String r9, net.sourceforge.pinyin4j.format.b r10, java.lang.String r11, boolean r12) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
            net.sourceforge.pinyin4j.a r0 = net.sourceforge.pinyin4j.a.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r9 = r9.toCharArray()
            r2 = 0
            r3 = 0
        Lf:
            int r4 = r9.length
            if (r3 >= r4) goto L75
            char r4 = r9[r3]
            w4.b r5 = r0.e()
            r6 = 0
            r7 = r3
            r8 = r7
        L1b:
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = r4.toUpperCase()
            w4.b r4 = r5.a(r4)
            if (r4 == 0) goto L38
            java.lang.String r5 = r4.c()
            if (r5 == 0) goto L34
            java.lang.String r6 = r4.c()
            r8 = r7
        L34:
            w4.b r4 = r4.b()
        L38:
            r5 = r4
            int r7 = r7 + 1
            int r4 = r9.length
            if (r7 >= r4) goto L42
            char r4 = r9[r7]
            if (r5 != 0) goto L1b
        L42:
            if (r6 != 0) goto L4c
            if (r12 == 0) goto L72
            char r3 = r9[r3]
            r1.append(r3)
            goto L72
        L4c:
            java.lang.String[] r4 = r0.h(r6)
            if (r4 == 0) goto L72
            r5 = 0
        L53:
            int r6 = r4.length
            if (r5 >= r6) goto L72
            r6 = r4[r5]
            java.lang.String r6 = net.sourceforge.pinyin4j.d.b(r6, r10)
            r1.append(r6)
            int r6 = r9.length
            if (r7 < r6) goto L69
            int r6 = r4.length
            int r6 = r6 + (-1)
            if (r5 >= r6) goto L6c
            if (r3 == r8) goto L6c
        L69:
            r1.append(r11)
        L6c:
            if (r3 != r8) goto L6f
            goto L72
        L6f:
            int r5 = r5 + 1
            goto L53
        L72:
            int r3 = r8 + 1
            goto Lf
        L75:
            java.lang.String r9 = r1.toString()
            return r9
    }

    public static java.lang.String[] g(char r0) {
            java.lang.String[] r0 = d(r0)
            return r0
    }

    public static java.lang.String[] h(char r0, net.sourceforge.pinyin4j.format.b r1) throws net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination {
            java.lang.String[] r0 = c(r0, r1)
            return r0
    }

    public static java.lang.String[] i(char r1) {
            net.sourceforge.pinyin4j.h r0 = net.sourceforge.pinyin4j.h.d
            java.lang.String[] r1 = b(r1, r0)
            return r1
    }

    public static java.lang.String[] j(char r1) {
            net.sourceforge.pinyin4j.h r0 = net.sourceforge.pinyin4j.h.f
            java.lang.String[] r1 = b(r1, r0)
            return r1
    }

    public static java.lang.String[] k(char r1) {
            net.sourceforge.pinyin4j.h r0 = net.sourceforge.pinyin4j.h.c
            java.lang.String[] r1 = b(r1, r0)
            return r1
    }

    public static java.lang.String[] l(char r1) {
            net.sourceforge.pinyin4j.h r0 = net.sourceforge.pinyin4j.h.e
            java.lang.String[] r1 = b(r1, r0)
            return r1
    }
}
