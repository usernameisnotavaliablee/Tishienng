package com.kwai.adclient.kscommerciallogger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b {
    private static final java.lang.String[] beo = null;

    static {
            java.lang.String r0 = "segment_name_top1"
            java.lang.String r1 = "segment_count_top1"
            java.lang.String r2 = "cache_limit"
            java.lang.String r3 = "cache_num"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            com.kwai.adclient.kscommerciallogger.b.beo = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean hM(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "^[a-z][a-z0-9]*(_{1}[a-z0-9]+)+$"
            boolean r1 = java.util.regex.Pattern.matches(r0, r1)
            return r1
    }

    public static java.lang.String z(org.json.JSONObject r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
