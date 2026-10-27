package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e2 {
    private static boolean L = true;
    public static volatile boolean M;
    private static boolean N;
    private static java.util.concurrent.atomic.AtomicBoolean O;
    private com.amap.api.location.AMapLocationClientOption A;
    private com.amap.api.col.p0003l.u6 B;
    java.lang.String C;
    private android.content.ServiceConnection D;
    com.amap.api.location.AMapLocationQualityReport E;
    boolean F;
    boolean G;
    private volatile boolean H;
    com.amap.api.col.3l.e2.d I;
    java.lang.String J;
    boolean K;
    com.autonavi.aps.amapapi.model.a a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.Context f3163b;

    /* renamed from: c, reason: collision with root package name */
    com.amap.api.location.AMapLocationClientOption f3164c;

    /* renamed from: d, reason: collision with root package name */
    public com.amap.api.col.3l.e2.f f3165d;

    /* renamed from: e, reason: collision with root package name */
    com.amap.api.col.p0003l.v5 f3166e;

    /* renamed from: f, reason: collision with root package name */
    private com.amap.api.col.p0003l.t4 f3167f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3168g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f3169h;

    /* renamed from: i, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.location.AMapLocationListener> f3170i;

    /* renamed from: j, reason: collision with root package name */
    boolean f3171j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3172k;
    public boolean l;
    public boolean m;
    com.amap.api.col.p0003l.u7 n;
    android.os.Messenger o;
    android.os.Messenger p;
    android.content.Intent q;
    int r;
    private boolean s;
    com.amap.api.col.3l.e2.e t;
    boolean u;
    com.amap.api.location.AMapLocationClientOption.AMapLocationMode v;
    java.lang.Object w;
    com.autonavi.aps.amapapi.utils.h x;
    boolean y;
    com.amap.api.col.p0003l.e3 z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends com.amap.api.col.p0003l.c8 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3173d;

        a(android.content.Context r1) {
                r0 = this;
                r0.f3173d = r1
                r0.<init>()
                return
        }

        @Override // com.amap.api.col.p0003l.c8
        public final void runTask() {
                r1 = this;
                com.amap.api.col.p0003l.i4.R()
                android.content.Context r0 = r1.f3173d
                com.amap.api.col.p0003l.i4.o(r0)
                android.content.Context r0 = r1.f3173d
                com.amap.api.col.p0003l.i4.F(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class b implements android.content.ServiceConnection {
        final /* synthetic */ com.amap.api.col.p0003l.e2 a;

        b(com.amap.api.col.p0003l.e2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
                r1 = this;
                com.amap.api.col.3l.e2 r2 = r1.a     // Catch: java.lang.Throwable -> L14
                android.os.Messenger r0 = new android.os.Messenger     // Catch: java.lang.Throwable -> L14
                r0.<init>(r3)     // Catch: java.lang.Throwable -> L14
                r2.o = r0     // Catch: java.lang.Throwable -> L14
                com.amap.api.col.3l.e2 r2 = r1.a     // Catch: java.lang.Throwable -> L14
                r3 = 1
                com.amap.api.col.p0003l.e2.D(r2, r3)     // Catch: java.lang.Throwable -> L14
                com.amap.api.col.3l.e2 r2 = r1.a     // Catch: java.lang.Throwable -> L14
                r2.y = r3     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r2 = move-exception
                java.lang.String r3 = "ALManager"
                java.lang.String r0 = "onServiceConnected"
                com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
                return
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName r2) {
                r1 = this;
                com.amap.api.col.3l.e2 r2 = r1.a
                r0 = 0
                r2.o = r0
                r0 = 0
                com.amap.api.col.p0003l.e2.D(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class c {
        static final /* synthetic */ int[] a = null;

        static {
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode[] r0 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.amap.api.col.3l.e2.c.a = r0
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.amap.api.col.3l.e2.c.a     // Catch: java.lang.NoSuchFieldError -> L1d
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.amap.api.col.3l.e2.c.a     // Catch: java.lang.NoSuchFieldError -> L28
                com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public c() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class d extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.e2 a;

        public d(com.amap.api.col.p0003l.e2 r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r8) {
                r7 = this;
                r0 = 0
                super.handleMessage(r8)     // Catch: java.lang.Throwable -> L43
                boolean r1 = com.autonavi.aps.amapapi.utils.a.f5843h     // Catch: java.lang.Throwable -> L43
                if (r1 == 0) goto L9
                return
            L9:
                int r1 = r8.what     // Catch: java.lang.Throwable -> L43
                r2 = 11
                if (r1 == r2) goto L172
                r2 = 12
                if (r1 == r2) goto L16a
                r2 = 1011(0x3f3, float:1.417E-42)
                r3 = 14
                if (r1 == r2) goto L15d
                switch(r1) {
                    case 1002: goto L151;
                    case 1003: goto L142;
                    case 1004: goto L130;
                    case 1005: goto L124;
                    default: goto L1c;
                }
            L1c:
                r2 = 300000(0x493e0, double:1.482197E-318)
                r4 = 1025(0x401, float:1.436E-42)
                switch(r1) {
                    case 1014: goto L11c;
                    case 1015: goto L10b;
                    case 1016: goto Lda;
                    case 1017: goto Lcb;
                    case 1018: goto Lbb;
                    default: goto L24;
                }
            L24:
                java.lang.String r5 = "objHash"
                switch(r1) {
                    case 1023: goto Lb3;
                    case 1024: goto Lab;
                    case 1025: goto L89;
                    case 1026: goto L76;
                    case 1027: goto L6a;
                    case 1028: goto L5e;
                    case 1029: goto L46;
                    case 1030: goto L2b;
                    default: goto L29;
                }
            L29:
                goto Lca
            L2b:
                android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L43
                r8.<init>()     // Catch: java.lang.Throwable -> L43
                int r1 = java.lang.System.identityHashCode(r7)     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L43
                r8.putString(r5, r1)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                r2 = 17
                com.amap.api.col.p0003l.e2.o(r1, r2, r8)     // Catch: java.lang.Throwable -> L43
                return
            L43:
                r8 = move-exception
                goto L17e
            L46:
                android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L43
                r8.<init>()     // Catch: java.lang.Throwable -> L43
                int r1 = java.lang.System.identityHashCode(r7)     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> L43
                r8.putString(r5, r1)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                r2 = 16
                com.amap.api.col.p0003l.e2.o(r1, r2, r8)     // Catch: java.lang.Throwable -> L43
                return
            L5e:
                java.lang.String r0 = "handleMessage ACTION_COARSE_LOCATIONSUCCESS"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocation r8 = (com.amap.api.location.AMapLocation) r8     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.K(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L6a:
                java.lang.String r0 = "handleMessage STOP_COARSE_LOCATION"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.t4 r8 = com.amap.api.col.p0003l.e2.E(r8)     // Catch: java.lang.Throwable -> L43
                r8.b()     // Catch: java.lang.Throwable -> L43
                return
            L76:
                java.lang.String r0 = "handleMessage START_COARSE_LOCATION"
                com.autonavi.aps.amapapi.utils.d.b()     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.t4 r8 = com.amap.api.col.p0003l.e2.E(r8)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationClientOption r1 = r1.f3164c     // Catch: java.lang.Throwable -> L43
                r8.l(r1)     // Catch: java.lang.Throwable -> L43
                return
            L89:
                java.lang.String r0 = "handleMessage ACTION_REBOOT_GPS_LOCATION"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r8 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                boolean r8 = r8.F()     // Catch: java.lang.Throwable -> L43
                if (r8 == 0) goto La5
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r8 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                r8.c()     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r1 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationClientOption r8 = r8.f3164c     // Catch: java.lang.Throwable -> L43
                r1.p(r8)     // Catch: java.lang.Throwable -> L43
            La5:
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.n(r8, r4, r2)     // Catch: java.lang.Throwable -> L43
                return
            Lab:
                java.lang.String r0 = "handleMessage ACTION_DISABLE_BACKGROUND"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.Z(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            Lb3:
                java.lang.String r0 = "handleMessage ACTION_ENABLE_BACKGROUND"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.T(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            Lbb:
                java.lang.String r0 = "handleMessage SET_OPTION"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationClientOption r8 = (com.amap.api.location.AMapLocationClientOption) r8     // Catch: java.lang.Throwable -> L43
                r1.f3164c = r8     // Catch: java.lang.Throwable -> L43
                if (r8 == 0) goto Lca
                com.amap.api.col.p0003l.e2.q0(r1)     // Catch: java.lang.Throwable -> L43
            Lca:
                return
            Lcb:
                java.lang.String r0 = "handleMessage STOP_GPS_LOCATION"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r8 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                r8.c()     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.n0(r8)     // Catch: java.lang.Throwable -> L43
                return
            Lda:
                java.lang.String r0 = "handleMessage START_LBS_LOCATION"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                android.content.Context r8 = com.amap.api.col.p0003l.e2.Q(r8)     // Catch: java.lang.Throwable -> L43
                boolean r8 = com.autonavi.aps.amapapi.utils.j.m(r8)     // Catch: java.lang.Throwable -> L43
                if (r8 == 0) goto Lf1
                com.autonavi.aps.amapapi.utils.d.a()     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.j0(r8)     // Catch: java.lang.Throwable -> L43
                return
            Lf1:
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r8 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                boolean r8 = r8.v()     // Catch: java.lang.Throwable -> L43
                if (r8 == 0) goto L105
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                r1 = 1016(0x3f8, float:1.424E-42)
                r2 = 1000(0x3e8, double:4.94E-321)
                com.amap.api.col.p0003l.e2.n(r8, r1, r2)     // Catch: java.lang.Throwable -> L43
                return
            L105:
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.m0(r8)     // Catch: java.lang.Throwable -> L43
                return
            L10b:
                java.lang.String r0 = "handleMessage START_GPS_LOCATION"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.v5 r1 = r8.f3166e     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationClientOption r8 = r8.f3164c     // Catch: java.lang.Throwable -> L43
                r1.p(r8)     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.n(r8, r4, r2)     // Catch: java.lang.Throwable -> L43
                return
            L11c:
                java.lang.String r0 = "handleMessage ACTION_SAVE_LAST_LOCATION"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.J(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L124:
                java.lang.String r0 = "handleMessage REMOVE_LISTENER"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationListener r8 = (com.amap.api.location.AMapLocationListener) r8     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.L(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L130:
                java.lang.String r8 = "handleMessage STOP_LOCATION"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L13d
                com.amap.api.col.p0003l.e2.g0(r1)     // Catch: java.lang.Throwable -> L13d
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L13d
                com.amap.api.col.p0003l.e2.o(r1, r3, r0)     // Catch: java.lang.Throwable -> L13d
                return
            L13d:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
                goto L17e
            L142:
                java.lang.String r8 = "handleMessage START_LOCATION"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L13d
                com.amap.api.col.p0003l.e2.d0(r1)     // Catch: java.lang.Throwable -> L13d
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L13d
                r2 = 13
                com.amap.api.col.p0003l.e2.o(r1, r2, r0)     // Catch: java.lang.Throwable -> L13d
                return
            L151:
                java.lang.String r0 = "handleMessage SET_LISTENER"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L43
                com.amap.api.location.AMapLocationListener r8 = (com.amap.api.location.AMapLocationListener) r8     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.s(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L15d:
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.o(r8, r3, r0)     // Catch: java.lang.Throwable -> L43
                java.lang.String r0 = "handleMessage DESTROY"
                com.amap.api.col.3l.e2 r8 = r7.a     // Catch: java.lang.Throwable -> L43
                r8.i0()     // Catch: java.lang.Throwable -> L43
                return
            L16a:
                java.lang.String r0 = "handleMessage ACTION_GPS_LOCATIONSUCCESS"
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.q(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L172:
                java.lang.String r0 = "handleMessage ACTION_LBS_LOCATIONSUCCES"
                android.os.Bundle r8 = r8.getData()     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.3l.e2 r1 = r7.a     // Catch: java.lang.Throwable -> L43
                com.amap.api.col.p0003l.e2.p(r1, r8)     // Catch: java.lang.Throwable -> L43
                return
            L17e:
                if (r0 != 0) goto L182
                java.lang.String r0 = "handleMessage"
            L182:
                java.lang.String r1 = "AMapLocationManage$MHandlerr"
                com.autonavi.aps.amapapi.utils.b.a(r8, r1, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e extends android.os.HandlerThread {
        com.amap.api.col.p0003l.e2 a;

        public e(java.lang.String r1, com.amap.api.col.p0003l.e2 r2) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r2
                return
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
                r1 = this;
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.3l.u7 r0 = r0.n     // Catch: java.lang.Throwable -> L34
                r0.b()     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                android.content.Context r0 = com.amap.api.col.p0003l.e2.Q(r0)     // Catch: java.lang.Throwable -> L34
                com.autonavi.aps.amapapi.utils.g.a(r0)     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.p0003l.e2.Y(r0)     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L31
                android.content.Context r0 = com.amap.api.col.p0003l.e2.Q(r0)     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L31
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                android.content.Context r0 = com.amap.api.col.p0003l.e2.Q(r0)     // Catch: java.lang.Throwable -> L34
                com.autonavi.aps.amapapi.utils.a.b(r0)     // Catch: java.lang.Throwable -> L34
                com.amap.api.col.3l.e2 r0 = r1.a     // Catch: java.lang.Throwable -> L34
                android.content.Context r0 = com.amap.api.col.p0003l.e2.Q(r0)     // Catch: java.lang.Throwable -> L34
                com.autonavi.aps.amapapi.utils.a.a(r0)     // Catch: java.lang.Throwable -> L34
            L31:
                super.onLooperPrepared()     // Catch: java.lang.Throwable -> L34
            L34:
                return
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
                r0 = this;
                super.run()     // Catch: java.lang.Throwable -> L3
            L3:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class f extends android.os.Handler {
        final /* synthetic */ com.amap.api.col.p0003l.e2 a;

        public f(com.amap.api.col.p0003l.e2 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public f(com.amap.api.col.p0003l.e2 r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r6) {
                r5 = this;
                r0 = 0
                super.handleMessage(r6)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                boolean r2 = r1.u     // Catch: java.lang.Throwable -> L3a
                if (r2 == 0) goto Lc
                goto L137
            Lc:
                int r2 = r6.what     // Catch: java.lang.Throwable -> L3a
                r3 = 1
                if (r2 == r3) goto L138
                r3 = 2
                r4 = 13
                if (r2 == r3) goto L105
                if (r2 == r4) goto Le9
                java.lang.String r3 = "optBundle"
                switch(r2) {
                    case 5: goto Ld0;
                    case 6: goto Lc0;
                    case 7: goto Lae;
                    case 8: goto La8;
                    case 9: goto L98;
                    case 10: goto L8e;
                    default: goto L1d;
                }
            L1d:
                switch(r2) {
                    case 100: goto L56;
                    case 101: goto L5b;
                    case 102: goto L3d;
                    case 103: goto L22;
                    default: goto L20;
                }
            L20:
                goto L137
            L22:
                java.lang.String r0 = "handleMessage RESULT_COARSE_GEO_SUCCESS"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.t4 r1 = com.amap.api.col.p0003l.e2.E(r1)     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L137
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.t4 r1 = com.amap.api.col.p0003l.e2.E(r1)     // Catch: java.lang.Throwable -> L3a
                r1.f(r6)     // Catch: java.lang.Throwable -> L3a
                return
            L3a:
                r6 = move-exception
                goto L153
            L3d:
                java.lang.String r0 = "handleMessage RESULT_COARSE_LOCATIONCHANGE"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r1 = r1.f3164c     // Catch: java.lang.Throwable -> L3a
                android.os.Bundle r1 = com.autonavi.aps.amapapi.utils.b.a(r1)     // Catch: java.lang.Throwable -> L3a
                r6.putBundle(r3, r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                r2 = 15
                com.amap.api.col.p0003l.e2.o(r1, r2, r6)     // Catch: java.lang.Throwable -> L3a
                return
            L56:
                r1 = 2155(0x86b, float:3.02E-42)
                com.autonavi.aps.amapapi.utils.h.a(r0, r1)     // Catch: java.lang.Throwable -> L3a
            L5b:
                java.lang.String r0 = "handleMessage RESULT_COARSE_LOCATIONSUCCESS"
                android.os.Message r1 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L3a
                r2 = 1028(0x404, float:1.44E-42)
                r1.what = r2     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L3a
                r1.obj = r6     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2$d r6 = r6.I     // Catch: java.lang.Throwable -> L3a
                r6.sendMessage(r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r6 = com.amap.api.col.p0003l.e2.b(r6)     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r6 = com.amap.api.col.p0003l.e2.b(r6)     // Catch: java.lang.Throwable -> L3a
                boolean r6 = r6.getCacheCallBack()     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2$f r6 = r6.f3165d     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                r6.removeMessages(r4)     // Catch: java.lang.Throwable -> L3a
                return
            L8e:
                java.lang.String r0 = "handleMessage RESULT_LBS_ON_CALLBACK"
                java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocation r6 = (com.amap.api.location.AMapLocation) r6     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.p0003l.e2.r(r1, r6)     // Catch: java.lang.Throwable -> L3a
                return
            L98:
                java.lang.String r0 = "handleMessage RESULT_INSTALLED_MOCK_APP"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = "installMockApp"
                boolean r6 = r6.getBoolean(r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.p0003l.e2.P(r6)     // Catch: java.lang.Throwable -> L3a
                return
            La8:
                r1 = 2141(0x85d, float:3.0E-42)
                com.autonavi.aps.amapapi.utils.h.a(r0, r1)     // Catch: java.lang.Throwable -> L3a
                goto L105
            Lae:
                java.lang.String r0 = "handleMessage RESULT_NGPS_ABLE"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                java.lang.String r2 = "ngpsAble"
                boolean r6 = r6.getBoolean(r2)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.p0003l.e2.O(r1, r6)     // Catch: java.lang.Throwable -> L3a
                return
            Lc0:
                java.lang.String r0 = "handleMessage RESULT_GPS_GEO_SUCCESS"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.v5 r1 = r1.f3166e     // Catch: java.lang.Throwable -> L3a
                if (r1 == 0) goto L137
                r1.h(r6)     // Catch: java.lang.Throwable -> L3a
                return
            Ld0:
                java.lang.String r0 = "handleMessage RESULT_GPS_LOCATIONCHANGE"
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r1 = r1.f3164c     // Catch: java.lang.Throwable -> L3a
                android.os.Bundle r1 = com.autonavi.aps.amapapi.utils.b.a(r1)     // Catch: java.lang.Throwable -> L3a
                r6.putBundle(r3, r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                r2 = 10
                com.amap.api.col.p0003l.e2.o(r1, r2, r6)     // Catch: java.lang.Throwable -> L3a
                return
            Le9:
                java.lang.String r0 = "handleMessage RESULT_CACHE_CALLBACK"
                com.autonavi.aps.amapapi.model.a r6 = r1.a     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto Lf3
                com.amap.api.col.p0003l.e2.r(r1, r6)     // Catch: java.lang.Throwable -> L3a
                return
            Lf3:
                com.amap.api.location.AMapLocation r6 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L3a
                java.lang.String r1 = "LBS"
                r6.<init>(r1)     // Catch: java.lang.Throwable -> L3a
                r1 = 33
                r6.setErrorCode(r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r1 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.p0003l.e2.r(r1, r6)     // Catch: java.lang.Throwable -> L3a
                return
            L105:
                java.lang.String r0 = "handleMessage RESULT_GPS_LOCATIONSUCCESS"
                android.os.Message r1 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L3a
                r2 = 12
                r1.what = r2     // Catch: java.lang.Throwable -> L3a
                java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L3a
                r1.obj = r6     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2$d r6 = r6.I     // Catch: java.lang.Throwable -> L3a
                r6.sendMessage(r1)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r6 = com.amap.api.col.p0003l.e2.b(r6)     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.location.AMapLocationClientOption r6 = com.amap.api.col.p0003l.e2.b(r6)     // Catch: java.lang.Throwable -> L3a
                boolean r6 = r6.getCacheCallBack()     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2$f r6 = r6.f3165d     // Catch: java.lang.Throwable -> L3a
                if (r6 == 0) goto L137
                r6.removeMessages(r4)     // Catch: java.lang.Throwable -> L3a
            L137:
                return
            L138:
                java.lang.String r0 = "handleMessage RESULT_LBS_LOCATIONSUCCESS"
                com.amap.api.col.3l.e2$d r1 = r1.I     // Catch: java.lang.Throwable -> L3a
                android.os.Message r1 = r1.obtainMessage()     // Catch: java.lang.Throwable -> L3a
                r2 = 11
                r1.what = r2     // Catch: java.lang.Throwable -> L3a
                android.os.Bundle r6 = r6.getData()     // Catch: java.lang.Throwable -> L3a
                r1.setData(r6)     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2 r6 = r5.a     // Catch: java.lang.Throwable -> L3a
                com.amap.api.col.3l.e2$d r6 = r6.I     // Catch: java.lang.Throwable -> L3a
                r6.sendMessage(r1)     // Catch: java.lang.Throwable -> L3a
                return
            L153:
                if (r0 != 0) goto L157
                java.lang.String r0 = "handleMessage"
            L157:
                java.lang.String r1 = "AmapLocationManager$MainHandler"
                com.autonavi.aps.amapapi.utils.b.a(r6, r1, r0)
                return
        }
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.amap.api.col.p0003l.e2.O = r0
            return
    }

    public e2(android.content.Context r4, android.content.Intent r5, android.os.Looper r6) {
            r3 = this;
            r3.<init>()
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r3.f3164c = r0
            r0 = 0
            r3.f3166e = r0
            r1 = 0
            r3.f3168g = r1
            r3.f3169h = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f3170i = r2
            r3.f3171j = r1
            r2 = 1
            r3.f3172k = r2
            r3.l = r2
            r3.m = r2
            r3.o = r0
            r3.p = r0
            r3.q = r0
            r3.r = r1
            r3.s = r2
            r3.t = r0
            r3.u = r1
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy
            r3.v = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r3.w = r2
            r3.x = r0
            r3.y = r1
            r3.z = r0
            com.amap.api.location.AMapLocationClientOption r2 = new com.amap.api.location.AMapLocationClientOption
            r2.<init>()
            r3.A = r2
            r3.B = r0
            r3.C = r0
            com.amap.api.col.3l.e2$b r2 = new com.amap.api.col.3l.e2$b
            r2.<init>(r3)
            r3.D = r2
            r3.E = r0
            r3.F = r1
            r3.G = r1
            r3.H = r1
            r3.I = r0
            r3.J = r0
            r3.K = r1
            r3.f3163b = r4
            r3.q = r5
            r3.H(r6)
            return
    }

    private static void A(com.autonavi.aps.amapapi.b r1, com.autonavi.aps.amapapi.model.a r2) {
            if (r2 == 0) goto L14
            int r0 = r2.getErrorCode()     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto L14
            r1.b(r2)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r1 = move-exception
            java.lang.String r2 = "ALManager"
            java.lang.String r0 = "apsLocation:doFirstAddCache"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r0)
        L14:
            return
    }

    private boolean A0() {
            r6 = this;
            android.content.Context r0 = r6.f3163b
            boolean r0 = com.autonavi.aps.amapapi.utils.j.j(r0)
            r1 = 1
            if (r0 == 0) goto L2b
            r0 = 0
            android.content.Context r2 = r6.f3163b     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L27
            android.app.Application r2 = (android.app.Application) r2     // Catch: java.lang.Throwable -> L27
            android.content.Context r2 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "checkSelfPermission"
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = "android.permission.FOREGROUND_SERVICE"
            r4[r0] = r5     // Catch: java.lang.Throwable -> L27
            int r2 = com.autonavi.aps.amapapi.utils.f.b(r2, r3, r4)     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r2 = -1
        L28:
            if (r2 == 0) goto L2b
            return r0
        L2b:
            return r1
    }

    static /* synthetic */ boolean D(com.amap.api.col.p0003l.e2 r0, boolean r1) {
            r0.f3168g = r1
            return r1
    }

    static /* synthetic */ com.amap.api.col.p0003l.t4 E(com.amap.api.col.p0003l.e2 r0) {
            com.amap.api.col.3l.t4 r0 = r0.f3167f
            return r0
    }

    private com.autonavi.aps.amapapi.model.a F(com.autonavi.aps.amapapi.b r14) {
            r13 = this;
            java.lang.String r0 = "ALManager"
            r1 = 0
            r13.a = r1
            com.autonavi.aps.amapapi.a r2 = new com.autonavi.aps.amapapi.a
            r2.<init>()
            long r3 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> L13d
            r2.c(r3)     // Catch: java.lang.Throwable -> L13d
            java.lang.String r3 = com.amap.api.location.AMapLocationClientOption.getAPIKEY()     // Catch: java.lang.Throwable -> L21
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L27
            android.content.Context r4 = r13.f3163b     // Catch: java.lang.Throwable -> L21
            com.amap.api.col.p0003l.g4.l(r4, r3)     // Catch: java.lang.Throwable -> L21
            goto L27
        L21:
            r3 = move-exception
            java.lang.String r4 = "apsLocation setAuthKey"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L13d
        L27:
            java.lang.String r3 = com.amap.api.location.UmidtokenInfo.getUmidtoken()     // Catch: java.lang.Throwable -> L35
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L3b
            com.amap.api.col.p0003l.i4.s(r3)     // Catch: java.lang.Throwable -> L35
            goto L3b
        L35:
            r3 = move-exception
            java.lang.String r4 = "apsLocation setUmidToken"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r4)     // Catch: java.lang.Throwable -> L13d
        L3b:
            r13.z(r14, r2)     // Catch: java.lang.Throwable -> L13d
            boolean r3 = com.autonavi.aps.amapapi.utils.a.m()     // Catch: java.lang.Throwable -> L13d
            r4 = 0
            com.amap.api.location.AMapLocationClientOption r5 = r13.A     // Catch: java.lang.Throwable -> L8c
            boolean r5 = r5.getCacheCallBack()     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L8e
            com.amap.api.location.AMapLocationClientOption r5 = r13.A     // Catch: java.lang.Throwable -> L8c
            boolean r5 = r5.getCacheCallBack()     // Catch: java.lang.Throwable -> L8c
            com.autonavi.aps.amapapi.model.a r5 = r13.c(r14, r5)     // Catch: java.lang.Throwable -> L8c
            if (r5 == 0) goto L98
            long r6 = r5.getTime()     // Catch: java.lang.Throwable -> L8c
            boolean r6 = com.autonavi.aps.amapapi.utils.a.a(r6)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L62
            goto L99
        L62:
            com.amap.api.location.AMapLocationClientOption r6 = r13.A     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r6.getCacheCallBack()     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L98
            com.amap.api.location.AMapLocationClientOption r6 = r13.A     // Catch: java.lang.Throwable -> L8c
            int r6 = r6.getCacheTimeOut()     // Catch: java.lang.Throwable -> L8c
            long r7 = com.autonavi.aps.amapapi.utils.j.a()     // Catch: java.lang.Throwable -> L8c
            long r9 = r5.getTime()     // Catch: java.lang.Throwable -> L8c
            long r7 = r7 - r9
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L98
            long r9 = (long) r6     // Catch: java.lang.Throwable -> L8c
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 >= 0) goto L98
            r13.a = r5     // Catch: java.lang.Throwable -> L8c
            r6 = 10
            r5.setLocationType(r6)     // Catch: java.lang.Throwable -> L8c
            goto L98
        L8c:
            r5 = move-exception
            goto L93
        L8e:
            com.autonavi.aps.amapapi.model.a r5 = r13.c(r14, r4)     // Catch: java.lang.Throwable -> L8c
            goto L99
        L93:
            java.lang.String r6 = "apscach"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r6)     // Catch: java.lang.Throwable -> L13d
        L98:
            r5 = r1
        L99:
            r6 = 1
            if (r5 != 0) goto Lbf
            r7 = r3 ^ 1
            com.autonavi.aps.amapapi.model.a r5 = r14.a(r7, r2)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Lae
            int r7 = r5.getErrorCode()     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto Lae
            r4 = 1
            goto Lae
        Lac:
            r7 = move-exception
            goto Lb2
        Lae:
            r7 = r5
            r5 = r4
            r4 = 1
            goto Lc1
        Lb2:
            java.lang.String r8 = "apsLocation:doFirstNetLocate"
            com.autonavi.aps.amapapi.utils.b.a(r7, r0, r8)     // Catch: java.lang.Throwable -> Lbb
            r7 = r5
            r4 = 1
        Lb9:
            r5 = 0
            goto Lc1
        Lbb:
            r1 = move-exception
            r7 = r5
            goto L140
        Lbf:
            r7 = r5
            goto Lb9
        Lc1:
            if (r7 == 0) goto Ld2
            java.lang.String r1 = r7.k()     // Catch: java.lang.Throwable -> Lcf
            com.amap.api.location.AMapLocation r8 = r7.clone()     // Catch: java.lang.Throwable -> Lcf
            r12 = r8
            r8 = r1
            r1 = r12
            goto Ld3
        Lcf:
            r1 = move-exception
            goto L140
        Ld2:
            r8 = r1
        Ld3:
            com.amap.api.location.AMapLocationClientOption r9 = r13.f3164c     // Catch: java.lang.Throwable -> Lea
            boolean r9 = r9.isLocationCacheEnable()     // Catch: java.lang.Throwable -> Lea
            if (r9 == 0) goto Lf0
            com.amap.api.col.3l.u7 r9 = r13.n     // Catch: java.lang.Throwable -> Lea
            if (r9 == 0) goto Lf0
            com.amap.api.location.AMapLocationClientOption r10 = r13.f3164c     // Catch: java.lang.Throwable -> Lea
            long r10 = r10.getLastLocationLifeCycle()     // Catch: java.lang.Throwable -> Lea
            com.amap.api.location.AMapLocation r1 = r9.a(r1, r8, r10)     // Catch: java.lang.Throwable -> Lea
            goto Lf0
        Lea:
            r8 = move-exception
            java.lang.String r9 = "fixLastLocation"
            com.autonavi.aps.amapapi.utils.b.a(r8, r0, r9)     // Catch: java.lang.Throwable -> Lcf
        Lf0:
            com.amap.api.location.AMapLocationClientOption r8 = r13.A     // Catch: java.lang.Throwable -> L101
            boolean r8 = r8.getCacheCallBack()     // Catch: java.lang.Throwable -> L101
            if (r8 == 0) goto L101
            com.amap.api.col.3l.e2$f r8 = r13.f3165d     // Catch: java.lang.Throwable -> L101
            if (r8 == 0) goto L101
            r9 = 13
            r8.removeMessages(r9)     // Catch: java.lang.Throwable -> L101
        L101:
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L11c
            r8.<init>()     // Catch: java.lang.Throwable -> L11c
            if (r1 == 0) goto L11e
            java.lang.String r9 = "loc"
            r8.putParcelable(r9, r1)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r1 = "nb"
            java.lang.String r9 = r7.k()     // Catch: java.lang.Throwable -> L11c
            r8.putString(r1, r9)     // Catch: java.lang.Throwable -> L11c
            java.lang.String r1 = "statics"
            r8.putParcelable(r1, r2)     // Catch: java.lang.Throwable -> L11c
            goto L11e
        L11c:
            r1 = move-exception
            goto L127
        L11e:
            r13.k(r8)     // Catch: java.lang.Throwable -> L11c
            if (r5 == 0) goto L12c
            A(r14, r7)     // Catch: java.lang.Throwable -> L11c
            goto L12c
        L127:
            java.lang.String r2 = "apsLocation:callback"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)     // Catch: java.lang.Throwable -> Lcf
        L12c:
            if (r4 == 0) goto L139
            if (r3 == 0) goto L139
            boolean r1 = com.amap.api.col.p0003l.e2.M     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto L139
            com.amap.api.col.p0003l.e2.M = r6     // Catch: java.lang.Throwable -> Lcf
            y(r14)     // Catch: java.lang.Throwable -> Lcf
        L139:
            r14.e()     // Catch: java.lang.Throwable -> L146
            goto L146
        L13d:
            r2 = move-exception
            r7 = r1
            r1 = r2
        L140:
            java.lang.String r2 = "apsLocation"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L147
            goto L139
        L146:
            return r7
        L147:
            r0 = move-exception
            r14.e()     // Catch: java.lang.Throwable -> L14b
        L14b:
            throw r0
    }

    private void H(android.os.Looper r4) {
            r3 = this;
            java.lang.String r0 = "ALManager"
            if (r4 != 0) goto L22
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L1a
            com.amap.api.col.3l.e2$f r4 = new com.amap.api.col.3l.e2$f     // Catch: java.lang.Throwable -> L18
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L18
            android.os.Looper r1 = r1.getMainLooper()     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L18
            r3.f3165d = r4     // Catch: java.lang.Throwable -> L18
            goto L2f
        L18:
            r4 = move-exception
            goto L2a
        L1a:
            com.amap.api.col.3l.e2$f r4 = new com.amap.api.col.3l.e2$f     // Catch: java.lang.Throwable -> L18
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L18
            r3.f3165d = r4     // Catch: java.lang.Throwable -> L18
            goto L2f
        L22:
            com.amap.api.col.3l.e2$f r1 = new com.amap.api.col.3l.e2$f     // Catch: java.lang.Throwable -> L18
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L18
            r3.f3165d = r1     // Catch: java.lang.Throwable -> L18
            goto L2f
        L2a:
            java.lang.String r1 = "init 1"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
        L2f:
            com.amap.api.col.3l.u7 r4 = new com.amap.api.col.3l.u7     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L39
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L39
            r3.n = r4     // Catch: java.lang.Throwable -> L39
            goto L3f
        L39:
            r4 = move-exception
            java.lang.String r1 = "init 2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)     // Catch: java.lang.Throwable -> L5e
        L3f:
            com.amap.api.col.3l.e2$e r4 = new com.amap.api.col.3l.e2$e     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "amapLocManagerThread"
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L5e
            r3.t = r4     // Catch: java.lang.Throwable -> L5e
            r1 = 5
            r4.setPriority(r1)     // Catch: java.lang.Throwable -> L5e
            com.amap.api.col.3l.e2$e r4 = r3.t     // Catch: java.lang.Throwable -> L5e
            r4.start()     // Catch: java.lang.Throwable -> L5e
            com.amap.api.col.3l.e2$e r4 = r3.t     // Catch: java.lang.Throwable -> L5e
            android.os.Looper r4 = r4.getLooper()     // Catch: java.lang.Throwable -> L5e
            com.amap.api.col.3l.e2$d r4 = r3.a(r4)     // Catch: java.lang.Throwable -> L5e
            r3.I = r4     // Catch: java.lang.Throwable -> L5e
            goto L64
        L5e:
            r4 = move-exception
            java.lang.String r1 = "init 5"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
        L64:
            com.amap.api.col.3l.v5 r4 = new com.amap.api.col.3l.v5     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.e2$f r2 = r3.f3165d     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L7b
            r3.f3166e = r4     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.t4 r4 = new com.amap.api.col.3l.t4     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L7b
            com.amap.api.col.3l.e2$f r2 = r3.f3165d     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L7b
            r3.f3167f = r4     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r4 = move-exception
            java.lang.String r1 = "init 3"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
        L81:
            com.autonavi.aps.amapapi.utils.h r4 = r3.x
            if (r4 != 0) goto L8c
            com.autonavi.aps.amapapi.utils.h r4 = new com.autonavi.aps.amapapi.utils.h
            r4.<init>()
            r3.x = r4
        L8c:
            android.content.Context r4 = r3.f3163b
            h(r4)
            return
    }

    private void I(android.os.Message r5) {
            r4 = this;
            java.lang.Object r5 = r5.obj     // Catch: java.lang.Throwable -> L2b
            com.amap.api.location.AMapLocation r5 = (com.amap.api.location.AMapLocation) r5     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r4.f3172k     // Catch: java.lang.Throwable -> L2b
            r1 = 0
            if (r0 == 0) goto L2f
            android.os.Messenger r0 = r4.o     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2f
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "optBundle"
            com.amap.api.location.AMapLocationClientOption r3 = r4.f3164c     // Catch: java.lang.Throwable -> L2b
            android.os.Bundle r3 = com.autonavi.aps.amapapi.utils.b.a(r3)     // Catch: java.lang.Throwable -> L2b
            r0.putBundle(r2, r3)     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            r4.f(r2, r0)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r4.f3169h     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            r0 = 13
            r4.f(r0, r1)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L3e
        L2d:
            r4.f3172k = r2     // Catch: java.lang.Throwable -> L2b
        L2f:
            r4.u(r5, r1)     // Catch: java.lang.Throwable -> L2b
            r5 = 1025(0x401, float:1.436E-42)
            r4.d(r5)     // Catch: java.lang.Throwable -> L2b
            r2 = 300000(0x493e0, double:1.482197E-318)
            r4.g(r5, r1, r2)     // Catch: java.lang.Throwable -> L2b
            return
        L3e:
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "resultGpsLocationSuccess"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    static /* synthetic */ void J(com.amap.api.col.p0003l.e2 r0, android.os.Message r1) {
            r0.l(r1)
            return
    }

    static /* synthetic */ void K(com.amap.api.col.p0003l.e2 r0, com.amap.api.location.AMapLocation r1) {
            r0.k0(r1)
            return
    }

    static /* synthetic */ void L(com.amap.api.col.p0003l.e2 r0, com.amap.api.location.AMapLocationListener r1) {
            r0.b0(r1)
            return
    }

    private static void M(com.amap.api.location.AMapLocation r5) {
            if (r5 != 0) goto L3
            goto L20
        L3:
            int r0 = r5.getLocationType()     // Catch: java.lang.Throwable -> L20
            r1 = 2
            if (r1 == r0) goto L11
            int r0 = r5.getLocationType()     // Catch: java.lang.Throwable -> L20
            r1 = 4
            if (r1 != r0) goto L20
        L11:
            long r0 = r5.getTime()     // Catch: java.lang.Throwable -> L20
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L20
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L20
            r5.setTime(r2)     // Catch: java.lang.Throwable -> L20
        L20:
            return
    }

    static /* synthetic */ boolean O(com.amap.api.col.p0003l.e2 r0, boolean r1) {
            r0.s = r1
            return r1
    }

    static /* synthetic */ boolean P(boolean r0) {
            com.amap.api.col.p0003l.e2.N = r0
            return r0
    }

    static /* synthetic */ android.content.Context Q(com.amap.api.col.p0003l.e2 r0) {
            android.content.Context r0 = r0.f3163b
            return r0
    }

    private void S(android.os.Message r5) {
            r4 = this;
            java.lang.String r0 = "h"
            java.lang.String r1 = "i"
            if (r5 != 0) goto L7
            goto Ld
        L7:
            android.os.Bundle r5 = r5.getData()     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto Le
        Ld:
            return
        Le:
            r2 = 0
            int r2 = r5.getInt(r1, r2)     // Catch: java.lang.Throwable -> L2d
            android.os.Parcelable r5 = r5.getParcelable(r0)     // Catch: java.lang.Throwable -> L2d
            android.app.Notification r5 = (android.app.Notification) r5     // Catch: java.lang.Throwable -> L2d
            android.content.Intent r3 = r4.x0()     // Catch: java.lang.Throwable -> L2d
            r3.putExtra(r1, r2)     // Catch: java.lang.Throwable -> L2d
            r3.putExtra(r0, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "g"
            r0 = 1
            r3.putExtra(r5, r0)     // Catch: java.lang.Throwable -> L2d
            r4.j(r3, r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r5 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "doEnableBackgroundLocation"
            com.autonavi.aps.amapapi.utils.b.a(r5, r0, r1)
            return
    }

    static /* synthetic */ void T(com.amap.api.col.p0003l.e2 r0, android.os.Message r1) {
            r0.S(r1)
            return
    }

    private void U(com.amap.api.location.AMapLocation r9) {
            r8 = this;
            if (r9 == 0) goto L87
            java.lang.String r0 = r9.getLocationDetail()     // Catch: java.lang.Throwable -> L84
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            goto L18
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            r0 = r1
        L18:
            android.content.Context r1 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"
            boolean r1 = com.autonavi.aps.amapapi.utils.j.c(r1, r2)     // Catch: java.lang.Throwable -> L84
            android.content.Context r2 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF"
            boolean r2 = com.autonavi.aps.amapapi.utils.j.c(r2, r3)     // Catch: java.lang.Throwable -> L84
            android.content.Context r3 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw=="
            boolean r3 = com.autonavi.aps.amapapi.utils.j.c(r3, r4)     // Catch: java.lang.Throwable -> L84
            android.content.Context r4 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r5 = "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="
            boolean r4 = com.autonavi.aps.amapapi.utils.j.c(r4, r5)     // Catch: java.lang.Throwable -> L84
            android.content.Context r5 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"
            boolean r5 = com.autonavi.aps.amapapi.utils.j.c(r5, r6)     // Catch: java.lang.Throwable -> L84
            android.content.Context r6 = r8.f3163b     // Catch: java.lang.Throwable -> L84
            java.lang.String r7 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="
            boolean r6 = com.autonavi.aps.amapapi.utils.j.c(r6, r7)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L4d
            java.lang.String r1 = "#pm1"
            goto L4f
        L4d:
            java.lang.String r1 = "#pm0"
        L4f:
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "0"
            java.lang.String r7 = "1"
            if (r2 == 0) goto L5a
            r2 = r7
            goto L5b
        L5a:
            r2 = r1
        L5b:
            r0.append(r2)     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L62
            r2 = r7
            goto L63
        L62:
            r2 = r1
        L63:
            r0.append(r2)     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L6a
            r2 = r7
            goto L6b
        L6a:
            r2 = r1
        L6b:
            r0.append(r2)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L72
            r2 = r7
            goto L73
        L72:
            r2 = r1
        L73:
            r0.append(r2)     // Catch: java.lang.Throwable -> L84
            if (r6 == 0) goto L79
            r1 = r7
        L79:
            r0.append(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L84
            r9.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L84
            return
        L84:
            com.autonavi.aps.amapapi.utils.d.b()
        L87:
            return
    }

    private void V(com.amap.api.location.AMapLocationListener r2) {
            r1 = this;
            if (r2 == 0) goto L1b
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3170i = r0
        Ld:
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1a
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            r0.add(r2)
        L1a:
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "listener参数不能为null"
            r2.<init>(r0)
            throw r2
    }

    private void X(android.os.Message r3) {
            r2 = this;
            java.lang.String r0 = "j"
            if (r3 != 0) goto L5
            goto Lb
        L5:
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Throwable -> L23
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            r1 = 1
            boolean r3 = r3.getBoolean(r0, r1)     // Catch: java.lang.Throwable -> L23
            android.content.Intent r1 = r2.x0()     // Catch: java.lang.Throwable -> L23
            r1.putExtra(r0, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "g"
            r0 = 2
            r1.putExtra(r3, r0)     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r2.j(r1, r3)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "doDisableBackgroundLocation"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    static /* synthetic */ void Y(com.amap.api.col.p0003l.e2 r0) {
            r0.w0()
            return
    }

    static /* synthetic */ void Z(com.amap.api.col.p0003l.e2 r0, android.os.Message r1) {
            r0.X(r1)
            return
    }

    private com.amap.api.col.3l.e2.d a(android.os.Looper r3) {
            r2 = this;
            java.lang.Object r0 = r2.w
            monitor-enter(r0)
            com.amap.api.col.3l.e2$d r1 = new com.amap.api.col.3l.e2$d     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r2.I = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    private void a0(com.amap.api.location.AMapLocation r3) {
            r2 = this;
            com.amap.api.col.3l.e2$f r0 = r2.f3165d
            android.os.Message r0 = r0.obtainMessage()
            r1 = 10
            r0.what = r1
            r0.obj = r3
            com.amap.api.col.3l.e2$f r3 = r2.f3165d
            r3.sendMessage(r0)
            return
    }

    static /* synthetic */ com.amap.api.location.AMapLocationClientOption b(com.amap.api.col.p0003l.e2 r0) {
            com.amap.api.location.AMapLocationClientOption r0 = r0.A
            return r0
    }

    private void b0(com.amap.api.location.AMapLocationListener r2) {
            r1 = this;
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L15
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r1.f3170i
            r0.remove(r2)
        L15:
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r2 = r1.f3170i
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L20
            r1.s0()
        L20:
            return
    }

    private com.autonavi.aps.amapapi.model.a c(com.autonavi.aps.amapapi.b r2, boolean r3) {
            r1 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r1.f3164c
            boolean r0 = r0.isLocationCacheEnable()
            if (r0 == 0) goto L15
            com.autonavi.aps.amapapi.model.a r2 = r2.b(r3)     // Catch: java.lang.Throwable -> Ld
            return r2
        Ld:
            r2 = move-exception
            java.lang.String r3 = "ALManager"
            java.lang.String r0 = "doFirstCacheLoc"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
        L15:
            r2 = 0
            return r2
    }

    private void d(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.w
            monitor-enter(r0)
            com.amap.api.col.3l.e2$d r1 = r2.I     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r3 = move-exception
            goto Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    static /* synthetic */ void d0(com.amap.api.col.p0003l.e2 r0) {
            r0.p0()
            return
    }

    private synchronized void e0(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L18
            com.amap.api.location.AMapLocation r4 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = ""
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 8
            r4.setErrorCode(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "coarse amapLocation is null#2005"
            r4.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r4 = move-exception
            goto Laf
        L18:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L23
            com.amap.api.location.AMapLocationQualityReport r0 = new com.amap.api.location.AMapLocationQualityReport     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            r3.E = r0     // Catch: java.lang.Throwable -> L15
        L23:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r1 = r3.f3164c     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r1.getLocationMode()     // Catch: java.lang.Throwable -> L15
            r0.setLocationMode(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.t4 r0 = r3.f3167f     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L46
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            int r1 = r4.getSatellites()     // Catch: java.lang.Throwable -> L15
            r0.setGPSSatellites(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.t4 r1 = r3.f3167f     // Catch: java.lang.Throwable -> L15
            int r1 = r1.n()     // Catch: java.lang.Throwable -> L15
            r0.setGpsStatus(r1)     // Catch: java.lang.Throwable -> L15
        L46:
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L15
            boolean r0 = com.autonavi.aps.amapapi.utils.j.g(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r1 = r3.E     // Catch: java.lang.Throwable -> L15
            r1.setWifiAble(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = com.autonavi.aps.amapapi.utils.j.h(r1)     // Catch: java.lang.Throwable -> L15
            r0.setNetworkType(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r0.setNetUseTime(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            boolean r1 = com.amap.api.col.p0003l.e2.N     // Catch: java.lang.Throwable -> L15
            r0.setInstallHighDangerMockApp(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            r4.setLocationQualityReport(r0)     // Catch: java.lang.Throwable -> L15
            boolean r0 = r3.f3169h     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L9a
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L92
            com.autonavi.aps.amapapi.utils.h.a(r0, r4)     // Catch: java.lang.Throwable -> L92
            com.amap.api.location.AMapLocation r0 = r4.clone()     // Catch: java.lang.Throwable -> L92
            r3.a0(r0)     // Catch: java.lang.Throwable -> L92
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L92
            com.autonavi.aps.amapapi.utils.g r0 = com.autonavi.aps.amapapi.utils.g.a(r0)     // Catch: java.lang.Throwable -> L92
            r0.a(r4)     // Catch: java.lang.Throwable -> L92
            android.content.Context r4 = r3.f3163b     // Catch: java.lang.Throwable -> L92
            com.autonavi.aps.amapapi.utils.g r4 = com.autonavi.aps.amapapi.utils.g.a(r4)     // Catch: java.lang.Throwable -> L92
            r4.b()     // Catch: java.lang.Throwable -> L92
            goto L9a
        L92:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "handlerCoarseLocation part"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)     // Catch: java.lang.Throwable -> L15
        L9a:
            boolean r4 = r3.u     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto La0
            monitor-exit(r3)
            return
        La0:
            com.amap.api.col.3l.t4 r4 = r3.f3167f     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto La7
            r3.s0()     // Catch: java.lang.Throwable -> L15
        La7:
            r4 = 14
            r0 = 0
            r3.f(r4, r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return
        Laf:
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "handlerCoarseLocation part2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r3)
            return
        Lb8:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb8
            throw r4
    }

    private void f(int r3, android.os.Bundle r4) {
            r2 = this;
            if (r4 != 0) goto La
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8
            r4.<init>()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r3 = move-exception
            goto L36
        La:
            java.lang.String r0 = r2.C     // Catch: java.lang.Throwable -> L8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L1a
            android.content.Context r0 = r2.f3163b     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.b(r0)     // Catch: java.lang.Throwable -> L8
            r2.C = r0     // Catch: java.lang.Throwable -> L8
        L1a:
            java.lang.String r0 = "c"
            java.lang.String r1 = r2.C     // Catch: java.lang.Throwable -> L8
            r4.putString(r0, r1)     // Catch: java.lang.Throwable -> L8
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L8
            r0.what = r3     // Catch: java.lang.Throwable -> L8
            r0.setData(r4)     // Catch: java.lang.Throwable -> L8
            android.os.Messenger r3 = r2.p     // Catch: java.lang.Throwable -> L8
            r0.replyTo = r3     // Catch: java.lang.Throwable -> L8
            android.os.Messenger r3 = r2.o     // Catch: java.lang.Throwable -> L8
            if (r3 == 0) goto L35
            r3.send(r0)     // Catch: java.lang.Throwable -> L8
        L35:
            return
        L36:
            boolean r4 = r3 instanceof java.lang.IllegalStateException
            r0 = 0
            if (r4 == 0) goto L49
            java.lang.String r4 = r3.getMessage()
            java.lang.String r1 = "sending message to a Handler on a dead thread"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L49
            r4 = 1
            goto L4a
        L49:
            r4 = 0
        L4a:
            boolean r1 = r3 instanceof android.os.RemoteException
            if (r1 != 0) goto L50
            if (r4 == 0) goto L55
        L50:
            r4 = 0
            r2.o = r4
            r2.f3168g = r0
        L55:
            java.lang.String r4 = "ALManager"
            java.lang.String r0 = "sendLocMessage"
            com.autonavi.aps.amapapi.utils.b.a(r3, r4, r0)
            return
    }

    private void g(int r3, java.lang.Object r4, long r5) {
            r2 = this;
            java.lang.Object r0 = r2.w
            monitor-enter(r0)
            com.amap.api.col.3l.e2$d r1 = r2.I     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L20
            android.os.Message r1 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L17
            r1.what = r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r4 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L19
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L17
            r1.setData(r4)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r3 = move-exception
            goto L22
        L19:
            r1.obj = r4     // Catch: java.lang.Throwable -> L17
        L1b:
            com.amap.api.col.3l.e2$d r3 = r2.I     // Catch: java.lang.Throwable -> L17
            r3.sendMessageDelayed(r1, r5)     // Catch: java.lang.Throwable -> L17
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r3
    }

    static /* synthetic */ void g0(com.amap.api.col.p0003l.e2 r0) {
            r0.s0()
            return
    }

    private static void h(android.content.Context r3) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.amap.api.col.p0003l.e2.O
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            com.amap.api.col.3l.b8 r0 = com.amap.api.col.p0003l.b8.h()
            com.amap.api.col.3l.e2$a r1 = new com.amap.api.col.3l.e2$a
            r1.<init>(r3)
            r0.b(r1)
        L16:
            return
    }

    private void h0(com.amap.api.location.AMapLocation r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L19
        L3:
            com.autonavi.aps.amapapi.storage.b r0 = com.amap.api.col.p0003l.u7.f4023g     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L12
            com.amap.api.col.3l.u7 r0 = r1.n     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L10
            com.amap.api.location.AMapLocation r0 = r0.d()     // Catch: java.lang.Throwable -> L19
            goto L16
        L10:
            r0 = 0
            goto L16
        L12:
            com.amap.api.location.AMapLocation r0 = r0.a()     // Catch: java.lang.Throwable -> L19
        L16:
            com.autonavi.aps.amapapi.utils.h.a(r0, r2)     // Catch: java.lang.Throwable -> L19
        L19:
            return
    }

    private void i(android.content.Intent r4) {
            r3 = this;
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L9
            android.content.ServiceConnection r1 = r3.D     // Catch: java.lang.Throwable -> L9
            r2 = 1
            r0.bindService(r4, r1, r2)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "startServiceImpl"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    private void j(android.content.Intent r6, boolean r7) {
            r5 = this;
            android.content.Context r0 = r5.f3163b
            if (r0 == 0) goto L3c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 1
            if (r1 < r2) goto L37
            if (r7 == 0) goto L37
            boolean r7 = r5.A0()
            if (r7 != 0) goto L14
            return
        L14:
            android.content.Context r7 = r5.f3163b     // Catch: java.lang.Throwable -> L31
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "startForegroundService"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.Class<android.content.Intent> r2 = android.content.Intent.class
            r4 = 0
            r1[r4] = r2     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r7 = r7.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L31
            android.content.Context r0 = r5.f3163b     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L31
            r1[r4] = r6     // Catch: java.lang.Throwable -> L31
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L31
            goto L3a
        L31:
            android.content.Context r7 = r5.f3163b
            r7.startService(r6)
            goto L3a
        L37:
            r0.startService(r6)
        L3a:
            r5.K = r3
        L3c:
            return
    }

    static /* synthetic */ void j0(com.amap.api.col.p0003l.e2 r0) {
            r0.y0()
            return
    }

    private void k(android.os.Bundle r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L45
            java.lang.Class<com.amap.api.location.AMapLocation> r1 = com.amap.api.location.AMapLocation.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L42
            r5.setClassLoader(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "loc"
            android.os.Parcelable r1 = r5.getParcelable(r1)     // Catch: java.lang.Throwable -> L42
            com.amap.api.location.AMapLocation r1 = (com.amap.api.location.AMapLocation) r1     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "nb"
            java.lang.String r2 = r5.getString(r2)     // Catch: java.lang.Throwable -> L42
            r4.J = r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "statics"
            android.os.Parcelable r5 = r5.getParcelable(r2)     // Catch: java.lang.Throwable -> L42
            com.autonavi.aps.amapapi.a r5 = (com.autonavi.aps.amapapi.a) r5     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L47
            int r2 = r1.getErrorCode()     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L47
            com.amap.api.col.3l.v5 r2 = r4.f3166e     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L47
            r2.x()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = r1.getAdCode()     // Catch: java.lang.Throwable -> L40
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 != 0) goto L47
            com.amap.api.col.p0003l.v5.J = r1     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r1 = move-exception
            goto L54
        L42:
            r1 = move-exception
            r5 = r0
            goto L54
        L45:
            r5 = r0
            r1 = r5
        L47:
            com.amap.api.col.3l.v5 r2 = r4.f3166e     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L52
            java.lang.String r3 = r4.J     // Catch: java.lang.Throwable -> L40
            com.amap.api.location.AMapLocation r0 = r2.b(r1, r3)     // Catch: java.lang.Throwable -> L40
            goto L5b
        L52:
            r0 = r1
            goto L5b
        L54:
            java.lang.String r2 = "AmapLocationManager"
            java.lang.String r3 = "resultLbsLocationSuccess"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L5b:
            r4.u(r0, r5)
            return
    }

    private void k0(com.amap.api.location.AMapLocation r4) {
            r3 = this;
            boolean r0 = r3.l     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            android.os.Messenger r0 = r3.o     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L2b
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "optBundle"
            com.amap.api.location.AMapLocationClientOption r2 = r3.f3164c     // Catch: java.lang.Throwable -> L27
            android.os.Bundle r2 = com.autonavi.aps.amapapi.utils.b.a(r2)     // Catch: java.lang.Throwable -> L27
            r0.putBundle(r1, r2)     // Catch: java.lang.Throwable -> L27
            r1 = 0
            r3.f(r1, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r3.f3169h     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L29
            r0 = 13
            r2 = 0
            r3.f(r0, r2)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r4 = move-exception
            goto L2f
        L29:
            r3.l = r1     // Catch: java.lang.Throwable -> L27
        L2b:
            r3.e0(r4)     // Catch: java.lang.Throwable -> L27
            return
        L2f:
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "resultGpsLocationSuccess"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    private void l(android.os.Message r3) {
            r2 = this;
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "loc"
            android.os.Parcelable r0 = r3.getParcelable(r0)     // Catch: java.lang.Throwable -> L23
            com.amap.api.location.AMapLocation r0 = (com.amap.api.location.AMapLocation) r0     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "lastLocNb"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Throwable -> L23
            r2.h0(r0)     // Catch: java.lang.Throwable -> L23
            com.amap.api.col.3l.u7 r1 = r2.n     // Catch: java.lang.Throwable -> L23
            boolean r3 = r1.c(r0, r3)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L25
            com.amap.api.col.3l.u7 r3 = r2.n     // Catch: java.lang.Throwable -> L23
            r3.f()     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L26
        L25:
            return
        L26:
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "doSaveLastLocation"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    private void l0() {
            r3 = this;
            java.lang.Object r0 = r3.w
            monitor-enter(r0)
            com.amap.api.col.3l.e2$d r1 = r3.I     // Catch: java.lang.Throwable -> Lc
            r2 = 0
            if (r1 == 0) goto Le
            r1.removeCallbacksAndMessages(r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L12
        Le:
            r3.I = r2     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    static /* synthetic */ void m0(com.amap.api.col.p0003l.e2 r0) {
            r0.u0()
            return
    }

    static /* synthetic */ void n(com.amap.api.col.p0003l.e2 r1, int r2, long r3) {
            r0 = 0
            r1.g(r2, r0, r3)
            return
    }

    static /* synthetic */ void n0(com.amap.api.col.p0003l.e2 r1) {
            r0 = 1025(0x401, float:1.436E-42)
            r1.d(r0)
            return
    }

    static /* synthetic */ void o(com.amap.api.col.p0003l.e2 r0, int r1, android.os.Bundle r2) {
            r0.f(r1, r2)
            return
    }

    private boolean o0() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            android.os.Messenger r2 = r6.o     // Catch: java.lang.Throwable -> L12
            r3 = 1
            if (r2 != 0) goto L14
            r4 = 100
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L12
            int r1 = r1 + r3
            r2 = 50
            if (r1 < r2) goto L2
            goto L14
        L12:
            r1 = move-exception
            goto L5a
        L14:
            android.os.Messenger r1 = r6.o     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L58
            android.os.Message r1 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L12
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L12
            r2.<init>()     // Catch: java.lang.Throwable -> L12
            com.amap.api.location.AMapLocation r4 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L12
            java.lang.String r5 = ""
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L12
            r5 = 10
            r4.setErrorCode(r5)     // Catch: java.lang.Throwable -> L12
            android.content.Context r5 = r6.f3163b     // Catch: java.lang.Throwable -> L12
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L12
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L12
            boolean r5 = com.autonavi.aps.amapapi.utils.j.k(r5)     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L43
            java.lang.String r5 = "请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003"
            r4.setLocationDetail(r5)     // Catch: java.lang.Throwable -> L12
            goto L48
        L43:
            java.lang.String r5 = "启动ApsServcie失败#1001"
            r4.setLocationDetail(r5)     // Catch: java.lang.Throwable -> L12
        L48:
            java.lang.String r5 = "loc"
            r2.putParcelable(r5, r4)     // Catch: java.lang.Throwable -> L12
            r1.setData(r2)     // Catch: java.lang.Throwable -> L12
            r1.what = r3     // Catch: java.lang.Throwable -> L12
            com.amap.api.col.3l.e2$f r2 = r6.f3165d     // Catch: java.lang.Throwable -> L12
            r2.sendMessage(r1)     // Catch: java.lang.Throwable -> L12
            goto L61
        L58:
            r0 = 1
            goto L61
        L5a:
            java.lang.String r2 = "ALManager"
            java.lang.String r3 = "checkAPSManager"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
        L61:
            if (r0 != 0) goto L7f
            android.content.Context r1 = r6.f3163b
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            boolean r1 = com.autonavi.aps.amapapi.utils.j.k(r1)
            r2 = 0
            if (r1 != 0) goto L7a
            r1 = 2103(0x837, float:2.947E-42)
            com.autonavi.aps.amapapi.utils.h.a(r2, r1)
            goto L7f
        L7a:
            r1 = 2101(0x835, float:2.944E-42)
            com.autonavi.aps.amapapi.utils.h.a(r2, r1)
        L7f:
            return r0
    }

    static /* synthetic */ void p(com.amap.api.col.p0003l.e2 r0, android.os.Bundle r1) {
            r0.k(r1)
            return
    }

    private synchronized void p0() {
            r10 = this;
            monitor-enter(r10)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L20
            r1 = 29
            if (r0 >= r1) goto L23
            r2 = 23
            if (r0 < r2) goto L23
            android.content.Context r2 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="
            boolean r2 = com.autonavi.aps.amapapi.utils.j.c(r2, r3)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto L23
            android.content.Context r2 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"
            boolean r2 = com.autonavi.aps.amapapi.utils.j.c(r2, r3)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L75
            goto L23
        L20:
            r0 = move-exception
            goto L114
        L23:
            r2 = 31
            if (r0 >= r2) goto L3d
            if (r0 < r1) goto L3d
            android.content.Context r3 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L20
            int r3 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L20
            if (r3 < r1) goto L3d
            android.content.Context r3 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"
            boolean r3 = com.autonavi.aps.amapapi.utils.j.c(r3, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L75
        L3d:
            if (r0 >= r2) goto L5f
            if (r0 < r1) goto L5f
            android.content.Context r3 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L20
            int r3 = r3.targetSdkVersion     // Catch: java.lang.Throwable -> L20
            if (r3 >= r1) goto L5f
            android.content.Context r1 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="
            boolean r1 = com.autonavi.aps.amapapi.utils.j.c(r1, r3)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L5f
            android.content.Context r1 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"
            boolean r1 = com.autonavi.aps.amapapi.utils.j.c(r1, r3)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L75
        L5f:
            if (r0 < r2) goto L7a
            android.content.Context r0 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L7a
            android.content.Context r0 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"
            boolean r0 = com.autonavi.aps.amapapi.utils.j.c(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L7a
        L75:
            r10.r0()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        L7a:
            com.amap.api.location.AMapLocationClientOption r0 = r10.f3164c     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L85
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            r10.f3164c = r0     // Catch: java.lang.Throwable -> L20
        L85:
            boolean r0 = r10.f3169h     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L8b
            monitor-exit(r10)
            return
        L8b:
            r0 = 1
            r10.f3169h = r0     // Catch: java.lang.Throwable -> L20
            r1 = 1029(0x405, float:1.442E-42)
            r2 = 0
            r4 = 0
            r10.g(r1, r4, r2)     // Catch: java.lang.Throwable -> L20
            int[] r1 = com.amap.api.col.3l.e2.c.a     // Catch: java.lang.Throwable -> L20
            com.amap.api.location.AMapLocationClientOption r5 = r10.f3164c     // Catch: java.lang.Throwable -> L20
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r5 = r5.getLocationMode()     // Catch: java.lang.Throwable -> L20
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L20
            r1 = r1[r5]     // Catch: java.lang.Throwable -> L20
            r5 = 1027(0x403, float:1.439E-42)
            r6 = 1017(0x3f9, float:1.425E-42)
            r7 = 1016(0x3f8, float:1.424E-42)
            if (r1 == r0) goto L109
            r0 = 2
            r8 = 1015(0x3f7, float:1.422E-42)
            r9 = 1026(0x402, float:1.438E-42)
            if (r1 == r0) goto Leb
            r0 = 3
            if (r1 == r0) goto Lb7
            goto Le9
        Lb7:
            android.content.Context r0 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lca
            r10.d(r7)     // Catch: java.lang.Throwable -> L20
            r10.g(r6, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r9, r4, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        Lca:
            r10.g(r5, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r8, r4, r2)     // Catch: java.lang.Throwable -> L20
            com.amap.api.location.AMapLocationClientOption r0 = r10.f3164c     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isGpsFirst()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Le6
            com.amap.api.location.AMapLocationClientOption r0 = r10.f3164c     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isOnceLocation()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Le6
            com.amap.api.location.AMapLocationClientOption r0 = r10.f3164c     // Catch: java.lang.Throwable -> L20
            long r2 = r0.getGpsFirstTimeout()     // Catch: java.lang.Throwable -> L20
        Le6:
            r10.g(r7, r4, r2)     // Catch: java.lang.Throwable -> L20
        Le9:
            monitor-exit(r10)
            return
        Leb:
            android.content.Context r0 = r10.f3163b     // Catch: java.lang.Throwable -> L20
            boolean r0 = com.autonavi.aps.amapapi.utils.j.m(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lfe
            r10.d(r7)     // Catch: java.lang.Throwable -> L20
            r10.g(r6, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r9, r4, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        Lfe:
            r10.d(r7)     // Catch: java.lang.Throwable -> L20
            r10.g(r5, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r8, r4, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        L109:
            r10.g(r5, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r6, r4, r2)     // Catch: java.lang.Throwable -> L20
            r10.g(r7, r4, r2)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r10)
            return
        L114:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L20
            throw r0
    }

    static /* synthetic */ void q(com.amap.api.col.p0003l.e2 r0, android.os.Message r1) {
            r0.I(r1)
            return
    }

    static /* synthetic */ void q0(com.amap.api.col.p0003l.e2 r0) {
            r0.z0()
            return
    }

    static /* synthetic */ void r(com.amap.api.col.p0003l.e2 r0, com.amap.api.location.AMapLocation r1) {
            r0.t(r1)
            return
    }

    private void r0() {
            r4 = this;
            com.amap.api.location.AMapLocation r0 = new com.amap.api.location.AMapLocation
            java.lang.String r1 = ""
            r0.<init>(r1)
            r1 = 12
            r0.setErrorCode(r1)
            java.lang.String r1 = "定位权限被禁用,请授予应用定位权限 #1201"
            r0.setLocationDetail(r1)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            if (r1 != 0) goto L1c
            com.amap.api.location.AMapLocationQualityReport r1 = new com.amap.api.location.AMapLocationQualityReport
            r1.<init>()
            r4.E = r1
        L1c:
            com.amap.api.location.AMapLocationQualityReport r1 = new com.amap.api.location.AMapLocationQualityReport
            r1.<init>()
            r4.E = r1
            r2 = 4
            r1.setGpsStatus(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            r2 = 0
            r1.setGPSSatellites(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            com.amap.api.location.AMapLocationClientOption r2 = r4.f3164c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r2 = r2.getLocationMode()
            r1.setLocationMode(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            android.content.Context r2 = r4.f3163b
            boolean r2 = com.autonavi.aps.amapapi.utils.j.g(r2)
            r1.setWifiAble(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            android.content.Context r2 = r4.f3163b
            java.lang.String r2 = com.autonavi.aps.amapapi.utils.j.h(r2)
            r1.setNetworkType(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            r2 = 0
            r1.setNetUseTime(r2)
            com.amap.api.location.AMapLocationQualityReport r1 = r4.E
            r0.setLocationQualityReport(r1)
            r1 = 0
            r2 = 2121(0x849, float:2.972E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r2)
            r4.a0(r0)
            return
    }

    static /* synthetic */ void s(com.amap.api.col.p0003l.e2 r0, com.amap.api.location.AMapLocationListener r1) {
            r0.V(r1)
            return
    }

    private void s0() {
            r4 = this;
            r0 = 1025(0x401, float:1.436E-42)
            r4.d(r0)     // Catch: java.lang.Throwable -> Ld
            com.amap.api.col.3l.v5 r0 = r4.f3166e     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0.c()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L29
        Lf:
            com.amap.api.col.3l.t4 r0 = r4.f3167f     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L16
            r0.b()     // Catch: java.lang.Throwable -> Ld
        L16:
            r0 = 1016(0x3f8, float:1.424E-42)
            r4.d(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r1 = 0
            r3 = 1030(0x406, float:1.443E-42)
            r4.g(r3, r0, r1)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r4.f3169h = r0     // Catch: java.lang.Throwable -> Ld
            r4.r = r0     // Catch: java.lang.Throwable -> Ld
            return
        L29:
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "stopLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private void t(com.amap.api.location.AMapLocation r9) {
            r8 = this;
            int r0 = r9.getErrorCode()     // Catch: java.lang.Throwable -> Lad
            r1 = 0
            if (r0 == 0) goto La
            r9.setLocationType(r1)     // Catch: java.lang.Throwable -> Lad
        La:
            int r0 = r9.getErrorCode()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L5c
            double r2 = r9.getLatitude()     // Catch: java.lang.Throwable -> Lad
            double r4 = r9.getLongitude()     // Catch: java.lang.Throwable -> Lad
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L22
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L46
        L22:
            r6 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L46
            r6 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L46
            r2 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L46
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5c
        L46:
            java.lang.String r0 = "errorLatLng"
            java.lang.String r2 = r9.toStr()     // Catch: java.lang.Throwable -> Lad
            com.autonavi.aps.amapapi.utils.h.a(r0, r2)     // Catch: java.lang.Throwable -> Lad
            r9.setLocationType(r1)     // Catch: java.lang.Throwable -> Lad
            r0 = 8
            r9.setErrorCode(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "LatLng is error#0802"
            r9.setLocationDetail(r0)     // Catch: java.lang.Throwable -> Lad
        L5c:
            java.lang.String r0 = "gps"
            java.lang.String r1 = r9.getProvider()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L70
            com.amap.api.col.3l.v5 r0 = r8.f3166e     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.v()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto Lad
        L70:
            double r0 = r9.getAltitude()     // Catch: java.lang.Throwable -> Lad
            double r0 = com.autonavi.aps.amapapi.utils.j.c(r0)     // Catch: java.lang.Throwable -> Lad
            r9.setAltitude(r0)     // Catch: java.lang.Throwable -> Lad
            float r0 = r9.getBearing()     // Catch: java.lang.Throwable -> Lad
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> Lad
            r9.setBearing(r0)     // Catch: java.lang.Throwable -> Lad
            float r0 = r9.getSpeed()     // Catch: java.lang.Throwable -> Lad
            float r0 = com.autonavi.aps.amapapi.utils.j.a(r0)     // Catch: java.lang.Throwable -> Lad
            r9.setSpeed(r0)     // Catch: java.lang.Throwable -> Lad
            r8.U(r9)     // Catch: java.lang.Throwable -> Lad
            M(r9)     // Catch: java.lang.Throwable -> Lad
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r0 = r8.f3170i     // Catch: java.lang.Throwable -> Lad
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lad
        L9d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lad
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lad
            com.amap.api.location.AMapLocationListener r1 = (com.amap.api.location.AMapLocationListener) r1     // Catch: java.lang.Throwable -> Lad
            r1.onLocationChanged(r9)     // Catch: java.lang.Throwable -> L9d
            goto L9d
        Lad:
            return
    }

    private void t0() {
            r4 = this;
            com.autonavi.aps.amapapi.b r0 = new com.autonavi.aps.amapapi.b
            r1 = 1
            r0.<init>(r1)
            com.autonavi.aps.amapapi.model.a r0 = r4.F(r0)
            boolean r1 = r4.o0()
            if (r1 == 0) goto L48
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r0 == 0) goto L28
            int r2 = r0.getLocationType()
            r3 = 2
            if (r2 == r3) goto L25
            int r0 = r0.getLocationType()
            r2 = 4
            if (r0 != r2) goto L28
        L25:
            java.lang.String r0 = "1"
            goto L2a
        L28:
            java.lang.String r0 = "0"
        L2a:
            com.amap.api.location.AMapLocationClientOption r2 = r4.f3164c
            android.os.Bundle r2 = com.autonavi.aps.amapapi.utils.b.a(r2)
            java.lang.String r3 = "optBundle"
            r1.putBundle(r3, r2)
            java.lang.String r2 = "isCacheLoc"
            r1.putString(r2, r0)
            r0 = 0
            r4.f(r0, r1)
            boolean r0 = r4.f3169h
            if (r0 == 0) goto L48
            r0 = 13
            r1 = 0
            r4.f(r0, r1)
        L48:
            return
    }

    private synchronized void u(com.amap.api.location.AMapLocation r4, com.autonavi.aps.amapapi.a r5) {
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L18
            com.amap.api.location.AMapLocation r4 = new com.amap.api.location.AMapLocation     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = ""
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 8
            r4.setErrorCode(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "amapLocation is null#0801"
            r4.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r4 = move-exception
            goto Lf7
        L18:
            java.lang.String r0 = "gps"
            java.lang.String r1 = r4.getProvider()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L29
            java.lang.String r0 = "lbs"
            r4.setProvider(r0)     // Catch: java.lang.Throwable -> L15
        L29:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L34
            com.amap.api.location.AMapLocationQualityReport r0 = new com.amap.api.location.AMapLocationQualityReport     // Catch: java.lang.Throwable -> L15
            r0.<init>()     // Catch: java.lang.Throwable -> L15
            r3.E = r0     // Catch: java.lang.Throwable -> L15
        L34:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption r1 = r3.f3164c     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r1.getLocationMode()     // Catch: java.lang.Throwable -> L15
            r0.setLocationMode(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.v5 r0 = r3.f3166e     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L57
            com.amap.api.location.AMapLocationQualityReport r1 = r3.E     // Catch: java.lang.Throwable -> L15
            int r0 = r0.C()     // Catch: java.lang.Throwable -> L15
            r1.setGPSSatellites(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            com.amap.api.col.3l.v5 r1 = r3.f3166e     // Catch: java.lang.Throwable -> L15
            int r1 = r1.A()     // Catch: java.lang.Throwable -> L15
            r0.setGpsStatus(r1)     // Catch: java.lang.Throwable -> L15
        L57:
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L15
            boolean r0 = com.autonavi.aps.amapapi.utils.j.g(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r1 = r3.E     // Catch: java.lang.Throwable -> L15
            r1.setWifiAble(r0)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            android.content.Context r1 = r3.f3163b     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = com.autonavi.aps.amapapi.utils.j.h(r1)     // Catch: java.lang.Throwable -> L15
            r0.setNetworkType(r1)     // Catch: java.lang.Throwable -> L15
            int r0 = r4.getLocationType()     // Catch: java.lang.Throwable -> L15
            r1 = 1
            if (r0 == r1) goto L80
            java.lang.String r0 = "gps"
            java.lang.String r1 = r4.getProvider()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L87
        L80:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            r1 = 0
            r0.setNetUseTime(r1)     // Catch: java.lang.Throwable -> L15
        L87:
            if (r5 == 0) goto L92
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            long r1 = r5.a()     // Catch: java.lang.Throwable -> L15
            r0.setNetUseTime(r1)     // Catch: java.lang.Throwable -> L15
        L92:
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            boolean r1 = com.amap.api.col.p0003l.e2.N     // Catch: java.lang.Throwable -> L15
            r0.setInstallHighDangerMockApp(r1)     // Catch: java.lang.Throwable -> L15
            com.amap.api.location.AMapLocationQualityReport r0 = r3.E     // Catch: java.lang.Throwable -> L15
            r4.setLocationQualityReport(r0)     // Catch: java.lang.Throwable -> L15
            boolean r0 = r3.f3169h     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto Lde
            java.lang.String r0 = r3.J     // Catch: java.lang.Throwable -> Lb1
            r3.v(r4, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r5 == 0) goto Lb3
            long r0 = com.autonavi.aps.amapapi.utils.j.b()     // Catch: java.lang.Throwable -> Lb1
            r5.d(r0)     // Catch: java.lang.Throwable -> Lb1
            goto Lb3
        Lb1:
            r4 = move-exception
            goto Ld7
        Lb3:
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> Lb1
            com.autonavi.aps.amapapi.utils.h.a(r0, r4, r5)     // Catch: java.lang.Throwable -> Lb1
            android.content.Context r5 = r3.f3163b     // Catch: java.lang.Throwable -> Lb1
            com.autonavi.aps.amapapi.utils.h.a(r5, r4)     // Catch: java.lang.Throwable -> Lb1
            com.amap.api.location.AMapLocation r5 = r4.clone()     // Catch: java.lang.Throwable -> Lb1
            r3.a0(r5)     // Catch: java.lang.Throwable -> Lb1
            android.content.Context r5 = r3.f3163b     // Catch: java.lang.Throwable -> Lb1
            com.autonavi.aps.amapapi.utils.g r5 = com.autonavi.aps.amapapi.utils.g.a(r5)     // Catch: java.lang.Throwable -> Lb1
            r5.a(r4)     // Catch: java.lang.Throwable -> Lb1
            android.content.Context r4 = r3.f3163b     // Catch: java.lang.Throwable -> Lb1
            com.autonavi.aps.amapapi.utils.g r4 = com.autonavi.aps.amapapi.utils.g.a(r4)     // Catch: java.lang.Throwable -> Lb1
            r4.b()     // Catch: java.lang.Throwable -> Lb1
            goto Lde
        Ld7:
            java.lang.String r5 = "ALManager"
            java.lang.String r0 = "handlerLocation part2"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L15
        Lde:
            boolean r4 = r3.u     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto Le4
            monitor-exit(r3)
            return
        Le4:
            com.amap.api.location.AMapLocationClientOption r4 = r3.f3164c     // Catch: java.lang.Throwable -> L15
            boolean r4 = r4.isOnceLocation()     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto Lf5
            r3.s0()     // Catch: java.lang.Throwable -> L15
            r4 = 14
            r5 = 0
            r3.f(r4, r5)     // Catch: java.lang.Throwable -> L15
        Lf5:
            monitor-exit(r3)
            return
        Lf7:
            java.lang.String r5 = "ALManager"
            java.lang.String r0 = "handlerLocation part3"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)     // Catch: java.lang.Throwable -> L100
            monitor-exit(r3)
            return
        L100:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L100
            throw r4
    }

    private void u0() {
            r5 = this;
            java.lang.String r0 = "ALManager"
            boolean r1 = com.amap.api.col.p0003l.e2.L     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L5c
            boolean r1 = r5.y     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            boolean r1 = r5.H     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            goto L5c
        L11:
            r1 = move-exception
            goto L6f
        L13:
            boolean r1 = r5.y     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L2f
            boolean r1 = r5.C()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2f
            boolean r1 = r5.G     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L2f
            r5.G = r3     // Catch: java.lang.Throwable -> L27
            r5.w0()     // Catch: java.lang.Throwable -> L27
            goto L2f
        L27:
            r1 = move-exception
            r5.G = r3     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "doLBSLocation reStartService"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r4)     // Catch: java.lang.Throwable -> L11
        L2f:
            boolean r1 = r5.o0()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L63
            r5.G = r2     // Catch: java.lang.Throwable -> L11
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "optBundle"
            com.amap.api.location.AMapLocationClientOption r4 = r5.f3164c     // Catch: java.lang.Throwable -> L11
            android.os.Bundle r4 = com.autonavi.aps.amapapi.utils.b.a(r4)     // Catch: java.lang.Throwable -> L11
            r1.putBundle(r2, r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "d"
            java.lang.String r4 = com.amap.api.location.UmidtokenInfo.getUmidtoken()     // Catch: java.lang.Throwable -> L11
            r1.putString(r2, r4)     // Catch: java.lang.Throwable -> L11
            com.amap.api.col.3l.v5 r2 = r5.f3166e     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2.v()     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L63
            r5.f(r3, r1)     // Catch: java.lang.Throwable -> L11
            goto L63
        L5c:
            com.amap.api.col.p0003l.e2.L = r2     // Catch: java.lang.Throwable -> L11
            r5.H = r3     // Catch: java.lang.Throwable -> L11
            r5.t0()     // Catch: java.lang.Throwable -> L11
        L63:
            com.amap.api.location.AMapLocationClientOption r0 = r5.f3164c     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isOnceLocation()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7d
        L6b:
            r5.v0()     // Catch: java.lang.Throwable -> L7d
            goto L7d
        L6f:
            java.lang.String r2 = "doLBSLocation"
            com.autonavi.aps.amapapi.utils.b.a(r1, r0, r2)     // Catch: java.lang.Throwable -> L7e
            com.amap.api.location.AMapLocationClientOption r0 = r5.f3164c     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isOnceLocation()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7d
            goto L6b
        L7d:
            return
        L7e:
            r0 = move-exception
            com.amap.api.location.AMapLocationClientOption r1 = r5.f3164c     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.isOnceLocation()     // Catch: java.lang.Throwable -> L8a
            if (r1 != 0) goto L8a
            r5.v0()     // Catch: java.lang.Throwable -> L8a
        L8a:
            throw r0
    }

    private void v(com.amap.api.location.AMapLocation r4, java.lang.String r5) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "loc"
            r0.putParcelable(r1, r4)
            java.lang.String r4 = "lastLocNb"
            r0.putString(r4, r5)
            r4 = 1014(0x3f6, float:1.421E-42)
            r1 = 0
            r3.g(r4, r0, r1)
            return
    }

    private void v0() {
            r5 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r5.f3164c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors
            if (r0 == r1) goto L23
            com.amap.api.location.AMapLocationClientOption r0 = r5.f3164c
            long r0 = r0.getInterval()
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            goto L1d
        L17:
            com.amap.api.location.AMapLocationClientOption r0 = r5.f3164c
            long r2 = r0.getInterval()
        L1d:
            r0 = 1016(0x3f8, float:1.424E-42)
            r1 = 0
            r5.g(r0, r1, r2)
        L23:
            return
    }

    private void w0() {
            r2 = this;
            android.os.Messenger r0 = r2.p     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Ld
            android.os.Messenger r0 = new android.os.Messenger     // Catch: java.lang.Throwable -> L14
            com.amap.api.col.3l.e2$f r1 = r2.f3165d     // Catch: java.lang.Throwable -> L14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L14
            r2.p = r0     // Catch: java.lang.Throwable -> L14
        Ld:
            android.content.Intent r0 = r2.x0()     // Catch: java.lang.Throwable -> L14
            r2.i(r0)     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    private android.content.Intent x0() {
            r3 = this;
            android.content.Intent r0 = r3.q
            if (r0 != 0) goto Lf
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r3.f3163b
            java.lang.Class<com.amap.api.location.APSService> r2 = com.amap.api.location.APSService.class
            r0.<init>(r1, r2)
            r3.q = r0
        Lf:
            java.lang.String r0 = com.amap.api.location.AMapLocationClientOption.getAPIKEY()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.String r0 = com.amap.api.location.AMapLocationClientOption.getAPIKEY()     // Catch: java.lang.Throwable -> L1e
            goto L30
        L1e:
            r0 = move-exception
            goto L27
        L20:
            android.content.Context r0 = r3.f3163b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = com.amap.api.col.p0003l.f4.j(r0)     // Catch: java.lang.Throwable -> L1e
            goto L30
        L27:
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "startServiceImpl p2"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            java.lang.String r0 = ""
        L30:
            android.content.Intent r1 = r3.q
            java.lang.String r2 = "a"
            r1.putExtra(r2, r0)
            android.content.Intent r0 = r3.q
            android.content.Context r1 = r3.f3163b
            java.lang.String r1 = com.amap.api.col.p0003l.f4.g(r1)
            java.lang.String r2 = "b"
            r0.putExtra(r2, r1)
            android.content.Intent r0 = r3.q
            java.lang.String r1 = "d"
            java.lang.String r2 = com.amap.api.location.UmidtokenInfo.getUmidtoken()
            r0.putExtra(r1, r2)
            android.content.Intent r0 = r3.q
            return r0
    }

    private static void y(com.autonavi.aps.amapapi.b r2) {
            r2.d()     // Catch: java.lang.Throwable -> L1a
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            com.amap.api.location.AMapLocationClientOption r0 = r0.setNeedAddress(r1)     // Catch: java.lang.Throwable -> L1a
            r2.a(r0)     // Catch: java.lang.Throwable -> L1a
            com.autonavi.aps.amapapi.a r0 = new com.autonavi.aps.amapapi.a     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            r2.a(r1, r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r2 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "apsLocation:doFirstNetLocate 2"
            com.autonavi.aps.amapapi.utils.b.a(r2, r0, r1)
            return
    }

    private void y0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            com.autonavi.aps.amapapi.a r1 = new com.autonavi.aps.amapapi.a     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "#2001"
            r1.f(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "模糊权限下不支持低功耗定位#2001"
            r0.append(r1)     // Catch: java.lang.Throwable -> L31
            r1 = 0
            r2 = 2153(0x869, float:3.017E-42)
            com.autonavi.aps.amapapi.utils.h.a(r1, r2)     // Catch: java.lang.Throwable -> L31
            com.autonavi.aps.amapapi.model.a r1 = new com.autonavi.aps.amapapi.model.a     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L31
            r2 = 20
            r1.setErrorCode(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31
            r1.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L31
            r3.k0(r1)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r0 = move-exception
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "apsLocation:callback"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    private void z(com.autonavi.aps.amapapi.b r2, com.autonavi.aps.amapapi.a r3) {
            r1 = this;
            android.content.Context r0 = r1.f3163b     // Catch: java.lang.Throwable -> Le
            r2.a(r0)     // Catch: java.lang.Throwable -> Le
            com.amap.api.location.AMapLocationClientOption r0 = r1.f3164c     // Catch: java.lang.Throwable -> Le
            r2.a(r0)     // Catch: java.lang.Throwable -> Le
            r2.b(r3)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            java.lang.String r3 = "ALManager"
            java.lang.String r0 = "initApsBase"
            com.autonavi.aps.amapapi.utils.b.a(r2, r3, r0)
            return
    }

    private void z0() {
            r3 = this;
            com.amap.api.col.3l.v5 r0 = r3.f3166e
            com.amap.api.location.AMapLocationClientOption r1 = r3.f3164c
            r0.u(r1)
            com.amap.api.col.3l.t4 r0 = r3.f3167f
            com.amap.api.location.AMapLocationClientOption r1 = r3.f3164c
            r0.q(r1)
            boolean r0 = r3.f3169h
            if (r0 == 0) goto L26
            com.amap.api.location.AMapLocationClientOption r0 = r3.f3164c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r1 = r3.v
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            r3.s0()
            r3.p0()
        L26:
            com.amap.api.location.AMapLocationClientOption r0 = r3.f3164c
            com.amap.api.location.AMapLocationClientOption$AMapLocationMode r0 = r0.getLocationMode()
            r3.v = r0
            com.autonavi.aps.amapapi.utils.h r0 = r3.x
            if (r0 == 0) goto L54
            com.amap.api.location.AMapLocationClientOption r0 = r3.f3164c
            boolean r0 = r0.isOnceLocation()
            if (r0 == 0) goto L43
            com.autonavi.aps.amapapi.utils.h r0 = r3.x
            android.content.Context r1 = r3.f3163b
            r2 = 0
            r0.a(r1, r2)
            goto L4b
        L43:
            com.autonavi.aps.amapapi.utils.h r0 = r3.x
            android.content.Context r1 = r3.f3163b
            r2 = 1
            r0.a(r1, r2)
        L4b:
            com.autonavi.aps.amapapi.utils.h r0 = r3.x
            android.content.Context r1 = r3.f3163b
            com.amap.api.location.AMapLocationClientOption r2 = r3.f3164c
            r0.a(r1, r2)
        L54:
            return
    }

    public final void B(boolean r4) {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "j"
            r0.putBoolean(r1, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 1024(0x400, float:1.435E-42)
            r1 = 0
            r3.g(r4, r0, r1)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "disableBackgroundLocation"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final boolean C() {
            r1 = this;
            boolean r0 = r1.f3168g
            return r0
    }

    public final void G() {
            r4 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r4.A     // Catch: java.lang.Throwable -> L18
            boolean r0 = r0.getCacheCallBack()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L18
            com.amap.api.col.3l.e2$f r0 = r4.f3165d     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L18
            com.amap.api.location.AMapLocationClientOption r1 = r4.A     // Catch: java.lang.Throwable -> L18
            int r1 = r1.getCacheCallBackTime()     // Catch: java.lang.Throwable -> L18
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L18
            r3 = 13
            r0.sendEmptyMessageDelayed(r3, r1)     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = 0
            r1 = 0
            r3 = 1003(0x3eb, float:1.406E-42)
            r4.g(r3, r0, r1)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r0 = move-exception
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "startLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void N(com.amap.api.location.AMapLocationListener r4) {
            r3 = this;
            r0 = 1005(0x3ed, float:1.408E-42)
            r1 = 0
            r3.g(r0, r4, r1)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "unRegisterLocationListener"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final void R() {
            r4 = this;
            r0 = 0
            r1 = 0
            r3 = 1004(0x3ec, float:1.407E-42)
            r4.g(r3, r0, r1)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r0 = move-exception
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "stopLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final void W() {
            r4 = this;
            com.amap.api.col.3l.u6 r0 = r4.B     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            if (r0 == 0) goto Ld
            r0.h()     // Catch: java.lang.Throwable -> Lb
            r4.B = r1     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L18
        Ld:
            r0 = 1011(0x3f3, float:1.417E-42)
            r2 = 0
            r4.g(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r0 = 1
            r4.u = r0     // Catch: java.lang.Throwable -> Lb
            return
        L18:
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "onDestroy"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    public final com.amap.api.location.AMapLocation c0() {
            r4 = this;
            r0 = 0
            com.amap.api.col.3l.u7 r1 = r4.n     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            com.amap.api.location.AMapLocation r0 = r1.d()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            r1 = 3
            r0.setTrustedLevel(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r1 = move-exception
            goto L13
        L12:
            return r0
        L13:
            java.lang.String r2 = "ALManager"
            java.lang.String r3 = "getLastKnownLocation"
            com.autonavi.aps.amapapi.utils.b.a(r1, r2, r3)
            return r0
    }

    public final void e(int r4, android.app.Notification r5) {
            r3 = this;
            if (r4 == 0) goto L44
            if (r5 != 0) goto L5
            goto L44
        L5:
            boolean r0 = r3.m     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            android.os.Messenger r0 = r3.o     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L26
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "optBundle"
            com.amap.api.location.AMapLocationClientOption r2 = r3.f3164c     // Catch: java.lang.Throwable -> L24
            android.os.Bundle r2 = com.autonavi.aps.amapapi.utils.b.a(r2)     // Catch: java.lang.Throwable -> L24
            r0.putBundle(r1, r2)     // Catch: java.lang.Throwable -> L24
            r1 = 0
            r3.f(r1, r0)     // Catch: java.lang.Throwable -> L24
            r3.m = r1     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r4 = move-exception
            goto L3d
        L26:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "i"
            r0.putInt(r1, r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "h"
            r0.putParcelable(r4, r5)     // Catch: java.lang.Throwable -> L24
            r4 = 1023(0x3ff, float:1.434E-42)
            r1 = 0
            r3.g(r4, r0, r1)     // Catch: java.lang.Throwable -> L24
            return
        L3d:
            java.lang.String r5 = "ALManager"
            java.lang.String r0 = "disableBackgroundLocation"
            com.autonavi.aps.amapapi.utils.b.a(r4, r5, r0)
        L44:
            return
    }

    public final void f0() {
            r3 = this;
            com.amap.api.col.3l.u6 r0 = r3.B     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            r0.h()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r3.B = r0     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r0 = move-exception
            goto Le
        Ld:
            return
        Le:
            java.lang.String r1 = "ALManager"
            java.lang.String r2 = "stopAssistantLocation"
            com.autonavi.aps.amapapi.utils.b.a(r0, r1, r2)
            return
    }

    final void i0() {
            r5 = this;
            r0 = 12
            r1 = 0
            r5.f(r0, r1)
            r0 = 1
            r5.f3172k = r0
            r5.l = r0
            r5.m = r0
            r0 = 0
            r5.f3168g = r0
            r5.y = r0
            r5.s0()
            com.autonavi.aps.amapapi.utils.h r2 = r5.x
            if (r2 == 0) goto L1e
            android.content.Context r3 = r5.f3163b
            r2.b(r3)
        L1e:
            android.content.Context r2 = r5.f3163b
            com.autonavi.aps.amapapi.utils.g r2 = com.autonavi.aps.amapapi.utils.g.a(r2)
            r2.a()
            android.content.Context r2 = r5.f3163b
            com.autonavi.aps.amapapi.utils.h.a(r2)
            com.amap.api.col.3l.e3 r2 = r5.z
            if (r2 == 0) goto L3a
            android.os.Handler r2 = r2.s()
            r3 = 11
            r2.sendEmptyMessage(r3)
            goto L43
        L3a:
            android.content.ServiceConnection r2 = r5.D
            if (r2 == 0) goto L43
            android.content.Context r3 = r5.f3163b
            r3.unbindService(r2)
        L43:
            boolean r2 = r5.K     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L52
            android.content.Context r2 = r5.f3163b     // Catch: java.lang.Throwable -> L51
            android.content.Intent r3 = r5.x0()     // Catch: java.lang.Throwable -> L51
            r2.stopService(r3)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
        L52:
            r5.K = r0
            java.util.ArrayList<com.amap.api.location.AMapLocationListener> r2 = r5.f3170i
            if (r2 == 0) goto L5d
            r2.clear()
            r5.f3170i = r1
        L5d:
            r5.D = r1
            r5.l0()
            com.amap.api.col.3l.e2$e r2 = r5.t
            if (r2 == 0) goto L75
            java.lang.Class<android.os.HandlerThread> r3 = android.os.HandlerThread.class
            java.lang.String r4 = "quitSafely"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L70
            com.autonavi.aps.amapapi.utils.f.a(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L70
            goto L75
        L70:
            com.amap.api.col.3l.e2$e r0 = r5.t
            r0.quit()
        L75:
            r5.t = r1
            com.amap.api.col.3l.e2$f r0 = r5.f3165d
            if (r0 == 0) goto L7e
            r0.removeCallbacksAndMessages(r1)
        L7e:
            com.amap.api.col.3l.u7 r0 = r5.n
            if (r0 == 0) goto L87
            r0.e()
            r5.n = r1
        L87:
            return
    }

    public final void m(android.webkit.WebView r3) {
            r2 = this;
            com.amap.api.col.3l.u6 r0 = r2.B
            if (r0 != 0) goto Ld
            com.amap.api.col.3l.u6 r0 = new com.amap.api.col.3l.u6
            android.content.Context r1 = r2.f3163b
            r0.<init>(r1, r3)
            r2.B = r0
        Ld:
            com.amap.api.col.3l.u6 r3 = r2.B
            r3.c()
            return
    }

    public final void w(com.amap.api.location.AMapLocationClientOption r4) {
            r3 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r4.clone()     // Catch: java.lang.Throwable -> L12
            r3.A = r0     // Catch: java.lang.Throwable -> L12
            com.amap.api.location.AMapLocationClientOption r4 = r4.clone()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            r2 = 1018(0x3fa, float:1.427E-42)
            r3.g(r2, r4, r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "setLocationOption"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }

    public final void x(com.amap.api.location.AMapLocationListener r4) {
            r3 = this;
            r0 = 1002(0x3ea, float:1.404E-42)
            r1 = 0
            r3.g(r0, r4, r1)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r4 = move-exception
            java.lang.String r0 = "ALManager"
            java.lang.String r1 = "setLocationListener"
            com.autonavi.aps.amapapi.utils.b.a(r4, r0, r1)
            return
    }
}
