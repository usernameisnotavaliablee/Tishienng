package com.umeng.commonsdk.statistics.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class PreferenceWrapper {
    private static final java.lang.String DEFAULT_PREFERENCE = null;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "ugc"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.statistics.internal.PreferenceWrapper.DEFAULT_PREFERENCE = r0
            return
    }

    private PreferenceWrapper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.SharedPreferences getDefault(android.content.Context r2) {
            if (r2 == 0) goto La
            java.lang.String r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.DEFAULT_PREFERENCE
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
        La:
            r2 = 0
            return r2
    }

    public static android.content.SharedPreferences getInstance(android.content.Context r1, java.lang.String r2) {
            if (r1 == 0) goto L8
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            return r1
        L8:
            r1 = 0
            return r1
    }
}
