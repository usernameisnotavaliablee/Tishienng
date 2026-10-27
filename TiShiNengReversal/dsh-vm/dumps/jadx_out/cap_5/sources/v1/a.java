package v1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.lang.String a = "Anonymizer";

    static {
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r4) {
            if (r4 == 0) goto L27
            int r0 = r4.length()
            if (r0 > 0) goto L9
            goto L27
        L9:
            int r0 = r4.length()
            r1 = 1
            if (r0 > r1) goto L13
            java.lang.String r4 = "*"
            return r4
        L13:
            int r0 = r4.length()
            r2 = 8
            r3 = 0
            if (r0 >= r2) goto L21
            java.lang.String r4 = d(r4, r3, r1)
            return r4
        L21:
            r0 = 4
            java.lang.String r4 = d(r4, r3, r0)
            return r4
        L27:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String b(java.lang.String r3) {
            if (r3 == 0) goto L33
            int r0 = r3.length()
            if (r0 > 0) goto L9
            goto L33
        L9:
            int r0 = r3.length()
            r1 = 2
            if (r0 > r1) goto L17
            r0 = 42
            java.lang.String r3 = v1.b.b(r3, r0)
            return r3
        L17:
            int r0 = r3.length()
            r1 = 11
            r2 = 4
            if (r0 < r1) goto L2d
            int r0 = r3.length()
            r1 = 20
            if (r0 >= r1) goto L2d
            java.lang.String r3 = d(r3, r2, r2)
            return r3
        L2d:
            r0 = 6
            java.lang.String r3 = d(r3, r0, r2)
            return r3
        L33:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String c(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L38
            int r1 = r4.length()
            if (r1 > 0) goto Lb
            goto L38
        Lb:
            int r1 = r4.length()
            r2 = 4
            if (r1 > r2) goto L19
            r0 = 42
            java.lang.String r4 = v1.b.b(r4, r0)
            return r4
        L19:
            java.lang.String[] r4 = v1.b.f(r4, r2)
            r1 = 0
            java.lang.String r1 = v1.b.e(r4, r1)
            r2 = 1
            java.lang.String r4 = v1.b.e(r4, r2)
            java.lang.String r2 = "0123456789"
            java.lang.String r3 = "*"
            java.lang.String r4 = v1.b.c(r4, r2, r3)
            java.lang.String[] r4 = new java.lang.String[]{r1, r4}
            java.lang.String r4 = v1.b.d(r0, r4)
            return r4
        L38:
            return r0
    }

    public static java.lang.String d(java.lang.String r5, int r6, int r7) {
            java.lang.String r0 = ""
            if (r5 == 0) goto L49
            int r1 = r5.length()
            if (r1 > 0) goto Lb
            goto L49
        Lb:
            r1 = 0
            if (r6 >= 0) goto Lf
            r6 = 0
        Lf:
            if (r7 >= 0) goto L12
            r7 = 0
        L12:
            int r2 = r5.length()
            int r3 = r6 + r7
            r4 = 1
            if (r2 > r3) goto L23
            int r6 = r5.length()
            int r6 = r6 - r4
            r7 = r6
            r6 = 1
            goto L29
        L23:
            int r2 = r5.length()
            int r7 = r2 - r7
        L29:
            java.lang.String[] r5 = v1.b.g(r5, r6, r7)
            java.lang.String r6 = v1.b.e(r5, r1)
            java.lang.String r7 = v1.b.e(r5, r4)
            r1 = 42
            java.lang.String r7 = v1.b.b(r7, r1)
            r1 = 2
            java.lang.String r5 = v1.b.e(r5, r1)
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r5}
            java.lang.String r5 = v1.b.d(r0, r5)
            return r5
        L49:
            return r0
    }

    public static java.lang.String e(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 == 0) goto L68
            int r1 = r7.length()
            if (r1 > 0) goto Lb
            goto L68
        Lb:
            int r1 = r7.length()
            r2 = 1
            if (r1 > r2) goto L15
            java.lang.String r7 = "*"
            return r7
        L15:
            r1 = 64
            int r1 = r7.indexOf(r1)
            r3 = 0
            r4 = 42
            if (r1 >= 0) goto L39
            java.lang.String[] r7 = v1.b.f(r7, r2)
            java.lang.String r1 = v1.b.e(r7, r3)
            java.lang.String r7 = v1.b.e(r7, r2)
            java.lang.String r7 = v1.b.b(r7, r4)
            java.lang.String[] r7 = new java.lang.String[]{r1, r7}
            java.lang.String r7 = v1.b.d(r0, r7)
            return r7
        L39:
            r5 = 46
            int r5 = r7.lastIndexOf(r5)
            int r6 = r1 + 1
            java.lang.String[] r7 = v1.b.h(r7, r1, r6, r5)
            java.lang.String r1 = v1.b.e(r7, r3)
            java.lang.String r1 = v1.b.b(r1, r4)
            java.lang.String r2 = v1.b.e(r7, r2)
            r3 = 2
            java.lang.String r3 = v1.b.e(r7, r3)
            java.lang.String r3 = v1.b.b(r3, r4)
            r4 = 3
            java.lang.String r7 = v1.b.e(r7, r4)
            java.lang.String[] r7 = new java.lang.String[]{r1, r2, r3, r7}
            java.lang.String r7 = v1.b.d(r0, r7)
            return r7
        L68:
            return r0
    }

    public static java.lang.String f(java.lang.String r2) {
            if (r2 == 0) goto L15
            int r0 = r2.length()
            if (r0 > 0) goto L9
            goto L15
        L9:
            int r0 = r2.length()
            int r0 = r0 + (-12)
            r1 = 0
            java.lang.String r2 = d(r2, r0, r1)
            return r2
        L15:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String g(java.lang.String r2) {
            if (r2 == 0) goto L15
            int r0 = r2.length()
            if (r0 > 0) goto L9
            goto L15
        L9:
            int r0 = r2.length()
            int r0 = r0 + (-4)
            r1 = 0
            java.lang.String r2 = d(r2, r0, r1)
            return r2
        L15:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String h(java.lang.String r4) {
            java.lang.String r0 = ""
            if (r4 == 0) goto L36
            int r1 = r4.length()
            if (r1 > 0) goto Lb
            goto L36
        Lb:
            r1 = 46
            int r1 = r4.lastIndexOf(r1)
            r2 = 42
            if (r1 >= 0) goto L1a
            java.lang.String r4 = v1.b.b(r4, r2)
            return r4
        L1a:
            r3 = 1
            int r1 = r1 + r3
            java.lang.String[] r4 = v1.b.f(r4, r1)
            r1 = 0
            java.lang.String r1 = v1.b.e(r4, r1)
            java.lang.String r4 = v1.b.e(r4, r3)
            java.lang.String r4 = v1.b.b(r4, r2)
            java.lang.String[] r4 = new java.lang.String[]{r1, r4}
            java.lang.String r4 = v1.b.d(r0, r4)
            return r4
        L36:
            return r0
    }

    public static java.lang.String i(java.lang.String r7) {
            java.lang.String r0 = ""
            if (r7 == 0) goto L63
            int r1 = r7.length()
            if (r1 > 0) goto Lb
            goto L63
        Lb:
            r1 = 58
            java.lang.String[] r2 = v1.b.l(r7, r1)
            int r3 = r2.length
            r4 = 42
            r5 = 1
            if (r3 > r5) goto L1c
            java.lang.String r7 = v1.b.b(r7, r4)
            return r7
        L1c:
            int r3 = r2.length
            r6 = 8
            if (r3 == r6) goto L44
            int r1 = r7.indexOf(r1)
            int r1 = r1 + r5
            java.lang.String[] r7 = v1.b.f(r7, r1)
            r1 = 0
            java.lang.String r1 = v1.b.e(r7, r1)
            java.lang.String r7 = v1.b.e(r7, r5)
            java.lang.String r2 = "0123456789ABCDEFabcdef"
            java.lang.String r3 = "*"
            java.lang.String r7 = v1.b.c(r7, r2, r3)
            java.lang.String[] r7 = new java.lang.String[]{r1, r7}
            java.lang.String r7 = v1.b.d(r0, r7)
            return r7
        L44:
            r7 = 2
            r0 = r2[r7]
            java.lang.String r0 = j(r0)
            r2[r7] = r0
            r7 = 3
        L4e:
            int r0 = r2.length
            if (r7 >= r0) goto L5c
            r0 = r2[r7]
            java.lang.String r0 = v1.b.b(r0, r4)
            r2[r7] = r0
            int r7 = r7 + 1
            goto L4e
        L5c:
            java.lang.String r7 = ":"
            java.lang.String r7 = v1.b.d(r7, r2)
            return r7
        L63:
            return r0
    }

    public static java.lang.String j(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            int r0 = r4.length()
            r2 = 42
            r3 = 2
            if (r0 > r3) goto L17
            java.lang.String r4 = v1.b.b(r4, r2)
            return r4
        L17:
            int r0 = r4.length()
            int r0 = r0 - r3
            java.lang.String[] r4 = v1.b.f(r4, r0)
            r0 = 0
            java.lang.String r0 = v1.b.e(r4, r0)
            r3 = 1
            java.lang.String r4 = v1.b.e(r4, r3)
            java.lang.String r4 = v1.b.b(r4, r2)
            java.lang.String[] r4 = new java.lang.String[]{r0, r4}
            java.lang.String r4 = v1.b.d(r1, r4)
            return r4
    }

    public static java.lang.String k(java.lang.String r5) {
            java.lang.String r0 = ""
            if (r5 == 0) goto L38
            int r1 = r5.length()
            if (r1 > 0) goto Lb
            goto L38
        Lb:
            r1 = 45
            r2 = 2
            int r1 = v1.b.a(r5, r1, r2)
            java.lang.String r2 = "*"
            java.lang.String r3 = "0123456789ABCDEFabcdef"
            if (r1 >= 0) goto L1d
            java.lang.String r5 = v1.b.c(r5, r3, r2)
            return r5
        L1d:
            java.lang.String[] r5 = v1.b.f(r5, r1)
            r1 = 0
            java.lang.String r1 = v1.b.e(r5, r1)
            r4 = 1
            java.lang.String r5 = v1.b.e(r5, r4)
            java.lang.String r5 = v1.b.c(r5, r3, r2)
            java.lang.String[] r5 = new java.lang.String[]{r1, r5}
            java.lang.String r5 = v1.b.d(r0, r5)
            return r5
        L38:
            return r0
    }

    public static java.lang.String l(java.lang.String r2) {
            if (r2 == 0) goto L19
            int r0 = r2.length()
            if (r0 > 0) goto L9
            goto L19
        L9:
            int r0 = r2.length()
            r1 = 1
            if (r0 > r1) goto L13
            java.lang.String r2 = "*"
            return r2
        L13:
            r0 = 0
            java.lang.String r2 = d(r2, r1, r0)
            return r2
        L19:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String m(java.lang.String r3) {
            if (r3 == 0) goto L33
            int r0 = r3.length()
            if (r0 > 0) goto L9
            goto L33
        L9:
            int r0 = r3.length()
            r1 = 2
            if (r0 > r1) goto L17
            r0 = 42
            java.lang.String r3 = v1.b.b(r3, r0)
            return r3
        L17:
            int r0 = r3.length()
            r2 = 8
            if (r0 < r2) goto L2c
            int r0 = r3.length()
            r2 = 11
            if (r0 >= r2) goto L2c
            java.lang.String r3 = d(r3, r1, r1)
            return r3
        L2c:
            r0 = 3
            r1 = 4
            java.lang.String r3 = d(r3, r0, r1)
            return r3
        L33:
            java.lang.String r3 = ""
            return r3
    }
}
