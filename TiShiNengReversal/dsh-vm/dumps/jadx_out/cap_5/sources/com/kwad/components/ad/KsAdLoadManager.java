package com.kwad.components.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class KsAdLoadManager {
    private volatile boolean bA;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Holder extends java.lang.Enum<com.kwad.components.ad.KsAdLoadManager.Holder> {
        private static final /* synthetic */ com.kwad.components.ad.KsAdLoadManager.Holder[] $VALUES = null;
        public static final com.kwad.components.ad.KsAdLoadManager.Holder INSTANCE = null;
        private final com.kwad.components.ad.KsAdLoadManager mInstance;

        static {
                com.kwad.components.ad.KsAdLoadManager$Holder r0 = new com.kwad.components.ad.KsAdLoadManager$Holder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.ad.KsAdLoadManager.Holder.INSTANCE = r0
                r1 = 1
                com.kwad.components.ad.KsAdLoadManager$Holder[] r1 = new com.kwad.components.ad.KsAdLoadManager.Holder[r1]
                r1[r2] = r0
                com.kwad.components.ad.KsAdLoadManager.Holder.$VALUES = r1
                return
        }

        Holder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.kwad.components.ad.KsAdLoadManager r1 = new com.kwad.components.ad.KsAdLoadManager
                r2 = 0
                r1.<init>(r2)
                r0.mInstance = r1
                return
        }

        static /* synthetic */ com.kwad.components.ad.KsAdLoadManager access$100(com.kwad.components.ad.KsAdLoadManager.Holder r0) {
                com.kwad.components.ad.KsAdLoadManager r0 = r0.mInstance
                return r0
        }

        public static com.kwad.components.ad.KsAdLoadManager.Holder valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.ad.KsAdLoadManager$Holder> r0 = com.kwad.components.ad.KsAdLoadManager.Holder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.ad.KsAdLoadManager$Holder r1 = (com.kwad.components.ad.KsAdLoadManager.Holder) r1
                return r1
        }

        public static com.kwad.components.ad.KsAdLoadManager.Holder[] values() {
                com.kwad.components.ad.KsAdLoadManager$Holder[] r0 = com.kwad.components.ad.KsAdLoadManager.Holder.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.ad.KsAdLoadManager$Holder[] r0 = (com.kwad.components.ad.KsAdLoadManager.Holder[]) r0
                return r0
        }
    }

    private KsAdLoadManager() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.bA = r0
            return
    }

    /* synthetic */ KsAdLoadManager(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.components.ad.KsAdLoadManager M() {
            com.kwad.components.ad.KsAdLoadManager$Holder r0 = com.kwad.components.ad.KsAdLoadManager.Holder.INSTANCE
            com.kwad.components.ad.KsAdLoadManager r0 = com.kwad.components.ad.KsAdLoadManager.Holder.access$100(r0)
            return r0
    }

    private static void N() {
            boolean r0 = com.kwad.sdk.core.config.e.Gt()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reportInstallerCheckRecord isInstallerCheckEnable: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AdLoadManager"
            com.kwad.sdk.core.d.c.d(r2, r1)
            if (r0 != 0) goto L1a
            return
        L1a:
            android.content.Context r0 = com.kwad.sdk.service.ServiceProvider.getContext()
            com.kwad.components.ad.j.b.ak(r0)     // Catch: java.lang.Throwable -> L25
            com.kwad.components.ad.j.b.al(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r0 = move-exception
            com.kwad.sdk.crash.b.n(r0)
            return
    }

    private static boolean b(com.kwad.components.core.request.model.a r0) {
            java.lang.Class<com.kwad.sdk.components.DevelopMangerComponents> r0 = com.kwad.sdk.components.DevelopMangerComponents.class
            com.kwad.sdk.components.d.f(r0)     // Catch: java.lang.Exception -> L6
            goto La
        L6:
            r0 = move-exception
            com.kwad.sdk.service.ServiceProvider.reportSdkCaughtException(r0)
        La:
            r0 = 0
            return r0
    }

    public final void a(@androidx.annotation.NonNull com.kwad.components.core.request.model.a r4) {
            r3 = this;
            com.kwad.sdk.l r0 = com.kwad.sdk.l.Cf()
            boolean r0 = r0.CG()
            r1 = 1
            if (r0 != 0) goto L15
            com.kwad.sdk.core.network.e r0 = com.kwad.sdk.core.network.e.aEn
            int r2 = r0.errorCode
            java.lang.String r0 = r0.msg
            com.kwad.components.core.request.model.a.a(r4, r2, r0, r1)
            return
        L15:
            boolean r0 = com.kwad.components.ad.adbit.c.c(r4)
            if (r0 == 0) goto L1c
            goto L22
        L1c:
            boolean r0 = b(r4)
            if (r0 == 0) goto L23
        L22:
            return
        L23:
            boolean r0 = r3.bA
            if (r0 != 0) goto L2c
            N()
            r3.bA = r1
        L2c:
            com.kwad.components.core.c.d r0 = com.kwad.components.core.c.d.od()
            r0.d(r4)
            return
    }

    public final synchronized <T> void a(T r2) {
            r1 = this;
            monitor-enter(r1)
            com.kwad.components.core.c.g r0 = com.kwad.components.core.c.g.om()     // Catch: java.lang.Throwable -> La
            r0.add(r2)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
    }

    public final synchronized <T> void b(java.util.List<T> r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L17
        L5:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L17
            com.kwad.components.core.c.g r1 = com.kwad.components.core.c.g.om()     // Catch: java.lang.Throwable -> L17
            r1.add(r0)     // Catch: java.lang.Throwable -> L17
            goto L5
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r2)
            return
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
    }
}
