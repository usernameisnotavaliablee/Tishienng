package io.reactivex.internal.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObjectHelper {
    static final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> EQUALS = null;


    static {
            io.reactivex.internal.functions.ObjectHelper$1 r0 = new io.reactivex.internal.functions.ObjectHelper$1
            r0.<init>()
            io.reactivex.internal.functions.ObjectHelper.EQUALS = r0
            return
    }

    private ObjectHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static int compare(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static int compare(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6
            r1 = -1
            return r1
        L6:
            if (r0 <= 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static <T> io.reactivex.functions.BiPredicate<T, T> equalsPredicate() {
            io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> r0 = io.reactivex.internal.functions.ObjectHelper.EQUALS
            return r0
    }

    public static int hashCode(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static <T> T requireNonNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static int verifyPositive(int r2, java.lang.String r3) {
            if (r2 <= 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " > 0 required but it was "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static long verifyPositive(long r3, java.lang.String r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " > 0 required but it was "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
