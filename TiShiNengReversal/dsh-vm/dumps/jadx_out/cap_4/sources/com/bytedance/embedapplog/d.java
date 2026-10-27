package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class d implements com.bytedance.embedapplog.tk {
    d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r2) {
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 <= r0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "content://cn.nubia.identity/identity"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L22
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L22
            android.content.ContentProviderClient r5 = r5.acquireContentProviderClient(r0)     // Catch: java.lang.Exception -> L22
            if (r5 != 0) goto L14
            return r1
        L14:
            java.lang.String r0 = "getOAID"
            android.os.Bundle r0 = r5.call(r0, r1, r1)     // Catch: java.lang.Exception -> L22
            r3 = 24
            if (r2 < r3) goto L24
            androidx.core.provider.c.a(r5)     // Catch: java.lang.Exception -> L22
            goto L27
        L22:
            r5 = move-exception
            goto L51
        L24:
            r5.release()     // Catch: java.lang.Exception -> L22
        L27:
            if (r0 != 0) goto L2a
            return r1
        L2a:
            java.lang.String r5 = "code"
            r2 = -1
            int r5 = r0.getInt(r5, r2)     // Catch: java.lang.Exception -> L22
            if (r5 != 0) goto L41
            com.bytedance.embedapplog.tk$j r5 = new com.bytedance.embedapplog.tk$j     // Catch: java.lang.Exception -> L22
            r5.<init>()     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getString(r2)     // Catch: java.lang.Exception -> L22
            r5.xt = r0     // Catch: java.lang.Exception -> L22
            return r5
        L41:
            java.lang.String r5 = "message"
            java.lang.String r5 = r0.getString(r5)     // Catch: java.lang.Exception -> L22
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L22
            if (r0 != 0) goto L50
            com.bytedance.embedapplog.uc.xt(r5)     // Catch: java.lang.Exception -> L22
        L50:
            return r1
        L51:
            com.bytedance.embedapplog.uc.j(r5)
            return r1
    }
}
