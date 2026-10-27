package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FlowExtKt {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> flowWithLifecycle(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "minActiveState"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 r0 = new androidx.lifecycle.FlowExtKt$flowWithLifecycle$1
            r1 = 0
            r0.<init>(r3, r4, r2, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.s(r0)
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i flowWithLifecycle$default(kotlinx.coroutines.flow.i r0, androidx.lifecycle.Lifecycle r1, androidx.lifecycle.Lifecycle.State r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
        L6:
            kotlinx.coroutines.flow.i r0 = flowWithLifecycle(r0, r1, r2)
            return r0
    }
}
