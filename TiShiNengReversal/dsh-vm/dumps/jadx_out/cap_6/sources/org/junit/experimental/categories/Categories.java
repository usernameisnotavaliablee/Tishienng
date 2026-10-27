package org.junit.experimental.categories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class Categories extends org.junit.runners.Suite {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface ExcludeCategory {
        boolean matchAny() default true;

        java.lang.Class<?>[] value() default {};
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface IncludeCategory {
        boolean matchAny() default true;

        java.lang.Class<?>[] value() default {};
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends org.junit.runner.manipulation.a {
        private final java.util.Set<java.lang.Class<?>> b;
        private final java.util.Set<java.lang.Class<?>> c;
        private final boolean d;
        private final boolean e;

        protected a(boolean r1, java.util.Set<java.lang.Class<?>> r2, boolean r3, java.util.Set<java.lang.Class<?>> r4) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.e = r3
                java.util.Set r1 = h(r2)
                r0.b = r1
                java.util.Set r1 = h(r4)
                r0.c = r1
                return
        }

        private static java.util.Set<java.lang.Class<?>> f(org.junit.runner.Description r2) {
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.lang.Class[] r1 = i(r2)
                java.util.Collections.addAll(r0, r1)
                org.junit.runner.Description r2 = t(r2)
                java.lang.Class[] r2 = i(r2)
                java.util.Collections.addAll(r0, r2)
                return r0
        }

        public static org.junit.experimental.categories.Categories.a g(boolean r1, java.util.Set<java.lang.Class<?>> r2, boolean r3, java.util.Set<java.lang.Class<?>> r4) {
                org.junit.experimental.categories.Categories$a r0 = new org.junit.experimental.categories.Categories$a
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        private static java.util.Set<java.lang.Class<?>> h(java.util.Set<java.lang.Class<?>> r1) {
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                if (r1 == 0) goto La
                r0.addAll(r1)
            La:
                r1 = 0
                r0.remove(r1)
                return r0
        }

        private static java.lang.Class<?>[] i(org.junit.runner.Description r2) {
                r0 = 0
                if (r2 != 0) goto L6
                java.lang.Class[] r2 = new java.lang.Class[r0]
                return r2
            L6:
                java.lang.Class<org.junit.experimental.categories.Category> r1 = org.junit.experimental.categories.Category.class
                java.lang.annotation.Annotation r2 = r2.getAnnotation(r1)
                org.junit.experimental.categories.Category r2 = (org.junit.experimental.categories.Category) r2
                if (r2 != 0) goto L13
                java.lang.Class[] r2 = new java.lang.Class[r0]
                return r2
            L13:
                java.lang.Class[] r2 = r2.value()
                return r2
        }

        public static org.junit.experimental.categories.Categories.a j(java.lang.Class<?> r3) {
                r0 = 1
                java.lang.Class[] r1 = new java.lang.Class[r0]
                r2 = 0
                r1[r2] = r3
                org.junit.experimental.categories.Categories$a r3 = k(r0, r1)
                return r3
        }

        public static org.junit.experimental.categories.Categories.a k(boolean r2, java.lang.Class<?>... r3) {
                boolean r0 = n(r3)
                if (r0 != 0) goto L11
                r0 = 0
                java.util.Set r3 = org.junit.experimental.categories.Categories.J(r3)
                r1 = 1
                org.junit.experimental.categories.Categories$a r2 = g(r1, r0, r2, r3)
                return r2
            L11:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "has null category"
                r2.<init>(r3)
                throw r2
        }

        public static org.junit.experimental.categories.Categories.a l(java.lang.Class<?>... r1) {
                r0 = 1
                org.junit.experimental.categories.Categories$a r1 = k(r0, r1)
                return r1
        }

        private boolean m(org.junit.runner.Description r3) {
                r2 = this;
                java.util.Set r3 = f(r3)
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L11
                java.util.Set<java.lang.Class<?>> r3 = r2.b
                boolean r3 = r3.isEmpty()
                return r3
            L11:
                java.util.Set<java.lang.Class<?>> r0 = r2.c
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L30
                boolean r0 = r2.e
                r1 = 0
                if (r0 == 0) goto L27
                java.util.Set<java.lang.Class<?>> r0 = r2.c
                boolean r0 = r2.s(r3, r0)
                if (r0 == 0) goto L30
                return r1
            L27:
                java.util.Set<java.lang.Class<?>> r0 = r2.c
                boolean r0 = r2.r(r3, r0)
                if (r0 == 0) goto L30
                return r1
            L30:
                java.util.Set<java.lang.Class<?>> r0 = r2.b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L3a
                r3 = 1
                return r3
            L3a:
                boolean r0 = r2.d
                if (r0 == 0) goto L45
                java.util.Set<java.lang.Class<?>> r0 = r2.b
                boolean r3 = r2.s(r3, r0)
                return r3
            L45:
                java.util.Set<java.lang.Class<?>> r0 = r2.b
                boolean r3 = r2.r(r3, r0)
                return r3
        }

        private static boolean n(java.lang.Class<?>... r4) {
                r0 = 0
                if (r4 != 0) goto L4
                return r0
            L4:
                int r1 = r4.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L11
                r3 = r4[r2]
                if (r3 != 0) goto Le
                r4 = 1
                return r4
            Le:
                int r2 = r2 + 1
                goto L6
            L11:
                return r0
        }

        public static org.junit.experimental.categories.Categories.a o(java.lang.Class<?> r3) {
                r0 = 1
                java.lang.Class[] r1 = new java.lang.Class[r0]
                r2 = 0
                r1[r2] = r3
                org.junit.experimental.categories.Categories$a r3 = p(r0, r1)
                return r3
        }

        public static org.junit.experimental.categories.Categories.a p(boolean r2, java.lang.Class<?>... r3) {
                boolean r0 = n(r3)
                if (r0 != 0) goto L11
                java.util.Set r3 = org.junit.experimental.categories.Categories.J(r3)
                r0 = 1
                r1 = 0
                org.junit.experimental.categories.Categories$a r2 = g(r2, r3, r0, r1)
                return r2
            L11:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "has null category"
                r2.<init>(r3)
                throw r2
        }

        public static org.junit.experimental.categories.Categories.a q(java.lang.Class<?>... r1) {
                r0 = 1
                org.junit.experimental.categories.Categories$a r1 = p(r0, r1)
                return r1
        }

        private boolean r(java.util.Set<java.lang.Class<?>> r2, java.util.Set<java.lang.Class<?>> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L18
                java.lang.Object r0 = r3.next()
                java.lang.Class r0 = (java.lang.Class) r0
                boolean r0 = org.junit.experimental.categories.Categories.K(r2, r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L18:
                r2 = 1
                return r2
        }

        private boolean s(java.util.Set<java.lang.Class<?>> r2, java.util.Set<java.lang.Class<?>> r3) {
                r1 = this;
                java.util.Iterator r3 = r3.iterator()
            L4:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L18
                java.lang.Object r0 = r3.next()
                java.lang.Class r0 = (java.lang.Class) r0
                boolean r0 = org.junit.experimental.categories.Categories.K(r2, r0)
                if (r0 == 0) goto L4
                r2 = 1
                return r2
            L18:
                r2 = 0
                return r2
        }

        private static org.junit.runner.Description t(org.junit.runner.Description r0) {
                java.lang.Class r0 = r0.getTestClass()
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                org.junit.runner.Description r0 = org.junit.runner.Description.createSuiteDescription(r0)
                return r0
        }

        @Override // org.junit.runner.manipulation.a
        public java.lang.String b() {
                r1 = this;
                java.lang.String r0 = r1.toString()
                return r0
        }

        @Override // org.junit.runner.manipulation.a
        public boolean e(org.junit.runner.Description r3) {
                r2 = this;
                boolean r0 = r2.m(r3)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.util.ArrayList r3 = r3.getChildren()
                java.util.Iterator r3 = r3.iterator()
            L10:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L23
                java.lang.Object r0 = r3.next()
                org.junit.runner.Description r0 = (org.junit.runner.Description) r0
                boolean r0 = r2.e(r0)
                if (r0 == 0) goto L10
                return r1
            L23:
                r3 = 0
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "categories "
                r0.<init>(r1)
                java.util.Set<java.lang.Class<?>> r1 = r2.b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L12
                java.lang.String r1 = "[all]"
                goto L14
            L12:
                java.util.Set<java.lang.Class<?>> r1 = r2.b
            L14:
                r0.append(r1)
                java.util.Set<java.lang.Class<?>> r1 = r2.c
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L29
                java.lang.String r1 = " - "
                r0.append(r1)
                java.util.Set<java.lang.Class<?>> r1 = r2.c
                r0.append(r1)
            L29:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public Categories(java.lang.Class<?> r3, org.junit.runners.model.f r4) throws org.junit.runners.model.InitializationError {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.Set r4 = Q(r3)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            java.util.Set r0 = P(r3)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            boolean r1 = T(r3)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            boolean r3 = S(r3)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            org.junit.experimental.categories.Categories$a r3 = org.junit.experimental.categories.Categories.a.g(r1, r4, r3, r0)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            r2.b(r3)     // Catch: org.junit.runner.manipulation.NoTestsRemainException -> L22
            org.junit.runner.Description r3 = r2.getDescription()
            L(r3)
            return
        L22:
            r3 = move-exception
            org.junit.runners.model.InitializationError r4 = new org.junit.runners.model.InitializationError
            r4.<init>(r3)
            throw r4
    }

    static /* synthetic */ java.util.Set J(java.lang.Class[] r0) {
            java.util.Set r0 = O(r0)
            return r0
    }

    static /* synthetic */ boolean K(java.util.Set r0, java.lang.Class r1) {
            boolean r0 = R(r0, r1)
            return r0
    }

    private static void L(org.junit.runner.Description r1) throws org.junit.runners.model.InitializationError {
            boolean r0 = N(r1)
            if (r0 != 0) goto L9
            M(r1)
        L9:
            java.util.ArrayList r1 = r1.getChildren()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            org.junit.runner.Description r0 = (org.junit.runner.Description) r0
            L(r0)
            goto L11
        L21:
            return
    }

    private static void M(org.junit.runner.Description r2) throws org.junit.runners.model.InitializationError {
            java.util.ArrayList r2 = r2.getChildren()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r2.next()
            org.junit.runner.Description r0 = (org.junit.runner.Description) r0
            java.lang.Class<org.junit.experimental.categories.Category> r1 = org.junit.experimental.categories.Category.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            if (r1 != 0) goto L20
            M(r0)
            goto L8
        L20:
            org.junit.runners.model.InitializationError r2 = new org.junit.runners.model.InitializationError
            java.lang.String r0 = "Category annotations on Parameterized classes are not supported on individual methods."
            r2.<init>(r0)
            throw r2
        L28:
            return
    }

    private static boolean N(org.junit.runner.Description r1) {
            java.util.ArrayList r1 = r1.getChildren()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.next()
            org.junit.runner.Description r0 = (org.junit.runner.Description) r0
            java.lang.Class r0 = r0.getTestClass()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    private static java.util.Set<java.lang.Class<?>> O(java.lang.Class<?>... r1) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            if (r1 == 0) goto La
            java.util.Collections.addAll(r0, r1)
        La:
            return r0
    }

    private static java.util.Set<java.lang.Class<?>> P(java.lang.Class<?> r1) {
            java.lang.Class<org.junit.experimental.categories.Categories$ExcludeCategory> r0 = org.junit.experimental.categories.Categories.ExcludeCategory.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.junit.experimental.categories.Categories$ExcludeCategory r1 = (org.junit.experimental.categories.Categories.ExcludeCategory) r1
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            java.lang.Class[] r1 = r1.value()
        L10:
            java.util.Set r1 = O(r1)
            return r1
    }

    private static java.util.Set<java.lang.Class<?>> Q(java.lang.Class<?> r1) {
            java.lang.Class<org.junit.experimental.categories.Categories$IncludeCategory> r0 = org.junit.experimental.categories.Categories.IncludeCategory.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.junit.experimental.categories.Categories$IncludeCategory r1 = (org.junit.experimental.categories.Categories.IncludeCategory) r1
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            java.lang.Class[] r1 = r1.value()
        L10:
            java.util.Set r1 = O(r1)
            return r1
    }

    private static boolean R(java.util.Set<java.lang.Class<?>> r1, java.lang.Class<?> r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto L4
            r1 = 1
            return r1
        L18:
            r1 = 0
            return r1
    }

    private static boolean S(java.lang.Class<?> r1) {
            java.lang.Class<org.junit.experimental.categories.Categories$ExcludeCategory> r0 = org.junit.experimental.categories.Categories.ExcludeCategory.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.junit.experimental.categories.Categories$ExcludeCategory r1 = (org.junit.experimental.categories.Categories.ExcludeCategory) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.matchAny()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    private static boolean T(java.lang.Class<?> r1) {
            java.lang.Class<org.junit.experimental.categories.Categories$IncludeCategory> r0 = org.junit.experimental.categories.Categories.IncludeCategory.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            org.junit.experimental.categories.Categories$IncludeCategory r1 = (org.junit.experimental.categories.Categories.IncludeCategory) r1
            if (r1 == 0) goto L13
            boolean r1 = r1.matchAny()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }
}
