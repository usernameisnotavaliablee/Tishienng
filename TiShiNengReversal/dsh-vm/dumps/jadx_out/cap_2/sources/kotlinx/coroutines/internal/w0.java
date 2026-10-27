package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class w0 {
    private static final int a = 0;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            kotlinx.coroutines.internal.w0.a = r0
            return
    }

    public static final int a() {
            int r0 = kotlinx.coroutines.internal.w0.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r0) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }
}
