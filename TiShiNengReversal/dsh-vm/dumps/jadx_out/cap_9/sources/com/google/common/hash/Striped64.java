package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class Striped64 extends java.lang.Number {
    static final int NCPU = 0;
    private static final sun.misc.Unsafe UNSAFE = null;
    private static final long baseOffset = 0;
    private static final long busyOffset = 0;
    static final java.util.Random rng = null;
    static final java.lang.ThreadLocal<int[]> threadHashCode = null;
    volatile transient long base;
    volatile transient int busy;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    volatile transient com.google.common.hash.Striped64.Cell[] cells;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Cell {
        private static final sun.misc.Unsafe UNSAFE = null;
        private static final long valueOffset = 0;
        volatile long p0;
        volatile long p1;
        volatile long p2;
        volatile long p3;
        volatile long p4;
        volatile long p5;
        volatile long p6;
        volatile long q0;
        volatile long q1;
        volatile long q2;
        volatile long q3;
        volatile long q4;
        volatile long q5;
        volatile long q6;
        volatile long value;

        static {
                sun.misc.Unsafe r0 = com.google.common.hash.Striped64.access$000()     // Catch: java.lang.Exception -> L15
                com.google.common.hash.Striped64.Cell.UNSAFE = r0     // Catch: java.lang.Exception -> L15
                java.lang.Class<com.google.common.hash.Striped64$Cell> r1 = com.google.common.hash.Striped64.Cell.class
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L15
                long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Exception -> L15
                com.google.common.hash.Striped64.Cell.valueOffset = r0     // Catch: java.lang.Exception -> L15
                return
            L15:
                r0 = move-exception
                java.lang.Error r1 = new java.lang.Error
                r1.<init>(r0)
                throw r1
        }

        Cell(long r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        final boolean cas(long r9, long r11) {
                r8 = this;
                sun.misc.Unsafe r0 = com.google.common.hash.Striped64.Cell.UNSAFE
                long r2 = com.google.common.hash.Striped64.Cell.valueOffset
                r1 = r8
                r4 = r9
                r6 = r11
                boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
                return r9
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.common.hash.Striped64.threadHashCode = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            com.google.common.hash.Striped64.rng = r0
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.google.common.hash.Striped64.NCPU = r0
            sun.misc.Unsafe r0 = getUnsafe()     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.UNSAFE = r0     // Catch: java.lang.Exception -> L39
            java.lang.Class<com.google.common.hash.Striped64> r1 = com.google.common.hash.Striped64.class
            java.lang.String r2 = "base"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L39
            long r2 = r0.objectFieldOffset(r2)     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.baseOffset = r2     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "busy"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L39
            long r0 = r0.objectFieldOffset(r1)     // Catch: java.lang.Exception -> L39
            com.google.common.hash.Striped64.busyOffset = r0     // Catch: java.lang.Exception -> L39
            return
        L39:
            r0 = move-exception
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            throw r1
    }

    Striped64() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ sun.misc.Unsafe access$000() {
            sun.misc.Unsafe r0 = getUnsafe()
            return r0
    }

    private static sun.misc.Unsafe getUnsafe() {
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L5
            return r0
        L5:
            com.google.common.hash.Striped64$1 r0 = new com.google.common.hash.Striped64$1     // Catch: java.security.PrivilegedActionException -> L11
            r0.<init>()     // Catch: java.security.PrivilegedActionException -> L11
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L11
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.security.PrivilegedActionException -> L11
            return r0
        L11:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
    }

    final boolean casBase(long r9, long r11) {
            r8 = this;
            sun.misc.Unsafe r0 = com.google.common.hash.Striped64.UNSAFE
            long r2 = com.google.common.hash.Striped64.baseOffset
            r1 = r8
            r4 = r9
            r6 = r11
            boolean r9 = r0.compareAndSwapLong(r1, r2, r4, r6)
            return r9
    }

    final boolean casBusy() {
            r6 = this;
            sun.misc.Unsafe r0 = com.google.common.hash.Striped64.UNSAFE
            long r2 = com.google.common.hash.Striped64.busyOffset
            r4 = 0
            r5 = 1
            r1 = r6
            boolean r0 = r0.compareAndSwapInt(r1, r2, r4, r5)
            return r0
    }

    abstract long fn(long r1, long r3);

    final void internalReset(long r5) {
            r4 = this;
            com.google.common.hash.Striped64$Cell[] r0 = r4.cells
            r4.base = r5
            if (r0 == 0) goto L13
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            r3 = r0[r2]
            if (r3 == 0) goto L10
            r3.value = r5
        L10:
            int r2 = r2 + 1
            goto L8
        L13:
            return
    }

    final void retryUpdate(long r17, @org.checkerframework.checker.nullness.compatqual.NullableDecl int[] r19, boolean r20) {
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = 1
            r4 = 0
            if (r19 != 0) goto L1b
            java.lang.ThreadLocal<int[]> r5 = com.google.common.hash.Striped64.threadHashCode
            int[] r6 = new int[r0]
            r5.set(r6)
            java.util.Random r5 = com.google.common.hash.Striped64.rng
            int r5 = r5.nextInt()
            if (r5 != 0) goto L18
            r5 = 1
        L18:
            r6[r4] = r5
            goto L1f
        L1b:
            r5 = r19[r4]
            r6 = r19
        L1f:
            r7 = r5
            r8 = 0
            r5 = r20
        L23:
            com.google.common.hash.Striped64$Cell[] r9 = r1.cells
            if (r9 == 0) goto Lb8
            int r10 = r9.length
            if (r10 <= 0) goto Lb8
            int r11 = r10 + (-1)
            r11 = r11 & r7
            r11 = r9[r11]
            if (r11 != 0) goto L64
            int r9 = r1.busy
            if (r9 != 0) goto L62
            com.google.common.hash.Striped64$Cell r9 = new com.google.common.hash.Striped64$Cell
            r9.<init>(r2)
            int r10 = r1.busy
            if (r10 != 0) goto L62
            boolean r10 = r1.casBusy()
            if (r10 == 0) goto L62
            com.google.common.hash.Striped64$Cell[] r10 = r1.cells     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto L58
            int r11 = r10.length     // Catch: java.lang.Throwable -> L56
            if (r11 <= 0) goto L58
            int r11 = r11 + (-1)
            r11 = r11 & r7
            r12 = r10[r11]     // Catch: java.lang.Throwable -> L56
            if (r12 != 0) goto L58
            r10[r11] = r9     // Catch: java.lang.Throwable -> L56
            r9 = 1
            goto L59
        L56:
            r0 = move-exception
            goto L5f
        L58:
            r9 = 0
        L59:
            r1.busy = r4
            if (r9 == 0) goto L23
            goto Lf1
        L5f:
            r1.busy = r4
            throw r0
        L62:
            r8 = 0
            goto Lab
        L64:
            if (r5 != 0) goto L68
            r5 = 1
            goto Lab
        L68:
            long r12 = r11.value
            long r14 = r1.fn(r12, r2)
            boolean r11 = r11.cas(r12, r14)
            if (r11 == 0) goto L76
            goto Lf1
        L76:
            int r11 = com.google.common.hash.Striped64.NCPU
            if (r10 >= r11) goto L62
            com.google.common.hash.Striped64$Cell[] r11 = r1.cells
            if (r11 == r9) goto L7f
            goto L62
        L7f:
            if (r8 != 0) goto L83
            r8 = 1
            goto Lab
        L83:
            int r11 = r1.busy
            if (r11 != 0) goto Lab
            boolean r11 = r1.casBusy()
            if (r11 == 0) goto Lab
            com.google.common.hash.Striped64$Cell[] r8 = r1.cells     // Catch: java.lang.Throwable -> L9f
            if (r8 != r9) goto La3
            int r8 = r10 << 1
            com.google.common.hash.Striped64$Cell[] r8 = new com.google.common.hash.Striped64.Cell[r8]     // Catch: java.lang.Throwable -> L9f
            r11 = 0
        L96:
            if (r11 >= r10) goto La1
            r12 = r9[r11]     // Catch: java.lang.Throwable -> L9f
            r8[r11] = r12     // Catch: java.lang.Throwable -> L9f
            int r11 = r11 + 1
            goto L96
        L9f:
            r0 = move-exception
            goto La8
        La1:
            r1.cells = r8     // Catch: java.lang.Throwable -> L9f
        La3:
            r1.busy = r4
            r8 = 0
            goto L23
        La8:
            r1.busy = r4
            throw r0
        Lab:
            int r9 = r7 << 13
            r7 = r7 ^ r9
            int r9 = r7 >>> 17
            r7 = r7 ^ r9
            int r9 = r7 << 5
            r7 = r7 ^ r9
            r6[r4] = r7
            goto L23
        Lb8:
            int r10 = r1.busy
            if (r10 != 0) goto Le5
            com.google.common.hash.Striped64$Cell[] r10 = r1.cells
            if (r10 != r9) goto Le5
            boolean r10 = r1.casBusy()
            if (r10 == 0) goto Le5
            com.google.common.hash.Striped64$Cell[] r10 = r1.cells     // Catch: java.lang.Throwable -> Lda
            if (r10 != r9) goto Ldc
            r9 = 2
            com.google.common.hash.Striped64$Cell[] r9 = new com.google.common.hash.Striped64.Cell[r9]     // Catch: java.lang.Throwable -> Lda
            r10 = r7 & 1
            com.google.common.hash.Striped64$Cell r11 = new com.google.common.hash.Striped64$Cell     // Catch: java.lang.Throwable -> Lda
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Lda
            r9[r10] = r11     // Catch: java.lang.Throwable -> Lda
            r1.cells = r9     // Catch: java.lang.Throwable -> Lda
            r9 = 1
            goto Ldd
        Lda:
            r0 = move-exception
            goto Le2
        Ldc:
            r9 = 0
        Ldd:
            r1.busy = r4
            if (r9 == 0) goto L23
            goto Lf1
        Le2:
            r1.busy = r4
            throw r0
        Le5:
            long r9 = r1.base
            long r11 = r1.fn(r9, r2)
            boolean r9 = r1.casBase(r9, r11)
            if (r9 == 0) goto L23
        Lf1:
            return
    }
}
