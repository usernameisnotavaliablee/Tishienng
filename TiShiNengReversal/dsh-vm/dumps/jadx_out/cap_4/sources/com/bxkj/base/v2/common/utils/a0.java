package com.bxkj.base.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a0 {
    protected static final java.lang.String a = "gank_device_id.xml";
    protected static final java.lang.String b = "gank_device_id";
    protected static java.lang.String c;

    public a0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r4) {
            java.lang.Class<com.bxkj.base.v2.common.utils.a0> r0 = com.bxkj.base.v2.common.utils.a0.class
            monitor-enter(r0)
            java.lang.String r1 = com.bxkj.base.v2.common.utils.a0.c     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L86
            if (r1 != 0) goto L86
            android.content.Context r1 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L24
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "gank_device_id.xml"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "gank_device_id"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            com.bxkj.base.v2.common.utils.a0.c = r2     // Catch: java.lang.Throwable -> L24
            goto L86
        L24:
            r4 = move-exception
            goto L8a
        L26:
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "android_id"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r3)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L4d
            java.lang.String r3 = "9774d56d682e549c"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            if (r3 != 0) goto L4d
            java.lang.String r4 = "utf8"
            byte[] r4 = r2.getBytes(r4)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            com.bxkj.base.v2.common.utils.a0.c = r4     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            goto L70
        L4b:
            r4 = move-exception
            goto L80
        L4d:
            java.lang.String r2 = "phone"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            java.lang.String r4 = r4.getDeviceId()     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            if (r4 == 0) goto L66
            java.lang.String r2 = "utf8"
            byte[] r4 = r4.getBytes(r2)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            java.util.UUID r4 = java.util.UUID.nameUUIDFromBytes(r4)     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            goto L6a
        L66:
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
        L6a:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
            com.bxkj.base.v2.common.utils.a0.c = r4     // Catch: java.lang.Throwable -> L24 java.io.UnsupportedEncodingException -> L4b
        L70:
            android.content.SharedPreferences$Editor r4 = r1.edit()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "gank_device_id"
            java.lang.String r2 = com.bxkj.base.v2.common.utils.a0.c     // Catch: java.lang.Throwable -> L24
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r2)     // Catch: java.lang.Throwable -> L24
            r4.commit()     // Catch: java.lang.Throwable -> L24
            goto L86
        L80:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L24
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        L86:
            java.lang.String r4 = com.bxkj.base.v2.common.utils.a0.c     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r4
        L8a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r4
    }
}
