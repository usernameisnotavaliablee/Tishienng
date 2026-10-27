package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c extends org.apache.commons.net.smtp.b {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public c(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean A0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ">"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r3 = r2.o0(r3)
            boolean r3 = org.apache.commons.net.smtp.e.c(r3)
            return r3
    }

    public boolean B0(org.apache.commons.net.smtp.a r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.toString()
            int r1 = r0.o0(r1)
            boolean r1 = org.apache.commons.net.smtp.e.c(r1)
            return r1
    }

    public boolean C0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.e0()
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public java.lang.String D0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.j0()
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r1.g0()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String E0(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.k0(r1)
            boolean r1 = org.apache.commons.net.smtp.e.c(r1)
            if (r1 == 0) goto Lf
            java.lang.String r1 = r0.g0()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public boolean F0() throws java.io.IOException {
            r1 = this;
            java.net.InetAddress r0 = r1.x()
            java.lang.String r0 = r0.getHostName()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r1.i0(r0)
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public boolean G0(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.i0(r1)
            boolean r1 = org.apache.commons.net.smtp.e.c(r1)
            return r1
    }

    public boolean H0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.n0()
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public boolean I0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.q0()
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public java.io.Writer J0() throws java.io.IOException {
            r2 = this;
            int r0 = r2.c0()
            boolean r0 = org.apache.commons.net.smtp.e.d(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            org.apache.commons.net.io.e r0 = new org.apache.commons.net.io.e
            java.io.BufferedWriter r1 = r2.x
            r0.<init>(r1)
            return r0
    }

    public boolean K0() throws java.io.IOException {
            r1 = this;
            int r0 = r1.m0()
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public boolean L0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.Writer r0 = r1.J0()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0.write(r2)
            r0.close()
            boolean r2 = r1.C0()
            return r2
    }

    public boolean M0(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
            r1 = this;
            boolean r2 = r1.O0(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r2 = r1.A0(r3)
            if (r2 != 0) goto Lf
            return r0
        Lf:
            boolean r2 = r1.L0(r4)
            return r2
    }

    public boolean N0(java.lang.String r4, java.lang.String[] r5, java.lang.String r6) throws java.io.IOException {
            r3 = this;
            boolean r4 = r3.O0(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            r4 = 0
            r1 = 0
        La:
            int r2 = r5.length
            if (r4 >= r2) goto L19
            r2 = r5[r4]
            boolean r2 = r3.A0(r2)
            if (r2 == 0) goto L16
            r1 = 1
        L16:
            int r4 = r4 + 1
            goto La
        L19:
            if (r1 != 0) goto L1c
            return r0
        L1c:
            boolean r4 = r3.L0(r6)
            return r4
    }

    public boolean O0(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ">"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r3 = r2.l0(r3)
            boolean r3 = org.apache.commons.net.smtp.e.c(r3)
            return r3
    }

    public boolean P0(org.apache.commons.net.smtp.a r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.toString()
            int r1 = r0.l0(r1)
            boolean r1 = org.apache.commons.net.smtp.e.c(r1)
            return r1
    }

    public boolean Q0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            int r2 = r1.z0(r2)
            r0 = 250(0xfa, float:3.5E-43)
            if (r2 == r0) goto Lf
            r0 = 251(0xfb, float:3.52E-43)
            if (r2 != r0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }
}
