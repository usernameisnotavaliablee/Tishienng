package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ImageLoader {

    /* renamed from: k, reason: collision with root package name */
    private static cn.bluemobi.dylan.base.utils.ImageLoader f77k = null;
    private static final int l = 1;
    private static final java.lang.String m = "ImageLoader";
    private androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ExecutorService f78b;

    /* renamed from: c, reason: collision with root package name */
    private cn.bluemobi.dylan.base.utils.ImageLoader.Type f79c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.LinkedList<java.lang.Runnable> f80d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.Thread f81e;

    /* renamed from: f, reason: collision with root package name */
    private android.os.Handler f82f;

    /* renamed from: g, reason: collision with root package name */
    private android.os.Handler f83g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.concurrent.Semaphore f84h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.concurrent.Semaphore f85i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f86j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<cn.bluemobi.dylan.base.utils.ImageLoader.Type> {
        private static final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader.Type[] $VALUES = null;
        public static final cn.bluemobi.dylan.base.utils.ImageLoader.Type FIFO = null;
        public static final cn.bluemobi.dylan.base.utils.ImageLoader.Type LIFO = null;

        static {
                cn.bluemobi.dylan.base.utils.ImageLoader$Type r0 = new cn.bluemobi.dylan.base.utils.ImageLoader$Type
                java.lang.String r1 = "FIFO"
                r2 = 0
                r0.<init>(r1, r2)
                cn.bluemobi.dylan.base.utils.ImageLoader.Type.FIFO = r0
                cn.bluemobi.dylan.base.utils.ImageLoader$Type r1 = new cn.bluemobi.dylan.base.utils.ImageLoader$Type
                java.lang.String r3 = "LIFO"
                r4 = 1
                r1.<init>(r3, r4)
                cn.bluemobi.dylan.base.utils.ImageLoader.Type.LIFO = r1
                r3 = 2
                cn.bluemobi.dylan.base.utils.ImageLoader$Type[] r3 = new cn.bluemobi.dylan.base.utils.ImageLoader.Type[r3]
                r3[r2] = r0
                r3[r4] = r1
                cn.bluemobi.dylan.base.utils.ImageLoader.Type.$VALUES = r3
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.bluemobi.dylan.base.utils.ImageLoader.Type valueOf(java.lang.String r1) {
                java.lang.Class<cn.bluemobi.dylan.base.utils.ImageLoader$Type> r0 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.bluemobi.dylan.base.utils.ImageLoader$Type r1 = (cn.bluemobi.dylan.base.utils.ImageLoader.Type) r1
                return r1
        }

        public static cn.bluemobi.dylan.base.utils.ImageLoader.Type[] values() {
                cn.bluemobi.dylan.base.utils.ImageLoader$Type[] r0 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.bluemobi.dylan.base.utils.ImageLoader$Type[] r0 = (cn.bluemobi.dylan.base.utils.ImageLoader.Type[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> {
        final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader a;

        a(cn.bluemobi.dylan.base.utils.ImageLoader r1, int r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        protected int a(java.lang.String r1, android.graphics.Bitmap r2) {
                r0 = this;
                int r1 = r2.getRowBytes()
                int r2 = r2.getHeight()
                int r1 = r1 * r2
                return r1
        }

        protected /* bridge */ /* synthetic */ int sizeOf(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends java.lang.Thread {
        final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends android.os.Handler {
            final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader.b a;

            a(cn.bluemobi.dylan.base.utils.ImageLoader.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.os.Handler
            public void handleMessage(android.os.Message r2) {
                    r1 = this;
                    cn.bluemobi.dylan.base.utils.ImageLoader$b r2 = r1.a
                    cn.bluemobi.dylan.base.utils.ImageLoader r2 = r2.a
                    java.util.concurrent.ExecutorService r2 = cn.bluemobi.dylan.base.utils.ImageLoader.c(r2)
                    cn.bluemobi.dylan.base.utils.ImageLoader$b r0 = r1.a
                    cn.bluemobi.dylan.base.utils.ImageLoader r0 = r0.a
                    java.lang.Runnable r0 = cn.bluemobi.dylan.base.utils.ImageLoader.b(r0)
                    r2.execute(r0)
                    cn.bluemobi.dylan.base.utils.ImageLoader$b r2 = r1.a     // Catch: java.lang.InterruptedException -> L1e
                    cn.bluemobi.dylan.base.utils.ImageLoader r2 = r2.a     // Catch: java.lang.InterruptedException -> L1e
                    java.util.concurrent.Semaphore r2 = cn.bluemobi.dylan.base.utils.ImageLoader.d(r2)     // Catch: java.lang.InterruptedException -> L1e
                    r2.acquire()     // Catch: java.lang.InterruptedException -> L1e
                L1e:
                    return
            }
        }

        b(cn.bluemobi.dylan.base.utils.ImageLoader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r2 = this;
                android.os.Looper.prepare()
                cn.bluemobi.dylan.base.utils.ImageLoader r0 = r2.a
                cn.bluemobi.dylan.base.utils.ImageLoader$b$a r1 = new cn.bluemobi.dylan.base.utils.ImageLoader$b$a
                r1.<init>(r2)
                cn.bluemobi.dylan.base.utils.ImageLoader.a(r0, r1)
                cn.bluemobi.dylan.base.utils.ImageLoader r0 = r2.a
                java.util.concurrent.Semaphore r0 = cn.bluemobi.dylan.base.utils.ImageLoader.e(r0)
                r0.release()
                android.os.Looper.loop()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.os.Handler {
        final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader a;

        c(cn.bluemobi.dylan.base.utils.ImageLoader r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                java.lang.Object r4 = r4.obj
                cn.bluemobi.dylan.base.utils.ImageLoader$e r4 = (cn.bluemobi.dylan.base.utils.ImageLoader.e) r4
                android.graphics.Bitmap r0 = r4.a
                android.widget.ImageView r1 = r4.f90b
                java.lang.String r4 = r4.f91c
                java.lang.Object r2 = r1.getTag()
                java.lang.String r2 = r2.toString()
                boolean r4 = r2.equals(r4)
                if (r4 == 0) goto L1b
                r1.setImageBitmap(r0)
            L1b:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements java.lang.Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.widget.ImageView f87b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f88c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader f89d;

        d(cn.bluemobi.dylan.base.utils.ImageLoader r1, boolean r2, android.widget.ImageView r3, java.lang.String r4) {
                r0 = this;
                r0.f89d = r1
                r0.a = r2
                r0.f87b = r3
                r0.f88c = r4
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                boolean r0 = r4.a
                if (r0 == 0) goto L56
                cn.bluemobi.dylan.base.utils.ImageLoader r0 = r4.f89d
                android.widget.ImageView r1 = r4.f87b
                android.content.Context r1 = r1.getContext()
                cn.bluemobi.dylan.base.utils.ImageLoader r2 = r4.f89d
                java.lang.String r3 = r4.f88c
                java.lang.String r2 = r2.w(r3)
                java.io.File r0 = r0.o(r1, r2)
                boolean r1 = r0.exists()
                if (r1 == 0) goto L2b
                cn.bluemobi.dylan.base.utils.ImageLoader r1 = r4.f89d
                java.lang.String r0 = r0.getAbsolutePath()
                android.widget.ImageView r2 = r4.f87b
                android.graphics.Bitmap r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f(r1, r0, r2)
                goto L60
            L2b:
                cn.bluemobi.dylan.base.utils.ImageLoader r1 = r4.f89d
                boolean r1 = cn.bluemobi.dylan.base.utils.ImageLoader.g(r1)
                if (r1 == 0) goto L4d
                java.lang.String r1 = r4.f88c
                boolean r1 = cn.bluemobi.dylan.base.utils.e.c(r1, r0)
                if (r1 == 0) goto L4b
                r0.getAbsolutePath()
                cn.bluemobi.dylan.base.utils.ImageLoader r1 = r4.f89d
                java.lang.String r0 = r0.getAbsolutePath()
                android.widget.ImageView r2 = r4.f87b
                android.graphics.Bitmap r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f(r1, r0, r2)
                goto L60
            L4b:
                r0 = 0
                goto L60
            L4d:
                java.lang.String r0 = r4.f88c
                android.widget.ImageView r1 = r4.f87b
                android.graphics.Bitmap r0 = cn.bluemobi.dylan.base.utils.e.b(r0, r1)
                goto L60
            L56:
                cn.bluemobi.dylan.base.utils.ImageLoader r0 = r4.f89d
                java.lang.String r1 = r4.f88c
                android.widget.ImageView r2 = r4.f87b
                android.graphics.Bitmap r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f(r0, r1, r2)
            L60:
                cn.bluemobi.dylan.base.utils.ImageLoader r1 = r4.f89d
                java.lang.String r2 = r4.f88c
                r1.i(r2, r0)
                cn.bluemobi.dylan.base.utils.ImageLoader r1 = r4.f89d
                java.lang.String r2 = r4.f88c
                android.widget.ImageView r3 = r4.f87b
                cn.bluemobi.dylan.base.utils.ImageLoader.h(r1, r2, r3, r0)
                cn.bluemobi.dylan.base.utils.ImageLoader r0 = r4.f89d
                java.util.concurrent.Semaphore r0 = cn.bluemobi.dylan.base.utils.ImageLoader.d(r0)
                r0.release()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e {
        android.graphics.Bitmap a;

        /* renamed from: b, reason: collision with root package name */
        android.widget.ImageView f90b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f91c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ cn.bluemobi.dylan.base.utils.ImageLoader f92d;

        private e(cn.bluemobi.dylan.base.utils.ImageLoader r1) {
                r0 = this;
                r0.f92d = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(cn.bluemobi.dylan.base.utils.ImageLoader r1, cn.bluemobi.dylan.base.utils.ImageLoader.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    private ImageLoader(int r3, cn.bluemobi.dylan.base.utils.ImageLoader.Type r4) {
            r2 = this;
            r2.<init>()
            cn.bluemobi.dylan.base.utils.ImageLoader$Type r0 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.LIFO
            r2.f79c = r0
            java.util.concurrent.Semaphore r0 = new java.util.concurrent.Semaphore
            r1 = 0
            r0.<init>(r1)
            r2.f84h = r0
            r0 = 1
            r2.f86j = r0
            r2.s(r3, r4)
            return
    }

    static /* synthetic */ android.os.Handler a(cn.bluemobi.dylan.base.utils.ImageLoader r0, android.os.Handler r1) {
            r0.f82f = r1
            return r1
    }

    static /* synthetic */ java.lang.Runnable b(cn.bluemobi.dylan.base.utils.ImageLoader r0) {
            java.lang.Runnable r0 = r0.r()
            return r0
    }

    static /* synthetic */ java.util.concurrent.ExecutorService c(cn.bluemobi.dylan.base.utils.ImageLoader r0) {
            java.util.concurrent.ExecutorService r0 = r0.f78b
            return r0
    }

    static /* synthetic */ java.util.concurrent.Semaphore d(cn.bluemobi.dylan.base.utils.ImageLoader r0) {
            java.util.concurrent.Semaphore r0 = r0.f85i
            return r0
    }

    static /* synthetic */ java.util.concurrent.Semaphore e(cn.bluemobi.dylan.base.utils.ImageLoader r0) {
            java.util.concurrent.Semaphore r0 = r0.f84h
            return r0
    }

    static /* synthetic */ android.graphics.Bitmap f(cn.bluemobi.dylan.base.utils.ImageLoader r0, java.lang.String r1, android.widget.ImageView r2) {
            android.graphics.Bitmap r0 = r0.v(r1, r2)
            return r0
    }

    static /* synthetic */ boolean g(cn.bluemobi.dylan.base.utils.ImageLoader r0) {
            boolean r0 = r0.f86j
            return r0
    }

    static /* synthetic */ void h(cn.bluemobi.dylan.base.utils.ImageLoader r0, java.lang.String r1, android.widget.ImageView r2, android.graphics.Bitmap r3) {
            r0.x(r1, r2, r3)
            return
    }

    private synchronized void j(java.lang.Runnable r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedList<java.lang.Runnable> r0 = r1.f80d     // Catch: java.lang.Throwable -> L10
            r0.add(r2)     // Catch: java.lang.Throwable -> L10
            android.os.Handler r2 = r1.f82f     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            if (r2 != 0) goto L12
            java.util.concurrent.Semaphore r2 = r1.f84h     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            r2.acquire()     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            goto L12
        L10:
            r2 = move-exception
            goto L1b
        L12:
            android.os.Handler r2 = r1.f82f     // Catch: java.lang.Throwable -> L10
            r0 = 272(0x110, float:3.81E-43)
            r2.sendEmptyMessage(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    private java.lang.Runnable k(java.lang.String r2, android.widget.ImageView r3, boolean r4) {
            r1 = this;
            cn.bluemobi.dylan.base.utils.ImageLoader$d r0 = new cn.bluemobi.dylan.base.utils.ImageLoader$d
            r0.<init>(r1, r4, r3, r2)
            return r0
    }

    private android.graphics.Bitmap n(java.lang.String r2) {
            r1 = this;
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    public static cn.bluemobi.dylan.base.utils.ImageLoader p() {
            cn.bluemobi.dylan.base.utils.ImageLoader r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k
            if (r0 != 0) goto L1c
            java.lang.Class<cn.bluemobi.dylan.base.utils.ImageLoader> r0 = cn.bluemobi.dylan.base.utils.ImageLoader.class
            monitor-enter(r0)
            cn.bluemobi.dylan.base.utils.ImageLoader r1 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            cn.bluemobi.dylan.base.utils.ImageLoader r1 = new cn.bluemobi.dylan.base.utils.ImageLoader     // Catch: java.lang.Throwable -> L16
            cn.bluemobi.dylan.base.utils.ImageLoader$Type r2 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.LIFO     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L16
            cn.bluemobi.dylan.base.utils.ImageLoader.f77k = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
        L1c:
            cn.bluemobi.dylan.base.utils.ImageLoader r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k
            return r0
    }

    public static cn.bluemobi.dylan.base.utils.ImageLoader q(int r2, cn.bluemobi.dylan.base.utils.ImageLoader.Type r3) {
            cn.bluemobi.dylan.base.utils.ImageLoader r0 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k
            if (r0 != 0) goto L19
            java.lang.Class<cn.bluemobi.dylan.base.utils.ImageLoader> r0 = cn.bluemobi.dylan.base.utils.ImageLoader.class
            monitor-enter(r0)
            cn.bluemobi.dylan.base.utils.ImageLoader r1 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.bluemobi.dylan.base.utils.ImageLoader r1 = new cn.bluemobi.dylan.base.utils.ImageLoader     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
            cn.bluemobi.dylan.base.utils.ImageLoader.f77k = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            cn.bluemobi.dylan.base.utils.ImageLoader r2 = cn.bluemobi.dylan.base.utils.ImageLoader.f77k
            return r2
    }

    private java.lang.Runnable r() {
            r2 = this;
            cn.bluemobi.dylan.base.utils.ImageLoader$Type r0 = r2.f79c
            cn.bluemobi.dylan.base.utils.ImageLoader$Type r1 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.FIFO
            if (r0 != r1) goto Lf
            java.util.LinkedList<java.lang.Runnable> r0 = r2.f80d
            java.lang.Object r0 = r0.removeFirst()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
        Lf:
            cn.bluemobi.dylan.base.utils.ImageLoader$Type r1 = cn.bluemobi.dylan.base.utils.ImageLoader.Type.LIFO
            if (r0 != r1) goto L1c
            java.util.LinkedList<java.lang.Runnable> r0 = r2.f80d
            java.lang.Object r0 = r0.removeLast()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
        L1c:
            r0 = 0
            return r0
    }

    private void s(int r3, cn.bluemobi.dylan.base.utils.ImageLoader.Type r4) {
            r2 = this;
            r2.t()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            int r1 = (int) r0
            int r1 = r1 / 8
            cn.bluemobi.dylan.base.utils.ImageLoader$a r0 = new cn.bluemobi.dylan.base.utils.ImageLoader$a
            r0.<init>(r2, r1)
            r2.a = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r3)
            r2.f78b = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.f80d = r0
            r2.f79c = r4
            java.util.concurrent.Semaphore r4 = new java.util.concurrent.Semaphore
            r4.<init>(r3)
            r2.f85i = r4
            return
    }

    private void t() {
            r1 = this;
            cn.bluemobi.dylan.base.utils.ImageLoader$b r0 = new cn.bluemobi.dylan.base.utils.ImageLoader$b
            r0.<init>(r1)
            r1.f81e = r0
            r0.start()
            return
    }

    private android.graphics.Bitmap v(java.lang.String r2, android.widget.ImageView r3) {
            r1 = this;
            cn.bluemobi.dylan.base.utils.i$a r3 = cn.bluemobi.dylan.base.utils.i.c(r3)
            int r0 = r3.a
            int r3 = r3.f116b
            android.graphics.Bitmap r2 = r1.m(r2, r0, r3)
            return r2
    }

    private void x(java.lang.String r4, android.widget.ImageView r5, android.graphics.Bitmap r6) {
            r3 = this;
            android.os.Message r0 = android.os.Message.obtain()
            cn.bluemobi.dylan.base.utils.ImageLoader$e r1 = new cn.bluemobi.dylan.base.utils.ImageLoader$e
            r2 = 0
            r1.<init>(r3, r2)
            r1.a = r6
            r1.f91c = r4
            r1.f90b = r5
            r0.obj = r1
            android.os.Handler r4 = r3.f83g
            r4.sendMessage(r0)
            return
    }

    protected void i(java.lang.String r2, android.graphics.Bitmap r3) {
            r1 = this;
            android.graphics.Bitmap r0 = r1.n(r2)
            if (r0 != 0) goto Ld
            if (r3 == 0) goto Ld
            androidx.collection.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r1.a
            r0.put(r2, r3)
        Ld:
            return
    }

    public java.lang.String l(byte[] r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2f
            r3 = r7[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L29
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "0"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L29:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L2f:
            java.lang.String r7 = r0.toString()
            return r7
    }

    protected android.graphics.Bitmap m(java.lang.String r3, int r4, int r5) {
            r2 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.graphics.BitmapFactory.decodeFile(r3, r0)
            int r4 = cn.bluemobi.dylan.base.utils.i.a(r0, r4, r5)
            r0.inSampleSize = r4
            r4 = 0
            r0.inJustDecodeBounds = r4
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3, r0)
            return r3
    }

    public java.io.File o(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            java.io.File r3 = r3.getExternalCacheDir()
            java.lang.String r3 = r3.getPath()
            goto L1d
        L15:
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r3 = r3.getPath()
        L1d:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = java.io.File.separator
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    public void u(java.lang.String r2, android.widget.ImageView r3, boolean r4) {
            r1 = this;
            r3.setTag(r2)
            android.os.Handler r0 = r1.f83g
            if (r0 != 0) goto Le
            cn.bluemobi.dylan.base.utils.ImageLoader$c r0 = new cn.bluemobi.dylan.base.utils.ImageLoader$c
            r0.<init>(r1)
            r1.f83g = r0
        Le:
            android.graphics.Bitmap r0 = r1.n(r2)
            if (r0 == 0) goto L18
            r1.x(r2, r3, r0)
            return
        L18:
            java.lang.Runnable r2 = r1.k(r2, r3, r4)
            r1.j(r2)
            return
    }

    public java.lang.String w(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "md5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r2 = r2.getBytes()     // Catch: java.security.NoSuchAlgorithmException -> L13
            byte[] r2 = r0.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> L13
            java.lang.String r2 = r1.l(r2)     // Catch: java.security.NoSuchAlgorithmException -> L13
            return r2
        L13:
            r2 = 0
            return r2
    }
}
