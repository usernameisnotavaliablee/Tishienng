package i1;

@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a implements com.huawei.agconnect.e {
    private static final java.util.Map<java.lang.String, i1.a> a = null;
    private static final java.lang.Object b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            i1.a.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            i1.a.b = r0
            return
    }

    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static i1.a d(android.content.Context r1) {
            android.content.Context r0 = r1.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 != 0) goto Lb
            goto Lc
        Lb:
            r1 = r0
        Lc:
            java.lang.String r0 = r1.getPackageName()
            i1.a r1 = e(r1, r0)
            return r1
    }

    public static i1.a e(android.content.Context r3, java.lang.String r4) {
            java.lang.Object r0 = i1.a.b
            monitor-enter(r0)
            java.util.Map<java.lang.String, i1.a> r1 = i1.a.a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            i1.a r2 = (i1.a) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            com.huawei.agconnect.config.impl.e r2 = new com.huawei.agconnect.config.impl.e     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L16
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public abstract void f(i1.b r1);

    public abstract void g(java.io.InputStream r1);

    public abstract void h(java.lang.String r1, java.lang.String r2);

    public abstract void i(com.huawei.agconnect.b r1);
}
