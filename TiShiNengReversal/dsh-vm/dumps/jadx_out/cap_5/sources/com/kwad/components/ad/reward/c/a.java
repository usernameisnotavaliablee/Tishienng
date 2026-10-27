package com.kwad.components.ad.reward.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static volatile com.kwad.components.ad.reward.c.a uf;
    private com.kwad.components.ad.reward.g tm;

    @androidx.annotation.Nullable
    private com.kwad.components.ad.reward.c.b ug;
    private volatile boolean uh;
    private volatile boolean ui;
    private java.util.List<java.lang.ref.WeakReference<com.kwad.components.core.webview.jshandler.j>> uj;

    private a() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.uh = r0
            r1.ui = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.uj = r0
            return
    }

    public static com.kwad.components.ad.reward.c.a hV() {
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.uf
            if (r0 != 0) goto L19
            java.lang.Class<com.kwad.components.ad.reward.c.a> r0 = com.kwad.components.ad.reward.c.a.class
            monitor-enter(r0)
            com.kwad.components.ad.reward.c.a r1 = com.kwad.components.ad.reward.c.a.uf     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.kwad.components.ad.reward.c.a r1 = new com.kwad.components.ad.reward.c.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.kwad.components.ad.reward.c.a.uf = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.kwad.components.ad.reward.c.a r0 = com.kwad.components.ad.reward.c.a.uf
            return r0
    }

    private synchronized boolean hX() {
            r2 = this;
            monitor-enter(r2)
            com.kwad.components.ad.reward.c.b r0 = r2.ug     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            int r0 = r0.un     // Catch: java.lang.Throwable -> Le
            int r1 = com.kwad.components.ad.reward.c.b.uk     // Catch: java.lang.Throwable -> Le
            if (r0 != r1) goto L10
            monitor-exit(r2)
            r0 = 1
            return r0
        Le:
            r0 = move-exception
            goto L13
        L10:
            monitor-exit(r2)
            r0 = 0
            return r0
        L13:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    private boolean isNeoScan() {
            r2 = this;
            com.kwad.components.ad.reward.g r0 = r2.tm
            com.kwad.sdk.core.response.model.AdResultData r0 = r0.mAdResultData
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r0 = r0.adGlobalConfigInfo
            if (r0 == 0) goto Le
            int r0 = r0.neoPageType
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    public final void R(android.content.Context r4) {
            r3 = this;
            boolean r0 = r3.hX()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkStatusAndToast isCurrentHadExtra: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = ", hadToast: "
            r1.append(r2)
            boolean r2 = r3.ui
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CurrentExtraRewardHolder"
            com.kwad.sdk.core.d.c.d(r2, r1)
            boolean r1 = r3.ui
            if (r1 != 0) goto L2f
            if (r0 == 0) goto L2f
            r0 = 1
            r3.ui = r0
            java.lang.String r0 = "恭喜获得第2份奖励"
            com.kwad.sdk.utils.ac.Q(r4, r0)
        L2f:
            return
    }

    public final void a(com.kwad.components.core.webview.jshandler.j r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "addGetNativeHandler: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CurrentExtraRewardHolder"
            com.kwad.sdk.core.d.c.d(r1, r0)
            if (r3 == 0) goto L1f
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.core.webview.jshandler.j>> r0 = r2.uj
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
        L1f:
            return
    }

    public final synchronized void a(com.kwad.sdk.core.response.model.AdTemplate r5, com.kwad.components.ad.reward.c.b r6) {
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            java.lang.String r0 = "CurrentExtraRewardHolder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = "updateExtraReward: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r2 = r6.toJson()     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44
            r1.append(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L44
            r4.ug = r6     // Catch: java.lang.Throwable -> L44
            int r6 = r6.un     // Catch: java.lang.Throwable -> L44
            int r0 = com.kwad.components.ad.reward.c.b.uk     // Catch: java.lang.Throwable -> L44
            if (r6 != r0) goto L46
            boolean r6 = r4.uh     // Catch: java.lang.Throwable -> L44
            if (r6 != 0) goto L46
            r6 = 1
            r4.uh = r6     // Catch: java.lang.Throwable -> L44
            com.kwad.components.ad.reward.c.b r6 = r4.ug     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r5.getUniqueId()     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.api.KsRewardVideoAd$RewardAdInteractionListener r0 = com.kwad.components.ad.reward.e.f.N(r0)     // Catch: java.lang.Throwable -> L44
            com.kwad.components.ad.reward.c.c.a(r6, r0)     // Catch: java.lang.Throwable -> L44
            boolean r6 = r4.isNeoScan()     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.adlog.c.j(r5, r6)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r5 = move-exception
            goto L8f
        L46:
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.core.webview.jshandler.j>> r5 = r4.uj     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L44
        L4c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r6.get()     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L64
            java.util.List<java.lang.ref.WeakReference<com.kwad.components.core.webview.jshandler.j>> r0 = r4.uj     // Catch: java.lang.Throwable -> L44
            r0.remove(r6)     // Catch: java.lang.Throwable -> L44
            goto L4c
        L64:
            com.kwad.components.ad.reward.c.b r0 = r4.hW()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "CurrentExtraRewardHolder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "GetNativeDataHandler callback: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r3 = r0.toJson()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            r2.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44
            com.kwad.sdk.core.d.c.d(r1, r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L44
            com.kwad.components.core.webview.jshandler.j r6 = (com.kwad.components.core.webview.jshandler.j) r6     // Catch: java.lang.Throwable -> L44
            r6.a(r0)     // Catch: java.lang.Throwable -> L44
            goto L4c
        L8d:
            monitor-exit(r4)
            return
        L8f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L44
            throw r5
    }

    public final synchronized void c(com.kwad.sdk.core.response.model.AdTemplate r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "CurrentExtraRewardHolder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "updateExtraReward: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            r1.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2b
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.g r0 = r3.tm     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            boolean r0 = r0.gW()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            int r0 = com.kwad.components.ad.reward.c.b.STATUS_NONE     // Catch: java.lang.Throwable -> L2b
            if (r5 != r0) goto L2d
            java.lang.String r4 = "CurrentExtraRewardHolder"
            java.lang.String r5 = "updateExtraReward: cant update to status 2"
            com.kwad.sdk.core.d.c.d(r4, r5)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r3)
            return
        L2b:
            r4 = move-exception
            goto L41
        L2d:
            com.kwad.components.ad.reward.c.a r0 = hV()     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.c.b r0 = r0.hW()     // Catch: java.lang.Throwable -> L2b
            r0.aa(r5)     // Catch: java.lang.Throwable -> L2b
            com.kwad.components.ad.reward.c.a r5 = hV()     // Catch: java.lang.Throwable -> L2b
            r5.a(r4, r0)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r3)
            return
        L41:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r4
    }

    @androidx.annotation.NonNull
    public final synchronized com.kwad.components.ad.reward.c.b hW() {
            r3 = this;
            monitor-enter(r3)
            com.kwad.components.ad.reward.c.b r0 = r3.ug     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            com.kwad.components.ad.reward.c.b r0 = com.kwad.components.ad.reward.c.c.hZ()     // Catch: java.lang.Throwable -> Lf
            r3.ug = r0     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            r0.un = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r0 = move-exception
            goto L2c
        L11:
            java.lang.String r0 = "CurrentExtraRewardHolder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = "getCurrentExtraReward: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.kwad.components.ad.reward.c.b r2 = r3.ug     // Catch: java.lang.Throwable -> Lf
            int r2 = r2.un     // Catch: java.lang.Throwable -> Lf
            r1.append(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lf
            com.kwad.sdk.core.d.c.d(r0, r1)     // Catch: java.lang.Throwable -> Lf
            com.kwad.components.ad.reward.c.b r0 = r3.ug     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r0
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    public final synchronized void reset() {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.ug = r0     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r2.ui = r1     // Catch: java.lang.Throwable -> Ld
            r2.uh = r1     // Catch: java.lang.Throwable -> Ld
            r2.tm = r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final void setCallerContext(com.kwad.components.ad.reward.g r1) {
            r0 = this;
            r0.tm = r1
            return
    }
}
