package com.bytedance.msdk.core.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g extends com.bytedance.msdk.core.tl.r {
    private java.lang.String ae;

    /* renamed from: m, reason: collision with root package name */
    private long f2258m;
    private long tl;

    public g(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
            r2 = 0
            r1.tl = r2
            r1.f2258m = r2
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Exception -> L10
            r1.f2258m = r2     // Catch: java.lang.Exception -> L10
        L10:
            r1.ae = r7
            return
    }

    public g(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r0
            r2 = 0
            r1.tl = r2
            long r2 = java.lang.Long.parseLong(r8)     // Catch: java.lang.Exception -> Le
            r1.tl = r2     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    public long g() {
            r2 = this;
            long r0 = r2.f2258m
            return r0
    }

    public void j(long r1) {
            r0 = this;
            r0.tl = r1
            return
    }

    public java.lang.String oq() {
            r1 = this;
            java.lang.String r0 = r1.ae
            return r0
    }

    public long qv() {
            r2 = this;
            long r0 = r2.tl
            return r0
    }

    @Override // com.bytedance.msdk.core.tl.r
    public boolean tl() {
            r5 = this;
            java.lang.String r0 = r5.ae
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            long r0 = r5.f2258m
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.core.tl.r
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BaseIntervalBean{waterfallId='"
            r0.<init>(r1)
            java.lang.String r1 = r5.j
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", showRulesVersion='"
            r0.append(r2)
            java.lang.String r2 = r5.cw
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", timingMode="
            r0.append(r2)
            int r2 = r5.up
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r3 = "IntervalPacingBean{pacing="
            r0.append(r3)
            long r3 = r5.f2258m
            r0.append(r3)
            java.lang.String r3 = ", pacingRuleId='"
            r0.append(r3)
            java.lang.String r3 = r5.ae
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", effectiveTime="
            r0.append(r1)
            long r3 = r5.tl
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean vl() {
            r5 = this;
            long r0 = r5.tl
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
