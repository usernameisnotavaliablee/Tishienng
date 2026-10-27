package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    private static final int a = 25;

    private a() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    public static void a(java.lang.Throwable r4, java.lang.Throwable r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            java.lang.Throwable r2 = r4.getCause()
            if (r2 == 0) goto L2b
            int r2 = r1 + 1
            r3 = 25
            if (r1 < r3) goto L13
            return
        L13:
            java.lang.Throwable r4 = r4.getCause()
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L22
            goto L2b
        L22:
            java.lang.Throwable r1 = r4.getCause()
            r0.add(r1)
            r1 = r2
            goto L6
        L2b:
            r4.initCause(r5)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return
    }

    public static java.lang.Throwable b(java.lang.Throwable r3) {
            r0 = 0
        L1:
            java.lang.Throwable r1 = r3.getCause()
            if (r1 == 0) goto L1b
            int r1 = r0 + 1
            r2 = 25
            if (r0 < r2) goto L15
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Stack too deep to get final cause"
            r3.<init>(r0)
            return r3
        L15:
            java.lang.Throwable r3 = r3.getCause()
            r0 = r1
            goto L1
        L1b:
            return r3
    }

    public static java.lang.RuntimeException c(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L11
            boolean r0 = r1 instanceof java.lang.Error
            if (r0 == 0) goto Lb
            java.lang.Error r1 = (java.lang.Error) r1
            throw r1
        Lb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            throw r1
    }

    public static void d(java.util.List<? extends java.lang.Throwable> r2) {
            if (r2 == 0) goto L30
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L30
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L2a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r0 = r2 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L27
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 == 0) goto L21
            java.lang.Error r2 = (java.lang.Error) r2
            throw r2
        L21:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
        L27:
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L2a:
            rx.exceptions.CompositeException r0 = new rx.exceptions.CompositeException
            r0.<init>(r2)
            throw r0
        L30:
            return
    }

    public static void e(java.lang.Throwable r1) {
            boolean r0 = r1 instanceof rx.exceptions.OnErrorNotImplementedException
            if (r0 != 0) goto L28
            boolean r0 = r1 instanceof rx.exceptions.OnErrorFailedException
            if (r0 != 0) goto L25
            boolean r0 = r1 instanceof rx.exceptions.OnCompletedFailedException
            if (r0 != 0) goto L22
            boolean r0 = r1 instanceof java.lang.VirtualMachineError
            if (r0 != 0) goto L1f
            boolean r0 = r1 instanceof java.lang.ThreadDeath
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.LinkageError
            if (r0 != 0) goto L19
            return
        L19:
            java.lang.LinkageError r1 = (java.lang.LinkageError) r1
            throw r1
        L1c:
            java.lang.ThreadDeath r1 = (java.lang.ThreadDeath) r1
            throw r1
        L1f:
            java.lang.VirtualMachineError r1 = (java.lang.VirtualMachineError) r1
            throw r1
        L22:
            rx.exceptions.OnCompletedFailedException r1 = (rx.exceptions.OnCompletedFailedException) r1
            throw r1
        L25:
            rx.exceptions.OnErrorFailedException r1 = (rx.exceptions.OnErrorFailedException) r1
            throw r1
        L28:
            rx.exceptions.OnErrorNotImplementedException r1 = (rx.exceptions.OnErrorNotImplementedException) r1
            throw r1
    }

    public static void f(java.lang.Throwable r0, rx.f<?> r1) {
            e(r0)
            r1.onError(r0)
            return
    }

    public static void g(java.lang.Throwable r0, rx.f<?> r1, java.lang.Object r2) {
            e(r0)
            java.lang.Throwable r0 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r2)
            r1.onError(r0)
            return
    }

    public static void h(java.lang.Throwable r0, rx.k<?> r1) {
            e(r0)
            r1.onError(r0)
            return
    }

    public static void i(java.lang.Throwable r0, rx.k<?> r1, java.lang.Object r2) {
            e(r0)
            java.lang.Throwable r0 = rx.exceptions.OnErrorThrowable.addValueAsLastCause(r0, r2)
            r1.onError(r0)
            return
    }
}
