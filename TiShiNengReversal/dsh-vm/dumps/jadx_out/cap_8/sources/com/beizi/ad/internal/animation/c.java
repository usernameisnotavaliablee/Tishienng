package com.beizi.ad.internal.animation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements com.beizi.ad.internal.animation.f {

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f6626c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final float[] f6627d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final float[] f6628e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f6629f = null;
    private android.view.animation.Animation a;

    /* renamed from: b, reason: collision with root package name */
    private android.view.animation.Animation f6630b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.animation.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = null;

        static {
                com.beizi.ad.internal.animation.g[] r0 = com.beizi.ad.internal.animation.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.beizi.ad.internal.animation.c.AnonymousClass1.a = r0
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.a     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.beizi.ad.internal.animation.c.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.f6645b     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.beizi.ad.internal.animation.c.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.beizi.ad.internal.animation.g r1 = com.beizi.ad.internal.animation.g.f6646c     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.beizi.ad.internal.animation.c.AnonymousClass1.a     // Catch: java.lang.NoSuchFieldError -> L33
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
            r1 = {x001e: FILL_ARRAY_DATA , data: [0, 0, 1065353216, 0} // fill-array
            com.beizi.ad.internal.animation.c.f6626c = r1
            float[] r1 = new float[r0]
            r1 = {x002a: FILL_ARRAY_DATA , data: [0, 0, -1082130432, 0} // fill-array
            com.beizi.ad.internal.animation.c.f6627d = r1
            float[] r1 = new float[r0]
            r1 = {x0036: FILL_ARRAY_DATA , data: [-1082130432, 0, 0, 0} // fill-array
            com.beizi.ad.internal.animation.c.f6628e = r1
            float[] r0 = new float[r0]
            r0 = {x0042: FILL_ARRAY_DATA , data: [1065353216, 0, 0, 0} // fill-array
            com.beizi.ad.internal.animation.c.f6629f = r0
            return
    }

    public c(long r3, com.beizi.ad.internal.animation.g r5) {
            r2 = this;
            r2.<init>()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            float[] r1 = r2.a(r5)
            r2.a(r1, r0, r3)
            float[] r5 = r2.a(r5)
            r2.b(r5, r0, r3)
            return
    }

    private void a(float[] r11, android.view.animation.Interpolator r12, long r13) {
            r10 = this;
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r1 = 0
            r2 = r11[r1]
            r9 = 1
            r4 = r11[r9]
            r1 = 2
            r6 = r11[r1]
            r1 = 3
            r8 = r11[r1]
            r1 = 2
            r3 = 2
            r5 = 2
            r7 = 2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a = r0
            r0.setInterpolator(r12)
            android.view.animation.Animation r11 = r10.a
            r11.setFillAfter(r9)
            android.view.animation.Animation r11 = r10.a
            r11.setDuration(r13)
            return
    }

    private float[] a(com.beizi.ad.internal.animation.g r2) {
            r1 = this;
            int[] r0 = com.beizi.ad.internal.animation.c.AnonymousClass1.a
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
            float[] r2 = com.beizi.ad.internal.animation.c.f6626c
            return r2
        L17:
            float[] r2 = com.beizi.ad.internal.animation.c.f6629f
            return r2
        L1a:
            float[] r2 = com.beizi.ad.internal.animation.c.f6628e
            return r2
        L1d:
            float[] r2 = com.beizi.ad.internal.animation.c.f6627d
            return r2
        L20:
            float[] r2 = com.beizi.ad.internal.animation.c.f6626c
            return r2
    }

    private void b(float[] r10, android.view.animation.Interpolator r11, long r12) {
            r9 = this;
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r7 = 2
            r8 = 0
            r1 = 2
            r2 = 0
            r3 = 2
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 2
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6630b = r0
            r10 = 1
            r0.setFillAfter(r10)
            android.view.animation.Animation r10 = r9.f6630b
            r10.setDuration(r12)
            android.view.animation.Animation r10 = r9.f6630b
            r10.setInterpolator(r11)
            return
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
            android.view.animation.Animation r0 = r1.f6630b
            return r0
    }
}
