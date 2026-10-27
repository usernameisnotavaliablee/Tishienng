package com.bumptech.glide.load.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class GlideException extends java.lang.Exception {
    private static final java.lang.StackTraceElement[] EMPTY_ELEMENTS = null;
    private static final long serialVersionUID = 1;
    private final java.util.List<java.lang.Throwable> causes;
    private java.lang.Class<?> dataClass;
    private com.bumptech.glide.load.DataSource dataSource;
    private java.lang.String detailMessage;

    @androidx.annotation.Nullable
    private java.lang.Exception exception;
    private com.bumptech.glide.load.c key;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements java.lang.Appendable {
        private static final java.lang.String c = "";
        private static final java.lang.String d = "  ";
        private final java.lang.Appendable a;
        private boolean b;

        a(java.lang.Appendable r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.b = r0
                r1.a = r2
                return
        }

        @androidx.annotation.NonNull
        private java.lang.CharSequence a(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                if (r1 != 0) goto L4
                java.lang.String r1 = ""
            L4:
                return r1
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(char r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.b
                r1 = 0
                if (r0 == 0) goto Le
                r3.b = r1
                java.lang.Appendable r0 = r3.a
                java.lang.String r2 = "  "
                r0.append(r2)
            Le:
                r0 = 10
                if (r4 != r0) goto L13
                r1 = 1
            L13:
                r3.b = r1
                java.lang.Appendable r0 = r3.a
                r0.append(r4)
                return r3
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@androidx.annotation.Nullable java.lang.CharSequence r3) throws java.io.IOException {
                r2 = this;
                java.lang.CharSequence r3 = r2.a(r3)
                r0 = 0
                int r1 = r3.length()
                java.lang.Appendable r3 = r2.append(r3, r0, r1)
                return r3
        }

        @Override // java.lang.Appendable
        public java.lang.Appendable append(@androidx.annotation.Nullable java.lang.CharSequence r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                java.lang.CharSequence r4 = r3.a(r4)
                boolean r0 = r3.b
                r1 = 0
                if (r0 == 0) goto L12
                r3.b = r1
                java.lang.Appendable r0 = r3.a
                java.lang.String r2 = "  "
                r0.append(r2)
            L12:
                int r0 = r4.length()
                if (r0 <= 0) goto L23
                int r0 = r6 + (-1)
                char r0 = r4.charAt(r0)
                r2 = 10
                if (r0 != r2) goto L23
                r1 = 1
            L23:
                r3.b = r1
                java.lang.Appendable r0 = r3.a
                r0.append(r4, r5, r6)
                return r3
        }
    }

    static {
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            com.bumptech.glide.load.engine.GlideException.EMPTY_ELEMENTS = r0
            return
    }

    public GlideException(java.lang.String r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.<init>(r2, r0)
            return
    }

    public GlideException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.<init>(r1, r2)
            return
    }

    public GlideException(java.lang.String r1, java.util.List<java.lang.Throwable> r2) {
            r0 = this;
            r0.<init>()
            r0.detailMessage = r1
            java.lang.StackTraceElement[] r1 = com.bumptech.glide.load.engine.GlideException.EMPTY_ELEMENTS
            r0.setStackTrace(r1)
            r0.causes = r2
            return
    }

    private void addRootCauses(java.lang.Throwable r2, java.util.List<java.lang.Throwable> r3) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.engine.GlideException
            if (r0 == 0) goto L1f
            com.bumptech.glide.load.engine.GlideException r2 = (com.bumptech.glide.load.engine.GlideException) r2
            java.util.List r2 = r2.getCauses()
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.addRootCauses(r0, r3)
            goto Le
        L1e:
            return
        L1f:
            r3.add(r2)
            return
    }

    private static void appendCauses(java.util.List<java.lang.Throwable> r0, java.lang.Appendable r1) {
            appendCausesWrapped(r0, r1)     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static void appendCausesWrapped(java.util.List<java.lang.Throwable> r5, java.lang.Appendable r6) throws java.io.IOException {
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L3f
            java.lang.String r2 = "Cause ("
            java.lang.Appendable r2 = r6.append(r2)
            int r3 = r1 + 1
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = " of "
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Appendable r2 = r2.append(r4)
            java.lang.String r4 = "): "
            r2.append(r4)
            java.lang.Object r1 = r5.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r2 = r1 instanceof com.bumptech.glide.load.engine.GlideException
            if (r2 == 0) goto L3a
            com.bumptech.glide.load.engine.GlideException r1 = (com.bumptech.glide.load.engine.GlideException) r1
            r1.printStackTrace(r6)
            goto L3d
        L3a:
            appendExceptionMessage(r1, r6)
        L3d:
            r1 = r3
            goto L5
        L3f:
            return
    }

    private static void appendExceptionMessage(java.lang.Throwable r1, java.lang.Appendable r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = ": "
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r1.getMessage()     // Catch: java.io.IOException -> L20
            java.lang.Appendable r2 = r2.append(r0)     // Catch: java.io.IOException -> L20
            r0 = 10
            r2.append(r0)     // Catch: java.io.IOException -> L20
            return
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    private void printStackTrace(java.lang.Appendable r3) {
            r2 = this;
            appendExceptionMessage(r2, r3)
            java.util.List r0 = r2.getCauses()
            com.bumptech.glide.load.engine.GlideException$a r1 = new com.bumptech.glide.load.engine.GlideException$a
            r1.<init>(r3)
            appendCauses(r0, r1)
            return
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
            r0 = this;
            return r0
    }

    public java.util.List<java.lang.Throwable> getCauses() {
            r1 = this;
            java.util.List<java.lang.Throwable> r0 = r1.causes
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 71
            r0.<init>(r1)
            java.lang.String r1 = r5.detailMessage
            r0.append(r1)
            java.lang.Class<?> r1 = r5.dataClass
            java.lang.String r2 = ""
            java.lang.String r3 = ", "
            if (r1 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.Class<?> r4 = r5.dataClass
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L27
        L26:
            r1 = r2
        L27:
            r0.append(r1)
            com.bumptech.glide.load.DataSource r1 = r5.dataSource
            if (r1 == 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            com.bumptech.glide.load.DataSource r4 = r5.dataSource
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L41
        L40:
            r1 = r2
        L41:
            r0.append(r1)
            com.bumptech.glide.load.c r1 = r5.key
            if (r1 == 0) goto L59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            com.bumptech.glide.load.c r2 = r5.key
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L59:
            r0.append(r2)
            java.util.List r1 = r5.getRootCauses()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L6b
            java.lang.String r0 = r0.toString()
            return r0
        L6b:
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L78
            java.lang.String r2 = "\nThere was 1 root cause:"
            r0.append(r2)
            goto L89
        L78:
            java.lang.String r2 = "\nThere were "
            r0.append(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r2 = " root causes:"
            r0.append(r2)
        L89:
            java.util.Iterator r1 = r1.iterator()
        L8d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r1.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = 10
            r0.append(r3)
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            r3 = 40
            r0.append(r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            goto L8d
        Lbb:
            java.lang.String r1 = "\n call GlideException#logRootCauses(String) for more detail"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Exception getOrigin() {
            r1 = this;
            java.lang.Exception r0 = r1.exception
            return r0
    }

    public java.util.List<java.lang.Throwable> getRootCauses() {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.addRootCauses(r1, r0)
            return r0
    }

    public void logRootCauses(java.lang.String r4) {
            r3 = this;
            java.util.List r4 = r3.getRootCauses()
            int r0 = r4.size()
            r1 = 0
        L9:
            if (r1 >= r0) goto L15
            int r2 = r1 + 1
            java.lang.Object r1 = r4.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r1 = r2
            goto L9
        L15:
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
            r0 = this;
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream r1) {
            r0 = this;
            r0.printStackTrace(r1)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r1) {
            r0 = this;
            r0.printStackTrace(r1)
            return
    }

    void setLoggingDetails(com.bumptech.glide.load.c r2, com.bumptech.glide.load.DataSource r3) {
            r1 = this;
            r0 = 0
            r1.setLoggingDetails(r2, r3, r0)
            return
    }

    void setLoggingDetails(com.bumptech.glide.load.c r1, com.bumptech.glide.load.DataSource r2, java.lang.Class<?> r3) {
            r0 = this;
            r0.key = r1
            r0.dataSource = r2
            r0.dataClass = r3
            return
    }

    public void setOrigin(@androidx.annotation.Nullable java.lang.Exception r1) {
            r0 = this;
            r0.exception = r1
            return
    }
}
