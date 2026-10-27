package cn.jiguang.commons.G;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(cn.jiguang.commons.bean.Peripheral r1, int r2) {
            r0 = r2 & 1048(0x418, float:1.469E-42)
            if (r0 == 0) goto L9
            r2 = 1
        L5:
            r1.e(r2)
            return
        L9:
            r0 = r2 & 1028(0x404, float:1.44E-42)
            if (r0 == 0) goto Lf
            r2 = 2
            goto L5
        Lf:
            r0 = r2 & 1032(0x408, float:1.446E-42)
            if (r0 == 0) goto L15
            r2 = 3
            goto L5
        L15:
            r0 = r2 & 1040(0x410, float:1.457E-42)
            if (r0 == 0) goto L1b
            r2 = 4
            goto L5
        L1b:
            r0 = r2 & 1052(0x41c, float:1.474E-42)
            if (r0 == 0) goto L21
            r2 = 5
            goto L5
        L21:
            r0 = r2 & 1056(0x420, float:1.48E-42)
            if (r0 == 0) goto L27
            r2 = 6
            goto L5
        L27:
            r2 = r2 & 1044(0x414, float:1.463E-42)
            if (r2 == 0) goto L2d
            r2 = 7
            goto L5
        L2d:
            r2 = 8
            goto L5
    }

    public static void a(cn.jiguang.commons.bean.Peripheral r8, android.bluetooth.BluetoothDevice r9, android.bluetooth.BluetoothClass r10) {
            java.lang.String r0 = "DeviceTypeProcessor"
            if (r8 == 0) goto La3
            if (r9 == 0) goto La3
            if (r10 != 0) goto La
            goto La3
        La:
            int r1 = r10.getMajorDeviceClass()
            int r10 = r10.getDeviceClass()
            java.lang.String r2 = r9.getAddress()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r8.i()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r2
            r2 = 1
            r6[r2] = r3
            r3 = 2
            r6[r3] = r4
            r4 = 3
            r6[r4] = r5
            java.lang.String r5 = "setting device type: address=%s, major=%d, class=%d, current_type=%d"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            cn.jiguang.commons.w.a.a(r0, r5)
            r5 = 256(0x100, float:3.59E-43)
            if (r1 == r5) goto L7e
            r5 = 512(0x200, float:7.17E-43)
            if (r1 == r5) goto L7a
            r5 = 1024(0x400, float:1.435E-42)
            if (r1 == r5) goto L76
            r5 = 1280(0x500, float:1.794E-42)
            if (r1 == r5) goto L72
            r5 = 1536(0x600, float:2.152E-42)
            if (r1 == r5) goto L6f
            r5 = 1792(0x700, float:2.511E-42)
            if (r1 == r5) goto L6c
            r5 = 2048(0x800, float:2.87E-42)
            if (r1 == r5) goto L69
            r5 = 2304(0x900, float:3.229E-42)
            if (r1 == r5) goto L66
            int r9 = r9.getType()
        L62:
            r8.e(r9)
            goto L81
        L66:
            r9 = 70
            goto L62
        L69:
            r9 = 60
            goto L62
        L6c:
            r9 = 50
            goto L62
        L6f:
            r9 = 40
            goto L62
        L72:
            d(r8, r10)
            goto L81
        L76:
            a(r8, r10)
            goto L81
        L7a:
            e(r8, r10)
            goto L81
        L7e:
            c(r8, r10)
        L81:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r8 = r8.i()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r7] = r9
            r1[r2] = r10
            r1[r3] = r8
            java.lang.String r8 = "device major class: %d, class: %d, type: %d"
            java.lang.String r8 = java.lang.String.format(r8, r1)
            cn.jiguang.commons.w.a.a(r0, r8)
            return
        La3:
            java.lang.String r8 = "setDeviceType: one of the parameters is null"
            cn.jiguang.commons.w.a.f(r0, r8)
            return
    }

    private static void c(cn.jiguang.commons.bean.Peripheral r1, int r2) {
            r0 = r2 & 268(0x10c, float:3.76E-43)
            if (r0 == 0) goto La
            r2 = 20
        L6:
            r1.e(r2)
            return
        La:
            r0 = r2 & 260(0x104, float:3.64E-43)
            if (r0 == 0) goto L11
            r2 = 21
            goto L6
        L11:
            r0 = r2 & 264(0x108, float:3.7E-43)
            if (r0 == 0) goto L18
            r2 = 22
            goto L6
        L18:
            r2 = r2 & 272(0x110, float:3.81E-43)
            if (r2 == 0) goto L1f
            r2 = 23
            goto L6
        L1f:
            r2 = 24
            goto L6
    }

    private static void d(cn.jiguang.commons.bean.Peripheral r1, int r2) {
            r0 = r2 & 1472(0x5c0, float:2.063E-42)
            if (r0 == 0) goto La
            r2 = 32
        L6:
            r1.e(r2)
            return
        La:
            r0 = r2 & 1344(0x540, float:1.883E-42)
            if (r0 == 0) goto L11
            r2 = 30
            goto L6
        L11:
            r0 = r2 & 1408(0x580, float:1.973E-42)
            if (r0 == 0) goto L18
            r2 = 31
            goto L6
        L18:
            r0 = r2 & 1028(0x404, float:1.44E-42)
            if (r0 == 0) goto L1f
            r2 = 33
            goto L6
        L1f:
            r2 = r2 & 1032(0x408, float:1.446E-42)
            if (r2 == 0) goto L26
            r2 = 35
            goto L6
        L26:
            r2 = 36
            goto L6
    }

    private static void e(cn.jiguang.commons.bean.Peripheral r1, int r2) {
            r0 = r2 & 524(0x20c, float:7.34E-43)
            if (r0 == 0) goto La
            r2 = 10
        L6:
            r1.e(r2)
            return
        La:
            r2 = r2 & 516(0x204, float:7.23E-43)
            if (r2 == 0) goto L11
            r2 = 11
            goto L6
        L11:
            r2 = 12
            goto L6
    }
}
