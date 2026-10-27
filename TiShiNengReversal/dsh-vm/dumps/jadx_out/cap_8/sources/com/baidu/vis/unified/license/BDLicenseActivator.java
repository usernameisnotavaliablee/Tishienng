package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDLicenseActivator {
    public static final java.lang.String TAG = "BDLicenseActivator";

    public BDLicenseActivator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int initLicenseOnLine(android.content.Context r7, java.lang.String r8, java.lang.String r9, int r10) {
            r0 = -1
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L13
            r4 = r8
            goto L14
        L13:
            r4 = r9
        L14:
            com.baidu.vis.unified.license.AndroidLicenser r1 = com.baidu.vis.unified.license.AndroidLicenser.getInstance()
            r5 = 1
            r2 = r7
            r3 = r8
            r6 = r10
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r7 = r1.authFromFile(r2, r3, r4, r5, r6)
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r8 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.SUCCESS
            r9 = 0
            if (r7 != r8) goto L26
            return r9
        L26:
            android.content.Context r7 = r2.getApplicationContext()
            android.content.Context r7 = com.stub.StubApp.getOrigApplicationContext(r7)
            java.lang.String r7 = com.baidu.vis.unified.license.AndroidLicenser.getDeviceId(r7)
            r8 = 2
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L52
            r10.<init>()     // Catch: org.json.JSONException -> L52
            java.lang.String r0 = "deviceId"
            r10.put(r0, r7)     // Catch: org.json.JSONException -> L52
            java.lang.String r7 = "key"
            r10.put(r7, r3)     // Catch: org.json.JSONException -> L52
            java.lang.String r7 = "platformType"
            r10.put(r7, r8)     // Catch: org.json.JSONException -> L52
            java.lang.String r7 = "version"
            r0 = 1
            r10.put(r7, r0)     // Catch: org.json.JSONException -> L52
            java.lang.String r7 = r10.toString()     // Catch: org.json.JSONException -> L52
            goto L53
        L52:
            r7 = 0
        L53:
            java.lang.String r10 = "application/json"
            java.lang.String r0 = "BDLicenseActivator"
            java.lang.String r5 = "https://ai.baidu.com/activation/key/activate"
            com.baidu.vis.unified.license.HttpStatus r7 = com.baidu.vis.unified.license.HttpUtils.requestPost(r5, r7, r10, r0)
            if (r7 != 0) goto L61
            r7 = -2
            return r7
        L61:
            java.lang.String r7 = r7.responseStr
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb1
            r10.<init>(r7)     // Catch: org.json.JSONException -> Lb1
            java.lang.String r7 = "error_code"
            int r7 = r10.optInt(r7)     // Catch: org.json.JSONException -> Lb1
            r0 = -3
            if (r7 == 0) goto L77
            java.lang.String r7 = "error_msg"
            r10.optString(r7)     // Catch: org.json.JSONException -> Lb1
            return r0
        L77:
            java.lang.String r7 = "result"
            org.json.JSONObject r7 = r10.optJSONObject(r7)     // Catch: org.json.JSONException -> Lb1
            if (r7 != 0) goto L80
            return r0
        L80:
            java.lang.String r10 = "license"
            java.lang.String r7 = r7.optString(r10)     // Catch: org.json.JSONException -> Lb1
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> Lb1
            if (r10 == 0) goto L8d
            return r0
        L8d:
            java.lang.String r10 = ","
            java.lang.String[] r7 = r7.split(r10)     // Catch: org.json.JSONException -> Lb1
            if (r7 == 0) goto Lb0
            int r10 = r7.length     // Catch: org.json.JSONException -> Lb1
            if (r10 == r8) goto L99
            goto Lb0
        L99:
            r5 = r4
            r4 = r7
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r7 = r1.authFromMemory(r2, r3, r4, r5, r6)     // Catch: org.json.JSONException -> Lb1
            com.baidu.vis.unified.license.AndroidLicenser$ErrorCode r8 = com.baidu.vis.unified.license.AndroidLicenser.ErrorCode.SUCCESS     // Catch: org.json.JSONException -> Lb1
            if (r7 == r8) goto Laf
            com.baidu.vis.unified.license.BDLicenseLocalInfo r7 = r1.authGetLocalInfo(r2, r6)     // Catch: org.json.JSONException -> Lb1
            r7.toString()     // Catch: org.json.JSONException -> Lb1
            r1.getErrorMsg(r6)     // Catch: org.json.JSONException -> Lb1
            r7 = -4
            return r7
        Laf:
            return r9
        Lb0:
            return r0
        Lb1:
            r7 = -5
            return r7
    }
}
