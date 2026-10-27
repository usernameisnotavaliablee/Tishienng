package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class e implements androidx.core.util.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406a;

    public /* synthetic */ e(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f406a = r1
            return
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate r1) {
            r0 = this;
            androidx.core.util.Predicate r1 = androidx.core.util.k.a(r0, r1)
            return r1
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate negate() {
            r1 = this;
            androidx.core.util.Predicate r0 = androidx.core.util.k.b(r1)
            return r0
    }

    @Override // androidx.core.util.Predicate
    public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate r1) {
            r0 = this;
            androidx.core.util.Predicate r1 = androidx.core.util.k.c(r0, r1)
            return r1
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r1.f406a
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r0.equals(r2)
            return r2
    }
}
