package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class s {
    private byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f716b;

    public s() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72} // fill-array
            r1.a = r0
            r0 = 32
            int[] r0 = new int[r0]
            r0 = {x009a: FILL_ARRAY_DATA , data: [462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257} // fill-array
            r1.f716b = r0
            return
    }

    private static int a(char r1) {
            java.lang.String r0 = "0123456789abcdef"
            int r1 = r0.indexOf(r1)
            byte r1 = (byte) r1
            return r1
    }

    private int a(int r4) {
            r3 = this;
            byte[] r0 = r3.a
            int r1 = r4 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            int r2 = r4 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = r4 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r1 = r1 | r2
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 | r1
            return r4
    }

    private int a(int r2, int r3) {
            r1 = this;
            int r0 = r2 << r3
            int r3 = 32 - r3
            int r2 = r2 >>> r3
            r2 = r2 | r0
            return r2
    }

    private static void a(byte[] r3, byte[] r4) {
            r0 = 0
        L1:
            int r1 = r3.length
            if (r0 >= r1) goto Lf
            r1 = r3[r0]
            r2 = r4[r0]
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    public static byte[] a(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            java.lang.String r5 = r5.toLowerCase()
            char[] r5 = r5.toCharArray()
            r2 = 0
        L11:
            if (r2 >= r0) goto L2c
            int r3 = r2 * 2
            char r4 = r5[r3]
            int r4 = a(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5[r3]
            int r3 = a(r3)
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L2c:
            return r1
    }

    private int[] a(byte[] r7) {
            r6 = this;
            r0 = 4
            int[] r1 = new int[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L2c
            int r3 = r2 * 4
            r4 = r7[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            int r5 = r3 + 1
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r4 = r4 | r5
            int r5 = r3 + 2
            r5 = r7[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            int r3 = r3 + 3
            r3 = r7[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L2c:
            return r1
    }

    private int b(int r3) {
            r2 = this;
            r0 = 2
            int r0 = r2.a(r3, r0)
            r0 = r0 ^ r3
            r1 = 10
            int r1 = r2.a(r3, r1)
            r0 = r0 ^ r1
            r1 = 18
            int r1 = r2.a(r3, r1)
            r0 = r0 ^ r1
            r1 = 24
            int r3 = r2.a(r3, r1)
            r3 = r3 ^ r0
            return r3
    }

    private static byte[] b(byte[] r5) {
            int r0 = r5.length
            int r0 = r0 % 16
            int r0 = 16 - r0
            int r1 = r5.length
            int r1 = r1 + r0
            byte[] r1 = java.util.Arrays.copyOf(r5, r1)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L16
            int r3 = r5.length
            int r3 = r3 + r2
            byte r4 = (byte) r0
            r1[r3] = r4
            int r2 = r2 + 1
            goto Lc
        L16:
            return r1
    }

    private int c(int r3) {
            r2 = this;
            r0 = 13
            int r0 = r2.a(r3, r0)
            r0 = r0 ^ r3
            r1 = 23
            int r3 = r2.a(r3, r1)
            r3 = r3 ^ r0
            return r3
    }

    private static byte[] c(byte[] r3) {
            int r0 = r3.length
            int r0 = r0 + (-1)
            r0 = r3[r0]
            int r1 = r3.length
            int r1 = r1 - r0
            byte[] r0 = new byte[r1]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            return r0
    }

    public void a(byte[] r10, byte[] r11, int[] r12) {
            r9 = this;
            int[] r10 = r9.a(r10)
            r0 = 0
            r1 = 0
        L6:
            r2 = 32
            r3 = 3
            if (r1 >= r2) goto L70
            r2 = r10[r0]
            r4 = 1
            r5 = r10[r4]
            r6 = 2
            r7 = r10[r6]
            r5 = r5 ^ r7
            r7 = r10[r3]
            r5 = r5 ^ r7
            r7 = r12[r1]
            r5 = r5 ^ r7
            int r5 = r9.a(r5)
            int r5 = r9.b(r5)
            r2 = r2 ^ r5
            r10[r0] = r2
            r5 = r10[r4]
            r7 = r10[r6]
            r8 = r10[r3]
            r7 = r7 ^ r8
            r2 = r2 ^ r7
            int r7 = r1 + 1
            r7 = r12[r7]
            r2 = r2 ^ r7
            int r2 = r9.a(r2)
            int r2 = r9.b(r2)
            r2 = r2 ^ r5
            r10[r4] = r2
            r5 = r10[r6]
            r7 = r10[r3]
            r8 = r10[r0]
            r7 = r7 ^ r8
            r2 = r2 ^ r7
            int r7 = r1 + 2
            r7 = r12[r7]
            r2 = r2 ^ r7
            int r2 = r9.a(r2)
            int r2 = r9.b(r2)
            r2 = r2 ^ r5
            r10[r6] = r2
            r5 = r10[r3]
            r6 = r10[r0]
            r4 = r10[r4]
            r4 = r4 ^ r6
            r2 = r2 ^ r4
            int r4 = r1 + 3
            r4 = r12[r4]
            r2 = r2 ^ r4
            int r2 = r9.a(r2)
            int r2 = r9.b(r2)
            r2 = r2 ^ r5
            r10[r3] = r2
            int r1 = r1 + 4
            goto L6
        L70:
            r12 = 16
            if (r0 >= r12) goto L9d
            int r12 = r0 / 4
            int r12 = 3 - r12
            r12 = r10[r12]
            int r1 = r12 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r11[r0] = r1
            int r1 = r0 + 1
            int r2 = r12 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r1] = r2
            int r1 = r0 + 2
            int r2 = r12 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r1] = r2
            int r1 = r0 + 3
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12
            r11[r1] = r12
            int r0 = r0 + 4
            goto L70
        L9d:
            return
    }

    public byte[] a(byte[] r5, java.lang.String r6) {
            r4 = this;
            byte[] r0 = a(r6)
            r1 = 0
            r2 = 16
            java.lang.String r1 = r6.substring(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "seed="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r2 = "SM4"
            cn.jiguang.w.f.c(r2, r6)
            java.lang.String r6 = "utf-8"
            byte[] r6 = r1.getBytes(r6)
            byte[] r5 = r4.a(r5, r0, r6)
            return r5
    }

    public byte[] a(byte[] r8, byte[] r9, byte[] r10) {
            r7 = this;
            if (r8 == 0) goto L44
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L44
        L6:
            if (r9 == 0) goto L3c
            int r0 = r9.length
            r1 = 16
            if (r0 != r1) goto L3c
            if (r10 == 0) goto L13
            int r0 = r10.length
            if (r0 == r1) goto L13
            r10 = 0
        L13:
            byte[] r8 = b(r8)
            r0 = 0
            int[] r9 = r7.a(r9, r0)
            byte[] r2 = new byte[r1]
            int r3 = r8.length
            byte[] r3 = new byte[r3]
            r4 = 0
        L22:
            int r5 = r4 + 16
            int r6 = r8.length
            if (r5 > r6) goto L3b
            java.lang.System.arraycopy(r8, r4, r2, r0, r1)
            if (r10 == 0) goto L30
            a(r2, r10)
            goto L32
        L30:
            byte[] r10 = new byte[r1]
        L32:
            r7.a(r2, r10, r9)
            int r6 = r10.length
            java.lang.System.arraycopy(r10, r0, r3, r4, r6)
            r4 = r5
            goto L22
        L3b:
            return r3
        L3c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "key's length should be 16"
            r8.<init>(r9)
            throw r8
        L44:
            return r8
    }

    public int[] a(byte[] r12, boolean r13) {
            r11 = this;
            int[] r12 = r11.a(r12)
            r0 = 0
            r1 = r12[r0]
            r2 = -1548633402(0xffffffffa3b1bac6, float:-1.926948E-17)
            r1 = r1 ^ r2
            r12[r0] = r1
            r1 = 1
            r2 = r12[r1]
            r3 = 1453994832(0x56aa3350, float:9.356868E13)
            r2 = r2 ^ r3
            r12[r1] = r2
            r2 = 2
            r3 = r12[r2]
            r4 = 1736282519(0x677d9197, float:1.1974444E24)
            r3 = r3 ^ r4
            r12[r2] = r3
            r3 = 3
            r4 = r12[r3]
            r5 = -1301273892(0xffffffffb27022dc, float:-1.3977765E-8)
            r4 = r4 ^ r5
            r12[r3] = r4
            r4 = 32
            int[] r5 = new int[r4]
            r6 = 0
        L2d:
            if (r6 >= r4) goto La8
            r7 = r12[r0]
            r8 = r12[r1]
            r9 = r12[r2]
            r8 = r8 ^ r9
            r9 = r12[r3]
            r8 = r8 ^ r9
            int[] r9 = r11.f716b
            r9 = r9[r6]
            r8 = r8 ^ r9
            int r8 = r11.a(r8)
            int r8 = r11.c(r8)
            r7 = r7 ^ r8
            r12[r0] = r7
            r5[r6] = r7
            int r7 = r6 + 1
            r8 = r12[r1]
            r9 = r12[r2]
            r10 = r12[r3]
            r9 = r9 ^ r10
            r10 = r12[r0]
            r9 = r9 ^ r10
            int[] r10 = r11.f716b
            r10 = r10[r7]
            r9 = r9 ^ r10
            int r9 = r11.a(r9)
            int r9 = r11.c(r9)
            r8 = r8 ^ r9
            r12[r1] = r8
            r5[r7] = r8
            int r7 = r6 + 2
            r8 = r12[r2]
            r9 = r12[r3]
            r10 = r12[r0]
            r9 = r9 ^ r10
            r10 = r12[r1]
            r9 = r9 ^ r10
            int[] r10 = r11.f716b
            r10 = r10[r7]
            r9 = r9 ^ r10
            int r9 = r11.a(r9)
            int r9 = r11.c(r9)
            r8 = r8 ^ r9
            r12[r2] = r8
            r5[r7] = r8
            int r7 = r6 + 3
            r8 = r12[r3]
            r9 = r12[r0]
            r10 = r12[r1]
            r9 = r9 ^ r10
            r10 = r12[r2]
            r9 = r9 ^ r10
            int[] r10 = r11.f716b
            r10 = r10[r7]
            r9 = r9 ^ r10
            int r9 = r11.a(r9)
            int r9 = r11.c(r9)
            r8 = r8 ^ r9
            r12[r3] = r8
            r5[r7] = r8
            int r6 = r6 + 4
            goto L2d
        La8:
            if (r13 == 0) goto Lbb
        Laa:
            r12 = 16
            if (r0 >= r12) goto Lbb
            r12 = r5[r0]
            int r13 = 31 - r0
            r1 = r5[r13]
            r5[r0] = r1
            r5[r13] = r12
            int r0 = r0 + 1
            goto Laa
        Lbb:
            return r5
    }

    public byte[] b(byte[] r4, java.lang.String r5) {
            r3 = this;
            byte[] r0 = a(r5)
            r1 = 0
            r2 = 16
            java.lang.String r5 = r5.substring(r1, r2)
            java.lang.String r1 = "utf-8"
            byte[] r5 = r5.getBytes(r1)
            byte[] r4 = r3.b(r4, r0, r5)
            return r4
    }

    public byte[] b(byte[] r9, byte[] r10, byte[] r11) {
            r8 = this;
            if (r9 == 0) goto L49
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L49
        L6:
            if (r10 == 0) goto L41
            int r0 = r10.length
            r1 = 16
            if (r0 != r1) goto L41
            if (r11 == 0) goto L13
            int r0 = r11.length
            if (r0 == r1) goto L13
            r11 = 0
        L13:
            r0 = 1
            int[] r10 = r8.a(r10, r0)
            byte[] r0 = new byte[r1]
            byte[] r2 = new byte[r1]
            int r3 = r9.length
            byte[] r3 = new byte[r3]
            r4 = 0
            r5 = 0
        L21:
            int r6 = r5 + 16
            int r7 = r9.length
            if (r6 > r7) goto L3c
            java.lang.System.arraycopy(r9, r5, r0, r4, r1)
            r8.a(r0, r2, r10)
            if (r11 == 0) goto L32
            a(r2, r11)
            goto L34
        L32:
            byte[] r11 = new byte[r1]
        L34:
            java.lang.System.arraycopy(r9, r5, r11, r4, r1)
            java.lang.System.arraycopy(r2, r4, r3, r5, r1)
            r5 = r6
            goto L21
        L3c:
            byte[] r9 = c(r3)
            return r9
        L41:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "key's length should be 16"
            r9.<init>(r10)
            throw r9
        L49:
            return r9
    }
}
