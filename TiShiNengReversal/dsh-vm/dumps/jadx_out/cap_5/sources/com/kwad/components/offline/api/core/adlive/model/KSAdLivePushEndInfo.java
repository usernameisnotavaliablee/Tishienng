package com.kwad.components.offline.api.core.adlive.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class KSAdLivePushEndInfo implements java.io.Serializable {
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

    public KSAdLivePushEndInfo() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "0"
            r1.mDisplayWatchingUserCount = r0
            r1.mDisplayLikeUserCount = r0
            return
    }

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

    public org.json.JSONObject toJson(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "totalWatchingDuration"
            long r1 = r3.mTotalWatchingDuration
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            java.lang.String r0 = "watchingUserCount"
            int r1 = r3.mWatchingUserCount
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            java.lang.String r0 = "displayWatchingUserCount"
            java.lang.String r1 = r3.mDisplayWatchingUserCount
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            java.lang.String r0 = "liveDuration"
            long r1 = r3.mLiveDuration
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            java.lang.String r0 = "likeUserCount"
            int r1 = r3.mLikeUserCount
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            java.lang.String r0 = "displayLikeUserCount"
            java.lang.String r1 = r3.mDisplayLikeUserCount
            com.kwad.sdk.utils.aa.putValue(r4, r0, r1)
            return r4
    }
}
