package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class l {
    private static final int a = 31;
    private static final int b = 17;
    private static final char[] c = null;
    private static final char[] d = null;

    @androidx.annotation.Nullable
    private static volatile android.os.Handler e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.util.l.a.a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bumptech.glide.util.l.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bumptech.glide.util.l.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bumptech.glide.util.l.a.a     // Catch: java.lang.NoSuchFieldError -> L35
                android.graphics.Bitmap$Config r1 = com.bumptech.glide.load.engine.bitmap_recycle.p.a()     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
            L35:
                int[] r0 = com.bumptech.glide.util.l.a.a     // Catch: java.lang.NoSuchFieldError -> L40
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.NoSuchFieldError -> L40
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L40
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L40
            L40:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "0123456789abcdef"
            char[] r0 = r0.toCharArray()
            com.bumptech.glide.util.l.c = r0
            r0 = 64
            char[] r0 = new char[r0]
            com.bumptech.glide.util.l.d = r0
            return
    }

    private l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a() {
            boolean r0 = t()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call this method on a background thread"
            r0.<init>(r1)
            throw r0
    }

    public static void b() {
            boolean r0 = u()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You must call this method on the main thread"
            r0.<init>(r1)
            throw r0
    }

    public static boolean c(@androidx.annotation.Nullable java.lang.Object r1, @androidx.annotation.Nullable java.lang.Object r2) {
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
        L8:
            boolean r0 = r1 instanceof com.bumptech.glide.load.model.l
            if (r0 == 0) goto L13
            com.bumptech.glide.load.model.l r1 = (com.bumptech.glide.load.model.l) r1
            boolean r1 = r1.a(r2)
            return r1
        L13:
            boolean r1 = r1.equals(r2)
            return r1
    }

    public static boolean d(@androidx.annotation.Nullable java.lang.Object r0, @androidx.annotation.Nullable java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.String e(@androidx.annotation.NonNull byte[] r5, @androidx.annotation.NonNull char[] r6) {
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L1d
            r1 = r5[r0]
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r0 * 2
            char[] r4 = com.bumptech.glide.util.l.c
            int r2 = r2 >>> 4
            char r2 = r4[r2]
            r6[r3] = r2
            int r3 = r3 + 1
            r1 = r1 & 15
            char r1 = r4[r1]
            r6[r3] = r1
            int r0 = r0 + 1
            goto L1
        L1d:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            return r5
    }

    @androidx.annotation.NonNull
    public static <T> java.util.Queue<T> f(int r1) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>(r1)
            return r0
    }

    public static int g(int r0, int r1, @androidx.annotation.Nullable android.graphics.Bitmap.Config r2) {
            int r0 = r0 * r1
            int r1 = i(r2)
            int r0 = r0 * r1
            return r0
    }

    @android.annotation.TargetApi(19)
    public static int h(@androidx.annotation.NonNull android.graphics.Bitmap r3) {
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L16
            int r3 = r3.getAllocationByteCount()     // Catch: java.lang.NullPointerException -> Lb
            return r3
        Lb:
            int r0 = r3.getHeight()
            int r3 = r3.getRowBytes()
            int r0 = r0 * r3
            return r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot obtain size for recycled Bitmap: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r2 = r3.getHeight()
            r1.append(r2)
            java.lang.String r2 = "] "
            r1.append(r2)
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static int i(@androidx.annotation.Nullable android.graphics.Bitmap.Config r2) {
            if (r2 != 0) goto L4
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L4:
            int[] r0 = com.bumptech.glide.util.l.a.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1c
            r0 = 2
            if (r2 == r0) goto L1c
            r1 = 3
            if (r2 == r1) goto L1c
            r0 = 4
            if (r2 == r0) goto L19
            return r0
        L19:
            r2 = 8
            return r2
        L1c:
            return r0
    }

    @java.lang.Deprecated
    public static int j(@androidx.annotation.NonNull android.graphics.Bitmap r0) {
            int r0 = h(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> java.util.List<T> k(@androidx.annotation.NonNull java.util.Collection<T> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto Ld
            r0.add(r1)
            goto Ld
        L1d:
            return r0
    }

    private static android.os.Handler l() {
            android.os.Handler r0 = com.bumptech.glide.util.l.e
            if (r0 != 0) goto L1d
            java.lang.Class<com.bumptech.glide.util.l> r0 = com.bumptech.glide.util.l.class
            monitor-enter(r0)
            android.os.Handler r1 = com.bumptech.glide.util.l.e     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.bumptech.glide.util.l.e = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1d:
            android.os.Handler r0 = com.bumptech.glide.util.l.e
            return r0
    }

    public static int m(float r1) {
            r0 = 17
            int r1 = n(r1, r0)
            return r1
    }

    public static int n(float r0, int r1) {
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r0 = p(r0, r1)
            return r0
    }

    public static int o(int r1) {
            r0 = 17
            int r1 = p(r1, r0)
            return r1
    }

    public static int p(int r0, int r1) {
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public static int q(@androidx.annotation.Nullable java.lang.Object r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            int r0 = r0.hashCode()
        L8:
            int r0 = p(r0, r1)
            return r0
    }

    public static int r(boolean r1) {
            r0 = 17
            int r1 = s(r1, r0)
            return r1
    }

    public static int s(boolean r0, int r1) {
            int r0 = p(r0, r1)
            return r0
    }

    public static boolean t() {
            boolean r0 = u()
            r0 = r0 ^ 1
            return r0
    }

    public static boolean u() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private static boolean v(int r1) {
            if (r1 > 0) goto L9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L7
            goto L9
        L7:
            r1 = 0
            return r1
        L9:
            r1 = 1
            return r1
    }

    public static boolean w(int r0, int r1) {
            boolean r0 = v(r0)
            if (r0 == 0) goto Le
            boolean r0 = v(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static void x(java.lang.Runnable r1) {
            android.os.Handler r0 = l()
            r0.post(r1)
            return
    }

    public static void y(java.lang.Runnable r1) {
            android.os.Handler r0 = l()
            r0.removeCallbacks(r1)
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String z(@androidx.annotation.NonNull byte[] r1) {
            char[] r0 = com.bumptech.glide.util.l.d
            monitor-enter(r0)
            java.lang.String r1 = e(r1, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }
}
