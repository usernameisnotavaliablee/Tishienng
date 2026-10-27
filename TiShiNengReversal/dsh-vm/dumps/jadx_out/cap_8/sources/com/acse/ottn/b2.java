package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class b2 implements java.lang.Cloneable {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f2158b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.animation.Interpolator f2159c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2160d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends com.acse.ottn.b2 {

        /* renamed from: e, reason: collision with root package name */
        public float f2161e;

        public a(float r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r0.f2158b = r1
                return
        }

        public a(float r1, float r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2161e = r2
                java.lang.Class r1 = java.lang.Float.TYPE
                r0.f2158b = r1
                r1 = 1
                r0.f2160d = r1
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ com.acse.ottn.b2 a() {
                r1 = this;
                com.acse.ottn.b2$a r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public void a(java.lang.Object r3) {
                r2 = this;
                if (r3 == 0) goto L15
                java.lang.Class r0 = r3.getClass()
                java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
                if (r0 != r1) goto L15
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r2.f2161e = r3
                r3 = 1
                r2.f2160d = r3
            L15:
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.b2$a r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public java.lang.Object e() {
                r1 = this;
                float r0 = r1.f2161e
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                return r0
        }

        public com.acse.ottn.b2.a g() {
                r3 = this;
                com.acse.ottn.b2$a r0 = new com.acse.ottn.b2$a
                float r1 = r3.b()
                float r2 = r3.f2161e
                r0.<init>(r1, r2)
                android.view.animation.Interpolator r1 = r3.c()
                r0.a(r1)
                return r0
        }

        public float h() {
                r1 = this;
                float r0 = r1.f2161e
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends com.acse.ottn.b2 {

        /* renamed from: e, reason: collision with root package name */
        public int f2162e;

        public b(float r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0.f2158b = r1
                return
        }

        public b(float r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2162e = r2
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0.f2158b = r1
                r1 = 1
                r0.f2160d = r1
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ com.acse.ottn.b2 a() {
                r1 = this;
                com.acse.ottn.b2$b r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public void a(java.lang.Object r3) {
                r2 = this;
                if (r3 == 0) goto L15
                java.lang.Class r0 = r3.getClass()
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                if (r0 != r1) goto L15
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r2.f2162e = r3
                r3 = 1
                r2.f2160d = r3
            L15:
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.b2$b r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public java.lang.Object e() {
                r1 = this;
                int r0 = r1.f2162e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        public com.acse.ottn.b2.b g() {
                r3 = this;
                com.acse.ottn.b2$b r0 = new com.acse.ottn.b2$b
                float r1 = r3.b()
                int r2 = r3.f2162e
                r0.<init>(r1, r2)
                android.view.animation.Interpolator r1 = r3.c()
                r0.a(r1)
                return r0
        }

        public int h() {
                r1 = this;
                int r0 = r1.f2162e
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c extends com.acse.ottn.b2 {

        /* renamed from: e, reason: collision with root package name */
        public java.lang.Object f2163e;

        public c(float r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.f2163e = r2
                if (r2 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.f2160d = r1
                if (r1 == 0) goto L15
                java.lang.Class r1 = r2.getClass()
                goto L17
            L15:
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            L17:
                r0.f2158b = r1
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ com.acse.ottn.b2 a() {
                r1 = this;
                com.acse.ottn.b2$c r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public void a(java.lang.Object r1) {
                r0 = this;
                r0.f2163e = r1
                if (r1 == 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0.f2160d = r1
                return
        }

        @Override // com.acse.ottn.b2
        public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                com.acse.ottn.b2$c r0 = r1.g()
                return r0
        }

        @Override // com.acse.ottn.b2
        public java.lang.Object e() {
                r1 = this;
                java.lang.Object r0 = r1.f2163e
                return r0
        }

        public com.acse.ottn.b2.c g() {
                r3 = this;
                com.acse.ottn.b2$c r0 = new com.acse.ottn.b2$c
                float r1 = r3.b()
                java.lang.Object r2 = r3.f2163e
                r0.<init>(r1, r2)
                android.view.animation.Interpolator r1 = r3.c()
                r0.a(r1)
                return r0
        }
    }

    public b2() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2159c = r0
            r0 = 0
            r1.f2160d = r0
            return
    }

    public static com.acse.ottn.b2 a(float r1) {
            com.acse.ottn.b2$a r0 = new com.acse.ottn.b2$a
            r0.<init>(r1)
            return r0
    }

    public static com.acse.ottn.b2 a(float r1, float r2) {
            com.acse.ottn.b2$a r0 = new com.acse.ottn.b2$a
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.b2 a(float r1, int r2) {
            com.acse.ottn.b2$b r0 = new com.acse.ottn.b2$b
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.b2 a(float r1, java.lang.Object r2) {
            com.acse.ottn.b2$c r0 = new com.acse.ottn.b2$c
            r0.<init>(r1, r2)
            return r0
    }

    public static com.acse.ottn.b2 b(float r1) {
            com.acse.ottn.b2$b r0 = new com.acse.ottn.b2$b
            r0.<init>(r1)
            return r0
    }

    public static com.acse.ottn.b2 c(float r2) {
            com.acse.ottn.b2$c r0 = new com.acse.ottn.b2$c
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public abstract com.acse.ottn.b2 a();

    public void a(android.view.animation.Interpolator r1) {
            r0 = this;
            r0.f2159c = r1
            return
    }

    public abstract void a(java.lang.Object r1);

    public float b() {
            r1 = this;
            float r0 = r1.a
            return r0
    }

    public android.view.animation.Interpolator c() {
            r1 = this;
            android.view.animation.Interpolator r0 = r1.f2159c
            return r0
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.acse.ottn.b2 r0 = r1.a()
            return r0
    }

    public java.lang.Class d() {
            r1 = this;
            java.lang.Class r0 = r1.f2158b
            return r0
    }

    public void d(float r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public abstract java.lang.Object e();

    public boolean f() {
            r1 = this;
            boolean r0 = r1.f2160d
            return r0
    }
}
