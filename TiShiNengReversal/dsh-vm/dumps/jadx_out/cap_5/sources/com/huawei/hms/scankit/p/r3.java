package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r3 {
    public static boolean A = false;
    public static boolean a = true;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = true;
    public static boolean g = false;
    public static boolean h = false;
    public static float i = -1.0f;
    public static int j;
    public static int k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;
    public static boolean t;
    public static boolean u;
    public static boolean[] v;
    public static java.util.Stack<java.lang.Integer> w;
    public static boolean x;
    public static float[] y;
    public static int z;

    static {
            r0 = 8
            boolean[] r0 = new boolean[r0]
            com.huawei.hms.scankit.p.r3.v = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            com.huawei.hms.scankit.p.r3.w = r0
            r0 = 1
            com.huawei.hms.scankit.p.r3.x = r0
            r0 = 4
            float[] r0 = new float[r0]
            com.huawei.hms.scankit.p.r3.y = r0
            r0 = 0
            com.huawei.hms.scankit.p.r3.z = r0
            com.huawei.hms.scankit.p.r3.A = r0
            return
    }

    public r3() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a() {
            r0 = 0
            com.huawei.hms.scankit.p.r3.h = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.huawei.hms.scankit.p.r3.i = r1
            com.huawei.hms.scankit.p.r3.j = r0
            com.huawei.hms.scankit.p.r3.p = r0
            com.huawei.hms.scankit.p.r3.q = r0
            com.huawei.hms.scankit.p.r3.r = r0
            com.huawei.hms.scankit.p.r3.t = r0
            com.huawei.hms.scankit.p.r3.m = r0
            com.huawei.hms.scankit.p.r3.n = r0
            com.huawei.hms.scankit.p.r3.o = r0
            com.huawei.hms.scankit.p.r3.s = r0
            r1 = 8
            boolean[] r1 = new boolean[r1]
            com.huawei.hms.scankit.p.r3.v = r1
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            com.huawei.hms.scankit.p.r3.w = r1
            r1 = 1
            com.huawei.hms.scankit.p.r3.x = r1
            com.huawei.hms.scankit.p.r3.e = r0
            com.huawei.hms.scankit.p.r3.d = r0
            return
    }

    public static void a(int r3) {
            int r0 = r3 % 2
            r1 = 1
            if (r0 != r1) goto L7
            com.huawei.hms.scankit.p.r3.p = r1
        L7:
            int r0 = r3 % 3
            r2 = 2
            if (r0 != r2) goto Le
            com.huawei.hms.scankit.p.r3.q = r1
        Le:
            int r3 = r3 % 5
            r0 = 4
            if (r3 != r0) goto L15
            com.huawei.hms.scankit.p.r3.r = r1
        L15:
            return
    }

    public static void a(com.huawei.hms.scankit.p.x6 r2) {
            a()
            boolean r0 = r2.e
            com.huawei.hms.scankit.p.r3.c = r0
            boolean r1 = r2.g
            com.huawei.hms.scankit.p.r3.x = r1
            if (r0 != 0) goto L13
            int r2 = r2.f
            a(r2)
            return
        L13:
            r2 = 1
            a(r2)
            return
    }
}
