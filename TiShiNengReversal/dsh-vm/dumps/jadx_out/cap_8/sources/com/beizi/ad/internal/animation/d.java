package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d implements com.beizi.ad.internal.animation.f {

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f6631c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f6632d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final float[] f6633e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f6634f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final float[] f6635g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final float[] f6636h = null;

    /* renamed from: i, reason: collision with root package name */
    private static final float[] f6637i = null;

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f6638j = null;
    private android.view.animation.Animation a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.animation.Animation f6639b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.animation.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.animation.g[] r0 = com.beizi.ad.internal.animation.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.animation.d.AnonymousClass1.a = r0
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.animation.d.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.f6645b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.animation.d.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.f6646c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.animation.d.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.f6647d     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 4
            float[] r1 = new float[r0]
            r1 = {x003a: FILL_ARRAY_DATA , data: [0, 0, 1065353216, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6631c = r1
            float[] r1 = new float[r0]
            r1 = {x0046: FILL_ARRAY_DATA , data: [0, 0, -1082130432, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6632d = r1
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA , data: [-1082130432, 0, 0, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6633e = r1
            float[] r1 = new float[r0]
            r1 = {x005e: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6634f = r1
            float[] r1 = new float[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [0, 0, 0, -1082130432} // fill-array
            com.beizi.ad.internal.animation.d.f6635g = r1
            float[] r1 = new float[r0]
            r1 = {x0076: FILL_ARRAY_DATA , data: [0, 0, 0, 1065353216} // fill-array
            com.beizi.ad.internal.animation.d.f6636h = r1
            float[] r1 = new float[r0]
            r1 = {x0082: FILL_ARRAY_DATA , data: [0, 1065353216, 0, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6637i = r1
            float[] r0 = new float[r0]
            r0 = {x008e: FILL_ARRAY_DATA , data: [0, -1082130432, 0, 0} // fill-array
            com.beizi.ad.internal.animation.d.f6638j = r0
            return
    }

    public d(long r3, com.beizi.ad.internal.animation.g r5) {
            r2 = this;
            r2.<init>()
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            float[] r1 = r2.a(r5)
            android.view.animation.Animation r1 = r2.a(r1, r0, r3)
            r2.a = r1
            float[] r5 = r2.b(r5)
            android.view.animation.Animation r3 = r2.a(r5, r0, r3)
            r2.f6639b = r3
            return
    }

    private android.view.animation.Animation a(float[] r10, android.view.animation.Interpolator r11, long r12) {
            r9 = this;
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r1 = 0
            r2 = r10[r1]
            r1 = 1
            r4 = r10[r1]
            r1 = 2
            r6 = r10[r1]
            r1 = 3
            r8 = r10[r1]
            r1 = 2
            r3 = 2
            r5 = 2
            r7 = 2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.setInterpolator(r11)
            r0.setDuration(r12)
            return r0
    }

    private float[] a(com.beizi.ad.internal.animation.g r2) {
            r1 = this;
            int[] r0 = com.beizi.ad.internal.animation.d.AnonymousClass1.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L20
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 == r0) goto L1a
            r0 = 4
            if (r2 == r0) goto L17
            float[] r2 = com.beizi.ad.internal.animation.d.f6631c
            return r2
        L17:
            float[] r2 = com.beizi.ad.internal.animation.d.f6634f
            return r2
        L1a:
            float[] r2 = com.beizi.ad.internal.animation.d.f6633e
            return r2
        L1d:
            float[] r2 = com.beizi.ad.internal.animation.d.f6632d
            return r2
        L20:
            float[] r2 = com.beizi.ad.internal.animation.d.f6631c
            return r2
    }

    private float[] b(com.beizi.ad.internal.animation.g r2) {
            r1 = this;
            int[] r0 = com.beizi.ad.internal.animation.d.AnonymousClass1.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L20
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 == r0) goto L1a
            r0 = 4
            if (r2 == r0) goto L17
            float[] r2 = com.beizi.ad.internal.animation.d.f6635g
            return r2
        L17:
            float[] r2 = com.beizi.ad.internal.animation.d.f6638j
            return r2
        L1a:
            float[] r2 = com.beizi.ad.internal.animation.d.f6637i
            return r2
        L1d:
            float[] r2 = com.beizi.ad.internal.animation.d.f6636h
            return r2
        L20:
            float[] r2 = com.beizi.ad.internal.animation.d.f6635g
            return r2
    }

    @Override // com.beizi.ad.internal.animation.f
    public android.view.animation.Animation a() {
            r1 = this;
            android.view.animation.Animation r0 = r1.a
            return r0
    }

    @Override // com.beizi.ad.internal.animation.f
    public android.view.animation.Animation b() {
            r1 = this;
            android.view.animation.Animation r0 = r1.f6639b
            return r0
    }
}
