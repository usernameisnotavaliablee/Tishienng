package com.sun.mail.iap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    protected java.util.Vector a;

    public b() {
            r2 = this;
            r2.<init>()
            java.util.Vector r0 = new java.util.Vector
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            return
    }

    private void b(byte[] r13, com.sun.mail.iap.f r14) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r12 = this;
            java.io.OutputStream r0 = r14.e()
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            int r1 = r13.length
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 <= r2) goto Lf
            r12.e(r13, r14)
            return
        Lf:
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            r5 = 0
            r6 = 0
        L18:
            r7 = 92
            r8 = 34
            if (r5 < r1) goto L40
            if (r4 == 0) goto L23
            r0.write(r8)
        L23:
            if (r6 == 0) goto L37
        L25:
            if (r2 < r1) goto L28
            goto L3a
        L28:
            r14 = r13[r2]
            if (r14 == r8) goto L2e
            if (r14 != r7) goto L31
        L2e:
            r0.write(r7)
        L31:
            r0.write(r14)
            int r2 = r2 + 1
            goto L25
        L37:
            r0.write(r13)
        L3a:
            if (r4 == 0) goto L3f
            r0.write(r8)
        L3f:
            return
        L40:
            r9 = r13[r5]
            if (r9 == 0) goto L7b
            r10 = 13
            if (r9 == r10) goto L7b
            r10 = 10
            if (r9 == r10) goto L7b
            r10 = r9 & 255(0xff, float:3.57E-43)
            r11 = 127(0x7f, float:1.78E-43)
            if (r10 <= r11) goto L53
            goto L7b
        L53:
            r11 = 42
            if (r9 == r11) goto L6f
            r11 = 37
            if (r9 == r11) goto L6f
            r11 = 40
            if (r9 == r11) goto L6f
            r11 = 41
            if (r9 == r11) goto L6f
            r11 = 123(0x7b, float:1.72E-43)
            if (r9 == r11) goto L6f
            if (r9 == r8) goto L6f
            if (r9 == r7) goto L6f
            r11 = 32
            if (r10 > r11) goto L78
        L6f:
            if (r9 == r8) goto L76
            if (r9 != r7) goto L74
            goto L76
        L74:
            r4 = 1
            goto L78
        L76:
            r4 = 1
            r6 = 1
        L78:
            int r5 = r5 + 1
            goto L18
        L7b:
            r12.e(r13, r14)
            return
    }

    private void c(com.sun.mail.iap.e r2, com.sun.mail.iap.f r3) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r1 = this;
            int r0 = r2.size()
            java.io.OutputStream r3 = r1.f(r3, r0)
            r2.writeTo(r3)
            return
    }

    private void d(java.io.ByteArrayOutputStream r2, com.sun.mail.iap.f r3) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r1 = this;
            int r0 = r2.size()
            java.io.OutputStream r3 = r1.f(r3, r0)
            r2.writeTo(r3)
            return
    }

    private void e(byte[] r2, com.sun.mail.iap.f r3) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r1 = this;
            int r0 = r2.length
            java.io.OutputStream r3 = r1.f(r3, r0)
            r3.write(r2)
            return
    }

    private java.io.OutputStream f(com.sun.mail.iap.f r4, int r5) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r3 = this;
            java.io.OutputStream r0 = r4.e()
            java.io.DataOutputStream r0 = (java.io.DataOutputStream) r0
            boolean r1 = r4.p()
            r2 = 123(0x7b, float:1.72E-43)
            r0.write(r2)
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.writeBytes(r5)
            if (r1 == 0) goto L1e
            java.lang.String r5 = "+}\r\n"
            r0.writeBytes(r5)
            goto L23
        L1e:
            java.lang.String r5 = "}\r\n"
            r0.writeBytes(r5)
        L23:
            r0.flush()
            if (r1 != 0) goto L40
        L28:
            com.sun.mail.iap.g r5 = r4.l()
            boolean r1 = r5.f()
            if (r1 == 0) goto L33
            goto L40
        L33:
            boolean r1 = r5.j()
            if (r1 != 0) goto L3a
            goto L28
        L3a:
            com.sun.mail.iap.LiteralException r4 = new com.sun.mail.iap.LiteralException
            r4.<init>(r5)
            throw r4
        L40:
            return r0
    }

    public void a(com.sun.mail.iap.b r4) {
            r3 = this;
            java.util.Vector r0 = r3.a
            int r1 = r0.size()
            java.util.Vector r2 = r4.a
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            r0 = 0
        L11:
            java.util.Vector r1 = r4.a
            int r1 = r1.size()
            if (r0 < r1) goto L1a
            return
        L1a:
            java.util.Vector r1 = r3.a
            java.util.Vector r2 = r4.a
            java.lang.Object r2 = r2.elementAt(r0)
            r1.addElement(r2)
            int r0 = r0 + 1
            goto L11
    }

    public void g(com.sun.mail.iap.f r6) throws java.io.IOException, com.sun.mail.iap.ProtocolException {
            r5 = this;
            java.util.Vector r0 = r5.a
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.size()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.io.OutputStream r2 = r6.e()
            java.io.DataOutputStream r2 = (java.io.DataOutputStream) r2
        L11:
            if (r1 < r0) goto L14
            return
        L14:
            if (r1 <= 0) goto L1b
            r3 = 32
            r2.write(r3)
        L1b:
            java.util.Vector r3 = r5.a
            java.lang.Object r3 = r3.elementAt(r1)
            boolean r4 = r3 instanceof com.sun.mail.iap.c
            if (r4 == 0) goto L2d
            com.sun.mail.iap.c r3 = (com.sun.mail.iap.c) r3
            java.lang.String r3 = r3.a
            r2.writeBytes(r3)
            goto L78
        L2d:
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L3b
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.String r3 = r3.toString()
            r2.writeBytes(r3)
            goto L78
        L3b:
            boolean r4 = r3 instanceof com.sun.mail.iap.a
            if (r4 == 0) goto L47
            com.sun.mail.iap.a r3 = (com.sun.mail.iap.a) r3
            byte[] r3 = r3.a
            r5.b(r3, r6)
            goto L78
        L47:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L51
            byte[] r3 = (byte[]) r3
            r5.e(r3, r6)
            goto L78
        L51:
            boolean r4 = r3 instanceof java.io.ByteArrayOutputStream
            if (r4 == 0) goto L5b
            java.io.ByteArrayOutputStream r3 = (java.io.ByteArrayOutputStream) r3
            r5.d(r3, r6)
            goto L78
        L5b:
            boolean r4 = r3 instanceof com.sun.mail.iap.e
            if (r4 == 0) goto L65
            com.sun.mail.iap.e r3 = (com.sun.mail.iap.e) r3
            r5.c(r3, r6)
            goto L78
        L65:
            boolean r4 = r3 instanceof com.sun.mail.iap.b
            if (r4 == 0) goto L78
            r4 = 40
            r2.write(r4)
            com.sun.mail.iap.b r3 = (com.sun.mail.iap.b) r3
            r3.g(r6)
            r3 = 41
            r2.write(r3)
        L78:
            int r1 = r1 + 1
            goto L11
    }

    public void h(com.sun.mail.iap.b r2) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            return
    }

    public void i(java.lang.String r3) {
            r2 = this;
            java.util.Vector r0 = r2.a
            com.sun.mail.iap.c r1 = new com.sun.mail.iap.c
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }

    public void j(com.sun.mail.iap.e r2) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            return
    }

    public void k(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            return
    }

    public void l(byte[] r2) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            return
    }

    public void m(int r3) {
            r2 = this;
            java.util.Vector r0 = r2.a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }

    public void n(long r3) {
            r2 = this;
            java.util.Vector r0 = r2.a
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }

    public void o(java.lang.String r3) {
            r2 = this;
            java.util.Vector r0 = r2.a
            com.sun.mail.iap.a r1 = new com.sun.mail.iap.a
            byte[] r3 = com.sun.mail.util.ASCIIUtility.getBytes(r3)
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }

    public void p(java.lang.String r3, java.lang.String r4) throws java.io.UnsupportedEncodingException {
            r2 = this;
            if (r4 != 0) goto L6
            r2.o(r3)
            return
        L6:
            java.util.Vector r0 = r2.a
            com.sun.mail.iap.a r1 = new com.sun.mail.iap.a
            byte[] r3 = r3.getBytes(r4)
            r1.<init>(r3)
            r0.addElement(r1)
            return
    }
}
