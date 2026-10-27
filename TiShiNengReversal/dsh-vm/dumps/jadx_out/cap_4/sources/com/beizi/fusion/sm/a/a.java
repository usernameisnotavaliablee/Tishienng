package com.beizi.fusion.sm.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "oaid_limit_state"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r1)     // Catch: java.lang.Throwable -> L27
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L27
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L27
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "oaid"
            java.lang.String r2 = android.provider.Settings.Global.getString(r2, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L27
            return r2
        L27:
            java.lang.String r2 = ""
            return r2
    }
}
