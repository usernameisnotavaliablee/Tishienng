package com.kwad.components.ad.feed;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.ad.feed.e$2, reason: invalid class name */
    final class AnonymousClass2 extends com.kwad.components.core.request.d {
        final /* synthetic */ com.kwad.sdk.internal.api.SceneImpl bX;
        final /* synthetic */ com.kwad.sdk.api.KsLoadManager.FeedAdListener hh;
        final /* synthetic */ boolean hi;
        final /* synthetic */ long hj;




        AnonymousClass2(com.kwad.sdk.api.KsLoadManager.FeedAdListener r1, com.kwad.sdk.internal.api.SceneImpl r2, boolean r3, long r4) {
                r0 = this;
                r0.hh = r1
                r0.bX = r2
                r0.hi = r3
                r0.hj = r4
                r0.<init>()
                return
        }

        @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.l
        public final void b(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdResultData r12) {
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r1 = r12.getAdTemplateList()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "loadFeedAd onSuccess:"
                r2.<init>(r3)
                int r4 = r1.size()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "KsAdFeedLoadManager"
                com.kwad.sdk.core.d.c.d(r4, r2)
                boolean r2 = r1.isEmpty()
                if (r2 == 0) goto L29
                com.kwad.components.ad.feed.monitor.b.ch()
            L29:
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            L2e:
                boolean r5 = r1.hasNext()
                r6 = 1
                if (r5 == 0) goto L9f
                java.lang.Object r5 = r1.next()
                com.kwad.sdk.core.response.model.AdTemplate r5 = (com.kwad.sdk.core.response.model.AdTemplate) r5
                if (r5 == 0) goto L2e
                com.kwad.sdk.core.response.model.AdInfo r7 = com.kwad.sdk.core.response.b.e.el(r5)
                boolean r8 = com.kwad.components.model.FeedType.checkTypeValid(r5)
                if (r8 != 0) goto L6f
                int r2 = com.kwad.sdk.core.response.b.a.be(r7)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r8 = r5.type
                int r9 = r5.defaultType
                com.kwad.components.model.FeedType r8 = com.kwad.components.model.FeedType.fromInt(r8, r9)
                r9 = 2
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r10 = 0
                r9[r10] = r2
                r9[r6] = r8
                java.lang.String r2 = "(模板不匹配materialType:%s_feedType:%s)"
                java.lang.String r2 = java.lang.String.format(r2, r9)
                int r6 = com.kwad.sdk.core.response.b.a.be(r7)
                int r7 = r5.type
                com.kwad.components.ad.feed.monitor.b.b(r6, r7, r5)
                goto L2e
            L6f:
                com.kwad.sdk.internal.api.SceneImpl r6 = r11.bX
                r5.mAdScene = r6
                java.lang.String r6 = com.kwad.sdk.core.response.b.a.K(r7)
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 != 0) goto L90
                android.util.Pair r6 = com.kwad.components.ad.feed.monitor.a.m(r5)
                java.lang.Object r7 = r6.first
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                java.lang.Object r6 = r6.second
                java.lang.String r6 = (java.lang.String) r6
                com.kwad.components.ad.feed.monitor.b.f(r7, r6)
            L90:
                com.kwad.sdk.core.response.model.AdResultData r5 = com.kwad.sdk.core.response.b.c.a(r12, r5)
                com.kwad.components.ad.feed.c r6 = new com.kwad.components.ad.feed.c
                boolean r7 = r11.hi
                r6.<init>(r5, r7)
                r0.add(r6)
                goto L2e
            L9f:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>(r3)
                int r1 = r0.size()
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                com.kwad.sdk.core.d.c.d(r4, r12)
                int r12 = r0.size()
                com.kwad.components.ad.feed.monitor.b.C(r12)
                boolean r12 = r0.isEmpty()
                if (r12 == 0) goto Lf9
                com.kwad.sdk.core.network.e r12 = com.kwad.sdk.core.network.e.aEq
                int r12 = r12.errorCode
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEq
                java.lang.String r1 = r1.msg
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.kwad.components.ad.feed.monitor.b.e(r12, r0)
                com.kwad.sdk.core.network.e r12 = com.kwad.sdk.core.network.e.aEq
                int r12 = r12.errorCode
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.kwad.sdk.core.network.e r1 = com.kwad.sdk.core.network.e.aEq
                java.lang.String r1 = r1.msg
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r11.onError(r12, r0)
                java.lang.String r12 = "loadFeedAd onError"
                com.kwad.sdk.core.d.c.d(r4, r12)
                return
            Lf9:
                com.kwad.sdk.internal.api.SceneImpl r12 = r11.bX
                int r1 = r0.size()
                com.kwad.sdk.commercial.d.d.a(r12, r1)
                boolean r12 = com.kwad.sdk.core.config.e.ES()
                if (r12 == 0) goto L12b
                com.kwad.sdk.l r12 = com.kwad.sdk.l.Cf()
                boolean r12 = r12.Bk()
                if (r12 == 0) goto L122
                com.kwad.sdk.l r12 = com.kwad.sdk.l.Cf()
                boolean r12 = r12.Bk()
                if (r12 == 0) goto L12b
                int r12 = com.kwad.sdk.core.config.e.ET()
                if (r12 != r6) goto L12b
            L122:
                com.kwad.components.ad.feed.e$2$2 r12 = new com.kwad.components.ad.feed.e$2$2
                r12.<init>(r11, r0)
                com.kwad.sdk.utils.bw.runOnUiThread(r12)
                return
            L12b:
                com.kwad.components.ad.feed.e$2$3 r12 = new com.kwad.components.ad.feed.e$2$3
                r12.<init>(r11, r0)
                com.kwad.sdk.utils.bw.runOnUiThread(r12)
                return
        }

        @Override // com.kwad.components.core.request.d, com.kwad.components.core.request.l
        public final void onError(int r5, java.lang.String r6) {
                r4 = this;
                com.kwad.components.ad.feed.e$2$1 r0 = new com.kwad.components.ad.feed.e$2$1
                r0.<init>(r4, r5, r6)
                com.kwad.sdk.utils.bw.runOnUiThread(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "loadFeedAd onError:"
                r0.<init>(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r6
                java.lang.String r1 = "code:%s__msg:%s"
                java.lang.String r1 = java.lang.String.format(r1, r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "KsAdFeedLoadManager"
                com.kwad.sdk.core.d.c.d(r1, r0)
                com.kwad.components.ad.feed.monitor.b.e(r5, r6)
                com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEl
                int r0 = r0.errorCode
                if (r5 == r0) goto L40
                com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEq
                int r0 = r0.errorCode
                if (r5 == r0) goto L40
                com.kwad.components.ad.feed.monitor.b.g(r5, r6)
            L40:
                return
        }
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwad.sdk.api.KsScene r7, @androidx.annotation.NonNull com.kwad.sdk.api.KsLoadManager.FeedAdListener r8, boolean r9) {
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.Bn()
            if (r0 != 0) goto L1a
            java.lang.String r7 = "KsAdFeedLoadManager"
            java.lang.String r9 = "loadConfigFeedAd please init sdk first"
            com.kwad.sdk.core.d.c.e(r7, r9)
            com.kwad.components.ad.feed.e$1 r7 = new com.kwad.components.ad.feed.e$1
            r7.<init>(r8)
            com.kwad.sdk.utils.bw.runOnUiThread(r7)
            return
        L1a:
            com.kwad.sdk.internal.api.SceneImpl r2 = com.kwad.sdk.internal.api.SceneImpl.covert(r7)
            com.kwad.sdk.commercial.d.d.c(r2)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r7 = r2.getAdNum()
            com.kwad.components.ad.feed.monitor.b.B(r7)
            com.kwad.components.core.t.n r7 = com.kwad.components.core.t.n.tn()
            java.lang.String r0 = "loadConfigFeedAd"
            boolean r7 = r7.b(r2, r0)
            r0 = 1
            r2.setAdStyle(r0)
            com.kwad.components.ad.KsAdLoadManager r6 = com.kwad.components.ad.KsAdLoadManager.M()
            com.kwad.components.core.request.model.a$a r0 = new com.kwad.components.core.request.model.a$a
            r0.<init>()
            com.kwad.components.core.request.model.ImpInfo r1 = new com.kwad.components.core.request.model.ImpInfo
            r1.<init>(r2)
            com.kwad.components.core.request.model.a$a r0 = r0.e(r1)
            com.kwad.components.core.request.model.a$a r7 = r0.aM(r7)
            com.kwad.components.ad.feed.e$2 r0 = new com.kwad.components.ad.feed.e$2
            r1 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4)
            com.kwad.components.core.request.model.a$a r7 = r7.a(r0)
            com.kwad.components.core.request.model.a r7 = r7.sw()
            r6.a(r7)
            return
    }
}
