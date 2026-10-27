package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a0 {
    private static final java.lang.String g = "HardwareConfig";
    public static final boolean h = false;
    public static final boolean i = false;

    @androidx.annotation.VisibleForTesting
    static final int j = 128;
    private static final int k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final java.io.File f449l = null;

    /* renamed from: m, reason: collision with root package name */
    private static final int f450m = 50;

    /* renamed from: n, reason: collision with root package name */
    private static final int f451n = 700;

    /* renamed from: o, reason: collision with root package name */
    private static final int f452o = 20000;

    /* renamed from: p, reason: collision with root package name */
    public static final int f453p = -1;

    /* renamed from: q, reason: collision with root package name */
    private static volatile com.bumptech.glide.load.resource.bitmap.a0 f454q;

    /* renamed from: r, reason: collision with root package name */
    private static volatile int f455r;
    private final boolean a;
    private final int b;
    private final int c;

    @androidx.annotation.GuardedBy("this")
    private int d;

    @androidx.annotation.GuardedBy("this")
    private boolean e;
    private final java.util.concurrent.atomic.AtomicBoolean f;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            com.bumptech.glide.load.resource.bitmap.a0.h = r1
            r1 = 26
            if (r0 < r1) goto L12
            r2 = 1
        L12:
            com.bumptech.glide.load.resource.bitmap.a0.i = r2
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/fd"
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.a0.f449l = r0
            r0 = -1
            com.bumptech.glide.load.resource.bitmap.a0.f455r = r0
            return
    }

    @androidx.annotation.VisibleForTesting
    a0() {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r3.f = r0
            boolean r0 = h()
            r3.a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto L21
            r0 = 20000(0x4e20, float:2.8026E-41)
            r3.b = r0
            r3.c = r1
            return
        L21:
            r0 = 700(0x2bc, float:9.81E-43)
            r3.b = r0
            r0 = 128(0x80, float:1.8E-43)
            r3.c = r0
            return
    }

    private boolean b() {
            r1 = this;
            boolean r0 = com.bumptech.glide.load.resource.bitmap.a0.h
            if (r0 == 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static com.bumptech.glide.load.resource.bitmap.a0 d() {
            com.bumptech.glide.load.resource.bitmap.a0 r0 = com.bumptech.glide.load.resource.bitmap.a0.f454q
            if (r0 != 0) goto L19
            java.lang.Class<com.bumptech.glide.load.resource.bitmap.a0> r0 = com.bumptech.glide.load.resource.bitmap.a0.class
            monitor-enter(r0)
            com.bumptech.glide.load.resource.bitmap.a0 r1 = com.bumptech.glide.load.resource.bitmap.a0.f454q     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bumptech.glide.load.resource.bitmap.a0 r1 = new com.bumptech.glide.load.resource.bitmap.a0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bumptech.glide.load.resource.bitmap.a0.f454q = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bumptech.glide.load.resource.bitmap.a0 r0 = com.bumptech.glide.load.resource.bitmap.a0.f454q
            return r0
    }

    private int e() {
            r2 = this;
            int r0 = com.bumptech.glide.load.resource.bitmap.a0.f455r
            r1 = -1
            if (r0 == r1) goto L8
            int r0 = com.bumptech.glide.load.resource.bitmap.a0.f455r
            return r0
        L8:
            int r0 = r2.b
            return r0
    }

    private synchronized boolean f() {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.d     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            int r0 = r0 + r1
            r7.d = r0     // Catch: java.lang.Throwable -> L2c
            r2 = 50
            if (r0 < r2) goto L2e
            r0 = 0
            r7.d = r0     // Catch: java.lang.Throwable -> L2c
            java.io.File r2 = com.bumptech.glide.load.resource.bitmap.a0.f449l     // Catch: java.lang.Throwable -> L2c
            java.lang.String[] r2 = r2.list()     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L2c
            int r3 = r7.e()     // Catch: java.lang.Throwable -> L2c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2c
            long r5 = (long) r2     // Catch: java.lang.Throwable -> L2c
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            r7.e = r1     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L2e
            java.lang.String r0 = "Downsampler"
            r1 = 5
            android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r0 = move-exception
            goto L32
        L2e:
            boolean r0 = r7.e     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r7)
            return r0
        L32:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    private static boolean h() {
            boolean r0 = i()
            if (r0 != 0) goto Le
            boolean r0 = j()
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean i() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 0
            if (r0 == r1) goto L8
            return r2
        L8:
            java.lang.String r18 = "moto g(6) forge"
            java.lang.String r19 = "moto g(6) play"
            java.lang.String r3 = "SC-04J"
            java.lang.String r4 = "SM-N935"
            java.lang.String r5 = "SM-J720"
            java.lang.String r6 = "SM-G570F"
            java.lang.String r7 = "SM-G570M"
            java.lang.String r8 = "SM-G960"
            java.lang.String r9 = "SM-G965"
            java.lang.String r10 = "SM-G935"
            java.lang.String r11 = "SM-G930"
            java.lang.String r12 = "SM-A520"
            java.lang.String r13 = "SM-A720F"
            java.lang.String r14 = "moto e5"
            java.lang.String r15 = "moto e5 play"
            java.lang.String r16 = "moto e5 plus"
            java.lang.String r17 = "moto e5 cruise"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = android.os.Build.MODEL
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L36
            r0 = 1
            return r0
        L4c:
            return r2
    }

    private static boolean j() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r20 = "LM-X220QMA"
            java.lang.String r21 = "LM-X410PM"
            java.lang.String r1 = "LG-M250"
            java.lang.String r2 = "LG-M320"
            java.lang.String r3 = "LG-Q710AL"
            java.lang.String r4 = "LG-Q710PL"
            java.lang.String r5 = "LGM-K121K"
            java.lang.String r6 = "LGM-K121L"
            java.lang.String r7 = "LGM-K121S"
            java.lang.String r8 = "LGM-X320K"
            java.lang.String r9 = "LGM-X320L"
            java.lang.String r10 = "LGM-X320S"
            java.lang.String r11 = "LGM-X401L"
            java.lang.String r12 = "LGM-X401S"
            java.lang.String r13 = "LM-Q610.FG"
            java.lang.String r14 = "LM-Q610.FGN"
            java.lang.String r15 = "LM-Q617.FG"
            java.lang.String r16 = "LM-Q617.FGN"
            java.lang.String r17 = "LM-Q710.FG"
            java.lang.String r18 = "LM-Q710.FGN"
            java.lang.String r19 = "LM-X220PM"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.contains(r1)
            return r0
    }

    public boolean a() {
            r1 = this;
            com.bumptech.glide.util.l.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            return r0
    }

    public void c() {
            r2 = this;
            com.bumptech.glide.util.l.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f
            r1 = 0
            r0.set(r1)
            return
    }

    public boolean g(int r4, int r5, boolean r6, boolean r7) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "HardwareConfig"
            if (r6 != 0) goto La
            android.util.Log.isLoggable(r2, r1)
            return r0
        La:
            boolean r6 = r3.a
            if (r6 != 0) goto L12
            android.util.Log.isLoggable(r2, r1)
            return r0
        L12:
            boolean r6 = com.bumptech.glide.load.resource.bitmap.a0.i
            if (r6 != 0) goto L1a
            android.util.Log.isLoggable(r2, r1)
            return r0
        L1a:
            boolean r6 = r3.b()
            if (r6 == 0) goto L24
            android.util.Log.isLoggable(r2, r1)
            return r0
        L24:
            if (r7 == 0) goto L2a
            android.util.Log.isLoggable(r2, r1)
            return r0
        L2a:
            int r6 = r3.c
            if (r4 >= r6) goto L32
            android.util.Log.isLoggable(r2, r1)
            return r0
        L32:
            if (r5 >= r6) goto L38
            android.util.Log.isLoggable(r2, r1)
            return r0
        L38:
            boolean r4 = r3.f()
            if (r4 != 0) goto L42
            android.util.Log.isLoggable(r2, r1)
            return r0
        L42:
            r4 = 1
            return r4
    }

    @android.annotation.TargetApi(26)
    boolean k(int r1, int r2, android.graphics.BitmapFactory.Options r3, boolean r4, boolean r5) {
            r0 = this;
            boolean r1 = r0.g(r1, r2, r4, r5)
            if (r1 == 0) goto Lf
            android.graphics.Bitmap$Config r2 = com.bumptech.glide.load.engine.bitmap_recycle.k.a()
            r3.inPreferredConfig = r2
            r2 = 0
            r3.inMutable = r2
        Lf:
            return r1
    }

    public void l() {
            r2 = this;
            com.bumptech.glide.util.l.b()
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f
            r1 = 1
            r0.set(r1)
            return
    }
}
