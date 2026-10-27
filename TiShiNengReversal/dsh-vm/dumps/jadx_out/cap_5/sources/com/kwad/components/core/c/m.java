package com.kwad.components.core.c;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class m implements com.kwad.components.core.c.c {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.kwad.components.core.c.m$1, reason: invalid class name */
    final class AnonymousClass1 extends com.kwad.components.core.c.j {
        final /* synthetic */ com.kwad.components.core.c.m NV;
        final /* synthetic */ com.kwad.components.core.request.model.a bD;



        AnonymousClass1(com.kwad.components.core.c.m r1, com.kwad.components.core.request.model.a r2, com.kwad.components.core.request.model.a r3) {
                r0 = this;
                r0.NV = r1
                r0.bD = r3
                r0.<init>(r2)
                return
        }

        static /* synthetic */ void a(com.kwad.components.core.c.m.AnonymousClass1 r0, com.kwad.sdk.internal.api.SceneImpl r1, com.kwad.sdk.core.response.model.AdResultData r2, int r3, com.kwad.components.core.c.k r4) {
                r0.a(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.WorkerThread
        private void a(com.kwad.sdk.internal.api.SceneImpl r3, @androidx.annotation.Nullable com.kwad.sdk.core.response.model.AdResultData r4, int r5, com.kwad.components.core.c.k r6) {
                r2 = this;
                com.kwad.components.core.request.model.a r0 = r2.bD
                com.kwad.sdk.core.response.model.AdResultData r0 = com.kwad.components.core.c.l.e(r0)
                if (r0 == 0) goto L3c
                boolean r1 = r0.isAdResultDataEmpty()
                if (r1 == 0) goto Lf
                goto L3c
            Lf:
                java.util.List r6 = r0.getProceedTemplateList()
                java.util.List r6 = com.kwad.components.core.c.m.m(r6)
                int r0 = r6.size()
                int r5 = java.lang.Math.min(r5, r0)
                r0 = 0
                java.util.List r5 = r6.subList(r0, r5)
                int r6 = r5.size()
                if (r6 <= 0) goto L41
                if (r4 != 0) goto L31
                com.kwad.sdk.core.response.model.AdResultData r4 = new com.kwad.sdk.core.response.model.AdResultData
                r4.<init>(r3)
            L31:
                com.kwad.sdk.core.response.model.AdResultData r6 = new com.kwad.sdk.core.response.model.AdResultData
                r6.<init>(r4, r3, r5)
                com.kwad.components.core.request.model.a r3 = r2.bD
                com.kwad.components.core.request.model.a.a(r3, r6, r0)
                return
            L3c:
                if (r6 == 0) goto L41
                r6.ot()
            L41:
                return
        }

        @Override // com.kwad.components.core.c.j
        public final void a(@androidx.annotation.NonNull com.kwad.components.core.request.a r3, int r4, java.lang.String r5) {
                r2 = this;
                java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
                com.kwad.components.core.c.m$1$2 r1 = new com.kwad.components.core.c.m$1$2
                r1.<init>(r2, r3, r4, r5)
                r0.submit(r1)
                return
        }

        @Override // com.kwad.components.core.c.j
        protected final boolean a(com.kwad.components.core.request.model.a r9, com.kwad.sdk.core.response.model.AdResultData r10) {
                r8 = this;
                long r0 = r9.getPosId()
                com.kwad.sdk.internal.api.SceneImpl r4 = r10.getAdScene(r0)
                int r6 = r4.getAdNum()
                boolean r0 = r10.isAdResultDataEmpty()
                r1 = 1
                if (r0 == 0) goto L23
                java.util.concurrent.ExecutorService r0 = com.kwad.sdk.core.threads.GlobalThreadPools.Jt()
                com.kwad.components.core.c.m$1$1 r2 = new com.kwad.components.core.c.m$1$1
                r3 = r8
                r7 = r9
                r5 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                r0.submit(r2)
                return r1
            L23:
                r7 = r9
                r5 = r10
                boolean r9 = r5.isBidding()
                r10 = 0
                if (r9 == 0) goto L6d
                com.kwad.sdk.core.response.model.AdResultData r9 = com.kwad.components.core.c.l.e(r7)
                if (r9 == 0) goto L6d
                boolean r0 = r9.isAdResultDataEmpty()
                if (r0 == 0) goto L39
                goto L6d
            L39:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r9 = r9.getProceedTemplateList()
                r0.addAll(r9)
                java.util.List r9 = r5.getProceedTemplateList()
                r0.addAll(r9)
                java.util.List r9 = com.kwad.components.core.c.m.m(r0)
                int r0 = r9.size()
                int r0 = java.lang.Math.min(r6, r0)
                java.util.List r9 = r9.subList(r10, r0)
                if (r9 == 0) goto L6d
                int r0 = r9.size()
                if (r0 <= 0) goto L6d
                com.kwad.sdk.core.response.model.AdResultData r10 = new com.kwad.sdk.core.response.model.AdResultData
                r10.<init>(r5, r4, r9)
                com.kwad.components.core.request.model.a.a(r7, r10, r1)
                return r1
            L6d:
                return r10
        }

        @Override // com.kwad.components.core.c.j, com.kwad.sdk.core.network.o, com.kwad.sdk.core.network.g
        public final /* synthetic */ void onError(@androidx.annotation.NonNull com.kwad.sdk.core.network.f r1, int r2, java.lang.String r3) {
                r0 = this;
                com.kwad.components.core.request.a r1 = (com.kwad.components.core.request.a) r1
                r0.a(r1, r2, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.util.Comparator<com.kwad.sdk.core.response.model.AdTemplate> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(byte r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static int a(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
                int r0 = com.kwad.sdk.core.response.b.e.ez(r3)
                int r1 = com.kwad.sdk.core.response.b.e.ez(r2)
                int r0 = r0 - r1
                if (r0 == 0) goto Lc
                return r0
            Lc:
                boolean r2 = r2.fromCache
                if (r2 == 0) goto L16
                boolean r3 = r3.fromCache
                if (r3 == 0) goto L16
                r2 = 0
                return r2
            L16:
                if (r2 == 0) goto L1a
                r2 = 1
                return r2
            L1a:
                r2 = -1
                return r2
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.kwad.sdk.core.response.model.AdTemplate r1, com.kwad.sdk.core.response.model.AdTemplate r2) {
                r0 = this;
                com.kwad.sdk.core.response.model.AdTemplate r1 = (com.kwad.sdk.core.response.model.AdTemplate) r1
                com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
                int r1 = a(r1, r2)
                return r1
        }
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<com.kwad.sdk.core.response.model.AdTemplate> m(java.util.List<com.kwad.sdk.core.response.model.AdTemplate> r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            com.kwad.components.core.c.m$a r0 = new com.kwad.components.core.c.m$a
            r1 = 0
            r0.<init>(r1)
            java.util.Collections.sort(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r6.next()
            com.kwad.sdk.core.response.model.AdTemplate r2 = (com.kwad.sdk.core.response.model.AdTemplate) r2
            long r3 = com.kwad.sdk.core.response.b.e.ev(r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L1b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.add(r3)
            r0.add(r2)
            goto L1b
        L40:
            return r0
    }

    @Override // com.kwad.components.core.c.c
    public final void d(com.kwad.components.core.request.model.a r2) {
            r1 = this;
            com.kwad.components.core.c.m$1 r0 = new com.kwad.components.core.c.m$1
            r0.<init>(r1, r2, r2)
            com.kwad.components.core.c.n.a(r2, r0)
            return
    }

    @Override // com.kwad.components.core.c.c
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = "StrategyNetworkFirst"
            return r0
    }
}
