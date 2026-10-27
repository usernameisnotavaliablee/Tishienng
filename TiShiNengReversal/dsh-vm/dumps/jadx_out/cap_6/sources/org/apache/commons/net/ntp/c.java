package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c implements org.apache.commons.net.ntp.d {
    private static final int A = 0;
    private static final int B = 0;
    private static final int C = 3;
    private static final int D = 0;
    private static final int E = 6;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 4;
    private static final int J = 8;
    private static final int K = 12;
    private static final int L = 16;
    private static final int M = 24;
    private static final int N = 32;
    private static final int O = 40;
    private static final int z = 0;
    private final byte[] x;
    private volatile java.net.DatagramPacket y;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 48
            byte[] r0 = new byte[r0]
            r1.x = r0
            return
    }

    private int E(int r4) {
            r3 = this;
            byte[] r0 = r3.x
            r0 = r0[r4]
            int r0 = M(r0)
            int r0 = r0 << 24
            byte[] r1 = r3.x
            int r2 = r4 + 1
            r1 = r1[r2]
            int r1 = M(r1)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte[] r1 = r3.x
            int r2 = r4 + 2
            r1 = r1[r2]
            int r1 = M(r1)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte[] r1 = r3.x
            int r4 = r4 + 3
            r4 = r1[r4]
            int r4 = M(r4)
            r4 = r4 | r0
            return r4
    }

    private long F(int r6) {
            r5 = this;
            byte[] r0 = r5.x
            r0 = r0[r6]
            long r0 = N(r0)
            r2 = 56
            long r0 = r0 << r2
            byte[] r2 = r5.x
            int r3 = r6 + 1
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 48
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r3 = r6 + 2
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 40
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r3 = r6 + 3
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r3 = r6 + 4
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 24
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r3 = r6 + 5
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 16
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r3 = r6 + 6
            r2 = r2[r3]
            long r2 = N(r2)
            r4 = 8
            long r2 = r2 << r4
            long r0 = r0 | r2
            byte[] r2 = r5.x
            int r6 = r6 + 7
            r6 = r2[r6]
            long r2 = N(r6)
            long r0 = r0 | r2
            return r0
    }

    private org.apache.commons.net.ntp.TimeStamp G(int r4) {
            r3 = this;
            org.apache.commons.net.ntp.TimeStamp r0 = new org.apache.commons.net.ntp.TimeStamp
            long r1 = r3.F(r4)
            r0.<init>(r1)
            return r0
    }

    private java.lang.String H() {
            r1 = this;
            int r0 = r1.b()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    private java.lang.String I() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r4.x
            r2 = 12
            r1 = r1[r2]
            int r1 = M(r1)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            byte[] r2 = r4.x
            r3 = 13
            r2 = r2[r3]
            int r2 = M(r2)
            r0.append(r2)
            r0.append(r1)
            byte[] r2 = r4.x
            r3 = 14
            r2 = r2[r3]
            int r2 = M(r2)
            r0.append(r2)
            r0.append(r1)
            byte[] r1 = r4.x
            r2 = 15
            r1 = r1[r2]
            int r1 = M(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String J() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            r2 = 3
            if (r1 > r2) goto L19
            byte[] r2 = r4.x
            int r3 = r1 + 12
            r2 = r2[r3]
            char r2 = (char) r2
            if (r2 != 0) goto L13
            goto L19
        L13:
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L19:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void K(int r5, int r6) {
            r4 = this;
            r0 = 3
        L1:
            if (r0 < 0) goto L11
            byte[] r1 = r4.x
            int r2 = r5 + r0
            r3 = r6 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r6 = r6 >>> 8
            int r0 = r0 + (-1)
            goto L1
        L11:
            return
    }

    private void L(int r7, org.apache.commons.net.ntp.TimeStamp r8) {
            r6 = this;
            if (r8 != 0) goto L5
            r0 = 0
            goto L9
        L5:
            long r0 = r8.ntpValue()
        L9:
            r8 = 7
        La:
            if (r8 < 0) goto L1d
            byte[] r2 = r6.x
            int r3 = r7 + r8
            r4 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r0
            int r5 = (int) r4
            byte r4 = (byte) r5
            r2[r3] = r4
            r2 = 8
            long r0 = r0 >>> r2
            int r8 = r8 + (-1)
            goto La
        L1d:
            return
    }

    protected static final int M(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    protected static final long N(byte r2) {
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r0 = (long) r2
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public double A() {
            r4 = this;
            int r0 = r4.y()
            double r0 = (double) r0
            r2 = 4634312102955297276(0x4050624dd2f1a9fc, double:65.536)
            double r0 = r0 / r2
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void B(int r3) {
            r2 = this;
            byte[] r0 = r2.x
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 2
            r0[r1] = r3
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public org.apache.commons.net.ntp.TimeStamp C() {
            r1 = this;
            r0 = 40
            org.apache.commons.net.ntp.TimeStamp r0 = r1.G(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void D(java.net.DatagramPacket r5) {
            r4 = this;
            if (r5 == 0) goto L3a
            int r0 = r5.getLength()
            byte[] r1 = r4.x
            int r1 = r1.length
            if (r0 < r1) goto L3a
            byte[] r0 = r5.getData()
            int r1 = r5.getLength()
            byte[] r2 = r4.x
            int r3 = r2.length
            if (r1 <= r3) goto L19
            int r1 = r2.length
        L19:
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r2, r3, r1)
            java.net.DatagramPacket r0 = r4.s()
            java.net.InetAddress r1 = r5.getAddress()
            r0.setAddress(r1)
            int r5 = r5.getPort()
            if (r5 <= 0) goto L2f
            goto L31
        L2f:
            r5 = 123(0x7b, float:1.72E-43)
        L31:
            r0.setPort(r5)
            byte[] r5 = r4.x
            r0.setData(r5)
            return
        L3a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }

    @Override // org.apache.commons.net.ntp.d
    public int a() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 3
            r0 = r0[r1]
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public int b() {
            r1 = this;
            r0 = 12
            int r0 = r1.E(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public double c() {
            r4 = this;
            int r0 = r4.p()
            double r0 = (double) r0
            r2 = 4634312102955297276(0x4050624dd2f1a9fc, double:65.536)
            double r0 = r0 / r2
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public int d() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 0
            r0 = r0[r1]
            int r0 = M(r0)
            int r0 = r0 >> 6
            r0 = r0 & 3
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public long e() {
            r4 = this;
            int r0 = r4.p()
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r2 = 65536(0x10000, double:3.2379E-319)
            long r0 = r0 / r2
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            org.apache.commons.net.ntp.c r3 = (org.apache.commons.net.ntp.c) r3
            byte[] r0 = r2.x
            byte[] r3 = r3.x
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // org.apache.commons.net.ntp.d
    public void f(int r4) {
            r3 = this;
            byte[] r0 = r3.x
            r1 = 0
            r2 = r0[r1]
            r2 = r2 & 63
            r4 = r4 & 3
            int r4 = r4 << 6
            r4 = r4 | r2
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public org.apache.commons.net.ntp.TimeStamp g() {
            r1 = this;
            r0 = 24
            org.apache.commons.net.ntp.TimeStamp r0 = r1.G(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public int getMode() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 0
            r0 = r0[r1]
            int r0 = M(r0)
            r0 = r0 & 7
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "NTP"
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public int getVersion() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 0
            r0 = r0[r1]
            int r0 = M(r0)
            int r0 = r0 >> 3
            r0 = r0 & 7
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void h(int r3) {
            r2 = this;
            byte[] r0 = r2.x
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 3
            r0[r1] = r3
            return
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.x
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void i(org.apache.commons.net.ntp.TimeStamp r2) {
            r1 = this;
            r0 = 24
            r1.L(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public int j() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void k(org.apache.commons.net.ntp.TimeStamp r2) {
            r1 = this;
            r0 = 32
            r1.L(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public void l(org.apache.commons.net.ntp.TimeStamp r2) {
            r1 = this;
            r0 = 16
            r1.L(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public java.lang.String m() {
            r1 = this;
            int r0 = r1.getMode()
            java.lang.String r0 = org.apache.commons.net.ntp.b.b(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public java.lang.String n() {
            r4 = this;
            int r0 = r4.getVersion()
            int r1 = r4.v()
            r2 = 3
            r3 = 4
            if (r0 == r2) goto Le
            if (r0 != r3) goto L1b
        Le:
            if (r1 == 0) goto L28
            r2 = 1
            if (r1 != r2) goto L14
            goto L28
        L14:
            if (r0 != r3) goto L1b
            java.lang.String r0 = r4.H()
            return r0
        L1b:
            r0 = 2
            if (r1 < r0) goto L23
            java.lang.String r0 = r4.I()
            return r0
        L23:
            java.lang.String r0 = r4.H()
            return r0
        L28:
            java.lang.String r0 = r4.J()
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void o(int r4) {
            r3 = this;
            byte[] r0 = r3.x
            r1 = 0
            r2 = r0[r1]
            r2 = r2 & 248(0xf8, float:3.48E-43)
            r4 = r4 & 7
            r4 = r4 | r2
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public int p() {
            r1 = this;
            r0 = 8
            int r0 = r1.E(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public org.apache.commons.net.ntp.TimeStamp q() {
            r1 = this;
            r0 = 16
            org.apache.commons.net.ntp.TimeStamp r0 = r1.G(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void r(int r2) {
            r1 = this;
            r0 = 8
            r1.K(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public synchronized java.net.DatagramPacket s() {
            r3 = this;
            monitor-enter(r3)
            java.net.DatagramPacket r0 = r3.y     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch: java.lang.Throwable -> L17
            byte[] r1 = r3.x     // Catch: java.lang.Throwable -> L17
            int r2 = r1.length     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L17
            r3.y = r0     // Catch: java.lang.Throwable -> L17
            java.net.DatagramPacket r0 = r3.y     // Catch: java.lang.Throwable -> L17
            r1 = 123(0x7b, float:1.72E-43)
            r0.setPort(r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L1d
        L19:
            java.net.DatagramPacket r0 = r3.y     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return r0
        L1d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void setVersion(int r4) {
            r3 = this;
            byte[] r0 = r3.x
            r1 = 0
            r2 = r0[r1]
            r2 = r2 & 199(0xc7, float:2.79E-43)
            r4 = r4 & 7
            int r4 = r4 << 3
            r4 = r4 | r2
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public org.apache.commons.net.ntp.TimeStamp t() {
            r1 = this;
            r0 = 32
            org.apache.commons.net.ntp.TimeStamp r0 = r1.G(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[version:"
            r0.append(r1)
            int r1 = r3.getVersion()
            r0.append(r1)
            java.lang.String r1 = ", mode:"
            r0.append(r1)
            int r1 = r3.getMode()
            r0.append(r1)
            java.lang.String r1 = ", poll:"
            r0.append(r1)
            int r1 = r3.j()
            r0.append(r1)
            java.lang.String r1 = ", precision:"
            r0.append(r1)
            int r1 = r3.a()
            r0.append(r1)
            java.lang.String r1 = ", delay:"
            r0.append(r1)
            int r1 = r3.y()
            r0.append(r1)
            java.lang.String r1 = ", dispersion(ms):"
            r0.append(r1)
            double r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            java.lang.String r1 = r3.n()
            r0.append(r1)
            java.lang.String r1 = ", xmitTime:"
            r0.append(r1)
            org.apache.commons.net.ntp.TimeStamp r1 = r3.C()
            java.lang.String r1 = r1.toDateString()
            r0.append(r1)
            java.lang.String r1 = " ]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void u(int r2) {
            r1 = this;
            r0 = 4
            r1.K(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public int v() {
            r2 = this;
            byte[] r0 = r2.x
            r1 = 1
            r0 = r0[r1]
            int r0 = M(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void w(org.apache.commons.net.ntp.TimeStamp r2) {
            r1 = this;
            r0 = 40
            r1.L(r0, r2)
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public void x(int r3) {
            r2 = this;
            byte[] r0 = r2.x
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 1
            r0[r1] = r3
            return
    }

    @Override // org.apache.commons.net.ntp.d
    public int y() {
            r1 = this;
            r0 = 4
            int r0 = r1.E(r0)
            return r0
    }

    @Override // org.apache.commons.net.ntp.d
    public void z(int r2) {
            r1 = this;
            r0 = 12
            r1.K(r0, r2)
            return
    }
}
