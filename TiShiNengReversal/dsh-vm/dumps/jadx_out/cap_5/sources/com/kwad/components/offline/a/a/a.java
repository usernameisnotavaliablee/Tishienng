package com.kwad.components.offline.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static final java.lang.String ajA = null;
    private static final java.lang.String ajB = null;
    private static final java.lang.String ajC = null;
    private static final java.lang.String ajD = null;
    private static final java.util.concurrent.atomic.AtomicBoolean ajy = null;
    private static final java.lang.String ajz = null;


    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.offline.a.a.a.ajy = r0
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "c++_shared"
            r2[r1] = r3
            java.lang.String r3 = "lib%s.so"
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.a.a.a.ajz = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kwaiplayer"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.a.a.a.ajA = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kste"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.a.a.a.ajB = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "hodor"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.a.a.a.ajC = r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "aegon"
            r0[r1] = r2
            java.lang.String r0 = com.kwad.sdk.utils.ah.format(r3, r0)
            com.kwad.components.offline.a.a.a.ajD = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r9, @androidx.annotation.NonNull com.kwad.components.offline.api.core.soloader.SoLoadListener r10) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.offline.a.a.a.ajy
            boolean r1 = r0.get()
            if (r1 == 0) goto L9
            return
        L9:
            r1 = 1
            r0.set(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r2 = com.kwad.sdk.utils.AbiUtil.isArm64(r9)
            if (r2 == 0) goto L42
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajz
            java.lang.String r3 = "dcd68cd059cb06a9596ba6839c2e8858"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajA
            java.lang.String r3 = "cf71bcc476b2b25e2e62b541275ad78c"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajB
            java.lang.String r3 = "ebb56fa9c5701350497e281c2446660f"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajC
            java.lang.String r3 = "a61edf93bc5abc7799c5444ccbaf140b"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajD
            java.lang.String r3 = "c256c0d7f79ad4d47db61cb8e8ab142a"
            r0.put(r2, r3)
            java.lang.String r2 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/adLive/ks_so-adLiveArm64v8aRelease-3.3.44.2-e8fbb3a5f8-666.apk"
            java.lang.String r3 = "adLive-v8a"
            java.lang.String r4 = "41a4213dcbf3ed262fc69daf7d4a29e5"
            goto L6b
        L42:
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajz
            java.lang.String r3 = "e3fdbf82716c2cb9b666a3880ab94003"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajA
            java.lang.String r3 = "2ba24f9d0a6e786af477ed1e2dad148b"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajB
            java.lang.String r3 = "71a9baa45905a6f0e527e5a2e06e8808"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajC
            java.lang.String r3 = "d997935a035d00a67dc46e26427b8bf9"
            r0.put(r2, r3)
            java.lang.String r2 = com.kwad.components.offline.a.a.a.ajD
            java.lang.String r3 = "bdac6eea0d25da98061c21234f3b20c5"
            r0.put(r2, r3)
            java.lang.String r2 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/adLive/ks_so-adLiveArmeabiv7aRelease-3.3.44.2-e8fbb3a5f8-666.apk"
            java.lang.String r3 = "adLive-v7a"
            java.lang.String r4 = "ceddd5a3aae9148992bee153a29a25fb"
        L6b:
            com.kwad.library.solder.lib.c.b r5 = new com.kwad.library.solder.lib.c.b
            r5.<init>()
            java.lang.String r6 = "com.kwad.components.adLive"
            com.kwad.library.b.a r6 = com.kwad.library.solder.a.a.k(r9, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "adLiveOfflineCompoPlugin: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "AdLiveSoLoadHelper"
            com.kwad.sdk.core.d.c.d(r8, r7)
            boolean r7 = androidx.activity.k.a(r6)
            if (r7 == 0) goto L95
            com.kwad.library.b.a.b r6 = r6.zI()
            r5.arG = r6
        L95:
            com.kwad.sdk.core.network.idc.a r6 = com.kwad.sdk.core.network.idc.a.HF()
            java.lang.String r2 = r6.ef(r2)
            r5.ary = r2
            r5.enable = r1
            r5.arx = r3
            java.lang.String r2 = "3.3.44.3"
            r5.version = r2
            r5.arD = r0
            r5.arA = r4
            r5.arB = r1
            com.kwad.components.offline.a.a.a$1 r0 = new com.kwad.components.offline.a.a.a$1
            r0.<init>(r10)
            com.kwad.library.solder.a.a.a(r9, r5, r0)
            return
    }
}
