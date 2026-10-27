package com.bumptech.glide.load.engine.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l {
    private static final java.lang.String e = "MemorySizeCalculator";

    @androidx.annotation.VisibleForTesting
    static final int f = 4;
    private static final int g = 2;
    private final int a;
    private final int b;
    private final android.content.Context c;
    private final int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        @androidx.annotation.VisibleForTesting
        static final int i = 2;
        static final int j = 0;
        static final float k = 0.4f;

        /* renamed from: l, reason: collision with root package name */
        static final float f394l = 0.33f;

        /* renamed from: m, reason: collision with root package name */
        static final int f395m = 4194304;
        final android.content.Context a;
        android.app.ActivityManager b;
        com.bumptech.glide.load.engine.cache.l.c c;
        float d;
        float e;
        float f;
        float g;
        int h;

        static {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 >= r1) goto L8
                r0 = 4
                goto L9
            L8:
                r0 = 1
            L9:
                com.bumptech.glide.load.engine.cache.l.a.j = r0
                return
        }

        public a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 1073741824(0x40000000, float:2.0)
                r1.d = r0
                int r0 = com.bumptech.glide.load.engine.cache.l.a.j
                float r0 = (float) r0
                r1.e = r0
                r0 = 1053609165(0x3ecccccd, float:0.4)
                r1.f = r0
                r0 = 1051260355(0x3ea8f5c3, float:0.33)
                r1.g = r0
                r0 = 4194304(0x400000, float:5.877472E-39)
                r1.h = r0
                r1.a = r2
                java.lang.String r0 = "activity"
                java.lang.Object r0 = r2.getSystemService(r0)
                android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                r1.b = r0
                com.bumptech.glide.load.engine.cache.l$b r0 = new com.bumptech.glide.load.engine.cache.l$b
                android.content.res.Resources r2 = r2.getResources()
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                r0.<init>(r2)
                r1.c = r0
                int r2 = android.os.Build.VERSION.SDK_INT
                r0 = 26
                if (r2 < r0) goto L46
                android.app.ActivityManager r2 = r1.b
                boolean r2 = com.bumptech.glide.load.engine.cache.l.e(r2)
                if (r2 == 0) goto L46
                r2 = 0
                r1.e = r2
            L46:
                return
        }

        public com.bumptech.glide.load.engine.cache.l a() {
                r1 = this;
                com.bumptech.glide.load.engine.cache.l r0 = new com.bumptech.glide.load.engine.cache.l
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.VisibleForTesting
        com.bumptech.glide.load.engine.cache.l.a b(android.app.ActivityManager r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public com.bumptech.glide.load.engine.cache.l.a c(int r1) {
                r0 = this;
                r0.h = r1
                return r0
        }

        public com.bumptech.glide.load.engine.cache.l.a d(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "Bitmap pool screens must be greater than or equal to 0"
                com.bumptech.glide.util.k.a(r0, r1)
                r2.e = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.l.a e(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                java.lang.String r1 = "Low memory max size multiplier must be between 0 and 1"
                com.bumptech.glide.util.k.a(r0, r1)
                r2.g = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.l.a f(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto Ld
                r0 = 1065353216(0x3f800000, float:1.0)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                java.lang.String r1 = "Size multiplier must be between 0 and 1"
                com.bumptech.glide.util.k.a(r0, r1)
                r2.f = r3
                return r2
        }

        public com.bumptech.glide.load.engine.cache.l.a g(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 < 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "Memory cache screens must be greater than or equal to 0"
                com.bumptech.glide.util.k.a(r0, r1)
                r2.d = r3
                return r2
        }

        @androidx.annotation.VisibleForTesting
        com.bumptech.glide.load.engine.cache.l.a h(com.bumptech.glide.load.engine.cache.l.c r1) {
                r0 = this;
                r0.c = r1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements com.bumptech.glide.load.engine.cache.l.c {
        private final android.util.DisplayMetrics a;

        b(android.util.DisplayMetrics r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
                r1 = this;
                android.util.DisplayMetrics r0 = r1.a
                int r0 = r0.heightPixels
                return r0
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
                r1 = this;
                android.util.DisplayMetrics r0 = r1.a
                int r0 = r0.widthPixels
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface c {
        int a();

        int b();
    }

    l(com.bumptech.glide.load.engine.cache.l.a r7) {
            r6 = this;
            r6.<init>()
            android.content.Context r0 = r7.a
            r6.c = r0
            android.app.ActivityManager r0 = r7.b
            boolean r0 = e(r0)
            if (r0 == 0) goto L14
            int r0 = r7.h
            int r0 = r0 / 2
            goto L16
        L14:
            int r0 = r7.h
        L16:
            r6.d = r0
            android.app.ActivityManager r1 = r7.b
            float r2 = r7.f
            float r3 = r7.g
            int r1 = c(r1, r2, r3)
            com.bumptech.glide.load.engine.cache.l$c r2 = r7.c
            int r2 = r2.b()
            com.bumptech.glide.load.engine.cache.l$c r3 = r7.c
            int r3 = r3.a()
            int r2 = r2 * r3
            int r2 = r2 * 4
            float r2 = (float) r2
            float r3 = r7.e
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r4 = r7.d
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r1 - r0
            int r5 = r2 + r3
            if (r5 > r4) goto L4e
            r6.b = r2
            r6.a = r3
            goto L67
        L4e:
            float r2 = (float) r4
            float r3 = r7.e
            float r4 = r7.d
            float r3 = r3 + r4
            float r2 = r2 / r3
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            r6.b = r3
            float r3 = r7.e
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r6.a = r2
        L67:
            java.lang.String r2 = "MemorySizeCalculator"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L8a
            int r2 = r6.b
            r6.f(r2)
            int r2 = r6.a
            r6.f(r2)
            r6.f(r0)
            r6.f(r1)
            android.app.ActivityManager r0 = r7.b
            r0.getMemoryClass()
            android.app.ActivityManager r7 = r7.b
            e(r7)
        L8a:
            return
    }

    private static int c(android.app.ActivityManager r2, float r3, float r4) {
            int r0 = r2.getMemoryClass()
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r1
            boolean r2 = e(r2)
            float r0 = (float) r0
            if (r2 == 0) goto L10
            r3 = r4
        L10:
            float r0 = r0 * r3
            int r2 = java.lang.Math.round(r0)
            return r2
    }

    @android.annotation.TargetApi(19)
    static boolean e(android.app.ActivityManager r0) {
            boolean r0 = r0.isLowRamDevice()
            return r0
    }

    private java.lang.String f(int r4) {
            r3 = this;
            android.content.Context r0 = r3.c
            long r1 = (long) r4
            java.lang.String r4 = android.text.format.Formatter.formatFileSize(r0, r1)
            return r4
    }

    public int a() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.b
            return r0
    }
}
