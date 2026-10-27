package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b extends org.apache.commons.net.pop3.a {
    public b() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.apache.commons.net.pop3.d k0(java.lang.String r3) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r3)
            boolean r3 = r0.hasMoreElements()
            r1 = 0
            if (r3 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r3 = r0.nextToken()     // Catch: java.lang.NumberFormatException -> L29
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L29
            boolean r2 = r0.hasMoreElements()     // Catch: java.lang.NumberFormatException -> L29
            if (r2 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r0.nextToken()     // Catch: java.lang.NumberFormatException -> L29
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L29
            org.apache.commons.net.pop3.d r1 = new org.apache.commons.net.pop3.d
            r1.<init>(r3, r0)
        L29:
            return r1
    }

    private static org.apache.commons.net.pop3.d l0(java.lang.String r3) {
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r0.<init>(r3)
            boolean r3 = r0.hasMoreElements()
            r1 = 0
            if (r3 != 0) goto Ld
            return r1
        Ld:
            java.lang.String r3 = r0.nextToken()     // Catch: java.lang.NumberFormatException -> L25
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L25
            boolean r2 = r0.hasMoreElements()     // Catch: java.lang.NumberFormatException -> L25
            if (r2 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r0 = r0.nextToken()     // Catch: java.lang.NumberFormatException -> L25
            org.apache.commons.net.pop3.d r1 = new org.apache.commons.net.pop3.d
            r1.<init>(r3, r0)
        L25:
            return r1
    }

    public boolean m0() throws java.io.IOException {
            r1 = this;
            r0 = 12
            int r0 = r1.f0(r0)
            if (r0 != 0) goto Ld
            r1.a0()
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public boolean n0(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L14
            r0 = 6
            java.lang.String r4 = java.lang.Integer.toString(r4)
            int r4 = r3.g0(r0, r4)
            if (r4 != 0) goto L14
            return r2
        L14:
            return r1
    }

    public org.apache.commons.net.pop3.d o0(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            r0 = 4
            java.lang.String r4 = java.lang.Integer.toString(r4)
            int r4 = r3.g0(r0, r4)
            if (r4 == 0) goto L15
            return r2
        L15:
            java.lang.String r4 = r3.y
            r0 = 3
            java.lang.String r4 = r4.substring(r0)
            org.apache.commons.net.pop3.d r4 = k0(r4)
            return r4
    }

    public org.apache.commons.net.pop3.d[] p0() throws java.io.IOException {
            r5 = this;
            int r0 = r5.d0()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L9
            return r1
        L9:
            r0 = 4
            int r0 = r5.f0(r0)
            if (r0 == 0) goto L11
            return r1
        L11:
            r5.a0()
            java.util.List<java.lang.String> r0 = r5.z
            int r0 = r0.size()
            int r0 = r0 + (-2)
            org.apache.commons.net.pop3.d[] r1 = new org.apache.commons.net.pop3.d[r0]
            java.util.List<java.lang.String> r3 = r5.z
            java.util.ListIterator r2 = r3.listIterator(r2)
            r3 = 0
        L25:
            if (r3 >= r0) goto L36
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            org.apache.commons.net.pop3.d r4 = k0(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L25
        L36:
            return r1
    }

    public org.apache.commons.net.pop3.d q0(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            r0 = 11
            java.lang.String r4 = java.lang.Integer.toString(r4)
            int r4 = r3.g0(r0, r4)
            if (r4 == 0) goto L16
            return r2
        L16:
            java.lang.String r4 = r3.y
            r0 = 3
            java.lang.String r4 = r4.substring(r0)
            org.apache.commons.net.pop3.d r4 = l0(r4)
            return r4
    }

    public org.apache.commons.net.pop3.d[] r0() throws java.io.IOException {
            r5 = this;
            int r0 = r5.d0()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L9
            return r1
        L9:
            r0 = 11
            int r0 = r5.f0(r0)
            if (r0 == 0) goto L12
            return r1
        L12:
            r5.a0()
            java.util.List<java.lang.String> r0 = r5.z
            int r0 = r0.size()
            int r0 = r0 + (-2)
            org.apache.commons.net.pop3.d[] r1 = new org.apache.commons.net.pop3.d[r0]
            java.util.List<java.lang.String> r3 = r5.z
            java.util.ListIterator r2 = r3.listIterator(r2)
            r3 = 0
        L26:
            if (r3 >= r0) goto L37
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            org.apache.commons.net.pop3.d r4 = l0(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L26
        L37:
            return r1
    }

    public boolean s0(java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.d0()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r3 = r2.g0(r1, r3)
            if (r3 == 0) goto Lf
            return r1
        Lf:
            r3 = 1
            int r4 = r2.g0(r3, r4)
            if (r4 == 0) goto L17
            return r1
        L17:
            r2.j0(r3)
            return r3
    }

    public boolean t0(java.lang.String r5, java.lang.String r6, java.lang.String r7) throws java.io.IOException, java.security.NoSuchAlgorithmException {
            r4 = this;
            int r0 = r4.d0()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = r2.toString()
            java.nio.charset.Charset r7 = r4.q()
            byte[] r6 = r6.getBytes(r7)
            byte[] r6 = r0.digest(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r0 = 128(0x80, float:1.8E-43)
            r7.<init>(r0)
            r0 = 0
        L31:
            int r2 = r6.length
            if (r0 >= r2) goto L4b
            r2 = r6[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 15
            if (r2 > r3) goto L41
            java.lang.String r3 = "0"
            r7.append(r3)
        L41:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.append(r2)
            int r0 = r0 + 1
            goto L31
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r0 = 256(0x100, float:3.59E-43)
            r6.<init>(r0)
            r6.append(r5)
            r5 = 32
            r6.append(r5)
            java.lang.String r5 = r7.toString()
            r6.append(r5)
            r5 = 9
            java.lang.String r6 = r6.toString()
            int r5 = r4.g0(r5, r6)
            if (r5 == 0) goto L6e
            return r1
        L6e:
            r5 = 1
            r4.j0(r5)
            return r5
    }

    public boolean u0() throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 2
            r2 = 1
            if (r0 != r2) goto Lb
            r3.j0(r1)
        Lb:
            r3.f0(r1)
            int r0 = r3.x
            if (r0 != 0) goto L13
            return r2
        L13:
            r0 = 0
            return r0
    }

    public boolean v0() throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            r0 = 7
            int r0 = r3.f0(r0)
            if (r0 != 0) goto L10
            return r2
        L10:
            return r1
    }

    public boolean w0() throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L11
            r0 = 8
            int r0 = r3.f0(r0)
            if (r0 != 0) goto L11
            return r2
        L11:
            return r1
    }

    public java.io.Reader x0(int r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            r0 = 5
            java.lang.String r4 = java.lang.Integer.toString(r4)
            int r4 = r3.g0(r0, r4)
            if (r4 == 0) goto L15
            return r2
        L15:
            org.apache.commons.net.io.d r4 = new org.apache.commons.net.io.d
            java.io.BufferedReader r0 = r3.w
            r4.<init>(r0)
            return r4
    }

    public java.io.Reader y0(int r4, int r5) throws java.io.IOException {
            r3 = this;
            r0 = 0
            if (r5 < 0) goto L38
            int r1 = r3.d0()
            r2 = 1
            if (r1 == r2) goto Lb
            goto L38
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            java.lang.String r4 = java.lang.Integer.toString(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5 = 10
            int r4 = r3.g0(r5, r4)
            if (r4 == 0) goto L30
            return r0
        L30:
            org.apache.commons.net.io.d r4 = new org.apache.commons.net.io.d
            java.io.BufferedReader r5 = r3.w
            r4.<init>(r5)
            return r4
        L38:
            return r0
    }

    public org.apache.commons.net.pop3.d z0() throws java.io.IOException {
            r3 = this;
            int r0 = r3.d0()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L9
            return r2
        L9:
            r0 = 3
            int r1 = r3.f0(r0)
            if (r1 == 0) goto L11
            return r2
        L11:
            java.lang.String r1 = r3.y
            java.lang.String r0 = r1.substring(r0)
            org.apache.commons.net.pop3.d r0 = k0(r0)
            return r0
    }
}
