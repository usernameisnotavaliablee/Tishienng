package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewModelKt {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.r0 getViewModelScope(@org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModel r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY"
            java.lang.Object r1 = r4.getTag(r0)
            kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
            if (r1 == 0) goto L10
            return r1
        L10:
            androidx.lifecycle.CloseableCoroutineScope r1 = new androidx.lifecycle.CloseableCoroutineScope
            r2 = 1
            r3 = 0
            kotlinx.coroutines.b0 r2 = kotlinx.coroutines.d3.c(r3, r2, r3)
            kotlinx.coroutines.p2 r3 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r3 = r3.t()
            kotlin.coroutines.i r2 = r2.plus(r3)
            r1.<init>(r2)
            java.lang.Object r4 = r4.setTagIfAbsent(r0, r1)
            java.lang.String r0 = "setTagIfAbsent(\n        …Main.immediate)\n        )"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
            return r4
    }
}
