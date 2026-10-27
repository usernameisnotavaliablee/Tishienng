package com.umeng.vt.diff;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Event {
    private static final int MAX_PROPERTY_LENGTH = 128;

    public Event() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void commit(android.content.Context r10, android.view.View r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.Object> r13, java.lang.Boolean r14) {
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r14 = r14.booleanValue()
            java.lang.String r1 = "; UApp页面路径："
            java.lang.String r2 = "; 页面："
            java.lang.String r3 = "; 参数："
            java.lang.String r4 = "_$!style"
            java.lang.String r5 = "_$!uapp_pg"
            java.lang.String r6 = "_$!text"
            java.lang.String r7 = "MobclickRT"
            java.lang.String r8 = "_$!pg"
            if (r14 == 0) goto Ld9
            boolean r14 = com.umeng.tunnel.UMChannelAgent.init()
            if (r14 == 0) goto Ld8
            if (r11 == 0) goto L40
            java.lang.String r14 = textPropertyFromView(r11)
            boolean r9 = android.text.TextUtils.isEmpty(r14)
            if (r9 != 0) goto L30
            r13.put(r6, r14)
        L30:
            android.content.Context r11 = r11.getContext()
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            r13.put(r8, r11)
            goto L4b
        L40:
            java.lang.Class r11 = r10.getClass()
            java.lang.String r11 = r11.getName()
            r13.put(r8, r11)
        L4b:
            r13.put(r4, r0)
            java.lang.String r11 = getPageName()
            r13.put(r5, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "config:事件名: "
            r11.append(r14)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
            boolean r11 = r13.containsKey(r6)
            if (r11 == 0) goto L8d
            java.lang.Object r11 = r13.get(r6)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r3)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        L8d:
            boolean r11 = r13.containsKey(r8)
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r13.get(r8)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        Lb1:
            boolean r11 = r13.containsKey(r5)
            if (r11 == 0) goto Ld5
            java.lang.Object r11 = r13.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        Ld5:
            com.umeng.tunnel.UMChannelAgent.onDebugEvent(r10, r12, r13)
        Ld8:
            return
        Ld9:
            if (r11 == 0) goto Lf8
            java.lang.String r14 = textPropertyFromView(r11)
            boolean r9 = android.text.TextUtils.isEmpty(r14)
            if (r9 != 0) goto Le8
            r13.put(r6, r14)
        Le8:
            android.content.Context r11 = r11.getContext()
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            r13.put(r8, r11)
            goto L103
        Lf8:
            java.lang.Class r11 = r10.getClass()
            java.lang.String r11 = r11.getName()
            r13.put(r8, r11)
        L103:
            r13.put(r4, r0)
            java.lang.String r11 = getPageName()
            r13.put(r5, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "release:事件名: "
            r11.append(r14)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
            boolean r11 = r13.containsKey(r6)
            if (r11 == 0) goto L145
            java.lang.Object r11 = r13.get(r6)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r3)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        L145:
            boolean r11 = r13.containsKey(r8)
            if (r11 == 0) goto L169
            java.lang.Object r11 = r13.get(r8)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        L169:
            boolean r11 = r13.containsKey(r5)
            if (r11 == 0) goto L18d
            java.lang.Object r11 = r13.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            r0.append(r12)
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.umeng.commonsdk.debug.UMRTLog.e(r7, r11)
        L18d:
            com.umeng.analytics.MobclickAgent.onEventObject(r10, r12, r13)
            return
    }

    public static java.lang.String getActivityName(android.view.View r1) {
            if (r1 == 0) goto L1f
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L1f
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L12
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
        L12:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L1f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static java.lang.String getPageName() {
            com.umeng.analytics.vshelper.PageNameMonitor r0 = com.umeng.analytics.vshelper.PageNameMonitor.getInstance()
            java.lang.String r0 = r0.getCurrenPageName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L10
            java.lang.String r0 = ""
        L10:
            return r0
    }

    public static java.lang.String getPageName(android.view.View r4) {
            java.lang.String r0 = getPageName()
            java.lang.String r1 = "VT"
            java.lang.String r2 = ""
            if (r0 == 0) goto L18
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L18
            boolean r3 = r0.equals(r1)
            if (r3 == 0) goto L17
            goto L18
        L17:
            return r0
        L18:
            java.lang.String r4 = getActivityName(r4)
            if (r4 == 0) goto L25
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L25
            return r4
        L25:
            return r1
    }

    public static void init(android.content.Context r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4) {
            return
    }

    public static void openDebug(java.lang.String r0) {
            return
    }

    private static void reflectTrack(android.content.Context r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
            java.lang.String r0 = "com.umeng.analytics.MobclickAgent"
            java.lang.Class r0 = com.umeng.vt.diff.util.ClassLoadUtil.findClass(r0)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L2e
            java.lang.String r1 = "onEvent"
            r2 = 3
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L2e
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r7 = 2
            r3[r7] = r4     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L2e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2e
            r1[r5] = r8     // Catch: java.lang.Exception -> L2e
            r1[r6] = r9     // Catch: java.lang.Exception -> L2e
            r1[r7] = r10     // Catch: java.lang.Exception -> L2e
            r8 = 0
            r0.invoke(r8, r1)     // Catch: java.lang.Exception -> L2e
        L2e:
            return
    }

    private static java.lang.String textPropertyFromView(android.view.View r7) {
            boolean r0 = r7 instanceof android.widget.TextView
            if (r0 == 0) goto L11
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.CharSequence r7 = r7.getText()
            if (r7 == 0) goto L5d
            java.lang.String r7 = r7.toString()
            return r7
        L11:
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.getChildCount()
            r2 = 0
            r3 = 0
            r4 = 0
        L23:
            r5 = 128(0x80, float:1.8E-43)
            if (r3 >= r1) goto L4b
            int r6 = r0.length()
            if (r6 >= r5) goto L4b
            android.view.View r5 = r7.getChildAt(r3)
            java.lang.String r5 = textPropertyFromView(r5)
            if (r5 == 0) goto L48
            int r6 = r5.length()
            if (r6 <= 0) goto L48
            if (r4 == 0) goto L44
            java.lang.String r4 = ", "
            r0.append(r4)
        L44:
            r0.append(r5)
            r4 = 1
        L48:
            int r3 = r3 + 1
            goto L23
        L4b:
            int r7 = r0.length()
            if (r7 <= r5) goto L56
            java.lang.String r7 = r0.substring(r2, r5)
            return r7
        L56:
            if (r4 == 0) goto L5d
            java.lang.String r7 = r0.toString()
            return r7
        L5d:
            r7 = 0
            return r7
    }
}
