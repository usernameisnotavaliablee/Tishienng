package rx.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CompositeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private java.lang.Throwable cause;
    private final java.util.List<java.lang.Throwable> exceptions;
    private final java.lang.String message;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends java.lang.RuntimeException {
        static final java.lang.String a = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = "Chain of Causes for CompositeException In Order Received =>"
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static abstract class b {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract java.lang.Object a();

        abstract void b(java.lang.Object r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class c extends rx.exceptions.CompositeException.b {
        private final java.io.PrintStream a;

        c(java.io.PrintStream r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // rx.exceptions.CompositeException.b
        java.lang.Object a() {
                r1 = this;
                java.io.PrintStream r0 = r1.a
                return r0
        }

        @Override // rx.exceptions.CompositeException.b
        void b(java.lang.Object r1) {
                r0 = this;
                java.io.PrintStream r1 = r0.a
                r1.getClass()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d extends rx.exceptions.CompositeException.b {
        private final java.io.PrintWriter a;

        d(java.io.PrintWriter r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // rx.exceptions.CompositeException.b
        java.lang.Object a() {
                r1 = this;
                java.io.PrintWriter r0 = r1.a
                return r0
        }

        @Override // rx.exceptions.CompositeException.b
        void b(java.lang.Object r2) {
                r1 = this;
                java.io.PrintWriter r0 = r1.a
                r0.println(r2)
                return
        }
    }

    @java.lang.Deprecated
    public CompositeException(java.lang.String r4, java.util.Collection<? extends java.lang.Throwable> r5) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L3c
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r2 = r1 instanceof rx.exceptions.CompositeException
            if (r2 == 0) goto L2d
            rx.exceptions.CompositeException r1 = (rx.exceptions.CompositeException) r1
            java.util.List r1 = r1.getExceptions()
            r4.addAll(r1)
            goto L13
        L2d:
            if (r1 == 0) goto L33
            r4.add(r1)
            goto L13
        L33:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
            r4.add(r1)
            goto L13
        L3c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>()
            r4.add(r5)
        L44:
            r0.addAll(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            r3.exceptions = r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r4 = r4.size()
            r5.append(r4)
            java.lang.String r4 = " exceptions occurred. "
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.message = r4
            return
    }

    public CompositeException(java.util.Collection<? extends java.lang.Throwable> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public CompositeException(java.lang.Throwable... r7) {
            r6 = this;
            r6.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r7 == 0) goto L34
            int r2 = r7.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L3c
            r4 = r7[r3]
            boolean r5 = r4 instanceof rx.exceptions.CompositeException
            if (r5 == 0) goto L23
            rx.exceptions.CompositeException r4 = (rx.exceptions.CompositeException) r4
            java.util.List r4 = r4.getExceptions()
            r0.addAll(r4)
            goto L31
        L23:
            if (r4 == 0) goto L29
            r0.add(r4)
            goto L31
        L29:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>()
            r0.add(r4)
        L31:
            int r3 = r3 + 1
            goto L11
        L34:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            r0.add(r7)
        L3c:
            r1.addAll(r0)
            java.util.List r7 = java.util.Collections.unmodifiableList(r1)
            r6.exceptions = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r7 = r7.size()
            r0.append(r7)
            java.lang.String r7 = " exceptions occurred. "
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.message = r7
            return
    }

    private void appendStackTrace(java.lang.StringBuilder r6, java.lang.Throwable r7, java.lang.String r8) {
            r5 = this;
            r6.append(r8)
            r6.append(r7)
            r8 = 10
            r6.append(r8)
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r1 = r0.length
            r2 = 0
        L11:
            if (r2 >= r1) goto L23
            r3 = r0[r2]
            java.lang.String r4 = "\t\tat "
            r6.append(r4)
            r6.append(r3)
            r6.append(r8)
            int r2 = r2 + 1
            goto L11
        L23:
            java.lang.Throwable r8 = r7.getCause()
            if (r8 == 0) goto L37
            java.lang.String r8 = "\tCaused by: "
            r6.append(r8)
            java.lang.Throwable r7 = r7.getCause()
            java.lang.String r8 = ""
            r5.appendStackTrace(r6, r7, r8)
        L37:
            return
    }

    private java.util.List<java.lang.Throwable> getListOfCauses(java.lang.Throwable r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Throwable r1 = r3.getCause()
            if (r1 == 0) goto L1f
            if (r1 != r3) goto Le
            goto L1f
        Le:
            r0.add(r1)
            java.lang.Throwable r3 = r1.getCause()
            if (r3 == 0) goto L1f
            if (r3 != r1) goto L1a
            goto L1f
        L1a:
            java.lang.Throwable r1 = r1.getCause()
            goto Le
        L1f:
            return r0
    }

    private java.lang.Throwable getRootCause(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L18
            if (r0 != r2) goto L9
            goto L18
        L9:
            java.lang.Throwable r2 = r0.getCause()
            if (r2 == 0) goto L17
            if (r2 != r0) goto L12
            goto L17
        L12:
            java.lang.Throwable r0 = r0.getCause()
            goto L9
        L17:
            return r0
        L18:
            return r2
    }

    private void printStackTrace(rx.exceptions.CompositeException.b r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r0.append(r7)
            r1 = 10
            r0.append(r1)
            java.lang.StackTraceElement[] r2 = r7.getStackTrace()
            int r3 = r2.length
            r4 = 0
        L15:
            if (r4 >= r3) goto L27
            r5 = r2[r4]
            java.lang.String r6 = "\tat "
            r0.append(r6)
            r0.append(r5)
            r0.append(r1)
            int r4 = r4 + 1
            goto L15
        L27:
            java.util.List<java.lang.Throwable> r1 = r7.exceptions
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L2f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r1.next()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r5 = "  ComposedException "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = " :\n"
            r0.append(r5)
            java.lang.String r5 = "\t"
            r7.appendStackTrace(r0, r4, r5)
            int r3 = r3 + r2
            goto L2f
        L4f:
            java.lang.Object r1 = r8.a()
            monitor-enter(r1)
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            r8.b(r0)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5d
            throw r8
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L5e
            rx.exceptions.CompositeException$a r0 = new rx.exceptions.CompositeException$a     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L4e
            r1.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4e
            r3 = r0
        L16:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r1.contains(r4)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L29
            goto L16
        L29:
            r1.add(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.List r5 = r8.getListOfCauses(r4)     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4e
        L34:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L54
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L4e
            boolean r7 = r1.contains(r6)     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto L50
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L4e
            goto L34
        L4e:
            r0 = move-exception
            goto L62
        L50:
            r1.add(r6)     // Catch: java.lang.Throwable -> L4e
            goto L34
        L54:
            r3.initCause(r4)     // Catch: java.lang.Throwable -> L57
        L57:
            java.lang.Throwable r3 = r8.getRootCause(r3)     // Catch: java.lang.Throwable -> L4e
            goto L16
        L5c:
            r8.cause = r0     // Catch: java.lang.Throwable -> L4e
        L5e:
            java.lang.Throwable r0 = r8.cause     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)
            return r0
        L62:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    public java.util.List<java.lang.Throwable> getExceptions() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.exceptions
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r0 = this;
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream r2) {
            r1 = this;
            rx.exceptions.CompositeException$c r0 = new rx.exceptions.CompositeException$c
            r0.<init>(r2)
            r1.printStackTrace(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r2) {
            r1 = this;
            rx.exceptions.CompositeException$d r0 = new rx.exceptions.CompositeException$d
            r0.<init>(r2)
            r1.printStackTrace(r0)
            return
    }
}
