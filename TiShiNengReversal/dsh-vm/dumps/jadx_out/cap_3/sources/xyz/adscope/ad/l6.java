package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class l6 extends xyz.adscope.ad.n6 {
    private android.widget.VideoView e;
    private android.media.MediaPlayer f;
    private android.widget.ImageView g;
    private xyz.adscope.ad.l6.h h;
    private android.widget.ImageView i;
    private int j;
    private boolean k;
    private boolean l;
    private final xyz.adscope.ad.l6.i m;
    private final xyz.adscope.ad.g4 n;
    private xyz.adscope.ad.l6.g o;
    private xyz.adscope.ad.l6.d p;
    private final xyz.adscope.ad.l6.f q;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements android.view.View.OnClickListener {
        final /* synthetic */ xyz.adscope.ad.l6 a;

        a(xyz.adscope.ad.l6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6$h r2 = xyz.adscope.ad.l6.h(r2)
                xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.a
                if (r2 != r0) goto Lf
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6.i(r2)
            Lf:
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6$h r2 = xyz.adscope.ad.l6.h(r2)
                xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.b
                if (r2 == r0) goto L25
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6$h r2 = xyz.adscope.ad.l6.h(r2)
                xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.c
                if (r2 != r0) goto L24
                goto L25
            L24:
                return
            L25:
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6.j(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements android.view.View.OnClickListener {
        final /* synthetic */ xyz.adscope.ad.l6 a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements xyz.adscope.ad.l6.e {
            final /* synthetic */ xyz.adscope.ad.l6.b a;

            a(xyz.adscope.ad.l6.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // xyz.adscope.ad.l6.e
            public void a(boolean r2) {
                    r1 = this;
                    if (r2 == 0) goto L10
                    xyz.adscope.ad.l6$b r2 = r1.a
                    xyz.adscope.ad.l6 r2 = r2.a
                    android.widget.ImageView r2 = xyz.adscope.ad.l6.k(r2)
                    int r0 = xyz.adscope.amps.R.drawable.asnp_voice_off
                    r2.setImageResource(r0)
                    return
                L10:
                    xyz.adscope.ad.l6$b r2 = r1.a
                    xyz.adscope.ad.l6 r2 = r2.a
                    android.widget.ImageView r2 = xyz.adscope.ad.l6.k(r2)
                    int r0 = xyz.adscope.amps.R.drawable.asnp_voice_on
                    r2.setImageResource(r0)
                    return
            }
        }

        b(xyz.adscope.ad.l6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                xyz.adscope.ad.l6 r2 = r1.a
                xyz.adscope.ad.l6$b$a r0 = new xyz.adscope.ad.l6$b$a
                r0.<init>(r1)
                r2.a(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback {
        final /* synthetic */ xyz.adscope.ad.b4.a a;
        final /* synthetic */ xyz.adscope.ad.l6 b;

        c(xyz.adscope.ad.l6 r1, xyz.adscope.ad.b4.a r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback
        public void onCacheDone(java.io.File r3) {
                r2 = this;
                if (r3 == 0) goto L2d
                boolean r0 = r3.exists()
                if (r0 == 0) goto L2d
                long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
                r3.setLastModified(r0)     // Catch: java.lang.Throwable -> L10
                goto L11
            L10:
            L11:
                xyz.adscope.ad.l6 r0 = r2.b
                android.widget.VideoView r0 = xyz.adscope.ad.l6.l(r0)
                java.lang.String r3 = r3.getAbsolutePath()
                r0.setVideoPath(r3)
                xyz.adscope.ad.b4$a r3 = r2.a
                if (r3 == 0) goto L2d
                xyz.adscope.ad.l6 r0 = r2.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r0.b
                java.lang.String r0 = r0.a()
                r3.b(r0)
            L2d:
                return
        }

        @Override // xyz.adscope.common.v2.cache.IResourceLruCache.IResourceCacheCallback
        public void onCacheException() {
                r2 = this;
                xyz.adscope.ad.b4$a r0 = r2.a
                if (r0 == 0) goto Lf
                xyz.adscope.ad.l6 r1 = r2.b
                xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r1 = r1.b
                java.lang.String r1 = r1.a()
                r0.a(r1)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d {
        public static final int AUTO_PLAY_ALWAYS = 0;
        public static final int AUTO_PLAY_NEVER = 2;
        public static final int AUTO_PLAY_WIFI = 1;

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getAutoPlayCondition() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isLoopPlayback() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isSilentPlayback() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean renderForUnified() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface e {
        void a(boolean r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class f {
        private final xyz.adscope.ad.l6 a;

        private f(xyz.adscope.ad.l6 r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ f(xyz.adscope.ad.l6 r1, xyz.adscope.ad.l6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public void a() {
                r1 = this;
                xyz.adscope.ad.l6 r0 = r1.a
                xyz.adscope.ad.l6.i(r0)
                return
        }

        public void a(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L8
                xyz.adscope.ad.l6 r1 = r0.a
                xyz.adscope.ad.l6.f(r1)
                return
            L8:
                xyz.adscope.ad.l6 r1 = r0.a
                xyz.adscope.ad.l6.g(r1)
                return
        }

        public void b() {
                r1 = this;
                xyz.adscope.ad.l6 r0 = r1.a
                xyz.adscope.ad.l6.j(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class g extends xyz.adscope.common.v2.handle.WeakReferenceHandler {
        private final android.media.MediaPlayer a;
        private final int b;
        private final xyz.adscope.ad.g4 c;

        public g(android.content.Context r1, android.media.MediaPlayer r2, xyz.adscope.ad.g4 r3) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.b = r1
                r0.a = r2
                r0.c = r3
                return
        }

        private void a() {
                r2 = this;
                r0 = 1
                boolean r1 = r2.hasMessages(r0)
                if (r1 == 0) goto La
                r2.removeMessages(r0)
            La:
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.l6.g r0) {
                r0.b()
                return
        }

        private void b() {
                r3 = this;
                android.media.MediaPlayer r0 = r3.a
                boolean r0 = r0.isPlaying()
                if (r0 == 0) goto Le
                r0 = 1
                r1 = 1000(0x3e8, double:4.94E-321)
                r3.sendEmptyMessageAtTime(r0, r1)
            Le:
                return
        }

        static /* synthetic */ void b(xyz.adscope.ad.l6.g r0) {
                r0.a()
                return
        }

        @Override // xyz.adscope.common.v2.handle.WeakReferenceHandler
        public void scopeHandleMessage(android.os.Message r4) {
                r3 = this;
                android.media.MediaPlayer r4 = r3.a
                if (r4 == 0) goto L20
                int r4 = r4.getCurrentPosition()
                xyz.adscope.ad.g4 r0 = r3.c
                if (r0 == 0) goto L15
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.d
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                r0.a(r1, r2)
            L15:
                android.media.MediaPlayer r0 = r3.a
                int r0 = r0.getDuration()
                if (r4 >= r0) goto L20
                r3.b()
            L20:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum h extends java.lang.Enum<xyz.adscope.ad.l6.h> {
        public static final xyz.adscope.ad.l6.h a = null;
        public static final xyz.adscope.ad.l6.h b = null;
        public static final xyz.adscope.ad.l6.h c = null;
        public static final xyz.adscope.ad.l6.h d = null;
        public static final xyz.adscope.ad.l6.h e = null;
        private static final /* synthetic */ xyz.adscope.ad.l6.h[] f = null;

        static {
                xyz.adscope.ad.l6$h r0 = new xyz.adscope.ad.l6$h
                java.lang.String r1 = "VIDEO_PLAYING"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.l6.h.a = r0
                xyz.adscope.ad.l6$h r0 = new xyz.adscope.ad.l6$h
                java.lang.String r1 = "VIDEO_PAUSE"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.l6.h.b = r0
                xyz.adscope.ad.l6$h r0 = new xyz.adscope.ad.l6$h
                java.lang.String r1 = "VIDEO_STANDBY"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.ad.l6.h.c = r0
                xyz.adscope.ad.l6$h r0 = new xyz.adscope.ad.l6$h
                java.lang.String r1 = "VIDEO_IDLE"
                r2 = 3
                r0.<init>(r1, r2)
                xyz.adscope.ad.l6.h.d = r0
                xyz.adscope.ad.l6$h r0 = new xyz.adscope.ad.l6$h
                java.lang.String r1 = "VIDEO_STOPPED"
                r2 = 4
                r0.<init>(r1, r2)
                xyz.adscope.ad.l6.h.e = r0
                xyz.adscope.ad.l6$h[] r0 = a()
                xyz.adscope.ad.l6.h.f = r0
                return
        }

        h(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.l6.h[] a() {
                r0 = 5
                xyz.adscope.ad.l6$h[] r0 = new xyz.adscope.ad.l6.h[r0]
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.a
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.b
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.c
                r2 = 2
                r0[r2] = r1
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.d
                r2 = 3
                r0[r2] = r1
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.e
                r2 = 4
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.l6.h valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.l6$h> r0 = xyz.adscope.ad.l6.h.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.l6$h r1 = (xyz.adscope.ad.l6.h) r1
                return r1
        }

        public static xyz.adscope.ad.l6.h[] values() {
                xyz.adscope.ad.l6$h[] r0 = xyz.adscope.ad.l6.h.f
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.l6$h[] r0 = (xyz.adscope.ad.l6.h[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class i implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener {
        final /* synthetic */ xyz.adscope.ad.l6 a;

        private i(xyz.adscope.ad.l6 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ i(xyz.adscope.ad.l6 r1, xyz.adscope.ad.l6.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer r3) {
                r2 = this;
                xyz.adscope.ad.l6 r0 = r2.a
                r1 = 1
                xyz.adscope.ad.l6.a(r0, r1)
                xyz.adscope.ad.l6 r0 = r2.a
                xyz.adscope.ad.g4 r0 = xyz.adscope.ad.l6.a(r0)
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.e
                int r3 = r3.getDuration()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.a(r1, r3)
                xyz.adscope.ad.l6 r3 = r2.a
                xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.c
                xyz.adscope.ad.l6.a(r3, r0)
                xyz.adscope.ad.l6 r3 = r2.a
                android.widget.ImageView r3 = xyz.adscope.ad.l6.c(r3)
                int r3 = r3.getVisibility()
                if (r3 == 0) goto L41
                xyz.adscope.ad.l6 r3 = r2.a
                android.widget.ImageView r3 = xyz.adscope.ad.l6.c(r3)
                r0 = 0
                r3.setVisibility(r0)
                xyz.adscope.ad.l6 r3 = r2.a
                android.widget.ImageView r3 = xyz.adscope.ad.l6.c(r3)
                int r0 = xyz.adscope.amps.R.drawable.asnp_video_replay_icon
                r3.setImageResource(r0)
            L41:
                xyz.adscope.ad.l6 r3 = r2.a
                xyz.adscope.ad.l6.d(r3)
                return
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
                r0 = this;
                xyz.adscope.ad.l6 r2 = r0.a
                xyz.adscope.ad.l6.e(r2)
                xyz.adscope.ad.l6 r2 = r0.a
                xyz.adscope.ad.g4 r2 = xyz.adscope.ad.l6.a(r2)
                xyz.adscope.ad.h4$a r3 = xyz.adscope.ad.h4.a.g
                int r1 = r1.getCurrentPosition()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.a(r3, r1)
                r1 = 1
                return r1
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer r5) {
                r4 = this;
                xyz.adscope.ad.l6 r0 = r4.a
                xyz.adscope.ad.l6.a(r0, r5)
                xyz.adscope.ad.l6 r0 = r4.a
                xyz.adscope.ad.l6$g r1 = new xyz.adscope.ad.l6$g
                xyz.adscope.ad.l6 r2 = r4.a
                android.content.Context r2 = r2.getContext()
                xyz.adscope.ad.l6 r3 = r4.a
                xyz.adscope.ad.g4 r3 = xyz.adscope.ad.l6.a(r3)
                r1.<init>(r2, r5, r3)
                xyz.adscope.ad.l6.a(r0, r1)
                xyz.adscope.ad.l6 r0 = r4.a
                xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.c
                xyz.adscope.ad.l6.a(r0, r1)
                xyz.adscope.ad.l6 r0 = r4.a
                xyz.adscope.ad.g4 r0 = xyz.adscope.ad.l6.a(r0)
                xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.h
                int r5 = r5.getDuration()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.a(r1, r5)
                xyz.adscope.ad.l6 r5 = r4.a
                xyz.adscope.ad.l6.b(r5)
                return
        }
    }

    public l6(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            xyz.adscope.ad.l6$h r2 = xyz.adscope.ad.l6.h.d
            r1.h = r2
            r2 = 0
            r1.j = r2
            r1.k = r2
            r1.l = r2
            xyz.adscope.ad.l6$i r2 = new xyz.adscope.ad.l6$i
            r0 = 0
            r2.<init>(r1, r0)
            r1.m = r2
            xyz.adscope.ad.g4 r2 = new xyz.adscope.ad.g4
            r2.<init>()
            r1.n = r2
            xyz.adscope.ad.l6$d r2 = new xyz.adscope.ad.l6$d
            r2.<init>()
            r1.p = r2
            xyz.adscope.ad.l6$f r2 = new xyz.adscope.ad.l6$f
            r2.<init>(r1, r0)
            r1.q = r2
            r1.h()
            r1.k()
            return
    }

    static /* synthetic */ android.media.MediaPlayer a(xyz.adscope.ad.l6 r0, android.media.MediaPlayer r1) {
            r0.f = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.ad.g4 a(xyz.adscope.ad.l6 r0) {
            xyz.adscope.ad.g4 r0 = r0.n
            return r0
    }

    static /* synthetic */ xyz.adscope.ad.l6.g a(xyz.adscope.ad.l6 r0, xyz.adscope.ad.l6.g r1) {
            r0.o = r1
            return r1
    }

    static /* synthetic */ xyz.adscope.ad.l6.h a(xyz.adscope.ad.l6 r0, xyz.adscope.ad.l6.h r1) {
            r0.h = r1
            return r1
    }

    static /* synthetic */ boolean a(xyz.adscope.ad.l6 r0, boolean r1) {
            r0.k = r1
            return r1
    }

    private java.lang.String b(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r4) {
            r3 = this;
            if (r4 == 0) goto L2d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r0 = r4.d()
            if (r0 == 0) goto L2d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.type.VideoModel r4 = r4.d()
            java.lang.String r0 = r4.d()
            java.lang.String r1 = r4.a()
            java.lang.String r4 = r4.b()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1f
            return r0
        L1f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L26
            return r1
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L2d
            return r4
        L2d:
            java.lang.String r4 = ""
            return r4
    }

    private void b(xyz.adscope.ad.b4.a r6) {
            r5 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r5.b
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            if (r0 == 0) goto L1d
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.RenderModel r0 = r5.b
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.render.view.ViewModel r0 = r0.f()
            boolean r0 = r0.q()
            if (r0 == 0) goto L1a
            r5.l()
            goto L1d
        L1a:
            r5.m()
        L1d:
            android.widget.VideoView r0 = r5.e
            if (r0 == 0) goto L4c
            xyz.adscope.ad.l6$i r1 = r5.m
            r0.setOnPreparedListener(r1)
            android.widget.VideoView r0 = r5.e
            xyz.adscope.ad.l6$i r1 = r5.m
            r0.setOnCompletionListener(r1)
            android.widget.VideoView r0 = r5.e
            xyz.adscope.ad.l6$i r1 = r5.m
            r0.setOnErrorListener(r1)
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.asset.AssetModel r0 = r5.c
            java.lang.String r0 = r5.b(r0)
            xyz.adscope.common.v2.cache.VideoLruCache r1 = xyz.adscope.common.v2.cache.VideoLruCache.getInstance()
            android.content.Context r2 = r5.getContext()
            xyz.adscope.common.v2.cache.LruCacheModel r3 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            xyz.adscope.ad.l6$c r4 = new xyz.adscope.ad.l6$c
            r4.<init>(r5, r6)
            r1.getCacheResource(r2, r0, r3, r4)
        L4c:
            return
    }

    static /* synthetic */ void b(xyz.adscope.ad.l6 r0) {
            r0.f()
            return
    }

    static /* synthetic */ android.widget.ImageView c(xyz.adscope.ad.l6 r0) {
            android.widget.ImageView r0 = r0.g
            return r0
    }

    static /* synthetic */ void d(xyz.adscope.ad.l6 r0) {
            r0.g()
            return
    }

    static /* synthetic */ void e(xyz.adscope.ad.l6 r0) {
            r0.o()
            return
    }

    private void f() {
            r2 = this;
            xyz.adscope.ad.l6$d r0 = r2.p
            if (r0 == 0) goto L1f
            int r0 = r0.getAutoPlayCondition()
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto Le
            goto L1f
        Le:
            android.content.Context r0 = r2.getContext()
            boolean r0 = xyz.adscope.common.v2.dev.info.NetworkUtil.isWifiConnected(r0)
            if (r0 == 0) goto L1f
            r2.j()
            return
        L1c:
            r2.j()
        L1f:
            return
    }

    static /* synthetic */ void f(xyz.adscope.ad.l6 r0) {
            r0.l()
            return
    }

    private void g() {
            r1 = this;
            xyz.adscope.ad.l6$d r0 = r1.p
            if (r0 == 0) goto Ld
            boolean r0 = r0.isLoopPlayback()
            if (r0 == 0) goto Ld
            r1.j()
        Ld:
            return
    }

    static /* synthetic */ void g(xyz.adscope.ad.l6 r0) {
            r0.m()
            return
    }

    static /* synthetic */ xyz.adscope.ad.l6.h h(xyz.adscope.ad.l6 r0) {
            xyz.adscope.ad.l6$h r0 = r0.h
            return r0
    }

    private void h() {
            r5 = this;
            android.widget.VideoView r0 = new android.widget.VideoView
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r5.e = r0
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r5.addView(r0, r1)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r5.g = r0
            xyz.adscope.ad.l6$a r1 = new xyz.adscope.ad.l6$a
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r1 = r5.getContext()
            r3 = 1119092736(0x42b40000, float:90.0)
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r1, r3)
            android.content.Context r4 = r5.getContext()
            int r3 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r4, r3)
            r0.<init>(r1, r3)
            r1 = 13
            r0.addRule(r1, r2)
            android.widget.ImageView r1 = r5.g
            r5.addView(r1, r0)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            r5.i = r0
            xyz.adscope.ad.l6$b r1 = new xyz.adscope.ad.l6$b
            r1.<init>(r5)
            r0.setOnClickListener(r1)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            android.content.Context r1 = r5.getContext()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r1, r2)
            android.content.Context r3 = r5.getContext()
            int r2 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r3, r2)
            r0.<init>(r1, r2)
            android.content.Context r1 = r5.getContext()
            r2 = 1084227584(0x40a00000, float:5.0)
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r1, r2)
            r0.leftMargin = r1
            android.content.Context r1 = r5.getContext()
            int r1 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.dip2px(r1, r2)
            r0.topMargin = r1
            android.widget.ImageView r1 = r5.i
            r5.addView(r1, r0)
            android.widget.ImageView r0 = r5.i
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    private void i() {
            r2 = this;
            xyz.adscope.ad.l6$h r0 = r2.h
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.a
            if (r0 != r1) goto L27
            xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.b
            r2.h = r0
            android.widget.ImageView r0 = r2.g
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L20
            android.widget.ImageView r0 = r2.g
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.g
            r1 = 17301540(0x1080024, float:2.4979356E-38)
            r0.setImageResource(r1)
        L20:
            xyz.adscope.ad.l6$g r0 = r2.o
            if (r0 == 0) goto L27
            xyz.adscope.ad.l6.g.b(r0)
        L27:
            return
    }

    static /* synthetic */ void i(xyz.adscope.ad.l6 r0) {
            r0.i()
            return
    }

    private void j() {
            r2 = this;
            xyz.adscope.ad.l6$h r0 = r2.h
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.b
            if (r0 == r1) goto La
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.c
            if (r0 != r1) goto L2e
        La:
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.c
            if (r0 != r1) goto L15
            boolean r0 = r2.k
            if (r0 == 0) goto L15
            r0 = 0
            r2.j = r0
        L15:
            r2.n()
            android.widget.ImageView r0 = r2.g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L27
            android.widget.ImageView r0 = r2.g
            r1 = 8
            r0.setVisibility(r1)
        L27:
            xyz.adscope.ad.l6$g r0 = r2.o
            if (r0 == 0) goto L2e
            xyz.adscope.ad.l6.g.a(r0)
        L2e:
            return
    }

    static /* synthetic */ void j(xyz.adscope.ad.l6 r0) {
            r0.j()
            return
    }

    static /* synthetic */ android.widget.ImageView k(xyz.adscope.ad.l6 r0) {
            android.widget.ImageView r0 = r0.i
            return r0
    }

    private void k() {
            r1 = this;
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r0 = r1.getExpressRoot()
            r1.setExpressRoot(r0)
            return
    }

    static /* synthetic */ android.widget.VideoView l(xyz.adscope.ad.l6 r0) {
            android.widget.VideoView r0 = r0.e
            return r0
    }

    private void l() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.f
            if (r0 == 0) goto L8
            r1 = 0
            r0.setVolume(r1, r1)
        L8:
            r0 = 1
            r2.l = r0
            return
    }

    private void m() {
            r3 = this;
            android.media.MediaPlayer r0 = r3.f
            if (r0 == 0) goto La
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r1, r2)
        La:
            r0 = 0
            r3.l = r0
            return
    }

    private void n() {
            r3 = this;
            android.widget.VideoView r0 = r3.e
            int r1 = r3.j
            r0.seekTo(r1)
            int r0 = r3.j
            if (r0 != 0) goto L17
            xyz.adscope.ad.g4 r0 = r3.n
            xyz.adscope.ad.h4$a r1 = xyz.adscope.ad.h4.a.c
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.a(r1, r2)
        L17:
            android.widget.VideoView r0 = r3.e
            r0.start()
            xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.a
            r3.h = r0
            return
    }

    private void o() {
            r2 = this;
            xyz.adscope.ad.l6$h r0 = r2.h
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.a
            if (r0 == r1) goto Lc
            xyz.adscope.ad.l6$h r1 = xyz.adscope.ad.l6.h.b
            if (r0 != r1) goto Lb
            goto Lc
        Lb:
            return
        Lc:
            android.widget.VideoView r0 = r2.e
            r0.stopPlayback()
            xyz.adscope.ad.l6$h r0 = xyz.adscope.ad.l6.h.e
            r2.h = r0
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a() {
            r1 = this;
            android.widget.VideoView r0 = r1.e
            if (r0 == 0) goto L7
            r0.stopPlayback()
        L7:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void a(xyz.adscope.ad.b4.a r1) {
            r0 = this;
            r0.b(r1)
            return
    }

    public void a(xyz.adscope.ad.h4 r2) {
            r1 = this;
            xyz.adscope.ad.g4 r0 = r1.n
            if (r0 == 0) goto L7
            r0.a2(r2)
        L7:
            return
    }

    public void a(xyz.adscope.ad.l6.e r2) {
            r1 = this;
            boolean r0 = r1.l
            if (r0 == 0) goto L8
            r1.m()
            goto Lb
        L8:
            r1.l()
        Lb:
            if (r2 == 0) goto L12
            boolean r0 = r1.l
            r2.a(r0)
        L12:
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void b() {
            r1 = this;
            r1.i()
            xyz.adscope.ad.g4 r0 = r1.n
            r0.b()
            return
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void c() {
            r1 = this;
            r1.j()
            xyz.adscope.ad.g4 r0 = r1.n
            r0.a()
            return
    }

    public xyz.adscope.ad.l6.f getVideoController() {
            r1 = this;
            xyz.adscope.ad.l6$f r0 = r1.q
            return r0
    }

    @Override // xyz.adscope.ad.n6, xyz.adscope.ad.b4
    public void setExpressRoot(xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a r1) {
            r0 = this;
            super.setExpressRoot(r1)
            xyz.adscope.ad.ad.nativead.render.view.asnp.prefab.a.c.a(r1, r0)
            return
    }

    public void setVideoConfig(xyz.adscope.ad.l6.d r3) {
            r2 = this;
            if (r3 == 0) goto L1e
            r2.p = r3
            boolean r0 = r3.renderForUnified()
            if (r0 == 0) goto L11
            android.widget.ImageView r0 = r2.g
            r1 = 8
            r0.setVisibility(r1)
        L11:
            android.widget.VideoView r0 = r2.e
            if (r0 == 0) goto L1e
            boolean r3 = r3.isSilentPlayback()
            if (r3 == 0) goto L1e
            r2.l()
        L1e:
            return
    }
}
