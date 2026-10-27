package rx.internal.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum ExceptionsUtils extends java.lang.Enum<rx.internal.util.ExceptionsUtils> {
    private static final /* synthetic */ rx.internal.util.ExceptionsUtils[] $VALUES = null;
    private static final java.lang.Throwable TERMINATED = null;

    static {
            r0 = 0
            rx.internal.util.ExceptionsUtils[] r0 = new rx.internal.util.ExceptionsUtils[r0]
            rx.internal.util.ExceptionsUtils.$VALUES = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            java.lang.String r1 = "Terminated"
            r0.<init>(r1)
            rx.internal.util.ExceptionsUtils.TERMINATED = r0
            return
    }

    ExceptionsUtils(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean addThrowable(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r5, java.lang.Throwable r6) {
        L0:
            java.lang.Object r0 = r5.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = rx.internal.util.ExceptionsUtils.TERMINATED
            r2 = 0
            if (r0 != r1) goto Lc
            return r2
        Lc:
            r1 = 1
            if (r0 != 0) goto L11
            r3 = r6
            goto L36
        L11:
            boolean r3 = r0 instanceof rx.exceptions.CompositeException
            if (r3 == 0) goto L2a
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r0
            rx.exceptions.CompositeException r3 = (rx.exceptions.CompositeException) r3
            java.util.List r3 = r3.getExceptions()
            r2.<init>(r3)
            r2.add(r6)
            rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
            r3.<init>(r2)
            goto L36
        L2a:
            rx.exceptions.CompositeException r3 = new rx.exceptions.CompositeException
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r2] = r0
            r4[r1] = r6
            r3.<init>(r4)
        L36:
            boolean r0 = androidx.camera.view.p.a(r5, r0, r3)
            if (r0 == 0) goto L0
            return r1
    }

    public static boolean isTerminated(java.lang.Throwable r1) {
            java.lang.Throwable r0 = rx.internal.util.ExceptionsUtils.TERMINATED
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static boolean isTerminated(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0) {
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = isTerminated(r0)
            return r0
    }

    public static java.lang.Throwable terminate(java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r2) {
            java.lang.Object r0 = r2.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = rx.internal.util.ExceptionsUtils.TERMINATED
            if (r0 == r1) goto L11
            java.lang.Object r2 = r2.getAndSet(r1)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L11:
            return r0
    }

    public static rx.internal.util.ExceptionsUtils valueOf(java.lang.String r1) {
            java.lang.Class<rx.internal.util.ExceptionsUtils> r0 = rx.internal.util.ExceptionsUtils.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rx.internal.util.ExceptionsUtils r1 = (rx.internal.util.ExceptionsUtils) r1
            return r1
    }

    public static rx.internal.util.ExceptionsUtils[] values() {
            rx.internal.util.ExceptionsUtils[] r0 = rx.internal.util.ExceptionsUtils.$VALUES
            java.lang.Object r0 = r0.clone()
            rx.internal.util.ExceptionsUtils[] r0 = (rx.internal.util.ExceptionsUtils[]) r0
            return r0
    }
}
