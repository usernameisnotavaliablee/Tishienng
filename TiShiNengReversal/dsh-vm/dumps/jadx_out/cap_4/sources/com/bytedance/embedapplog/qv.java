package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class qv implements com.bytedance.embedapplog.tk {
    private static java.lang.reflect.Method cw;
    private static java.lang.Object j;
    private static java.lang.Class<?> xt;

    static {
            java.lang.String r0 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L21
            com.bytedance.embedapplog.qv.xt = r0     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L21
            com.bytedance.embedapplog.qv.j = r0     // Catch: java.lang.Exception -> L21
            java.lang.Class<?> r0 = com.bytedance.embedapplog.qv.xt     // Catch: java.lang.Exception -> L21
            java.lang.String r1 = "getOAID"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L21
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L21
            com.bytedance.embedapplog.qv.cw = r0     // Catch: java.lang.Exception -> L21
            return
        L21:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Api#static reflect exception! "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.embedapplog.uc.j(r0)
            return
    }

    qv() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String j(android.content.Context r3, java.lang.reflect.Method r4) {
            java.lang.Object r0 = com.bytedance.embedapplog.qv.j
            if (r0 == 0) goto L15
            if (r4 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            r2 = 0
            r1[r2] = r3     // Catch: java.lang.Exception -> L15
            java.lang.Object r3 = r4.invoke(r0, r1)     // Catch: java.lang.Exception -> L15
            if (r3 == 0) goto L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L15
            return r3
        L15:
            r3 = 0
            return r3
    }

    static boolean j() {
            java.lang.Class<?> r0 = com.bytedance.embedapplog.qv.xt
            if (r0 == 0) goto Le
            java.lang.Object r0 = com.bytedance.embedapplog.qv.j
            if (r0 == 0) goto Le
            java.lang.reflect.Method r0 = com.bytedance.embedapplog.qv.cw
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // com.bytedance.embedapplog.tk
    public boolean j(android.content.Context r1) {
            r0 = this;
            boolean r1 = j()
            return r1
    }

    @Override // com.bytedance.embedapplog.tk
    public com.bytedance.embedapplog.tk.j xt(android.content.Context r3) {
            r2 = this;
            com.bytedance.embedapplog.tk$j r0 = new com.bytedance.embedapplog.tk$j     // Catch: java.lang.Exception -> Le
            r0.<init>()     // Catch: java.lang.Exception -> Le
            java.lang.reflect.Method r1 = com.bytedance.embedapplog.qv.cw     // Catch: java.lang.Exception -> Le
            java.lang.String r3 = j(r3, r1)     // Catch: java.lang.Exception -> Le
            r0.xt = r3     // Catch: java.lang.Exception -> Le
            return r0
        Le:
            r3 = move-exception
            com.bytedance.embedapplog.uc.j(r3)
            r3 = 0
            return r3
    }
}
