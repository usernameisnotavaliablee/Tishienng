package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class p6 extends xyz.adscope.ad.g1 {
    protected android.hardware.SensorManager i;
    private final xyz.adscope.ad.p6.b j;
    private final xyz.adscope.ad.e4 k;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class b implements android.hardware.SensorEventListener {
        private long a;
        private xyz.adscope.ad.p6.c b;
        final /* synthetic */ xyz.adscope.ad.p6 c;

        private b(xyz.adscope.ad.p6 r3) {
                r2 = this;
                r2.c = r3
                r2.<init>()
                r0 = 0
                r2.a = r0
                return
        }

        /* synthetic */ b(xyz.adscope.ad.p6 r1, xyz.adscope.ad.p6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void a() {
                r1 = this;
                xyz.adscope.ad.p6 r0 = r1.c
                xyz.adscope.ad.p6$c r0 = r0.g()
                r1.b = r0
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.p6.b r0) {
                r0.a()
                return
        }

        private void b() {
                r1 = this;
                r0 = 0
                r1.b = r0
                return
        }

        static /* synthetic */ void b(xyz.adscope.ad.p6.b r0) {
                r0.b()
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor r1, int r2) {
                r0 = this;
                return
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent r8) {
                r7 = this;
                xyz.adscope.ad.p6$c r0 = r7.b
                if (r0 == 0) goto L21
                float[] r0 = r8.values
                if (r0 == 0) goto L21
                int r0 = r0.length
                r1 = 2
                if (r0 <= r1) goto L21
                long r0 = java.lang.System.currentTimeMillis()
                long r2 = r7.a
                long r2 = r0 - r2
                r4 = 200(0xc8, double:9.9E-322)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L21
                r7.a = r0
                xyz.adscope.ad.p6$c r0 = r7.b
                r0.a(r8)
            L21:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a(android.hardware.SensorEvent r1);
    }

    public p6(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            xyz.adscope.ad.p6$b r1 = new xyz.adscope.ad.p6$b
            r2 = 0
            r1.<init>(r0, r2)
            r0.j = r1
            r0.k = r2
            return
    }

    @Override // xyz.adscope.ad.g1, xyz.adscope.ad.i3
    public void a() {
            r0 = this;
            super.a()
            r0.i()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xyz.adscope.ad.g1
    public void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            super.a2(r1, r2)
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L1b
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            java.lang.String r2 = "sensor"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1
            r0.i = r1
        L1b:
            return
    }

    @Override // xyz.adscope.ad.g1, xyz.adscope.ad.i3
    public /* bridge */ /* synthetic */ void a(android.view.View r1, xyz.adscope.ad.c r2) {
            r0 = this;
            android.view.View r1 = (android.view.View) r1
            r0.a(r1, r2)
            return
    }

    @Override // xyz.adscope.ad.g1, xyz.adscope.ad.i3
    public void b() {
            r0 = this;
            super.b()
            r0.j()
            return
    }

    protected abstract xyz.adscope.ad.n3.a e();

    protected abstract android.hardware.Sensor f();

    protected abstract xyz.adscope.ad.p6.c g();

    protected void h() {
            r1 = this;
            xyz.adscope.ad.n3$a r0 = r1.e()
            r1.a(r0)
            return
    }

    public void i() {
            r4 = this;
            android.hardware.SensorManager r0 = r4.i
            if (r0 == 0) goto L1f
            android.hardware.Sensor r0 = r4.f()
            if (r0 == 0) goto L1f
            boolean r0 = r4.f
            if (r0 == 0) goto L1f
            xyz.adscope.ad.p6$b r0 = r4.j
            xyz.adscope.ad.p6.b.a(r0)
            android.hardware.SensorManager r0 = r4.i
            xyz.adscope.ad.p6$b r1 = r4.j
            android.hardware.Sensor r2 = r4.f()
            r3 = 2
            r0.registerListener(r1, r2, r3)
        L1f:
            return
    }

    public void j() {
            r2 = this;
            android.hardware.SensorManager r0 = r2.i
            if (r0 == 0) goto L10
            xyz.adscope.ad.p6$b r0 = r2.j
            xyz.adscope.ad.p6.b.b(r0)
            android.hardware.SensorManager r0 = r2.i
            xyz.adscope.ad.p6$b r1 = r2.j
            r0.unregisterListener(r1)
        L10:
            return
    }
}
