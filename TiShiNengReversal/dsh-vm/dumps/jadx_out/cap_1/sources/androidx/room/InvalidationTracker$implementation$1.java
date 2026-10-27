package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
/* synthetic */ class InvalidationTracker$implementation$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.util.Set<? extends java.lang.Integer>, kotlin.n1> {
    InvalidationTracker$implementation$1(java.lang.Object r8) {
            r7 = this;
            java.lang.String r5 = "notifyInvalidatedObservers(Ljava/util/Set;)V"
            r6 = 0
            r1 = 1
            java.lang.Class<androidx.room.InvalidationTracker> r3 = androidx.room.InvalidationTracker.class
            java.lang.String r4 = "notifyInvalidatedObservers"
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.util.Set r1 = (java.util.Set) r1
            r0.invoke(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public final void invoke(java.util.Set<java.lang.Integer> r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r0 = r1.receiver
            androidx.room.InvalidationTracker r0 = (androidx.room.InvalidationTracker) r0
            androidx.room.InvalidationTracker.access$notifyInvalidatedObservers(r0, r2)
            return
    }
}
