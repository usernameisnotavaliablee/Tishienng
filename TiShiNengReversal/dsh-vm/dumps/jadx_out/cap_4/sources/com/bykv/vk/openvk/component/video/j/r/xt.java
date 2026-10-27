package com.bykv.vk.openvk.component.video.j.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt extends com.bykv.vk.openvk.component.video.j.r.j {
    private volatile boolean ae;
    private final com.bykv.vk.openvk.component.video.j.r.xt.j cw;

    /* renamed from: m, reason: collision with root package name */
    private final java.lang.Object f1706m;

    /* renamed from: r, reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.j.j.j f1707r;
    private android.view.Surface up;
    private final android.media.MediaPlayer xt;

    private static class j implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener {
        private final java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> j;

        public j(com.bykv.vk.openvk.component.video.j.r.xt r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.j = r0
                return
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer r2, int r3) {
                r1 = this;
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r2 = r1.j     // Catch: java.lang.Throwable -> Le
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Le
                com.bykv.vk.openvk.component.video.j.r.xt r2 = (com.bykv.vk.openvk.component.video.j.r.xt) r2     // Catch: java.lang.Throwable -> Le
                if (r2 == 0) goto L10
                r2.j(r3)     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r2 = move-exception
                goto L11
            L10:
                return
            L11:
                java.lang.String r3 = "CSJ_VIDEO"
                java.lang.String r0 = "AndroidMediaPlayerListenerHolder.onBufferingUpdate error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r3, r0, r2)
                return
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r3 = r2.j     // Catch: java.lang.Throwable -> Le
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Le
                com.bykv.vk.openvk.component.video.j.r.xt r3 = (com.bykv.vk.openvk.component.video.j.r.xt) r3     // Catch: java.lang.Throwable -> Le
                if (r3 == 0) goto L10
                r3.cw()     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                goto L11
            L10:
                return
            L11:
                java.lang.String r0 = "CSJ_VIDEO"
                java.lang.String r1 = "AndroidMediaPlayerListenerHolder.onCompletion error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r1, r3)
                return
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(android.media.MediaPlayer r6, int r7, int r8) {
                r5 = this;
                java.lang.String r6 = "CSJ_VIDEO"
                r0 = 0
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L2c
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2c
                java.lang.String r4 = "onError: "
                r3[r0] = r4     // Catch: java.lang.Throwable -> L2c
                r4 = 1
                r3[r4] = r1     // Catch: java.lang.Throwable -> L2c
                r1 = 2
                r3[r1] = r2     // Catch: java.lang.Throwable -> L2c
                com.bykv.vk.openvk.component.video.api.m.cw.j(r6, r3)     // Catch: java.lang.Throwable -> L2c
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r1 = r5.j     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2c
                com.bykv.vk.openvk.component.video.j.r.xt r1 = (com.bykv.vk.openvk.component.video.j.r.xt) r1     // Catch: java.lang.Throwable -> L2c
                if (r1 == 0) goto L2e
                boolean r6 = r1.j(r7, r8)     // Catch: java.lang.Throwable -> L2c
                if (r6 == 0) goto L2e
                return r4
            L2c:
                r7 = move-exception
                goto L2f
            L2e:
                return r0
            L2f:
                java.lang.String r8 = "AndroidMediaPlayerListenerHolder.onError error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r6, r8, r7)
                return r0
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer r3, int r4, int r5) {
                r2 = this;
                java.lang.String r3 = "CSJ_VIDEO"
                r0 = 0
                java.lang.String r1 = "onInfo: "
                com.bykv.vk.openvk.component.video.api.m.cw.j(r3, r1)     // Catch: java.lang.Throwable -> L1a
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r1 = r2.j     // Catch: java.lang.Throwable -> L1a
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L1a
                com.bykv.vk.openvk.component.video.j.r.xt r1 = (com.bykv.vk.openvk.component.video.j.r.xt) r1     // Catch: java.lang.Throwable -> L1a
                if (r1 == 0) goto L1c
                boolean r3 = r1.xt(r4, r5)     // Catch: java.lang.Throwable -> L1a
                if (r3 == 0) goto L1c
                r3 = 1
                return r3
            L1a:
                r4 = move-exception
                goto L1d
            L1c:
                return r0
            L1d:
                java.lang.String r5 = "AndroidMediaPlayerListenerHolder.onInfo error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r3, r5, r4)
                return r0
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r3 = r2.j     // Catch: java.lang.Throwable -> Le
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Le
                com.bykv.vk.openvk.component.video.j.r.xt r3 = (com.bykv.vk.openvk.component.video.j.r.xt) r3     // Catch: java.lang.Throwable -> Le
                if (r3 == 0) goto L10
                r3.xt()     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                goto L11
            L10:
                return
            L11:
                java.lang.String r0 = "CSJ_VIDEO"
                java.lang.String r1 = "AndroidMediaPlayerListenerHolder.onPrepared error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r1, r3)
                return
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer r3) {
                r2 = this;
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r3 = r2.j     // Catch: java.lang.Throwable -> Le
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> Le
                com.bykv.vk.openvk.component.video.j.r.xt r3 = (com.bykv.vk.openvk.component.video.j.r.xt) r3     // Catch: java.lang.Throwable -> Le
                if (r3 == 0) goto L10
                r3.r()     // Catch: java.lang.Throwable -> Le
                return
            Le:
                r3 = move-exception
                goto L11
            L10:
                return
            L11:
                java.lang.String r0 = "CSJ_VIDEO"
                java.lang.String r1 = "AndroidMediaPlayerListenerHolder.onSeekComplete error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r1, r3)
                return
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer r2, int r3, int r4) {
                r1 = this;
                java.lang.ref.WeakReference<com.bykv.vk.openvk.component.video.j.r.xt> r2 = r1.j     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> Lf
                com.bykv.vk.openvk.component.video.j.r.xt r2 = (com.bykv.vk.openvk.component.video.j.r.xt) r2     // Catch: java.lang.Throwable -> Lf
                if (r2 == 0) goto L11
                r0 = 1
                r2.j(r3, r4, r0, r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r2 = move-exception
                goto L12
            L11:
                return
            L12:
                java.lang.String r3 = "CSJ_VIDEO"
                java.lang.String r4 = "AndroidMediaPlayerListenerHolder.onVideoSizeChanged error: "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r3, r4, r2)
                return
        }
    }

    public xt() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f1706m = r0
            monitor-enter(r0)
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            r3.xt = r1     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r3.j(r1)
            r0 = 3
            r1.setAudioStreamType(r0)     // Catch: java.lang.Throwable -> L1b
            goto L23
        L1b:
            r0 = move-exception
            java.lang.String r1 = "CSJ_VIDEO"
            java.lang.String r2 = "setAudioStreamType error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
        L23:
            com.bykv.vk.openvk.component.video.j.r.xt$j r0 = new com.bykv.vk.openvk.component.video.j.r.xt$j
            r0.<init>(r3)
            r3.cw = r0
            r3.av()
            return
        L2e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }

    private void av() {
            r2 = this;
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnPreparedListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnBufferingUpdateListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnCompletionListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnSeekCompleteListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnVideoSizeChangedListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnErrorListener(r1)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.openvk.component.video.j.r.xt$j r1 = r2.cw
            r0.setOnInfoListener(r1)
            return
    }

    private void az() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            com.bykv.vk.openvk.component.video.j.j.j r0 = r3.f1707r
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "CSJ_VIDEO"
            java.lang.String r2 = "releaseMediaDataSource error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
        L16:
            r0 = 0
            r3.f1707r = r0
        L19:
            return
    }

    private void i() {
            r1 = this;
            android.view.Surface r0 = r1.up     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto La
            r0.release()     // Catch: java.lang.Throwable -> La
            r0 = 0
            r1.up = r0     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    private void j(android.media.MediaPlayer r12) {
            r11 = this;
            java.lang.String r0 = "CSJ_VIDEO"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L9
            goto L7d
        L9:
            java.lang.String r1 = "android.media.MediaTimeProvider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r2 = "android.media.SubtitleController"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = "android.media.SubtitleController$Anchor"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "android.media.SubtitleController$Listener"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L72
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L72
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L72
            r7 = 1
            r6[r7] = r1     // Catch: java.lang.Throwable -> L72
            r1 = 2
            r6[r1] = r4     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Constructor r4 = r2.getConstructor(r6)     // Catch: java.lang.Throwable -> L72
            android.content.Context r6 = com.bykv.vk.openvk.component.video.api.cw.getContext()     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L72
            r5[r8] = r6     // Catch: java.lang.Throwable -> L72
            r6 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L72
            r5[r1] = r6     // Catch: java.lang.Throwable -> L72
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "mHandler"
            java.lang.reflect.Field r5 = r2.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L72
            r5.setAccessible(r7)     // Catch: java.lang.Throwable -> L72
            android.os.Handler r9 = new android.os.Handler     // Catch: java.lang.Throwable -> L74
            r9.<init>()     // Catch: java.lang.Throwable -> L74
            r5.set(r4, r9)     // Catch: java.lang.Throwable -> L74
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> L72
            java.lang.Class r5 = r12.getClass()     // Catch: java.lang.Throwable -> L72
            java.lang.String r9 = "setSubtitleAnchor"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L72
            r10[r8] = r2     // Catch: java.lang.Throwable -> L72
            r10[r7] = r3     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Method r2 = r5.getMethod(r9, r10)     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L72
            r1[r8] = r4     // Catch: java.lang.Throwable -> L72
            r1[r7] = r6     // Catch: java.lang.Throwable -> L72
            r2.invoke(r12, r1)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r12 = move-exception
            goto L83
        L74:
            r12 = move-exception
            java.lang.String r1 = "subtitleInstance error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r1, r12)     // Catch: java.lang.Throwable -> L7e
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> L72
        L7d:
            return
        L7e:
            r12 = move-exception
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> L72
            throw r12     // Catch: java.lang.Throwable -> L72
        L83:
            java.lang.String r1 = "setSubtitleController error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r0, r1, r12)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void ae() throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.pause()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void cw(boolean r2) throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.setLooping(r2)
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            super.finalize()
            r0.i()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public long g() {
            r3 = this;
            android.media.MediaPlayer r0 = r3.xt     // Catch: java.lang.Throwable -> L8
            int r0 = r0.getCurrentPosition()     // Catch: java.lang.Throwable -> L8
            long r0 = (long) r0
            return r0
        L8:
            r0 = move-exception
            java.lang.String r1 = "CSJ_VIDEO"
            java.lang.String r2 = "getCurrentPosition error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void j(long r3, int r5) throws java.lang.Throwable {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L39
            if (r5 == 0) goto L30
            r0 = 1
            if (r5 == r0) goto L28
            r0 = 2
            if (r5 == r0) goto L20
            r0 = 3
            if (r5 == r0) goto L18
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            r5.seekTo(r4)
            return
        L18:
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            long r3 = (long) r4
            com.beizi.ad.internal.activity.d.a(r5, r3, r0)
            return
        L20:
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            long r3 = (long) r4
            com.beizi.ad.internal.activity.d.a(r5, r3, r0)
            return
        L28:
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            long r3 = (long) r4
            com.beizi.ad.internal.activity.d.a(r5, r3, r0)
            return
        L30:
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            long r3 = (long) r4
            r0 = 0
            com.beizi.ad.internal.activity.d.a(r5, r3, r0)
            return
        L39:
            android.media.MediaPlayer r5 = r2.xt
            int r4 = (int) r3
            r5.seekTo(r4)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    @android.annotation.TargetApi(14)
    public void j(android.view.Surface r2) {
            r1 = this;
            r1.i()
            r1.up = r2
            android.media.MediaPlayer r0 = r1.xt
            r0.setSurface(r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void j(android.view.SurfaceHolder r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.f1706m
            monitor-enter(r0)
            boolean r1 = r2.ae     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L1d
            if (r3 == 0) goto L1d
            android.view.Surface r1 = r3.getSurface()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            boolean r1 = r2.j     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            android.media.MediaPlayer r1 = r2.xt     // Catch: java.lang.Throwable -> L19
            r1.setDisplay(r3)     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    @com.bytedance.component.sdk.annotation.RequiresApi(api = 23)
    public synchronized void j(com.bykv.vk.openvk.component.video.api.cw.r r2) {
            r1 = this;
            monitor-enter(r1)
            android.content.Context r0 = com.bykv.vk.openvk.component.video.api.cw.getContext()     // Catch: java.lang.Throwable -> L17
            com.bykv.vk.openvk.component.video.j.j.j r0 = com.bykv.vk.openvk.component.video.j.j.j.j(r0, r2)     // Catch: java.lang.Throwable -> L17
            r1.f1707r = r0     // Catch: java.lang.Throwable -> L17
            com.bykv.vk.openvk.component.video.j.j.xt.cw.j(r2)     // Catch: java.lang.Throwable -> L17
            android.media.MediaPlayer r2 = r1.xt     // Catch: java.lang.Throwable -> L17
            com.bykv.vk.openvk.component.video.j.j.j r0 = r1.f1707r     // Catch: java.lang.Throwable -> L17
            com.bykv.vk.openvk.component.video.j.r.b.a(r2, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    @com.bytedance.component.sdk.annotation.RequiresApi(api = 23)
    public void j(com.bykv.vk.openvk.component.video.api.xt r3) throws java.lang.Throwable {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            android.media.MediaPlayer r0 = r2.xt
            android.media.PlaybackParams r0 = com.bykv.vk.openvk.component.video.j.r.a.a(r0)
            float r3 = r3.j()
            android.media.PlaybackParams r3 = com.bykv.vk.component.ttvideo.player.d.a(r0, r3)
            android.media.MediaPlayer r0 = r2.xt
            com.bykv.vk.component.ttvideo.player.g.a(r0, r3)
        L19:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void j(java.io.FileDescriptor r2) throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.setDataSource(r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void j(java.lang.String r4) throws java.lang.Throwable {
            r3 = this;
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r1 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L20
            java.lang.String r2 = "file"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L20
            android.media.MediaPlayer r4 = r3.xt
            java.lang.String r0 = r0.getPath()
            r4.setDataSource(r0)
            return
        L20:
            android.media.MediaPlayer r0 = r3.xt
            r0.setDataSource(r4)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public int jy() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void m() throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.stop()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public long oq() {
            r3 = this;
            android.media.MediaPlayer r0 = r3.xt     // Catch: java.lang.Throwable -> L8
            int r0 = r0.getDuration()     // Catch: java.lang.Throwable -> L8
            long r0 = (long) r0
            return r0
        L8:
            r0 = move-exception
            java.lang.String r1 = "CSJ_VIDEO"
            java.lang.String r2 = "getDuration error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void qv() throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.f1706m
            monitor-enter(r0)
            boolean r1 = r2.ae     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            android.media.MediaPlayer r1 = r2.xt     // Catch: java.lang.Throwable -> L1c
            r1.release()     // Catch: java.lang.Throwable -> L1c
            r1 = 1
            r2.ae = r1     // Catch: java.lang.Throwable -> L1c
            r2.i()     // Catch: java.lang.Throwable -> L1c
            r2.az()     // Catch: java.lang.Throwable -> L1c
            r2.j()     // Catch: java.lang.Throwable -> L1c
            r2.av()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r1 = move-exception
            goto L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void r(boolean r2) throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            if (r0 != 0) goto L5
            return
        L5:
            if (r2 == 0) goto Lc
            r2 = 0
            r0.setVolume(r2, r2)
            return
        Lc:
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r2, r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void tl() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            if (r0 == 0) goto L7
            r0.prepareAsync()
        L7:
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void up() throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.start()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void up(boolean r2) {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.setLooping(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void vl() throws java.lang.Throwable {
            r3 = this;
            android.media.MediaPlayer r0 = r3.xt     // Catch: java.lang.Throwable -> L6
            r0.reset()     // Catch: java.lang.Throwable -> L6
            goto Le
        L6:
            r0 = move-exception
            java.lang.String r1 = "CSJ_VIDEO"
            java.lang.String r2 = "reset error: "
            com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r0)
        Le:
            r3.az()
            r3.j()
            r3.av()
            return
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public int ws() {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.bykv.vk.openvk.component.video.j.r.cw
    public void xt(boolean r2) throws java.lang.Throwable {
            r1 = this;
            android.media.MediaPlayer r0 = r1.xt
            r0.setScreenOnWhilePlaying(r2)
            return
    }
}
