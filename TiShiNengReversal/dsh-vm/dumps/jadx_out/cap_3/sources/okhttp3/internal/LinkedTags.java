package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class LinkedTags<K> extends okhttp3.internal.Tags {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.d<K> key;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.Tags next;

    @org.jetbrains.annotations.NotNull
    private final K value;

    public LinkedTags(@org.jetbrains.annotations.NotNull kotlin.reflect.d<K> r2, @org.jetbrains.annotations.NotNull K r3, @org.jetbrains.annotations.NotNull okhttp3.internal.Tags r4) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "next"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            r1.<init>(r0)
            r1.key = r2
            r1.value = r3
            r1.next = r4
            return
    }

    public static /* synthetic */ okhttp3.internal.LinkedTags a(okhttp3.internal.LinkedTags r0) {
            okhttp3.internal.LinkedTags r0 = toString$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence b(okhttp3.internal.LinkedTags r0) {
            java.lang.CharSequence r0 = toString$lambda$1(r0)
            return r0
    }

    private static final okhttp3.internal.LinkedTags toString$lambda$0(okhttp3.internal.LinkedTags r1) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.Tags r1 = r1.next
            boolean r0 = r1 instanceof okhttp3.internal.LinkedTags
            if (r0 == 0) goto Le
            okhttp3.internal.LinkedTags r1 = (okhttp3.internal.LinkedTags) r1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static final java.lang.CharSequence toString$lambda$1(okhttp3.internal.LinkedTags r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.d<K> r1 = r2.key
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            K r2 = r2.value
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // okhttp3.internal.Tags
    @org.jetbrains.annotations.Nullable
    public <T> T get(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.d<K> r0 = r1.key
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto L18
            java.lang.Class r2 = k3.a.e(r2)
            K r0 = r1.value
            java.lang.Object r2 = r2.cast(r0)
            return r2
        L18:
            okhttp3.internal.Tags r0 = r1.next
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // okhttp3.internal.Tags
    @org.jetbrains.annotations.NotNull
    public <T> okhttp3.internal.Tags plus(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r5, @org.jetbrains.annotations.Nullable T r6) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.d<K> r0 = r4.key
            boolean r0 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r0 == 0) goto L10
            okhttp3.internal.Tags r0 = r4.next
            goto L27
        L10:
            okhttp3.internal.Tags r0 = r4.next
            r1 = 0
            okhttp3.internal.Tags r0 = r0.plus(r5, r1)
            okhttp3.internal.Tags r1 = r4.next
            if (r0 != r1) goto L1d
            r0 = r4
            goto L27
        L1d:
            okhttp3.internal.LinkedTags r1 = new okhttp3.internal.LinkedTags
            kotlin.reflect.d<K> r2 = r4.key
            K r3 = r4.value
            r1.<init>(r2, r3, r0)
            r0 = r1
        L27:
            if (r6 == 0) goto L2f
            okhttp3.internal.LinkedTags r1 = new okhttp3.internal.LinkedTags
            r1.<init>(r5, r6, r0)
            return r1
        L2f:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r10 = this;
            okhttp3.internal.a r0 = new okhttp3.internal.a
            r0.<init>()
            kotlin.sequences.m r0 = kotlin.sequences.p.t(r10, r0)
            java.util.List r0 = kotlin.sequences.p.I3(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.c5(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            okhttp3.internal.b r7 = new okhttp3.internal.b
            r7.<init>()
            r8 = 25
            r9 = 0
            r2 = 0
            java.lang.String r3 = "{"
            java.lang.String r4 = "}"
            r5 = 0
            r6 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
