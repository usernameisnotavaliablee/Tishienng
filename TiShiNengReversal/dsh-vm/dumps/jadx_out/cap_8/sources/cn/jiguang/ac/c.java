package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f334b;

    /* renamed from: c, reason: collision with root package name */
    private int f335c;

    public c() {
            r1 = this;
            r0 = 32
            r1.<init>(r0)
            return
    }

    public c(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.a = r1
            r1 = 0
            r0.f334b = r1
            r1 = -1
            r0.f335c = r1
            return
    }

    private void a(long r6, int r8) {
            r5 = this;
            r0 = 1
            long r0 = r0 << r8
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Le
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Le
            return
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = " out of range for "
            r1.append(r6)
            r1.append(r8)
            java.lang.String r6 = " bit value"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    private void d(int r5) {
            r4 = this;
            byte[] r0 = r4.a
            int r1 = r0.length
            int r2 = r4.f334b
            int r1 = r1 - r2
            if (r1 < r5) goto L9
            return
        L9:
            int r1 = r0.length
            int r1 = r1 * 2
            int r3 = r2 + r5
            if (r1 >= r3) goto L12
            int r1 = r2 + r5
        L12:
            byte[] r5 = new byte[r1]
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r5, r1, r2)
            r4.a = r5
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f334b
            return r0
    }

    public void a(int r2) {
            r1 = this;
            int r0 = r1.f334b
            if (r2 > r0) goto L7
            r1.f334b = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot jump past end of data"
            r2.<init>(r0)
            throw r2
    }

    public void a(int r4, int r5) {
            r3 = this;
            long r0 = (long) r4
            r2 = 16
            r3.a(r0, r2)
            int r0 = r3.f334b
            int r0 = r0 + (-2)
            if (r5 > r0) goto L1d
            byte[] r0 = r3.a
            int r1 = r5 + 1
            int r2 = r4 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r0[r5] = r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "cannot write past end of data"
            r4.<init>(r5)
            throw r4
    }

    public void a(long r11) {
            r10 = this;
            r0 = 32
            r10.a(r11, r0)
            r0 = 4
            r10.d(r0)
            byte[] r1 = r10.a
            int r2 = r10.f334b
            int r3 = r2 + 1
            r10.f334b = r3
            r4 = 24
            long r4 = r11 >>> r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r1[r2] = r4
            int r4 = r2 + 2
            r10.f334b = r4
            r5 = 16
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 3
            r10.f334b = r3
            r5 = 8
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r2 = r2 + r0
            r10.f334b = r2
            long r11 = r11 & r6
            int r12 = (int) r11
            byte r11 = (byte) r12
            r1[r3] = r11
            return
    }

    public void a(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.a(r3, r0, r1)
            return
    }

    public void a(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.d(r5)
            byte[] r0 = r2.a
            int r1 = r2.f334b
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.f334b
            int r3 = r3 + r5
            r2.f334b = r3
            return
    }

    public void b(int r4) {
            r3 = this;
            long r0 = (long) r4
            r2 = 8
            r3.a(r0, r2)
            r0 = 1
            r3.d(r0)
            byte[] r0 = r3.a
            int r1 = r3.f334b
            int r2 = r1 + 1
            r3.f334b = r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r0[r1] = r4
            return
    }

    public byte[] b() {
            r4 = this;
            int r0 = r4.f334b
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.a
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }

    public void c(int r6) {
            r5 = this;
            long r0 = (long) r6
            r2 = 16
            r5.a(r0, r2)
            r0 = 2
            r5.d(r0)
            byte[] r1 = r5.a
            int r2 = r5.f334b
            int r3 = r2 + 1
            r5.f334b = r3
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r2 + r0
            r5.f334b = r2
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            return
    }
}
