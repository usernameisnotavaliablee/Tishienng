package cn.jpush.android.h;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r5, java.lang.String r6, cn.jpush.android.e.c r7) {
            java.lang.String r0 = "ups.register"
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r2 = ""
            java.lang.String r3 = "PushPlatformManager"
            if (r1 == 0) goto L1e
            java.lang.String r5 = "appId is empty"
            cn.jpush.android.i.b.g(r3, r5)
            if (r7 == 0) goto L83
            cn.jpush.android.e.b r6 = new cn.jpush.android.e.b
            int r0 = cn.jpush.android.f.f.f1799b
            r6.<init>(r0, r2, r5)
            r7.a(r6)
            return
        L1e:
            int r1 = r6.length()
            r4 = 24
            if (r1 == r4) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid appId : "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = ", Please check your appId again!"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            cn.jpush.android.i.b.g(r3, r5)
            if (r7 == 0) goto L83
            cn.jpush.android.e.b r5 = new cn.jpush.android.e.b
            int r6 = cn.jpush.android.f.f.f1799b
            java.lang.String r0 = "Invalid appId"
            r5.<init>(r6, r2, r0)
            r7.a(r5)
            return
        L4b:
            cn.jpush.android.f.c.f1788b = r6     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "register: appId - "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L83
            r1.append(r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.i.b.b(r3, r1)     // Catch: java.lang.Throwable -> L83
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L83
            r1.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "JPUSH_APPKEY"
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L83
            boolean r6 = cn.jpush.android.a.b.c(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = "FIRST_REQUESTA"
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.a.b.d(r5)     // Catch: java.lang.Throwable -> L83
            long r2 = cn.jpush.android.f.c.a()     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.f.b r6 = new cn.jpush.android.f.b     // Catch: java.lang.Throwable -> L83
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.f.a.a(r6, r7)     // Catch: java.lang.Throwable -> L83
            cn.jpush.android.f.c.a(r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L83
        L83:
            return
    }
}
