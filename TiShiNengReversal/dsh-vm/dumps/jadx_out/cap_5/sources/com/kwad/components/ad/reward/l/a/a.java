package com.kwad.components.ad.reward.l.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.l.a {
    private com.kwad.components.ad.reward.l.a.a.b Bb;
    private final com.kwad.components.ad.reward.l.a.a.C0041a Bc;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.reward.l.a.a$a, reason: collision with other inner class name */
    static class C0041a extends com.kwad.components.ad.reward.l.b {
        public C0041a(int r5) {
                r4 = this;
                r4.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r2[r3] = r0
                java.lang.String r0 = "进阶奖励：浏览详情页 %ss"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                r4.AZ = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r5
                java.lang.String r5 = java.lang.String.format(r0, r1)
                r4.Ba = r5
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.kwad.components.ad.reward.l.b {
        public b() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "基础奖励：观看视频"
                r1.AZ = r0
                java.lang.String r0 = "基础奖励：需再观看%ss视频"
                r1.Ba = r0
                return
        }
    }

    public a() {
            r2 = this;
            r2.<init>()
            com.kwad.components.ad.reward.l.a.a$b r0 = new com.kwad.components.ad.reward.l.a.a$b
            r0.<init>()
            r2.Bb = r0
            com.kwad.components.ad.reward.l.a.a$a r0 = new com.kwad.components.ad.reward.l.a.a$a
            int r1 = com.kwad.sdk.core.config.e.FC()
            r0.<init>(r1)
            r2.Bc = r0
            return
    }

    private void kM() {
            r1 = this;
            com.kwad.components.ad.reward.l.a.a$a r0 = r1.Bc
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto Lc
            r1.kC()
            return
        Lc:
            r1.kD()
            return
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.components.ad.reward.l.c
    public final boolean isCompleted() {
            r1 = this;
            com.kwad.components.ad.reward.l.a.a$a r0 = r1.Bc
            boolean r0 = r0.isCompleted()
            return r0
    }

    @Override // com.kwad.components.ad.reward.l.a
    public final java.util.List<com.kwad.components.ad.reward.l.c> kA() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.components.ad.reward.l.a.a$b r1 = r2.Bb
            r0.add(r1)
            com.kwad.components.ad.reward.l.a.a$a r1 = r2.Bc
            r0.add(r1)
            return r0
    }

    @Override // com.kwad.components.ad.reward.l.a
    public final int kB() {
            r3 = this;
            java.util.List r0 = r3.kA()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()
            com.kwad.components.ad.reward.l.c r2 = (com.kwad.components.ad.reward.l.c) r2
            boolean r2 = r2.isCompleted()
            if (r2 != 0) goto L9
            int r1 = r1 + 1
            goto L9
        L1e:
            return r1
    }

    public final void kK() {
            r2 = this;
            java.lang.String r0 = "LandPageOpenTask"
            java.lang.String r1 = "markWatchVideoCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.a.a$b r0 = r2.Bb
            r0.kC()
            r2.kM()
            return
    }

    public final boolean kL() {
            r1 = this;
            com.kwad.components.ad.reward.l.a.a$b r0 = r1.Bb
            boolean r0 = r0.isCompleted()
            return r0
    }

    public final void markOpenNsCompleted() {
            r2 = this;
            java.lang.String r0 = "LandPageOpenTask"
            java.lang.String r1 = "markOpenNsCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.a.a$a r0 = r2.Bc
            r0.kC()
            r2.kM()
            return
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.sdk.core.b
    public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "mWatchVideoTask"
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> L16
            com.kwad.components.ad.reward.l.a.a$b r1 = r2.Bb     // Catch: java.lang.Throwable -> L16
            r1.parseJson(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "mOpenNsTask"
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> L16
            com.kwad.components.ad.reward.l.a.a$a r0 = r2.Bc     // Catch: java.lang.Throwable -> L16
            r0.parseJson(r3)     // Catch: java.lang.Throwable -> L16
        L16:
            return
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.sdk.core.b
    public final org.json.JSONObject toJson() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "mWatchVideoTask"
            com.kwad.components.ad.reward.l.a.a$b r2 = r3.Bb
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            java.lang.String r1 = "mOpenNsTask"
            com.kwad.components.ad.reward.l.a.a$a r2 = r3.Bc
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            return r0
    }
}
