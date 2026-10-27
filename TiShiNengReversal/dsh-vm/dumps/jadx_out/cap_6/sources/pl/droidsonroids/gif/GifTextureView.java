package pl.droidsonroids.gif;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GifTextureView extends android.view.TextureView {
    private static final android.widget.ImageView.ScaleType[] g = null;
    private android.widget.ImageView.ScaleType a;
    private final android.graphics.Matrix b;
    private pl.droidsonroids.gif.l c;
    private pl.droidsonroids.gif.GifTextureView.c d;
    private float e;
    private pl.droidsonroids.gif.k.b f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pl.droidsonroids.gif.GifTextureView.a.a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = pl.droidsonroids.gif.GifTextureView.a.a     // Catch: java.lang.NoSuchFieldError -> L60
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(android.graphics.Canvas r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends java.lang.Thread implements android.view.TextureView.SurfaceTextureListener {
        final pl.droidsonroids.gif.c a;
        private pl.droidsonroids.gif.GifInfoHandle b;
        private java.io.IOException c;
        long[] d;
        private final java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.lang.Runnable {
            final /* synthetic */ pl.droidsonroids.gif.GifTextureView a;
            final /* synthetic */ pl.droidsonroids.gif.GifTextureView.c b;

            a(pl.droidsonroids.gif.GifTextureView.c r1, pl.droidsonroids.gif.GifTextureView r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    pl.droidsonroids.gif.GifTextureView r0 = r2.a
                    pl.droidsonroids.gif.GifTextureView$c r1 = r2.b
                    pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifTextureView.c.a(r1)
                    pl.droidsonroids.gif.GifTextureView.d(r0, r1)
                    return
            }
        }

        c(pl.droidsonroids.gif.GifTextureView r2) {
                r1 = this;
                java.lang.String r0 = "GifRenderThread"
                r1.<init>(r0)
                pl.droidsonroids.gif.c r0 = new pl.droidsonroids.gif.c
                r0.<init>()
                r1.a = r0
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                r0.<init>()
                r1.b = r0
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.e = r0
                return
        }

        static /* synthetic */ pl.droidsonroids.gif.GifInfoHandle a(pl.droidsonroids.gif.GifTextureView.c r0) {
                pl.droidsonroids.gif.GifInfoHandle r0 = r0.b
                return r0
        }

        static /* synthetic */ java.io.IOException b(pl.droidsonroids.gif.GifTextureView.c r0) {
                java.io.IOException r0 = r0.c
                return r0
        }

        void c(@androidx.annotation.NonNull pl.droidsonroids.gif.GifTextureView r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifTextureView.b r3) {
                r1 = this;
                pl.droidsonroids.gif.c r0 = r1.a
                r0.b()
                if (r3 == 0) goto Ld
                pl.droidsonroids.gif.p r0 = new pl.droidsonroids.gif.p
                r0.<init>(r3)
                goto Le
            Ld:
                r0 = 0
            Le:
                pl.droidsonroids.gif.GifTextureView.c(r2, r0)
                pl.droidsonroids.gif.GifInfoHandle r2 = r1.b
                r2.z()
                r1.interrupt()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r1 = r0.e
                java.lang.Object r1 = r1.get()
                pl.droidsonroids.gif.GifTextureView r1 = (pl.droidsonroids.gif.GifTextureView) r1
                if (r1 == 0) goto Lf
                pl.droidsonroids.gif.GifInfoHandle r2 = r0.b
                pl.droidsonroids.gif.GifTextureView.d(r1, r2)
            Lf:
                pl.droidsonroids.gif.c r1 = r0.a
                r1.c()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
                r0 = this;
                pl.droidsonroids.gif.c r1 = r0.a
                r1.b()
                pl.droidsonroids.gif.GifInfoHandle r1 = r0.b
                r1.z()
                r0.interrupt()
                r1 = 1
                return r1
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
                r0 = this;
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r4 = this;
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.e     // Catch: java.io.IOException -> L31
                java.lang.Object r0 = r0.get()     // Catch: java.io.IOException -> L31
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0     // Catch: java.io.IOException -> L31
                if (r0 != 0) goto Lb
                return
            Lb:
                pl.droidsonroids.gif.l r1 = pl.droidsonroids.gif.GifTextureView.a(r0)     // Catch: java.io.IOException -> L31
                pl.droidsonroids.gif.GifInfoHandle r1 = r1.c()     // Catch: java.io.IOException -> L31
                r4.b = r1     // Catch: java.io.IOException -> L31
                boolean r2 = r0.isOpaque()     // Catch: java.io.IOException -> L31
                r3 = 1
                r1.K(r3, r2)     // Catch: java.io.IOException -> L31
                pl.droidsonroids.gif.k$b r1 = pl.droidsonroids.gif.GifTextureView.b(r0)     // Catch: java.io.IOException -> L31
                int r1 = r1.b     // Catch: java.io.IOException -> L31
                if (r1 < 0) goto L34
                pl.droidsonroids.gif.GifInfoHandle r1 = r4.b     // Catch: java.io.IOException -> L31
                pl.droidsonroids.gif.k$b r0 = pl.droidsonroids.gif.GifTextureView.b(r0)     // Catch: java.io.IOException -> L31
                int r0 = r0.b     // Catch: java.io.IOException -> L31
                r1.J(r0)     // Catch: java.io.IOException -> L31
                goto L34
            L31:
                r0 = move-exception
                goto La9
            L34:
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.e
                java.lang.Object r0 = r0.get()
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0
                if (r0 != 0) goto L44
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.b
                r0.A()
                return
            L44:
                pl.droidsonroids.gif.GifTextureView.c(r0, r4)
                boolean r1 = r0.isAvailable()
                pl.droidsonroids.gif.c r2 = r4.a
                r2.d(r1)
                if (r1 == 0) goto L5a
                pl.droidsonroids.gif.GifTextureView$c$a r1 = new pl.droidsonroids.gif.GifTextureView$c$a
                r1.<init>(r4, r0)
                r0.post(r1)
            L5a:
                pl.droidsonroids.gif.GifInfoHandle r1 = r4.b
                float r0 = pl.droidsonroids.gif.GifTextureView.e(r0)
                r1.L(r0)
            L63:
                boolean r0 = r4.isInterrupted()
                if (r0 != 0) goto L9c
                pl.droidsonroids.gif.c r0 = r4.a     // Catch: java.lang.InterruptedException -> L95
                r0.a()     // Catch: java.lang.InterruptedException -> L95
                java.lang.ref.WeakReference<pl.droidsonroids.gif.GifTextureView> r0 = r4.e
                java.lang.Object r0 = r0.get()
                pl.droidsonroids.gif.GifTextureView r0 = (pl.droidsonroids.gif.GifTextureView) r0
                if (r0 != 0) goto L79
                goto L9c
            L79:
                android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
                if (r0 != 0) goto L80
                goto L63
            L80:
                android.view.Surface r1 = new android.view.Surface
                r1.<init>(r0)
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.b     // Catch: java.lang.Throwable -> L90
                long[] r2 = r4.d     // Catch: java.lang.Throwable -> L90
                r0.a(r1, r2)     // Catch: java.lang.Throwable -> L90
                r1.release()
                goto L63
            L90:
                r0 = move-exception
                r1.release()
                throw r0
            L95:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L9c:
                pl.droidsonroids.gif.GifInfoHandle r0 = r4.b
                r0.A()
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                r0.<init>()
                r4.b = r0
                return
            La9:
                r4.c = r0
                return
        }
    }

    static {
            r0 = 8
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r2 = 0
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r2 = 1
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            r2 = 2
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2 = 3
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r2 = 4
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r2 = 5
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2 = 6
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2 = 7
            r0[r2] = r1
            pl.droidsonroids.gif.GifTextureView.g = r0
            return
    }

    public GifTextureView(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.a = r2
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r1.b = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.e = r2
            r2 = 0
            r0 = 0
            r1.g(r2, r0, r0)
            return
    }

    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.a = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.b = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.e = r1
            r1 = 0
            r0.g(r2, r1, r1)
            return
    }

    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.a = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.b = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.e = r1
            r1 = 0
            r0.g(r2, r3, r1)
            return
    }

    @androidx.annotation.RequiresApi(21)
    public GifTextureView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.a = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.b = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.e = r1
            r0.g(r2, r3, r4)
            return
    }

    static /* synthetic */ pl.droidsonroids.gif.l a(pl.droidsonroids.gif.GifTextureView r0) {
            pl.droidsonroids.gif.l r0 = r0.c
            return r0
    }

    static /* synthetic */ pl.droidsonroids.gif.k.b b(pl.droidsonroids.gif.GifTextureView r0) {
            pl.droidsonroids.gif.k$b r0 = r0.f
            return r0
    }

    static /* synthetic */ void c(pl.droidsonroids.gif.GifTextureView r0, android.view.TextureView.SurfaceTextureListener r1) {
            r0.setSuperSurfaceTextureListener(r1)
            return
    }

    static /* synthetic */ void d(pl.droidsonroids.gif.GifTextureView r0, pl.droidsonroids.gif.GifInfoHandle r1) {
            r0.i(r1)
            return
    }

    static /* synthetic */ float e(pl.droidsonroids.gif.GifTextureView r0) {
            float r0 = r0.e
            return r0
    }

    private static pl.droidsonroids.gif.l f(android.content.res.TypedArray r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            int r1 = pl.droidsonroids.gif.R.styleable.GifTextureView_gifSource
            boolean r1 = r3.getValue(r1, r0)
            if (r1 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            int r1 = r0.resourceId
            if (r1 == 0) goto L56
            android.content.res.Resources r1 = r3.getResources()
            int r2 = r0.resourceId
            java.lang.String r1 = r1.getResourceTypeName(r2)
            java.util.List<java.lang.String> r2 = pl.droidsonroids.gif.k.b
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L31
            pl.droidsonroids.gif.l$i r1 = new pl.droidsonroids.gif.l$i
            android.content.res.Resources r3 = r3.getResources()
            int r0 = r0.resourceId
            r1.<init>(r3, r0)
            return r1
        L31:
            java.lang.String r2 = "string"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L3a
            goto L56
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Expected string, drawable, mipmap or raw resource type. '"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "' is not supported"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L56:
            pl.droidsonroids.gif.l$c r1 = new pl.droidsonroids.gif.l$c
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.AssetManager r3 = r3.getAssets()
            java.lang.CharSequence r0 = r0.string
            java.lang.String r0 = r0.toString()
            r1.<init>(r3, r0)
            return r1
    }

    private void g(android.util.AttributeSet r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L3b
            java.lang.String r1 = "scaleType"
            r2 = -1
            java.lang.String r3 = "http://schemas.android.com/apk/res/android"
            int r1 = r5.getAttributeIntValue(r3, r1, r2)
            if (r1 < 0) goto L17
            android.widget.ImageView$ScaleType[] r2 = pl.droidsonroids.gif.GifTextureView.g
            int r3 = r2.length
            if (r1 >= r3) goto L17
            r1 = r2[r1]
            r4.a = r1
        L17:
            android.content.Context r1 = r4.getContext()
            int[] r2 = pl.droidsonroids.gif.R.styleable.GifTextureView
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r5, r2, r6, r7)
            pl.droidsonroids.gif.l r2 = f(r1)
            r4.c = r2
            int r2 = pl.droidsonroids.gif.R.styleable.GifTextureView_isOpaque
            boolean r0 = r1.getBoolean(r2, r0)
            super.setOpaque(r0)
            r1.recycle()
            pl.droidsonroids.gif.k$b r0 = new pl.droidsonroids.gif.k$b
            r0.<init>(r4, r5, r6, r7)
            r4.f = r0
            goto L45
        L3b:
            super.setOpaque(r0)
            pl.droidsonroids.gif.k$b r5 = new pl.droidsonroids.gif.k$b
            r5.<init>()
            r4.f = r5
        L45:
            boolean r5 = r4.isInEditMode()
            if (r5 != 0) goto L59
            pl.droidsonroids.gif.GifTextureView$c r5 = new pl.droidsonroids.gif.GifTextureView$c
            r5.<init>(r4)
            r4.d = r5
            pl.droidsonroids.gif.l r6 = r4.c
            if (r6 == 0) goto L59
            r5.start()
        L59:
            return
    }

    private void i(pl.droidsonroids.gif.GifInfoHandle r11) {
            r10 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r10.getWidth()
            float r1 = (float) r1
            int r2 = r10.getHeight()
            float r2 = (float) r2
            int r3 = r11.q()
            float r3 = (float) r3
            float r3 = r3 / r1
            int r4 = r11.i()
            float r4 = (float) r4
            float r4 = r4 / r2
            android.graphics.RectF r5 = new android.graphics.RectF
            int r6 = r11.q()
            float r6 = (float) r6
            int r7 = r11.i()
            float r7 = (float) r7
            r8 = 0
            r5.<init>(r8, r8, r6, r7)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r8, r8, r1, r2)
            int[] r7 = pl.droidsonroids.gif.GifTextureView.a.a
            android.widget.ImageView$ScaleType r8 = r10.a
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L9a;
                case 2: goto L8b;
                case 3: goto L67;
                case 4: goto L5e;
                case 5: goto L55;
                case 6: goto L4c;
                case 7: goto L4b;
                case 8: goto L42;
                default: goto L41;
            }
        L41:
            goto L9f
        L42:
            android.graphics.Matrix r11 = r10.b
            r0.set(r11)
            r0.preScale(r3, r4)
            goto L9f
        L4b:
            return
        L4c:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L55:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L5e:
            android.graphics.Matrix$ScaleToFit r11 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r5, r6, r11)
            r0.preScale(r3, r4)
            goto L9f
        L67:
            int r5 = r11.q()
            float r5 = (float) r5
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L7a
            int r11 = r11.i()
            float r11 = (float) r11
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 > 0) goto L7a
            goto L81
        L7a:
            float r11 = r8 / r3
            float r8 = r8 / r4
            float r8 = java.lang.Math.min(r11, r8)
        L81:
            float r3 = r3 * r8
            float r8 = r8 * r4
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r8, r1, r2)
            goto L9f
        L8b:
            float r11 = java.lang.Math.min(r3, r4)
            float r8 = r8 / r11
            float r3 = r3 * r8
            float r8 = r8 * r4
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r8, r1, r2)
            goto L9f
        L9a:
            float r1 = r1 / r9
            float r2 = r2 / r9
            r0.setScale(r3, r4, r1, r2)
        L9f:
            super.setTransform(r0)
            return
    }

    private void setSuperSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener r1) {
            r0 = this;
            super.setSurfaceTextureListener(r1)
            return
    }

    @androidx.annotation.Nullable
    public java.io.IOException getIOException() {
            r1 = this;
            pl.droidsonroids.gif.GifTextureView$c r0 = r1.d
            java.io.IOException r0 = pl.droidsonroids.gif.GifTextureView.c.b(r0)
            if (r0 == 0) goto Lf
            pl.droidsonroids.gif.GifTextureView$c r0 = r1.d
            java.io.IOException r0 = pl.droidsonroids.gif.GifTextureView.c.b(r0)
            return r0
        Lf:
            pl.droidsonroids.gif.GifTextureView$c r0 = r1.d
            pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifTextureView.c.a(r0)
            int r0 = r0.l()
            pl.droidsonroids.gif.GifIOException r0 = pl.droidsonroids.gif.GifIOException.fromCode(r0)
            return r0
    }

    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.a
            return r0
    }

    @Override // android.view.TextureView
    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.TextureView
    public android.graphics.Matrix getTransform(android.graphics.Matrix r2) {
            r1 = this;
            if (r2 != 0) goto L7
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
        L7:
            android.graphics.Matrix r0 = r1.b
            r2.set(r0)
            return r2
    }

    public synchronized void h(@androidx.annotation.Nullable pl.droidsonroids.gif.l r2, @androidx.annotation.Nullable pl.droidsonroids.gif.GifTextureView.b r3) {
            r1 = this;
            monitor-enter(r1)
            pl.droidsonroids.gif.GifTextureView$c r0 = r1.d     // Catch: java.lang.Throwable -> Lc
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> Lc
            pl.droidsonroids.gif.GifTextureView$c r3 = r1.d     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            r3.join()     // Catch: java.lang.Throwable -> Lc java.lang.InterruptedException -> Le
            goto Le
        Lc:
            r2 = move-exception
            goto L1e
        Le:
            r1.c = r2     // Catch: java.lang.Throwable -> Lc
            pl.droidsonroids.gif.GifTextureView$c r3 = new pl.droidsonroids.gif.GifTextureView$c     // Catch: java.lang.Throwable -> Lc
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lc
            r1.d = r3     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L1c
            r3.start()     // Catch: java.lang.Throwable -> Lc
        L1c:
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            pl.droidsonroids.gif.GifTextureView$c r0 = r2.d
            r1 = 0
            r0.c(r2, r1)
            super.onDetachedFromWindow()
            android.graphics.SurfaceTexture r0 = r2.getSurfaceTexture()
            if (r0 == 0) goto L12
            r0.release()
        L12:
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof pl.droidsonroids.gif.GifViewSavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            pl.droidsonroids.gif.GifViewSavedState r3 = (pl.droidsonroids.gif.GifViewSavedState) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            pl.droidsonroids.gif.GifTextureView$c r0 = r2.d
            long[][] r3 = r3.a
            r1 = 0
            r3 = r3[r1]
            r0.d = r3
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            pl.droidsonroids.gif.GifTextureView$c r0 = r3.d
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifTextureView.c.a(r0)
            long[] r1 = r1.o()
            r0.d = r1
            pl.droidsonroids.gif.GifViewSavedState r0 = new pl.droidsonroids.gif.GifViewSavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            pl.droidsonroids.gif.k$b r2 = r3.f
            boolean r2 = r2.a
            if (r2 == 0) goto L1d
            pl.droidsonroids.gif.GifTextureView$c r2 = r3.d
            long[] r2 = r2.d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            r0.<init>(r1, r2)
            return r0
    }

    public void setFreezesAnimation(boolean r2) {
            r1 = this;
            pl.droidsonroids.gif.k$b r0 = r1.f
            r0.a = r2
            return
    }

    public void setImageMatrix(android.graphics.Matrix r1) {
            r0 = this;
            r0.setTransform(r1)
            return
    }

    public synchronized void setInputSource(@androidx.annotation.Nullable pl.droidsonroids.gif.l r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            r1.h(r2, r0)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean r2) {
            r1 = this;
            boolean r0 = r1.isOpaque()
            if (r2 == r0) goto Le
            super.setOpaque(r2)
            pl.droidsonroids.gif.l r2 = r1.c
            r1.setInputSource(r2)
        Le:
            return
    }

    public void setScaleType(@androidx.annotation.NonNull android.widget.ImageView.ScaleType r1) {
            r0 = this;
            r0.a = r1
            pl.droidsonroids.gif.GifTextureView$c r1 = r0.d
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifTextureView.c.a(r1)
            r0.i(r1)
            return
    }

    public void setSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            r1.e = r2
            pl.droidsonroids.gif.GifTextureView$c r0 = r1.d
            pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifTextureView.c.a(r0)
            r0.L(r2)
            return
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(android.graphics.SurfaceTexture r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing SurfaceTexture is not supported"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing SurfaceTextureListener is not supported"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.TextureView
    public void setTransform(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.b
            r0.set(r2)
            pl.droidsonroids.gif.GifTextureView$c r2 = r1.d
            pl.droidsonroids.gif.GifInfoHandle r2 = pl.droidsonroids.gif.GifTextureView.c.a(r2)
            r1.i(r2)
            return
    }
}
