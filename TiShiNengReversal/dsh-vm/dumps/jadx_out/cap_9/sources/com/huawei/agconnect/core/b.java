package com.huawei.agconnect.core;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class b {
    private final java.lang.Class<?> a;
    private final java.lang.Class<?> b;
    private final java.lang.Object c;
    private boolean d;
    private boolean e;
    private boolean f;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* renamed from: com.huawei.agconnect.core.b$b, reason: collision with other inner class name */
    public static class C0024b {
        java.lang.Class<?> a;
        java.lang.Class<?> b;
        java.lang.Object c;
        private boolean d;
        private boolean e;
        private boolean f;

        public C0024b() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.huawei.agconnect.core.b a() {
                r4 = this;
                java.lang.Class<?> r0 = r4.a
                if (r0 == 0) goto L53
                java.lang.Class<?> r1 = r4.b
                r2 = 0
                if (r1 == 0) goto L3c
                boolean r0 = r1.isInterface()
                if (r0 != 0) goto L34
                java.lang.Class<?> r0 = r4.b
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
                if (r0 == 0) goto L34
                com.huawei.agconnect.core.b r0 = new com.huawei.agconnect.core.b
                java.lang.Class<?> r1 = r4.a
                java.lang.Class<?> r3 = r4.b
                r0.<init>(r1, r3, r2)
                boolean r1 = r4.d
                com.huawei.agconnect.core.b.a(r0, r1)
                boolean r1 = r4.e
                com.huawei.agconnect.core.b.b(r0, r1)
                boolean r1 = r4.f
                com.huawei.agconnect.core.b.f(r0, r1)
                return r0
            L34:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "the clazz parameter cant be interface type or not public"
                r0.<init>(r1)
                throw r0
            L3c:
                java.lang.Object r1 = r4.c
                if (r1 == 0) goto L4b
                com.huawei.agconnect.core.b r3 = new com.huawei.agconnect.core.b
                r3.<init>(r0, r1, r2)
                boolean r0 = r4.d
                com.huawei.agconnect.core.b.a(r3, r0)
                return r3
            L4b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "the clazz or object parameter must set one"
                r0.<init>(r1)
                throw r0
            L53:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "the interface parameter cannot be NULL"
                r0.<init>(r1)
                throw r0
        }

        public com.huawei.agconnect.core.b.C0024b b(boolean r1) {
                r0 = this;
                r0.f = r1
                return r0
        }

        public com.huawei.agconnect.core.b.C0024b c(boolean r1) {
                r0 = this;
                r0.e = r1
                return r0
        }

        public com.huawei.agconnect.core.b.C0024b d(boolean r1) {
                r0 = this;
                r0.d = r1
                return r0
        }

        public com.huawei.agconnect.core.b.C0024b e(java.lang.Class<?> r1) {
                r0 = this;
                r0.b = r1
                return r0
        }

        public com.huawei.agconnect.core.b.C0024b f(java.lang.Class<?> r1) {
                r0 = this;
                r0.a = r1
                return r0
        }

        public com.huawei.agconnect.core.b.C0024b g(java.lang.Object r1) {
                r0 = this;
                r0.c = r1
                return r0
        }
    }

    private b(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
    }

    /* synthetic */ b(java.lang.Class r1, java.lang.Class r2, com.huawei.agconnect.core.b.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private b(java.lang.Class<?> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            r0.c = r2
            return
    }

    /* synthetic */ b(java.lang.Class r1, java.lang.Object r2, com.huawei.agconnect.core.b.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ boolean a(com.huawei.agconnect.core.b r0, boolean r1) {
            r0.d = r1
            return r1
    }

    static /* synthetic */ boolean b(com.huawei.agconnect.core.b r0, boolean r1) {
            r0.e = r1
            return r1
    }

    public static com.huawei.agconnect.core.b.C0024b c(java.lang.Class<?> r2) {
            com.huawei.agconnect.core.b$b r0 = new com.huawei.agconnect.core.b$b
            r0.<init>()
            com.huawei.agconnect.core.b$b r0 = r0.f(r2)
            com.huawei.agconnect.core.b$b r0 = r0.e(r2)
            java.lang.Class<com.huawei.agconnect.annotation.Singleton> r1 = com.huawei.agconnect.annotation.Singleton.class
            boolean r1 = r2.isAnnotationPresent(r1)
            com.huawei.agconnect.core.b$b r0 = r0.d(r1)
            java.lang.Class<com.huawei.agconnect.annotation.SharedInstance> r1 = com.huawei.agconnect.annotation.SharedInstance.class
            boolean r1 = r2.isAnnotationPresent(r1)
            com.huawei.agconnect.core.b$b r0 = r0.c(r1)
            java.lang.Class<com.huawei.agconnect.annotation.AutoCreated> r1 = com.huawei.agconnect.annotation.AutoCreated.class
            boolean r2 = r2.isAnnotationPresent(r1)
            com.huawei.agconnect.core.b$b r2 = r0.b(r2)
            return r2
    }

    public static com.huawei.agconnect.core.b.C0024b d(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            com.huawei.agconnect.core.b$b r0 = new com.huawei.agconnect.core.b$b
            r0.<init>()
            com.huawei.agconnect.core.b$b r1 = r0.f(r1)
            com.huawei.agconnect.core.b$b r1 = r1.e(r2)
            java.lang.Class<com.huawei.agconnect.annotation.Singleton> r0 = com.huawei.agconnect.annotation.Singleton.class
            boolean r0 = r2.isAnnotationPresent(r0)
            com.huawei.agconnect.core.b$b r1 = r1.d(r0)
            java.lang.Class<com.huawei.agconnect.annotation.SharedInstance> r0 = com.huawei.agconnect.annotation.SharedInstance.class
            boolean r0 = r2.isAnnotationPresent(r0)
            com.huawei.agconnect.core.b$b r1 = r1.c(r0)
            java.lang.Class<com.huawei.agconnect.annotation.AutoCreated> r0 = com.huawei.agconnect.annotation.AutoCreated.class
            boolean r2 = r2.isAnnotationPresent(r0)
            com.huawei.agconnect.core.b$b r1 = r1.b(r2)
            return r1
    }

    public static com.huawei.agconnect.core.b.C0024b e(java.lang.Class<?> r1, java.lang.Object r2) {
            com.huawei.agconnect.core.b$b r0 = new com.huawei.agconnect.core.b$b
            r0.<init>()
            com.huawei.agconnect.core.b$b r0 = r0.f(r1)
            com.huawei.agconnect.core.b$b r2 = r0.g(r2)
            r0 = 1
            com.huawei.agconnect.core.b$b r2 = r2.d(r0)
            java.lang.Class<com.huawei.agconnect.annotation.SharedInstance> r0 = com.huawei.agconnect.annotation.SharedInstance.class
            boolean r0 = r1.isAnnotationPresent(r0)
            com.huawei.agconnect.core.b$b r2 = r2.c(r0)
            java.lang.Class<com.huawei.agconnect.annotation.AutoCreated> r0 = com.huawei.agconnect.annotation.AutoCreated.class
            boolean r1 = r1.isAnnotationPresent(r0)
            com.huawei.agconnect.core.b$b r1 = r2.b(r1)
            return r1
    }

    static /* synthetic */ boolean f(com.huawei.agconnect.core.b r0, boolean r1) {
            r0.f = r1
            return r1
    }

    public java.lang.Object g() {
            r1 = this;
            java.lang.Object r0 = r1.c
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.b
            return r0
    }

    public java.lang.Class<?> h() {
            r1 = this;
            java.lang.Class<?> r0 = r1.a
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    public boolean j() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    public boolean k() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }
}
