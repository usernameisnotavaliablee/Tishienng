package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ObjectUtil {
    private ObjectUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.util.Collection<?>> T checkNonEmpty(T r2, java.lang.String r3) {
            checkNotNull(r2, r3)
            int r0 = r2.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".size"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            checkPositive(r0, r3)
            return r2
    }

    public static <T> T[] checkNonEmpty(T[] r2, java.lang.String r3) {
            checkNotNull(r2, r3)
            int r0 = r2.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ".length"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            checkPositive(r0, r3)
            return r2
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static int checkPositive(int r2, java.lang.String r3) {
            if (r2 <= 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " (expected: > 0)"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static long checkPositive(long r3, java.lang.String r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " (expected: > 0)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int checkPositiveOrZero(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " (expected: >= 0)"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static long checkPositiveOrZero(long r3, java.lang.String r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " (expected: >= 0)"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int intValue(java.lang.Integer r0, int r1) {
            if (r0 == 0) goto L7
            int r0 = r0.intValue()
            return r0
        L7:
            return r1
    }

    public static long longValue(java.lang.Long r0, long r1) {
            if (r0 == 0) goto L7
            long r0 = r0.longValue()
            return r0
        L7:
            return r1
    }
}
