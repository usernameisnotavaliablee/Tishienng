package org.junit.runners.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class i implements org.junit.runners.model.a {
    private static final org.junit.runners.model.i.b d = null;
    private static final org.junit.runners.model.i.c e = null;
    private final java.lang.Class<?> a;
    private final java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.d>> b;
    private final java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.b>> c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b implements java.util.Comparator<java.lang.reflect.Field> {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(org.junit.runners.model.i.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(java.lang.reflect.Field r1, java.lang.reflect.Field r2) {
                r0 = this;
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = r2.getName()
                int r1 = r1.compareTo(r2)
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Field r1, java.lang.reflect.Field r2) {
                r0 = this;
                java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
                java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c implements java.util.Comparator<org.junit.runners.model.d> {
        private c() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ c(org.junit.runners.model.i.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(org.junit.runners.model.d r2, org.junit.runners.model.d r3) {
                r1 = this;
                java.util.Comparator<java.lang.reflect.Method> r0 = org.junit.internal.f.b
                java.lang.reflect.Method r2 = r2.i()
                java.lang.reflect.Method r3 = r3.i()
                int r2 = r0.compare(r2, r3)
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(org.junit.runners.model.d r1, org.junit.runners.model.d r2) {
                r0 = this;
                org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
                org.junit.runners.model.d r2 = (org.junit.runners.model.d) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            org.junit.runners.model.i$b r0 = new org.junit.runners.model.i$b
            r1 = 0
            r0.<init>(r1)
            org.junit.runners.model.i.d = r0
            org.junit.runners.model.i$c r0 = new org.junit.runners.model.i$c
            r0.<init>(r1)
            org.junit.runners.model.i.e = r0
            return
    }

    public i(java.lang.Class<?> r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            if (r2 == 0) goto L18
            java.lang.reflect.Constructor[] r2 = r2.getConstructors()
            int r2 = r2.length
            r0 = 1
            if (r2 > r0) goto L10
            goto L18
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Test class can only have one constructor"
            r2.<init>(r0)
            throw r2
        L18:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.s(r2, r0)
            java.util.Map r2 = q(r2)
            r1.b = r2
            java.util.Map r2 = q(r0)
            r1.c = r2
            return
    }

    protected static <T extends org.junit.runners.model.c<T>> void a(T r7, java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<T>> r8) {
            java.lang.annotation.Annotation[] r0 = r7.getAnnotations()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r1) goto L2b
            r4 = r0[r3]
            java.lang.Class r4 = r4.annotationType()
            r5 = 1
            java.util.List r5 = f(r8, r4, r5)
            boolean r6 = r7.e(r5)
            if (r6 == 0) goto L1b
            goto L2b
        L1b:
            boolean r4 = r(r4)
            if (r4 == 0) goto L25
            r5.add(r2, r7)
            goto L28
        L25:
            r5.add(r7)
        L28:
            int r3 = r3 + 1
            goto L7
        L2b:
            return
    }

    private <T> java.util.List<T> b(java.util.Map<?, java.util.List<T>> r3) {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            java.util.List r1 = (java.util.List) r1
            r0.addAll(r1)
            goto Ld
        L1d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    private static <T> java.util.List<T> f(java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<T>> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2, boolean r3) {
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L10
            if (r3 == 0) goto L10
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.put(r2, r3)
        L10:
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L1a
            java.util.List r1 = java.util.Collections.EMPTY_LIST
        L1a:
            return r1
    }

    private static java.lang.reflect.Field[] m(java.lang.Class<?> r1) {
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            org.junit.runners.model.i$b r0 = org.junit.runners.model.i.d
            java.util.Arrays.sort(r1, r0)
            return r1
    }

    private static java.util.List<java.lang.Class<?>> n(java.lang.Class<?> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r1 == 0) goto Lf
            r0.add(r1)
            java.lang.Class r1 = r1.getSuperclass()
            goto L5
        Lf:
            return r0
    }

    private static <T extends org.junit.runners.model.c<T>> java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<T>> q(java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<T>> r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.put(r2, r1)
            goto Ld
        L2b:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r0)
            return r3
    }

    private static boolean r(java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
            java.lang.Class<org.junit.Before> r0 = org.junit.Before.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L13
            java.lang.Class<org.junit.BeforeClass> r0 = org.junit.BeforeClass.class
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public <T> java.util.List<T> c(java.lang.Object r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5, java.lang.Class<T> r6) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = r3.e(r5)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r5.next()
            org.junit.runners.model.b r1 = (org.junit.runners.model.b) r1
            java.lang.Object r1 = r1.h(r4)     // Catch: java.lang.IllegalAccessException -> L2b
            boolean r2 = r6.isInstance(r1)     // Catch: java.lang.IllegalAccessException -> L2b
            if (r2 == 0) goto Ld
            java.lang.Object r1 = r6.cast(r1)     // Catch: java.lang.IllegalAccessException -> L2b
            r0.add(r1)     // Catch: java.lang.IllegalAccessException -> L2b
            goto Ld
        L2b:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "How did getFields return a field we couldn't access?"
            r5.<init>(r6, r4)
            throw r5
        L34:
            return r0
    }

    public java.util.List<org.junit.runners.model.b> d() {
            r1 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.b>> r0 = r1.c
            java.util.List r0 = r1.b(r0)
            return r0
    }

    public java.util.List<org.junit.runners.model.b> e(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.b>> r0 = r2.c
            r1 = 0
            java.util.List r3 = f(r0, r3, r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.junit.runners.model.i r5 = (org.junit.runners.model.i) r5
            java.lang.Class<?> r2 = r4.a
            java.lang.Class<?> r5 = r5.a
            if (r2 != r5) goto L1c
            return r0
        L1c:
            return r1
    }

    public <T> java.util.List<T> g(java.lang.Object r4, java.lang.Class<? extends java.lang.annotation.Annotation> r5, java.lang.Class<T> r6) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = r3.i(r5)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r5.next()
            org.junit.runners.model.d r1 = (org.junit.runners.model.d) r1
            java.lang.Class r2 = r1.k()     // Catch: java.lang.Throwable -> L32
            boolean r2 = r6.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto Ld
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.l(r4, r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r6.cast(r2)     // Catch: java.lang.Throwable -> L32
            r0.add(r2)     // Catch: java.lang.Throwable -> L32
            goto Ld
        L32:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Exception in "
            r6.append(r0)
            java.lang.String r0 = r1.c()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        L4e:
            return r0
    }

    @Override // org.junit.runners.model.a
    public <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)
            return r2
    }

    @Override // org.junit.runners.model.a
    public java.lang.annotation.Annotation[] getAnnotations() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            if (r0 != 0) goto L8
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
        L8:
            java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
            return r0
    }

    public java.util.List<org.junit.runners.model.d> h() {
            r2 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.d>> r0 = r2.b
            java.util.List r0 = r2.b(r0)
            org.junit.runners.model.i$c r1 = org.junit.runners.model.i.e
            java.util.Collections.sort(r0, r1)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public java.util.List<org.junit.runners.model.d> i(java.lang.Class<? extends java.lang.annotation.Annotation> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.d>> r0 = r2.b
            r1 = 0
            java.util.List r3 = f(r0, r3, r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            return r3
    }

    public java.lang.Class<?> j() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "null"
            return r0
        L7:
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.lang.reflect.Constructor<?> l() {
            r5 = this;
            java.lang.Class<?> r0 = r5.a
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            int r1 = r0.length
            long r1 = (long) r1
            r3 = 1
            org.junit.a.v(r3, r1)
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public boolean o() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isMemberClass()
            if (r0 == 0) goto L16
            java.lang.Class<?> r0 = r1.a
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean p() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    protected void s(java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.d>> r9, java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, java.util.List<org.junit.runners.model.b>> r10) {
            r8 = this;
            java.lang.Class<?> r0 = r8.a
            java.util.List r0 = n(r0)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r2 = org.junit.internal.f.a(r1)
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L1d:
            if (r5 >= r3) goto L2c
            r6 = r2[r5]
            org.junit.runners.model.d r7 = new org.junit.runners.model.d
            r7.<init>(r6)
            a(r7, r9)
            int r5 = r5 + 1
            goto L1d
        L2c:
            java.lang.reflect.Field[] r1 = m(r1)
            int r2 = r1.length
        L31:
            if (r4 >= r2) goto La
            r3 = r1[r4]
            org.junit.runners.model.b r5 = new org.junit.runners.model.b
            r5.<init>(r3)
            a(r5, r10)
            int r4 = r4 + 1
            goto L31
        L40:
            return
    }
}
