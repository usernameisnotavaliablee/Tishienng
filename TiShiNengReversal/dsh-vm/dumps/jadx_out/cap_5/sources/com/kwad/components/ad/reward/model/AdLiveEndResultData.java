package com.kwad.components.ad.reward.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class AdLiveEndResultData extends com.kwad.sdk.core.response.model.BaseResultData {
    private static final long serialVersionUID = 1126369604146892297L;
    public com.kwad.components.ad.reward.model.AdLiveEndResultData.AdLivePushEndInfo mQLivePushEndInfo;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class AdLivePushEndInfo implements com.kwad.sdk.core.b, java.io.Serializable {
        public static final java.lang.String KET_CONFIG_DISPLAY_LIKE_USER_COUNT = "displayLikeUserCount";
        public static final java.lang.String KET_CONFIG_DISPLAY_WATCHING_USER_COUNT = "displayWatchingUserCount";
        public static final java.lang.String KET_CONFIG_LIKE_USER_COUNT = "likeUserCount";
        public static final java.lang.String KET_CONFIG_LIVE_DURATION = "liveDuration";
        public static final java.lang.String KET_CONFIG_TOTAL_WATCHING_DURATION = "totalWatchingDuration";
        public static final java.lang.String KET_CONFIG_WATCHING_USER_COUNT = "watchingUserCount";
        private static final long serialVersionUID = 7611577990274486211L;
        public java.lang.String mDisplayLikeUserCount;
        public java.lang.String mDisplayWatchingUserCount;
        public int mLikeUserCount;
        public long mLiveDuration;
        public long mTotalWatchingDuration;
        public int mWatchingUserCount;

        public AdLivePushEndInfo() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "0"
                r1.mDisplayWatchingUserCount = r0
                r1.mDisplayLikeUserCount = r0
                return
        }

        @Override // com.kwad.sdk.core.b
        public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r5) {
                r4 = this;
                if (r5 != 0) goto L3
                return
            L3:
                java.lang.String r0 = "totalWatchingDuration"
                long r0 = r5.optLong(r0)
                r4.mTotalWatchingDuration = r0
                java.lang.String r0 = "watchingUserCount"
                int r0 = r5.optInt(r0)
                r4.mWatchingUserCount = r0
                java.lang.String r0 = "displayWatchingUserCount"
                java.lang.String r1 = "0"
                java.lang.String r0 = r5.optString(r0, r1)
                r4.mDisplayWatchingUserCount = r0
                java.lang.String r0 = "liveDuration"
                long r2 = r5.optLong(r0)
                r4.mLiveDuration = r2
                java.lang.String r0 = "likeUserCount"
                int r0 = r5.optInt(r0)
                r4.mLikeUserCount = r0
                java.lang.String r0 = "displayLikeUserCount"
                java.lang.String r5 = r5.optString(r0, r1)
                r4.mDisplayLikeUserCount = r5
                return
        }

        @Override // com.kwad.sdk.core.b
        public org.json.JSONObject toJson() {
                r4 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                java.lang.String r1 = "totalWatchingDuration"
                long r2 = r4.mTotalWatchingDuration
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "watchingUserCount"
                int r2 = r4.mWatchingUserCount
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "displayWatchingUserCount"
                java.lang.String r2 = r4.mDisplayWatchingUserCount
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "liveDuration"
                long r2 = r4.mLiveDuration
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "likeUserCount"
                int r2 = r4.mLikeUserCount
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                java.lang.String r1 = "displayLikeUserCount"
                java.lang.String r2 = r4.mDisplayLikeUserCount
                com.kwad.sdk.utils.aa.putValue(r0, r1, r2)
                return r0
        }
    }

    public AdLiveEndResultData() {
            r1 = this;
            r1.<init>()
            com.kwad.components.ad.reward.model.AdLiveEndResultData$AdLivePushEndInfo r0 = new com.kwad.components.ad.reward.model.AdLiveEndResultData$AdLivePushEndInfo
            r0.<init>()
            r1.mQLivePushEndInfo = r0
            return
    }

    @Override // com.kwad.sdk.core.response.model.BaseResultData, com.kwad.sdk.core.b
    public void parseJson(@androidx.annotation.Nullable org.json.JSONObject r2) {
            r1 = this;
            super.parseJson(r2)
            if (r2 != 0) goto L6
            return
        L6:
            com.kwad.components.ad.reward.model.AdLiveEndResultData$AdLivePushEndInfo r0 = r1.mQLivePushEndInfo
            r0.parseJson(r2)
            return
    }

    @Override // com.kwad.sdk.core.response.model.BaseResultData, com.kwad.sdk.core.b
    public org.json.JSONObject toJson() {
            r1 = this;
            com.kwad.components.ad.reward.model.AdLiveEndResultData$AdLivePushEndInfo r0 = r1.mQLivePushEndInfo
            org.json.JSONObject r0 = r0.toJson()
            return r0
    }
}
