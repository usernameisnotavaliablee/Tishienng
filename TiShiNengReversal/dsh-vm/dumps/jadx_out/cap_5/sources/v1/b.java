package v1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String r2, char r3, int r4) {
            int r0 = r2.length()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L16
            char r1 = r2.charAt(r0)
            if (r1 != r3) goto L13
            int r4 = r4 + (-1)
            if (r4 > 0) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L6
        L16:
            return r0
    }

    public static java.lang.String b(java.lang.String r2, char r3) {
            if (r2 == 0) goto L1d
            int r0 = r2.length()
            if (r0 > 0) goto L9
            goto L1d
        L9:
            int r2 = r2.length()
            char[] r0 = new char[r2]
            r1 = 0
        L10:
            if (r1 >= r2) goto L17
            r0[r1] = r3
            int r1 = r1 + 1
            goto L10
        L17:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            return r2
        L1d:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String c(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            if (r5 == 0) goto L4f
            int r0 = r5.length()
            if (r0 <= 0) goto L4f
            int r0 = r6.length()
            if (r0 <= 0) goto L4f
            int r0 = r7.length()
            if (r0 > 0) goto L15
            goto L4f
        L15:
            char[] r0 = r5.toCharArray()
            int r5 = r5.length()
            char[] r5 = new char[r5]
            int r1 = r7.length()
            int r1 = r1 + (-1)
            char r1 = r7.charAt(r1)
            r2 = 0
        L2a:
            int r3 = r0.length
            if (r2 >= r3) goto L49
            char r3 = r0[r2]
            int r4 = r6.lastIndexOf(r3)
            if (r4 >= 0) goto L38
            r5[r2] = r3
            goto L46
        L38:
            int r3 = r7.length()
            if (r4 < r3) goto L40
            r3 = r1
            goto L44
        L40:
            char r3 = r7.charAt(r4)
        L44:
            r5[r2] = r3
        L46:
            int r2 = r2 + 1
            goto L2a
        L49:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r5)
            return r6
        L4f:
            return r5
    }

    public static java.lang.String d(java.lang.String r3, java.lang.String... r4) {
            if (r4 == 0) goto L26
            int r0 = r4.length
            if (r0 > 0) goto L6
            goto L26
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 0
            r1 = r4[r1]
            r0.<init>(r1)
            r1 = 1
        Lf:
            int r2 = r4.length
            if (r1 >= r2) goto L21
            r2 = r4[r1]
            if (r2 == 0) goto L1e
            r0.append(r3)
            r2 = r4[r1]
            r0.append(r2)
        L1e:
            int r1 = r1 + 1
            goto Lf
        L21:
            java.lang.String r3 = r0.toString()
            return r3
        L26:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String e(java.lang.String[] r2, int r3) {
            java.lang.String r0 = ""
            if (r2 == 0) goto L11
            int r1 = r2.length
            if (r1 > 0) goto L8
            goto L11
        L8:
            if (r3 < 0) goto L11
            int r1 = r2.length
            if (r3 < r1) goto Le
            goto L11
        Le:
            r2 = r2[r3]
            return r2
        L11:
            return r0
    }

    public static java.lang.String[] f(java.lang.String r2, int r3) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L9
            java.lang.String[] r2 = new java.lang.String[]{r0, r0}
            return r2
        L9:
            if (r3 < 0) goto L20
            int r1 = r2.length()
            if (r3 <= r1) goto L12
            goto L20
        L12:
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r3)
            java.lang.String r2 = r2.substring(r3)
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}
            return r2
        L20:
            java.lang.String[] r2 = new java.lang.String[]{r2, r0}
            return r2
    }

    public static java.lang.String[] g(java.lang.String r2, int r3, int r4) {
            java.lang.String[] r2 = f(r2, r3)
            r0 = 0
            java.lang.String r0 = e(r2, r0)
            r1 = 1
            java.lang.String r2 = e(r2, r1)
            int r4 = r4 - r3
            java.lang.String[] r2 = f(r2, r4)
            java.lang.String[] r2 = m(r0, r2)
            return r2
    }

    public static java.lang.String[] h(java.lang.String r2, int r3, int r4, int r5) {
            java.lang.String[] r2 = f(r2, r3)
            r0 = 0
            java.lang.String r0 = e(r2, r0)
            r1 = 1
            java.lang.String r2 = e(r2, r1)
            int r4 = r4 - r3
            int r5 = r5 - r3
            java.lang.String[] r2 = g(r2, r4, r5)
            java.lang.String[] r2 = m(r0, r2)
            return r2
    }

    public static java.lang.String[] i(java.lang.String r8, int... r9) {
            if (r8 != 0) goto L9
            java.lang.String r8 = ""
            java.lang.String[] r8 = new java.lang.String[]{r8}
            return r8
        L9:
            int r0 = r8.length()
            r1 = 1
            if (r0 <= r1) goto L46
            int r0 = r9.length
            if (r0 > 0) goto L14
            goto L46
        L14:
            int r0 = r9.length
            r2 = 0
            if (r0 > r1) goto L1f
            r9 = r9[r2]
            java.lang.String[] r8 = f(r8, r9)
            return r8
        L1f:
            r0 = r9[r2]
            int r3 = r9.length
            int r3 = r3 - r1
            int[] r4 = new int[r3]
            r5 = 0
        L26:
            if (r5 >= r3) goto L31
            int r6 = r5 + 1
            r7 = r9[r6]
            int r7 = r7 - r0
            r4[r5] = r7
            r5 = r6
            goto L26
        L31:
            java.lang.String[] r8 = f(r8, r0)
            java.lang.String r9 = e(r8, r2)
            java.lang.String r8 = e(r8, r1)
            java.lang.String[] r8 = i(r8, r4)
            java.lang.String[] r8 = m(r9, r8)
            return r8
        L46:
            java.lang.String[] r8 = new java.lang.String[]{r8}
            return r8
    }

    public static java.lang.String[] j(java.lang.String[] r0, java.lang.String r1) {
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String[] r0 = k(r0, r1)
            return r0
    }

    public static java.lang.String[] k(java.lang.String[] r3, java.lang.String[] r4) {
            int r0 = r3.length
            r1 = 0
            if (r0 > 0) goto Lb
            int r3 = r4.length
            if (r3 > 0) goto La
            java.lang.String[] r3 = new java.lang.String[r1]
            return r3
        La:
            return r4
        Lb:
            int r0 = r4.length
            if (r0 > 0) goto Lf
            return r3
        Lf:
            int r0 = r3.length
            int r2 = r4.length
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
            int r3 = r3.length
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r3, r2)
            return r0
    }

    public static java.lang.String[] l(java.lang.String r8, char r9) {
            r0 = 0
            if (r8 != 0) goto L6
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
        L6:
            int r1 = r8.length()
            if (r1 > 0) goto L11
            java.lang.String[] r8 = new java.lang.String[]{r8}
            return r8
        L11:
            r1 = 1
            r2 = 0
            r3 = 1
        L14:
            int r4 = r8.length()
            if (r2 >= r4) goto L25
            char r4 = r8.charAt(r2)
            if (r4 != r9) goto L22
            int r3 = r3 + 1
        L22:
            int r2 = r2 + 1
            goto L14
        L25:
            if (r3 > r1) goto L2c
            java.lang.String[] r8 = new java.lang.String[]{r8}
            return r8
        L2c:
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r4 = r8.length()
            r2.<init>(r4)
            r4 = 0
            r5 = 0
        L39:
            int r6 = r8.length()
            if (r4 >= r6) goto L5a
            if (r5 >= r3) goto L5a
            char r6 = r8.charAt(r4)
            if (r6 != r9) goto L54
            int r6 = r5 + 1
            java.lang.String r7 = r2.toString()
            r1[r5] = r7
            r2.setLength(r0)
            r5 = r6
            goto L57
        L54:
            r2.append(r6)
        L57:
            int r4 = r4 + 1
            goto L39
        L5a:
            java.lang.String r8 = r2.toString()
            r1[r5] = r8
            return r1
    }

    public static java.lang.String[] m(java.lang.String r0, java.lang.String[] r1) {
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String[] r0 = k(r0, r1)
            return r0
    }
}
