package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n20#3:137\n20#3:142\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n126#1:133,4\n128#1:138,4\n126#1:137\n128#1:142\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class w extends kotlinx.coroutines.flow.y<java.lang.Integer> implements kotlinx.coroutines.flow.h0<java.lang.Integer> {
    public w(int r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2 = 1
            r3.<init>(r2, r0, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.c(r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Integer c0() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.O()     // Catch: java.lang.Throwable -> L11
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L11
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final boolean d0(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.O()     // Catch: java.lang.Throwable -> L16
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L16
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.c(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // kotlinx.coroutines.flow.h0
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
            r1 = this;
            java.lang.Integer r0 = r1.c0()
            return r0
    }
}
