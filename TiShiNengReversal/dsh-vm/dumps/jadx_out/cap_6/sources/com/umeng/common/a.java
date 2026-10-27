package com.umeng.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static java.lang.String a = null;
    private static final java.lang.String b = "umeng+";
    private static final java.lang.String c = "ek__id";
    private static final java.lang.String d = "ek_key";
    private static java.lang.String e = "";
    private static final java.lang.String f = null;
    private static java.lang.String g;
    private static com.umeng.common.a h;

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "uspi"
            java.lang.String r0 = r0.b(r1)
            com.umeng.common.a.f = r0
            java.lang.String r0 = ""
            com.umeng.common.a.g = r0
            return
    }

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.common.a a() {
            com.umeng.common.a r0 = com.umeng.common.a.h
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.common.a> r0 = com.umeng.common.a.class
            monitor-enter(r0)
            com.umeng.common.a r1 = com.umeng.common.a.h     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.common.a r1 = new com.umeng.common.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.umeng.common.a.h = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.umeng.common.a r0 = com.umeng.common.a.h
            return r0
    }

    private java.lang.String c(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ""
            r1 = 9
            r2 = 1
            java.lang.String r7 = r7.substring(r2, r1)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r1.<init>()     // Catch: java.lang.Throwable -> L63
            r2 = 0
            r3 = 0
        L10:
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L63
            if (r3 >= r4) goto L42
            char r4 = r7.charAt(r3)     // Catch: java.lang.Throwable -> L63
            boolean r5 = java.lang.Character.isDigit(r4)     // Catch: java.lang.Throwable -> L63
            if (r5 == 0) goto L3c
            java.lang.String r5 = java.lang.Character.toString(r4)     // Catch: java.lang.Throwable -> L63
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L2e
            r1.append(r2)     // Catch: java.lang.Throwable -> L63
            goto L3f
        L2e:
            java.lang.String r4 = java.lang.Character.toString(r4)     // Catch: java.lang.Throwable -> L63
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L63
            int r4 = 10 - r4
            r1.append(r4)     // Catch: java.lang.Throwable -> L63
            goto L3f
        L3c:
            r1.append(r4)     // Catch: java.lang.Throwable -> L63
        L3f:
            int r3 = r3 + 1
            goto L10
        L42:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r7.<init>()     // Catch: java.lang.Throwable -> L63
            r7.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = r1.reverse()     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L63
            r7.append(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L63
            return r7
        L63:
            return r0
    }

    public java.lang.String a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = com.umeng.common.a.a     // Catch: java.lang.Exception -> L1d
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L9
            return r2
        L9:
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Exception -> L1d
            java.lang.String r0 = com.umeng.common.a.a     // Catch: java.lang.Exception -> L1d
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L1d
            byte[] r2 = com.umeng.commonsdk.statistics.common.DataHelper.encrypt(r2, r0)     // Catch: java.lang.Exception -> L1d
            r0 = 0
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r0)     // Catch: java.lang.Exception -> L1d
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public void a(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "ek__id"
            java.lang.String r1 = com.umeng.common.a.a     // Catch: java.lang.Throwable -> L80
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L80
            if (r1 == 0) goto L80
            java.lang.String r1 = com.umeng.commonsdk.utils.UMUtils.getMultiProcessSP(r5, r0)     // Catch: java.lang.Throwable -> L80
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L80
            java.lang.String r3 = "MobclickRT"
            if (r2 != 0) goto L32
            java.lang.String r1 = r4.c(r1)     // Catch: java.lang.Throwable -> L80
            com.umeng.common.a.e = r1     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r1.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = "--->>>> primaryKey: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L80
            java.lang.String r2 = com.umeng.common.a.e     // Catch: java.lang.Throwable -> L80
            r1.append(r2)     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L80
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r1)     // Catch: java.lang.Throwable -> L80
        L32:
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L80
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)     // Catch: java.lang.Throwable -> L80
            java.lang.String r1 = com.umeng.common.a.f     // Catch: java.lang.Throwable -> L80
            r2 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L60
            r1 = 0
            java.lang.String r5 = r5.getString(r0, r1)     // Catch: java.lang.Throwable -> L80
            com.umeng.common.a.g = r5     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r5.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "--->>> 子进程备份秘钥：主进程key: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = com.umeng.common.a.g     // Catch: java.lang.Throwable -> L80
            r5.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L80
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r5)     // Catch: java.lang.Throwable -> L80
        L60:
            java.lang.String r5 = com.umeng.commonsdk.utils.UMUtils.genId()     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L80
            com.umeng.common.a.a = r5     // Catch: java.lang.Throwable -> L80
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            r5.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "--->>>> 正式秘钥：key: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = com.umeng.common.a.a     // Catch: java.lang.Throwable -> L80
            r5.append(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L80
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r5)     // Catch: java.lang.Throwable -> L80
        L80:
            return
    }

    public java.lang.String b(java.lang.String r7) {
            r6 = this;
            r0 = 0
            java.lang.String r1 = com.umeng.common.a.a     // Catch: java.lang.Exception -> L22
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L22
            if (r1 == 0) goto La
            return r7
        La:
            byte[] r1 = r7.getBytes()     // Catch: java.lang.Exception -> L22
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = com.umeng.common.a.a     // Catch: java.lang.Exception -> L22
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Exception -> L22
            byte[] r1 = com.umeng.commonsdk.statistics.common.DataHelper.decrypt(r1, r3)     // Catch: java.lang.Exception -> L22
            r2.<init>(r1)     // Catch: java.lang.Exception -> L22
            return r2
        L22:
            java.lang.String r1 = "--->>> 子进程事件数据解密失败!"
            java.lang.String r2 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)
            java.lang.String r1 = com.umeng.common.a.e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r1 != 0) goto L80
            java.lang.String r1 = "--->>> 子进程事件数据解密失败，换老秘钥重试"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)
            byte[] r1 = r7.getBytes()     // Catch: java.lang.Exception -> L57
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L57
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L57
            java.lang.String r5 = com.umeng.common.a.e     // Catch: java.lang.Exception -> L57
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Exception -> L57
            byte[] r1 = com.umeng.commonsdk.statistics.common.DataHelper.decrypt(r1, r5)     // Catch: java.lang.Exception -> L57
            r4.<init>(r1)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = "--->>> 子进程事件数据解密失败，换老秘钥重试成功。"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)     // Catch: java.lang.Exception -> L56
            r3 = r4
            goto L80
        L56:
            r3 = r4
        L57:
            java.lang.String r1 = "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L7b
            byte[] r7 = android.util.Base64.decode(r7, r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = com.umeng.common.a.g     // Catch: java.lang.Throwable -> L7b
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L7b
            byte[] r7 = com.umeng.commonsdk.statistics.common.DataHelper.decrypt(r7, r1)     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "--->>> 子进程事件数据解密失败，子进程备份key重试成功。"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r7)     // Catch: java.lang.Throwable -> L7a
            r3 = r0
            goto L80
        L7a:
            r3 = r0
        L7b:
            java.lang.String r7 = "--->>> 子进程事件数据解密失败，子进程备份key重试失败。"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r7)
        L80:
            return r3
    }
}
