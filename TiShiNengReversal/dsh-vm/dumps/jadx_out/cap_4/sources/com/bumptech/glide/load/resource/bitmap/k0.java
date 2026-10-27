package com.bumptech.glide.load.resource.bitmap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class k0 {
    private static final java.lang.String a = "TransformationUtils";
    public static final int b = 6;
    private static final android.graphics.Paint c = null;
    private static final int d = 7;
    private static final android.graphics.Paint e = null;
    private static final android.graphics.Paint f = null;
    private static final java.util.Set<java.lang.String> g = null;
    private static final java.util.concurrent.locks.Lock h = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.resource.bitmap.k0.c {
        final /* synthetic */ int a;

        a(int r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k0.c
        public void a(android.graphics.Canvas r3, android.graphics.Paint r4, android.graphics.RectF r5) {
                r2 = this;
                int r0 = r2.a
                float r1 = (float) r0
                float r0 = (float) r0
                r3.drawRoundRect(r5, r1, r0, r4)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.bumptech.glide.load.resource.bitmap.k0.c {
        final /* synthetic */ float a;
        final /* synthetic */ float b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;

        b(float r1, float r2, float r3, float r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.k0.c
        public void a(android.graphics.Canvas r8, android.graphics.Paint r9, android.graphics.RectF r10) {
                r7 = this;
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                float r1 = r7.a
                float r2 = r7.b
                float r3 = r7.c
                float r4 = r7.d
                r5 = 8
                float[] r5 = new float[r5]
                r6 = 0
                r5[r6] = r1
                r6 = 1
                r5[r6] = r1
                r1 = 2
                r5[r1] = r2
                r1 = 3
                r5[r1] = r2
                r1 = 4
                r5[r1] = r3
                r1 = 5
                r5[r1] = r3
                r1 = 6
                r5[r1] = r4
                r1 = 7
                r5[r1] = r4
                android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
                r0.addRoundRect(r10, r5, r1)
                r8.drawPath(r0, r9)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface c {
        void a(android.graphics.Canvas r1, android.graphics.Paint r2, android.graphics.RectF r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class d implements java.util.concurrent.locks.Lock {
        d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws java.lang.InterruptedException {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.locks.Lock
        @androidx.annotation.NonNull
        public java.util.concurrent.locks.Condition newCondition() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long r1, @androidx.annotation.NonNull java.util.concurrent.TimeUnit r3) throws java.lang.InterruptedException {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
                r0 = this;
                return
        }
    }

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 6
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.k0.c = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 7
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.k0.e = r0
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r29 = "XT1078"
            java.lang.String r30 = "XT1079"
            java.lang.String r2 = "XT1085"
            java.lang.String r3 = "XT1092"
            java.lang.String r4 = "XT1093"
            java.lang.String r5 = "XT1094"
            java.lang.String r6 = "XT1095"
            java.lang.String r7 = "XT1096"
            java.lang.String r8 = "XT1097"
            java.lang.String r9 = "XT1098"
            java.lang.String r10 = "XT1031"
            java.lang.String r11 = "XT1028"
            java.lang.String r12 = "XT937C"
            java.lang.String r13 = "XT1032"
            java.lang.String r14 = "XT1008"
            java.lang.String r15 = "XT1033"
            java.lang.String r16 = "XT1035"
            java.lang.String r17 = "XT1034"
            java.lang.String r18 = "XT939G"
            java.lang.String r19 = "XT1039"
            java.lang.String r20 = "XT1040"
            java.lang.String r21 = "XT1042"
            java.lang.String r22 = "XT1045"
            java.lang.String r23 = "XT1063"
            java.lang.String r24 = "XT1064"
            java.lang.String r25 = "XT1068"
            java.lang.String r26 = "XT1069"
            java.lang.String r27 = "XT1072"
            java.lang.String r28 = "XT1077"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            com.bumptech.glide.load.resource.bitmap.k0.g = r0
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L67
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            goto L6c
        L67:
            com.bumptech.glide.load.resource.bitmap.k0$d r0 = new com.bumptech.glide.load.resource.bitmap.k0$d
            r0.<init>()
        L6c:
            com.bumptech.glide.load.resource.bitmap.k0.h = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            com.bumptech.glide.load.resource.bitmap.k0.f = r0
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    private k0() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void a(@androidx.annotation.NonNull android.graphics.Bitmap r2, @androidx.annotation.NonNull android.graphics.Bitmap r3, android.graphics.Matrix r4) {
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.k0.h
            r0.lock()
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L16
            android.graphics.Paint r3 = com.bumptech.glide.load.resource.bitmap.k0.c     // Catch: java.lang.Throwable -> L16
            r1.drawBitmap(r2, r4, r3)     // Catch: java.lang.Throwable -> L16
            e(r1)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return
        L16:
            r2 = move-exception
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.k0.h
            r3.unlock()
            throw r2
    }

    public static android.graphics.Bitmap b(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9) {
            int r0 = r7.getWidth()
            if (r0 != r8) goto Ld
            int r0 = r7.getHeight()
            if (r0 != r9) goto Ld
            return r7
        Ld:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r7.getWidth()
            int r1 = r1 * r9
            int r2 = r7.getHeight()
            int r2 = r2 * r8
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r2) goto L38
            float r1 = (float) r9
            int r2 = r7.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r8
            int r5 = r7.getWidth()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r4
            r3 = r2
            r2 = 0
            goto L4a
        L38:
            float r1 = (float) r8
            int r2 = r7.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r9
            int r5 = r7.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r2 = r2 - r5
            float r2 = r2 * r4
        L4a:
            r0.setScale(r1, r1)
            float r3 = r3 + r4
            int r1 = (int) r3
            float r1 = (float) r1
            float r2 = r2 + r4
            int r2 = (int) r2
            float r2 = (float) r2
            r0.postTranslate(r1, r2)
            android.graphics.Bitmap$Config r1 = k(r7)
            android.graphics.Bitmap r6 = r6.e(r8, r9, r1)
            t(r7, r6)
            a(r7, r6, r0)
            return r6
    }

    public static android.graphics.Bitmap c(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r3, @androidx.annotation.NonNull android.graphics.Bitmap r4, int r5, int r6) {
            int r0 = r4.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 > r5) goto L13
            int r0 = r4.getHeight()
            if (r0 > r6) goto L13
            android.util.Log.isLoggable(r2, r1)
            return r4
        L13:
            android.util.Log.isLoggable(r2, r1)
            android.graphics.Bitmap r3 = f(r3, r4, r5, r6)
            return r3
    }

    public static android.graphics.Bitmap d(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r6, @androidx.annotation.NonNull android.graphics.Bitmap r7, int r8, int r9) {
            int r8 = java.lang.Math.min(r8, r9)
            float r9 = (float) r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r9 / r0
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            float r2 = (float) r2
            float r4 = r9 / r2
            float r3 = (float) r3
            float r5 = r9 / r3
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r4 = r4 * r3
            float r3 = r9 - r2
            float r3 = r3 / r0
            float r9 = r9 - r4
            float r9 = r9 / r0
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r2 + r3
            float r4 = r4 + r9
            r0.<init>(r3, r9, r2, r4)
            android.graphics.Bitmap r9 = g(r6, r7)
            android.graphics.Bitmap$Config r2 = h(r7)
            android.graphics.Bitmap r8 = r6.e(r8, r8, r2)
            r2 = 1
            r8.setHasAlpha(r2)
            java.util.concurrent.locks.Lock r2 = com.bumptech.glide.load.resource.bitmap.k0.h
            r2.lock()
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L60
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L60
            android.graphics.Paint r4 = com.bumptech.glide.load.resource.bitmap.k0.e     // Catch: java.lang.Throwable -> L60
            r3.drawCircle(r1, r1, r1, r4)     // Catch: java.lang.Throwable -> L60
            android.graphics.Paint r1 = com.bumptech.glide.load.resource.bitmap.k0.f     // Catch: java.lang.Throwable -> L60
            r4 = 0
            r3.drawBitmap(r9, r4, r0, r1)     // Catch: java.lang.Throwable -> L60
            e(r3)     // Catch: java.lang.Throwable -> L60
            r2.unlock()
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L5f
            r6.d(r9)
        L5f:
            return r8
        L60:
            r6 = move-exception
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.resource.bitmap.k0.h
            r7.unlock()
            throw r6
    }

    private static void e(android.graphics.Canvas r1) {
            r0 = 0
            r1.setBitmap(r0)
            return
    }

    public static android.graphics.Bitmap f(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r4, @androidx.annotation.NonNull android.graphics.Bitmap r5, int r6, int r7) {
            int r0 = r5.getWidth()
            r1 = 2
            java.lang.String r2 = "TransformationUtils"
            if (r0 != r6) goto L13
            int r0 = r5.getHeight()
            if (r0 != r7) goto L13
            android.util.Log.isLoggable(r2, r1)
            return r5
        L13:
            float r6 = (float) r6
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r7 = (float) r7
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r7 = r7 / r0
            float r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r7 = java.lang.Math.round(r7)
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = java.lang.Math.round(r0)
            int r3 = r5.getWidth()
            if (r3 != r7) goto L4b
            int r7 = r5.getHeight()
            if (r7 != r0) goto L4b
            android.util.Log.isLoggable(r2, r1)
            return r5
        L4b:
            int r7 = r5.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r7 = (int) r7
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            android.graphics.Bitmap$Config r3 = k(r5)
            android.graphics.Bitmap r4 = r4.e(r7, r0, r3)
            t(r5, r4)
            boolean r7 = android.util.Log.isLoggable(r2, r1)
            if (r7 == 0) goto L78
            r5.getWidth()
            r5.getHeight()
            r4.getWidth()
            r4.getHeight()
        L78:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r7.setScale(r6, r6)
            a(r5, r4, r7)
            return r4
    }

    private static android.graphics.Bitmap g(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r3, @androidx.annotation.NonNull android.graphics.Bitmap r4) {
            android.graphics.Bitmap$Config r0 = h(r4)
            android.graphics.Bitmap$Config r1 = r4.getConfig()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lf
            return r4
        Lf:
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            android.graphics.Bitmap r3 = r3.e(r1, r2, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r3)
            r1 = 0
            r2 = 0
            r0.drawBitmap(r4, r2, r2, r1)
            return r3
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap.Config h(@androidx.annotation.NonNull android.graphics.Bitmap r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L19
            android.graphics.Bitmap$Config r0 = com.bumptech.glide.load.engine.bitmap_recycle.p.a()
            android.graphics.Bitmap$Config r2 = r2.getConfig()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L19
            android.graphics.Bitmap$Config r2 = com.bumptech.glide.load.engine.bitmap_recycle.p.a()
            return r2
        L19:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            return r2
    }

    public static java.util.concurrent.locks.Lock i() {
            java.util.concurrent.locks.Lock r0 = com.bumptech.glide.load.resource.bitmap.k0.h
            return r0
    }

    public static int j(int r0) {
            switch(r0) {
                case 3: goto Lb;
                case 4: goto Lb;
                case 5: goto L8;
                case 6: goto L8;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L8:
            r0 = 90
            return r0
        Lb:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
    }

    @androidx.annotation.NonNull
    private static android.graphics.Bitmap.Config k(@androidx.annotation.NonNull android.graphics.Bitmap r1) {
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            if (r0 == 0) goto Lb
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            return r1
        Lb:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            return r1
    }

    @androidx.annotation.VisibleForTesting
    static void l(int r5, android.graphics.Matrix r6) {
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1119092736(0x42b40000, float:90.0)
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r5) {
                case 2: goto L2f;
                case 3: goto L2b;
                case 4: goto L24;
                case 5: goto L1d;
                case 6: goto L19;
                case 7: goto L12;
                case 8: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            r6.setRotate(r2)
            return
        L12:
            r6.setRotate(r2)
            r6.postScale(r4, r3)
            return
        L19:
            r6.setRotate(r1)
            return
        L1d:
            r6.setRotate(r1)
            r6.postScale(r4, r3)
            return
        L24:
            r6.setRotate(r0)
            r6.postScale(r4, r3)
            return
        L2b:
            r6.setRotate(r0)
            return
        L2f:
            r6.setScale(r4, r3)
            return
    }

    public static boolean m(int r0) {
            switch(r0) {
                case 2: goto L5;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 1
            return r0
    }

    public static android.graphics.Bitmap n(@androidx.annotation.NonNull android.graphics.Bitmap r7, int r8) {
            if (r8 == 0) goto L24
            android.graphics.Matrix r5 = new android.graphics.Matrix     // Catch: java.lang.Exception -> L1c
            r5.<init>()     // Catch: java.lang.Exception -> L1c
            float r8 = (float) r8     // Catch: java.lang.Exception -> L1c
            r5.setRotate(r8)     // Catch: java.lang.Exception -> L1c
            int r3 = r7.getWidth()     // Catch: java.lang.Exception -> L1c
            int r4 = r7.getHeight()     // Catch: java.lang.Exception -> L1c
            r6 = 1
            r1 = 0
            r2 = 0
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L1d
            return r7
        L1c:
            r0 = r7
        L1d:
            java.lang.String r7 = "TransformationUtils"
            r8 = 6
            android.util.Log.isLoggable(r7, r8)
            return r0
        L24:
            r0 = r7
            return r0
    }

    public static android.graphics.Bitmap o(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r4, @androidx.annotation.NonNull android.graphics.Bitmap r5, int r6) {
            boolean r0 = m(r6)
            if (r0 != 0) goto L7
            return r5
        L7:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            l(r6, r0)
            android.graphics.RectF r6 = new android.graphics.RectF
            int r1 = r5.getWidth()
            float r1 = (float) r1
            int r2 = r5.getHeight()
            float r2 = (float) r2
            r3 = 0
            r6.<init>(r3, r3, r1, r2)
            r0.mapRect(r6)
            float r1 = r6.width()
            int r1 = java.lang.Math.round(r1)
            float r2 = r6.height()
            int r2 = java.lang.Math.round(r2)
            android.graphics.Bitmap$Config r3 = k(r5)
            android.graphics.Bitmap r4 = r4.e(r1, r2, r3)
            float r1 = r6.left
            float r1 = -r1
            float r6 = r6.top
            float r6 = -r6
            r0.postTranslate(r1, r6)
            boolean r6 = r5.hasAlpha()
            r4.setHasAlpha(r6)
            a(r5, r4, r0)
            return r4
    }

    public static android.graphics.Bitmap p(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r1, @androidx.annotation.NonNull android.graphics.Bitmap r2, float r3, float r4, float r5, float r6) {
            com.bumptech.glide.load.resource.bitmap.k0$b r0 = new com.bumptech.glide.load.resource.bitmap.k0$b
            r0.<init>(r3, r4, r5, r6)
            android.graphics.Bitmap r1 = s(r1, r2, r0)
            return r1
    }

    public static android.graphics.Bitmap q(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r2, @androidx.annotation.NonNull android.graphics.Bitmap r3, int r4) {
            if (r4 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "roundingRadius must be greater than 0."
            com.bumptech.glide.util.k.a(r0, r1)
            com.bumptech.glide.load.resource.bitmap.k0$a r0 = new com.bumptech.glide.load.resource.bitmap.k0$a
            r0.<init>(r4)
            android.graphics.Bitmap r2 = s(r2, r3, r0)
            return r2
    }

    @java.lang.Deprecated
    public static android.graphics.Bitmap r(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r0, @androidx.annotation.NonNull android.graphics.Bitmap r1, int r2, int r3, int r4) {
            android.graphics.Bitmap r0 = q(r0, r1, r4)
            return r0
    }

    private static android.graphics.Bitmap s(@androidx.annotation.NonNull com.bumptech.glide.load.engine.bitmap_recycle.e r8, @androidx.annotation.NonNull android.graphics.Bitmap r9, com.bumptech.glide.load.resource.bitmap.k0.c r10) {
            android.graphics.Bitmap$Config r0 = h(r9)
            android.graphics.Bitmap r1 = g(r8, r9)
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            android.graphics.Bitmap r0 = r8.e(r2, r3, r0)
            r2 = 1
            r0.setHasAlpha(r2)
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r3.<init>(r1, r4, r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r4.setAntiAlias(r2)
            r4.setShader(r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r5 = r0.getHeight()
            float r5 = (float) r5
            r6 = 0
            r2.<init>(r6, r6, r3, r5)
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.k0.h
            r3.lock()
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L5d
            r7 = 0
            r5.drawColor(r7, r6)     // Catch: java.lang.Throwable -> L5d
            r10.a(r5, r4, r2)     // Catch: java.lang.Throwable -> L5d
            e(r5)     // Catch: java.lang.Throwable -> L5d
            r3.unlock()
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L5c
            r8.d(r1)
        L5c:
            return r0
        L5d:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.resource.bitmap.k0.h
            r9.unlock()
            throw r8
    }

    public static void t(android.graphics.Bitmap r0, android.graphics.Bitmap r1) {
            boolean r0 = r0.hasAlpha()
            r1.setHasAlpha(r0)
            return
    }
}
