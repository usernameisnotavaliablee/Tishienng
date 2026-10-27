package org.apache.commons.net.ntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private final org.apache.commons.net.ntp.d a;
    private java.util.List<java.lang.String> b;
    private java.lang.Long c;
    private java.lang.Long d;
    private final long e;
    private boolean f;

    public e(org.apache.commons.net.ntp.d r7, long r8) {
            r6 = this;
            r4 = 0
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public e(org.apache.commons.net.ntp.d r7, long r8, java.util.List<java.lang.String> r10) {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public e(org.apache.commons.net.ntp.d r1, long r2, java.util.List<java.lang.String> r4, boolean r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L11
            r0.e = r2
            r0.a = r1
            r0.b = r4
            if (r5 == 0) goto L10
            r0.b()
        L10:
            return
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "message cannot be null"
            r1.<init>(r2)
            throw r1
    }

    public e(org.apache.commons.net.ntp.d r7, long r8, boolean r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r4, r5)
            return
    }

    public void a(java.lang.String r2) {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.b
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
        Lb:
            java.util.List<java.lang.String> r0 = r1.b
            r0.add(r2)
            return
    }

    public void b() {
            r18 = this;
            r0 = r18
            boolean r1 = r0.f
            if (r1 == 0) goto L8
            goto L100
        L8:
            r1 = 1
            r0.f = r1
            java.util.List<java.lang.String> r1 = r0.b
            if (r1 != 0) goto L16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
        L16:
            org.apache.commons.net.ntp.d r1 = r0.a
            org.apache.commons.net.ntp.TimeStamp r1 = r1.g()
            long r2 = r1.getTime()
            org.apache.commons.net.ntp.d r4 = r0.a
            org.apache.commons.net.ntp.TimeStamp r4 = r4.t()
            long r5 = r4.getTime()
            org.apache.commons.net.ntp.d r7 = r0.a
            org.apache.commons.net.ntp.TimeStamp r7 = r7.C()
            long r8 = r7.getTime()
            long r10 = r1.ntpValue()
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L5f
            long r1 = r7.ntpValue()
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L57
            long r1 = r0.e
            long r8 = r8 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.d = r1
            java.util.List<java.lang.String> r1 = r0.b
            java.lang.String r2 = "Error: zero orig time -- cannot compute delay"
            r1.add(r2)
            return
        L57:
            java.util.List<java.lang.String> r1 = r0.b
            java.lang.String r2 = "Error: zero orig time -- cannot compute delay/offset"
            r1.add(r2)
            return
        L5f:
            long r10 = r4.ntpValue()
            java.lang.String r1 = "Error: OrigTime > DestRcvTime"
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto Lc5
            long r10 = r7.ntpValue()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L72
            goto Lc5
        L72:
            long r10 = r0.e
            long r10 = r10 - r2
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 >= 0) goto L81
            java.util.List<java.lang.String> r4 = r0.b
            java.lang.String r7 = "Error: xmitTime < rcvTime"
            r4.add(r7)
            goto La4
        L81:
            long r14 = r8 - r5
            int r4 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r4 > 0) goto L8a
            long r12 = r10 - r14
            goto La5
        L8a:
            long r14 = r14 - r10
            r16 = 1
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 != 0) goto L9d
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto La4
            java.util.List<java.lang.String> r4 = r0.b
            java.lang.String r7 = "Info: processing time > total network time by 1 ms -> assume zero delay"
            r4.add(r7)
            goto La5
        L9d:
            java.util.List<java.lang.String> r4 = r0.b
            java.lang.String r7 = "Warning: processing time > total network time"
            r4.add(r7)
        La4:
            r12 = r10
        La5:
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r0.c = r4
            long r10 = r0.e
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 <= 0) goto Lb6
            java.util.List<java.lang.String> r4 = r0.b
            r4.add(r1)
        Lb6:
            long r5 = r5 - r2
            long r1 = r0.e
            long r8 = r8 - r1
            long r5 = r5 + r8
            r1 = 2
            long r5 = r5 / r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.d = r1
            return
        Lc5:
            java.util.List<java.lang.String> r10 = r0.b
            java.lang.String r11 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r10.add(r11)
            long r10 = r0.e
            int r14 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r14 <= 0) goto Ld8
            java.util.List<java.lang.String> r10 = r0.b
            r10.add(r1)
            goto Ldf
        Ld8:
            long r10 = r10 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            r0.c = r1
        Ldf:
            long r10 = r4.ntpValue()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto Lef
            long r5 = r5 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0.d = r1
            return
        Lef:
            long r1 = r7.ntpValue()
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L100
            long r1 = r0.e
            long r8 = r8 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0.d = r1
        L100:
            return
    }

    public java.net.InetAddress c() {
            r1 = this;
            org.apache.commons.net.ntp.d r0 = r1.a
            java.net.DatagramPacket r0 = r0.s()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.net.InetAddress r0 = r0.getAddress()
            return r0
    }

    public java.util.List<java.lang.String> d() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.b
            return r0
    }

    public java.lang.Long e() {
            r1 = this;
            java.lang.Long r0 = r1.c
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L27
            java.lang.Class r2 = r7.getClass()
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L12
            goto L27
        L12:
            org.apache.commons.net.ntp.e r8 = (org.apache.commons.net.ntp.e) r8
            long r2 = r7.e
            long r4 = r8.e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            org.apache.commons.net.ntp.d r2 = r7.a
            org.apache.commons.net.ntp.d r8 = r8.a
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public org.apache.commons.net.ntp.d f() {
            r1 = this;
            org.apache.commons.net.ntp.d r0 = r1.a
            return r0
    }

    public java.lang.Long g() {
            r1 = this;
            java.lang.Long r0 = r1.d
            return r0
    }

    public long h() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.e
            int r1 = (int) r0
            int r1 = r1 * 31
            org.apache.commons.net.ntp.d r0 = r2.a
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
