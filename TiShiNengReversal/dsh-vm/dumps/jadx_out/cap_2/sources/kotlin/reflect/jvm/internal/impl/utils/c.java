package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {
    public static final boolean a(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class r2 = r2.getClass()
        L9:
            java.lang.String r0 = r2.getCanonicalName()
            java.lang.String r1 = "com.intellij.openapi.progress.ProcessCanceledException"
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            if (r0 == 0) goto L17
            r2 = 1
            return r2
        L17:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 != 0) goto L9
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.RuntimeException b(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            java.lang.String r0 = "e"
            kotlin.jvm.internal.g0.p(r1, r0)
            throw r1
    }
}
