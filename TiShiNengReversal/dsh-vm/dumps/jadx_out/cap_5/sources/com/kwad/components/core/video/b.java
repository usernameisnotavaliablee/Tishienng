package com.kwad.components.core.video;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static boolean ZG;
    private static final java.util.concurrent.atomic.AtomicInteger ZH = null;
    private final java.lang.String TAG;
    private volatile int ZI;
    private com.kwad.sdk.core.video.a.c ZJ;
    private int ZK;
    private long ZL;
    private java.lang.Runnable ZM;
    private com.kwad.sdk.contentalliance.a.a.b ZN;
    private int ZO;
    private java.util.List<com.kwad.sdk.core.video.a.c.d> ZP;
    private final java.util.concurrent.atomic.AtomicBoolean ZQ;
    private boolean ZR;
    private boolean ZS;
    private final int ZU;
    private boolean ZV;
    private volatile java.util.List<com.kwad.components.core.video.l> ZW;
    private volatile java.util.List<com.kwad.components.core.video.a.c> ZX;
    private volatile java.util.List<com.kwad.sdk.core.video.a.c.e> ZY;
    private final com.kwad.sdk.core.video.a.c.f ZZ;
    private int Zo;
    private int Zp;
    private com.kwad.sdk.core.video.a.c.e aaa;
    private com.kwad.sdk.core.video.a.c.i aab;
    private com.kwad.sdk.core.video.a.c.b aac;
    private com.kwad.sdk.core.video.a.c.InterfaceC0148c aad;
    private com.kwad.sdk.core.video.a.c.d aae;
    private com.kwad.sdk.core.video.a.c.a aaf;
    private android.os.Handler iK;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private android.content.Context mContext;
    private com.kwad.components.core.video.DetailVideoView mDetailVideoView;
    private float mSpeed;
    private long mStartTime;












    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.WorkerThread
        void onReleaseSuccess();
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.core.video.b.ZH = r0
            return
    }

    public b(@androidx.annotation.Nullable com.kwad.components.core.video.DetailVideoView r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    private b(@androidx.annotation.Nullable com.kwad.components.core.video.DetailVideoView r3, int r4) {
            r2 = this;
            r2.<init>()
            r4 = 0
            r2.ZI = r4
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.iK = r0
            r0 = 0
            r2.mStartTime = r0
            r2.ZO = r4
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.ZP = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            r2.ZQ = r0
            r2.ZR = r4
            r2.ZS = r4
            r2.ZV = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.mSpeed = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.ZW = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.ZX = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.ZY = r0
            com.kwad.components.core.video.b$1 r0 = new com.kwad.components.core.video.b$1
            r0.<init>(r2)
            r2.ZZ = r0
            com.kwad.components.core.video.b$4 r0 = new com.kwad.components.core.video.b$4
            r0.<init>(r2)
            r2.aaa = r0
            com.kwad.components.core.video.b$5 r0 = new com.kwad.components.core.video.b$5
            r0.<init>(r2)
            r2.aab = r0
            com.kwad.components.core.video.b$6 r0 = new com.kwad.components.core.video.b$6
            r0.<init>(r2)
            r2.aac = r0
            com.kwad.components.core.video.b$7 r0 = new com.kwad.components.core.video.b$7
            r0.<init>(r2)
            r2.aad = r0
            com.kwad.components.core.video.b$8 r0 = new com.kwad.components.core.video.b$8
            r0.<init>(r2)
            r2.aae = r0
            com.kwad.components.core.video.b$9 r0 = new com.kwad.components.core.video.b$9
            r0.<init>(r2)
            r2.aaf = r0
            r2.mDetailVideoView = r3
            if (r3 == 0) goto L87
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.mContext = r3
        L87:
            r2.ZU = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "DetailMediaPlayerImpl["
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.TAG = r3
            java.lang.String r4 = "create DetailMediaPlayerImpl"
            com.kwad.sdk.core.d.c.i(r3, r4)
            return
    }

    public b(@androidx.annotation.Nullable com.kwad.components.core.video.DetailVideoView r1, @androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mAdTemplate = r2
            return
    }

    static /* synthetic */ int a(com.kwad.components.core.video.b r0, int r1) {
            r0.ZI = r1
            return r1
    }

    private void a(com.kwad.components.core.video.a.c r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.a.c> r0 = r1.ZX
            r0.add(r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.video.b r0, com.kwad.sdk.core.video.a.c r1, com.kwad.components.core.video.b.a r2) {
            r0.a(r1, r2)
            return
    }

    static /* synthetic */ void a(com.kwad.components.core.video.b r0, boolean r1) {
            r0.aT(r1)
            return
    }

    private void a(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r4, boolean r5, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r6, @androidx.annotation.NonNull com.kwad.sdk.core.video.a.c r7) {
            r3 = this;
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "initMediaPlayer "
            r1.<init>(r2)
            com.kwad.sdk.core.video.a.c r2 = r3.ZJ
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            if (r4 == 0) goto Lac
            if (r6 == 0) goto Lac
            if (r7 != 0) goto L1d
            goto Lac
        L1d:
            android.content.Context r0 = r3.mContext
            if (r0 != 0) goto L2f
            android.content.Context r0 = r6.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r3.mContext = r0
        L2f:
            r3.ZR = r5
            r3.ZN = r4
            com.kwad.sdk.core.response.model.AdTemplate r5 = r4.adTemplate
            com.kwad.sdk.core.response.model.AdTemplate r0 = r3.mAdTemplate
            java.lang.String r4 = r4.videoUrl
            int r1 = r7.getMediaPlayerType()
            boolean r2 = r3.ZV
            com.kwad.components.core.video.a.a r4 = com.kwad.components.core.video.a.d.a(r5, r0, r4, r1, r2)
            r3.c(r4)
            r3.a(r4)
            com.kwad.components.core.video.DetailVideoView r4 = r3.mDetailVideoView
            if (r4 == r6) goto L67
            java.lang.String r5 = r3.TAG
            java.lang.String r0 = "initMediaPlayer videoView changed"
            com.kwad.sdk.core.d.c.i(r5, r0)
            if (r4 == 0) goto L65
            r5 = 0
            r4.setMediaPlayer(r5)
            boolean r5 = r4.getKeepScreenOn()
            r6.setKeepScreenOn(r5)
            r5 = 0
            r4.setKeepScreenOn(r5)
        L65:
            r3.mDetailVideoView = r6
        L67:
            r6.setMediaPlayer(r3)
            com.kwad.sdk.core.video.a.c r4 = r3.ZJ
            if (r4 == r7) goto L95
            java.lang.String r4 = r3.TAG
            java.lang.String r5 = "initMediaPlayer mediaPlayer changed"
            com.kwad.sdk.core.d.c.i(r4, r5)
            com.kwad.sdk.core.video.a.c r4 = r3.ZJ
            if (r4 == 0) goto L88
            boolean r4 = r4.isLooping()
            r7.setLooping(r4)
            r3.tB()
            com.kwad.sdk.core.video.a.c r4 = r3.ZJ
            r4.release()
        L88:
            r3.ZJ = r7
            r3.reset()
            r3.tA()
            r4 = 3
            r7.setAudioStreamType(r4)
            goto La5
        L95:
            java.lang.String r4 = r3.TAG
            java.lang.String r5 = "initMediaPlayer mediaPlayer not changed"
            com.kwad.sdk.core.d.c.i(r4, r5)
            r3.reset()
            r3.tB()
            r3.tA()
        La5:
            com.kwad.sdk.core.video.a.c r4 = r3.ZJ
            android.view.Surface r5 = r6.aap
            r4.setSurface(r5)
        Lac:
            return
    }

    private void a(com.kwad.sdk.core.video.a.c r4, com.kwad.components.core.video.b.a r5) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L30
        L3:
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "releaseMediaPlayer:"
            r1.<init>(r2)
            int r2 = r3.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r2 = "->STATE_IDLE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            r0 = 2
            r3.bb(r0)     // Catch: java.lang.Throwable -> L2e
            r4.release()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L30
            r5.onReleaseSuccess()     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r4 = move-exception
            goto L31
        L30:
            return
        L31:
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }

    private void aS(boolean r4) {
            r3 = this;
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            if (r0 != 0) goto L5
            goto L1a
        L5:
            java.lang.String r0 = r3.TAG
            java.lang.String r1 = "start prepareAsync"
            com.kwad.sdk.core.d.c.i(r0, r1)
            boolean r0 = r3.ZR
            if (r0 == 0) goto L24
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.ZQ
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L1b
        L1a:
            return
        L1b:
            com.kwad.components.core.video.b$10 r0 = new com.kwad.components.core.video.b$10
            r0.<init>(r3, r4)
            com.kwad.sdk.utils.h.execute(r0)
            return
        L24:
            r3.aT(r4)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r4 = move-exception
            int r0 = r3.getMediaPlayerType()
            r1 = 2
            if (r0 == r1) goto L3c
            int r0 = r3.ZO
            int r1 = r0 + 1
            r3.ZO = r1
            r1 = 4
            if (r0 > r1) goto L3c
            r3.tC()
        L3c:
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "prepareAsync Exception:"
            r1.<init>(r2)
            int r2 = r3.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }

    private void aT(boolean r5) {
            r4 = this;
            com.kwad.sdk.contentalliance.a.a.b r0 = r4.ZN
            r4.b(r0)
            if (r5 == 0) goto Le
            com.kwad.sdk.core.video.a.c r0 = r4.ZJ
            boolean r0 = r0.tW()
            goto L14
        Le:
            com.kwad.sdk.core.video.a.c r0 = r4.ZJ
            boolean r0 = r0.prepareAsync()
        L14:
            java.lang.String r1 = r4.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "prepareAsync forcePrepare: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", result: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            com.kwad.sdk.core.d.c.i(r1, r5)
            return
    }

    static /* synthetic */ int b(com.kwad.components.core.video.b r0) {
            int r0 = r0.ZI
            return r0
    }

    static /* synthetic */ int b(com.kwad.components.core.video.b r0, int r1) {
            r0.Zo = r1
            return r1
    }

    static /* synthetic */ void b(com.kwad.components.core.video.b r0, boolean r1) {
            r0.setKeepScreenOn(r1)
            return
    }

    private void bb(int r4) {
            r3 = this;
            java.util.List<com.kwad.components.core.video.a.c> r0 = r3.ZX
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.kwad.components.core.video.a.c r1 = (com.kwad.components.core.video.a.c) r1
            if (r4 == 0) goto L25
            r2 = 1
            if (r4 == r2) goto L21
            r2 = 2
            if (r4 == r2) goto L1b
            goto L6
        L1b:
            r1.onRelease()     // Catch: java.lang.Exception -> L1f
            goto L6
        L1f:
            r1 = move-exception
            goto L29
        L21:
            r1.onReset()     // Catch: java.lang.Exception -> L1f
            goto L6
        L25:
            r1.onStart()     // Catch: java.lang.Exception -> L1f
            goto L6
        L29:
            com.kwad.sdk.core.d.c.printStackTrace(r1)
            goto L6
        L2d:
            return
    }

    static /* synthetic */ int c(com.kwad.components.core.video.b r0, int r1) {
            r0.Zp = r1
            return r1
    }

    static /* synthetic */ java.lang.String c(com.kwad.components.core.video.b r0) {
            java.lang.String r0 = r0.TAG
            return r0
    }

    static /* synthetic */ int d(com.kwad.components.core.video.b r0, int r1) {
            r0.ZK = r1
            return r1
    }

    static /* synthetic */ java.util.List d(com.kwad.components.core.video.b r0) {
            java.util.List<com.kwad.sdk.core.video.a.c$e> r0 = r0.ZY
            return r0
    }

    static /* synthetic */ com.kwad.sdk.core.video.a.c e(com.kwad.components.core.video.b r0) {
            com.kwad.sdk.core.video.a.c r0 = r0.ZJ
            return r0
    }

    static /* synthetic */ com.kwad.components.core.video.DetailVideoView f(com.kwad.components.core.video.b r0) {
            com.kwad.components.core.video.DetailVideoView r0 = r0.mDetailVideoView
            return r0
    }

    static /* synthetic */ long g(com.kwad.components.core.video.b r2) {
            long r0 = r2.mStartTime
            return r0
    }

    public static java.lang.String getStateString(int r0) {
            switch(r0) {
                case -1: goto L24;
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L12;
                case 6: goto Lf;
                case 7: goto Lc;
                case 8: goto L9;
                case 9: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "STATE_UNKNOWN"
            return r0
        L6:
            java.lang.String r0 = "STATE_COMPLETED"
            return r0
        L9:
            java.lang.String r0 = "PLAYER_STATE_STOPPED"
            return r0
        Lc:
            java.lang.String r0 = "STATE_BUFFERING_PAUSED"
            return r0
        Lf:
            java.lang.String r0 = "STATE_BUFFERING_PLAYING"
            return r0
        L12:
            java.lang.String r0 = "STATE_PAUSED"
            return r0
        L15:
            java.lang.String r0 = "STATE_PLAYING"
            return r0
        L18:
            java.lang.String r0 = "STATE_STARTED"
            return r0
        L1b:
            java.lang.String r0 = "STATE_PREPARED"
            return r0
        L1e:
            java.lang.String r0 = "STATE_PREPARING"
            return r0
        L21:
            java.lang.String r0 = "STATE_IDLE"
            return r0
        L24:
            java.lang.String r0 = "STATE_ERROR"
            return r0
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean h(com.kwad.components.core.video.b r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.ZQ
            return r0
    }

    static /* synthetic */ java.util.List i(com.kwad.components.core.video.b r0) {
            java.util.List<com.kwad.components.core.video.l> r0 = r0.ZW
            return r0
    }

    static /* synthetic */ void j(com.kwad.components.core.video.b r0) {
            r0.tE()
            return
    }

    static /* synthetic */ int k(com.kwad.components.core.video.b r0) {
            int r0 = r0.Zo
            return r0
    }

    static /* synthetic */ int l(com.kwad.components.core.video.b r0) {
            int r0 = r0.Zp
            return r0
    }

    static /* synthetic */ void m(com.kwad.components.core.video.b r0) {
            r0.tx()
            return
    }

    static /* synthetic */ java.lang.Runnable n(com.kwad.components.core.video.b r0) {
            java.lang.Runnable r0 = r0.ZM
            return r0
    }

    static /* synthetic */ float o(com.kwad.components.core.video.b r0) {
            float r0 = r0.mSpeed
            return r0
    }

    static /* synthetic */ android.os.Handler p(com.kwad.components.core.video.b r0) {
            android.os.Handler r0 = r0.iK
            return r0
    }

    private void reset() {
            r3 = this;
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reset:"
            r1.<init>(r2)
            int r2 = r3.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r2 = "->STATE_IDLE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            r0 = 1
            r3.bb(r0)
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            r0.reset()
            r0 = 0
            r3.ZI = r0
            return
    }

    private void setKeepScreenOn(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            if (r0 == 0) goto L7
            r0.setKeepScreenOn(r2)
        L7:
            return
    }

    private void setPlayType(int r2) {
            r1 = this;
            com.kwad.sdk.contentalliance.a.a.b r0 = r1.ZN
            if (r0 == 0) goto La
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus
            if (r0 == 0) goto La
            r0.mVideoPlayerType = r2
        La:
            return
    }

    private void tA() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$f r1 = r2.ZZ
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$e r1 = r2.aaa
            r0.b(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$i r1 = r2.aab
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$b r1 = r2.aac
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$c r1 = r2.aad
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$d r1 = r2.aae
            r0.c(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            com.kwad.sdk.core.video.a.c$a r1 = r2.aaf
            r0.a(r1)
            return
    }

    private void tB() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.b(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.c(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.a(r1)
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            r0.a(r1)
            return
    }

    private void tD() {
            r2 = this;
            r2.tE()
            java.lang.Runnable r0 = r2.ZM
            if (r0 != 0) goto Le
            com.kwad.components.core.video.b$3 r0 = new com.kwad.components.core.video.b$3
            r0.<init>(r2)
            r2.ZM = r0
        Le:
            android.os.Handler r0 = r2.iK
            java.lang.Runnable r1 = r2.ZM
            r0.post(r1)
            return
    }

    private void tE() {
            r2 = this;
            java.lang.Runnable r0 = r2.ZM
            if (r0 == 0) goto Lc
            android.os.Handler r1 = r2.iK
            r1.removeCallbacks(r0)
            r0 = 0
            r2.ZM = r0
        Lc:
            return
    }

    private boolean tF() {
            r2 = this;
            boolean r0 = r2.ZS
            r1 = 1
            if (r0 == 0) goto L14
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBS
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            return r1
        L14:
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBS
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.aBT
            java.lang.Object r0 = com.kwad.sdk.core.config.e.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            return r1
        L31:
            r0 = 0
            return r0
    }

    private void tx() {
            r6 = this;
            long r0 = r6.getCurrentPosition()
            long r2 = r6.getDuration()
            java.util.List<com.kwad.components.core.video.l> r4 = r6.ZW
            if (r4 == 0) goto L22
            java.util.List<com.kwad.components.core.video.l> r4 = r6.ZW
            java.util.Iterator r4 = r4.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L22
            java.lang.Object r5 = r4.next()
            com.kwad.components.core.video.l r5 = (com.kwad.components.core.video.l) r5
            r5.onMediaPlayProgress(r2, r0)
            goto L12
        L22:
            return
    }

    public final void a(com.kwad.components.core.video.b.a r2) {
            r1 = this;
            r0 = 1
            r1.a(r2, r0)
            return
    }

    public final void a(com.kwad.components.core.video.b.a r4, boolean r5) {
            r3 = this;
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "release:"
            r1.<init>(r2)
            int r2 = r3.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r2 = "->STATE_IDLE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            r0 = 0
            r3.setKeepScreenOn(r0)
            android.os.Handler r1 = r3.iK
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            r3.tE()
            r3.tB()
            r3.mDetailVideoView = r2
            com.kwad.sdk.core.video.a.c r1 = r3.ZJ
            if (r1 == 0) goto L49
            if (r5 == 0) goto L44
            com.kwad.components.core.video.b$11 r5 = new com.kwad.components.core.video.b$11
            r5.<init>(r3, r1, r4)
            com.kwad.sdk.utils.h.execute(r5)
            goto L47
        L44:
            r3.a(r1, r4)
        L47:
            r3.ZJ = r2
        L49:
            r3.ZI = r0
            r3.ZO = r0
            return
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.a r3) {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            boolean r1 = r0 instanceof com.kwad.sdk.core.video.a.d
            if (r1 == 0) goto Lb
            com.kwad.sdk.core.video.a.d r0 = (com.kwad.sdk.core.video.a.d) r0
            r0.a(r3)
        Lb:
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r3, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r4) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.a(r3, r0, r1, r4)
            return
    }

    public final void a(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r6, boolean r7, boolean r8, @androidx.annotation.NonNull com.kwad.components.core.video.DetailVideoView r9) {
            r5 = this;
            java.lang.String r0 = r5.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "initMediaPlayer enablePreLoad:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            if (r6 == 0) goto L8a
            if (r9 != 0) goto L19
            goto L8a
        L19:
            com.kwad.sdk.core.config.e.Bi()
            boolean r0 = r5.tF()
            r1 = 0
            if (r0 == 0) goto L42
            com.kwad.components.core.video.g r0 = new com.kwad.components.core.video.g     // Catch: java.lang.Throwable -> L3a
            com.kwad.sdk.core.response.model.AdTemplate r2 = r5.mAdTemplate     // Catch: java.lang.Throwable -> L3a
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L3a
            boolean r2 = com.kwad.components.core.video.g.isWaynePlayerReady()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L42
            java.lang.String r1 = r5.TAG     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = "constructPlayer KwaiWaynePlayer"
            com.kwad.sdk.core.d.c.i(r1, r2)     // Catch: java.lang.Throwable -> L38
            goto L41
        L38:
            r1 = move-exception
            goto L3e
        L3a:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L3e:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r1)
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L54
            android.content.Context r0 = r5.mContext
            boolean r1 = com.kwad.sdk.core.config.e.Bi()
            boolean r2 = com.kwad.sdk.core.config.e.Bj()
            int r3 = r5.ZU
            com.kwad.sdk.core.video.a.c r1 = com.kwad.sdk.core.video.a.e.a(r0, r7, r1, r2, r3)
        L54:
            if (r1 == 0) goto L83
            com.kwad.components.core.video.DetailVideoView r7 = r5.mDetailVideoView     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L64
            int r0 = r1.getMediaPlayerType()     // Catch: java.lang.Throwable -> L62
            r7.bc(r0)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r7 = move-exception
            goto L80
        L64:
            java.lang.String r7 = r5.TAG     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "initMediaPlayer "
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L62
            r0.append(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L62
            com.kwad.sdk.core.d.c.i(r7, r0)     // Catch: java.lang.Throwable -> L62
            goto L83
        L80:
            com.kwad.sdk.core.d.c.printStackTraceOnly(r7)
        L83:
            r7 = 0
            r1.setLooping(r7)
            r5.a(r6, r8, r9, r1)
        L8a:
            return
    }

    public final void a(com.kwad.sdk.core.video.a.c.d r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.sdk.core.video.a.c$d> r0 = r1.ZP
            r0.add(r2)
            return
    }

    public final void a(com.kwad.sdk.core.video.a.c.e r2) {
            r1 = this;
            java.util.List<com.kwad.sdk.core.video.a.c$e> r0 = r1.ZY
            r0.add(r2)
            return
    }

    public final void a(com.kwad.sdk.core.video.a.c r2, int r3, int r4) {
            r1 = this;
            java.util.List<com.kwad.sdk.core.video.a.c$d> r2 = r1.ZP
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            com.kwad.sdk.core.video.a.c$d r0 = (com.kwad.sdk.core.video.a.c.d) r0
            if (r0 != 0) goto L18
            r2.remove()
            goto L6
        L18:
            r0.n(r3, r4)
            goto L6
        L1c:
            return
    }

    public final void b(@androidx.annotation.NonNull com.kwad.sdk.contentalliance.a.a.b r4) {
            r3 = this;
            java.lang.String r0 = r4.videoUrl     // Catch: java.lang.Exception -> L23
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L23
            if (r0 != 0) goto L25
            java.lang.String r0 = r3.TAG     // Catch: java.lang.Exception -> L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = "videoUrl="
            r1.<init>(r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r2 = r4.videoUrl     // Catch: java.lang.Exception -> L23
            r1.append(r2)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L23
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Exception -> L23
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ     // Catch: java.lang.Exception -> L23
            r0.b(r4)     // Catch: java.lang.Exception -> L23
            return
        L23:
            r4 = move-exception
            goto L2d
        L25:
            java.lang.String r4 = r3.TAG     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "videoUrl is null"
            com.kwad.sdk.core.d.c.e(r4, r0)     // Catch: java.lang.Exception -> L23
            return
        L2d:
            com.kwad.sdk.core.d.c.printStackTrace(r4)
            return
    }

    public final void b(com.kwad.sdk.core.video.a.c.d r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<com.kwad.sdk.core.video.a.c$d> r0 = r1.ZP
            r0.remove(r2)
            return
    }

    public final void c(com.kwad.components.core.video.l r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.l> r0 = r1.ZW
            r0.add(r2)
            return
    }

    public final void clear() {
            r1 = this;
            java.util.List<com.kwad.components.core.video.l> r0 = r1.ZW
            r0.clear()
            java.util.List<com.kwad.components.core.video.a.c> r0 = r1.ZX
            r0.clear()
            return
    }

    public final void complete() {
            r3 = this;
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            if (r0 == 0) goto Le
            r0.pause()
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            r1 = 0
            r0.seekTo(r1)
        Le:
            r0 = 9
            r3.ZI = r0
            int r0 = r3.ZI
            r3.onPlayStateChanged(r0)
            java.lang.String r0 = "videoFinishPlay"
            com.kwad.sdk.core.video.a.a.a.eE(r0)
            return
    }

    public final void d(com.kwad.components.core.video.l r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.l> r0 = r1.ZW
            r0.remove(r2)
            return
    }

    public final boolean getAlphaVideoValid() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L7
            boolean r0 = r0 instanceof com.kwad.components.core.video.g
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final int getBufferPercentage() {
            r1 = this;
            int r0 = r1.ZK
            return r0
    }

    public final java.lang.String getCurrentPlayingUrl() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.getCurrentPlayingUrl()
            return r0
    }

    public final long getCurrentPosition() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 == 0) goto L9
            long r0 = r0.getCurrentPosition()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final long getDuration() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 == 0) goto L9
            long r0 = r0.getDuration()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int getMediaPlayerType() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L9
            int r0 = r0.getMediaPlayerType()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final long getPlayDuration() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 == 0) goto L9
            long r0 = r0.getCurrentPosition()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int getVideoHeight() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L9
            int r0 = r0.getVideoHeight()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final int getVideoWidth() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L9
            int r0 = r0.getVideoWidth()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final boolean isPlaying() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L9
            boolean r0 = r0.isPlaying()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public final boolean isPrepared() {
            r2 = this;
            int r0 = r2.ZI
            r1 = 2
            if (r0 == r1) goto L1e
            int r0 = r2.ZI
            r1 = 3
            if (r0 == r1) goto L1e
            int r0 = r2.ZI
            r1 = 5
            if (r0 == r1) goto L1e
            int r0 = r2.ZI
            r1 = 8
            if (r0 == r1) goto L1e
            int r0 = r2.ZI
            r1 = 9
            if (r0 != r1) goto L1c
            goto L1e
        L1c:
            r0 = 0
            return r0
        L1e:
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public final boolean isPreparing() {
            r2 = this;
            int r0 = r2.ZI
            r1 = 1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    public final void onPlayStateChanged(int r2) {
            r1 = this;
            java.util.List<com.kwad.components.core.video.l> r0 = r1.ZW
            if (r0 != 0) goto L5
            return
        L5:
            com.kwad.components.core.video.b$2 r0 = new com.kwad.components.core.video.b$2
            r0.<init>(r1, r2)
            com.kwad.sdk.utils.bw.runOnUiThread(r0)
            return
    }

    public final boolean pause() {
            r6 = this;
            java.lang.String r0 = r6.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pause mCurrentState: "
            r1.<init>(r2)
            int r2 = r6.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            int r0 = r6.ZI
            r1 = 4
            java.lang.String r2 = "videoPausePlay"
            r3 = 5
            r4 = 1
            if (r0 != r1) goto L3a
            com.kwad.sdk.core.video.a.c r0 = r6.ZJ
            r0.pause()
            java.lang.String r0 = r6.TAG
            java.lang.String r1 = "pause STATE_PLAYING->STATE_PAUSED"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r6.ZI = r3
            int r0 = r6.ZI
            r6.onPlayStateChanged(r0)
            com.kwad.sdk.core.video.a.a.a.eE(r2)
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            int r1 = r6.ZI
            r5 = 6
            if (r1 != r5) goto L55
            com.kwad.sdk.core.video.a.c r0 = r6.ZJ
            r0.pause()
            java.lang.String r0 = r6.TAG
            java.lang.String r1 = "pause STATE_BUFFERING_PLAYING->STATE_PAUSED"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r0 = 7
            r6.ZI = r0
            int r0 = r6.ZI
            r6.onPlayStateChanged(r0)
            r0 = 1
        L55:
            int r1 = r6.ZI
            r5 = 3
            if (r1 != r5) goto L71
            com.kwad.sdk.core.video.a.c r0 = r6.ZJ
            r0.pause()
            java.lang.String r0 = r6.TAG
            java.lang.String r1 = "pause STATE_STARTED->STATE_PAUSED"
            com.kwad.sdk.core.d.c.i(r0, r1)
            r6.ZI = r3
            int r0 = r6.ZI
            r6.onPlayStateChanged(r0)
            com.kwad.sdk.core.video.a.a.a.eE(r2)
            r0 = 1
        L71:
            int r1 = r6.ZI
            r2 = 9
            if (r1 != r2) goto Laa
            com.kwad.sdk.core.video.a.c r1 = r6.ZJ
            boolean r1 = r1.isLooping()
            if (r1 == 0) goto Laa
            com.kwad.sdk.core.video.a.c r0 = r6.ZJ
            r0.pause()
            java.lang.String r0 = r6.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pause "
            r1.<init>(r2)
            int r2 = r6.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r2 = "->STATE_PAUSED"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            r6.ZI = r3
            int r0 = r6.ZI
            r6.onPlayStateChanged(r0)
            return r4
        Laa:
            return r0
    }

    public final void prepareAsync() {
            r1 = this;
            r0 = 0
            r1.aS(r0)
            return
    }

    public final void release() {
            r1 = this;
            r0 = 0
            r1.a(r0)
            return
    }

    public final void releaseAsync() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.a(r0, r1)
            return
    }

    public final void restart() {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 == 0) goto Ld
            int r0 = r2.ZI
            r1 = 9
            if (r0 != r1) goto Ld
            r2.start()
        Ld:
            r0 = 3
            r2.setPlayType(r0)
            return
    }

    public final void resume() {
            r4 = this;
            com.kwad.sdk.core.video.a.c r0 = r4.ZJ     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Lf
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "resume but mMediaPlayer is null"
            com.kwad.sdk.core.d.c.e(r0, r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            goto Lee
        Lf:
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "resume state: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            int r2 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.core.d.c.i(r0, r1)     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r1 = 2
            java.lang.String r2 = "resume:"
            if (r0 == r1) goto Lce
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r3 = 3
            if (r0 == r3) goto Lce
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L3a
            goto Lce
        L3a:
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r3 = 5
            if (r0 != r3) goto L71
            com.kwad.sdk.core.video.a.c r0 = r4.ZJ     // Catch: java.lang.Throwable -> Lc
            r0.start()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            int r2 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> Lc
            r3.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "->STATE_PLAYING"
            r3.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.core.d.c.i(r0, r2)     // Catch: java.lang.Throwable -> Lc
            r0 = 4
            r4.ZI = r0     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r4.onPlayStateChanged(r0)     // Catch: java.lang.Throwable -> Lc
            r4.setPlayType(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "videoResumePlay"
            com.kwad.sdk.core.video.a.a.a.eE(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L71:
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r1 = 7
            if (r0 != r1) goto La0
            com.kwad.sdk.core.video.a.c r0 = r4.ZJ     // Catch: java.lang.Throwable -> Lc
            r0.start()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            int r2 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "->STATE_BUFFERING_PLAYING"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.core.d.c.i(r0, r1)     // Catch: java.lang.Throwable -> Lc
            r0 = 6
            r4.ZI = r0     // Catch: java.lang.Throwable -> Lc
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r4.onPlayStateChanged(r0)     // Catch: java.lang.Throwable -> Lc
            return
        La0:
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r1 = 9
            if (r0 != r1) goto Laa
            r4.start()     // Catch: java.lang.Throwable -> Lc
            return
        Laa:
            int r0 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r0 == r1) goto Lcd
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "resume: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            int r2 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = " 此时不能调用resume()方法."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.core.d.c.w(r0, r1)     // Catch: java.lang.Throwable -> Lc
        Lcd:
            return
        Lce:
            java.lang.String r0 = r4.TAG     // Catch: java.lang.Throwable -> Lc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            int r2 = r4.ZI     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "->start()"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            com.kwad.sdk.core.d.c.i(r0, r1)     // Catch: java.lang.Throwable -> Lc
            r4.start()     // Catch: java.lang.Throwable -> Lc
            return
        Lee:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    public final void seekTo(long r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L7
            r0.seekTo(r2)
        L7:
            return
    }

    public final void setAudioEnabled(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L8
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r1, r1)
            return
        L8:
            r1 = 0
            r0.setVolume(r1, r1)
            return
    }

    public final void setIsAlphaVideoPlayer(boolean r2) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            if (r0 == 0) goto L7
            r0.setIsAlphaVideoView(r2)
        L7:
            r1.ZS = r2
            return
    }

    public final void setRadius(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.kwad.components.core.video.DetailVideoView r0 = r1.mDetailVideoView
            r0.setRadius(r2, r3, r4, r5)
            return
    }

    public final void setSpeed(float r3) {
            r2 = this;
            com.kwad.sdk.core.video.a.c r0 = r2.ZJ
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            r2.mSpeed = r3
        Lc:
            r0.setSpeed(r3)
            return
    }

    public final void setSurface(android.view.Surface r2) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 == 0) goto L7
            r0.setSurface(r2)
        L7:
            return
    }

    public final void setTKPlayer() {
            r1 = this;
            r0 = 1
            r1.ZV = r0
            return
    }

    public final void setVolume(float r2, float r3) {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            if (r0 != 0) goto L5
            return
        L5:
            r0.setVolume(r2, r3)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r2)
            return
    }

    public final void start() {
            r9 = this;
            com.kwad.sdk.core.video.a.c r0 = r9.ZJ     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L5
            goto L54
        L5:
            java.lang.String r0 = r9.TAG     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "start state: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L32
            int r2 = r9.ZI     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = getStateString(r2)     // Catch: java.lang.Throwable -> L32
            r1.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L32
            com.kwad.sdk.core.d.c.i(r0, r1)     // Catch: java.lang.Throwable -> L32
            r0 = 0
            r9.bb(r0)     // Catch: java.lang.Throwable -> L32
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            r1 = 1
            if (r0 != 0) goto L35
            java.lang.String r0 = r9.TAG     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "start still not prepared well forcePrepare"
            com.kwad.sdk.core.d.c.i(r0, r2)     // Catch: java.lang.Throwable -> L32
            r9.aS(r1)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r0 = move-exception
            goto Lc0
        L35:
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            r2 = 9
            r3 = 2
            r4 = 3
            if (r0 == r3) goto L55
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            if (r0 != r2) goto L42
            goto L55
        L42:
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            if (r0 != r4) goto L4c
            com.kwad.sdk.core.video.a.c r0 = r9.ZJ     // Catch: java.lang.Throwable -> L32
            r0.start()     // Catch: java.lang.Throwable -> L32
            return
        L4c:
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            r1 = 5
            if (r0 != r1) goto L54
            r9.resume()     // Catch: java.lang.Throwable -> L32
        L54:
            return
        L55:
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L32
            r9.mStartTime = r5     // Catch: java.lang.Throwable -> L32
            long r5 = r9.ZL     // Catch: java.lang.Throwable -> L32
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L6a
            com.kwad.sdk.core.video.a.c r0 = r9.ZJ     // Catch: java.lang.Throwable -> L32
            int r6 = (int) r5     // Catch: java.lang.Throwable -> L32
            long r5 = (long) r6     // Catch: java.lang.Throwable -> L32
            r0.seekTo(r5)     // Catch: java.lang.Throwable -> L32
        L6a:
            com.kwad.sdk.core.video.a.c r0 = r9.ZJ     // Catch: java.lang.Throwable -> L32
            r0.start()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "videoStartPlay"
            com.kwad.sdk.core.video.a.a.a.eE(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r9.TAG     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "start:"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32
            int r6 = r9.ZI     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = getStateString(r6)     // Catch: java.lang.Throwable -> L32
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = "->STATE_STARTED"
            r5.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L32
            com.kwad.sdk.core.d.c.i(r0, r5)     // Catch: java.lang.Throwable -> L32
            com.kwad.sdk.contentalliance.a.a.b r0 = r9.ZN     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lb5
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto Lb5
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            if (r0 != r3) goto Lae
            com.kwad.sdk.contentalliance.a.a.b r0 = r9.ZN     // Catch: java.lang.Throwable -> L32
            com.kwad.sdk.core.response.model.VideoPlayerStatus r0 = r0.videoPlayerStatus     // Catch: java.lang.Throwable -> L32
            int r0 = r0.mVideoPlayerType     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto Laa
            r9.setPlayType(r1)     // Catch: java.lang.Throwable -> L32
            goto Lb5
        Laa:
            r9.setPlayType(r4)     // Catch: java.lang.Throwable -> L32
            goto Lb5
        Lae:
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            if (r0 != r2) goto Lb5
            r9.setPlayType(r4)     // Catch: java.lang.Throwable -> L32
        Lb5:
            r9.ZI = r4     // Catch: java.lang.Throwable -> L32
            int r0 = r9.ZI     // Catch: java.lang.Throwable -> L32
            r9.onPlayStateChanged(r0)     // Catch: java.lang.Throwable -> L32
            r9.tD()     // Catch: java.lang.Throwable -> L32
            return
        Lc0:
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
            return
    }

    public final void start(long r1) {
            r0 = this;
            r0.ZL = r1
            r0.start()
            return
    }

    public final void stopAndPrepareAsync() {
            r3 = this;
            java.lang.String r0 = r3.TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "stopAndPrepareAsync state: "
            r1.<init>(r2)
            int r2 = r3.ZI
            java.lang.String r2 = getStateString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.kwad.sdk.core.d.c.i(r0, r1)
            int r0 = r3.ZI
            r1 = 1
            if (r0 == r1) goto L5c
            int r0 = r3.ZI
            r1 = 2
            if (r0 != r1) goto L24
            goto L5c
        L24:
            int r0 = r3.ZI
            r1 = 3
            r2 = 8
            if (r0 == r1) goto L49
            int r0 = r3.ZI
            r1 = 4
            if (r0 == r1) goto L49
            int r0 = r3.ZI
            r1 = 5
            if (r0 == r1) goto L49
            int r0 = r3.ZI
            r1 = 6
            if (r0 == r1) goto L49
            int r0 = r3.ZI
            r1 = 7
            if (r0 == r1) goto L49
            int r0 = r3.ZI
            if (r0 == r2) goto L49
            int r0 = r3.ZI
            r1 = 9
            if (r0 != r1) goto L59
        L49:
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ     // Catch: java.lang.Exception -> L59
            r0.stop()     // Catch: java.lang.Exception -> L59
            r3.ZI = r2     // Catch: java.lang.Exception -> L59
            int r0 = r3.ZI     // Catch: java.lang.Exception -> L59
            r3.onPlayStateChanged(r0)     // Catch: java.lang.Exception -> L59
            r3.prepareAsync()     // Catch: java.lang.Exception -> L59
            return
        L59:
            r3.release()
        L5c:
            return
    }

    public final void tC() {
            r3 = this;
            com.kwad.sdk.core.video.a.c r0 = r3.ZJ
            java.lang.String r1 = "resetAndPlay"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "mMediaPlayer is null"
            com.kwad.sdk.core.d.c.w(r1, r0)
            return
        Lc:
            int r0 = r3.ZI
            r2 = 2
            if (r0 == r2) goto L2e
            int r0 = r3.ZI
            r2 = 3
            if (r0 == r2) goto L2e
            int r0 = r3.ZI
            r2 = 4
            if (r0 == r2) goto L2e
            int r0 = r3.ZI
            r2 = 5
            if (r0 != r2) goto L21
            goto L2e
        L21:
            r3.reset()
            r3.tB()
            r3.tA()
            r3.prepareAsync()
            return
        L2e:
            java.lang.String r0 = "can not resetAndPlay in state:"
            com.kwad.sdk.core.d.c.w(r1, r0)
            return
    }

    public final com.kwad.sdk.core.video.a.c tz() {
            r1 = this;
            com.kwad.sdk.core.video.a.c r0 = r1.ZJ
            return r0
    }
}
