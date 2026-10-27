package io.reactivex.exceptions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CompositeException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private java.lang.Throwable cause;
    private final java.util.List<java.lang.Throwable> exceptions;
    private final java.lang.String message;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CompositeExceptionCausalChain extends java.lang.RuntimeException {
        static final java.lang.String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        CompositeExceptionCausalChain() {
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
    static abstract class PrintStreamOrWriter {
        PrintStreamOrWriter() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract void println(java.lang.Object r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WrappedPrintStream extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintStream printStream;

        WrappedPrintStream(java.io.PrintStream r1) {
                r0 = this;
                r0.<init>()
                r0.printStream = r1
                return
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        void println(java.lang.Object r1) {
                r0 = this;
                java.io.PrintStream r1 = r0.printStream
                r1.getClass()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class WrappedPrintWriter extends io.reactivex.exceptions.CompositeException.PrintStreamOrWriter {
        private final java.io.PrintWriter printWriter;

        WrappedPrintWriter(java.io.PrintWriter r1) {
                r0 = this;
                r0.<init>()
                r0.printWriter = r1
                return
        }

        @Override // io.reactivex.exceptions.CompositeException.PrintStreamOrWriter
        void println(java.lang.Object r2) {
                r1 = this;
                java.io.PrintWriter r0 = r1.printWriter
                r0.println(r2)
                return
        }
    }

    public CompositeException(java.lang.Iterable<? extends java.lang.Throwable> r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r5 == 0) goto L3e
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r5.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = r2 instanceof io.reactivex.exceptions.CompositeException
            if (r3 == 0) goto L2d
            io.reactivex.exceptions.CompositeException r2 = (io.reactivex.exceptions.CompositeException) r2
            java.util.List r2 = r2.getExceptions()
            r0.addAll(r2)
            goto L13
        L2d:
            if (r2 == 0) goto L33
            r0.add(r2)
            goto L13
        L33:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Throwable was null!"
            r2.<init>(r3)
            r0.add(r2)
            goto L13
        L3e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r2 = "errors was null"
            r5.<init>(r2)
            r0.add(r5)
        L48:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L6f
            r1.addAll(r0)
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r4.exceptions = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r5 = r5.size()
            r0.append(r5)
            java.lang.String r5 = " exceptions occurred. "
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.message = r5
            return
        L6f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errors is empty"
            r5.<init>(r0)
            throw r5
    }

    public CompositeException(java.lang.Throwable... r3) {
            r2 = this;
            if (r3 != 0) goto L14
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r3.<init>(r0)
            r0 = 1
            java.lang.NullPointerException[] r0 = new java.lang.NullPointerException[r0]
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            goto L18
        L14:
            java.util.List r3 = java.util.Arrays.asList(r3)
        L18:
            r2.<init>(r3)
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
            if (r1 == 0) goto L1c
            if (r1 != r3) goto Le
            goto L1c
        Le:
            r0.add(r1)
            java.lang.Throwable r3 = r1.getCause()
            if (r3 == 0) goto L1c
            if (r3 != r1) goto L1a
            goto L1c
        L1a:
            r1 = r3
            goto Le
        L1c:
            return r0
    }

    private java.lang.Throwable getRootCause(java.lang.Throwable r3) {
            r2 = this;
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L17
            java.lang.Throwable r1 = r2.cause
            if (r1 != r0) goto Lb
            goto L17
        Lb:
            java.lang.Throwable r3 = r0.getCause()
            if (r3 == 0) goto L16
            if (r3 != r0) goto L14
            goto L16
        L14:
            r0 = r3
            goto Lb
        L16:
            return r0
        L17:
            return r3
    }

    private void printStackTrace(io.reactivex.exceptions.CompositeException.PrintStreamOrWriter r8) {
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
            java.lang.String r0 = r0.toString()
            r8.println(r0)
            return
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L5e
            io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain     // Catch: java.lang.Throwable -> L4e
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
            io.reactivex.exceptions.CompositeException$WrappedPrintStream r0 = new io.reactivex.exceptions.CompositeException$WrappedPrintStream
            r0.<init>(r2)
            r1.printStackTrace(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r2) {
            r1 = this;
            io.reactivex.exceptions.CompositeException$WrappedPrintWriter r0 = new io.reactivex.exceptions.CompositeException$WrappedPrintWriter
            r0.<init>(r2)
            r1.printStackTrace(r0)
            return
    }

    public int size() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.exceptions
            int r0 = r0.size()
            return r0
    }
}
