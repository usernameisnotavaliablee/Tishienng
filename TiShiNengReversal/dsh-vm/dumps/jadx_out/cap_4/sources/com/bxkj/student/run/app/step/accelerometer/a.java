package com.bxkj.student.run.app.step.accelerometer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bxkj.student.run.app.step.accelerometer.b {
    private int a;
    private int b;
    private com.bxkj.student.run.app.step.accelerometer.d c;
    private long d;
    private long e;
    private com.bxkj.student.run.app.step.accelerometer.c f;
    private boolean g;

    public a() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r3.b = r0
            r1 = 0
            r3.d = r1
            r3.e = r1
            r3.g = r0
            com.bxkj.student.run.app.step.accelerometer.c r0 = new com.bxkj.student.run.app.step.accelerometer.c
            r0.<init>()
            r3.f = r0
            r0.d(r3)
            return
    }

    @Override // com.bxkj.student.run.app.step.accelerometer.b
    public void a() {
            r6 = this;
            long r0 = r6.e
            r6.d = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.e = r0
            long r2 = r6.d
            long r0 = r0 - r2
            r2 = 3000(0xbb8, double:1.482E-320)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L3d
            int r0 = r6.a
            r1 = 9
            if (r0 >= r1) goto L1e
            int r0 = r0 + r4
            r6.a = r0
            return
        L1e:
            if (r0 != r1) goto L30
            int r0 = r0 + r4
            r6.a = r0
            boolean r1 = r6.g
            if (r1 != 0) goto L2c
            int r1 = r6.b
            int r1 = r1 + r0
            r6.b = r1
        L2c:
            r6.d()
            return
        L30:
            boolean r0 = r6.g
            if (r0 != 0) goto L39
            int r0 = r6.b
            int r0 = r0 + r4
            r6.b = r0
        L39:
            r6.d()
            return
        L3d:
            r6.a = r4
            return
    }

    public com.bxkj.student.run.app.step.accelerometer.c b() {
            r1 = this;
            com.bxkj.student.run.app.step.accelerometer.c r0 = r1.f
            return r0
    }

    public void c(com.bxkj.student.run.app.step.accelerometer.d r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void d() {
            r2 = this;
            com.bxkj.student.run.app.step.accelerometer.d r0 = r2.c
            if (r0 == 0) goto L9
            int r1 = r2.b
            r0.a(r1)
        L9:
            return
    }

    public com.bxkj.student.run.app.step.accelerometer.a e(boolean r1) {
            r0 = this;
            r0.g = r1
            return r0
    }

    public void f(int r3) {
            r2 = this;
            r2.b = r3
            r3 = 0
            r2.a = r3
            r0 = 0
            r2.d = r0
            r2.e = r0
            r2.d()
            return
    }
}
