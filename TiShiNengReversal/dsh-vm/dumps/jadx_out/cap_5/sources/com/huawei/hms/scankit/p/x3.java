package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class x3 extends com.huawei.hms.scankit.p.u3 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.LinkedHashMap<java.lang.String, java.lang.String> {
        final /* synthetic */ com.huawei.hms.scankit.p.x3 a;

        a(com.huawei.hms.scankit.p.x3 r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r1.g()
                java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r1.b
                r0.putAll(r1)
                return
        }
    }

    public x3() {
            r2 = this;
            android.content.Context r0 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            r1 = 0
            r2.<init>(r1, r0)
            return
    }

    public void c(android.os.Bundle r6) {
            r5 = this;
            java.lang.String r0 = "HaLog60002"
            java.lang.String r1 = "scanType"
            if (r6 == 0) goto L5f
            boolean r2 = r5.a()
            if (r2 == 0) goto L5f
            boolean r2 = r6.containsKey(r1)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            if (r2 == 0) goto L25
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            boolean r2 = r2 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            if (r2 == 0) goto L25
            int r2 = r6.getInt(r1)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.lang.String r2 = com.huawei.hms.scankit.p.u3.a(r2)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            r6.putString(r1, r2)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
        L25:
            com.huawei.hms.scankit.p.x3$a r1 = new com.huawei.hms.scankit.p.x3$a     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            r1.<init>(r5)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.util.Set r2 = r6.keySet()     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
        L32:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.lang.Object r4 = r6.get(r3)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            r1.put(r3, r4)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            goto L32
        L4a:
            com.huawei.hms.scankit.p.a4 r6 = com.huawei.hms.scankit.p.a4.b()     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            java.lang.String r2 = "60002"
            r6.b(r2, r1)     // Catch: java.lang.Exception -> L54 java.lang.RuntimeException -> L5a
            return
        L54:
            java.lang.String r6 = "Exception"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
            goto L5f
        L5a:
            java.lang.String r6 = "RuntimeException"
            com.huawei.hms.scankit.p.o4.b(r0, r6)
        L5f:
            return
    }
}
