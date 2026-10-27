package com.bumptech.glide.request;

import com.bumptech.glide.request.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public abstract class a<T extends com.bumptech.glide.request.a<T>> implements java.lang.Cloneable {
    private static final int A = -1;
    private static final int B = 2;
    private static final int C = 4;
    private static final int D = 8;
    private static final int E = 16;
    private static final int F = 32;
    private static final int G = 64;
    private static final int H = 128;
    private static final int I = 256;
    private static final int J = 512;
    private static final int K = 1024;
    private static final int L = 2048;
    private static final int M = 4096;
    private static final int N = 8192;
    private static final int O = 16384;
    private static final int P = 32768;
    private static final int Q = 65536;
    private static final int R = 131072;
    private static final int S = 262144;
    private static final int T = 524288;
    private static final int U = 1048576;
    private int a;
    private float b;

    @androidx.annotation.NonNull
    private com.bumptech.glide.load.engine.j c;

    @androidx.annotation.NonNull
    private com.bumptech.glide.Priority d;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable e;
    private int f;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable g;
    private int h;
    private boolean i;
    private int j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.annotation.NonNull
    private com.bumptech.glide.load.c f514l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f515m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f516n;

    /* renamed from: o, reason: collision with root package name */
    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable f517o;

    /* renamed from: p, reason: collision with root package name */
    private int f518p;

    /* renamed from: q, reason: collision with root package name */
    @androidx.annotation.NonNull
    private com.bumptech.glide.load.f f519q;

    /* renamed from: r, reason: collision with root package name */
    @androidx.annotation.NonNull
    private java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> f520r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.NonNull
    private java.lang.Class<?> f521s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f522t;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.Nullable
    private android.content.res.Resources.Theme f523u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f524v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f525w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f526x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f527y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f528z;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.b = r0
            com.bumptech.glide.load.engine.j r0 = com.bumptech.glide.load.engine.j.e
            r2.c = r0
            com.bumptech.glide.Priority r0 = com.bumptech.glide.Priority.NORMAL
            r2.d = r0
            r0 = 1
            r2.i = r0
            r1 = -1
            r2.j = r1
            r2.k = r1
            com.bumptech.glide.signature.c r1 = com.bumptech.glide.signature.c.c()
            r2.f514l = r1
            r2.f516n = r0
            com.bumptech.glide.load.f r1 = new com.bumptech.glide.load.f
            r1.<init>()
            r2.f519q = r1
            com.bumptech.glide.util.CachedHashCodeArrayMap r1 = new com.bumptech.glide.util.CachedHashCodeArrayMap
            r1.<init>()
            r2.f520r = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2.f521s = r1
            r2.f527y = r0
            return
    }

    @androidx.annotation.NonNull
    private T B0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r3) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.C0(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    private T C0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1, @androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L7
            com.bumptech.glide.request.a r1 = r0.N0(r1, r2)
            goto Lb
        L7:
            com.bumptech.glide.request.a r1 = r0.u0(r1, r2)
        Lb:
            r2 = 1
            r1.f527y = r2
            return r1
    }

    private T D0() {
            r0 = this;
            return r0
    }

    private boolean f0(int r2) {
            r1 = this;
            int r0 = r1.a
            boolean r2 = g0(r0, r2)
            return r2
    }

    private static boolean g0(int r0, int r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    private T s0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r3) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.C0(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T A(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.A(r2)
            return r2
        Ld:
            r1.e = r2
            int r2 = r1.a
            r2 = r2 | 16
            r0 = 0
            r1.f = r0
            r2 = r2 & (-33)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T A0(@androidx.annotation.NonNull com.bumptech.glide.Priority r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.A0(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.Priority r2 = (com.bumptech.glide.Priority) r2
            r1.d = r2
            int r2 = r1.a
            r2 = r2 | 8
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T B(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.B(r2)
            return r2
        Ld:
            r1.f518p = r2
            int r2 = r1.a
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            r0 = 0
            r1.f517o = r0
            r2 = r2 & (-8193(0xffffffffffffdfff, float:NaN))
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T C(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.C(r2)
            return r2
        Ld:
            r1.f517o = r2
            int r2 = r1.a
            r2 = r2 | 8192(0x2000, float:1.148E-41)
            r0 = 0
            r1.f518p = r0
            r2 = r2 & (-16385(0xffffffffffffbfff, float:NaN))
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T D() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
            com.bumptech.glide.load.resource.bitmap.y r1 = new com.bumptech.glide.load.resource.bitmap.y
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.B0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T E(@androidx.annotation.NonNull com.bumptech.glide.load.DecodeFormat r3) {
            r2 = this;
            com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r0 = com.bumptech.glide.load.resource.bitmap.u.g
            com.bumptech.glide.request.a r0 = r2.F0(r0, r3)
            com.bumptech.glide.load.e<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.gif.h.a
            com.bumptech.glide.request.a r3 = r0.F0(r1, r3)
            return r3
    }

    @androidx.annotation.NonNull
    protected final T E0() {
            r2 = this;
            boolean r0 = r2.f522t
            if (r0 != 0) goto L9
            com.bumptech.glide.request.a r0 = r2.D0()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot modify locked T, consider clone()"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T F(@androidx.annotation.IntRange(from = 0) long r2) {
            r1 = this;
            com.bumptech.glide.load.e<java.lang.Long> r0 = com.bumptech.glide.load.resource.bitmap.o0.g
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.bumptech.glide.request.a r2 = r1.F0(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T F0(@androidx.annotation.NonNull com.bumptech.glide.load.e<Y> r2, @androidx.annotation.NonNull Y r3) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.F0(r2, r3)
            return r2
        Ld:
            com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.f r0 = r1.f519q
            r0.e(r2, r3)
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.engine.j G() {
            r1 = this;
            com.bumptech.glide.load.engine.j r0 = r1.c
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T G0(@androidx.annotation.NonNull com.bumptech.glide.load.c r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.G0(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.c r2 = (com.bumptech.glide.load.c) r2
            r1.f514l = r2
            int r2 = r1.a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    public final int H() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T H0(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.H0(r2)
            return r2
        Ld:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L25
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L25
            r1.b = r2
            int r2 = r1.a
            r2 = r2 | 2
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sizeMultiplier must be between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable I() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T I0(boolean r3) {
            r2 = this;
            boolean r0 = r2.f524v
            r1 = 1
            if (r0 == 0) goto Le
            com.bumptech.glide.request.a r3 = r2.q()
            com.bumptech.glide.request.a r3 = r3.I0(r1)
            return r3
        Le:
            r3 = r3 ^ r1
            r2.i = r3
            int r3 = r2.a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.a = r3
            com.bumptech.glide.request.a r3 = r2.E0()
            return r3
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable J() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f517o
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T J0(@androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.J0(r2)
            return r2
        Ld:
            r1.f523u = r2
            int r2 = r1.a
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r0
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    public final int K() {
            r1 = this;
            int r0 = r1.f518p
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T K0(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            com.bumptech.glide.load.e<java.lang.Integer> r0 = com.bumptech.glide.load.model.stream.b.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.request.a r2 = r1.F0(r0, r2)
            return r2
    }

    public final boolean L() {
            r1 = this;
            boolean r0 = r1.f526x
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T L0(@androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r2) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.M0(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.f M() {
            r1 = this;
            com.bumptech.glide.load.f r0 = r1.f519q
            return r0
    }

    @androidx.annotation.NonNull
    T M0(@androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r2.q()
            com.bumptech.glide.request.a r3 = r0.M0(r3, r4)
            return r3
        Ld:
            com.bumptech.glide.load.resource.bitmap.w r0 = new com.bumptech.glide.load.resource.bitmap.w
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.P0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.P0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            com.bumptech.glide.load.i r0 = r0.c()
            r2.P0(r1, r0, r4)
            com.bumptech.glide.load.resource.gif.e r0 = new com.bumptech.glide.load.resource.gif.e
            r0.<init>(r3)
            java.lang.Class<com.bumptech.glide.load.resource.gif.GifDrawable> r3 = com.bumptech.glide.load.resource.gif.GifDrawable.class
            r2.P0(r3, r0, r4)
            com.bumptech.glide.request.a r3 = r2.E0()
            return r3
    }

    public final int N() {
            r1 = this;
            int r0 = r1.j
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    final T N0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.N0(r2, r3)
            return r2
        Ld:
            r1.w(r2)
            com.bumptech.glide.request.a r2 = r1.L0(r3)
            return r2
    }

    public final int O() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T O0(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<Y> r3) {
            r1 = this;
            r0 = 1
            com.bumptech.glide.request.a r2 = r1.P0(r2, r3, r0)
            return r2
    }

    @androidx.annotation.Nullable
    public final android.graphics.drawable.Drawable P() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.g
            return r0
    }

    @androidx.annotation.NonNull
    <Y> T P0(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<Y> r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.P0(r2, r3, r4)
            return r2
        Ld:
            com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.util.k.d(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r1.f520r
            r0.put(r2, r3)
            int r2 = r1.a
            r3 = 1
            r1.f516n = r3
            r0 = 67584(0x10800, float:9.4705E-41)
            r0 = r0 | r2
            r1.a = r0
            r0 = 0
            r1.f527y = r0
            if (r4 == 0) goto L30
            r4 = 198656(0x30800, float:2.78376E-40)
            r2 = r2 | r4
            r1.a = r2
            r1.f515m = r3
        L30:
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    public final int Q() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T Q0(@androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap>... r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 <= r1) goto Le
            com.bumptech.glide.load.d r0 = new com.bumptech.glide.load.d
            r0.<init>(r3)
            com.bumptech.glide.request.a r3 = r2.M0(r0, r1)
            return r3
        Le:
            int r0 = r3.length
            if (r0 != r1) goto L19
            r0 = 0
            r3 = r3[r0]
            com.bumptech.glide.request.a r3 = r2.L0(r3)
            return r3
        L19:
            com.bumptech.glide.request.a r3 = r2.E0()
            return r3
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.Priority R() {
            r1 = this;
            com.bumptech.glide.Priority r0 = r1.d
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    @java.lang.Deprecated
    public T R0(@androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap>... r2) {
            r1 = this;
            com.bumptech.glide.load.d r0 = new com.bumptech.glide.load.d
            r0.<init>(r2)
            r2 = 1
            com.bumptech.glide.request.a r2 = r1.M0(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    public final java.lang.Class<?> S() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f521s
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T S0(boolean r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.S0(r2)
            return r2
        Ld:
            r1.f528z = r2
            int r2 = r1.a
            r0 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r0
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.load.c T() {
            r1 = this;
            com.bumptech.glide.load.c r0 = r1.f514l
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T T0(boolean r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.T0(r2)
            return r2
        Ld:
            r1.f525w = r2
            int r2 = r1.a
            r0 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r0
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    public final float U() {
            r1 = this;
            float r0 = r1.b
            return r0
    }

    @androidx.annotation.Nullable
    public final android.content.res.Resources.Theme V() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f523u
            return r0
    }

    @androidx.annotation.NonNull
    public final java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> W() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r1.f520r
            return r0
    }

    public final boolean X() {
            r1 = this;
            boolean r0 = r1.f528z
            return r0
    }

    public final boolean Y() {
            r1 = this;
            boolean r0 = r1.f525w
            return r0
    }

    protected final boolean Z() {
            r1 = this;
            boolean r0 = r1.f524v
            return r0
    }

    public final boolean a0() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.f0(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T b(@androidx.annotation.NonNull com.bumptech.glide.request.a<?> r5) {
            r4 = this;
            boolean r0 = r4.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r4.q()
            com.bumptech.glide.request.a r5 = r0.b(r5)
            return r5
        Ld:
            int r0 = r5.a
            r1 = 2
            boolean r0 = g0(r0, r1)
            if (r0 == 0) goto L1a
            float r0 = r5.b
            r4.b = r0
        L1a:
            int r0 = r5.a
            r1 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = g0(r0, r1)
            if (r0 == 0) goto L28
            boolean r0 = r5.f525w
            r4.f525w = r0
        L28:
            int r0 = r5.a
            r1 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = g0(r0, r1)
            if (r0 == 0) goto L36
            boolean r0 = r5.f528z
            r4.f528z = r0
        L36:
            int r0 = r5.a
            r1 = 4
            boolean r0 = g0(r0, r1)
            if (r0 == 0) goto L43
            com.bumptech.glide.load.engine.j r0 = r5.c
            r4.c = r0
        L43:
            int r0 = r5.a
            r1 = 8
            boolean r0 = g0(r0, r1)
            if (r0 == 0) goto L51
            com.bumptech.glide.Priority r0 = r5.d
            r4.d = r0
        L51:
            int r0 = r5.a
            r1 = 16
            boolean r0 = g0(r0, r1)
            r1 = 0
            if (r0 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r5.e
            r4.e = r0
            r4.f = r1
            int r0 = r4.a
            r0 = r0 & (-33)
            r4.a = r0
        L68:
            int r0 = r5.a
            r2 = 32
            boolean r0 = g0(r0, r2)
            r2 = 0
            if (r0 == 0) goto L7f
            int r0 = r5.f
            r4.f = r0
            r4.e = r2
            int r0 = r4.a
            r0 = r0 & (-17)
            r4.a = r0
        L7f:
            int r0 = r5.a
            r3 = 64
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto L95
            android.graphics.drawable.Drawable r0 = r5.g
            r4.g = r0
            r4.h = r1
            int r0 = r4.a
            r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
            r4.a = r0
        L95:
            int r0 = r5.a
            r3 = 128(0x80, float:1.8E-43)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Lab
            int r0 = r5.h
            r4.h = r0
            r4.g = r2
            int r0 = r4.a
            r0 = r0 & (-65)
            r4.a = r0
        Lab:
            int r0 = r5.a
            r3 = 256(0x100, float:3.59E-43)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Lb9
            boolean r0 = r5.i
            r4.i = r0
        Lb9:
            int r0 = r5.a
            r3 = 512(0x200, float:7.17E-43)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Lcb
            int r0 = r5.k
            r4.k = r0
            int r0 = r5.j
            r4.j = r0
        Lcb:
            int r0 = r5.a
            r3 = 1024(0x400, float:1.435E-42)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Ld9
            com.bumptech.glide.load.c r0 = r5.f514l
            r4.f514l = r0
        Ld9:
            int r0 = r5.a
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Le7
            java.lang.Class<?> r0 = r5.f521s
            r4.f521s = r0
        Le7:
            int r0 = r5.a
            r3 = 8192(0x2000, float:1.148E-41)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto Lfd
            android.graphics.drawable.Drawable r0 = r5.f517o
            r4.f517o = r0
            r4.f518p = r1
            int r0 = r4.a
            r0 = r0 & (-16385(0xffffffffffffbfff, float:NaN))
            r4.a = r0
        Lfd:
            int r0 = r5.a
            r3 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = g0(r0, r3)
            if (r0 == 0) goto L113
            int r0 = r5.f518p
            r4.f518p = r0
            r4.f517o = r2
            int r0 = r4.a
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r4.a = r0
        L113:
            int r0 = r5.a
            r2 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = g0(r0, r2)
            if (r0 == 0) goto L122
            android.content.res.Resources$Theme r0 = r5.f523u
            r4.f523u = r0
        L122:
            int r0 = r5.a
            r2 = 65536(0x10000, float:9.1835E-41)
            boolean r0 = g0(r0, r2)
            if (r0 == 0) goto L130
            boolean r0 = r5.f516n
            r4.f516n = r0
        L130:
            int r0 = r5.a
            r2 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = g0(r0, r2)
            if (r0 == 0) goto L13e
            boolean r0 = r5.f515m
            r4.f515m = r0
        L13e:
            int r0 = r5.a
            r2 = 2048(0x800, float:2.87E-42)
            boolean r0 = g0(r0, r2)
            if (r0 == 0) goto L153
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r4.f520r
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r2 = r5.f520r
            r0.putAll(r2)
            boolean r0 = r5.f527y
            r4.f527y = r0
        L153:
            int r0 = r5.a
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = g0(r0, r2)
            if (r0 == 0) goto L161
            boolean r0 = r5.f526x
            r4.f526x = r0
        L161:
            boolean r0 = r4.f516n
            if (r0 != 0) goto L177
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r4.f520r
            r0.clear()
            int r0 = r4.a
            r4.f515m = r1
            r1 = -133121(0xfffffffffffdf7ff, float:NaN)
            r0 = r0 & r1
            r4.a = r0
            r0 = 1
            r4.f527y = r0
        L177:
            int r0 = r4.a
            int r1 = r5.a
            r0 = r0 | r1
            r4.a = r0
            com.bumptech.glide.load.f r0 = r4.f519q
            com.bumptech.glide.load.f r5 = r5.f519q
            r0.d(r5)
            com.bumptech.glide.request.a r5 = r4.E0()
            return r5
    }

    public final boolean b0() {
            r1 = this;
            boolean r0 = r1.f522t
            return r0
    }

    public final boolean c0() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    @androidx.annotation.CheckResult
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.request.a r0 = r1.q()
            return r0
    }

    public final boolean d0() {
            r1 = this;
            r0 = 8
            boolean r0 = r1.f0(r0)
            return r0
    }

    boolean e0() {
            r1 = this;
            boolean r0 = r1.f527y
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.a
            r1 = 0
            if (r0 == 0) goto Laf
            com.bumptech.glide.request.a r4 = (com.bumptech.glide.request.a) r4
            float r0 = r4.b
            float r2 = r3.b
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 != 0) goto Laf
            int r0 = r3.f
            int r2 = r4.f
            if (r0 != r2) goto Laf
            android.graphics.drawable.Drawable r0 = r3.e
            android.graphics.drawable.Drawable r2 = r4.e
            boolean r0 = com.bumptech.glide.util.l.d(r0, r2)
            if (r0 == 0) goto Laf
            int r0 = r3.h
            int r2 = r4.h
            if (r0 != r2) goto Laf
            android.graphics.drawable.Drawable r0 = r3.g
            android.graphics.drawable.Drawable r2 = r4.g
            boolean r0 = com.bumptech.glide.util.l.d(r0, r2)
            if (r0 == 0) goto Laf
            int r0 = r3.f518p
            int r2 = r4.f518p
            if (r0 != r2) goto Laf
            android.graphics.drawable.Drawable r0 = r3.f517o
            android.graphics.drawable.Drawable r2 = r4.f517o
            boolean r0 = com.bumptech.glide.util.l.d(r0, r2)
            if (r0 == 0) goto Laf
            boolean r0 = r3.i
            boolean r2 = r4.i
            if (r0 != r2) goto Laf
            int r0 = r3.j
            int r2 = r4.j
            if (r0 != r2) goto Laf
            int r0 = r3.k
            int r2 = r4.k
            if (r0 != r2) goto Laf
            boolean r0 = r3.f515m
            boolean r2 = r4.f515m
            if (r0 != r2) goto Laf
            boolean r0 = r3.f516n
            boolean r2 = r4.f516n
            if (r0 != r2) goto Laf
            boolean r0 = r3.f525w
            boolean r2 = r4.f525w
            if (r0 != r2) goto Laf
            boolean r0 = r3.f526x
            boolean r2 = r4.f526x
            if (r0 != r2) goto Laf
            com.bumptech.glide.load.engine.j r0 = r3.c
            com.bumptech.glide.load.engine.j r2 = r4.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laf
            com.bumptech.glide.Priority r0 = r3.d
            com.bumptech.glide.Priority r2 = r4.d
            if (r0 != r2) goto Laf
            com.bumptech.glide.load.f r0 = r3.f519q
            com.bumptech.glide.load.f r2 = r4.f519q
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laf
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r3.f520r
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r2 = r4.f520r
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laf
            java.lang.Class<?> r0 = r3.f521s
            java.lang.Class<?> r2 = r4.f521s
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laf
            com.bumptech.glide.load.c r0 = r3.f514l
            com.bumptech.glide.load.c r2 = r4.f514l
            boolean r0 = com.bumptech.glide.util.l.d(r0, r2)
            if (r0 == 0) goto Laf
            android.content.res.Resources$Theme r0 = r3.f523u
            android.content.res.Resources$Theme r4 = r4.f523u
            boolean r4 = com.bumptech.glide.util.l.d(r0, r4)
            if (r4 == 0) goto Laf
            r4 = 1
            return r4
        Laf:
            return r1
    }

    @androidx.annotation.NonNull
    public T g() {
            r2 = this;
            boolean r0 = r2.f522t
            if (r0 == 0) goto L11
            boolean r0 = r2.f524v
            if (r0 == 0) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot auto lock an already locked options object, try clone() first"
            r0.<init>(r1)
            throw r0
        L11:
            r0 = 1
            r2.f524v = r0
            com.bumptech.glide.request.a r0 = r2.m0()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T h() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.e
            com.bumptech.glide.load.resource.bitmap.m r1 = new com.bumptech.glide.load.resource.bitmap.m
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.N0(r0, r1)
            return r0
    }

    public final boolean h0() {
            r1 = this;
            r0 = 256(0x100, float:3.59E-43)
            boolean r0 = r1.f0(r0)
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.b
            int r0 = com.bumptech.glide.util.l.m(r0)
            int r1 = r2.f
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.e
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            int r1 = r2.h
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.g
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            int r1 = r2.f518p
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.f517o
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            boolean r1 = r2.i
            int r0 = com.bumptech.glide.util.l.s(r1, r0)
            int r1 = r2.j
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            int r1 = r2.k
            int r0 = com.bumptech.glide.util.l.p(r1, r0)
            boolean r1 = r2.f515m
            int r0 = com.bumptech.glide.util.l.s(r1, r0)
            boolean r1 = r2.f516n
            int r0 = com.bumptech.glide.util.l.s(r1, r0)
            boolean r1 = r2.f525w
            int r0 = com.bumptech.glide.util.l.s(r1, r0)
            boolean r1 = r2.f526x
            int r0 = com.bumptech.glide.util.l.s(r1, r0)
            com.bumptech.glide.load.engine.j r1 = r2.c
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            com.bumptech.glide.Priority r1 = r2.d
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            com.bumptech.glide.load.f r1 = r2.f519q
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r1 = r2.f520r
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            java.lang.Class<?> r1 = r2.f521s
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            com.bumptech.glide.load.c r1 = r2.f514l
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            android.content.res.Resources$Theme r1 = r2.f523u
            int r0 = com.bumptech.glide.util.l.q(r1, r0)
            return r0
    }

    public final boolean i0() {
            r1 = this;
            boolean r0 = r1.f516n
            return r0
    }

    public final boolean j0() {
            r1 = this;
            boolean r0 = r1.f515m
            return r0
    }

    public final boolean k0() {
            r1 = this;
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = r1.f0(r0)
            return r0
    }

    public final boolean l0() {
            r2 = this;
            int r0 = r2.k
            int r1 = r2.j
            boolean r0 = com.bumptech.glide.util.l.w(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public T m0() {
            r1 = this;
            r0 = 1
            r1.f522t = r0
            com.bumptech.glide.request.a r0 = r1.D0()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T n() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.d
            com.bumptech.glide.load.resource.bitmap.n r1 = new com.bumptech.glide.load.resource.bitmap.n
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.B0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T n0(boolean r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.n0(r2)
            return r2
        Ld:
            r1.f526x = r2
            int r2 = r1.a
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r0
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T o() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.d
            com.bumptech.glide.load.resource.bitmap.o r1 = new com.bumptech.glide.load.resource.bitmap.o
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.N0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T o0() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.e
            com.bumptech.glide.load.resource.bitmap.m r1 = new com.bumptech.glide.load.resource.bitmap.m
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.u0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T p0() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.d
            com.bumptech.glide.load.resource.bitmap.n r1 = new com.bumptech.glide.load.resource.bitmap.n
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.s0(r0, r1)
            return r0
    }

    @androidx.annotation.CheckResult
    public T q() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.request.a r0 = (com.bumptech.glide.request.a) r0     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.load.f r1 = new com.bumptech.glide.load.f     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f519q = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.load.f r2 = r3.f519q     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.d(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            com.bumptech.glide.util.CachedHashCodeArrayMap r1 = new com.bumptech.glide.util.CachedHashCodeArrayMap     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f520r = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r2 = r3.f520r     // Catch: java.lang.CloneNotSupportedException -> L24
            r1.putAll(r2)     // Catch: java.lang.CloneNotSupportedException -> L24
            r1 = 0
            r0.f522t = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            r0.f524v = r1     // Catch: java.lang.CloneNotSupportedException -> L24
            return r0
        L24:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T q0() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.e
            com.bumptech.glide.load.resource.bitmap.o r1 = new com.bumptech.glide.load.resource.bitmap.o
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.u0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T r(@androidx.annotation.NonNull java.lang.Class<?> r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.r(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            r1.f521s = r2
            int r2 = r1.a
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T r0() {
            r2 = this;
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
            com.bumptech.glide.load.resource.bitmap.y r1 = new com.bumptech.glide.load.resource.bitmap.y
            r1.<init>()
            com.bumptech.glide.request.a r0 = r2.s0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T s() {
            r2 = this;
            com.bumptech.glide.load.e<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.bitmap.u.k
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.bumptech.glide.request.a r0 = r2.F0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T t(@androidx.annotation.NonNull com.bumptech.glide.load.engine.j r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.t(r2)
            return r2
        Ld:
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.engine.j r2 = (com.bumptech.glide.load.engine.j) r2
            r1.c = r2
            int r2 = r1.a
            r2 = r2 | 4
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T t0(@androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.M0(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T u() {
            r2 = this;
            com.bumptech.glide.load.e<java.lang.Boolean> r0 = com.bumptech.glide.load.resource.gif.h.b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            com.bumptech.glide.request.a r0 = r2.F0(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    final T u0(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<android.graphics.Bitmap> r3) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.u0(r2, r3)
            return r2
        Ld:
            r1.w(r2)
            r2 = 0
            com.bumptech.glide.request.a r2 = r1.M0(r3, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T v() {
            r3 = this;
            boolean r0 = r3.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r3.q()
            com.bumptech.glide.request.a r0 = r0.v()
            return r0
        Ld:
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.i<?>> r0 = r3.f520r
            r0.clear()
            int r0 = r3.a
            r1 = 0
            r3.f515m = r1
            r2 = -133121(0xfffffffffffdf7ff, float:NaN)
            r0 = r0 & r2
            r3.f516n = r1
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 | r1
            r3.a = r0
            r0 = 1
            r3.f527y = r0
            com.bumptech.glide.request.a r0 = r3.E0()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public <Y> T v0(@androidx.annotation.NonNull java.lang.Class<Y> r2, @androidx.annotation.NonNull com.bumptech.glide.load.i<Y> r3) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.request.a r2 = r1.P0(r2, r3, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T w(@androidx.annotation.NonNull com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2) {
            r1 = this;
            com.bumptech.glide.load.e<com.bumptech.glide.load.resource.bitmap.DownsampleStrategy> r0 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.h
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.request.a r2 = r1.F0(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T w0(int r1) {
            r0 = this;
            com.bumptech.glide.request.a r1 = r0.x0(r1, r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T x(@androidx.annotation.NonNull android.graphics.Bitmap.CompressFormat r2) {
            r1 = this;
            com.bumptech.glide.load.e<android.graphics.Bitmap$CompressFormat> r0 = com.bumptech.glide.load.resource.bitmap.e.c
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.request.a r2 = r1.F0(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T x0(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.x0(r2, r3)
            return r2
        Ld:
            r1.k = r2
            r1.j = r3
            int r2 = r1.a
            r2 = r2 | 512(0x200, float:7.17E-43)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T y(@androidx.annotation.IntRange(from = 0, to = 100) int r2) {
            r1 = this;
            com.bumptech.glide.load.e<java.lang.Integer> r0 = com.bumptech.glide.load.resource.bitmap.e.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.bumptech.glide.request.a r2 = r1.F0(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T y0(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.y0(r2)
            return r2
        Ld:
            r1.h = r2
            int r2 = r1.a
            r2 = r2 | 128(0x80, float:1.8E-43)
            r0 = 0
            r1.g = r0
            r2 = r2 & (-65)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T z(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.z(r2)
            return r2
        Ld:
            r1.f = r2
            int r2 = r1.a
            r2 = r2 | 32
            r0 = 0
            r1.e = r0
            r2 = r2 & (-17)
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.CheckResult
    public T z0(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = r1.f524v
            if (r0 == 0) goto Ld
            com.bumptech.glide.request.a r0 = r1.q()
            com.bumptech.glide.request.a r2 = r0.z0(r2)
            return r2
        Ld:
            r1.g = r2
            int r2 = r1.a
            r2 = r2 | 64
            r0 = 0
            r1.h = r0
            r2 = r2 & (-129(0xffffffffffffff7f, float:NaN))
            r1.a = r2
            com.bumptech.glide.request.a r2 = r1.E0()
            return r2
    }
}
