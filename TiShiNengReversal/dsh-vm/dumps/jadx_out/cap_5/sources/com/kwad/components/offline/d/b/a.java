package com.kwad.components.offline.d.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class a {
    private static final java.util.concurrent.atomic.AtomicBoolean ajy = null;
    private static final java.lang.String ajz = null;
    private static final java.lang.String akN = null;
    private static final java.lang.String akO = null;
    private static final java.lang.String akP = null;
    private static final java.lang.String akQ = null;
    private static final java.lang.String akR = null;
    private static final java.lang.String akS = null;
    private static long akT;
    private static java.lang.Boolean akU;


    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.kwad.components.offline.d.b.a.ajy = r0
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "tk_runtime_v0_0_161"
            r2[r1] = r3
            java.lang.String r3 = "lib%s.so"
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akN = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "tk_runtime_lite_v0_0_161"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akO = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kwai-v8"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akP = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kwai-v8-lite"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akQ = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kwad-fb"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akR = r2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r4 = "kwad-yoga"
            r2[r1] = r4
            java.lang.String r2 = com.kwad.sdk.utils.ah.format(r3, r2)
            com.kwad.components.offline.d.b.a.akS = r2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "c++_shared"
            r0[r1] = r2
            java.lang.String r0 = com.kwad.sdk.utils.ah.format(r3, r0)
            com.kwad.components.offline.d.b.a.ajz = r0
            r0 = 0
            com.kwad.components.offline.d.b.a.akU = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ long T(long r0) {
            com.kwad.components.offline.d.b.a.akT = r0
            return r0
    }

    public static void a(android.content.Context r8, @androidx.annotation.NonNull com.kwad.components.offline.api.core.soloader.SoLoadListener r9) {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.kwad.components.offline.d.b.a.ajy
            boolean r1 = r0.get()
            if (r1 == 0) goto L9
            return
        L9:
            r1 = 1
            r0.set(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r2 = useTkLite()
            boolean r3 = com.kwad.sdk.utils.AbiUtil.isArm64(r8)
            if (r3 == 0) goto L71
            java.lang.String r3 = com.kwad.sdk.core.config.e.Fd()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L27
            goto L2e
        L27:
            if (r2 == 0) goto L2c
            java.lang.String r3 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v8_lite_3358"
            goto L2e
        L2c:
            java.lang.String r3 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v8_3358"
        L2e:
            if (r2 == 0) goto L33
            java.lang.String r4 = "sotk-v8a-lite"
            goto L35
        L33:
            java.lang.String r4 = "sotk-v8a"
        L35:
            if (r2 == 0) goto L3a
            java.lang.String r5 = "0e2d6748c990aa021d01521b6926a5d1"
            goto L3c
        L3a:
            java.lang.String r5 = "581986671ff8549adfa5bcc94410a6d5"
        L3c:
            if (r2 == 0) goto L4d
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akO
            java.lang.String r7 = "0666493e16b18f08ec178a949c41ce30"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akQ
            java.lang.String r7 = "77545ba1892c1a1d4a039db37b3249eb"
            r0.put(r6, r7)
            goto L5b
        L4d:
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akN
            java.lang.String r7 = "a72b02a82df72cd82a3acace986099ad"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akP
            java.lang.String r7 = "7316cd8d074b04e6cb21486288d314ce"
            r0.put(r6, r7)
        L5b:
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akR
            java.lang.String r7 = "31f065607e6da6b741330d1df0b35460"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akS
            java.lang.String r7 = "76308532f64b68fd5a930c42cceec22b"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.ajz
            java.lang.String r7 = "2e989e1c8d777ce169376feb637530e9"
            r0.put(r6, r7)
            goto Lc5
        L71:
            java.lang.String r3 = com.kwad.sdk.core.config.e.Fc()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L7c
            goto L83
        L7c:
            if (r2 == 0) goto L81
            java.lang.String r3 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v7_lite_3358"
            goto L83
        L81:
            java.lang.String r3 = "https://p1-lm.adkwai.com/udata/pkg/KS-Android-KSAdSDk/tachikoma/3.3.58/ks_tk_so_v7_3358"
        L83:
            if (r2 == 0) goto L88
            java.lang.String r4 = "sotk-v7a-lite"
            goto L8a
        L88:
            java.lang.String r4 = "sotk-v7a"
        L8a:
            if (r2 == 0) goto L8f
            java.lang.String r5 = "e9821df3990aca6fc2cd6b5b71c5a1df"
            goto L91
        L8f:
            java.lang.String r5 = "16335fa1eb7d19586a6be6aa74778b5b"
        L91:
            if (r2 == 0) goto La2
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akO
            java.lang.String r7 = "cb8a97957aa4cb944a27f4353be3384c"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akQ
            java.lang.String r7 = "2dbd72527a0739740746adaae48ed2e0"
            r0.put(r6, r7)
            goto Lb0
        La2:
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akN
            java.lang.String r7 = "75ae8eff358638dcddad68117cbbc494"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akP
            java.lang.String r7 = "519ba633e88efafb8fbd536d800da734"
            r0.put(r6, r7)
        Lb0:
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akR
            java.lang.String r7 = "eff11bebb8a3c872fa30b0484b460d12"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.akS
            java.lang.String r7 = "2c6f402c6a565d2e6912b0013fa59380"
            r0.put(r6, r7)
            java.lang.String r6 = com.kwad.components.offline.d.b.a.ajz
            java.lang.String r7 = "2ce4deb75b884953f20ab2e6e149be98"
            r0.put(r6, r7)
        Lc5:
            com.kwad.library.solder.lib.c.b r6 = new com.kwad.library.solder.lib.c.b
            r6.<init>()
            com.kwad.sdk.core.network.idc.a r7 = com.kwad.sdk.core.network.idc.a.HF()
            java.lang.String r3 = r7.ef(r3)
            r6.ary = r3
            r6.enable = r1
            r6.arx = r4
            if (r2 == 0) goto Ldd
            java.lang.String r1 = "3.3.60-lite"
            goto Ldf
        Ldd:
            java.lang.String r1 = "3.3.60"
        Ldf:
            r6.version = r1
            r1 = 0
            r6.arB = r1
            r6.arA = r5
            r6.arD = r0
            java.lang.String r0 = "com.kwad.components.tachikoma"
            com.kwad.library.b.a r0 = com.kwad.library.solder.a.a.k(r8, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tkOfflineCompoPlugin: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TkSoLoadHelper"
            com.kwad.sdk.core.d.c.d(r2, r1)
            boolean r1 = androidx.activity.k.a(r0)
            if (r1 == 0) goto L10d
            com.kwad.library.b.a.b r0 = r0.zI()
            r6.arG = r0
        L10d:
            com.kwad.components.offline.d.b.a$1 r0 = new com.kwad.components.offline.d.b.a$1
            r0.<init>(r9)
            com.kwad.library.solder.a.a.a(r8, r6, r0)
            return
    }

    public static boolean useTkLite() {
            java.lang.Boolean r0 = com.kwad.components.offline.d.b.a.akU
            if (r0 != 0) goto L12
            com.kwad.sdk.core.config.item.d r0 = com.kwad.sdk.core.config.c.azk
            boolean r0 = com.kwad.sdk.core.config.e.a(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.kwad.components.offline.d.b.a.akU = r0
        L12:
            java.lang.Boolean r0 = com.kwad.components.offline.d.b.a.akU
            boolean r0 = r0.booleanValue()
            return r0
    }

    static /* synthetic */ long wz() {
            long r0 = com.kwad.components.offline.d.b.a.akT
            return r0
    }
}
