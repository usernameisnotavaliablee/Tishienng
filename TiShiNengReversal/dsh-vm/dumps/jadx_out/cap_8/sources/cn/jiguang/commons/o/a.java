package cn.jiguang.commons.o;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r4, android.net.Uri r5) {
            java.lang.String r0 = "NubiaIdManager"
            r1 = 0
            java.lang.String r2 = "Oi3ZFT8+schQHSyFZbsdUg=="
            java.lang.String r2 = cn.jiguang.commons.L.ad.d(r2)     // Catch: java.lang.Exception -> L12
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L14
            java.lang.String r4 = ""
            return r4
        L12:
            r4 = move-exception
            goto L58
        L14:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L12
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Exception -> L12
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r5)     // Catch: java.lang.Exception -> L12
            android.os.Bundle r5 = r4.call(r2, r1, r1)     // Catch: java.lang.Exception -> L12
            r2 = 24
            if (r3 < r2) goto L2a
            androidx.core.provider.c.a(r4)     // Catch: java.lang.Exception -> L12
            goto L2d
        L2a:
            r4.release()     // Catch: java.lang.Exception -> L12
        L2d:
            java.lang.String r4 = "code"
            r2 = -1
            int r4 = r5.getInt(r4, r2)     // Catch: java.lang.Exception -> L12
            if (r4 != 0) goto L51
            java.lang.String r4 = "id"
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.Exception -> L12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12
            r5.<init>()     // Catch: java.lang.Exception -> L12
            java.lang.String r2 = "succeed:"
            r5.append(r2)     // Catch: java.lang.Exception -> L12
            r5.append(r4)     // Catch: java.lang.Exception -> L12
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L12
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L12
            return r4
        L51:
            java.lang.String r4 = "message"
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.Exception -> L12
            return r4
        L58:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = "get ids-o err:"
            r5.append(r2)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.f(r0, r4)
            return r1
    }
}
