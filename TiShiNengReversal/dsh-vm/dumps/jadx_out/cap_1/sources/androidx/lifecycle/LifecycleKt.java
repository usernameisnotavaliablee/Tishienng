package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LifecycleKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleCoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
        L5:
            java.util.concurrent.atomic.AtomicReference r0 = r4.getInternalScopeRef()
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = new androidx.lifecycle.LifecycleCoroutineScopeImpl
            r1 = 1
            r2 = 0
            kotlinx.coroutines.b0 r1 = kotlinx.coroutines.d3.c(r2, r1, r2)
            kotlinx.coroutines.p2 r3 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r3.t()
            kotlin.coroutines.i r1 = r1.plus(r3)
            r0.<init>(r4, r1)
            java.util.concurrent.atomic.AtomicReference r1 = r4.getInternalScopeRef()
            boolean r1 = androidx.camera.view.p.a(r1, r2, r0)
            if (r1 == 0) goto L5
            r0.register()
            return r0
    }
}
