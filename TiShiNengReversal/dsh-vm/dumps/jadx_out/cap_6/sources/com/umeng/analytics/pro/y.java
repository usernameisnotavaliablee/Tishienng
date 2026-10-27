package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class y {
    private static volatile com.umeng.analytics.pro.y c;
    private com.umeng.analytics.pro.w a;
    private java.lang.String b;
    private java.util.List<com.umeng.analytics.pro.y.a> d;
    private java.lang.String e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1, long r2, long r4, long r6);

        void a(java.lang.String r1, java.lang.String r2, long r3, long r5, long r7);
    }

    private y() {
            r1 = this;
            r1.<init>()
            com.umeng.analytics.pro.x r0 = new com.umeng.analytics.pro.x
            r0.<init>()
            r1.a = r0
            return
    }

    private long a(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            android.content.SharedPreferences r4 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r4)     // Catch: java.lang.Exception -> Lb
            long r4 = r4.getLong(r5, r0)     // Catch: java.lang.Exception -> Lb
            goto Ld
        Lb:
            r4 = r0
        Ld:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L15
            long r4 = java.lang.System.currentTimeMillis()
        L15:
            return r4
    }

    public static com.umeng.analytics.pro.y a() {
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.c
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.analytics.pro.y> r0 = com.umeng.analytics.pro.y.class
            monitor-enter(r0)
            com.umeng.analytics.pro.y r1 = com.umeng.analytics.pro.y.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.analytics.pro.y r1 = new com.umeng.analytics.pro.y     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.pro.y.c = r1     // Catch: java.lang.Throwable -> L13
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
            com.umeng.analytics.pro.y r0 = com.umeng.analytics.pro.y.c
            return r0
    }

    private void a(long r12, long r14, long r16, java.lang.String r18, boolean r19) {
            r11 = this;
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r11.d
            if (r0 == 0) goto L2f
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.umeng.analytics.pro.y$a r2 = (com.umeng.analytics.pro.y.a) r2
            if (r19 == 0) goto L25
            java.lang.String r4 = r11.b     // Catch: java.lang.Exception -> L23
            r5 = r12
            r7 = r14
            r9 = r16
            r3 = r18
            r2.a(r3, r4, r5, r7, r9)     // Catch: java.lang.Exception -> L23
            goto L8
        L23:
            goto L8
        L25:
            java.lang.String r3 = r11.b     // Catch: java.lang.Exception -> L23
            r4 = r12
            r6 = r14
            r8 = r16
            r2.a(r3, r4, r6, r8)     // Catch: java.lang.Exception -> L23
            goto L8
        L2f:
            return
    }

    private java.lang.String f(android.content.Context r13) {
            r12 = this;
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r13)     // Catch: java.lang.Exception -> L15
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L15
            java.lang.String r1 = "pre_session_id"
            java.lang.String r2 = r12.d(r13)     // Catch: java.lang.Exception -> L15
            r0.putString(r1, r2)     // Catch: java.lang.Exception -> L15
            r0.commit()     // Catch: java.lang.Exception -> L15
            goto L16
        L15:
        L16:
            long r6 = r12.h(r13)
            long r4 = r12.i(r13)
            java.lang.String r10 = r12.b
            long r0 = com.umeng.analytics.pro.u.a(r13)
            r2 = 5000(0x1388, double:2.4703E-320)
            long r8 = r0 * r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "--->>>*** 读取 foreground count 值完成，count次数："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            java.lang.String r0 = "header_foreground_count"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 == 0) goto L5b
            boolean r0 = com.umeng.commonsdk.framework.UMWorkDispatch.eventHasExist()
            if (r0 == 0) goto L55
            java.lang.String r0 = "--->>>*** 读取 foreground count druation值完成，终止checker timer."
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            com.umeng.commonsdk.framework.UMWorkDispatch.removeEvent()
            goto L60
        L55:
            java.lang.String r0 = "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
            goto L60
        L5b:
            java.lang.String r0 = "--->>>*** foreground count druation云控参数关闭。"
            com.umeng.commonsdk.debug.UMRTLog.e(r1, r0)
        L60:
            r11 = 0
            r3 = r12
            r3.a(r4, r6, r8, r10, r11)
            com.umeng.analytics.pro.w r0 = r3.a
            java.lang.String r0 = r0.a(r13)
            r3.b = r0
            r11 = 1
            r3.a(r4, r6, r8, r10, r11)
            com.umeng.analytics.pro.w r0 = r3.a
            java.lang.String r1 = r3.b
            r0.a(r13, r1)
            java.lang.String r13 = r3.b
            return r13
    }

    private boolean g(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = r6.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            com.umeng.analytics.pro.i r7 = com.umeng.analytics.pro.i.a(r7)
            java.lang.String r0 = r6.b
            long r2 = r7.a(r0)
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1c
            r7 = 1
            return r7
        L1c:
            return r1
    }

    private long h(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "a_end_time"
            long r0 = r2.a(r3, r0)
            return r0
    }

    private long i(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "session_start_time"
            long r0 = r2.a(r3, r0)
            return r0
    }

    private boolean j(android.content.Context r11) {
            r10 = this;
            android.content.Context r11 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r11)
            android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r11)     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = "a_start_time"
            r2 = 0
            long r4 = r0.getLong(r1, r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = "a_end_time"
            long r0 = r0.getLong(r1, r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r6 = "header_foreground_count"
            boolean r6 = com.umeng.commonsdk.config.FieldManager.allow(r6)     // Catch: java.lang.Exception -> L58
            java.lang.String r7 = "MobclickRT"
            if (r6 == 0) goto L3b
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L3b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L3b
            long r8 = com.umeng.analytics.pro.u.a(r11)     // Catch: java.lang.Exception -> L58
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 <= 0) goto L3b
            r0 = 5000(0x1388, double:2.4703E-320)
            long r8 = r8 * r0
            java.lang.String r11 = "--->>> last session end time stamp = 0, reconstruct it by foreground count value."
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)     // Catch: java.lang.Exception -> L58
            long r0 = r4 + r8
        L3b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r11.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r2 = "--->>> interval of last session is: "
            r11.append(r2)     // Catch: java.lang.Exception -> L58
            long r2 = r0 - r4
            r11.append(r2)     // Catch: java.lang.Exception -> L58
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L58
            com.umeng.commonsdk.debug.UMRTLog.i(r7, r11)     // Catch: java.lang.Exception -> L58
            com.umeng.analytics.pro.w r11 = r10.a     // Catch: java.lang.Exception -> L58
            boolean r11 = r11.a(r4, r0)     // Catch: java.lang.Exception -> L58
            return r11
        L58:
            r11 = 0
            return r11
    }

    public java.lang.String a(android.content.Context r5) {
            r4 = this;
            android.content.Context r5 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r5)
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            java.lang.String r0 = ""
            java.lang.Class<com.umeng.analytics.pro.y> r1 = com.umeng.analytics.pro.y.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L1f
            android.content.SharedPreferences r5 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "pre_session_id"
            java.lang.String r3 = ""
            java.lang.String r0 = r5.getString(r2, r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return r0
        L1c:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            throw r5     // Catch: java.lang.Exception -> L1f
        L1f:
            return r0
    }

    public java.lang.String a(android.content.Context r3, long r4) {
            r2 = this;
            java.lang.String r3 = r2.e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "SUB"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "%0"
            r5.append(r0)
            int r3 = r3.length()
            int r3 = 32 - r3
            r5.append(r3)
            java.lang.String r3 = "d"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r5 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r0
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.e = r3
        L54:
            java.lang.String r3 = r2.e
            return r3
    }

    public void a(long r2) {
            r1 = this;
            com.umeng.analytics.pro.w r0 = r1.a
            r0.a(r2)
            return
    }

    public void a(com.umeng.analytics.pro.y.a r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L1b
        L3:
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r1.d
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
        Le:
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r1.d
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1b
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r1.d
            r0.add(r2)
        L1b:
            return
    }

    public long b() {
            r2 = this;
            com.umeng.analytics.pro.w r0 = r2.a
            long r0 = r0.a()
            return r0
    }

    public synchronized java.lang.String b(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            android.content.Context r2 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r2)     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto Ld
            java.lang.String r2 = ""
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            goto L23
        Ld:
            java.lang.String r0 = r1.d(r2)     // Catch: java.lang.Throwable -> Lb
            r1.b = r0     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r1.e(r2)     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1f
            java.lang.String r2 = r1.f(r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L1f
            r1.b = r2     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L1f
        L1f:
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public void b(com.umeng.analytics.pro.y.a r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r1.d
            if (r0 == 0) goto L12
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            java.util.List<com.umeng.analytics.pro.y$a> r0 = r1.d
            r0.remove(r2)
        L12:
            return
    }

    public java.lang.String c(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = com.umeng.commonsdk.service.UMGlobalContext.getAppContext(r1)
            if (r1 != 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            java.lang.String r1 = r0.f(r1)     // Catch: java.lang.Exception -> Lf
            r0.b = r1     // Catch: java.lang.Exception -> Lf
        Lf:
            java.lang.String r1 = r0.b
            return r1
    }

    public java.lang.String d(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = r2.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L15
            android.content.SharedPreferences r3 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r3)     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = "session_id"
            r1 = 0
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Exception -> L15
            r2.b = r3     // Catch: java.lang.Exception -> L15
        L15:
            java.lang.String r3 = r2.b
            return r3
    }

    public boolean e(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Le
            java.lang.String r0 = r1.d(r2)
            r1.b = r0
        Le:
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            boolean r0 = r1.j(r2)
            if (r0 != 0) goto L25
            boolean r2 = r1.g(r2)
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = 0
            return r2
        L25:
            r2 = 1
            return r2
    }
}
