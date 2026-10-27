package io.reactivex.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ExceptionHelper {
    public static final java.lang.Throwable TERMINATED = null;


    static {
            io.reactivex.internal.util.ExceptionHelper$1 r0 = new io.reactivex.internal.util.ExceptionHelper$1
            java.lang.String r1 = "No further exceptions"
            r0.<init>(r1)
            io.reactivex.internal.util.ExceptionHelper.TERMINATED = r0
            return
    }

    private ExceptionHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static <T> boolean addThrowable(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5, java.lang.Throwable r6) {
        L0:
            java.lang.Object r0 = r5.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            r1 = 1
            if (r0 != 0) goto L11
            r3 = r6
            goto L1d
        L11:
            io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r2] = r0
            r4[r1] = r6
            r3.<init>(r4)
        L1d:
            boolean r0 = androidx.camera.view.p.a(r5, r0, r3)
            if (r0 == 0) goto L0
            return r1
    }

    public static java.util.List<java.lang.Throwable> flatten(java.lang.Throwable r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r1.offer(r4)
        Ld:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L39
            java.lang.Object r4 = r1.removeFirst()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r2 = r4 instanceof io.reactivex.exceptions.CompositeException
            if (r2 == 0) goto L35
            io.reactivex.exceptions.CompositeException r4 = (io.reactivex.exceptions.CompositeException) r4
            java.util.List r4 = r4.getExceptions()
            int r2 = r4.size()
            int r2 = r2 + (-1)
        L29:
            if (r2 < 0) goto Ld
            java.lang.Object r3 = r4.get(r2)
            r1.offerFirst(r3)
            int r2 = r2 + (-1)
            goto L29
        L35:
            r0.add(r4)
            goto Ld
        L39:
            return r0
    }

    public static <T> java.lang.Throwable terminate(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2) {
            java.lang.Object r0 = r2.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
            if (r0 == r1) goto L11
            java.lang.Object r2 = r2.getAndSet(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L11:
            return r0
    }

    public static java.lang.RuntimeException wrapOrThrow(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 != 0) goto L11
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 == 0) goto Lb
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            return r1
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            return r0
        L11:
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
    }
}
