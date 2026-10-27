package com.tencent.connect.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class a {
    private static java.lang.Class<?> a;
    private static java.lang.Class<?> b;
    private static java.lang.reflect.Method c;
    private static java.lang.reflect.Method d;
    private static java.lang.reflect.Method e;
    private static java.lang.reflect.Method f;
    private static boolean g;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r3, com.tencent.connect.auth.QQToken r4, java.lang.String r5, java.lang.String... r6) {
            boolean r0 = com.tencent.connect.a.a.g
            if (r0 != 0) goto L5
            return
        L5:
            b(r3, r4)
            java.lang.reflect.Method r4 = com.tencent.connect.a.a.d     // Catch: java.lang.Exception -> L1c
            java.lang.Class<?> r0 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L1c
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Exception -> L1c
            r3 = 1
            r1[r3] = r5     // Catch: java.lang.Exception -> L1c
            r3 = 2
            r1[r3] = r6     // Catch: java.lang.Exception -> L1c
            r4.invoke(r0, r1)     // Catch: java.lang.Exception -> L1c
            return
        L1c:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "trackCustomEvent exception: "
            r4.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "OpenConfig"
            com.tencent.open.log.SLog.e(r4, r3)
            return
    }

    public static boolean a(android.content.Context r0, com.tencent.connect.auth.QQToken r1) {
            java.lang.String r1 = r1.getAppId()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r1)
            java.lang.String r1 = "Common_ta_enable"
            boolean r0 = r0.b(r1)
            return r0
    }

    public static void b(android.content.Context r3, com.tencent.connect.auth.QQToken r4) {
            boolean r3 = a(r3, r4)     // Catch: java.lang.Exception -> L24
            r4 = 0
            r0 = 1
            if (r3 == 0) goto L16
            java.lang.reflect.Method r3 = com.tencent.connect.a.a.f     // Catch: java.lang.Exception -> L24
            java.lang.Class<?> r1 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L24
            r0[r4] = r2     // Catch: java.lang.Exception -> L24
            r3.invoke(r1, r0)     // Catch: java.lang.Exception -> L24
            return
        L16:
            java.lang.reflect.Method r3 = com.tencent.connect.a.a.f     // Catch: java.lang.Exception -> L24
            java.lang.Class<?> r1 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L24
            r0[r4] = r2     // Catch: java.lang.Exception -> L24
            r3.invoke(r1, r0)     // Catch: java.lang.Exception -> L24
            return
        L24:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "checkStatStatus exception: "
            r4.append(r0)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "OpenConfig"
            com.tencent.open.log.SLog.e(r4, r3)
            return
    }

    public static void c(android.content.Context r12, com.tencent.connect.auth.QQToken r13) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.String r2 = r13.getAppId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Aqc"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "com.tencent.stat.StatConfig"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.a = r3     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "com.tencent.stat.StatService"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.b = r3     // Catch: java.lang.Exception -> L113
            java.lang.String r4 = "reportQQ"
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L113
            r7 = 0
            r6[r7] = r1     // Catch: java.lang.Exception -> L113
            r8 = 1
            r6[r8] = r0     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r3 = r3.getMethod(r4, r6)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.c = r3     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L113
            java.lang.String r4 = "trackCustomEvent"
            r6 = 3
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L113
            r9[r7] = r1     // Catch: java.lang.Exception -> L113
            r9[r8] = r0     // Catch: java.lang.Exception -> L113
            java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
            r9[r5] = r10     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r3 = r3.getMethod(r4, r9)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.d = r3     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L113
            java.lang.String r4 = "commitEvents"
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L113
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L113
            r10[r7] = r1     // Catch: java.lang.Exception -> L113
            r10[r8] = r9     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r3 = r3.getMethod(r4, r10)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.e = r3     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r4 = "setEnableStatService"
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L113
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L113
            r11[r7] = r10     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r3 = r3.getMethod(r4, r11)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.f = r3     // Catch: java.lang.Exception -> L113
            b(r12, r13)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r13 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "setAutoExceptionCaught"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L113
            r4[r7] = r10     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r13 = r13.getMethod(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L113
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L113
            r4[r7] = r11     // Catch: java.lang.Exception -> L113
            r13.invoke(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r13 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "setEnableSmartReporting"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L113
            r4[r7] = r10     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r13 = r13.getMethod(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L113
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L113
            r4[r7] = r10     // Catch: java.lang.Exception -> L113
            r13.invoke(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r13 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "setSendPeriodMinutes"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L113
            r4[r7] = r9     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r13 = r13.getMethod(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            r4 = 1440(0x5a0, float:2.018E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L113
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L113
            r9[r7] = r4     // Catch: java.lang.Exception -> L113
            r13.invoke(r3, r9)     // Catch: java.lang.Exception -> L113
            java.lang.String r13 = "com.tencent.stat.StatReportStrategy"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r3 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r4 = "setStatSendStrategy"
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch: java.lang.Exception -> L113
            r9[r7] = r13     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r3 = r3.getMethod(r4, r9)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r4 = com.tencent.connect.a.a.a     // Catch: java.lang.Exception -> L113
            java.lang.String r9 = "PERIOD"
            java.lang.reflect.Field r13 = r13.getField(r9)     // Catch: java.lang.Exception -> L113
            r9 = 0
            java.lang.Object r13 = r13.get(r9)     // Catch: java.lang.Exception -> L113
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L113
            r10[r7] = r13     // Catch: java.lang.Exception -> L113
            r3.invoke(r4, r10)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r13 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "startStatService"
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L113
            r4[r7] = r1     // Catch: java.lang.Exception -> L113
            r4[r8] = r0     // Catch: java.lang.Exception -> L113
            r4[r5] = r0     // Catch: java.lang.Exception -> L113
            java.lang.reflect.Method r13 = r13.getMethod(r3, r4)     // Catch: java.lang.Exception -> L113
            java.lang.Class<?> r0 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L113
            java.lang.String r1 = "com.tencent.stat.common.StatConstants"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L113
            java.lang.String r3 = "VERSION"
            java.lang.reflect.Field r1 = r1.getField(r3)     // Catch: java.lang.Exception -> L113
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Exception -> L113
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L113
            r3[r7] = r12     // Catch: java.lang.Exception -> L113
            r3[r8] = r2     // Catch: java.lang.Exception -> L113
            r3[r5] = r1     // Catch: java.lang.Exception -> L113
            r13.invoke(r0, r3)     // Catch: java.lang.Exception -> L113
            com.tencent.connect.a.a.g = r8     // Catch: java.lang.Exception -> L113
            return
        L113:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "start4QQConnect exception: "
            r13.append(r0)
            java.lang.String r12 = r12.toString()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "OpenConfig"
            com.tencent.open.log.SLog.e(r13, r12)
            return
    }

    public static void d(android.content.Context r10, com.tencent.connect.auth.QQToken r11) {
            java.lang.String r0 = r11.getOpenId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            com.tencent.open.b.e r1 = com.tencent.open.b.e.a()
            java.lang.String r2 = r11.getOpenId()
            java.lang.String r3 = r11.getAppId()
            java.lang.String r8 = "0"
            java.lang.String r9 = "0"
            java.lang.String r4 = "2"
            java.lang.String r5 = "1"
            java.lang.String r6 = "11"
            java.lang.String r7 = "0"
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
        L25:
            boolean r0 = com.tencent.connect.a.a.g
            if (r0 != 0) goto L2a
            goto L64
        L2a:
            b(r10, r11)
            java.lang.String r0 = r11.getOpenId()
            if (r0 == 0) goto L64
            java.lang.reflect.Method r0 = com.tencent.connect.a.a.c     // Catch: java.lang.Exception -> L48
            java.lang.Class<?> r1 = com.tencent.connect.a.a.b     // Catch: java.lang.Exception -> L48
            java.lang.String r11 = r11.getOpenId()     // Catch: java.lang.Exception -> L48
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L48
            r3 = 0
            r2[r3] = r10     // Catch: java.lang.Exception -> L48
            r10 = 1
            r2[r10] = r11     // Catch: java.lang.Exception -> L48
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L48
            return
        L48:
            r0 = move-exception
            r10 = r0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "reportQQ exception: "
            r11.append(r0)
            java.lang.String r10 = r10.toString()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "OpenConfig"
            com.tencent.open.log.SLog.e(r11, r10)
        L64:
            return
    }
}
