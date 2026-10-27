package com.kwad.components.ad.reward.l.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a extends com.kwad.components.ad.reward.l.a {
    private com.kwad.components.ad.reward.l.b.a.c Bd;
    private com.kwad.components.ad.reward.l.b.a.C0042a Be;
    private final com.kwad.components.ad.reward.l.b.a.b Bf;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.reward.l.b.a$a, reason: collision with other inner class name */
    static class C0042a extends com.kwad.components.ad.reward.l.b {
        public C0042a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "安装应用"
                r1.AZ = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b extends com.kwad.components.ad.reward.l.b {
        public b(int r5) {
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
                java.lang.String r0 = "进阶奖励：安装并激活APP %ss"
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
    static class c extends com.kwad.components.ad.reward.l.b {
        public c() {
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
            com.kwad.components.ad.reward.l.b.a$c r0 = new com.kwad.components.ad.reward.l.b.a$c
            r0.<init>()
            r2.Bd = r0
            com.kwad.components.ad.reward.l.b.a$a r0 = new com.kwad.components.ad.reward.l.b.a$a
            r0.<init>()
            r2.Be = r0
            com.kwad.components.ad.reward.l.b.a$b r0 = new com.kwad.components.ad.reward.l.b.a$b
            int r1 = com.kwad.components.ad.reward.a.b.hB()
            r0.<init>(r1)
            r2.Bf = r0
            return
    }

    public static void a(com.kwad.components.ad.reward.l.b.a r0, android.content.Context r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
            com.kwad.sdk.core.response.model.AdInfo r2 = com.kwad.sdk.core.response.b.e.el(r2)
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.ay(r2)
            boolean r1 = com.kwad.sdk.utils.as.aq(r1, r2)
            if (r1 == 0) goto L12
            r0.kN()
            return
        L12:
            r0.kO()
            return
    }

    private void kM() {
            r1 = this;
            com.kwad.components.ad.reward.l.b.a$c r0 = r1.Bd
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L1c
            com.kwad.components.ad.reward.l.b.a$a r0 = r1.Be
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L1c
            com.kwad.components.ad.reward.l.b.a$b r0 = r1.Bf
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L1c
            r1.kC()
            return
        L1c:
            r1.kD()
            return
    }

    private void kO() {
            r2 = this;
            java.lang.String r0 = "LaunchAppTask"
            java.lang.String r1 = "markInstallUncompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.b.a$a r0 = r2.Be
            r0.kD()
            r2.kM()
            return
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.components.ad.reward.l.c
    public final boolean isCompleted() {
            r1 = this;
            com.kwad.components.ad.reward.l.b.a$a r0 = r1.Be
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L12
            com.kwad.components.ad.reward.l.b.a$b r0 = r1.Bf
            boolean r0 = r0.isCompleted()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    @Override // com.kwad.components.ad.reward.l.a
    public final java.util.List<com.kwad.components.ad.reward.l.c> kA() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.kwad.components.ad.reward.l.b.a$c r1 = r2.Bd
            r0.add(r1)
            com.kwad.components.ad.reward.l.b.a$b r1 = r2.Bf
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
            java.lang.String r0 = "LaunchAppTask"
            java.lang.String r1 = "markWatchVideoCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.b.a$c r0 = r2.Bd
            r0.kC()
            r2.kM()
            return
    }

    public final boolean kL() {
            r1 = this;
            com.kwad.components.ad.reward.l.b.a$c r0 = r1.Bd
            boolean r0 = r0.isCompleted()
            return r0
    }

    public final void kN() {
            r2 = this;
            java.lang.String r0 = "LaunchAppTask"
            java.lang.String r1 = "markInstallCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.b.a$a r0 = r2.Be
            r0.kC()
            r2.kM()
            return
    }

    public final void kP() {
            r2 = this;
            java.lang.String r0 = "LaunchAppTask"
            java.lang.String r1 = "markUseAppCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.b.a$b r0 = r2.Bf
            r0.kC()
            r2.kM()
            return
    }

    public final boolean kQ() {
            r2 = this;
            java.lang.String r0 = "LaunchAppTask"
            java.lang.String r1 = "isInstallCompleted"
            com.kwad.sdk.core.d.c.d(r0, r1)
            com.kwad.components.ad.reward.l.b.a$a r0 = r2.Be
            boolean r0 = r0.isCompleted()
            return r0
    }

    @Override // com.kwad.components.ad.reward.l.b, com.kwad.sdk.core.b
    public final void parseJson(@androidx.annotation.Nullable org.json.JSONObject r3) {
            r2 = this;
            java.lang.String r0 = "mWatchVideoTask"
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> L16
            com.kwad.components.ad.reward.l.b.a$c r1 = r2.Bd     // Catch: java.lang.Throwable -> L16
            r1.parseJson(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = "mUseAppTask"
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch: java.lang.Throwable -> L16
            com.kwad.components.ad.reward.l.b.a$b r0 = r2.Bf     // Catch: java.lang.Throwable -> L16
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
            com.kwad.components.ad.reward.l.b.a$c r2 = r3.Bd
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            java.lang.String r1 = "mInstallAppTask"
            com.kwad.components.ad.reward.l.b.a$a r2 = r3.Be
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            java.lang.String r1 = "mUseAppTask"
            com.kwad.components.ad.reward.l.b.a$b r2 = r3.Bf
            com.kwad.sdk.utils.aa.a(r0, r1, r2)
            return r0
    }
}
