package com.umeng.commonsdk.statistics.noise;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Defcon implements com.umeng.commonsdk.statistics.internal.d {
    private static final int LEVEL_0 = 0;
    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static final long MILLIS_24_HOURS = 86400000;
    private static final long MILLIS_4_HOURS = 14400000;
    private static final long MILLIS_8_HOURS = 28800000;
    private static com.umeng.commonsdk.statistics.noise.Defcon instanse;
    private int mLevel;

    static {
            return
    }

    private Defcon() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLevel = r0
            return
    }

    public static synchronized com.umeng.commonsdk.statistics.noise.Defcon getService(android.content.Context r3) {
            java.lang.Class<com.umeng.commonsdk.statistics.noise.Defcon> r0 = com.umeng.commonsdk.statistics.noise.Defcon.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.noise.Defcon r1 = com.umeng.commonsdk.statistics.noise.Defcon.instanse     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            com.umeng.commonsdk.statistics.noise.Defcon r1 = new com.umeng.commonsdk.statistics.noise.Defcon     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            com.umeng.commonsdk.statistics.noise.Defcon.instanse = r1     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "defcon"
            java.lang.String r2 = "0"
            java.lang.String r3 = com.umeng.commonsdk.framework.UMEnvelopeBuild.imprintProperty(r3, r1, r2)     // Catch: java.lang.Throwable -> L24
            com.umeng.commonsdk.statistics.noise.Defcon r1 = com.umeng.commonsdk.statistics.noise.Defcon.instanse     // Catch: java.lang.Throwable -> L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L24
            r1.setLevel(r3)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L2a
        L26:
            com.umeng.commonsdk.statistics.noise.Defcon r3 = com.umeng.commonsdk.statistics.noise.Defcon.instanse     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r3
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
    }

    public int getLevel() {
            r1 = this;
            int r0 = r1.mLevel
            return r0
    }

    public long getReqInterval() {
            r2 = this;
            int r0 = r2.mLevel
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L12
            r1 = 3
            if (r0 == r1) goto Le
            r0 = 0
            return r0
        Le:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            return r0
        L12:
            r0 = 28800000(0x1b77400, double:1.42290906E-316)
            return r0
        L16:
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            return r0
    }

    public long getRetryInterval() {
            r2 = this;
            int r0 = r2.mLevel
            if (r0 != 0) goto L7
            r0 = 0
            return r0
        L7:
            r0 = 300000(0x493e0, double:1.482197E-318)
            return r0
    }

    public boolean isOpen() {
            r1 = this;
            int r0 = r1.mLevel
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.umeng.commonsdk.statistics.internal.d
    public void onImprintChanged(com.umeng.commonsdk.statistics.idtracking.ImprintHandler.a r3) {
            r2 = this;
            r0 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "defcon"
            java.lang.String r3 = r3.a(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            r2.setLevel(r3)
            return
    }

    public void setLevel(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            r0 = 3
            if (r2 > r0) goto L7
            r1.mLevel = r2
        L7:
            return
    }
}
