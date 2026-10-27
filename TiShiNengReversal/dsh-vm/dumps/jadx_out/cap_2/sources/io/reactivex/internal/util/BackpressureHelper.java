package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BackpressureHelper {
    private BackpressureHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static long add(java.util.concurrent.atomic.AtomicLong r5, long r6) {
        L0:
            long r0 = r5.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            long r2 = addCap(r0, r6)
            boolean r2 = r5.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            return r0
    }

    public static long addCancel(java.util.concurrent.atomic.AtomicLong r5, long r6) {
        L0:
            long r0 = r5.get()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return r2
        L15:
            long r2 = addCap(r0, r6)
            boolean r2 = r5.compareAndSet(r0, r2)
            if (r2 == 0) goto L0
            return r0
    }

    public static long addCap(long r1, long r3) {
            long r1 = r1 + r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lc:
            return r1
    }

    public static long multiplyCap(long r7, long r9) {
            long r0 = r7 * r9
            long r2 = r7 | r9
            r4 = 31
            long r2 = r2 >>> r4
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L19
            long r7 = r0 / r7
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L19
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r7
        L19:
            return r0
    }

    public static long produced(java.util.concurrent.atomic.AtomicLong r9, long r10) {
        L0:
            long r0 = r9.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            return r2
        Le:
            long r2 = r0 - r10
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L30
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "More produced than requested: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r6.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            r2 = r4
        L30:
            boolean r0 = r9.compareAndSet(r0, r2)
            if (r0 == 0) goto L0
            return r2
    }

    public static long producedCancel(java.util.concurrent.atomic.AtomicLong r9, long r10) {
        L0:
            long r0 = r9.get()
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L15
            return r2
        L15:
            long r2 = r0 - r10
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L37
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "More produced than requested: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r6.<init>(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r6)
            r2 = r4
        L37:
            boolean r0 = r9.compareAndSet(r0, r2)
            if (r0 == 0) goto L0
            return r2
    }
}
