package com.kwad.components.core.e.d;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    private static boolean PM;


    static {
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean E(com.kwad.sdk.core.response.model.AdInfo r1) {
            if (r1 == 0) goto L2a
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r1.adConversionInfo
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r0 = r0.smallAppJumpInfo
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.mediaSmallAppId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r1.adConversionInfo
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r0 = r0.smallAppJumpInfo
            java.lang.String r0 = r0.originId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2a
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r1 = r1.adConversionInfo
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r1 = r1.smallAppJumpInfo
            java.lang.String r1 = r1.smallAppJumpUrl
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2a
            r1 = 1
            return r1
        L2a:
            r1 = 0
            return r1
    }

    public static int a(android.content.Context r10, com.kwad.sdk.core.response.model.AdInfo.SmallAppJumpInfo r11, com.kwad.sdk.commercial.smallApp.JumpFrom r12, com.kwad.sdk.core.response.model.AdTemplate r13) {
            boolean r0 = com.kwad.sdk.core.response.b.a.a(r11)
            r1 = 1
            if (r0 != 0) goto L11
            java.lang.String r10 = "smallAppJumpInfo is invalid"
            com.kwad.sdk.commercial.smallApp.a.a(r13, r12, r11, r10)
            com.kwad.sdk.core.adlog.c.j(r13, r1)
            r10 = 0
            return r10
        L11:
            r2 = 0
            com.kwad.sdk.commercial.smallApp.a.a(r13, r12, r11)     // Catch: java.lang.Throwable -> L77
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "com.tencent.mm"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L77
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "android.intent.action.MAIN"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "android.intent.category.LAUNCHER"
            r3.addCategory(r4)     // Catch: java.lang.Throwable -> L77
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r4)     // Catch: java.lang.Throwable -> L77
            android.content.ComponentName r0 = r0.getComponent()     // Catch: java.lang.Throwable -> L77
            r3.setComponent(r0)     // Catch: java.lang.Throwable -> L77
            r10.startActivity(r3)     // Catch: java.lang.Throwable -> L77
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"
            android.net.Uri r5 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = r11.mediaSmallAppId     // Catch: java.lang.Throwable -> L77
            java.lang.String r0 = r11.originId     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = r11.smallAppJumpUrl     // Catch: java.lang.Throwable -> L77
            java.lang.String r6 = "0"
            java.lang.String r7 = ""
            java.lang.String[] r8 = new java.lang.String[]{r10, r0, r3, r6, r7}     // Catch: java.lang.Throwable -> L77
            r7 = 0
            r9 = 0
            r6 = 0
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L77
            if (r10 == 0) goto L62
            com.kwad.sdk.crash.utils.b.closeQuietly(r10)     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r0 = move-exception
            r2 = r10
            goto L78
        L62:
            com.kwad.sdk.commercial.smallApp.a.b(r13, r12, r11)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "wxsmallapp"
            com.kwad.sdk.core.adlog.c.a(r13, r0, r1, r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r11.mediaSmallAppId     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r11.originId     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r11.smallAppJumpUrl     // Catch: java.lang.Throwable -> L5f
            a(r12, r0, r2, r3, r13)     // Catch: java.lang.Throwable -> L5f
            com.kwad.sdk.crash.utils.b.closeQuietly(r10)
            return r1
        L77:
            r0 = move-exception
        L78:
            java.lang.String r10 = com.kwad.sdk.utils.bw.s(r0)     // Catch: java.lang.Throwable -> L88
            com.kwad.sdk.commercial.smallApp.a.a(r13, r12, r11, r10)     // Catch: java.lang.Throwable -> L88
            r10 = 2
            com.kwad.sdk.core.adlog.c.j(r13, r10)     // Catch: java.lang.Throwable -> L88
            com.kwad.sdk.crash.utils.b.closeQuietly(r2)
            r10 = -1
            return r10
        L88:
            r0 = move-exception
            r10 = r0
            com.kwad.sdk.crash.utils.b.closeQuietly(r2)
            throw r10
    }

    private static void a(com.kwad.sdk.commercial.smallApp.JumpFrom r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.kwad.sdk.core.response.model.AdTemplate r11) {
            boolean r0 = pW()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            aC(r0)
            int r0 = com.kwad.sdk.core.config.e.Fo()
            int r0 = java.lang.Math.abs(r0)
            if (r0 <= 0) goto L29
            com.kwad.components.core.e.d.e$1 r1 = new com.kwad.components.core.e.d.e$1
            r3 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            long r7 = (long) r0
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r9 = 0
            com.kwad.sdk.utils.bw.a(r1, r9, r7)
            return
        L29:
            r7 = 0
            aC(r7)
            return
    }

    private static void aC(boolean r0) {
            com.kwad.components.core.e.d.e.PM = r0
            return
    }

    static /* synthetic */ void aD(boolean r0) {
            r0 = 0
            aC(r0)
            return
    }

    public static int e(android.content.Context r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r3)
            boolean r1 = com.kwad.sdk.core.response.b.a.S(r0)
            if (r1 == 0) goto Lc
            r2 = 0
            return r2
        Lc:
            com.kwad.sdk.core.response.model.AdInfo$AdConversionInfo r0 = r0.adConversionInfo
            com.kwad.sdk.core.response.model.AdInfo$SmallAppJumpInfo r0 = r0.smallAppJumpInfo
            com.kwad.sdk.commercial.smallApp.JumpFrom r1 = com.kwad.sdk.commercial.smallApp.JumpFrom.AD_PAGE
            int r2 = a(r2, r0, r1, r3)
            return r2
    }

    private static boolean pW() {
            boolean r0 = com.kwad.components.core.e.d.e.PM
            return r0
    }
}
