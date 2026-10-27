package com.kwad.components.core.internal.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(com.kwad.sdk.api.KsVideoPlayConfig r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            r1.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "showScene"
            java.lang.String r3 = r4.getShowScene()     // Catch: java.lang.Exception -> L32
            com.kwad.sdk.utils.aa.putValue(r1, r2, r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "showLandscape"
            boolean r3 = r4.isShowLandscape()     // Catch: java.lang.Exception -> L32
            com.kwad.sdk.utils.aa.putValue(r1, r2, r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "skipThirtySecond"
            boolean r3 = r4.isSkipThirtySecond()     // Catch: java.lang.Exception -> L32
            com.kwad.sdk.utils.aa.putValue(r1, r2, r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = "videoSoundEnable"
            boolean r4 = r4.isVideoSoundEnable()     // Catch: java.lang.Exception -> L32
            com.kwad.sdk.utils.aa.putValue(r1, r2, r4)     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L32
            return r4
        L32:
            return r0
    }

    public static com.kwad.components.core.internal.api.VideoPlayConfigImpl b(java.lang.String r2, boolean r3) {
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L32
            r3.<init>(r2)     // Catch: java.lang.Exception -> L32
            com.kwad.components.core.internal.api.VideoPlayConfigImpl r2 = new com.kwad.components.core.internal.api.VideoPlayConfigImpl     // Catch: java.lang.Exception -> L32
            r2.<init>()     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "showScene"
            r1 = 0
            java.lang.String r0 = r3.optString(r0, r1)     // Catch: java.lang.Exception -> L32
            r2.setShowScene(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "showLandscape"
            r1 = 0
            boolean r0 = r3.optBoolean(r0, r1)     // Catch: java.lang.Exception -> L32
            r2.setShowLandscape(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "skipThirtySecond"
            boolean r0 = r3.optBoolean(r0, r1)     // Catch: java.lang.Exception -> L32
            r2.setSkipThirtySecond(r0)     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "videoSoundEnable"
            r1 = 1
            boolean r3 = r3.optBoolean(r0, r1)     // Catch: java.lang.Exception -> L32
            r2.setVideoSoundEnable(r3)     // Catch: java.lang.Exception -> L32
            return r2
        L32:
            com.kwad.components.core.internal.api.VideoPlayConfigImpl r2 = new com.kwad.components.core.internal.api.VideoPlayConfigImpl
            r2.<init>()
            return r2
    }
}
