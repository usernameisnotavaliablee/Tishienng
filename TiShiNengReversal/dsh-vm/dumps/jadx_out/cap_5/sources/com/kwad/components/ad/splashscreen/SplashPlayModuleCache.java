package com.kwad.components.ad.splashscreen;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class SplashPlayModuleCache {
    private java.util.HashMap<java.lang.String, java.lang.ref.WeakReference<com.kwad.components.ad.splashscreen.d.a>> Fl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum Holder extends java.lang.Enum<com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder> {
        private static final /* synthetic */ com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder[] $VALUES = null;
        public static final com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder INSTANCE = null;
        private com.kwad.components.ad.splashscreen.SplashPlayModuleCache mInstance;

        static {
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder r0 = new com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder.INSTANCE = r0
                r1 = 1
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder[] r1 = new com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder[r1]
                r1[r2] = r0
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder.$VALUES = r1
                return
        }

        Holder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache r1 = new com.kwad.components.ad.splashscreen.SplashPlayModuleCache
                r2 = 0
                r1.<init>(r2)
                r0.mInstance = r1
                return
        }

        public static com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder> r0 = com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder r1 = (com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder) r1
                return r1
        }

        public static com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder[] values() {
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder[] r0 = com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache$Holder[] r0 = (com.kwad.components.ad.splashscreen.SplashPlayModuleCache.Holder[]) r0
                return r0
        }

        final com.kwad.components.ad.splashscreen.SplashPlayModuleCache getInstance() {
                r1 = this;
                com.kwad.components.ad.splashscreen.SplashPlayModuleCache r0 = r1.mInstance
                return r0
        }
    }

    private SplashPlayModuleCache() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 1
            r0.<init>(r1)
            r2.Fl = r0
            return
    }

    /* synthetic */ SplashPlayModuleCache(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }
}
