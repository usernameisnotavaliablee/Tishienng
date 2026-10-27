package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class BouncyConversion {
    static final /* synthetic */ boolean e = false;
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    static {
            return
    }

    public BouncyConversion(double r12, double r14) {
            r11 = this;
            r1 = r14
            r11.<init>()
            r11.c = r12
            r11.d = r1
            r7 = 4610334938539176755(0x3ffb333333333333, double:1.7)
            double r1 = r1 / r7
            r3 = 0
            r5 = 4626322717216342016(0x4034000000000000, double:20.0)
            r0 = r11
            double r1 = r0.j(r1, r3, r5)
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r9 = r0.k(r1, r3, r5)
            double r1 = r12 / r7
            r5 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r1 = r0.j(r1, r3, r5)
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r5 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r1 = r0.k(r1, r3, r5)
            r11.a = r1
            double r3 = r11.d(r1)
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            r1 = r9
            double r1 = r0.l(r1, r3, r5)
            r11.b = r1
            return
    }

    private double a(double r7) {
            r6 = this;
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r7, r0)
            r2 = 4559595583697369799(0x3f46f0068db8bac7, double:7.0E-4)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r7, r2)
            r4 = 4584592363069127000(0x3f9fbe76c8b43958, double:0.031)
            double r2 = r2 * r4
            double r0 = r0 - r2
            r2 = 4603939827068310651(0x3fe47ae147ae147b, double:0.64)
            double r7 = r7 * r2
            double r0 = r0 + r7
            r7 = 4608443426695681147(0x3ff47ae147ae147b, double:1.28)
            double r0 = r0 + r7
            return r0
    }

    private double b(double r9) {
            r8 = this;
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r9, r0)
            r2 = 4541618078676035234(0x3f0711947cfa26a2, double:4.4E-5)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r9, r2)
            r6 = 4573567551181324026(0x3f789374bc6a7efa, double:0.006)
            double r4 = r4 * r6
            double r0 = r0 - r4
            r4 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r9 = r9 * r4
            double r0 = r0 + r9
            double r0 = r0 + r2
            return r0
    }

    private double c(double r7) {
            r6 = this;
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r7, r0)
            r2 = 4512099887039661361(0x3e9e32f0ee144531, double:4.5E-7)
            double r0 = r0 * r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r7, r2)
            r4 = 4554759942676672531(0x3f35c209246bf013, double:3.32E-4)
            double r2 = r2 * r4
            double r0 = r0 - r2
            r2 = 4592432229300453560(0x3fbb98c7e28240b8, double:0.1078)
            double r7 = r7 * r2
            double r0 = r0 + r7
            r7 = 4618261273883348828(0x40175c28f5c28f5c, double:5.84)
            double r0 = r0 + r7
            return r0
    }

    private double d(double r6) {
            r5 = this;
            r0 = 4625759767262920704(0x4032000000000000, double:18.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            double r6 = r5.a(r6)
            return r6
        Lb:
            r2 = 4631389266797133824(0x4046000000000000, double:44.0)
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1a
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
            double r6 = r5.b(r6)
            return r6
        L1a:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L23
            double r6 = r5.c(r6)
            return r6
        L23:
            r6 = 0
            return r6
    }

    private double i(double r3, double r5, double r7) {
            r2 = this;
            double r7 = r7 * r3
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r3
            double r0 = r0 * r5
            double r7 = r7 + r0
            return r7
    }

    private double j(double r1, double r3, double r5) {
            r0 = this;
            double r1 = r1 - r3
            double r5 = r5 - r3
            double r1 = r1 / r5
            return r1
    }

    private double k(double r1, double r3, double r5) {
            r0 = this;
            double r5 = r5 - r3
            double r1 = r1 * r5
            double r3 = r3 + r1
            return r3
    }

    private double l(double r10, double r12, double r14) {
            r9 = this;
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r10
            double r10 = r10 * r10
            double r3 = r0 - r10
            r2 = r9
            r5 = r12
            r7 = r14
            double r10 = r2.i(r3, r5, r7)
            return r10
    }

    public double e() {
            r2 = this;
            double r0 = r2.d
            return r0
    }

    public double f() {
            r2 = this;
            double r0 = r2.b
            return r0
    }

    public double g() {
            r2 = this;
            double r0 = r2.a
            return r0
    }

    public double h() {
            r2 = this;
            double r0 = r2.c
            return r0
    }
}
