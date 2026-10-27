package com.kwad.components.ad.reward.monitor;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(com.kwad.sdk.core.response.model.AdTemplate r3, com.kwad.components.core.webview.tachikoma.TKRenderFailReason r4) {
            int r0 = com.kwad.sdk.core.response.b.e.ef(r3)
            r1 = 2
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto Lf
            java.lang.String r1 = "ad_sdk_neo_page_native_monitor"
            goto L11
        Lf:
            java.lang.String r1 = "ad_sdk_fullscreen_page_native_monitor"
        L11:
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.SWITCH_CLOSE
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L23
            if (r0 == 0) goto L1f
            r4 = 102003(0x18e73, float:1.42937E-40)
            goto L38
        L1f:
            r4 = 103003(0x1925b, float:1.44338E-40)
            goto L38
        L23:
            com.kwad.components.core.webview.tachikoma.TKRenderFailReason r2 = com.kwad.components.core.webview.tachikoma.TKRenderFailReason.TK_FILE_LOAD_ERROR
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L35
            if (r0 == 0) goto L31
            r4 = 102004(0x18e74, float:1.42938E-40)
            goto L38
        L31:
            r4 = 103004(0x1925c, float:1.4434E-40)
            goto L38
        L35:
            r4 = 102005(0x18e75, float:1.4294E-40)
        L38:
            a(r0, r1, r3, r4)
            return
    }

    public static void a(boolean r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            if (r2 == 0) goto L5
            java.lang.String r0 = "ad_sdk_neo_video_cache_monitor"
            goto L7
        L5:
            java.lang.String r0 = "ad_sdk_fullscreen_video_cache_monitor"
        L7:
            if (r2 == 0) goto Ld
            r1 = 102001(0x18e71, float:1.42934E-40)
            goto L10
        Ld:
            r1 = 103001(0x19259, float:1.44335E-40)
        L10:
            a(r2, r0, r3, r1)
            return
    }

    private static void a(boolean r3, java.lang.String r4, com.kwad.sdk.core.response.model.AdTemplate r5, int r6) {
            if (r5 == 0) goto Ld
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r5)
            if (r0 == 0) goto Ld
            long r0 = com.kwad.sdk.core.response.b.a.J(r0)
            goto Lf
        Ld:
            r0 = 0
        Lf:
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r2 = new com.kwad.components.ad.reward.monitor.RewardMonitorInfo
            r2.<init>()
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r6 = r2.setErrorCode(r6)
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r6 = r6.setCreativeId(r0)
            com.kwad.components.ad.reward.monitor.RewardMonitorInfo r5 = r6.setAdTemplate(r5)
            com.kwad.sdk.commercial.b.a(r3, r4, r5)
            return
    }

    public static void b(boolean r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            if (r2 == 0) goto L5
            java.lang.String r0 = "ad_sdk_neo_page_enter_monitor"
            goto L7
        L5:
            java.lang.String r0 = "ad_sdk_fullscreen_page_enter_monitor"
        L7:
            if (r2 == 0) goto Ld
            r1 = 102002(0x18e72, float:1.42935E-40)
            goto L10
        Ld:
            r1 = 103002(0x1925a, float:1.44337E-40)
        L10:
            a(r2, r0, r3, r1)
            return
    }

    public static void c(boolean r2, int r3) {
            if (r2 == 0) goto L5
            java.lang.String r0 = "ad_sdk_neo_request_monitor"
            goto L7
        L5:
            java.lang.String r0 = "ad_sdk_fullscreen_request_monitor"
        L7:
            r1 = 0
            a(r2, r0, r1, r3)
            return
    }

    public static void c(boolean r2, com.kwad.sdk.core.response.model.AdTemplate r3) {
            if (r2 == 0) goto L5
            java.lang.String r0 = "ad_sdk_neo_video_play_monitor"
            goto L7
        L5:
            java.lang.String r0 = "ad_sdk_fullscreen_video_play_monitor"
        L7:
            if (r2 == 0) goto Ld
            r1 = 102007(0x18e77, float:1.42942E-40)
            goto L10
        Ld:
            r1 = 103007(0x1925f, float:1.44344E-40)
        L10:
            a(r2, r0, r3, r1)
            return
    }
}
