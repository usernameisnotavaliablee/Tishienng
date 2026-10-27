package com.kwad.components.core.l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.ksad.json.annotation.KsJson
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a extends com.kwad.sdk.core.response.a.a implements com.kwad.sdk.core.b {
    private static java.text.SimpleDateFormat Rq;
    public int Rr;
    public long Rs;

    static {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            com.kwad.components.core.l.a.Rq = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean k(int r13, int r14) {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkAndAddCount forceActiveIntervalHour: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = ", forceActiveThreshold: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdForceActiveInfo"
            com.kwad.sdk.core.d.c.d(r1, r0)
            long r2 = r12.Rs
            r4 = 0
            r0 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L97
            long r2 = java.lang.System.currentTimeMillis()
            java.text.SimpleDateFormat r4 = com.kwad.components.core.l.a.Rq
            java.util.Date r5 = new java.util.Date
            long r6 = r12.Rs
            r5.<init>(r6)
            java.lang.String r4 = r4.format(r5)
            java.text.SimpleDateFormat r5 = com.kwad.components.core.l.a.Rq
            java.util.Date r6 = new java.util.Date
            r6.<init>(r2)
            java.lang.String r5 = r5.format(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "checkAndAddCount lastDate: "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r7 = ", currentDate: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.kwad.sdk.core.d.c.d(r1, r6)
            boolean r4 = r4.equals(r5)
            r5 = 0
            if (r4 != 0) goto L66
            r12.Rr = r5
            r12.qr()
            return r0
        L66:
            long r6 = r12.Rs
            long r8 = (long) r13
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 * r10
            long r6 = r6 + r8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r4 = "checkAndAddCount minTimestamp: "
            r13.<init>(r4)
            r13.append(r6)
            java.lang.String r4 = ", currentActiveCount: "
            r13.append(r4)
            int r4 = r12.Rr
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.kwad.sdk.core.d.c.d(r1, r13)
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 >= 0) goto L96
            int r13 = r12.Rr
            if (r13 > r14) goto L96
            r12.qr()
            return r0
        L96:
            return r5
        L97:
            r12.qr()
            return r0
    }

    public final void qr() {
            r3 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r3.Rs = r0
            int r0 = r3.Rr
            int r0 = r0 + 1
            r3.Rr = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "doAddCount, lastForceActiveTimestamp: "
            r0.<init>(r1)
            long r1 = r3.Rs
            r0.append(r1)
            java.lang.String r1 = ", currentActiveCount "
            r0.append(r1)
            int r1 = r3.Rr
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdForceActiveInfo"
            com.kwad.sdk.core.d.c.d(r1, r0)
            return
    }
}
