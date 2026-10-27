package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j implements com.bumptech.glide.load.model.h {
    private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> c;
    private volatile java.util.Map<java.lang.String, java.lang.String> d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private static final java.lang.String d = "User-Agent";
        private static final java.lang.String e = null;
        private static final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> f = null;
        private boolean a;
        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> b;
        private boolean c;

        static {
                java.lang.String r0 = g()
                com.bumptech.glide.load.model.j.a.e = r0
                java.util.HashMap r1 = new java.util.HashMap
                r2 = 2
                r1.<init>(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L20
                com.bumptech.glide.load.model.j$b r2 = new com.bumptech.glide.load.model.j$b
                r2.<init>(r0)
                java.util.List r0 = java.util.Collections.singletonList(r2)
                java.lang.String r2 = "User-Agent"
                r1.put(r2, r0)
            L20:
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
                com.bumptech.glide.load.model.j.a.f = r0
                return
        }

        public a() {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.a = r0
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = com.bumptech.glide.load.model.j.a.f
                r2.b = r1
                r2.c = r0
                return
        }

        private java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> d() {
                r5 = this;
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r5.b
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r5.b
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L34
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.util.ArrayList r3 = new java.util.ArrayList
                java.lang.Object r4 = r2.getValue()
                java.util.Collection r4 = (java.util.Collection) r4
                r3.<init>(r4)
                java.lang.Object r2 = r2.getKey()
                r0.put(r2, r3)
                goto L15
            L34:
                return r0
        }

        private void e() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto Ld
                r0 = 0
                r1.a = r0
                java.util.Map r0 = r1.d()
                r1.b = r0
            Ld:
                return
        }

        private java.util.List<com.bumptech.glide.load.model.i> f(java.lang.String r3) {
                r2 = this;
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r0 = r2.b
                java.lang.Object r0 = r0.get(r3)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r2.b
                r1.put(r3, r0)
            L14:
                return r0
        }

        @androidx.annotation.VisibleForTesting
        static java.lang.String g() {
                java.lang.String r0 = "http.agent"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Ld
                return r0
            Ld:
                int r1 = r0.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r3 = r0.length()
                r2.<init>(r3)
                r3 = 0
            L1b:
                if (r3 >= r1) goto L39
                char r4 = r0.charAt(r3)
                r5 = 31
                if (r4 > r5) goto L29
                r5 = 9
                if (r4 != r5) goto L31
            L29:
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L31
                r2.append(r4)
                goto L36
            L31:
                r4 = 63
                r2.append(r4)
            L36:
                int r3 = r3 + 1
                goto L1b
            L39:
                java.lang.String r0 = r2.toString()
                return r0
        }

        public com.bumptech.glide.load.model.j.a a(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.bumptech.glide.load.model.i r3) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L11
                java.lang.String r0 = "User-Agent"
                boolean r0 = r0.equalsIgnoreCase(r2)
                if (r0 == 0) goto L11
                com.bumptech.glide.load.model.j$a r2 = r1.h(r2, r3)
                return r2
            L11:
                r1.e()
                java.util.List r2 = r1.f(r2)
                r2.add(r3)
                return r1
        }

        public com.bumptech.glide.load.model.j.a b(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.load.model.j$b r0 = new com.bumptech.glide.load.model.j$b
                r0.<init>(r3)
                com.bumptech.glide.load.model.j$a r2 = r1.a(r2, r0)
                return r2
        }

        public com.bumptech.glide.load.model.j c() {
                r2 = this;
                r0 = 1
                r2.a = r0
                com.bumptech.glide.load.model.j r0 = new com.bumptech.glide.load.model.j
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r2.b
                r0.<init>(r1)
                return r0
        }

        public com.bumptech.glide.load.model.j.a h(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable com.bumptech.glide.load.model.i r3) {
                r1 = this;
                r1.e()
                if (r3 != 0) goto Lb
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r3 = r1.b
                r3.remove(r2)
                goto L15
            Lb:
                java.util.List r0 = r1.f(r2)
                r0.clear()
                r0.add(r3)
            L15:
                boolean r3 = r1.c
                if (r3 == 0) goto L24
                java.lang.String r3 = "User-Agent"
                boolean r2 = r3.equalsIgnoreCase(r2)
                if (r2 == 0) goto L24
                r2 = 0
                r1.c = r2
            L24:
                return r1
        }

        public com.bumptech.glide.load.model.j.a i(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable java.lang.String r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r3 = 0
                goto La
            L4:
                com.bumptech.glide.load.model.j$b r0 = new com.bumptech.glide.load.model.j$b
                r0.<init>(r3)
                r3 = r0
            La:
                com.bumptech.glide.load.model.j$a r2 = r1.h(r2, r3)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class b implements com.bumptech.glide.load.model.i {

        @androidx.annotation.NonNull
        private final java.lang.String a;

        b(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.i
        public java.lang.String a() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.bumptech.glide.load.model.j.b
                if (r0 == 0) goto Lf
                com.bumptech.glide.load.model.j$b r2 = (com.bumptech.glide.load.model.j.b) r2
                java.lang.String r0 = r1.a
                java.lang.String r2 = r2.a
                boolean r2 = r0.equals(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.a
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "StringHeaderFactory{value='"
                r0.append(r1)
                java.lang.String r1 = r2.a
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    j(java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.c = r1
            return
    }

    @androidx.annotation.NonNull
    private java.lang.String a(@androidx.annotation.NonNull java.util.List<com.bumptech.glide.load.model.i> r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.Object r3 = r6.get(r2)
            com.bumptech.glide.load.model.i r3 = (com.bumptech.glide.load.model.i) r3
            java.lang.String r3 = r3.a()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L2c
            r0.append(r3)
            int r3 = r6.size()
            int r3 = r3 + (-1)
            if (r2 == r3) goto L2c
            r3 = 44
            r0.append(r3)
        L2c:
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private java.util.Map<java.lang.String, java.lang.String> b() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r5.c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.lang.String r3 = r5.a(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            r0.put(r2, r3)
            goto Lf
        L33:
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.model.j
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.model.j r2 = (com.bumptech.glide.load.model.j) r2
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r0 = r1.c
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.model.h
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.d
            if (r0 != 0) goto L1a
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.d     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            java.util.Map r0 = r1.b()     // Catch: java.lang.Throwable -> L14
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L14
            r1.d = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        L1a:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.d
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LazyHeaders{headers="
            r0.append(r1)
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.load.model.i>> r1 = r2.c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
