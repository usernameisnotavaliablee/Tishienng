package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> kotlin.coroutines.i.b asContextElement(@org.jetbrains.annotations.NotNull java.lang.ThreadLocal<T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlinx.coroutines.e3 r1 = kotlinx.coroutines.f3.a(r1, r2)
            return r1
    }

    public static final long currentThreadId() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            return r0
    }
}
