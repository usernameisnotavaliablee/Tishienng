package com.devlin_n.videoplayer.player;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class IjkVideoView extends android.widget.FrameLayout implements com.devlin_n.videoplayer.controller.BaseVideoController.d {
    public static final int M = -1;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public static final int S = 5;
    public static final int T = 6;
    public static final int U = 7;
    public static final int V = 10;
    public static final int W = 11;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    public static final int k0 = 3;
    public static final int p0 = 4;
    protected boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener F;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener G;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener H;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener I;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener J;
    private tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener K;
    private com.danikula.videocache.e L;
    private tv.danmaku.ijk.media.player.IMediaPlayer a;

    @androidx.annotation.Nullable
    private com.devlin_n.videoplayer.controller.BaseVideoController b;
    private f1.d c;
    private com.devlin_n.videoplayer.widget.ResizeSurfaceView d;
    private com.devlin_n.videoplayer.widget.ResizeTextureView e;
    private android.graphics.SurfaceTexture f;
    private master.flame.danmaku.ui.widget.DanmakuView g;
    private master.flame.danmaku.danmaku.model.android.DanmakuContext h;
    private master.flame.danmaku.danmaku.parser.a i;
    private android.widget.FrameLayout j;
    private com.devlin_n.videoplayer.widget.StatusView k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private java.lang.String q;
    private java.util.List<com.devlin_n.videoplayer.player.b> r;
    private int s;
    private int t;
    private java.lang.String u;
    private int v;
    private android.media.AudioManager w;

    @androidx.annotation.NonNull
    private com.devlin_n.videoplayer.player.IjkVideoView.m x;
    private int y;
    protected android.view.OrientationEventListener z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        a(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onVideoSizeChanged(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r2 = r1.getVideoWidth()
                int r1 = r1.getVideoHeight()
                if (r2 == 0) goto L45
                if (r1 == 0) goto L45
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                boolean r3 = com.devlin_n.videoplayer.player.IjkVideoView.v(r3)
                if (r3 == 0) goto L2d
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                com.devlin_n.videoplayer.widget.ResizeSurfaceView r3 = com.devlin_n.videoplayer.player.IjkVideoView.y(r3)
                com.devlin_n.videoplayer.player.IjkVideoView r4 = r0.a
                int r4 = com.devlin_n.videoplayer.player.IjkVideoView.w(r4)
                r3.setScreenScale(r4)
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                com.devlin_n.videoplayer.widget.ResizeSurfaceView r3 = com.devlin_n.videoplayer.player.IjkVideoView.y(r3)
                r3.a(r2, r1)
                return
            L2d:
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                com.devlin_n.videoplayer.widget.ResizeTextureView r3 = com.devlin_n.videoplayer.player.IjkVideoView.D(r3)
                com.devlin_n.videoplayer.player.IjkVideoView r4 = r0.a
                int r4 = com.devlin_n.videoplayer.player.IjkVideoView.w(r4)
                r3.setScreenScale(r4)
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                com.devlin_n.videoplayer.widget.ResizeTextureView r3 = com.devlin_n.videoplayer.player.IjkVideoView.D(r3)
                r3.a(r2, r1)
            L45:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements com.danikula.videocache.e {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        b(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // com.danikula.videocache.e
        public void a(java.io.File r1, java.lang.String r2, int r3) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.player.IjkVideoView.u(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c extends android.view.OrientationEventListener {
        private static final int c = 1;
        private static final int d = 2;
        private static final int e = 3;
        private int a;
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView b;

        c(com.devlin_n.videoplayer.player.IjkVideoView r1, android.content.Context r2) {
                r0 = this;
                r0.b = r1
                r0.<init>(r2)
                r1 = 0
                r0.a = r1
                return
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int r5) {
                r4 = this;
                r0 = 340(0x154, float:4.76E-43)
                r1 = 3
                r2 = 2
                r3 = 1
                if (r5 < r0) goto L43
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = com.devlin_n.videoplayer.player.IjkVideoView.B(r5)
                if (r5 != 0) goto Lb3
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = com.devlin_n.videoplayer.player.IjkVideoView.C(r5)
                if (r5 == 0) goto L19
                goto Lb3
            L19:
                int r5 = r4.a
                if (r5 != r3) goto L1f
                goto Lb3
            L1f:
                if (r5 == r2) goto L23
                if (r5 != r1) goto L2e
            L23:
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = r5.a()
                if (r5 != 0) goto L2e
                r4.a = r3
                return
            L2e:
                r4.a = r3
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                android.content.Context r5 = r5.getContext()
                android.app.Activity r5 = g1.f.l(r5)
                r5.setRequestedOrientation(r3)
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                r5.g()
                return
            L43:
                r0 = 260(0x104, float:3.64E-43)
                if (r5 < r0) goto L7b
                r0 = 280(0x118, float:3.92E-43)
                if (r5 > r0) goto L7b
                int r5 = r4.a
                if (r5 != r2) goto L50
                goto Lb3
            L50:
                if (r5 != r3) goto L5d
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = r5.a()
                if (r5 == 0) goto L5d
                r4.a = r2
                return
            L5d:
                r4.a = r2
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = r5.a()
                if (r5 != 0) goto L6c
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                r5.i()
            L6c:
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                android.content.Context r5 = r5.getContext()
                android.app.Activity r5 = g1.f.l(r5)
                r0 = 0
                r5.setRequestedOrientation(r0)
                return
            L7b:
                r0 = 70
                if (r5 < r0) goto Lb3
                r0 = 90
                if (r5 > r0) goto Lb3
                int r5 = r4.a
                if (r5 != r1) goto L88
                goto Lb3
            L88:
                if (r5 != r3) goto L95
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = r5.a()
                if (r5 == 0) goto L95
                r4.a = r1
                return
            L95:
                r4.a = r1
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                boolean r5 = r5.a()
                if (r5 != 0) goto La4
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                r5.i()
            La4:
                com.devlin_n.videoplayer.player.IjkVideoView r5 = r4.b
                android.content.Context r5 = r5.getContext()
                android.app.Activity r5 = g1.f.l(r5)
                r0 = 8
                r5.setRequestedOrientation(r0)
            Lb3:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class d implements android.view.SurfaceHolder.Callback {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        d(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                tv.danmaku.ijk.media.player.IMediaPlayer r2 = com.devlin_n.videoplayer.player.IjkVideoView.j(r2)
                if (r2 == 0) goto L11
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                tv.danmaku.ijk.media.player.IMediaPlayer r2 = com.devlin_n.videoplayer.player.IjkVideoView.j(r2)
                r2.setDisplay(r1)
            L11:
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder r1) {
                r0 = this;
                return
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder r1) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class e implements android.view.TextureView.SurfaceTextureListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        e(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                android.graphics.SurfaceTexture r2 = com.devlin_n.videoplayer.player.IjkVideoView.x(r2)
                if (r2 == 0) goto L18
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.ResizeTextureView r1 = com.devlin_n.videoplayer.player.IjkVideoView.D(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                android.graphics.SurfaceTexture r2 = com.devlin_n.videoplayer.player.IjkVideoView.x(r2)
                r1.setSurfaceTexture(r2)
                return
            L18:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                com.devlin_n.videoplayer.player.IjkVideoView.z(r2, r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                tv.danmaku.ijk.media.player.IMediaPlayer r2 = com.devlin_n.videoplayer.player.IjkVideoView.j(r2)
                android.view.Surface r3 = new android.view.Surface
                r3.<init>(r1)
                r2.setSurface(r3)
                return
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                android.graphics.SurfaceTexture r1 = com.devlin_n.videoplayer.player.IjkVideoView.x(r1)
                if (r1 != 0) goto La
                r1 = 1
                return r1
            La:
                r1 = 0
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class f implements android.view.View.OnClickListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        f(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                r2 = 1
                g1.a.d = r2
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                android.widget.FrameLayout r2 = com.devlin_n.videoplayer.player.IjkVideoView.G(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.a
                com.devlin_n.videoplayer.widget.StatusView r0 = com.devlin_n.videoplayer.player.IjkVideoView.E(r0)
                r2.removeView(r0)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.H(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.I(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class g implements java.lang.Runnable {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        g(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.a
                tv.danmaku.ijk.media.player.IMediaPlayer r0 = com.devlin_n.videoplayer.player.IjkVideoView.j(r0)
                r0.reset()
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.a
                tv.danmaku.ijk.media.player.IMediaPlayer r0 = com.devlin_n.videoplayer.player.IjkVideoView.j(r0)
                r0.release()
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r2.a
                r1 = 0
                com.devlin_n.videoplayer.player.IjkVideoView.l(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class h implements tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements android.view.View.OnClickListener {
            final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView.h a;

            a(com.devlin_n.videoplayer.player.IjkVideoView.h r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View r2) {
                    r1 = this;
                    com.devlin_n.videoplayer.player.IjkVideoView$h r2 = r1.a
                    com.devlin_n.videoplayer.player.IjkVideoView r2 = r2.a
                    android.widget.FrameLayout r2 = com.devlin_n.videoplayer.player.IjkVideoView.G(r2)
                    com.devlin_n.videoplayer.player.IjkVideoView$h r0 = r1.a
                    com.devlin_n.videoplayer.player.IjkVideoView r0 = r0.a
                    com.devlin_n.videoplayer.widget.StatusView r0 = com.devlin_n.videoplayer.player.IjkVideoView.E(r0)
                    r2.removeView(r0)
                    com.devlin_n.videoplayer.player.IjkVideoView$h r2 = r1.a
                    com.devlin_n.videoplayer.player.IjkVideoView r2 = r2.a
                    com.devlin_n.videoplayer.player.IjkVideoView.o(r2)
                    com.devlin_n.videoplayer.player.IjkVideoView$h r2 = r1.a
                    com.devlin_n.videoplayer.player.IjkVideoView r2 = r2.a
                    com.devlin_n.videoplayer.player.IjkVideoView.I(r2)
                    return
            }
        }

        h(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean onError(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                r2 = -1
                com.devlin_n.videoplayer.player.IjkVideoView.K(r1, r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                f1.d r1 = com.devlin_n.videoplayer.player.IjkVideoView.L(r1)
                if (r1 == 0) goto L17
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                f1.d r1 = com.devlin_n.videoplayer.player.IjkVideoView.L(r1)
                r1.onError()
            L17:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                if (r1 == 0) goto L2e
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                int r2 = com.devlin_n.videoplayer.player.IjkVideoView.J(r2)
                r1.setPlayState(r2)
            L2e:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                int r2 = r1.getCurrentPosition()
                com.devlin_n.videoplayer.player.IjkVideoView.n(r1, r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                android.widget.FrameLayout r1 = com.devlin_n.videoplayer.player.IjkVideoView.G(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r2 = com.devlin_n.videoplayer.player.IjkVideoView.E(r2)
                r1.removeView(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r1 = com.devlin_n.videoplayer.player.IjkVideoView.E(r1)
                if (r1 != 0) goto L5e
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r2 = new com.devlin_n.videoplayer.widget.StatusView
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r0.a
                android.content.Context r3 = r3.getContext()
                r2.<init>(r3)
                com.devlin_n.videoplayer.player.IjkVideoView.F(r1, r2)
            L5e:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r1 = com.devlin_n.videoplayer.player.IjkVideoView.E(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                android.content.res.Resources r2 = r2.getResources()
                int r3 = com.devlin_n.videoplayer.R.string.error_message
                java.lang.String r2 = r2.getString(r3)
                r1.setMessage(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r1 = com.devlin_n.videoplayer.player.IjkVideoView.E(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                android.content.res.Resources r2 = r2.getResources()
                int r3 = com.devlin_n.videoplayer.R.string.retry
                java.lang.String r2 = r2.getString(r3)
                com.devlin_n.videoplayer.player.IjkVideoView$h$a r3 = new com.devlin_n.videoplayer.player.IjkVideoView$h$a
                r3.<init>(r0)
                r1.b(r2, r3)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                android.widget.FrameLayout r1 = com.devlin_n.videoplayer.player.IjkVideoView.G(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                com.devlin_n.videoplayer.widget.StatusView r2 = com.devlin_n.videoplayer.player.IjkVideoView.E(r2)
                r1.addView(r2)
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class i implements tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        i(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r2) {
                r1 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                r0 = 5
                com.devlin_n.videoplayer.player.IjkVideoView.K(r2, r0)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                f1.d r2 = com.devlin_n.videoplayer.player.IjkVideoView.L(r2)
                if (r2 == 0) goto L17
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                f1.d r2 = com.devlin_n.videoplayer.player.IjkVideoView.L(r2)
                r2.onComplete()
            L17:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = com.devlin_n.videoplayer.player.IjkVideoView.k(r2)
                if (r2 == 0) goto L2e
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = com.devlin_n.videoplayer.player.IjkVideoView.k(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.a
                int r0 = com.devlin_n.videoplayer.player.IjkVideoView.J(r0)
                r2.setPlayState(r0)
            L2e:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                r0 = 0
                r2.setKeepScreenOn(r0)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.q(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                java.util.List r2 = com.devlin_n.videoplayer.player.IjkVideoView.r(r2)
                if (r2 == 0) goto L70
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                java.util.List r2 = com.devlin_n.videoplayer.player.IjkVideoView.r(r2)
                int r2 = r2.size()
                r0 = 1
                if (r2 <= r0) goto L70
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                int r2 = com.devlin_n.videoplayer.player.IjkVideoView.p(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.a
                java.util.List r0 = com.devlin_n.videoplayer.player.IjkVideoView.r(r0)
                int r0 = r0.size()
                if (r2 < r0) goto L61
                goto L70
            L61:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.s(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.o(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.player.IjkVideoView.I(r2)
            L70:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class j implements tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        j(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public boolean onInfo(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2, int r3) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                f1.d r1 = com.devlin_n.videoplayer.player.IjkVideoView.L(r1)
                if (r1 == 0) goto L11
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                f1.d r1 = com.devlin_n.videoplayer.player.IjkVideoView.L(r1)
                r1.onInfo(r2, r3)
            L11:
                r1 = 3
                if (r2 == r1) goto L70
                r1 = 10001(0x2711, float:1.4014E-41)
                if (r2 == r1) goto L5d
                r1 = 701(0x2bd, float:9.82E-43)
                if (r2 == r1) goto L3f
                r1 = 702(0x2be, float:9.84E-43)
                if (r2 == r1) goto L21
                goto L7d
            L21:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                r2 = 7
                com.devlin_n.videoplayer.player.IjkVideoView.K(r1, r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                if (r1 == 0) goto L7d
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                int r2 = com.devlin_n.videoplayer.player.IjkVideoView.J(r2)
                r1.setPlayState(r2)
                goto L7d
            L3f:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                r2 = 6
                com.devlin_n.videoplayer.player.IjkVideoView.K(r1, r2)
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                if (r1 == 0) goto L7d
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.controller.BaseVideoController r1 = com.devlin_n.videoplayer.player.IjkVideoView.k(r1)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r0.a
                int r2 = com.devlin_n.videoplayer.player.IjkVideoView.J(r2)
                r1.setPlayState(r2)
                goto L7d
            L5d:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.ResizeTextureView r1 = com.devlin_n.videoplayer.player.IjkVideoView.D(r1)
                if (r1 == 0) goto L7d
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.widget.ResizeTextureView r1 = com.devlin_n.videoplayer.player.IjkVideoView.D(r1)
                float r2 = (float) r3
                r1.setRotation(r2)
                goto L7d
            L70:
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                int r1 = r1.getWindowVisibility()
                if (r1 == 0) goto L7d
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                r1.pause()
            L7d:
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class k implements tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        k(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onBufferingUpdate(tv.danmaku.ijk.media.player.IMediaPlayer r1, int r2) {
                r0 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                boolean r1 = com.devlin_n.videoplayer.player.IjkVideoView.t(r1)
                if (r1 != 0) goto Ld
                com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.a
                com.devlin_n.videoplayer.player.IjkVideoView.u(r1, r2)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class l implements tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener {
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView a;

        l(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public void onPrepared(tv.danmaku.ijk.media.player.IMediaPlayer r2) {
                r1 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                r0 = 2
                com.devlin_n.videoplayer.player.IjkVideoView.K(r2, r0)
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                f1.d r2 = com.devlin_n.videoplayer.player.IjkVideoView.L(r2)
                if (r2 == 0) goto L17
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                f1.d r2 = com.devlin_n.videoplayer.player.IjkVideoView.L(r2)
                r2.onPrepared()
            L17:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = com.devlin_n.videoplayer.player.IjkVideoView.k(r2)
                if (r2 == 0) goto L2e
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                com.devlin_n.videoplayer.controller.BaseVideoController r2 = com.devlin_n.videoplayer.player.IjkVideoView.k(r2)
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r1.a
                int r0 = com.devlin_n.videoplayer.player.IjkVideoView.J(r0)
                r2.setPlayState(r0)
            L2e:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                int r2 = com.devlin_n.videoplayer.player.IjkVideoView.m(r2)
                if (r2 <= 0) goto L3f
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                int r0 = com.devlin_n.videoplayer.player.IjkVideoView.m(r2)
                r2.seekTo(r0)
            L3f:
                com.devlin_n.videoplayer.player.IjkVideoView r2 = r1.a
                r2.start()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class m implements android.media.AudioManager.OnAudioFocusChangeListener {
        boolean a;
        boolean b;
        int c;
        final /* synthetic */ com.devlin_n.videoplayer.player.IjkVideoView d;

        private m(com.devlin_n.videoplayer.player.IjkVideoView r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = 0
                r0.a = r1
                r0.b = r1
                r0.c = r1
                return
        }

        /* synthetic */ m(com.devlin_n.videoplayer.player.IjkVideoView r1, com.devlin_n.videoplayer.player.IjkVideoView.d r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        boolean a() {
                r3 = this;
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r3.d
                android.media.AudioManager r0 = com.devlin_n.videoplayer.player.IjkVideoView.A(r0)
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                r3.a = r1
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r3.d
                android.media.AudioManager r0 = com.devlin_n.videoplayer.player.IjkVideoView.A(r0)
                int r0 = r0.abandonAudioFocus(r3)
                r2 = 1
                if (r2 != r0) goto L1a
                return r2
            L1a:
                return r1
        }

        boolean b() {
                r4 = this;
                int r0 = r4.c
                r1 = 1
                if (r0 != r1) goto L6
                return r1
            L6:
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r4.d
                android.media.AudioManager r0 = com.devlin_n.videoplayer.player.IjkVideoView.A(r0)
                r2 = 0
                if (r0 != 0) goto L10
                return r2
            L10:
                com.devlin_n.videoplayer.player.IjkVideoView r0 = r4.d
                android.media.AudioManager r0 = com.devlin_n.videoplayer.player.IjkVideoView.A(r0)
                r3 = 3
                int r0 = r0.requestAudioFocus(r4, r3, r1)
                if (r1 != r0) goto L20
                r4.c = r1
                return r1
            L20:
                r4.a = r1
                return r2
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int r3) {
                r2 = this;
                int r0 = r2.c
                if (r0 != r3) goto L5
                goto L49
            L5:
                r2.c = r3
                r0 = -3
                r1 = 1
                if (r3 == r0) goto L3a
                r0 = -2
                if (r3 == r0) goto L3a
                r0 = -1
                if (r3 == r0) goto L2a
                if (r3 == r1) goto L17
                r0 = 2
                if (r3 == r0) goto L17
                goto L49
            L17:
                boolean r3 = r2.a
                if (r3 != 0) goto L1f
                boolean r3 = r2.b
                if (r3 == 0) goto L49
            L1f:
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r2.d
                r3.start()
                r3 = 0
                r2.a = r3
                r2.b = r3
                return
            L2a:
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r2.d
                boolean r3 = r3.isPlaying()
                if (r3 == 0) goto L49
                r2.b = r1
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r2.d
                r3.pause()
                return
            L3a:
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r2.d
                boolean r3 = r3.isPlaying()
                if (r3 == 0) goto L49
                r2.b = r1
                com.devlin_n.videoplayer.player.IjkVideoView r3 = r2.d
                r3.pause()
            L49:
                return
        }
    }

    public IjkVideoView(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public IjkVideoView(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.s = r2
            java.lang.String r3 = ""
            r1.u = r3
            r1.v = r2
            com.devlin_n.videoplayer.player.IjkVideoView$m r3 = new com.devlin_n.videoplayer.player.IjkVideoView$m
            r0 = 0
            r3.<init>(r1, r0)
            r1.x = r3
            r1.y = r2
            com.devlin_n.videoplayer.player.IjkVideoView$h r2 = new com.devlin_n.videoplayer.player.IjkVideoView$h
            r2.<init>(r1)
            r1.F = r2
            com.devlin_n.videoplayer.player.IjkVideoView$i r2 = new com.devlin_n.videoplayer.player.IjkVideoView$i
            r2.<init>(r1)
            r1.G = r2
            com.devlin_n.videoplayer.player.IjkVideoView$j r2 = new com.devlin_n.videoplayer.player.IjkVideoView$j
            r2.<init>(r1)
            r1.H = r2
            com.devlin_n.videoplayer.player.IjkVideoView$k r2 = new com.devlin_n.videoplayer.player.IjkVideoView$k
            r2.<init>(r1)
            r1.I = r2
            com.devlin_n.videoplayer.player.IjkVideoView$l r2 = new com.devlin_n.videoplayer.player.IjkVideoView$l
            r2.<init>(r1)
            r1.J = r2
            com.devlin_n.videoplayer.player.IjkVideoView$a r2 = new com.devlin_n.videoplayer.player.IjkVideoView$a
            r2.<init>(r1)
            r1.K = r2
            com.devlin_n.videoplayer.player.IjkVideoView$b r2 = new com.devlin_n.videoplayer.player.IjkVideoView$b
            r2.<init>(r1)
            r1.L = r2
            r1.V()
            return
    }

    static /* synthetic */ android.media.AudioManager A(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            android.media.AudioManager r0 = r0.w
            return r0
    }

    static /* synthetic */ boolean B(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            boolean r0 = r0.B
            return r0
    }

    static /* synthetic */ boolean C(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            boolean r0 = r0.C
            return r0
    }

    static /* synthetic */ com.devlin_n.videoplayer.widget.ResizeTextureView D(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            com.devlin_n.videoplayer.widget.ResizeTextureView r0 = r0.e
            return r0
    }

    static /* synthetic */ com.devlin_n.videoplayer.widget.StatusView E(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            com.devlin_n.videoplayer.widget.StatusView r0 = r0.k
            return r0
    }

    static /* synthetic */ com.devlin_n.videoplayer.widget.StatusView F(com.devlin_n.videoplayer.player.IjkVideoView r0, com.devlin_n.videoplayer.widget.StatusView r1) {
            r0.k = r1
            return r1
    }

    static /* synthetic */ android.widget.FrameLayout G(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            android.widget.FrameLayout r0 = r0.j
            return r0
    }

    static /* synthetic */ void H(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            r0.U()
            return
    }

    static /* synthetic */ void I(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            r0.j0()
            return
    }

    static /* synthetic */ int J(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            int r0 = r0.v
            return r0
    }

    static /* synthetic */ int K(com.devlin_n.videoplayer.player.IjkVideoView r0, int r1) {
            r0.v = r1
            return r1
    }

    static /* synthetic */ f1.d L(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            f1.d r0 = r0.c
            return r0
    }

    private void N() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.j
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r1 = r4.d
            r0.removeView(r1)
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r0 = new com.devlin_n.videoplayer.widget.ResizeSurfaceView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.d = r0
            android.view.SurfaceHolder r0 = r0.getHolder()
            com.devlin_n.videoplayer.player.IjkVideoView$d r1 = new com.devlin_n.videoplayer.player.IjkVideoView$d
            r1.<init>(r4)
            r0.addCallback(r1)
            r1 = 1
            r0.setFormat(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = 17
            r0.<init>(r1, r1, r2)
            android.widget.FrameLayout r1 = r4.j
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r2 = r4.d
            r3 = 0
            r1.addView(r2, r3, r0)
            return
    }

    private void O() {
            r4 = this;
            android.widget.FrameLayout r0 = r4.j
            com.devlin_n.videoplayer.widget.ResizeTextureView r1 = r4.e
            r0.removeView(r1)
            r0 = 0
            r4.f = r0
            com.devlin_n.videoplayer.widget.ResizeTextureView r0 = new com.devlin_n.videoplayer.widget.ResizeTextureView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r4.e = r0
            com.devlin_n.videoplayer.player.IjkVideoView$e r1 = new com.devlin_n.videoplayer.player.IjkVideoView$e
            r1.<init>(r4)
            r0.setSurfaceTextureListener(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = 17
            r0.<init>(r1, r1, r2)
            android.widget.FrameLayout r1 = r4.j
            com.devlin_n.videoplayer.widget.ResizeTextureView r2 = r4.e
            r3 = 0
            r1.addView(r2, r3, r0)
            return
    }

    private boolean S() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r0 = g1.d.a(r0)
            r1 = 4
            if (r0 != r1) goto L51
            boolean r0 = g1.a.d
            if (r0 != 0) goto L51
            android.widget.FrameLayout r0 = r3.j
            com.devlin_n.videoplayer.widget.StatusView r1 = r3.k
            r0.removeView(r1)
            com.devlin_n.videoplayer.widget.StatusView r0 = r3.k
            if (r0 != 0) goto L25
            com.devlin_n.videoplayer.widget.StatusView r0 = new com.devlin_n.videoplayer.widget.StatusView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.k = r0
        L25:
            com.devlin_n.videoplayer.widget.StatusView r0 = r3.k
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.devlin_n.videoplayer.R.string.wifi_tip
            java.lang.String r1 = r1.getString(r2)
            r0.setMessage(r1)
            com.devlin_n.videoplayer.widget.StatusView r0 = r3.k
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.devlin_n.videoplayer.R.string.continue_play
            java.lang.String r1 = r1.getString(r2)
            com.devlin_n.videoplayer.player.IjkVideoView$f r2 = new com.devlin_n.videoplayer.player.IjkVideoView$f
            r2.<init>(r3)
            r0.b(r1, r2)
            android.widget.FrameLayout r0 = r3.j
            com.devlin_n.videoplayer.widget.StatusView r1 = r3.k
            r0.addView(r1)
            r0 = 1
            return r0
        L51:
            r0 = 0
            return r0
    }

    private void U() {
            r5 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            if (r0 != 0) goto L81
            boolean r0 = r5.p
            if (r0 == 0) goto L10
            tv.danmaku.ijk.media.player.AndroidMediaPlayer r0 = new tv.danmaku.ijk.media.player.AndroidMediaPlayer
            r0.<init>()
            r5.a = r0
            goto L31
        L10:
            tv.danmaku.ijk.media.player.IjkMediaPlayer r0 = new tv.danmaku.ijk.media.player.IjkMediaPlayer
            r0.<init>()
            r5.a = r0
            java.lang.String r1 = "mediacodec"
            r2 = 4
            r3 = 1
            r0.setOption(r2, r1, r3)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IjkMediaPlayer r0 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r0
            java.lang.String r1 = "mediacodec-auto-rotate"
            r0.setOption(r2, r1, r3)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IjkMediaPlayer r0 = (tv.danmaku.ijk.media.player.IjkMediaPlayer) r0
            java.lang.String r1 = "mediacodec-handle-resolution-change"
            r0.setOption(r2, r1, r3)
        L31:
            android.content.Context r0 = r5.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r5.w = r0
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            r1 = 3
            r0.setAudioStreamType(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener r1 = r5.F
            r0.setOnErrorListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnCompletionListener r1 = r5.G
            r0.setOnCompletionListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnInfoListener r1 = r5.H
            r0.setOnInfoListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnBufferingUpdateListener r1 = r5.I
            r0.setOnBufferingUpdateListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnPreparedListener r1 = r5.J
            r0.setOnPreparedListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r5.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnVideoSizeChangedListener r1 = r5.K
            r0.setOnVideoSizeChangedListener(r1)
            r0 = 0
            r5.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r5.b
            if (r1 == 0) goto L81
            r1.setPlayState(r0)
        L81:
            boolean r0 = r5.o
            if (r0 == 0) goto L89
            r5.N()
            goto L8c
        L89:
            r5.O()
        L8c:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r5.g
            if (r0 == 0) goto L9d
            android.widget.FrameLayout r1 = r5.j
            r1.removeView(r0)
            android.widget.FrameLayout r0 = r5.j
            master.flame.danmaku.ui.widget.DanmakuView r1 = r5.g
            r2 = 1
            r0.addView(r1, r2)
        L9d:
            return
    }

    private void V() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            r1 = 0
            int r0 = g1.f.d(r0, r1)
            g1.a.b = r0
            android.content.Context r0 = r2.getContext()
            int r0 = g1.f.e(r0)
            g1.a.a = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.j = r0
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.widget.FrameLayout r1 = r2.j
            r2.addView(r1, r0)
            return
    }

    private boolean W() {
            r2 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            if (r0 == 0) goto Lf
            int r0 = r2.v
            r1 = -1
            if (r0 == r1) goto Lf
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Lf
            return r1
        Lf:
            r0 = 0
            return r0
    }

    private void Y() {
            r2 = this;
            java.util.List<com.devlin_n.videoplayer.player.b> r0 = r2.r
            int r1 = r2.s
            java.lang.Object r0 = r0.get(r1)
            com.devlin_n.videoplayer.player.b r0 = (com.devlin_n.videoplayer.player.b) r0
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.a
            r2.q = r1
            java.lang.String r1 = r0.b
            r2.u = r1
            r1 = 0
            r2.t = r1
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r0.c
            r2.f0(r0)
        L1c:
            return
    }

    private void a0() {
            r2 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r0.reset()
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            boolean r1 = r0 instanceof tv.danmaku.ijk.media.player.IjkMediaPlayer
            if (r1 == 0) goto Lf
            r2.U()
            return
        Lf:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r1, r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener r1 = r2.F
            r0.setOnErrorListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnCompletionListener r1 = r2.G
            r0.setOnCompletionListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnInfoListener r1 = r2.H
            r0.setOnInfoListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnBufferingUpdateListener r1 = r2.I
            r0.setOnBufferingUpdateListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnPreparedListener r1 = r2.J
            r0.setOnPreparedListener(r1)
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            tv.danmaku.ijk.media.player.IMediaPlayer$OnVideoSizeChangedListener r1 = r2.K
            r0.setOnVideoSizeChangedListener(r1)
            return
    }

    private com.danikula.videocache.i getCacheServer() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.danikula.videocache.i r0 = com.devlin_n.videoplayer.player.a.c(r0)
            return r0
    }

    private void i0() {
            r3 = this;
            boolean r0 = r3.W()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.getContext()
            java.lang.Class<com.devlin_n.videoplayer.player.BackgroundPlayService> r2 = com.devlin_n.videoplayer.player.BackgroundPlayService.class
            r0.<init>(r1, r2)
            java.lang.String r1 = "url"
            java.lang.String r2 = r3.q
            r0.putExtra(r1, r2)
            r3.getCurrentPosition()
            int r1 = r3.getDuration()
            if (r1 > 0) goto L24
            r1 = 0
            goto L26
        L24:
            int r1 = r3.t
        L26:
            java.lang.String r2 = "position"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "enable_cache"
            boolean r2 = r3.D
            r0.putExtra(r1, r2)
            android.content.Context r1 = r3.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r1.startService(r0)
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r0.finish()
            return
    }

    static /* synthetic */ tv.danmaku.ijk.media.player.IMediaPlayer j(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r0.a
            return r0
    }

    private void j0() {
            r4 = this;
            java.lang.String r0 = r4.q
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            goto L75
        L11:
            boolean r0 = r4.D     // Catch: java.io.IOException -> L33
            if (r0 == 0) goto L3b
            com.danikula.videocache.i r0 = r4.getCacheServer()     // Catch: java.io.IOException -> L33
            java.lang.String r1 = r4.q     // Catch: java.io.IOException -> L33
            java.lang.String r1 = r0.j(r1)     // Catch: java.io.IOException -> L33
            com.danikula.videocache.e r2 = r4.L     // Catch: java.io.IOException -> L33
            java.lang.String r3 = r4.q     // Catch: java.io.IOException -> L33
            r0.p(r2, r3)     // Catch: java.io.IOException -> L33
            java.lang.String r2 = r4.q     // Catch: java.io.IOException -> L33
            boolean r0 = r0.m(r2)     // Catch: java.io.IOException -> L33
            if (r0 == 0) goto L35
            r0 = 100
            r4.l = r0     // Catch: java.io.IOException -> L33
            goto L35
        L33:
            goto L6b
        L35:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r4.a     // Catch: java.io.IOException -> L33
            r0.setDataSource(r1)     // Catch: java.io.IOException -> L33
            goto L42
        L3b:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r4.a     // Catch: java.io.IOException -> L33
            java.lang.String r1 = r4.q     // Catch: java.io.IOException -> L33
            r0.setDataSource(r1)     // Catch: java.io.IOException -> L33
        L42:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r4.a     // Catch: java.io.IOException -> L33
            r0.prepareAsync()     // Catch: java.io.IOException -> L33
            r0 = 1
            r4.v = r0     // Catch: java.io.IOException -> L33
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r4.b     // Catch: java.io.IOException -> L33
            if (r1 == 0) goto L5f
            r1.setPlayState(r0)     // Catch: java.io.IOException -> L33
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r4.b     // Catch: java.io.IOException -> L33
            boolean r1 = r4.m     // Catch: java.io.IOException -> L33
            if (r1 == 0) goto L5a
            r1 = 11
            goto L5c
        L5a:
            r1 = 10
        L5c:
            r0.setPlayerState(r1)     // Catch: java.io.IOException -> L33
        L5f:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r4.g     // Catch: java.io.IOException -> L33
            if (r0 == 0) goto L75
            master.flame.danmaku.danmaku.parser.a r1 = r4.i     // Catch: java.io.IOException -> L33
            master.flame.danmaku.danmaku.model.android.DanmakuContext r2 = r4.h     // Catch: java.io.IOException -> L33
            r0.g(r1, r2)     // Catch: java.io.IOException -> L33
            return
        L6b:
            r0 = -1
            r4.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r4.b
            if (r1 == 0) goto L75
            r1.setPlayState(r0)
        L75:
            return
    }

    static /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController k(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r0.b
            return r0
    }

    static /* synthetic */ tv.danmaku.ijk.media.player.IMediaPlayer l(com.devlin_n.videoplayer.player.IjkVideoView r0, tv.danmaku.ijk.media.player.IMediaPlayer r1) {
            r0.a = r1
            return r1
    }

    static /* synthetic */ int m(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            int r0 = r0.t
            return r0
    }

    static /* synthetic */ int n(com.devlin_n.videoplayer.player.IjkVideoView r0, int r1) {
            r0.t = r1
            return r1
    }

    static /* synthetic */ void o(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            r0.a0()
            return
    }

    static /* synthetic */ int p(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            int r0 = r0.s
            return r0
    }

    static /* synthetic */ int q(com.devlin_n.videoplayer.player.IjkVideoView r2) {
            int r0 = r2.s
            int r1 = r0 + 1
            r2.s = r1
            return r0
    }

    static /* synthetic */ java.util.List r(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            java.util.List<com.devlin_n.videoplayer.player.b> r0 = r0.r
            return r0
    }

    static /* synthetic */ void s(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            r0.Y()
            return
    }

    static /* synthetic */ boolean t(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            boolean r0 = r0.D
            return r0
    }

    static /* synthetic */ int u(com.devlin_n.videoplayer.player.IjkVideoView r0, int r1) {
            r0.l = r1
            return r1
    }

    static /* synthetic */ boolean v(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            boolean r0 = r0.o
            return r0
    }

    static /* synthetic */ int w(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            int r0 = r0.y
            return r0
    }

    static /* synthetic */ android.graphics.SurfaceTexture x(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            android.graphics.SurfaceTexture r0 = r0.f
            return r0
    }

    static /* synthetic */ com.devlin_n.videoplayer.widget.ResizeSurfaceView y(com.devlin_n.videoplayer.player.IjkVideoView r0) {
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r0 = r0.d
            return r0
    }

    static /* synthetic */ android.graphics.SurfaceTexture z(com.devlin_n.videoplayer.player.IjkVideoView r0, android.graphics.SurfaceTexture r1) {
            r0.f = r1
            return r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView M(master.flame.danmaku.ui.widget.DanmakuView r1, master.flame.danmaku.danmaku.model.android.DanmakuContext r2, master.flame.danmaku.danmaku.parser.a r3) {
            r0 = this;
            r0.g = r1
            r0.h = r2
            r0.i = r3
            return r0
    }

    public com.devlin_n.videoplayer.player.IjkVideoView P() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView Q() {
            r1 = this;
            r0 = 1
            r1.C = r0
            return r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView R() {
            r2 = this;
            r0 = 1
            r2.A = r0
            android.view.OrientationEventListener r0 = r2.z
            if (r0 != 0) goto L12
            com.devlin_n.videoplayer.player.IjkVideoView$c r0 = new com.devlin_n.videoplayer.player.IjkVideoView$c
            android.content.Context r1 = r2.getContext()
            r0.<init>(r2, r1)
            r2.z = r0
        L12:
            return r2
    }

    public com.devlin_n.videoplayer.player.IjkVideoView T() {
            r1 = this;
            r0 = 1
            r1.D = r0
            return r1
    }

    public boolean X() {
            r4 = this;
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r4.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1b
            boolean r3 = r4.B
            if (r3 == 0) goto L1b
            r0.g()
            android.content.Context r0 = r4.getContext()
            int r3 = com.devlin_n.videoplayer.R.string.lock_tip
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r2)
            r0.show()
            return r1
        L1b:
            boolean r0 = r4.C
            if (r0 == 0) goto L20
            return r2
        L20:
            boolean r0 = r4.m
            if (r0 == 0) goto L3c
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r0.setRequestedOrientation(r1)
            r4.g()
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r4.b
            if (r0 == 0) goto L3b
            r2 = 10
            r0.setPlayerState(r2)
        L3b:
            return r1
        L3c:
            return r2
    }

    public void Z() {
            r4 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r4.a
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.Thread r0 = new java.lang.Thread
            com.devlin_n.videoplayer.player.IjkVideoView$g r2 = new com.devlin_n.videoplayer.player.IjkVideoView$g
            r2.<init>(r4)
            r0.<init>(r2)
            r0.start()
            r4.v = r1
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r4.b
            if (r0 == 0) goto L1b
            r0.setPlayState(r1)
        L1b:
            com.devlin_n.videoplayer.player.IjkVideoView$m r0 = r4.x
            r0.a()
            r4.setKeepScreenOn(r1)
        L23:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r4.g
            r2 = 0
            if (r0 == 0) goto L2d
            r0.release()
            r4.g = r2
        L2d:
            android.view.OrientationEventListener r0 = r4.z
            if (r0 == 0) goto L34
            r0.disable()
        L34:
            boolean r0 = r4.D
            if (r0 == 0) goto L41
            com.danikula.videocache.i r0 = r4.getCacheServer()
            com.danikula.videocache.e r3 = r4.L
            r0.u(r3)
        L41:
            android.widget.FrameLayout r0 = r4.j
            com.devlin_n.videoplayer.widget.ResizeTextureView r3 = r4.e
            r0.removeView(r3)
            android.widget.FrameLayout r0 = r4.j
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r3 = r4.d
            r0.removeView(r3)
            android.widget.FrameLayout r0 = r4.j
            com.devlin_n.videoplayer.widget.StatusView r3 = r4.k
            r0.removeView(r3)
            android.graphics.SurfaceTexture r0 = r4.f
            if (r0 == 0) goto L5f
            r0.release()
            r4.f = r2
        L5f:
            r4.B = r1
            r4.t = r1
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public boolean a() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void b() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r1 = 0
            r0.setRequestedOrientation(r1)
            r2.i()
            return
    }

    public void b0() {
            r2 = this;
            boolean r0 = r2.W()
            if (r0 == 0) goto L2b
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L2b
            int r0 = r2.v
            r1 = 5
            if (r0 == r1) goto L2b
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r0.start()
            r0 = 3
            r2.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            if (r1 == 0) goto L22
            r1.setPlayState(r0)
        L22:
            com.devlin_n.videoplayer.player.IjkVideoView$m r0 = r2.x
            r0.b()
            r0 = 1
            r2.setKeepScreenOn(r0)
        L2b:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            if (r0 == 0) goto L42
            boolean r0 = r0.isPrepared()
            if (r0 == 0) goto L42
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            boolean r0 = r0.isPaused()
            if (r0 == 0) goto L42
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            r0.resume()
        L42:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void c() {
            r2 = this;
            com.devlin_n.floatWindowPermission.b r0 = com.devlin_n.floatWindowPermission.b.f()
            android.content.Context r1 = r2.getContext()
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L12
            r2.i0()
            return
        L12:
            com.devlin_n.floatWindowPermission.b r0 = com.devlin_n.floatWindowPermission.b.f()
            android.content.Context r1 = r2.getContext()
            r0.b(r1)
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView c0(int r2) {
            r1 = this;
            r1.y = r2
            com.devlin_n.videoplayer.widget.ResizeSurfaceView r0 = r1.d
            if (r0 == 0) goto L9
            r0.setScreenScale(r2)
        L9:
            com.devlin_n.videoplayer.widget.ResizeTextureView r0 = r1.e
            if (r0 == 0) goto L10
            r0.setScreenScale(r2)
        L10:
            return r1
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void d() {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.getContext()
            java.lang.Class<com.devlin_n.videoplayer.player.BackgroundPlayService> r2 = com.devlin_n.videoplayer.player.BackgroundPlayService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r3.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r1.stopService(r0)
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView d0(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0.u = r1
        L4:
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void e() {
            r2 = this;
            int r0 = r2.s
            r1 = 1
            int r0 = r0 + r1
            r2.s = r0
            java.util.List<com.devlin_n.videoplayer.player.b> r0 = r2.r
            if (r0 == 0) goto L24
            int r0 = r0.size()
            if (r0 <= r1) goto L24
            int r0 = r2.s
            java.util.List<com.devlin_n.videoplayer.player.b> r1 = r2.r
            int r1 = r1.size()
            if (r0 < r1) goto L1b
            goto L24
        L1b:
            r2.Y()
            r2.a0()
            r2.j0()
        L24:
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView e0(java.lang.String r1) {
            r0 = this;
            r0.q = r1
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public /* bridge */ /* synthetic */ com.devlin_n.videoplayer.controller.BaseVideoController.d f(int r1) {
            r0 = this;
            com.devlin_n.videoplayer.player.IjkVideoView r1 = r0.c0(r1)
            return r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView f0(com.devlin_n.videoplayer.controller.BaseVideoController r3) {
            r2 = this;
            android.widget.FrameLayout r0 = r2.j
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            r0.removeView(r1)
            if (r3 == 0) goto L1b
            r3.setMediaPlayer(r2)
            r2.b = r3
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r3.<init>(r0, r0)
            android.widget.FrameLayout r0 = r2.j
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            r0.addView(r1, r3)
        L1b:
            return r2
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void g() {
            r2 = this;
            boolean r0 = r2.m
            if (r0 != 0) goto L5
            goto L41
        L5:
            android.content.Context r0 = r2.getContext()
            r1 = 1
            g1.f.o(r0, r1, r1)
            android.content.Context r0 = r2.getContext()
            g1.f.m(r0)
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.FrameLayout r1 = r2.j
            r0.removeView(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            android.widget.FrameLayout r1 = r2.j
            r2.addView(r1, r0)
            r0 = 0
            r2.m = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r2.b
            if (r0 == 0) goto L41
            r1 = 10
            r0.setPlayerState(r1)
        L41:
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView g0(java.util.List<com.devlin_n.videoplayer.player.b> r1) {
            r0 = this;
            r0.r = r1
            r0.Y()
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public int getBufferPercentage() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.a
            if (r0 == 0) goto L7
            int r0 = r1.l
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public int getCurrentPosition() {
            r2 = this;
            boolean r0 = r2.W()
            if (r0 == 0) goto L10
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            long r0 = r0.getCurrentPosition()
            int r1 = (int) r0
            r2.t = r1
            return r1
        L10:
            r0 = 0
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public int getDuration() {
            r2 = this;
            boolean r0 = r2.W()
            if (r0 == 0) goto Le
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            long r0 = r0.getDuration()
            int r1 = (int) r0
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.u
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void h() {
            r2 = this;
            boolean r0 = r2.n
            if (r0 == 0) goto Lf
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r1, r1)
            r0 = 0
            r2.n = r0
            return
        Lf:
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r1 = 0
            r0.setVolume(r1, r1)
            r0 = 1
            r2.n = r0
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView h0(java.lang.String r1, int r2) {
            r0 = this;
            r0.q = r1
            r0.t = r2
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void i() {
            r4 = this;
            boolean r0 = r4.m
            if (r0 == 0) goto L5
            goto L40
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 1
            g1.f.k(r0, r1, r1)
            android.content.Context r0 = r4.getContext()
            g1.f.i(r0)
            android.widget.FrameLayout r0 = r4.j
            r4.removeView(r0)
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = g1.f.l(r0)
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            android.widget.FrameLayout r3 = r4.j
            r0.addView(r3, r2)
            r4.m = r1
            com.devlin_n.videoplayer.controller.BaseVideoController r0 = r4.b
            if (r0 == 0) goto L40
            r1 = 11
            r0.setPlayerState(r1)
        L40:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public boolean isMute() {
            r1 = this;
            boolean r0 = r1.n
            return r0
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public boolean isPlaying() {
            r1 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r1.a
            if (r0 == 0) goto Lc
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void k0() {
            r2 = this;
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            if (r0 == 0) goto L21
            r0.stop()
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r0.release()
            r0 = 0
            r2.a = r0
            r0 = 0
            r2.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            if (r1 == 0) goto L19
            r1.setPlayState(r0)
        L19:
            com.devlin_n.videoplayer.player.IjkVideoView$m r1 = r2.x
            r1.a()
            r2.setKeepScreenOn(r0)
        L21:
            return
    }

    public com.devlin_n.videoplayer.player.IjkVideoView l0() {
            r1 = this;
            r0 = 1
            r1.p = r0
            return r1
    }

    public com.devlin_n.videoplayer.player.IjkVideoView m0() {
            r1 = this;
            r0 = 1
            r1.o = r0
            return r1
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void pause() {
            r2 = this;
            boolean r0 = r2.W()
            if (r0 == 0) goto L35
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L26
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r0.pause()
            r0 = 4
            r2.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            if (r1 == 0) goto L1d
            r1.setPlayState(r0)
        L1d:
            r0 = 0
            r2.setKeepScreenOn(r0)
            com.devlin_n.videoplayer.player.IjkVideoView$m r0 = r2.x
            r0.a()
        L26:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            if (r0 == 0) goto L35
            boolean r0 = r0.isPrepared()
            if (r0 == 0) goto L35
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            r0.pause()
        L35:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void seekTo(int r4) {
            r3 = this;
            boolean r0 = r3.W()
            if (r0 == 0) goto L17
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r3.a
            long r1 = (long) r4
            r0.seekTo(r1)
            master.flame.danmaku.ui.widget.DanmakuView r4 = r3.g
            if (r4 == 0) goto L17
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r4.m(r0)
        L17:
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void setLock(boolean r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setVideoListener(f1.d r1) {
            r0 = this;
            r0.c = r1
            return
    }

    @Override // com.devlin_n.videoplayer.controller.BaseVideoController.d
    public void start() {
            r2 = this;
            int r0 = r2.v
            if (r0 != 0) goto L36
            boolean r0 = r2.C
            if (r0 == 0) goto Lb
            r2.b()
        Lb:
            boolean r0 = r2.E
            if (r0 == 0) goto L1d
            com.devlin_n.videoplayer.player.c r0 = com.devlin_n.videoplayer.player.c.b()
            r0.d()
            com.devlin_n.videoplayer.player.c r0 = com.devlin_n.videoplayer.player.c.b()
            r0.e(r2)
        L1d:
            boolean r0 = r2.A
            if (r0 == 0) goto L28
            android.view.OrientationEventListener r0 = r2.z
            if (r0 == 0) goto L28
            r0.enable()
        L28:
            boolean r0 = r2.S()
            if (r0 == 0) goto L2f
            return
        L2f:
            r2.U()
            r2.j0()
            goto L62
        L36:
            boolean r0 = r2.W()
            if (r0 == 0) goto L62
            tv.danmaku.ijk.media.player.IMediaPlayer r0 = r2.a
            r0.start()
            r0 = 3
            r2.v = r0
            com.devlin_n.videoplayer.controller.BaseVideoController r1 = r2.b
            if (r1 == 0) goto L4b
            r1.setPlayState(r0)
        L4b:
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            if (r0 == 0) goto L62
            boolean r0 = r0.isPrepared()
            if (r0 == 0) goto L62
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            boolean r0 = r0.isPaused()
            if (r0 == 0) goto L62
            master.flame.danmaku.ui.widget.DanmakuView r0 = r2.g
            r0.resume()
        L62:
            r0 = 1
            r2.setKeepScreenOn(r0)
            com.devlin_n.videoplayer.player.IjkVideoView$m r0 = r2.x
            r0.b()
            return
    }
}
