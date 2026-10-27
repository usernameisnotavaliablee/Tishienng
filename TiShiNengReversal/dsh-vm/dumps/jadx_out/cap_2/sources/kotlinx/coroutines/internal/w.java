package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class w extends kotlinx.coroutines.internal.y {
    public w() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean A() {
            r1 = this;
            java.lang.Object r0 = r1.n()
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Void B() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "head cannot be removed"
            r0.<init>(r1)
            throw r0
    }

    public final void C() {
            r4 = this;
            java.lang.Object r0 = r4.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r2 = r4
        Lc:
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r4)
            if (r3 != 0) goto L1c
            kotlinx.coroutines.internal.y r3 = r0.o()
            r0.y(r2, r3)
            r2 = r0
            r0 = r3
            goto Lc
        L1c:
            java.lang.Object r0 = r4.n()
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r4.y(r2, r0)
            return
    }

    @Override // kotlinx.coroutines.internal.y
    public boolean q() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.internal.y
    @org.jetbrains.annotations.Nullable
    protected kotlinx.coroutines.internal.y t() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.internal.y
    public /* bridge */ /* synthetic */ boolean u() {
            r1 = this;
            java.lang.Void r0 = r1.B()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final /* synthetic */ <T extends kotlinx.coroutines.internal.y> void z(kotlin.jvm.functions.Function1<? super T, kotlin.n1> r4) {
            r3 = this;
            java.lang.Object r0 = r3.n()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
        Lb:
            boolean r1 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r1 != 0) goto L25
            r1 = 3
            java.lang.String r2 = "T"
            kotlin.jvm.internal.g0.y(r1, r2)
            boolean r1 = androidx.activity.k.a(r0)
            if (r1 == 0) goto L20
            r4.invoke(r0)
        L20:
            kotlinx.coroutines.internal.y r0 = r0.o()
            goto Lb
        L25:
            return
    }
}
