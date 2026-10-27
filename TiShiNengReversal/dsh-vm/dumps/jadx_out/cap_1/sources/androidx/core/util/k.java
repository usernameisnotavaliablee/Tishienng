package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class k {
    @android.annotation.SuppressLint({"MissingNullability"})
    public static androidx.core.util.Predicate a(androidx.core.util.Predicate r1, @android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate r2) {
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.i r0 = new androidx.core.util.i
            r0.<init>(r1, r2)
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    public static androidx.core.util.Predicate b(androidx.core.util.Predicate r1) {
            androidx.core.util.j r0 = new androidx.core.util.j
            r0.<init>(r1)
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    public static androidx.core.util.Predicate c(androidx.core.util.Predicate r1, @android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate r2) {
            java.util.Objects.requireNonNull(r2)
            androidx.core.util.f r0 = new androidx.core.util.f
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ boolean d(androidx.core.util.Predicate r0, androidx.core.util.Predicate r1, java.lang.Object r2) {
            boolean r0 = r0.test(r2)
            if (r0 == 0) goto Le
            boolean r0 = r1.test(r2)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public static /* synthetic */ boolean e(androidx.core.util.Predicate r0, java.lang.Object r1) {
            boolean r0 = r0.test(r1)
            r0 = r0 ^ 1
            return r0
    }

    public static /* synthetic */ boolean f(androidx.core.util.Predicate r0, androidx.core.util.Predicate r1, java.lang.Object r2) {
            boolean r0 = r0.test(r2)
            if (r0 != 0) goto Lf
            boolean r0 = r1.test(r2)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    public static <T> androidx.core.util.Predicate<T> g(@android.annotation.SuppressLint({"MissingNullability"}) java.lang.Object r1) {
            if (r1 != 0) goto L8
            androidx.core.util.g r1 = new androidx.core.util.g
            r1.<init>()
            return r1
        L8:
            androidx.core.util.h r0 = new androidx.core.util.h
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ boolean h(java.lang.Object r0) {
            boolean r0 = androidx.core.util.e.a(r0)
            return r0
    }

    public static /* synthetic */ boolean i(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = r0.equals(r1)
            return r0
    }

    @android.annotation.SuppressLint({"MissingNullability"})
    public static <T> androidx.core.util.Predicate<T> j(@android.annotation.SuppressLint({"MissingNullability"}) androidx.core.util.Predicate<? super T> r0) {
            java.util.Objects.requireNonNull(r0)
            androidx.core.util.Predicate r0 = r0.negate()
            return r0
    }
}
