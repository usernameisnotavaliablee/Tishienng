package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F r1, S r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    @androidx.annotation.NonNull
    public static <A, B> androidx.core.util.Pair<A, B> create(A r1, B r2) {
            androidx.core.util.Pair r0 = new androidx.core.util.Pair
            r0.<init>(r1, r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.core.util.Pair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.core.util.Pair r4 = (androidx.core.util.Pair) r4
            F r0 = r4.first
            F r2 = r3.first
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r2)
            if (r0 == 0) goto L1e
            S r4 = r4.second
            S r0 = r3.second
            boolean r4 = androidx.core.util.ObjectsCompat.equals(r4, r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public int hashCode() {
            r3 = this;
            F r0 = r3.first
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            S r2 = r3.second
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Pair{"
            r0.append(r1)
            F r1 = r2.first
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            S r1 = r2.second
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
