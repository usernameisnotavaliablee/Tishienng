package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class r2 extends kotlin.coroutines.a implements kotlinx.coroutines.e2 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.r2 a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    static {
            kotlinx.coroutines.r2 r0 = new kotlinx.coroutines.r2
            r0.<init>()
            kotlinx.coroutines.r2.a = r0
            return
    }

    private r2() {
            r1 = this;
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            r1.<init>(r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void t() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void u() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void v() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void w() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void x() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public static /* synthetic */ void z() {
            return
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.v A(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x r1) {
            r0 = this;
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            return r1
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public kotlin.sequences.m<kotlinx.coroutines.e2> E() {
            r1 = this;
            kotlin.sequences.m r0 = kotlin.sequences.p.l()
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 G(boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r0 = this;
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            return r1
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.CancellationException H() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.Nullable
    public java.lang.Object M(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This job is always active"
            r2.<init>(r0)
            throw r2
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.e2, kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.e2.a.a(r0)
            return
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.e2 getParent() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public boolean isCancelled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    public boolean isCompleted() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.e2 j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
            r0 = this;
            kotlinx.coroutines.e2 r1 = kotlinx.coroutines.e2.a.j(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.j1 k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r1) {
            r0 = this;
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            return r1
    }

    @Override // kotlinx.coroutines.e2
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NonCancellable"
            return r0
    }

    @Override // kotlinx.coroutines.e2
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.e y() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }
}
