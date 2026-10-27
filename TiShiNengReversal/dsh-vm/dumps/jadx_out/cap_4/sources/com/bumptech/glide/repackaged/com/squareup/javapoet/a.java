package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a {
    public final com.bumptech.glide.repackaged.com.squareup.javapoet.l a;
    public final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bumptech.glide.repackaged.com.squareup.javapoet.a$a, reason: collision with other inner class name */
    final class C0040a implements java.util.Comparator<java.lang.reflect.Method> {
        public C0040a() {
                r1 = this;
                r1.<init>()
                return
        }

        public int a(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                r0 = this;
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = r2.getName()
                int r1 = r1.compareTo(r2)
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                r0 = this;
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        private final com.bumptech.glide.repackaged.com.squareup.javapoet.l a;
        private final java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> b;

        private b(com.bumptech.glide.repackaged.com.squareup.javapoet.l r2) {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.b = r0
                r1.a = r2
                return
        }

        /* synthetic */ b(com.bumptech.glide.repackaged.com.squareup.javapoet.l r1, com.bumptech.glide.repackaged.com.squareup.javapoet.a.C0040a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ com.bumptech.glide.repackaged.com.squareup.javapoet.l a(com.bumptech.glide.repackaged.com.squareup.javapoet.a.b r0) {
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = r0.a
                return r0
        }

        static /* synthetic */ java.util.Map b(com.bumptech.glide.repackaged.com.squareup.javapoet.a.b r0) {
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r0 = r0.b
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b c(java.lang.String r3, com.bumptech.glide.repackaged.com.squareup.javapoet.d r4) {
                r2 = this;
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r0 = r2.b
                java.lang.Object r0 = r0.get(r3)
                java.util.List r0 = (java.util.List) r0
                if (r0 != 0) goto L14
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r1 = r2.b
                r1.put(r3, r0)
            L14:
                r0.add(r4)
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b d(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
                r0 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.c(r2, r3)
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.c(r1, r2)
                return r1
        }

        com.bumptech.glide.repackaged.com.squareup.javapoet.a.b e(java.lang.String r5, java.lang.Object r6) {
                r4 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "memberName == null"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r5, r2, r1)
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r2[r0] = r5
                java.lang.String r3 = "value == null, constant non-null value expected for %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r6, r3, r2)
                boolean r2 = r6 instanceof java.lang.Class
                if (r2 == 0) goto L21
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "$T.class"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r1)
                return r5
            L21:
                boolean r2 = r6 instanceof java.lang.Enum
                if (r2 == 0) goto L3d
                java.lang.Class r2 = r6.getClass()
                java.lang.Enum r6 = (java.lang.Enum) r6
                java.lang.String r6 = r6.name()
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r2
                r3[r1] = r6
                java.lang.String r6 = "$T.$L"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r3)
                return r5
            L3d:
                boolean r2 = r6 instanceof java.lang.String
                if (r2 == 0) goto L4c
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "$S"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r1)
                return r5
            L4c:
                boolean r2 = r6 instanceof java.lang.Float
                if (r2 == 0) goto L5b
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "$Lf"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r1)
                return r5
            L5b:
                boolean r2 = r6 instanceof java.lang.Character
                if (r2 == 0) goto L74
                java.lang.Character r6 = (java.lang.Character) r6
                char r6 = r6.charValue()
                java.lang.String r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.a(r6)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "'$L'"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r1)
                return r5
            L74:
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r6
                java.lang.String r6 = "$L"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r4.d(r5, r6, r1)
                return r5
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a f() {
                r2 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.a
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class c extends javax.lang.model.util.SimpleAnnotationValueVisitor7<com.bumptech.glide.repackaged.com.squareup.javapoet.a.b, java.lang.String> {
        final com.bumptech.glide.repackaged.com.squareup.javapoet.a.b a;

        c(com.bumptech.glide.repackaged.com.squareup.javapoet.a.b r1) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r1
                return
        }

        protected com.bumptech.glide.repackaged.com.squareup.javapoet.a.b a(java.lang.Object r2, java.lang.String r3) {
                r1 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = r1.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = r0.e(r3, r2)
                return r2
        }

        protected /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.a(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b c(javax.lang.model.element.AnnotationMirror r4, java.lang.String r5) {
                r3 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = r3.a
                com.bumptech.glide.repackaged.com.squareup.javapoet.a r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.e(r4)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.String r4 = "$L"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r4 = r0.d(r5, r4, r1)
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object d(javax.lang.model.element.AnnotationMirror r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.c(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b e(java.util.List<? extends javax.lang.model.element.AnnotationValue> r2, java.lang.String r3) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                javax.lang.model.element.AnnotationValue r0 = (javax.lang.model.element.AnnotationValue) r0
                r0.accept(r1, r3)
                goto L4
            L14:
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r2 = r1.a
                return r2
        }

        public /* bridge */ /* synthetic */ java.lang.Object f(java.util.List r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.e(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b g(javax.lang.model.element.VariableElement r5, java.lang.String r6) {
                r4 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = r4.a
                javax.lang.model.type.TypeMirror r1 = r5.asType()
                javax.lang.model.element.Name r5 = r5.getSimpleName()
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r5
                java.lang.String r5 = "$T.$L"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r5 = r0.d(r6, r5, r2)
                return r5
        }

        public /* bridge */ /* synthetic */ java.lang.Object h(javax.lang.model.element.VariableElement r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.g(r1, r2)
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.a.b i(javax.lang.model.type.TypeMirror r4, java.lang.String r5) {
                r3 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = r3.a
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r4
                java.lang.String r4 = "$T.class"
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r4 = r0.d(r5, r4, r1)
                return r4
        }

        public /* bridge */ /* synthetic */ java.lang.Object j(javax.lang.model.type.TypeMirror r1, java.lang.Object r2) {
                r0 = this;
                java.lang.String r2 = (java.lang.String) r2
                com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r1 = r0.i(r1, r2)
                return r1
        }
    }

    private a(com.bumptech.glide.repackaged.com.squareup.javapoet.a.b r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b.a(r2)
            r1.a = r0
            java.util.Map r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b.b(r2)
            java.util.Map r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.h(r2)
            r1.b = r2
            return
    }

    /* synthetic */ a(com.bumptech.glide.repackaged.com.squareup.javapoet.a.b r1, com.bumptech.glide.repackaged.com.squareup.javapoet.a.C0040a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.a.b a(com.bumptech.glide.repackaged.com.squareup.javapoet.c r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "type == null"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r2, r1, r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.a$b
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.a.b b(java.lang.Class<?> r0) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = a(r0)
            return r0
    }

    private void d(com.bumptech.glide.repackaged.com.squareup.javapoet.e r6, java.lang.String r7, java.lang.String r8, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d> r9) throws java.io.IOException {
            r5 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != r3) goto L19
            r6.s(r2)
            java.lang.Object r7 = r9.get(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r7 = (com.bumptech.glide.repackaged.com.squareup.javapoet.d) r7
            r6.a(r7)
            r6.C(r2)
            return
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "{"
            r0.append(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r6.b(r0)
            r6.s(r2)
            java.util.Iterator r9 = r9.iterator()
        L34:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r9.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.d) r0
            if (r3 != 0) goto L45
            r6.b(r8)
        L45:
            r6.a(r0)
            r3 = 0
            goto L34
        L4a:
            r6.C(r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "}"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.b(r7)
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.a e(javax.lang.model.element.AnnotationMirror r6) {
            javax.lang.model.type.DeclaredType r0 = r6.getAnnotationType()
            javax.lang.model.element.Element r0 = r0.asElement()
            javax.lang.model.element.TypeElement r0 = (javax.lang.model.element.TypeElement) r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r0 = a(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$c r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.a$c
            r1.<init>(r0)
            java.util.Map r2 = r6.getElementValues()
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            javax.lang.model.element.ExecutableElement r3 = (javax.lang.model.element.ExecutableElement) r3
            javax.lang.model.element.Name r4 = r3.getSimpleName()
            java.lang.String r4 = r4.toString()
            java.util.Map r5 = r6.getElementValues()
            java.lang.Object r3 = r5.get(r3)
            javax.lang.model.element.AnnotationValue r3 = (javax.lang.model.element.AnnotationValue) r3
            r3.accept(r1, r4)
            goto L23
        L45:
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r6 = r0.f()
            return r6
    }

    void c(com.bumptech.glide.repackaged.com.squareup.javapoet.e r10, boolean r11) throws java.io.IOException {
            r9 = this;
            if (r11 == 0) goto L5
            java.lang.String r0 = ""
            goto L7
        L5:
            java.lang.String r0 = "\n"
        L7:
            if (r11 == 0) goto Lc
            java.lang.String r11 = ", "
            goto Le
        Lc:
            java.lang.String r11 = ",\n"
        Le:
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r1 = r9.b
            boolean r1 = r1.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r11 = r9.a
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r2] = r11
            java.lang.String r11 = "@$T"
            r10.c(r11, r0)
            return
        L24:
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r1 = r9.b
            int r1 = r1.size()
            java.lang.String r4 = ")"
            java.lang.String r5 = "@$T("
            if (r1 != r3) goto L52
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r1 = r9.b
            java.lang.String r6 = "value"
            boolean r1 = r1.containsKey(r6)
            if (r1 == 0) goto L52
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r1 = r9.a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            r10.c(r5, r3)
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r1 = r9.b
            java.lang.Object r1 = r1.get(r6)
            java.util.List r1 = (java.util.List) r1
            r9.d(r10, r0, r11, r1)
            r10.b(r4)
            return
        L52:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r5 = r9.a
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r2] = r5
            r10.c(r1, r6)
            r1 = 2
            r10.s(r1)
            java.util.Map<java.lang.String, java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.d>> r5 = r9.b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L78:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r7
            java.lang.String r7 = "$L = "
            r10.c(r7, r8)
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            r9.d(r10, r0, r11, r6)
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L78
            r10.b(r11)
            goto L78
        La4:
            r10.C(r1)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r10.b(r11)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L11
            return r0
        L11:
            java.lang.String r0 = r3.toString()
            java.lang.String r4 = r4.toString()
            boolean r4 = r0.equals(r4)
            return r4
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.e     // Catch: java.io.IOException -> L1a
            r1.<init>(r0)     // Catch: java.io.IOException -> L1a
            java.lang.String r2 = "$L"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.io.IOException -> L1a
            r4 = 0
            r3[r4] = r5     // Catch: java.io.IOException -> L1a
            r1.c(r2, r3)     // Catch: java.io.IOException -> L1a
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L1a
            return r0
        L1a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
