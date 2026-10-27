package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class j extends kotlin.collections.e1 {

    @org.jetbrains.annotations.NotNull
    private final long[] a;
    private int b;

    public j(@org.jetbrains.annotations.NotNull long[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.b
            long[] r1 = r2.a
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // kotlin.collections.e1
    public long nextLong() {
            r3 = this;
            long[] r0 = r3.a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.b = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r1 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r1
        Lb:
            r0 = move-exception
            int r1 = r3.b
            int r1 = r1 + (-1)
            r3.b = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }
}
