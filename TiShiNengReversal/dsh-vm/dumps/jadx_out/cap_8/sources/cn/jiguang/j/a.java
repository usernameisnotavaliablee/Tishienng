package cn.jiguang.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final java.math.BigInteger f1317d = null;
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f1318b;

    /* renamed from: c, reason: collision with root package name */
    private int f1319c;

    static {
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            r1 = 64
            java.math.BigInteger r0 = r0.shiftLeft(r1)
            cn.jiguang.j.a.f1317d = r0
            return
    }

    public a() {
            r1 = this;
            r0 = 32
            r1.<init>(r0)
            return
    }

    public a(int r1) {
            r0 = this;
            r0.<init>()
            byte[] r1 = new byte[r1]
            r0.a = r1
            r1 = 0
            r0.f1318b = r1
            r1 = -1
            r0.f1319c = r1
            return
    }

    private void a(long r6, int r8) {
            r5 = this;
            r0 = 1
            long r0 = r0 << r8
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 < 0) goto Lf
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto Le
            goto Lf
        Le:
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = " out of range for "
            r2.append(r6)
            r2.append(r8)
            java.lang.String r6 = " bit value max:"
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "JCommonPackager"
            cn.jiguang.w.f.i(r7, r6)
            return
    }

    private void b(int r5) {
            r4 = this;
            byte[] r0 = r4.a
            int r1 = r0.length
            int r2 = r4.f1318b
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

    public void a(int r6) {
            r5 = this;
            long r0 = (long) r6
            r2 = 16
            r5.a(r0, r2)
            r0 = 2
            r5.b(r0)
            byte[] r1 = r5.a
            int r2 = r5.f1318b
            int r3 = r2 + 1
            r5.f1318b = r3
            int r4 = r6 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r2 + r0
            r5.f1318b = r2
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r1[r3] = r6
            return
    }

    public void a(long r11) {
            r10 = this;
            r0 = 8
            r10.b(r0)
            byte[] r1 = r10.a
            int r2 = r10.f1318b
            int r3 = r2 + 1
            r10.f1318b = r3
            r4 = 56
            long r4 = r11 >>> r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r5 = (int) r4
            byte r4 = (byte) r5
            r1[r2] = r4
            int r4 = r2 + 2
            r10.f1318b = r4
            r5 = 48
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 3
            r10.f1318b = r3
            r5 = 40
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r2 + 4
            r10.f1318b = r4
            r5 = 32
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 5
            r10.f1318b = r3
            r5 = 24
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r2 + 6
            r10.f1318b = r4
            r5 = 16
            long r8 = r11 >>> r5
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r3] = r5
            int r3 = r2 + 7
            r10.f1318b = r3
            long r8 = r11 >>> r0
            long r8 = r8 & r6
            int r5 = (int) r8
            byte r5 = (byte) r5
            r1[r4] = r5
            int r2 = r2 + r0
            r10.f1318b = r2
            long r11 = r11 & r6
            int r12 = (int) r11
            byte r11 = (byte) r12
            r1[r3] = r11
            return
    }

    public void a(byte[] r3) {
            r2 = this;
            int r0 = r3.length
            r2.a(r0)
            r0 = 0
            int r1 = r3.length
            r2.a(r3, r0, r1)
            return
    }

    public void a(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.b(r5)
            byte[] r0 = r2.a
            int r1 = r2.f1318b
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.f1318b
            int r3 = r3 + r5
            r2.f1318b = r3
            return
    }

    public byte[] a() {
            r4 = this;
            int r0 = r4.f1318b
            byte[] r1 = new byte[r0]
            byte[] r2 = r4.a
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r1, r3, r0)
            return r1
    }
}
