package xyz.adscope.common.v2.crash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ScopeCrashLog extends xyz.adscope.common.a {
    private static final java.lang.String CRASH_AFFILIATE_AMPS = "AdScope-Mediation";
    private static final java.lang.String CRASH_AFFILIATE_ANSP = "AdScope-Adn";
    private static final java.lang.String CRASH_AFFILIATE_FOUNDATION = "AdScope-Foundation";

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "affiliated")
    private java.lang.String mAffiliated;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "exception")
    private java.lang.String mException;
    private final long mTime;

    public ScopeCrashLog(java.lang.String r3, java.lang.String r4, long r5) {
            r2 = this;
            r2.<init>()
            r2.mException = r4
            r0 = 0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 == 0) goto Lc
            goto L10
        Lc:
            long r5 = java.lang.System.currentTimeMillis()
        L10:
            r2.mTime = r5
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L21
            java.lang.String r3 = r2.mException
            java.lang.String r3 = r2.belong(r3)
            r2.mAffiliated = r3
            return
        L21:
            r2.mAffiliated = r3
            return
    }

    private java.lang.String belong(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "xyz.adscope.common"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "AdScope-Foundation"
            return r2
        Lb:
            java.lang.String r0 = "xyz.adscope.ad"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L16
            java.lang.String r2 = "AdScope-Adn"
            return r2
        L16:
            java.lang.String r0 = "xyz.adscope.amps"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L21
            java.lang.String r2 = "AdScope-Mediation"
            return r2
        L21:
            java.lang.String r2 = ""
            return r2
    }
}
