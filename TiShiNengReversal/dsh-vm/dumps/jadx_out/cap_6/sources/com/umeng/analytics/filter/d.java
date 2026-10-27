package com.umeng.analytics.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    private static final java.lang.String b = "Ă";
    private final java.lang.String a;
    private java.security.MessageDigest c;
    private java.util.Set<java.lang.Object> d;
    private boolean e;

    public d(boolean r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "MD5"
            r3.a = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.d = r1
            r3.e = r4
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L17
            r3.c = r0     // Catch: java.security.NoSuchAlgorithmException -> L17
            goto L18
        L17:
        L18:
            if (r5 == 0) goto L6a
            r0 = 0
            if (r4 == 0) goto L57
            byte[] r4 = r5.getBytes()     // Catch: java.lang.IllegalArgumentException -> L6a
            byte[] r4 = android.util.Base64.decode(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L6a
        L25:
            int r5 = r4.length     // Catch: java.lang.IllegalArgumentException -> L6a
            int r5 = r5 / 4
            if (r0 >= r5) goto L6a
            int r5 = r0 * 4
            r1 = r4[r5]     // Catch: java.lang.IllegalArgumentException -> L6a
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r2 = r5 + 1
            r2 = r4[r2]     // Catch: java.lang.IllegalArgumentException -> L6a
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r1 = r1 + r2
            int r2 = r5 + 2
            r2 = r4[r2]     // Catch: java.lang.IllegalArgumentException -> L6a
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r1 = r1 + r2
            int r5 = r5 + 3
            r5 = r4[r5]     // Catch: java.lang.IllegalArgumentException -> L6a
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r5
            java.util.Set<java.lang.Object> r5 = r3.d     // Catch: java.lang.IllegalArgumentException -> L6a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L6a
            r5.add(r1)     // Catch: java.lang.IllegalArgumentException -> L6a
            int r0 = r0 + 1
            goto L25
        L57:
            java.lang.String r4 = "Ă"
            java.lang.String[] r4 = r5.split(r4)
            int r5 = r4.length
        L5e:
            if (r0 >= r5) goto L6a
            r1 = r4[r0]
            java.util.Set<java.lang.Object> r2 = r3.d
            r2.add(r1)
            int r0 = r0 + 1
            goto L5e
        L6a:
            return
    }

    private java.lang.Integer c(java.lang.String r3) {
            r2 = this;
            java.security.MessageDigest r0 = r2.c     // Catch: java.lang.Exception -> L31
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L31
            r0.update(r3)     // Catch: java.lang.Exception -> L31
            java.security.MessageDigest r3 = r2.c     // Catch: java.lang.Exception -> L31
            byte[] r3 = r3.digest()     // Catch: java.lang.Exception -> L31
            r0 = 0
            r0 = r3[r0]     // Catch: java.lang.Exception -> L31
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            r1 = 1
            r1 = r3[r1]     // Catch: java.lang.Exception -> L31
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            r1 = 2
            r1 = r3[r1]     // Catch: java.lang.Exception -> L31
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            r1 = 3
            r3 = r3[r1]     // Catch: java.lang.Exception -> L31
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L31
            return r3
        L31:
            r3 = 0
            return r3
    }

    public void a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set<java.lang.Object> r1 = r3.d
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            int r2 = r0.length()
            if (r2 <= 0) goto Lb
            java.lang.String r2 = ","
            r0.append(r2)
            goto Lb
        L24:
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            return
    }

    public boolean a(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto Lf
            java.util.Set<java.lang.Object> r0 = r1.d
            java.lang.Integer r2 = r1.c(r2)
            boolean r2 = r0.contains(r2)
            return r2
        Lf:
            java.util.Set<java.lang.Object> r0 = r1.d
            boolean r2 = r0.contains(r2)
            return r2
    }

    public void b(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto Le
            java.util.Set<java.lang.Object> r0 = r1.d
            java.lang.Integer r2 = r1.c(r2)
            r0.add(r2)
            return
        Le:
            java.util.Set<java.lang.Object> r0 = r1.d
            r0.add(r2)
            return
    }

    public java.lang.String toString() {
            r8 = this;
            boolean r0 = r8.e
            if (r0 == 0) goto L57
            java.util.Set<java.lang.Object> r0 = r8.d
            int r0 = r0.size()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            java.util.Set<java.lang.Object> r1 = r8.d
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L16:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r5 = r3 + 1
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6 = r6 & r4
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r0[r3] = r6
            int r6 = r3 + 2
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r7 = r7 & r4
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r0[r5] = r7
            int r5 = r3 + 3
            r7 = 65280(0xff00, float:9.1477E-41)
            r7 = r7 & r4
            int r7 = r7 >> 8
            byte r7 = (byte) r7
            r0[r6] = r7
            int r3 = r3 + 4
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r5] = r4
            goto L16
        L4d:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = android.util.Base64.encode(r0, r2)
            r1.<init>(r0)
            return r1
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set<java.lang.Object> r1 = r8.d
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()
            int r3 = r0.length()
            if (r3 <= 0) goto L77
            java.lang.String r3 = "Ă"
            r0.append(r3)
        L77:
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            goto L62
        L7f:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
