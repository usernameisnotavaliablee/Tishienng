package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class q<Model, Data> implements com.bumptech.glide.load.model.n<Model, Data> {
    private final java.util.List<com.bumptech.glide.load.model.n<Model, Data>> a;
    private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, com.bumptech.glide.load.data.d.a<Data> {
        private final java.util.List<com.bumptech.glide.load.data.d<Data>> a;
        private final androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> b;
        private int c;
        private com.bumptech.glide.Priority d;
        private com.bumptech.glide.load.data.d.a<? super Data> e;

        @androidx.annotation.Nullable
        private java.util.List<java.lang.Throwable> f;
        private boolean g;

        a(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.data.d<Data>> r1, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
                r0 = this;
                r0.<init>()
                r0.b = r2
                com.bumptech.glide.util.k.c(r1)
                r0.a = r1
                r1 = 0
                r0.c = r1
                return
        }

        private void f() {
                r4 = this;
                boolean r0 = r4.g
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r4.c
                java.util.List<com.bumptech.glide.load.data.d<Data>> r1 = r4.a
                int r1 = r1.size()
                int r1 = r1 + (-1)
                if (r0 >= r1) goto L1f
                int r0 = r4.c
                int r0 = r0 + 1
                r4.c = r0
                com.bumptech.glide.Priority r0 = r4.d
                com.bumptech.glide.load.data.d$a<? super Data> r1 = r4.e
                r4.c(r0, r1)
                return
            L1f:
                java.util.List<java.lang.Throwable> r0 = r4.f
                com.bumptech.glide.util.k.d(r0)
                com.bumptech.glide.load.data.d$a<? super Data> r0 = r4.e
                com.bumptech.glide.load.engine.GlideException r1 = new com.bumptech.glide.load.engine.GlideException
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.List<java.lang.Throwable> r3 = r4.f
                r2.<init>(r3)
                java.lang.String r3 = "Fetch failed"
                r1.<init>(r3, r2)
                r0.e(r1)
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public java.lang.Class<Data> a() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.a
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.d r0 = (com.bumptech.glide.load.data.d) r0
                java.lang.Class r0 = r0.a()
                return r0
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
                r2 = this;
                java.util.List<java.lang.Throwable> r0 = r2.f
                if (r0 == 0) goto L9
                androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r1 = r2.b
                r1.release(r0)
            L9:
                r0 = 0
                r2.f = r0
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.a
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L22
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.d r1 = (com.bumptech.glide.load.data.d) r1
                r1.b()
                goto L12
            L22:
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void c(@androidx.annotation.NonNull com.bumptech.glide.Priority r2, @androidx.annotation.NonNull com.bumptech.glide.load.data.d.a<? super Data> r3) {
                r1 = this;
                r1.d = r2
                r1.e = r3
                androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r3 = r1.b
                java.lang.Object r3 = r3.acquire()
                java.util.List r3 = (java.util.List) r3
                r1.f = r3
                java.util.List<com.bumptech.glide.load.data.d<Data>> r3 = r1.a
                int r0 = r1.c
                java.lang.Object r3 = r3.get(r0)
                com.bumptech.glide.load.data.d r3 = (com.bumptech.glide.load.data.d) r3
                r3.c(r2, r1)
                boolean r2 = r1.g
                if (r2 == 0) goto L22
                r1.cancel()
            L22:
                return
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
                r2 = this;
                r0 = 1
                r2.g = r0
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.a
                java.util.Iterator r0 = r0.iterator()
            L9:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                com.bumptech.glide.load.data.d r1 = (com.bumptech.glide.load.data.d) r1
                r1.cancel()
                goto L9
            L19:
                return
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(@androidx.annotation.Nullable Data r2) {
                r1 = this;
                if (r2 == 0) goto L8
                com.bumptech.glide.load.data.d$a<? super Data> r0 = r1.e
                r0.d(r2)
                return
            L8:
                r1.f()
                return
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@androidx.annotation.NonNull java.lang.Exception r2) {
                r1 = this;
                java.util.List<java.lang.Throwable> r0 = r1.f
                java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
                java.util.List r0 = (java.util.List) r0
                r0.add(r2)
                r1.f()
                return
        }

        @Override // com.bumptech.glide.load.data.d
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.DataSource getDataSource() {
                r2 = this;
                java.util.List<com.bumptech.glide.load.data.d<Data>> r0 = r2.a
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                com.bumptech.glide.load.data.d r0 = (com.bumptech.glide.load.data.d) r0
                com.bumptech.glide.load.DataSource r0 = r0.getDataSource()
                return r0
        }
    }

    q(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r1, @androidx.annotation.NonNull androidx.core.util.Pools.Pool<java.util.List<java.lang.Throwable>> r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // com.bumptech.glide.load.model.n
    public com.bumptech.glide.load.model.n.a<Data> a(@androidx.annotation.NonNull Model r8, int r9, int r10, @androidx.annotation.NonNull com.bumptech.glide.load.f r11) {
            r7 = this;
            java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r0 = r7.a
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r4 = r2
        Le:
            if (r3 >= r0) goto L2e
            java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r5 = r7.a
            java.lang.Object r5 = r5.get(r3)
            com.bumptech.glide.load.model.n r5 = (com.bumptech.glide.load.model.n) r5
            boolean r6 = r5.b(r8)
            if (r6 == 0) goto L2b
            com.bumptech.glide.load.model.n$a r5 = r5.a(r8, r9, r10, r11)
            if (r5 == 0) goto L2b
            com.bumptech.glide.load.c r4 = r5.a
            com.bumptech.glide.load.data.d<Data> r5 = r5.c
            r1.add(r5)
        L2b:
            int r3 = r3 + 1
            goto Le
        L2e:
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L43
            if (r4 == 0) goto L43
            com.bumptech.glide.load.model.n$a r8 = new com.bumptech.glide.load.model.n$a
            com.bumptech.glide.load.model.q$a r9 = new com.bumptech.glide.load.model.q$a
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r10 = r7.b
            r9.<init>(r1, r10)
            r8.<init>(r4, r9)
            return r8
        L43:
            return r2
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean b(@androidx.annotation.NonNull Model r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.model.n r1 = (com.bumptech.glide.load.model.n) r1
            boolean r1 = r1.b(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MultiModelLoader{modelLoaders="
            r0.append(r1)
            java.util.List<com.bumptech.glide.load.model.n<Model, Data>> r1 = r2.a
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
