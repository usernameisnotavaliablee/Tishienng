package com.qq.e.comm.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static final java.util.Map<java.lang.String, java.lang.Boolean> a = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.qq.e.comm.util.a.a = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.Class r3, java.lang.String r4, java.lang.Class... r5) {
            if (r3 != 0) goto L5
            java.lang.String r3 = ""
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = "#"
            r0.append(r3)
            r0.append(r4)
            int r3 = r5.length
            r4 = 0
        L1b:
            if (r4 >= r3) goto L2e
            r1 = r5[r4]
            java.lang.String r2 = "_"
            r0.append(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            int r4 = r4 + 1
            goto L1b
        L2e:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static boolean a(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "onRenderFail"
            boolean r2 = b(r2, r1, r0)
            return r2
    }

    private static boolean b(java.lang.Class r3, java.lang.String r4, java.lang.Class... r5) {
            java.lang.String r0 = a(r3, r4, r5)
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = com.qq.e.comm.util.a.a
            java.lang.Object r2 = r1.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L21
            r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L18
            r1.put(r0, r3)     // Catch: java.lang.NoSuchMethodException -> L18
            r3 = 1
            return r3
        L18:
            java.util.Map<java.lang.String, java.lang.Boolean> r3 = com.qq.e.comm.util.a.a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r0, r4)
            r3 = 0
            return r3
        L21:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = r3.equals(r2)
            return r3
    }

    public static boolean b(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.String r1 = "onRenderSuccess"
            boolean r2 = b(r2, r1, r0)
            return r2
    }
}
