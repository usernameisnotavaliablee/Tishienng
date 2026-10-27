package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c {
    public final boolean jk;
    private com.kwad.sdk.core.response.model.AdInfo mAdInfo;
    private com.kwad.sdk.core.response.model.AdResultData mAdResultData;
    private com.kwad.sdk.core.response.model.AdTemplate mAdTemplate;
    private org.json.JSONObject mReportExtData;
    public int mScreenOrientation;
    private com.kwad.sdk.api.KsVideoPlayConfig mVideoPlayConfig;
    private int rewardType;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.rewardType = r0
            boolean r0 = com.kwad.components.ad.reward.a.b.hN()
            r1.jk = r0
            return
    }

    @androidx.annotation.Nullable
    public static com.kwad.components.ad.reward.model.c a(android.content.Intent r6) {
            boolean r0 = com.kwad.sdk.core.config.e.Gg()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            java.lang.String r0 = "key_video_play_config_json"
            java.lang.String r0 = r6.getStringExtra(r0)
            com.kwad.components.core.internal.api.VideoPlayConfigImpl r0 = com.kwad.components.core.internal.api.e.b(r0, r2)
            goto L33
        L13:
            java.lang.String r0 = "key_video_play_config"
            java.io.Serializable r0 = r6.getSerializableExtra(r0)
            boolean r3 = r0 instanceof com.kwad.sdk.api.KsVideoPlayConfig
            if (r3 != 0) goto L31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "data is not instanceof VideoPlayConfigImpl:"
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "RewardActivityModel"
            com.kwad.sdk.core.d.c.e(r0, r6)
            return r1
        L31:
            com.kwad.sdk.api.KsVideoPlayConfig r0 = (com.kwad.sdk.api.KsVideoPlayConfig) r0
        L33:
            java.lang.String r3 = "key_template_reward_type"
            int r3 = r6.getIntExtra(r3, r2)
            java.lang.String r4 = "key_ad_result_cache_idx"
            r5 = 0
            int r6 = r6.getIntExtra(r4, r5)
            com.kwad.components.core.c.f r4 = com.kwad.components.core.c.f.ol()     // Catch: java.lang.Throwable -> L50
            com.kwad.sdk.core.response.model.AdResultData r6 = r4.d(r6, r2)     // Catch: java.lang.Throwable -> L50
            if (r6 != 0) goto L4b
            return r1
        L4b:
            com.kwad.components.ad.reward.model.c r6 = a(r6, r3, r0)     // Catch: java.lang.Throwable -> L50
            return r6
        L50:
            r6 = move-exception
            com.kwad.sdk.core.d.c.printStackTraceOnly(r6)
            return r1
    }

    @androidx.annotation.Nullable
    private static com.kwad.components.ad.reward.model.c a(com.kwad.sdk.core.response.model.AdResultData r7, int r8, com.kwad.sdk.api.KsVideoPlayConfig r9) {
            com.kwad.components.ad.reward.model.c r0 = new com.kwad.components.ad.reward.model.c
            r0.<init>()
            com.kwad.sdk.core.response.model.AdTemplate r1 = com.kwad.sdk.core.response.b.c.r(r7)
            r2 = 0
            if (r1 != 0) goto L14
            java.lang.String r7 = "RewardActivityModel"
            java.lang.String r8 = "data is null:"
            com.kwad.sdk.core.d.c.e(r7, r8)
            return r2
        L14:
            com.kwad.sdk.core.response.model.AdInfo r3 = com.kwad.sdk.core.response.b.e.el(r1)
            boolean r4 = c(r1, r3)
            if (r4 != 0) goto L1f
            return r2
        L1f:
            boolean r2 = r9.isShowLandscape()
            boolean r4 = r9.isVideoSoundEnable()
            if (r4 == 0) goto L2b
            r4 = 2
            goto L2c
        L2b:
            r4 = 1
        L2c:
            r1.mInitVoiceStatus = r4
            java.lang.String r4 = r9.getShowScene()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L48
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "ext_showscene"
            java.lang.String r6 = r9.getShowScene()
            com.kwad.sdk.utils.aa.putValue(r4, r5, r6)
            r0.mReportExtData = r4
        L48:
            r0.mVideoPlayConfig = r9
            r0.mAdResultData = r7
            r0.mAdTemplate = r1
            r0.mAdInfo = r3
            r0.mScreenOrientation = r2
            r0.rewardType = r8
            return r0
    }

    private static boolean c(com.kwad.sdk.core.response.model.AdTemplate r2, com.kwad.sdk.core.response.model.AdInfo r3) {
            boolean r0 = com.kwad.sdk.core.config.e.Gg()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r2 = com.kwad.sdk.core.response.b.e.eB(r2)
            if (r2 >= 0) goto L24
            java.lang.String r2 = com.kwad.sdk.core.response.b.a.K(r3)
            com.kwad.sdk.core.diskcache.b.a r3 = com.kwad.sdk.core.diskcache.b.a.GP()
            java.io.File r2 = r3.cf(r2)
            if (r2 == 0) goto L22
            boolean r2 = r2.exists()
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            return r1
    }

    public final com.kwad.sdk.core.response.model.AdInfo cU() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdInfo r0 = r1.mAdInfo
            return r0
    }

    public final boolean cV() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            boolean r0 = com.kwad.sdk.core.response.b.e.ex(r0)
            return r0
    }

    public final com.kwad.sdk.core.response.model.AdTemplate getAdTemplate() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.mAdTemplate
            return r0
    }

    public final int getScreenOrientation() {
            r1 = this;
            int r0 = r1.mScreenOrientation
            return r0
    }

    public final boolean is() {
            r2 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r2.getAdTemplate()
            com.kwad.sdk.core.response.model.AdInfo r1 = r2.cU()
            boolean r1 = com.kwad.components.ad.reward.a.b.k(r1)
            boolean r0 = com.kwad.sdk.core.response.b.e.k(r0, r1)
            return r0
    }

    public final boolean it() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdTemplate r0 = r1.getAdTemplate()
            boolean r0 = com.kwad.sdk.core.response.b.e.O(r0)
            return r0
    }

    public final com.kwad.sdk.core.response.model.AdResultData iu() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdResultData r0 = r1.mAdResultData
            return r0
    }

    public final com.kwad.sdk.api.KsVideoPlayConfig iv() {
            r1 = this;
            com.kwad.sdk.api.KsVideoPlayConfig r0 = r1.mVideoPlayConfig
            return r0
    }

    public final int iw() {
            r1 = this;
            int r0 = r1.rewardType
            return r0
    }

    public final org.json.JSONObject ix() {
            r1 = this;
            org.json.JSONObject r0 = r1.mReportExtData
            return r0
    }

    public final com.kwad.sdk.core.response.model.AdGlobalConfigInfo iy() {
            r1 = this;
            com.kwad.sdk.core.response.model.AdResultData r0 = r1.mAdResultData
            if (r0 == 0) goto L7
            com.kwad.sdk.core.response.model.AdGlobalConfigInfo r0 = r0.adGlobalConfigInfo
            return r0
        L7:
            r0 = 0
            return r0
    }
}
