package com.bykv.vk.component.ttvideo;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class TTVideoEngine implements com.bykv.vk.component.ttvideo.log.a, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener, com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener {
    public static final int ENGINE_STATE_ERROR = 4;
    public static final int ENGINE_STATE_PLAYER_RUNNING = 3;
    public static final int ENGINE_STATE_RELEASE = 5;
    public static final int ENGINE_STATE_UNKNOWN = 0;
    public static final int LOAD_STATE_ERROR = 3;
    public static final int LOAD_STATE_PLAYABLE = 1;
    public static final int LOAD_STATE_STALLED = 2;
    public static final int LOAD_STATE_UNKNOWN = 0;
    public static final int PLAYBACK_STATE_ERROR = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_STOPPED = 0;
    public static final int PLAYER_BUFFERING_DATA_OF_MILLISECONDS = 118;
    public static final int PLAYER_BUFFERING_TIMEOUT = 11;
    public static final int PLAYER_MAX_BUFFERING_DATA_OF_MILLISECONDS = 202;
    public static final int PLAYER_NETWORK_TIMEOUT = 12;
    public static final int PLAYER_OPTION_ENABLE_DATALOADER = 160;
    public static final int PLAYER_OPTION_NOTIFY_BUFFERING_DIRECTLY = 322;
    public static final int PLAYER_OPTION_OUTPUT_LOG = 472;
    public static final int PLAYER_TIME_BASE = 1000000;
    public static final int PLAYER_TYPE_OS = 1;
    public static final int PLAYER_TYPE_OWN = 0;

    /* renamed from: l0, reason: collision with root package name */
    private static boolean f1640l0;
    private final java.util.HashMap<java.lang.String, java.lang.String> A;
    com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback B;
    com.bykv.vk.component.ttvideo.SeekCompletionListener C;
    private final android.content.Context D;
    private android.view.Surface E;
    private android.view.SurfaceHolder F;
    private final com.bykv.vk.component.ttvideo.log.b G;
    private com.bykv.vk.component.ttvideo.player.MediaPlayer H;
    private android.os.Handler I;
    private int J;
    private boolean K;
    private float L;
    private boolean M;
    private java.lang.String N;
    private boolean O;
    private java.lang.String P;
    private int Q;
    private boolean R;
    private com.bykv.vk.component.ttvideo.utils.Error S;
    private boolean T;
    private boolean U;
    private int V;
    private final com.bykv.vk.component.ttvideo.utils.a W;
    private boolean X;
    private final java.util.Map<java.lang.String, java.lang.String> Y;
    private final java.util.List<java.lang.String> Z;
    private boolean a;
    private java.lang.String a0;
    private int b;
    private boolean b0;
    private boolean c;
    private long c0;
    private boolean d;

    /* renamed from: d0, reason: collision with root package name */
    private int f1641d0;
    private int e;

    /* renamed from: e0, reason: collision with root package name */
    private long f1642e0;
    private boolean f;

    /* renamed from: f0, reason: collision with root package name */
    private long f1643f0;
    private boolean g;

    /* renamed from: g0, reason: collision with root package name */
    private java.io.FileDescriptor f1644g0;
    private boolean h;

    /* renamed from: h0, reason: collision with root package name */
    private com.bykv.vk.component.ttvideo.b f1645h0;
    private boolean i;

    /* renamed from: i0, reason: collision with root package name */
    private int f1646i0;
    private boolean j;

    /* renamed from: j0, reason: collision with root package name */
    private int f1647j0;
    private int k;

    /* renamed from: k0, reason: collision with root package name */
    private int f1648k0;

    /* renamed from: l, reason: collision with root package name */
    private int f1649l;

    /* renamed from: m, reason: collision with root package name */
    private int f1650m;

    /* renamed from: n, reason: collision with root package name */
    private int f1651n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1652o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1653p;

    /* renamed from: q, reason: collision with root package name */
    private int f1654q;

    /* renamed from: r, reason: collision with root package name */
    private int f1655r;

    /* renamed from: s, reason: collision with root package name */
    private int f1656s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1657t;

    /* renamed from: u, reason: collision with root package name */
    private int f1658u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1659v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1660w;

    /* renamed from: x, reason: collision with root package name */
    private int f1661x;

    /* renamed from: y, reason: collision with root package name */
    private java.lang.String f1662y;

    /* renamed from: z, reason: collision with root package name */
    private int f1663z;

    class a implements java.lang.Runnable {
        final /* synthetic */ com.bykv.vk.component.ttvideo.player.MediaPlayer a;

        a(com.bykv.vk.component.ttvideo.TTVideoEngine r1, com.bykv.vk.component.ttvideo.player.MediaPlayer r2) {
                r0 = this;
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.a
                if (r0 == 0) goto L1c
                r0.release()     // Catch: java.lang.Exception -> L8
                return
            L8:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "release Exception "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "TTVideoEngine"
                com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            L1c:
                return
        }
    }

    class b extends android.os.Handler {
        final /* synthetic */ com.bykv.vk.component.ttvideo.TTVideoEngine a;

        b(com.bykv.vk.component.ttvideo.TTVideoEngine r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                super.handleMessage(r5)
                int r0 = r5.what
                r1 = 10
                if (r0 != r1) goto L2f
                java.lang.Object r0 = r5.obj
                java.lang.String r0 = (java.lang.String) r0
                int r5 = r5.arg1
                long r1 = (long) r5
                com.bykv.vk.component.ttvideo.TTVideoEngine r5 = r4.a
                int r5 = com.bykv.vk.component.ttvideo.TTVideoEngine.a(r5)
                r3 = 5
                if (r5 != r3) goto L1a
                goto L2f
            L1a:
                com.bykv.vk.component.ttvideo.TTVideoEngine r5 = r4.a
                java.util.Map r5 = com.bykv.vk.component.ttvideo.TTVideoEngine.b(r5)
                boolean r5 = r5.containsKey(r0)
                if (r5 == 0) goto L2f
                com.bykv.vk.component.ttvideo.TTVideoEngine r5 = r4.a
                com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r5 = r5.B
                if (r5 == 0) goto L2f
                r5.onMDLHitCache(r0, r1)
            L2f:
                return
        }
    }

    private static class c implements java.lang.Runnable {
        private final java.util.Map<java.lang.String, java.lang.String> a;
        private final java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.TTVideoEngine> b;

        public c(com.bykv.vk.component.ttvideo.TTVideoEngine r2, java.util.Map<java.lang.String, java.lang.String> r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.b = r0
                r1.a = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r7 = this;
                java.lang.ref.WeakReference<com.bykv.vk.component.ttvideo.TTVideoEngine> r0 = r7.b
                java.lang.Object r0 = r0.get()
                com.bykv.vk.component.ttvideo.TTVideoEngine r0 = (com.bykv.vk.component.ttvideo.TTVideoEngine) r0
                if (r0 == 0) goto L61
                int r1 = com.bykv.vk.component.ttvideo.TTVideoEngine.a(r0)
                r2 = 5
                if (r1 == r2) goto L61
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.a
                if (r1 == 0) goto L61
                int r1 = r1.size()
                if (r1 <= 0) goto L61
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.a
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L25:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L61
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.util.Map<java.lang.String, java.lang.String> r3 = r7.a
                java.lang.Object r3 = r3.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L44
                long r3 = com.bykv.vk.component.ttvideo.TTVideoEngine.getCacheFileSizeByFilePath(r2, r3)
                goto L48
            L44:
                long r3 = com.bykv.vk.component.ttvideo.TTVideoEngine.getCacheFileSize(r2)
            L48:
                android.os.Handler r5 = com.bykv.vk.component.ttvideo.TTVideoEngine.c(r0)
                if (r5 == 0) goto L25
                android.os.Handler r5 = com.bykv.vk.component.ttvideo.TTVideoEngine.c(r0)
                android.os.Handler r6 = com.bykv.vk.component.ttvideo.TTVideoEngine.c(r0)
                int r4 = (int) r3
                r3 = 10
                android.os.Message r2 = android.os.Message.obtain(r6, r3, r4, r4, r2)
                r5.sendMessage(r2)
                goto L25
            L61:
                return
        }
    }

    public TTVideoEngine(android.content.Context r7, int r8) {
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f = r0
            r6.g = r0
            r1 = 0
            r6.k = r1
            r6.f1649l = r1
            r6.f1650m = r1
            r6.f1651n = r1
            r6.f1654q = r1
            r2 = 30
            r6.f1655r = r2
            r2 = 5000(0x1388, float:7.006E-42)
            r6.f1656s = r2
            r6.f1658u = r0
            r6.f1660w = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.A = r0
            r6.J = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.L = r0
            r6.M = r1
            java.lang.String r0 = ""
            r6.N = r0
            r6.O = r1
            r6.P = r0
            r6.Q = r1
            r6.R = r1
            r0 = 0
            r6.S = r0
            r6.T = r1
            r6.U = r1
            r3 = -1
            r6.V = r3
            r6.X = r1
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r6.Y = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6.Z = r4
            r6.a0 = r0
            r6.b0 = r1
            r4 = 0
            r6.c0 = r4
            r6.f1641d0 = r3
            r6.f1646i0 = r1
            r6.f1647j0 = r1
            r6.f1648k0 = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "init, type:"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r6.D = r7
            r6.f1663z = r8
            boolean r8 = com.bykv.vk.component.ttvideo.TTVideoEngine.f1640l0
            r6.f1657t = r8
            com.bykv.vk.component.ttvideo.log.d r8 = new com.bykv.vk.component.ttvideo.log.d
            r8.<init>(r7, r6)
            r6.G = r8
            com.bykv.vk.component.ttvideo.utils.a r8 = new com.bykv.vk.component.ttvideo.utils.a
            r8.<init>()
            r6.W = r8
            com.bykv.vk.component.ttvideo.log.e r8 = com.bykv.vk.component.ttvideo.log.e.c
            r8.a(r7)
            return
    }

    static /* synthetic */ int a(com.bykv.vk.component.ttvideo.TTVideoEngine r0) {
            int r0 = r0.b
            return r0
    }

    private java.lang.String a(java.lang.String r8, java.lang.String r9, long r10, java.lang.String[] r12, java.lang.String r13) {
            r7 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r6 = r13
            java.lang.String r8 = r0._proxyUrl(r1, r2, r3, r5, r6)
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L47
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "_mdlUrl get proxyUrl: key = "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r10 = ", videoId = "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r10, r9)
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 == 0) goto L36
            r9 = r1
            goto L37
        L36:
            r9 = r2
        L37:
            r7.a0 = r9
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L44
            java.util.Map<java.lang.String, java.lang.String> r9 = r7.Y
            r9.put(r1, r6)
        L44:
            r7.d()
        L47:
            return r8
    }

    private void a(int r3, int r4) {
            r2 = this;
            int r0 = r2.f1649l
            if (r0 == r3) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "load state changed prev:"
            r0.<init>(r1)
            int r1 = r2.f1649l
            r0.append(r1)
            java.lang.String r1 = ", new:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 2
            r1 = 3
            if (r3 != r0) goto L33
            boolean r0 = r2.a
            if (r0 == 0) goto L33
            boolean r0 = r2.c
            if (r0 != 0) goto L33
            int r0 = r2.f1649l
            if (r0 == r1) goto L33
            r2.V = r4
        L33:
            r2.f1649l = r3
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r4 = r2.B
            if (r4 == 0) goto L42
            boolean r0 = r2.T
            if (r0 != 0) goto L3f
            if (r3 == r1) goto L42
        L3f:
            r4.onLoadStateChanged(r2, r3)
        L42:
            return
    }

    private void a(com.bykv.vk.component.ttvideo.utils.Error r3) {
            r2 = this;
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto Ld
            com.bykv.vk.component.ttvideo.log.b r1 = r2.G
            int r0 = r0.b()
            r1.b(r0)
        Ld:
            com.bykv.vk.component.ttvideo.log.b r0 = r2.G
            r1 = 0
            r0.a(r3, r1)
            r2.j = r1
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r2.B
            if (r0 == 0) goto L1c
            r0.onError(r3)
        L1c:
            r2.Q = r1
            return
    }

    private void a(java.lang.String r13, java.util.HashMap r14) {
            r12 = this;
            java.lang.String r1 = "kTTVideoErrorDomainVideoOwnPlayer"
            java.lang.String r2 = "kTTVideoErrorDomainVideoOSPlayer"
            boolean r0 = r12.U
            java.lang.String r3 = "TTVideoEngine"
            if (r0 == 0) goto L10
            java.lang.String r13 = "_playInternal should stop"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.w(r3, r13)
            return
        L10:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L25
            boolean r0 = r12.isSystemPlayer()
            if (r0 == 0) goto L25
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.release()
            r12.H = r4
            r12.b0 = r5
        L25:
            r12.b(r13)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r6 = 1
            if (r0 != 0) goto L6f
            android.content.Context r0 = r12.D
            int r3 = r12.f1663z
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = com.bykv.vk.component.ttvideo.a.a(r0, r3)
            r12.H = r0
            int r0 = r0.getPlayerType()
            if (r0 == 0) goto L42
            if (r0 != r6) goto L44
            r12.f1663z = r5
            goto L44
        L42:
            r12.f1663z = r6
        L44:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnPreparedListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnBufferingUpdateListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnCompletionListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnErrorListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnSeekCompleteListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnInfoListener(r12)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.setOnVideoSizeChangedListener(r12)
            boolean r0 = r12.K
            r12.b(r0)
            r12.h = r5
            goto L99
        L6f:
            com.bykv.vk.component.ttvideo.utils.Error r0 = r12.S
            if (r0 == 0) goto L99
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "mediaPlayer reset, surface holder:"
            r0.<init>(r7)
            android.view.SurfaceHolder r7 = r12.F
            r0.append(r7)
            java.lang.String r7 = " ,surface empty:"
            r0.append(r7)
            android.view.Surface r7 = r12.E
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r0.reset()
            r12.h = r5
            r12.S = r4
        L99:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.J
            r4 = 100
            r0.setIntOption(r4, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r3 = 82
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r3 = 59
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r3 = 97
            r0.setIntOption(r3, r6)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1654q
            r5 = 223(0xdf, float:3.12E-43)
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1655r
            r5 = 81
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1656s
            r5 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r5
            r5 = 9
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            boolean r3 = r12.f
            r3 = r3 ^ r6
            r5 = 196(0xc4, float:2.75E-43)
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            r3 = 94
            r0.setIntOption(r3, r6)
            float r0 = r12.L
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto Lf4
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r12.H
            r3.setVolume(r0, r0)
        Lf4:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1647j0
            r5 = 86
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1648k0
            r5 = 110(0x6e, float:1.54E-43)
            r0.setIntOption(r5, r3)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            int r3 = r12.f1646i0
            r5 = 211(0xd3, float:2.96E-43)
            r0.setIntOption(r5, r3)
            boolean r0 = r12.f1657t
            if (r0 == 0) goto L126
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.Y
            r0.<init>(r3)
            java.util.concurrent.ExecutorService r3 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a()
            com.bykv.vk.component.ttvideo.TTVideoEngine$c r5 = new com.bykv.vk.component.ttvideo.TTVideoEngine$c
            r5.<init>(r12, r0)
            r3.execute(r5)
        L126:
            r3 = -9992(0xffffffffffffd8f8, float:NaN)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H     // Catch: java.lang.Throwable -> L13b
            boolean r5 = r12.f1660w     // Catch: java.lang.Throwable -> L13b
            r0.setScreenOnWhilePlaying(r5)     // Catch: java.lang.Throwable -> L13b
            int r0 = r12.f1661x     // Catch: java.lang.Throwable -> L13b
            if (r0 == 0) goto L13f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r5 = r12.H     // Catch: java.lang.Throwable -> L13b
            android.content.Context r6 = r12.D     // Catch: java.lang.Throwable -> L13b
            r5.setWakeMode(r6, r0)     // Catch: java.lang.Throwable -> L13b
            goto L13f
        L13b:
            r0 = move-exception
            r13 = r0
            goto L1d5
        L13f:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H     // Catch: java.lang.Throwable -> L13b
            boolean r5 = r12.f1659v     // Catch: java.lang.Throwable -> L13b
            r0.setLooping(r5)     // Catch: java.lang.Throwable -> L13b
            java.io.FileDescriptor r7 = r12.f1644g0     // Catch: java.lang.Throwable -> L13b
            if (r7 == 0) goto L154
            com.bykv.vk.component.ttvideo.player.MediaPlayer r6 = r12.H     // Catch: java.lang.Throwable -> L13b
            long r8 = r12.f1642e0     // Catch: java.lang.Throwable -> L13b
            long r10 = r12.f1643f0     // Catch: java.lang.Throwable -> L13b
            r6.setDataSource(r7, r8, r10)     // Catch: java.lang.Throwable -> L13b
            goto L166
        L154:
            if (r14 != 0) goto L15b
            java.util.HashMap r14 = new java.util.HashMap     // Catch: java.lang.Throwable -> L13b
            r14.<init>()     // Catch: java.lang.Throwable -> L13b
        L15b:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H     // Catch: java.lang.Throwable -> L13b
            android.content.Context r5 = r12.D     // Catch: java.lang.Throwable -> L13b
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch: java.lang.Throwable -> L13b
            r0.setDataSource(r5, r13, r14)     // Catch: java.lang.Throwable -> L13b
        L166:
            java.lang.String r13 = r12.f1662y
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L177
            com.bykv.vk.component.ttvideo.player.MediaPlayer r13 = r12.H
            java.lang.String r14 = r12.f1662y
            r0 = 205(0xcd, float:2.87E-43)
            r13.setStringOption(r0, r14)
        L177:
            boolean r13 = r12.R
            if (r13 == 0) goto L182
            com.bykv.vk.component.ttvideo.player.MediaPlayer r13 = r12.H
            int r14 = r12.e
            r13.setIntOption(r4, r14)
        L182:
            boolean r13 = r12.h
            if (r13 != 0) goto L1ce
            android.view.SurfaceHolder r13 = r12.F
            if (r13 == 0) goto L1a4
            com.bykv.vk.component.ttvideo.b r13 = r12.f1645h0
            if (r13 != 0) goto L19a
            com.bykv.vk.component.ttvideo.b r13 = new com.bykv.vk.component.ttvideo.b
            r13.<init>(r12)
            r12.f1645h0 = r13
            android.view.SurfaceHolder r14 = r12.F
            r14.addCallback(r13)
        L19a:
            android.view.SurfaceHolder r13 = r12.F
            android.view.Surface r13 = r13.getSurface()
        L1a0:
            r12.a(r13)
            goto L1a9
        L1a4:
            android.view.Surface r13 = r12.E
            if (r13 == 0) goto L1a9
            goto L1a0
        L1a9:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r13 = r12.H     // Catch: java.lang.Exception -> L1b6
            r13.prepareAsync()     // Catch: java.lang.Exception -> L1b6
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r13 = r12.B
            if (r13 == 0) goto L1d1
            r13.onPrepare(r12)
            goto L1d1
        L1b6:
            r0 = move-exception
            r13 = r0
            com.bykv.vk.component.ttvideo.utils.Error r14 = new com.bykv.vk.component.ttvideo.utils.Error
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L1c3
            r1 = r2
        L1c3:
            java.lang.String r13 = r13.toString()
            r14.<init>(r1, r3, r13)
            r12.b(r14)
            return
        L1ce:
            r12.o()
        L1d1:
            r13 = 3
            r12.b = r13
            return
        L1d5:
            com.bykv.vk.component.ttvideo.utils.Error r14 = new com.bykv.vk.component.ttvideo.utils.Error
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r12.H
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L1e0
            r1 = r2
        L1e0:
            java.lang.String r13 = r13.toString()
            r14.<init>(r1, r3, r13)
            r12.b(r14)
            return
    }

    private void a(boolean r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_stop, mState:"
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            int r0 = r2.b
            if (r0 == 0) goto L24
            r1 = 3
            if (r0 != r1) goto L27
        L24:
            r0 = 1
            r2.d = r0
        L27:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L3c
            if (r3 == 0) goto L3c
            boolean r3 = r2.isSystemPlayer()
            if (r3 != 0) goto L3c
            boolean r3 = r2.h
            if (r3 == 0) goto L3c
            com.bykv.vk.component.ttvideo.player.MediaPlayer r3 = r2.H
            r3.stop()
        L3c:
            com.bykv.vk.component.ttvideo.utils.a r3 = r2.W
            if (r3 == 0) goto L43
            r3.e()
        L43:
            int r3 = r2.k
            if (r3 == 0) goto L54
            com.bykv.vk.component.ttvideo.utils.a r3 = r2.W
            if (r3 == 0) goto L54
            com.bykv.vk.component.ttvideo.log.b r0 = r2.G
            int r3 = r3.b()
            r0.b(r3)
        L54:
            com.bykv.vk.component.ttvideo.log.b r3 = r2.G
            r3.c(r4)
            r3 = 0
            r2.e(r3)
            r2.a = r3
            r2.f1652o = r3
            r2.f1653p = r3
            r0 = 0
            r2.c0 = r0
            r2.Q = r3
            return
    }

    public static void addTask(com.bykv.vk.component.ttvideo.PreloaderURLItem r1) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.addTask(r1)
            return
    }

    static /* synthetic */ java.util.Map b(com.bykv.vk.component.ttvideo.TTVideoEngine r0) {
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.Y
            return r0
    }

    private void b() {
            r3 = this;
            r0 = 0
            r3.M = r0
            r3.O = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r1.getPlayerType()
            if (r1 != 0) goto L17
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            r1.release()
            r3.H = r2
        L17:
            r3.m()
            r3.b = r0
            r3.Q = r0
            r3.P = r2
            r3.N = r2
            r3.f1662y = r2
            r3.f1644g0 = r2
            r3.b0 = r0
            r3.a = r0
            r3.f1652o = r0
            r3.f1653p = r0
            com.bykv.vk.component.ttvideo.utils.a r1 = r3.W
            r1.c()
            r3.X = r0
            r1 = 0
            r3.c0 = r1
            r1 = -1
            r3.f1641d0 = r1
            java.util.List<java.lang.String> r1 = r3.Z
            r1.clear()
            r3.d = r0
            r1 = 1
            r3.g = r1
            r3.e = r0
            return
    }

    private void b(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffering end,this:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", code:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto L26
            boolean r1 = r2.a
            if (r1 == 0) goto L26
            r0.d()
        L26:
            r0 = -1
            r2.V = r0
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r2.B
            if (r0 == 0) goto L30
            r0.onBufferEnd(r3)
        L30:
            r0 = 1
            r2.a(r0, r3)
            return
    }

    private void b(com.bykv.vk.component.ttvideo.utils.Error r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "videoEngine failed:"
            r0.<init>(r1)
            java.lang.String r1 = r7.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            boolean r0 = r6.d
            r2 = 0
            if (r0 == 0) goto L1f
            r6.b = r2
            return
        L1f:
            int r0 = r6.f()
            boolean r3 = r6.R
            if (r3 != 0) goto L4f
            int r3 = r6.J
            if (r3 == 0) goto L30
            r6.e = r3
            r6.J = r2
            goto L4f
        L30:
            boolean r3 = r6.isSystemPlayer()
            if (r3 == 0) goto L40
            boolean r3 = r6.isSystemPlayer()
            if (r3 == 0) goto L4f
            boolean r3 = r6.h
            if (r3 == 0) goto L4f
        L40:
            int r3 = r6.f1650m
            if (r3 <= 0) goto L4d
            int r3 = r0 - r3
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            if (r3 <= r4) goto L4d
            r6.e = r2
            goto L4f
        L4d:
            r6.e = r0
        L4f:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r6.H
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L68
            boolean r0 = r0.isOSPlayer()
            if (r0 == 0) goto L68
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r6.H
            r0.release()
            r6.H = r3
            r6.f = r4
            r6.a(r7)
            return
        L68:
            r0 = 4
            r6.b = r0
            int r0 = r6.Q
            int r5 = r6.f1658u
            if (r0 < r5) goto L7a
            java.lang.String r0 = "videoEngine retry failed"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r0)
            r6.a(r7)
            return
        L7a:
            boolean r0 = r7.notNeedRetry()
            if (r0 == 0) goto L89
            java.lang.String r0 = "not need retry"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r0)
            r6.a(r7)
            return
        L89:
            r6.R = r4
            int r0 = r6.Q
            int r1 = r6.f1658u
            int r1 = r1 - r4
            if (r0 == r1) goto L98
            boolean r0 = r7.needFallbackOS()
            if (r0 == 0) goto La3
        L98:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r6.H
            if (r0 == 0) goto La1
            r0.release()
            r6.H = r3
        La1:
            r6.f1663z = r4
        La3:
            com.bykv.vk.component.ttvideo.log.b r0 = r6.G
            r0.a(r7, r2, r2)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r7 = r6.B
            if (r7 == 0) goto Lb1
            int r0 = r6.f1663z
            r7.onRetry(r0)
        Lb1:
            int r7 = r6.Q
            int r7 = r7 + r4
            r6.Q = r7
            boolean r7 = r6.M
            if (r7 == 0) goto Lbd
            java.lang.String r7 = r6.N
            goto Lbf
        Lbd:
            java.lang.String r7 = r6.P
        Lbf:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r6.A
            r6.a(r7, r0)
            return
    }

    private void b(java.lang.String r3) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.g
            if (r0 == 0) goto L15
            r0 = 0
            r2.g = r0
            com.bykv.vk.component.ttvideo.log.b r0 = r2.G
            java.lang.String r1 = ""
            r0.a(r3, r1)
        L15:
            com.bykv.vk.component.ttvideo.log.b r0 = r2.G
            r0.a(r3)
            return
    }

    static /* synthetic */ android.os.Handler c(com.bykv.vk.component.ttvideo.TTVideoEngine r0) {
            android.os.Handler r0 = r0.I
            return r0
    }

    private void c() {
            r3 = this;
            java.lang.String r0 = "_audioRenderStart, this:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 != 0) goto L14
            goto L39
        L14:
            boolean r1 = r3.f1653p
            if (r1 != 0) goto L1b
            r1 = 1
            r3.f1653p = r1
        L1b:
            boolean r1 = r3.a
            if (r1 == 0) goto L20
            goto L39
        L20:
            r1 = 62
            r2 = -100
            int r0 = r0.getIntOption(r1, r2)
            if (r0 != 0) goto L39
            boolean r0 = r3.i
            if (r0 != 0) goto L39
            boolean r0 = r3.T
            if (r0 == 0) goto L39
            boolean r0 = r3.f
            if (r0 == 0) goto L39
            r3.k()
        L39:
            return
    }

    private void c(int r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffering start,this:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", code:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.utils.a r0 = r3.W
            if (r0 == 0) goto L22
            r0.e()
        L22:
            boolean r0 = r3.b0
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r1 = r3.B
            if (r1 == 0) goto L2c
            r2 = 0
            r1.onBufferStart(r4, r0, r2)
        L2c:
            r0 = 2
            r3.a(r0, r4)
            return
    }

    private void c(boolean r3) {
            r2 = this;
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r1 = "seek complete"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto L14
            if (r3 == 0) goto L14
            boolean r1 = r2.a
            if (r1 == 0) goto L14
            r0.d()
        L14:
            com.bykv.vk.component.ttvideo.SeekCompletionListener r0 = r2.C
            if (r0 == 0) goto L1e
            r0.onCompletion(r3)
            r3 = 0
            r2.C = r3
        L1e:
            return
    }

    public static void cancelAllPreloadTasks() {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.cancelAllTasks()
            return
    }

    public static void cancelPreloadTask(java.lang.String r1) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.cancelTask(r1)
            return
    }

    public static void clearAllCaches() {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.clearAllCaches()
            return
    }

    public static void closeDataLoader() {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.close()
            return
    }

    private void d() {
            r2 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            java.lang.String r1 = r2.a0
            r0._addEngine(r2, r1)
            return
    }

    private void d(int r4) {
            r3 = this;
            java.lang.String r0 = "render seek complete:"
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.log.b r0 = r3.G
            r0.a()
            boolean r0 = r3.c
            if (r0 == 0) goto L1b
            r0 = 0
            r3.c = r0
        L1b:
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r3.B
            if (r0 == 0) goto L31
            java.lang.String r0 = "render seek complete call back "
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r2)
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r3.B
            r0.onRenderSeekComplete(r4)
        L31:
            return
    }

    private void e() {
            r3 = this;
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            java.lang.String r1 = r3.a0
            r0._removeEngine(r3, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.Y
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bykv.vk.component.ttvideo.DataLoaderHelper r2 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r2._removePlayTask(r1)
            goto L13
        L27:
            r3.n()
            return
    }

    private void e(int r3) {
            r2 = this;
            int r0 = r2.k
            if (r0 == r3) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "playback state changed prev:"
            r0.<init>(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = ", new:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.k = r3
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r2.B
            if (r0 == 0) goto L2a
            r0.onPlaybackStateChanged(r2, r3)
        L2a:
            return
    }

    private int f() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.H
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getCurrentPosition()
            return r0
    }

    public static void forceRemoveCacheFile(java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r1 = 1
            r0.removeCacheFile(r2, r1)
            return
    }

    private void g() {
            r2 = this;
            android.os.Handler r0 = r2.I
            if (r0 == 0) goto L5
            return
        L5:
            com.bykv.vk.component.ttvideo.TTVideoEngine$b r0 = new com.bykv.vk.component.ttvideo.TTVideoEngine$b
            android.os.Looper r1 = getLooper()
            r0.<init>(r2, r1)
            r2.I = r0
            return
    }

    public static long getCacheFileSize(java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            long r0 = r0.getCacheSize(r2)
            return r0
    }

    public static long getCacheFileSizeByFilePath(java.lang.String r1, java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            long r1 = r0.getCacheSizeByFilePath(r1, r2)
            return r1
    }

    public static com.bykv.vk.component.ttvideo.DataLoaderHelper.DataLoaderCacheInfo getCacheInfoByFilePath(java.lang.String r1, java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            com.bykv.vk.component.ttvideo.DataLoaderHelper$DataLoaderCacheInfo r1 = r0.getCacheInfoByFilePath(r1, r2)
            return r1
    }

    public static java.lang.String getEngineVersion() {
            java.lang.String r0 = "1.0.2"
            return r0
    }

    public static android.os.Looper getLooper() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto Lb
            android.os.Looper r0 = android.os.Looper.myLooper()
            return r0
        Lb:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            return r0
    }

    private void h() {
            r4 = this;
            com.bykv.vk.component.ttvideo.log.b r0 = r4.G
            if (r0 == 0) goto L10
            long r0 = java.lang.System.currentTimeMillis()
            r4.c0 = r0
            com.bykv.vk.component.ttvideo.log.b r2 = r4.G
            r3 = 0
            r2.a(r0, r3)
        L10:
            return
    }

    private void i() {
            r1 = this;
            boolean r0 = r1.a
            if (r0 != 0) goto Lc
            com.bykv.vk.component.ttvideo.log.b r0 = r1.G
            r0.a()
            r0 = 1
            r1.a = r0
        Lc:
            return
    }

    private void j() {
            r2 = this;
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto L7
            r0.a()
        L7:
            boolean r0 = r2.M
            if (r0 != 0) goto L15
            boolean r0 = r2.O
            if (r0 != 0) goto L15
            java.io.FileDescriptor r0 = r2.f1644g0
            if (r0 == 0) goto L14
            goto L15
        L14:
            return
        L15:
            r2.h()
            boolean r0 = r2.M
            if (r0 == 0) goto L1f
            java.lang.String r0 = r2.N
            goto L21
        L1f:
            java.lang.String r0 = r2.P
        L21:
            r2.b(r0)
            boolean r0 = r2.M
            if (r0 == 0) goto L2b
            java.lang.String r0 = r2.N
            goto L2d
        L2b:
            java.lang.String r0 = r2.P
        L2d:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r2.A
            r2.a(r0, r1)
            return
    }

    private void k() {
            r3 = this;
            java.lang.String r0 = "start to render,this:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            boolean r0 = r3.T
            r2 = 1
            if (r0 == 0) goto L17
            r3.e(r2)
        L17:
            r3.i()
            boolean r0 = r3.f1652o
            if (r0 != 0) goto L20
            r3.f1652o = r2
        L20:
            r3.b0 = r2
            r0 = -1
            r3.a(r2, r0)
            com.bykv.vk.component.ttvideo.utils.a r0 = r3.W
            if (r0 == 0) goto L2d
            r0.d()
        L2d:
            boolean r0 = r3.R
            r2 = 0
            if (r0 == 0) goto L43
            int r0 = r3.e
            if (r0 == 0) goto L41
            boolean r0 = r3.isSystemPlayer()
            if (r0 == 0) goto L41
            int r0 = r3.e
            r3.a(r0)
        L41:
            r3.R = r2
        L43:
            int r0 = r3.J
            if (r0 == 0) goto L52
            boolean r0 = r3.isSystemPlayer()
            if (r0 == 0) goto L52
            int r0 = r3.J
            r3.a(r0)
        L52:
            r3.J = r2
            r3.Q = r2
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r3.B
            if (r0 == 0) goto L64
            java.lang.String r0 = "notify render start"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r3.B
            r0.onRenderStart(r3)
        L64:
            return
    }

    private void l() {
            r5 = this;
            boolean r0 = r5.p()
            if (r0 == 0) goto L26
            boolean r0 = r5.M
            if (r0 != 0) goto L14
            boolean r0 = r5.O
            if (r0 != 0) goto L14
            java.io.FileDescriptor r0 = r5.f1644g0
            if (r0 == 0) goto L13
            goto L14
        L13:
            return
        L14:
            r5.h()
            boolean r0 = r5.M
            if (r0 == 0) goto L1e
            java.lang.String r0 = r5.N
            goto L20
        L1e:
            java.lang.String r0 = r5.P
        L20:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r5.A
            r5.a(r0, r1)
            return
        L26:
            boolean r0 = r5.X
            if (r0 != 0) goto L36
            int r0 = r5.k
            if (r0 != 0) goto L40
            long r0 = r5.c0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L40
        L36:
            r5.h()
            com.bykv.vk.component.ttvideo.utils.a r0 = r5.W
            if (r0 == 0) goto L40
            r0.a()
        L40:
            r5.o()
            return
    }

    private void m() {
            r3 = this;
            java.lang.String r0 = "reset, this:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 0
            r3.T = r0
            r3.U = r0
            r3.h = r0
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r3.A
            r1.clear()
            r1 = 1
            r2 = 6
            r3.a(r1, r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            if (r1 == 0) goto L2d
            r2 = 0
            r1.setSurface(r2)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            r1.reset()
        L2d:
            r3.a = r0
            r3.f1652o = r0
            r3.f1653p = r0
            r3.R = r0
            com.bykv.vk.component.ttvideo.log.b r0 = r3.G
            r0.reset()
            return
    }

    private void n() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.Y
            r0.clear()
            r0 = 0
            r1.a0 = r0
            return
    }

    private void o() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_resumeVideo, shouldplay:"
            r0.<init>(r1)
            boolean r1 = r3.T
            r0.append(r1)
            java.lang.String r1 = ", mediaplayer:"
            r0.append(r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            r0.append(r1)
            java.lang.String r1 = ", prepared:"
            r0.append(r1)
            boolean r1 = r3.h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L82
            boolean r1 = r3.T
            if (r1 == 0) goto L82
            boolean r1 = r3.f1660w
            r0.setScreenOnWhilePlaying(r1)
            int r0 = r3.f1661x
            if (r0 == 0) goto L41
            com.bykv.vk.component.ttvideo.player.MediaPlayer r1 = r3.H
            android.content.Context r2 = r3.D
            r1.setWakeMode(r2, r0)
        L41:
            boolean r0 = r3.h
            if (r0 == 0) goto L7f
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            int r1 = r3.J
            r2 = 100
            r0.setIntOption(r2, r1)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            r0.start()
            com.bykv.vk.component.ttvideo.utils.a r0 = r3.W
            if (r0 == 0) goto L5e
            boolean r1 = r3.a
            if (r1 == 0) goto L5e
            r0.d()
        L5e:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            r1 = 62
            r2 = -100
            int r0 = r0.getIntOption(r1, r2)
            if (r0 != 0) goto L7a
            boolean r0 = r3.f1652o
            if (r0 != 0) goto L7a
            int r0 = r3.k
            if (r0 == 0) goto L76
            boolean r0 = r3.X
            if (r0 == 0) goto L7a
        L76:
            r3.k()
            return
        L7a:
            r0 = 1
            r3.e(r0)
            return
        L7f:
            r0 = 0
            r3.i = r0
        L82:
            return
    }

    private boolean p() {
            r3 = this;
            int r0 = r3.k
            r1 = 1
            if (r0 == 0) goto L8
            r2 = 3
            if (r0 != r2) goto Ld
        L8:
            boolean r0 = r3.h
            if (r0 != 0) goto Ld
            return r1
        Ld:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L1c
            boolean r0 = r3.isSystemPlayer()
            if (r0 == 0) goto L1c
            boolean r0 = r3.h
            if (r0 != 0) goto L1c
            return r1
        L1c:
            r0 = 0
            return r0
    }

    public static void removeCacheFile(java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r1 = 0
            r0.removeCacheFile(r2, r1)
            return
    }

    public static void setCacheInfoLists(java.lang.String[] r1, long[] r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.setCacheInfoLists(r1, r2)
            return
    }

    public static void setIntValue(int r1, int r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.setIntValue(r1, r2)
            return
    }

    public static void setStringValue(int r1, java.lang.String r2) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.setStringValue(r1, r2)
            return
    }

    public static void setVideoEventUploader(com.bykv.vk.component.ttvideo.log.VideoEventEngineUploader r2) {
            java.lang.String r0 = "TTVideoEngine"
            java.lang.String r1 = "setVideoEventUploader uploader"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r1)
            com.bykv.vk.component.ttvideo.log.e r0 = com.bykv.vk.component.ttvideo.log.e.c
            r0.a(r2)
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.setEngineUploader(r2)
            return
    }

    public static void startDataLoader(android.content.Context r1) {
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r0.setContext(r1)
            com.bykv.vk.component.ttvideo.DataLoaderHelper r1 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r1.start()
            r1 = 1
            com.bykv.vk.component.ttvideo.TTVideoEngine.f1640l0 = r1
            return
    }

    void a() {
            r2 = this;
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r2.B
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notify cache end. source id: "
            r0.<init>(r1)
            java.lang.String r1 = r2.a0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r2.B
            r0.onUseMDLCacheEnd()
        L1e:
            return
    }

    void a(int r3) {
            r2 = this;
            java.lang.String r0 = "_seekTo:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L2b
            boolean r0 = r2.j
            if (r0 == 0) goto L2b
            boolean r0 = r2.c
            if (r0 != 0) goto L22
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto L22
            r0.e()
        L22:
            r0 = 1
            r2.c = r0
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            r0.seekTo(r3)
            return
        L2b:
            r3 = 0
            r2.c(r3)
            return
    }

    void a(android.view.Surface r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_doSetPlayerSurface surface:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", pre-surface:"
            r0.append(r1)
            android.view.Surface r1 = r2.E
            r0.append(r1)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.E = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L2e
            r0.setSurface(r3)
        L2e:
            return
    }

    void a(java.lang.String r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L1e
            java.lang.String r2 = r4.P
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L1e
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r5
            java.lang.String r3 = "set direct url:%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r2)
            r4.b()
        L1e:
            r4.j = r0
            r4.O = r1
            r4.P = r5
            return
    }

    void a(boolean r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_play, mState:"
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", byPlay:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 1
            r2.j = r0
            r0 = 0
            r2.i = r0
            r2.g()
            if (r3 == 0) goto L37
            com.bykv.vk.component.ttvideo.log.b r3 = r2.G
            r0 = 10
            r3.d(r0)
        L37:
            int r3 = r2.b
            if (r3 == 0) goto L46
            r0 = 3
            if (r3 == r0) goto L42
            r0 = 4
            if (r3 == r0) goto L46
            return
        L42:
            r2.l()
            return
        L46:
            r2.j()
            return
    }

    void b(boolean r2) {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.H
            if (r0 == 0) goto L7
            r0.setIsMute(r2)
        L7:
            return
    }

    public int getBufferingType() {
            r1 = this;
            int r0 = r1.V
            return r0
    }

    public int getCurrentPlaybackTime() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getCurrentPlaybackTime state:"
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            int r0 = r2.b
            r1 = 3
            if (r0 != r1) goto L1f
            int r0 = r2.f()
            return r0
        L1f:
            r1 = 4
            if (r0 != r1) goto L25
            int r0 = r2.e
            return r0
        L25:
            r0 = -1
            return r0
    }

    public int getCurrentPlaybackTimeAsync() {
            r1 = this;
            boolean r0 = r1.isSystemPlayer()
            if (r0 == 0) goto Lb
            int r0 = r1.getCurrentPlaybackTime()
            return r0
        Lb:
            int r0 = r1.f1641d0
            return r0
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.f1650m
            return r0
    }

    public int getLoadState() {
            r1 = this;
            int r0 = r1.f1649l
            return r0
    }

    public int getLoadedProgress() {
            r1 = this;
            int r0 = r1.f1651n
            return r0
    }

    public int getPlaybackState() {
            r1 = this;
            int r0 = r1.k
            return r0
    }

    public boolean isLooping() {
            r1 = this;
            boolean r0 = r1.f1659v
            return r0
    }

    public boolean isMute() {
            r1 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r1.H
            if (r0 == 0) goto L9
            boolean r0 = r0.isMute()
            return r0
        L9:
            boolean r0 = r1.K
            return r0
    }

    public boolean isSystemPlayer() {
            r2 = this;
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 != 0) goto Lc
            int r0 = r2.f1663z
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
        Lc:
            boolean r0 = r0.isOSPlayer()
            return r0
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(com.bykv.vk.component.ttvideo.player.MediaPlayer r1, int r2) {
            r0 = this;
            boolean r1 = r0.M
            if (r1 == 0) goto L6
            r2 = 100
        L6:
            r0.f1651n = r2
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r1 = r0.B
            if (r1 == 0) goto Lf
            r1.onBufferingUpdate(r0, r2)
        Lf:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnCompletionListener
    public void onCompletion(com.bykv.vk.component.ttvideo.player.MediaPlayer r4) {
            r3 = this;
            java.lang.String r0 = "receive onCompletion,this:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            boolean r0 = r3.f1659v
            r1 = 0
            if (r0 != 0) goto L3e
            r0 = 1
            r3.X = r0
            r3.e(r1)
            com.bykv.vk.component.ttvideo.utils.a r0 = r3.W
            if (r0 == 0) goto L2c
            r0.e()
            com.bykv.vk.component.ttvideo.log.b r0 = r3.G
            com.bykv.vk.component.ttvideo.utils.a r2 = r3.W
            int r2 = r2.b()
            r0.b(r2)
        L2c:
            com.bykv.vk.component.ttvideo.log.b r0 = r3.G
            r2 = 3
            r0.a(r2)
            r3.a = r1
            r3.f1652o = r1
            r3.f1653p = r1
            r3.e = r1
            r3.R = r1
            r3.j = r1
        L3e:
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r3.B
            if (r0 == 0) goto L45
            r0.onCompletion(r3)
        L45:
            if (r4 == 0) goto L4f
            boolean r4 = r4.isOSPlayer()
            if (r4 == 0) goto L4f
            r3.h = r1
        L4f:
            r3.J = r1
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnErrorListener
    public boolean onError(com.bykv.vk.component.ttvideo.player.MediaPlayer r3, int r4, int r5) {
            r2 = this;
            com.bykv.vk.component.ttvideo.utils.a r0 = r2.W
            if (r0 == 0) goto L7
            r0.e()
        L7:
            r0 = 3
            r2.e(r0)
            r1 = -1
            r2.a(r0, r1)
            if (r3 == 0) goto L1a
            boolean r3 = r3.isOSPlayer()
            if (r3 == 0) goto L1a
            java.lang.String r3 = "kTTVideoErrorDomainVideoOSPlayer"
            goto L1c
        L1a:
            java.lang.String r3 = "kTTVideoErrorDomainVideoOwnPlayer"
        L1c:
            com.bykv.vk.component.ttvideo.utils.Error r0 = new com.bykv.vk.component.ttvideo.utils.Error
            r1 = 0
            r0.<init>(r3, r4, r5, r1)
            r2.S = r0
            r2.b(r0)
            r3 = 1
            return r3
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnInfoListener
    public boolean onInfo(com.bykv.vk.component.ttvideo.player.MediaPlayer r3, int r4, int r5) {
            r2 = this;
            r3 = -268435438(0xfffffffff0000012, float:-1.5845667E29)
            java.lang.String r0 = "TTVideoEngine"
            r1 = 0
            if (r4 == r3) goto L3f
            r3 = 3
            if (r4 == r3) goto L36
            r3 = 801(0x321, float:1.122E-42)
            if (r4 == r3) goto L32
            r3 = 251658248(0xf000008, float:6.310893E-30)
            if (r4 == r3) goto L2e
            r3 = 251658252(0xf00000c, float:6.310896E-30)
            if (r4 == r3) goto L2a
            r3 = 701(0x2bd, float:9.82E-43)
            if (r4 == r3) goto L26
            r3 = 702(0x2be, float:9.84E-43)
            if (r4 == r3) goto L22
            goto L4e
        L22:
            r2.b(r5)
            goto L4e
        L26:
            r2.c(r5)
            goto L4e
        L2a:
            r2.c()
            goto L4e
        L2e:
            r2.d(r5)
            goto L4e
        L32:
            r2.c(r1)
            goto L4e
        L36:
            java.lang.String r3 = "player callback render start"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r3)
            r2.k()
            goto L4e
        L3f:
            java.lang.String r3 = "player position update "
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.concat(r4)
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r3)
            r2.f1641d0 = r5
        L4e:
            return r1
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnPreparedListener
    public void onPrepared(com.bykv.vk.component.ttvideo.player.MediaPlayer r5) {
            r4 = this;
            java.lang.String r0 = "onPrepared"
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            boolean r0 = r4.U
            if (r0 == 0) goto Lc
            goto L53
        Lc:
            if (r5 != 0) goto L14
            java.lang.String r5 = "onPrepared mediaPlayer is null!"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r5)
            return
        L14:
            r0 = 141(0x8d, float:1.98E-43)
            r2 = -1
            int r0 = r5.getIntOption(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onPrepared videoCodecId "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 0
            r4.S = r0
            int r0 = r5.getDuration()
            r4.f1650m = r0
            r1 = 1
            r4.h = r1
            com.bykv.vk.component.ttvideo.log.b r1 = r4.G
            r1.e(r0)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r0 = r4.B
            if (r0 == 0) goto L44
            r0.onPrepared(r4)
        L44:
            boolean r0 = r4.i
            if (r0 != 0) goto L4c
            boolean r0 = r4.T
            if (r0 != 0) goto L50
        L4c:
            boolean r0 = r4.f
            if (r0 != 0) goto L53
        L50:
            r5.start()
        L53:
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(com.bykv.vk.component.ttvideo.player.MediaPlayer r1) {
            r0 = this;
            r1 = 1
            r0.c(r1)
            return
    }

    @Override // com.bykv.vk.component.ttvideo.player.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(com.bykv.vk.component.ttvideo.player.MediaPlayer r2, int r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "video size changed = "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r2)
            com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r2 = r1.B
            if (r2 == 0) goto L22
            r2.onVideoSizeChanged(r1, r3, r4)
        L22:
            return
    }

    public void pause() {
            r3 = this;
            java.lang.String r0 = "pause, "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 0
            r3.T = r0
            boolean r0 = r3.h
            r2 = 2
            if (r0 != 0) goto L1e
            r0 = 1
            r3.i = r0
            r3.e(r2)
            return
        L1e:
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L2f
            java.lang.String r0 = "player will pause"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            r0.pause()
            r3.e(r2)
        L2f:
            com.bykv.vk.component.ttvideo.utils.a r0 = r3.W
            if (r0 == 0) goto L36
            r0.e()
        L36:
            return
    }

    public void play() {
            r7 = this;
            java.lang.String r0 = "play, "
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            int r0 = r7.b
            r2 = 5
            if (r0 != r2) goto L1a
            java.lang.String r0 = "already released, return"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r1, r0)
            return
        L1a:
            r0 = 1
            r7.T = r0
            r1 = 0
            r7.U = r1
            r7.d = r1
            boolean r2 = r7.f
            if (r2 != 0) goto L33
            long r2 = r7.c0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            boolean r2 = r7.h
            if (r2 != 0) goto L33
            r0 = 0
        L33:
            r7.a(r0)
            r7.X = r1
            return
    }

    public void prepare() {
            r2 = this;
            java.lang.String r0 = "prepare, "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 0
            r2.f = r0
            r2.T = r0
            r2.U = r0
            r2.d = r0
            r2.a(r0)
            r2.X = r0
            return
    }

    public void release() {
            r3 = this;
            java.lang.String r0 = "release, "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 1
            r3.U = r0
            r1 = 0
            r3.T = r1
            r3.a(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            r1 = 0
            r3.H = r1
            if (r0 == 0) goto L2b
            java.util.concurrent.ExecutorService r1 = com.bykv.vk.component.ttvideo.utils.EngineThreadPool.a()
            com.bykv.vk.component.ttvideo.TTVideoEngine$a r2 = new com.bykv.vk.component.ttvideo.TTVideoEngine$a
            r2.<init>(r3, r0)
            r1.execute(r2)
        L2b:
            r3.e()
            r0 = 5
            r3.b = r0
            return
    }

    public void reset() {
            r0 = this;
            r0.b()
            return
    }

    public void seekTo(int r3, com.bykv.vk.component.ttvideo.SeekCompletionListener r4) {
            r2 = this;
            java.lang.String r0 = "seek to time:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.C = r4
            r2.a(r3)
            return
    }

    public void setDataSource(java.io.FileDescriptor r1, long r2, long r4) {
            r0 = this;
            r0.f1642e0 = r2
            r0.f1643f0 = r4
            r0.b()
            r0.f1644g0 = r1
            return
    }

    public void setDirectURL(java.lang.String r1) {
            r0 = this;
            r0.a(r1)
            return
    }

    public void setDirectUrlUseDataLoader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = r1.f1662y
            r1.setDirectUrlUseDataLoader(r2, r3, r0)
            return
    }

    public void setDirectUrlUseDataLoader(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.setDirectUrlUseDataLoader(r2, r3, r4, r0)
            return
    }

    public void setDirectUrlUseDataLoader(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r1.setDirectUrlUseDataLoader(r2, r3, r4, r5)
            return
    }

    public void setDirectUrlUseDataLoader(java.lang.String[] r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            java.lang.String r0 = "TTVideoEngine"
            if (r11 == 0) goto L70
            int r1 = r11.length
            if (r1 == 0) goto L70
            r1 = 0
            r2 = r11[r1]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L70
            r10.f1662y = r13
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L68
            boolean r2 = r10.f1657t
            if (r2 == 0) goto L68
            r10.n()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setDirectUrlUseDataLoader key:"
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r3 = ", videoId:"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ", filePath:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r0, r2)
            r6 = 0
            r3 = r10
            r8 = r11
            r4 = r12
            r5 = r13
            r9 = r14
            java.lang.String r11 = r3.a(r4, r5, r6, r8, r9)
            java.util.List<java.lang.String> r12 = r3.Z
            boolean r12 = r12.contains(r4)
            if (r12 != 0) goto L58
            java.util.List<java.lang.String> r12 = r3.Z
            r12.add(r4)
        L58:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L64
            r11 = r8[r1]
            r10.setDirectURL(r11)
            return
        L64:
            r10.setDirectURL(r11)
            return
        L68:
            r3 = r10
            r8 = r11
            r11 = r8[r1]
            r10.a(r11)
            return
        L70:
            r3 = r10
            java.lang.String r11 = "invalid urls list, it is empty"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.e(r0, r11)
            return
    }

    public void setIntOption(int r4, int r5) {
            r3 = this;
            r0 = 11
            if (r4 == r0) goto L69
            r0 = 12
            if (r4 == r0) goto L58
            r0 = 118(0x76, float:1.65E-43)
            if (r4 == r0) goto L4f
            r0 = 160(0xa0, float:2.24E-43)
            if (r4 == r0) goto L47
            r0 = 202(0xca, float:2.83E-43)
            if (r4 == r0) goto L3e
            r0 = 322(0x142, float:4.51E-43)
            if (r4 == r0) goto L32
            r0 = 472(0x1d8, float:6.61E-43)
            if (r4 == r0) goto L1d
            goto L72
        L1d:
            r3.f1654q = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L28
            r1 = 223(0xdf, float:3.12E-43)
            r0.setIntOption(r1, r5)
        L28:
            com.bykv.vk.component.ttvideo.DataLoaderHelper r0 = com.bykv.vk.component.ttvideo.DataLoaderHelper.getDataLoader()
            r1 = 512(0x200, float:7.17E-43)
            r0.setIntValue(r1, r5)
            goto L72
        L32:
            r3.f1646i0 = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L72
            r1 = 211(0xd3, float:2.96E-43)
        L3a:
            r0.setIntOption(r1, r5)
            goto L72
        L3e:
            r3.f1648k0 = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L72
            r1 = 110(0x6e, float:1.54E-43)
            goto L3a
        L47:
            if (r5 <= 0) goto L4b
            r0 = 1
            goto L4c
        L4b:
            r0 = 0
        L4c:
            r3.f1657t = r0
            goto L72
        L4f:
            r3.f1647j0 = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L72
            r1 = 86
            goto L3a
        L58:
            r3.f1656s = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L72
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r5
            r2 = 9
            r0.setIntOption(r2, r1)
            goto L72
        L69:
            r3.f1655r = r5
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 == 0) goto L72
            r1 = 81
            goto L3a
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set int option key:"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " value:"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r5, r4)
            return
    }

    public void setIsMute(boolean r4) {
            r3 = this;
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "setIsMute:%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r3.K = r4
            r3.b(r4)
            return
    }

    public void setLocalURL(java.lang.String r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L1e
            java.lang.String r2 = r4.N
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L1e
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r5
            java.lang.String r3 = "set local url:%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r2)
            r4.b()
        L1e:
            r4.j = r0
            r4.M = r1
            r4.N = r5
            return
    }

    public void setLooping(boolean r3) {
            r2 = this;
            java.lang.String r0 = "setLooping:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.f1659v = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L18
            r0.setLooping(r3)
        L18:
            return
    }

    public void setMaxRetryCount(int r1) {
            r0 = this;
            r0.f1658u = r1
            return
    }

    public void setScreenOnWhilePlaying(boolean r3) {
            r2 = this;
            java.lang.String r0 = "setScreenOnWhilePlaying:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.f1660w = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L18
            r0.setScreenOnWhilePlaying(r3)
        L18:
            return
    }

    public void setStartTime(int r3) {
            r2 = this;
            java.lang.String r0 = "setStartTime:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.J = r3
            return
    }

    public void setSurface(android.view.Surface r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setSurface surface:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", pre-surface:"
            r0.append(r1)
            android.view.Surface r1 = r2.E
            r0.append(r1)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.a(r3)
            return
    }

    public void setSurfaceHolder(android.view.SurfaceHolder r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setSurfaceHolder = "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", this:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.F = r3
            if (r3 != 0) goto L24
            r3 = 0
        L20:
            r2.a(r3)
            return
        L24:
            com.bykv.vk.component.ttvideo.b r3 = new com.bykv.vk.component.ttvideo.b
            r3.<init>(r2)
            r2.f1645h0 = r3
            android.view.SurfaceHolder r0 = r2.F
            r0.addCallback(r3)
            android.view.SurfaceHolder r3 = r2.F
            android.view.Surface r3 = r3.getSurface()
            goto L20
    }

    public void setTrackVolume(float r4) {
            r3 = this;
            java.lang.String r0 = "setTrackVolume "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r3.H
            if (r0 != 0) goto L14
            return
        L14:
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r4 = 0
        L1a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L22
            r4 = 1065353216(0x3f800000, float:1.0)
        L22:
            r3.L = r4
            r0.setVolume(r4, r4)
            return
    }

    public void setVideoEngineSimpleCallback(com.bykv.vk.component.ttvideo.VideoEngineSimpleCallback r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void setWakeMode(int r3) {
            r2 = this;
            java.lang.String r0 = "setWakeMode:"
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r2.f1661x = r3
            com.bykv.vk.component.ttvideo.player.MediaPlayer r0 = r2.H
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.D
            r0.setWakeMode(r1, r3)
        L1a:
            return
    }

    public void start() {
            r2 = this;
            java.lang.String r0 = "start, "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 1
            r2.T = r0
            r1 = 0
            r2.U = r1
            r2.d = r1
            r2.a(r0)
            r2.X = r1
            return
    }

    public void stop() {
            r2 = this;
            java.lang.String r0 = "stop, "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r1, r0)
            r0 = 0
            r2.T = r0
            r2.b0 = r0
            r1 = 1
            r2.U = r1
            r2.a(r1, r0)
            r2.e()
            return
    }

    @Override // com.bykv.vk.component.ttvideo.log.a
    public java.util.Map versionInfo() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 14
            java.lang.String r2 = ""
            java.lang.String r1 = com.bykv.vk.component.ttvideo.player.TTPlayerConfiger.getValue(r1, r2)
            java.lang.String r2 = "SDK version:1.0.2, player version:"
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r2.concat(r3)
            java.lang.String r3 = "TTVideoEngine"
            com.bykv.vk.component.ttvideo.utils.TTVideoEngineLog.i(r3, r2)
            java.lang.String r2 = "pc"
            r0.put(r2, r1)
            java.lang.String r1 = "sdk_version"
            java.lang.String r2 = "1.0.2"
            r0.put(r1, r2)
            java.lang.String r1 = "sv"
            java.lang.String r2 = "5.6"
            r0.put(r1, r2)
            return r0
    }
}
