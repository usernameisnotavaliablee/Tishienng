package org.junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class JUnitCommandLineParseResult {
    private final java.util.List<java.lang.String> a;
    private final java.util.List<java.lang.Class<?>> b;
    private final java.util.List<java.lang.Throwable> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CommandLineParserError extends java.lang.Exception {
        private static final long serialVersionUID = 1;

        public CommandLineParserError(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    JUnitCommandLineParseResult() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.c = r0
            return
    }

    private org.junit.runner.f a(org.junit.runner.f r3) {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.a     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            java.util.Iterator r0 = r0.iterator()     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
        L6:
            boolean r1 = r0.hasNext()     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            org.junit.runner.manipulation.a r1 = org.junit.runner.c.e(r3, r1)     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            org.junit.runner.f r3 = r3.g(r1)     // Catch: org.junit.runner.FilterFactory.FilterNotCreatedException -> L1b
            goto L6
        L1b:
            r3 = move-exception
            goto L1e
        L1d:
            return r3
        L1e:
            org.junit.runner.f r3 = r2.d(r3)
            return r3
    }

    private java.lang.String[] b(java.lang.String[] r3, int r4, int r5) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r4 == r5) goto Lf
            r1 = r3[r4]
            r0.add(r1)
            int r4 = r4 + 1
            goto L5
        Lf:
            int r3 = r0.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
    }

    private org.junit.runner.f d(java.lang.Throwable r2) {
            r1 = this;
            java.lang.Class<org.junit.runner.JUnitCommandLineParseResult> r0 = org.junit.runner.JUnitCommandLineParseResult.class
            org.junit.runner.f r2 = org.junit.runner.f.e(r0, r2)
            return r2
    }

    public static org.junit.runner.JUnitCommandLineParseResult g(java.lang.String[] r1) {
            org.junit.runner.JUnitCommandLineParseResult r0 = new org.junit.runner.JUnitCommandLineParseResult
            r0.<init>()
            r0.h(r1)
            return r0
    }

    private void h(java.lang.String[] r1) {
            r0 = this;
            java.lang.String[] r1 = r0.i(r1)
            r0.j(r1)
            return
    }

    public org.junit.runner.f c(org.junit.runner.a r3) {
            r2 = this;
            java.util.List<java.lang.Throwable> r0 = r2.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
            java.util.List<java.lang.Class<?>> r0 = r2.b
            int r1 = r0.size()
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            org.junit.runner.f r3 = org.junit.runner.f.c(r3, r0)
            org.junit.runner.f r3 = r2.a(r3)
            return r3
        L1f:
            org.junit.runners.model.InitializationError r3 = new org.junit.runners.model.InitializationError
            java.util.List<java.lang.Throwable> r0 = r2.c
            r3.<init>(r0)
            org.junit.runner.f r3 = r2.d(r3)
            return r3
    }

    public java.util.List<java.lang.Class<?>> e() {
            r1 = this;
            java.util.List<java.lang.Class<?>> r0 = r1.b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<java.lang.String> f() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    java.lang.String[] i(java.lang.String... r8) {
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 == r2) goto L94
            r2 = r8[r1]
            java.lang.String r3 = "--"
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L17
            int r1 = r1 + 1
            int r0 = r8.length
            java.lang.String[] r8 = r7.b(r8, r1, r0)
            return r8
        L17:
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L8e
            java.lang.String r3 = "--filter="
            boolean r3 = r2.startsWith(r3)
            java.lang.String r4 = "--filter"
            if (r3 != 0) goto L4f
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L2e
            goto L4f
        L2e:
            java.util.List<java.lang.Throwable> r3 = r7.c
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r4 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "JUnit knows nothing about the "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " option"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r3.add(r4)
            goto L8a
        L4f:
            boolean r3 = r2.equals(r4)
            if (r3 == 0) goto L79
            int r1 = r1 + 1
            int r3 = r8.length
            if (r1 >= r3) goto L5d
            r2 = r8[r1]
            goto L85
        L5d:
            java.util.List<java.lang.Throwable> r8 = r7.c
            org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError r1 = new org.junit.runner.JUnitCommandLineParseResult$CommandLineParserError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " value not specified"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            r8.add(r1)
            goto L94
        L79:
            r3 = 61
            int r3 = r2.indexOf(r3)
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L85:
            java.util.List<java.lang.String> r3 = r7.a
            r3.add(r2)
        L8a:
            int r1 = r1 + 1
            goto L2
        L8e:
            int r0 = r8.length
            java.lang.String[] r8 = r7.b(r8, r1, r0)
            return r8
        L94:
            java.lang.String[] r8 = new java.lang.String[r0]
            return r8
    }

    void j(java.lang.String[] r9) {
            r8 = this;
            int r0 = r9.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L34
            r2 = r9[r1]
            java.util.List<java.lang.Class<?>> r3 = r8.b     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.Class r4 = org.junit.internal.a.a(r2)     // Catch: java.lang.ClassNotFoundException -> L10
            r3.add(r4)     // Catch: java.lang.ClassNotFoundException -> L10
            goto L31
        L10:
            r3 = move-exception
            java.util.List<java.lang.Throwable> r4 = r8.c
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Could not find class ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = "]"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2, r3)
            r4.add(r5)
        L31:
            int r1 = r1 + 1
            goto L2
        L34:
            return
    }
}
