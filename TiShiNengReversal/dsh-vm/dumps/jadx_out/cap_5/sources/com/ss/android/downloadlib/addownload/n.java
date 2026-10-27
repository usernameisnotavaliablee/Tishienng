package com.ss.android.downloadlib.addownload;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class n implements com.ss.android.socialbase.downloader.downloader.mi {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    public void j(com.ss.android.socialbase.downloader.ae.cw r3, int r4, int r5) {
            r2 = this;
            com.ss.android.downloadlib.addownload.o$f r0 = com.ss.android.downloadlib.addownload.o.f.c()
            com.ss.android.xt.j.xt.b r3 = r0.f(r3)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "reserve_wifi_source"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> L20
            r0.putOpt(r1, r5)     // Catch: org.json.JSONException -> L20
            java.lang.String r5 = "reserve_wifi_status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: org.json.JSONException -> L20
            r0.putOpt(r5, r4)     // Catch: org.json.JSONException -> L20
            goto L24
        L20:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
        L24:
            com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()
            java.lang.String r5 = "pause_reserve_wifi"
            r4.r(r5, r0, r3)
            return
    }
}
