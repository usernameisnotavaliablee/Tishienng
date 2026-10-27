package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "FlowLiveDataConversions")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FlowLiveDataConversions {
    @org.jetbrains.annotations.NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> asFlow(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.s(r0)
            kotlinx.coroutines.flow.i r2 = kotlinx.coroutines.flow.k.W(r2)
            return r2
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r1 = r7
            androidx.lifecycle.LiveData r7 = asLiveData$default(r1, r2, r3, r5, r6)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            androidx.lifecycle.LiveData r7 = asLiveData$default(r1, r2, r3, r5, r6)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.FlowLiveDataConversions$asLiveData$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asLiveData$1
            r1 = 0
            r0.<init>(r2, r1)
            androidx.lifecycle.LiveData r3 = androidx.lifecycle.CoroutineLiveDataKt.liveData(r3, r4, r0)
            boolean r4 = r2 instanceof kotlinx.coroutines.flow.h0
            if (r4 == 0) goto L35
            androidx.arch.core.executor.ArchTaskExecutor r4 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r4 = r4.isMainThread()
            if (r4 == 0) goto L2c
            kotlinx.coroutines.flow.h0 r2 = (kotlinx.coroutines.flow.h0) r2
            java.lang.Object r2 = r2.getValue()
            r3.setValue(r2)
            return r3
        L2c:
            kotlinx.coroutines.flow.h0 r2 = (kotlinx.coroutines.flow.h0) r2
            java.lang.Object r2 = r2.getValue()
            r3.postValue(r2)
        L35:
            return r3
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i<? extends T> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.time.Duration r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "timeout"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.lifecycle.Api26Impl r0 = androidx.lifecycle.Api26Impl.INSTANCE
            long r0 = r0.toMillis(r4)
            androidx.lifecycle.LiveData r2 = asLiveData(r2, r3, r0)
            return r2
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.i r0, kotlin.coroutines.i r1, long r2, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r2 = 5000(0x1388, double:2.4703E-320)
        Lc:
            androidx.lifecycle.LiveData r0 = asLiveData(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.i r0, kotlin.coroutines.i r1, java.time.Duration r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            androidx.lifecycle.LiveData r0 = asLiveData(r0, r1, r2)
            return r0
    }
}
