package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.j2objc.annotations.ReflectionSupport(com.google.j2objc.annotations.ReflectionSupport.Level.FULL)
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class InterruptibleTask<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> implements java.lang.Runnable {
    private static final java.lang.Runnable DONE = null;
    private static final java.lang.Runnable INTERRUPTING = null;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final java.lang.Runnable PARKED = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.util.concurrent.InterruptibleTask$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class DoNothingRunnable implements java.lang.Runnable {
        private DoNothingRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DoNothingRunnable(com.google.common.util.concurrent.InterruptibleTask.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                return
        }
    }

    static {
            com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable r0 = new com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable
            r1 = 0
            r0.<init>(r1)
            com.google.common.util.concurrent.InterruptibleTask.DONE = r0
            com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable r0 = new com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable
            r0.<init>(r1)
            com.google.common.util.concurrent.InterruptibleTask.INTERRUPTING = r0
            com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable r0 = new com.google.common.util.concurrent.InterruptibleTask$DoNothingRunnable
            r0.<init>(r1)
            com.google.common.util.concurrent.InterruptibleTask.PARKED = r0
            return
    }

    InterruptibleTask() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract void afterRanInterruptibly(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Throwable r2);

    final void interruptTask() {
            r4 = this;
            java.lang.Object r0 = r4.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L3d
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.INTERRUPTING
            boolean r1 = r4.compareAndSet(r0, r1)
            if (r1 == 0) goto L3d
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1     // Catch: java.lang.Throwable -> L2a
            r1.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.DONE
            java.lang.Object r1 = r4.getAndSet(r1)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Runnable r2 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r1 != r2) goto L3d
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            return
        L2a:
            r1 = move-exception
            java.lang.Runnable r2 = com.google.common.util.concurrent.InterruptibleTask.DONE
            java.lang.Object r2 = r4.getAndSet(r2)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.Runnable r3 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r2 != r3) goto L3c
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L3c:
            throw r1
        L3d:
            return
    }

    abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
            boolean r2 = r12.compareAndSet(r1, r0)
            if (r2 != 0) goto Ld
            goto Lb5
        Ld:
            boolean r2 = r12.isDone()
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L69
            java.lang.Object r6 = r12.runInterruptibly()     // Catch: java.lang.Throwable -> L1c
            goto L6a
        L1c:
            r6 = move-exception
            java.lang.Runnable r7 = com.google.common.util.concurrent.InterruptibleTask.DONE
            boolean r7 = r12.compareAndSet(r0, r7)
            if (r7 != 0) goto L63
            java.lang.Object r7 = r12.get()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r8 = 0
            r9 = 0
        L2d:
            java.lang.Runnable r10 = com.google.common.util.concurrent.InterruptibleTask.INTERRUPTING
            if (r7 == r10) goto L3c
            java.lang.Runnable r11 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r7 != r11) goto L36
            goto L3c
        L36:
            if (r8 == 0) goto L63
            r0.interrupt()
            goto L63
        L3c:
            int r9 = r9 + r4
            if (r9 <= r3) goto L59
            java.lang.Runnable r11 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r7 == r11) goto L49
            boolean r7 = r12.compareAndSet(r10, r11)
            if (r7 == 0) goto L5c
        L49:
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto L54
            if (r8 == 0) goto L52
            goto L54
        L52:
            r8 = 0
            goto L55
        L54:
            r8 = 1
        L55:
            java.util.concurrent.locks.LockSupport.park(r12)
            goto L5c
        L59:
            java.lang.Thread.yield()
        L5c:
            java.lang.Object r7 = r12.get()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L2d
        L63:
            if (r2 != 0) goto Lb5
            r12.afterRanInterruptibly(r1, r6)
            goto Lb5
        L69:
            r6 = r1
        L6a:
            java.lang.Runnable r7 = com.google.common.util.concurrent.InterruptibleTask.DONE
            boolean r7 = r12.compareAndSet(r0, r7)
            if (r7 != 0) goto Lb0
            java.lang.Object r7 = r12.get()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r8 = 0
            r9 = 0
        L7a:
            java.lang.Runnable r10 = com.google.common.util.concurrent.InterruptibleTask.INTERRUPTING
            if (r7 == r10) goto L89
            java.lang.Runnable r11 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r7 != r11) goto L83
            goto L89
        L83:
            if (r8 == 0) goto Lb0
            r0.interrupt()
            goto Lb0
        L89:
            int r9 = r9 + r4
            if (r9 <= r3) goto La6
            java.lang.Runnable r11 = com.google.common.util.concurrent.InterruptibleTask.PARKED
            if (r7 == r11) goto L96
            boolean r7 = r12.compareAndSet(r10, r11)
            if (r7 == 0) goto La9
        L96:
            boolean r7 = java.lang.Thread.interrupted()
            if (r7 != 0) goto La1
            if (r8 == 0) goto L9f
            goto La1
        L9f:
            r8 = 0
            goto La2
        La1:
            r8 = 1
        La2:
            java.util.concurrent.locks.LockSupport.park(r12)
            goto La9
        La6:
            java.lang.Thread.yield()
        La9:
            java.lang.Object r7 = r12.get()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L7a
        Lb0:
            if (r2 != 0) goto Lb5
            r12.afterRanInterruptibly(r6, r1)
        Lb5:
            return
    }

    abstract T runInterruptibly() throws java.lang.Exception;

    abstract java.lang.String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.DONE
            if (r0 != r1) goto Ld
            java.lang.String r0 = "running=[DONE]"
            goto L37
        Ld:
            java.lang.Runnable r1 = com.google.common.util.concurrent.InterruptibleTask.INTERRUPTING
            if (r0 != r1) goto L14
            java.lang.String r0 = "running=[INTERRUPTED]"
            goto L37
        L14:
            boolean r1 = r0 instanceof java.lang.Thread
            if (r1 == 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "running=[RUNNING ON "
            r1.append(r2)
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L37
        L35:
            java.lang.String r0 = "running=[NOT STARTED YET]"
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r3.toPendingString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
