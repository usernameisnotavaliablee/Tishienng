package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class a2 {
    protected final java.lang.String a;
    protected final int b;
    protected final float[] c;
    protected final long d;
    protected final xyz.adscope.ad.c e;
    protected final xyz.adscope.ad.r5 f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class a<T extends xyz.adscope.ad.a2> {
        private java.lang.String a;
        private int b;
        private float[] c;
        private long d;
        private java.lang.String e;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 2
                float[] r0 = new float[r0]
                r0 = {x000c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
                r1.c = r0
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.ad.a2.a r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ int b(xyz.adscope.ad.a2.a r0) {
                int r0 = r0.b
                return r0
        }

        static /* synthetic */ float[] c(xyz.adscope.ad.a2.a r0) {
                float[] r0 = r0.c
                return r0
        }

        static /* synthetic */ long d(xyz.adscope.ad.a2.a r2) {
                long r0 = r2.d
                return r0
        }

        static /* synthetic */ java.lang.String e(xyz.adscope.ad.a2.a r0) {
                java.lang.String r0 = r0.e
                return r0
        }

        protected abstract xyz.adscope.ad.c a();

        public T build(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                xyz.adscope.ad.a2 r1 = r0.f(r0)
                return r1
        }

        protected abstract T f(xyz.adscope.ad.a2.a<T> r1);

        protected xyz.adscope.ad.a2.a<T> setAdCount(int r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        protected xyz.adscope.ad.a2.a<T> setExpressSizePixel(float r3, float r4) {
                r2 = this;
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r3
                r3 = 1
                r0[r3] = r4
                r2.c = r0
                return r2
        }

        public xyz.adscope.ad.a2.a<T> setS2SAdImpl(java.lang.String r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        protected xyz.adscope.ad.a2.a<T> setTimeoutMillion(long r1) {
                r0 = this;
                r0.d = r1
                return r0
        }
    }

    protected a2(xyz.adscope.ad.a2.a<?> r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = xyz.adscope.ad.a2.a.a(r3)
            r2.a = r0
            int r0 = xyz.adscope.ad.a2.a.b(r3)
            r2.b = r0
            float[] r0 = xyz.adscope.ad.a2.a.c(r3)
            r2.c = r0
            long r0 = xyz.adscope.ad.a2.a.d(r3)
            r2.d = r0
            xyz.adscope.ad.c r0 = r3.a()
            r2.e = r0
            java.lang.String r0 = xyz.adscope.ad.a2.a.e(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L37
            xyz.adscope.ad.r5 r0 = new xyz.adscope.ad.r5
            java.lang.String r3 = xyz.adscope.ad.a2.a.e(r3)
            r0.<init>(r3)
            r2.f = r0
            return
        L37:
            r3 = 0
            r2.f = r3
            return
    }

    public int getAdCount() {
            r1 = this;
            int r0 = r1.b
            if (r0 <= 0) goto L5
            return r0
        L5:
            r0 = 1
            return r0
    }

    public xyz.adscope.ad.c getAdType() {
            r1 = this;
            xyz.adscope.ad.c r0 = r1.e
            return r0
    }

    public java.lang.String getApiKey() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            return r0
    }

    public float[] getExpressViewSizePixel() {
            r1 = this;
            float[] r0 = r1.c
            return r0
    }

    public xyz.adscope.ad.r5 getS2SAdImpl() {
            r1 = this;
            xyz.adscope.ad.r5 r0 = r1.f
            return r0
    }

    public java.lang.String getSpaceID() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long getTimeoutMillion() {
            r2 = this;
            long r0 = r2.d
            return r0
    }
}
