package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(24)
@kotlin.jvm.JvmName(name = "ConsumerKt")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ConsumerKt {
    @androidx.annotation.RequiresApi(24)
    @org.jetbrains.annotations.NotNull
    public static final <T> java.util.function.Consumer<T> asConsumer(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1) {
            androidx.core.util.ContinuationConsumer r0 = new androidx.core.util.ContinuationConsumer
            r0.<init>(r1)
            java.util.function.Consumer r1 = androidx.core.util.a.a(r0)
            return r1
    }
}
