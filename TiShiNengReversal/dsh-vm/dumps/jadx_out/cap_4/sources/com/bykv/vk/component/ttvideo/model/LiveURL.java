package com.bykv.vk.component.ttvideo.model;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LiveURL {
    public final java.lang.String backupURL;
    public final java.lang.String mainURL;
    public java.lang.String sdkParams;

    public LiveURL(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.mainURL = r1
            r0.backupURL = r2
            r0.sdkParams = r3
            return
    }

    public static com.bykv.vk.component.ttvideo.model.LiveURL build(org.json.JSONObject r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.bykv.vk.component.ttvideo.model.LiveURL r0 = new com.bykv.vk.component.ttvideo.model.LiveURL
            java.lang.String r1 = "main_play_url"
            java.lang.String r1 = r4.optString(r1)
            java.lang.String r2 = "backup_play_url"
            java.lang.String r2 = r4.optString(r2)
            java.lang.String r3 = "SdkParams"
            java.lang.String r4 = r4.optString(r3)
            r0.<init>(r1, r2, r4)
            return r0
    }

    public java.lang.String getVCodec() {
            r4 = this;
            r0 = 0
            java.lang.String r1 = r4.sdkParams     // Catch: org.json.JSONException -> Ld
            if (r1 == 0) goto L11
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld
            java.lang.String r2 = r4.sdkParams     // Catch: org.json.JSONException -> Ld
            r1.<init>(r2)     // Catch: org.json.JSONException -> Ld
            goto L12
        Ld:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
        L11:
            r1 = r0
        L12:
            if (r1 == 0) goto L27
            java.lang.String r2 = "VCodec"
            boolean r3 = r1.has(r2)
            if (r3 == 0) goto L27
            java.lang.String r1 = r1.optString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L27
            return r1
        L27:
            return r0
    }
}
