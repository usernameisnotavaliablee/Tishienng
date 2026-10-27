package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class CollectPreconditions {
    CollectPreconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    static void checkEntryNotNull(java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto L21
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null value in entry: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "=null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null key in entry: null="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static int checkNonnegative(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " cannot be negative but was: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static long checkNonnegative(long r3, java.lang.String r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L7
            return r3
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " cannot be negative but was: "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static void checkPositive(int r2, java.lang.String r3) {
            if (r2 <= 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " must be positive but was: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    static void checkRemove(boolean r1) {
            java.lang.String r0 = "no calls to next() since the last call to remove()"
            com.google.common.base.Preconditions.checkState(r1, r0)
            return
    }
}
