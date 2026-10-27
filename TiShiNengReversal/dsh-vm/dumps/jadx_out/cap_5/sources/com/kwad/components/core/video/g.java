package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class g extends com.kwad.sdk.core.video.a.a {
    private static java.util.concurrent.atomic.AtomicBoolean aaP;
    private final java.lang.String TAG;
    private final java.lang.Object aaK;
    private java.lang.String aaL;
    private final com.kwad.components.core.video.g.a aaM;
    private com.kwad.components.core.o.a.a.a aaN;
    private com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule aaO;
    private boolean aaQ;
    private boolean aaR;
    private boolean aaS;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnBufferingUpdateListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnCompletionListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnErrorListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnInfoListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnPreparedListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnSeekCompleteListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVideoSizeChangedListener, com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVseReportListener {
        final java.lang.String TAG;
        final java.lang.ref.WeakReference<com.kwad.components.core.video.g> mWeakMediaPlayer;

        a(com.kwad.components.core.video.g r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mWeakMediaPlayer = r0
                r1.TAG = r3
                return
        }

        private com.kwad.components.core.video.g tZ() {
                r1 = this;
                java.lang.ref.WeakReference<com.kwad.components.core.video.g> r0 = r1.mWeakMediaPlayer
                java.lang.Object r0 = r0.get()
                com.kwad.components.core.video.g r0 = (com.kwad.components.core.video.g) r0
                return r0
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnBufferingUpdateListener
        public final void onBufferingUpdate(int r2) {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                com.kwad.components.core.video.g.a(r0, r2)
            L9:
                return
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnCompletionListener
        public final void onCompletion() {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                com.kwad.components.core.video.g.d(r0)
            L9:
                return
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnErrorListener
        public final boolean onError(int r2, int r3) {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto Lb
                boolean r2 = com.kwad.components.core.video.g.c(r0, r2, r3)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnInfoListener
        public final boolean onInfo(int r4, int r5) {
                r3 = this;
                com.kwad.components.core.video.g r0 = r3.tZ()
                r1 = 0
                if (r0 == 0) goto L1f
                r2 = 3
                if (r4 != r2) goto L1a
                boolean r2 = com.kwad.components.core.video.g.b(r0)
                if (r2 != 0) goto L19
                r1 = 1
                com.kwad.components.core.video.g.a(r0, r1)
                boolean r4 = com.kwad.components.core.video.g.a(r0, r4, r5)
                return r4
            L19:
                return r1
            L1a:
                boolean r4 = com.kwad.components.core.video.g.b(r0, r4, r5)
                return r4
            L1f:
                return r1
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnPreparedListener
        public final void onPrepared() {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                com.kwad.components.core.video.g.a(r0)
            L9:
                return
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnSeekCompleteListener
        public final void onSeekComplete() {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                com.kwad.components.core.video.g.c(r0)
            L9:
                return
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(int r2, int r3) {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                com.kwad.components.core.video.g.d(r0, r2, r3)
            L9:
                return
        }

        @Override // com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule.OnVseReportListener
        public final void onVseReport(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                com.kwad.components.core.video.g r0 = r1.tZ()
                if (r0 == 0) goto L9
                r0.n(r2, r3)
            L9:
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.core.video.g.aaP = r0
            return
    }

    public g(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r3, com.kwad.sdk.core.response.model.AdTemplate r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "KwaiWaynePlayer"
            r2.TAG = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.aaK = r1
            r1 = 0
            r2.aaQ = r1
            r2.aaR = r1
            r2.aaS = r1
            r2.mAdTemplate = r4
            com.kwad.components.core.video.g$a r4 = new com.kwad.components.core.video.g$a
            r4.<init>(r2, r0)
            r2.aaM = r4
            java.lang.Class<com.kwad.components.core.o.a.a.a> r4 = com.kwad.components.core.o.a.a.a.class
            com.kwad.sdk.components.b r4 = com.kwad.sdk.components.d.f(r4)
            com.kwad.components.core.o.a.a.a r4 = (com.kwad.components.core.o.a.a.a) r4
            r2.aaN = r4
            if (r4 == 0) goto L63
            boolean r4 = r4.qt()
            if (r4 == 0) goto L63
            java.lang.String r4 = r3.manifest
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r0 = 1
            if (r4 != 0) goto L46
            java.lang.String r3 = r3.manifest
            r2.aaL = r3
            com.kwad.components.core.o.a.a.a r4 = r2.aaN
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r3 = r4.getAdWaynePlayerPlayModule(r3, r0)
            r2.aaO = r3
            goto L52
        L46:
            java.lang.String r3 = r3.videoUrl
            r2.aaL = r3
            com.kwad.components.core.o.a.a.a r4 = r2.aaN
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r3 = r4.getAdWaynePlayerPlayModule(r3, r1)
            r2.aaO = r3
        L52:
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r3 = r2.aaO
            if (r3 == 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r3 = com.kwad.components.core.video.g.aaP
            r3.set(r0)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r3 = r2.aaO
            r3.setLooping(r1)
            r2.tX()
        L63:
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.video.g r0) {
            r0.notifyOnPrepared()
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.video.g r0, int r1) {
            r0.notifyOnBufferingUpdate(r1)
            return
    }

    static /* synthetic */ boolean a(com.kwad.components.core.video.g r0, int r1, int r2) {
            boolean r0 = r0.notifyOnInfo(r1, r2)
            return r0
    }

    static /* synthetic */ boolean a(com.kwad.components.core.video.g r0, boolean r1) {
            r1 = 1
            r0.aaS = r1
            return r1
    }

    static /* synthetic */ boolean b(com.kwad.components.core.video.g r0) {
            boolean r0 = r0.aaS
            return r0
    }

    static /* synthetic */ boolean b(com.kwad.components.core.video.g r0, int r1, int r2) {
            boolean r0 = r0.notifyOnInfo(r1, r2)
            return r0
    }

    static /* synthetic */ void c(com.kwad.components.core.video.g r0) {
            r0.notifyOnSeekComplete()
            return
    }

    static /* synthetic */ boolean c(com.kwad.components.core.video.g r0, int r1, int r2) {
            boolean r0 = r0.notifyOnError(r1, r2)
            return r0
    }

    static /* synthetic */ void d(com.kwad.components.core.video.g r0) {
            r0.notifyOnCompletion()
            return
    }

    static /* synthetic */ void d(com.kwad.components.core.video.g r0, int r1, int r2) {
            r0.x(r1, r2)
            return
    }

    public static boolean isWaynePlayerReady() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.core.video.g.aaP
            boolean r0 = r0.get()
            return r0
    }

    private void tX() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L3a
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnPreparedListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnCompletionListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnBufferingUpdateListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnSeekCompleteListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnVideoSizeChangedListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnErrorListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnInfoListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            com.kwad.components.core.video.g$a r1 = r2.aaM
            r0.setOnVseReportListener(r1)
        L3a:
            return
    }

    private void tY() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L2b
            r1 = 0
            r0.setOnPreparedListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnCompletionListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnBufferingUpdateListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnSeekCompleteListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnVideoSizeChangedListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnErrorListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnInfoListener(r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.setOnVseReportListener(r1)
        L2b:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void b(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r3) {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L21
            java.lang.String r0 = r3.manifest
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L17
            java.lang.String r3 = r3.manifest
            r2.aaL = r3
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r1 = 1
            r0.setDataSource(r3, r1)
            return
        L17:
            java.lang.String r3 = r3.videoUrl
            r2.aaL = r3
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r1 = 0
            r0.setDataSource(r3, r1)
        L21:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getAudioSessionId() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            int r0 = r0.getAudioSessionId()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final java.lang.String getCurrentPlayingUrl() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getCurrentPlayingUrl()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getCurrentPosition() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L9
            long r0 = r0.getCurrentPosition()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final java.lang.String getDataSource() {
            r1 = this;
            java.lang.String r0 = r1.aaL
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getDuration() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L9
            long r0 = r0.getDuration()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getMediaPlayerType() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoHeight() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoWidth() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isLooping() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            boolean r0 = r0.isLooping()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isPlaying() {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L9
            boolean r0 = r0.isPlaying()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void n(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            com.kwad.components.core.video.a.e r0 = new com.kwad.components.core.video.a.e
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = r2.mAdTemplate
            if (r1 == 0) goto Lc
            r0.setAdTemplate(r1)
        Lc:
            r0.aN(r3)
            r0.aO(r4)
            com.kwad.components.core.video.g$1 r3 = new com.kwad.components.core.video.g$1
            r3.<init>(r2, r0)
            com.kwad.sdk.utils.h.execute(r3)
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void pause() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L10
            java.lang.String r0 = "KwaiWaynePlayer"
            java.lang.String r1 = "pause"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.pause()
        L10:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean prepareAsync() {
            r5 = this;
            java.lang.String r0 = "KwaiWaynePlayer"
            boolean r1 = r5.aaR
            r2 = 0
            if (r1 != 0) goto L2e
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r1 = r5.aaO
            if (r1 != 0) goto Lc
            goto L2e
        Lc:
            r3 = 1
            r5.aaR = r3     // Catch: java.lang.IllegalStateException -> L28
            boolean r1 = r1.prepareAsync()     // Catch: java.lang.IllegalStateException -> L28
            r5.JV()     // Catch: java.lang.IllegalStateException -> L28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L28
            java.lang.String r4 = "prepareAsync result: "
            r3.<init>(r4)     // Catch: java.lang.IllegalStateException -> L28
            r3.append(r1)     // Catch: java.lang.IllegalStateException -> L28
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalStateException -> L28
            com.kwad.sdk.core.d.c.i(r0, r3)     // Catch: java.lang.IllegalStateException -> L28
            return r1
        L28:
            r1 = move-exception
            java.lang.String r3 = "prepareAsync failed "
            com.kwad.sdk.core.d.c.e(r0, r3, r1)
        L2e:
            return r2
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void release() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L15
            r1 = 1
            r2.aaQ = r1
            r0.release()
            r2.resetListeners()     // Catch: java.lang.Throwable -> L11
            r2.tY()     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
        L15:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void reset() {
            r1 = this;
            r0 = 0
            r1.aaR = r0
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L13
            r0.reset()     // Catch: java.lang.Throwable -> L11
            r1.resetListeners()     // Catch: java.lang.Throwable -> L11
            r1.tX()     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r0 = move-exception
            goto L14
        L13:
            return
        L14:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void seekTo(long r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L7
            r0.seekTo(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setAudioStreamType(int r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L7
            r0.setAudioStreamType(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(android.content.Context r1, android.net.Uri r2) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(android.content.Context r1, android.net.Uri r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(java.io.FileDescriptor r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(java.lang.String r5) {
            r4 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r4.aaO
            if (r0 == 0) goto L2c
            r4.aaL = r5
            android.net.Uri r0 = android.net.Uri.parse(r5)
            java.lang.String r1 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 != 0) goto L27
            java.lang.String r2 = "file"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L27
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r5 = r4.aaO
            java.lang.String r0 = r0.getPath()
            r5.setDataSource(r0, r3)
            return
        L27:
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r4.aaO
            r0.setDataSource(r5, r3)
        L2c:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDisplay(android.view.SurfaceHolder r3) {
            r2 = this;
            java.lang.Object r0 = r2.aaK
            monitor-enter(r0)
            boolean r1 = r2.aaQ     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r1 = r2.aaO     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r1.setDisplay(r3)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setLooping(boolean r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L7
            r0.setLooping(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setScreenOnWhilePlaying(boolean r1) {
            r0 = this;
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSpeed(float r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto La
            r0.setSpeed(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            goto Lb
        La:
            return
        Lb:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    @android.annotation.TargetApi(14)
    public final void setSurface(android.view.Surface r2) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L7
            r0.setSurface(r2)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setVolume(float r2, float r3) {
            r1 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r1.aaO
            if (r0 == 0) goto L7
            r0.setVolume(r2, r3)
        L7:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void start() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L10
            java.lang.String r0 = "KwaiWaynePlayer"
            java.lang.String r1 = "start"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.start()
        L10:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void stop() {
            r2 = this;
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            if (r0 == 0) goto L10
            java.lang.String r0 = "KwaiWaynePlayer"
            java.lang.String r1 = "stop"
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.components.offline.api.core.adWaynePlayer.IAdWaynePlayerPlayModule r0 = r2.aaO
            r0.stop()
        L10:
            return
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean tW() {
            r1 = this;
            boolean r0 = r1.prepareAsync()
            return r0
    }
}
