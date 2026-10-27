package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class SpringConfigRegistry {
    private static final com.facebook.rebound.SpringConfigRegistry b = null;
    private final java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> a;

    static {
            com.facebook.rebound.SpringConfigRegistry r0 = new com.facebook.rebound.SpringConfigRegistry
            r1 = 1
            r0.<init>(r1)
            com.facebook.rebound.SpringConfigRegistry.b = r0
            return
    }

    SpringConfigRegistry(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            if (r2 == 0) goto L13
            com.facebook.rebound.SpringConfig r2 = com.facebook.rebound.SpringConfig.c
            java.lang.String r0 = "default config"
            r1.a(r2, r0)
        L13:
            return
    }

    public static com.facebook.rebound.SpringConfigRegistry c() {
            com.facebook.rebound.SpringConfigRegistry r0 = com.facebook.rebound.SpringConfigRegistry.b
            return r0
    }

    public boolean a(com.facebook.rebound.SpringConfig r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L15
            java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> r0 = r1.a
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Le
            r2 = 0
            return r2
        Le:
            java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> r0 = r1.a
            r0.put(r2, r3)
            r2 = 1
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "configName is required"
            r2.<init>(r3)
            throw r2
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "springConfig is required"
            r2.<init>(r3)
            throw r2
    }

    public java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> b() {
            r1 = this;
            java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> r0 = r1.a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }

    public void d() {
            r1 = this;
            java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> r0 = r1.a
            r0.clear()
            return
    }

    public boolean e(com.facebook.rebound.SpringConfig r2) {
            r1 = this;
            if (r2 == 0) goto Le
            java.util.Map<com.facebook.rebound.SpringConfig, java.lang.String> r0 = r1.a
            java.lang.Object r2 = r0.remove(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "springConfig is required"
            r2.<init>(r0)
            throw r2
    }
}
