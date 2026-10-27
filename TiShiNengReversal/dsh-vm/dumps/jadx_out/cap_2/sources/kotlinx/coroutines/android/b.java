package kotlinx.coroutines.android;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b extends kotlin.coroutines.a implements kotlinx.coroutines.n0 {

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _preHandler;

    public b() {
            r1 = this;
            kotlinx.coroutines.n0$b r0 = kotlinx.coroutines.n0.r0
            r1.<init>(r0)
            r1._preHandler = r1
            return
    }

    private final java.lang.reflect.Method t() {
            r3 = this;
            java.lang.Object r0 = r3._preHandler
            if (r0 == r3) goto L7
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L7:
            r0 = 0
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r2 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L25
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L25
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            r0 = r1
        L25:
            r3._preHandler = r0
            return r0
    }

    @Override // kotlinx.coroutines.n0
    public void s(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r3) goto L27
            r0 = 28
            if (r3 >= r0) goto L27
            java.lang.reflect.Method r3 = r2.t()
            r0 = 0
            if (r3 == 0) goto L16
            java.lang.Object r3 = r3.invoke(r0, r0)
            goto L17
        L16:
            r3 = r0
        L17:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L1e
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L1e:
            if (r0 == 0) goto L27
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L27:
            return
    }
}
