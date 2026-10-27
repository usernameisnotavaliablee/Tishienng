package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class LongLongPair {
    private final long first;
    private final long second;

    public LongLongPair(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r3
            return
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.getFirst()
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.getSecond()
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.collection.LongLongPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.collection.LongLongPair r7 = (androidx.collection.LongLongPair) r7
            long r2 = r7.first
            long r4 = r6.first
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1a
            long r2 = r7.second
            long r4 = r6.second
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L1a
            r7 = 1
            return r7
        L1a:
            return r1
    }

    public final long getFirst() {
            r2 = this;
            long r0 = r2.first
            return r0
    }

    public final long getSecond() {
            r2 = this;
            long r0 = r2.second
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.first
            int r0 = androidx.camera.camera2.internal.compat.params.e.a(r0)
            long r1 = r3.second
            int r1 = androidx.camera.camera2.internal.compat.params.e.a(r1)
            r0 = r0 ^ r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            r0.append(r1)
            long r1 = r3.first
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r1 = r3.second
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
