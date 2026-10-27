package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class EmittedSource implements kotlinx.coroutines.j1 {
    private boolean disposed;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<?> mediator;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<?> source;

    public EmittedSource(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<?> r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.MediatorLiveData<?> r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "mediator"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.mediator = r3
            return
    }

    public static final /* synthetic */ void access$removeSource(androidx.lifecycle.EmittedSource r0) {
            r0.removeSource()
            return
    }

    @androidx.annotation.MainThread
    private final void removeSource() {
            r2 = this;
            boolean r0 = r2.disposed
            if (r0 != 0) goto Le
            androidx.lifecycle.MediatorLiveData<?> r0 = r2.mediator
            androidx.lifecycle.LiveData<?> r1 = r2.source
            r0.removeSource(r1)
            r0 = 1
            r2.disposed = r0
        Le:
            return
    }

    public void dispose() {
            r7 = this;
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            kotlinx.coroutines.r0 r1 = kotlinx.coroutines.s0.a(r0)
            androidx.lifecycle.EmittedSource$dispose$1 r4 = new androidx.lifecycle.EmittedSource$dispose$1
            r0 = 0
            r4.<init>(r7, r0)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object disposeNow(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r3 = this;
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            androidx.lifecycle.EmittedSource$disposeNow$2 r1 = new androidx.lifecycle.EmittedSource$disposeNow$2
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.Object r4 = kotlinx.coroutines.i.h(r0, r1, r4)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            if (r4 != r0) goto L19
            return r4
        L19:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }
}
