package com.umeng.commonsdk.statistics.noise;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ImLatent implements com.umeng.commonsdk.statistics.internal.d {
    private static com.umeng.commonsdk.statistics.noise.ImLatent instanse;
    private final int LATENT_MAX;
    private final int LATENT_WINDOW;
    private final long _360HOURS_IN_MS;
    private final long _36HOURS_IN_MS;
    private final int _DEFAULT_HOURS;
    private final int _DEFAULT_MAX_LATENT;
    private final int _DEFAULT_MIN_HOURS;
    private final int _DEFAULT_MIN_LATENT;
    private final long _ONE_HOURS_IN_MS;
    private android.content.Context context;
    private long latentHour;
    private int latentWindow;
    private long mDelay;
    private long mElapsed;
    private boolean mLatentActivite;
    private java.lang.Object mLatentLock;
    private com.umeng.commonsdk.statistics.internal.StatTracer statTracer;
    private com.umeng.commonsdk.statistics.common.d storeHelper;

    static {
            return
    }

    private ImLatent(android.content.Context r5, com.umeng.commonsdk.statistics.internal.StatTracer r6) {
            r4 = this;
            r4.<init>()
            r0 = 360(0x168, float:5.04E-43)
            r4._DEFAULT_HOURS = r0
            r0 = 36
            r4._DEFAULT_MIN_HOURS = r0
            r0 = 1
            r4._DEFAULT_MIN_LATENT = r0
            r0 = 1800(0x708, float:2.522E-42)
            r4._DEFAULT_MAX_LATENT = r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            r4._ONE_HOURS_IN_MS = r0
            r0 = 1296000000(0x4d3f6400, double:6.40309077E-315)
            r4._360HOURS_IN_MS = r0
            r2 = 129600000(0x7b98a00, double:6.40309077E-316)
            r4._36HOURS_IN_MS = r2
            r2 = 1800000(0x1b7740, float:2.522337E-39)
            r4.LATENT_MAX = r2
            r2 = 10
            r4.LATENT_WINDOW = r2
            r4.latentHour = r0
            r4.latentWindow = r2
            r0 = 0
            r4.mDelay = r0
            r4.mElapsed = r0
            r0 = 0
            r4.mLatentActivite = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mLatentLock = r0
            r4.context = r5
            com.umeng.commonsdk.statistics.common.d r5 = com.umeng.commonsdk.statistics.common.d.a(r5)
            r4.storeHelper = r5
            r4.statTracer = r6
            return
    }

    public static synchronized com.umeng.commonsdk.statistics.noise.ImLatent getService(android.content.Context r2, com.umeng.commonsdk.statistics.internal.StatTracer r3) {
            java.lang.Class<com.umeng.commonsdk.statistics.noise.ImLatent> r0 = com.umeng.commonsdk.statistics.noise.ImLatent.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.noise.ImLatent r1 = com.umeng.commonsdk.statistics.noise.ImLatent.instanse     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            com.umeng.commonsdk.statistics.noise.ImLatent r1 = new com.umeng.commonsdk.statistics.noise.ImLatent     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.statistics.noise.ImLatent.instanse = r1     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler r2 = com.umeng.commonsdk.statistics.idtracking.ImprintHandler.getImprintService(r2)     // Catch: java.lang.Throwable -> L1a
            com.umeng.commonsdk.statistics.idtracking.ImprintHandler$a r2 = r2.c()     // Catch: java.lang.Throwable -> L1a
            r1.onImprintChanged(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L20
        L1c:
            com.umeng.commonsdk.statistics.noise.ImLatent r2 = com.umeng.commonsdk.statistics.noise.ImLatent.instanse     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r2
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }

    public long getDelayTime() {
            r3 = this;
            java.lang.Object r0 = r3.mLatentLock
            monitor-enter(r0)
            long r1 = r3.mDelay     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public long getElapsedTime() {
            r2 = this;
            long r0 = r2.mElapsed
            return r0
    }

    public boolean isLatentActivite() {
            r2 = this;
            java.lang.Object r0 = r2.mLatentLock
            monitor-enter(r0)
            boolean r1 = r2.mLatentActivite     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public void latentDeactivite() {
            r2 = this;
            java.lang.Object r0 = r2.mLatentLock
            monitor-enter(r0)
            r1 = 0
            r2.mLatentActivite = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a r5) {
            r4 = this;
            r0 = 360(0x168, float:5.04E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "latent_hours"
            java.lang.String r1 = r5.a(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r2 = 36
            if (r1 > r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            long r0 = (long) r0
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 * r2
            r4.latentHour = r0
            java.lang.String r0 = "latent"
            java.lang.String r1 = "0"
            java.lang.String r5 = r5.a(r0, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            r0 = 1
            if (r5 < r0) goto L39
            r0 = 1800(0x708, float:2.522E-42)
            if (r5 <= r0) goto L3a
        L39:
            r5 = 0
        L3a:
            if (r5 != 0) goto L4e
            int r5 = com.umeng.commonsdk.statistics.a.c
            if (r5 <= 0) goto L49
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            if (r5 <= r0) goto L46
            goto L49
        L46:
            r4.latentWindow = r5
            return
        L49:
            r5 = 10
            r4.latentWindow = r5
            return
        L4e:
            r4.latentWindow = r5
            return
    }

    public boolean shouldStartLatency() {
            r8 = this;
            com.umeng.commonsdk.statistics.common.d r0 = r8.storeHelper
            boolean r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            com.umeng.commonsdk.statistics.internal.StatTracer r0 = r8.statTracer
            boolean r0 = r0.isFirstRequest()
            if (r0 == 0) goto L13
            return r1
        L13:
            java.lang.Object r0 = r8.mLatentLock
            monitor-enter(r0)
            boolean r2 = r8.mLatentActivite     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            goto L64
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            com.umeng.commonsdk.statistics.internal.StatTracer r0 = r8.statTracer
            long r2 = r0.getLastReqTime()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            long r2 = r8.latentHour
            r0 = 1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4c
            android.content.Context r1 = r8.context
            java.lang.String r1 = com.umeng.commonsdk.statistics.idtracking.Envelope.getSignature(r1)
            java.lang.Object r2 = r8.mLatentLock
            monitor-enter(r2)
            int r3 = r8.latentWindow     // Catch: java.lang.Throwable -> L49
            int r1 = com.umeng.commonsdk.statistics.common.DataHelper.random(r3, r1)     // Catch: java.lang.Throwable -> L49
            long r6 = (long) r1     // Catch: java.lang.Throwable -> L49
            r8.mDelay = r6     // Catch: java.lang.Throwable -> L49
            r8.mElapsed = r4     // Catch: java.lang.Throwable -> L49
            r8.mLatentActivite = r0     // Catch: java.lang.Throwable -> L49
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            return r0
        L49:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L49
            throw r0
        L4c:
            r2 = 129600000(0x7b98a00, double:6.40309077E-316)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L63
            java.lang.Object r2 = r8.mLatentLock
            monitor-enter(r2)
            r6 = 0
            r8.mDelay = r6     // Catch: java.lang.Throwable -> L60
            r8.mElapsed = r4     // Catch: java.lang.Throwable -> L60
            r8.mLatentActivite = r0     // Catch: java.lang.Throwable -> L60
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            return r0
        L60:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L60
            throw r0
        L63:
            return r1
        L64:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }
}
