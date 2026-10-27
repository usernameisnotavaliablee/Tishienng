package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a6 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        public static com.amap.api.col.p0003l.a6 a;

        static {
                com.amap.api.col.3l.a6 r0 = new com.amap.api.col.3l.a6
                r0.<init>()
                com.amap.api.col.3l.a6.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public a6() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject a(java.lang.Thread r5) {
            if (r5 == 0) goto L4c
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            if (r0 == 0) goto L4c
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "threadId"
            long r3 = r5.getId()     // Catch: java.lang.Throwable -> L4b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "threadName"
            java.lang.String r3 = r5.getName()     // Catch: java.lang.Throwable -> L4b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "threadGroup"
            java.lang.ThreadGroup r5 = r5.getThreadGroup()     // Catch: java.lang.Throwable -> L4b
            r1.put(r2, r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L4b
            r5.<init>()     // Catch: java.lang.Throwable -> L4b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L4b
            r3 = 0
        L33:
            if (r3 >= r2) goto L42
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L4b
            r5.append(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "<br />"
            r5.append(r4)     // Catch: java.lang.Throwable -> L4b
            int r3 = r3 + 1
            goto L33
        L42:
            java.lang.String r0 = "stacks"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L4b
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r1
        L4c:
            r5 = 0
            return r5
    }

    public static boolean b(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.util.List<com.amap.api.col.p0003l.p4> r13, boolean r14, com.amap.api.col.p0003l.p4 r15) {
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "<br />"
            r3 = 0
            if (r12 == 0) goto L67
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            java.lang.Thread r5 = (java.lang.Thread) r5
            if (r5 == 0) goto L14
            java.lang.String r6 = r5.getName()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L14
            java.lang.String r6 = r5.getName()
            boolean r6 = r12.contains(r6)
            if (r6 != 0) goto L40
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.contains(r12)
            if (r6 == 0) goto L14
        L40:
            java.lang.StackTraceElement[] r4 = r5.getStackTrace()
            if (r4 != 0) goto L47
            goto L67
        L47:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            int r6 = r4.length
            r7 = 0
        L4e:
            if (r7 >= r6) goto L60
            r8 = r4[r7]
            java.lang.String r9 = "at "
            r5.append(r9)
            r5.append(r8)
            r5.append(r2)
            int r7 = r7 + 1
            goto L4e
        L60:
            java.lang.String r4 = r5.toString()
            goto L68
        L65:
            r4 = r1
            goto L68
        L67:
            r4 = r0
        L68:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto La0
            r5 = 0
        L6f:
            if (r13 == 0) goto La0
            int r6 = r13.size()
            if (r5 >= r6) goto La0
            java.lang.Object r6 = r13.get(r5)
            com.amap.api.col.3l.p4 r6 = (com.amap.api.col.p0003l.p4) r6
            if (r6 == 0) goto L9d
            java.lang.String[] r7 = r6.i()
            r8 = 0
        L84:
            int r9 = r7.length
            if (r8 >= r9) goto L9d
            r9 = r7[r5]
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L9a
            r9 = r7[r8]
            boolean r9 = r4.contains(r9)
            if (r9 != 0) goto L98
            goto L9a
        L98:
            r1 = r6
            goto La0
        L9a:
            int r8 = r8 + 1
            goto L84
        L9d:
            int r5 = r5 + 1
            goto L6f
        La0:
            if (r14 == 0) goto La5
            if (r1 != 0) goto La5
            return r3
        La5:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r2)
            r13.append(r4)
            java.lang.String r11 = r13.toString()
            if (r12 != 0) goto Lba
            r12 = r0
        Lba:
            java.util.Map r13 = java.lang.Thread.getAllStackTraces()
            java.util.Set r13 = r13.keySet()
            java.util.Iterator r13 = r13.iterator()
            java.lang.String r8 = "GNaviMap"
            java.lang.String r9 = "main"
            java.lang.String r4 = "AMapPboRenderThread"
            java.lang.String r5 = "GLThread"
            java.lang.String r6 = "AMapGlRenderThread"
            java.lang.String r7 = "AMapThreadUtil"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
        Ldb:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L125
            java.lang.Object r4 = r13.next()
            java.lang.Thread r4 = (java.lang.Thread) r4
            if (r4 == 0) goto Ldb
            java.lang.String r5 = r4.getName()
            boolean r5 = r12.equals(r5)
            if (r5 != 0) goto Ldb
            r5 = 0
        Lf4:
            r6 = 6
            if (r5 >= r6) goto Ldb
            r6 = r0[r5]
            java.lang.String r7 = r4.getName()
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L122
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L122
            boolean r8 = r6.contains(r7)
            if (r8 != 0) goto L115
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L122
        L115:
            org.json.JSONObject r6 = a(r4)
            if (r6 == 0) goto L122
            org.json.JSONObject r6 = a(r4)
            r2.put(r6)
        L122:
            int r5 = r5 + 1
            goto Lf4
        L125:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r13 = "crashStack"
            r12.put(r13, r11)     // Catch: java.lang.Throwable -> L135
            java.lang.String r11 = "backStacks"
            r12.put(r11, r2)     // Catch: java.lang.Throwable -> L135
            goto L136
        L135:
        L136:
            java.lang.String r11 = r12.toString()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L141
            return r3
        L141:
            java.lang.String r12 = "NATIVE_CRASH_CLS_NAME"
            java.lang.String r13 = "NATIVE_CRASH_MHD_NAME"
            r0 = 1
            if (r14 != 0) goto L150
            if (r1 != 0) goto L150
            java.lang.String r12 = "NATIVE_APP_CRASH_CLS_NAME"
            com.amap.api.col.p0003l.w5.n(r10, r15, r11, r12, r13)     // Catch: java.lang.Throwable -> L153
            return r0
        L150:
            com.amap.api.col.p0003l.w5.i(r10, r1, r11, r12, r13)     // Catch: java.lang.Throwable -> L153
        L153:
            return r0
    }
}
