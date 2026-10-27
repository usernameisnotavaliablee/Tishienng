package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {
    private static final java.util.regex.Pattern c = null;
    private static final java.util.regex.Pattern d = null;
    final java.util.List<java.lang.String> a;
    final java.util.List<java.lang.Object> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {
        final java.util.List<java.lang.String> a;
        final java.util.List<java.lang.Object> b;

        private b() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.a = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.b = r0
                return
        }

        /* synthetic */ b(com.bumptech.glide.repackaged.com.squareup.javapoet.d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private void c(java.lang.String r2, char r3, java.lang.Object r4) {
                r1 = this;
                r0 = 76
                if (r3 == r0) goto L40
                r0 = 78
                if (r3 == r0) goto L36
                r0 = 83
                if (r3 == r0) goto L2c
                r0 = 84
                if (r3 != r0) goto L1a
                java.util.List<java.lang.Object> r2 = r1.b
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = r1.h(r4)
                r2.add(r3)
                return
            L1a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r0 = 0
                r4[r0] = r2
                java.lang.String r2 = "invalid format string: '%s'"
                java.lang.String r2 = java.lang.String.format(r2, r4)
                r3.<init>(r2)
                throw r3
            L2c:
                java.util.List<java.lang.Object> r2 = r1.b
                java.lang.String r3 = r1.g(r4)
                r2.add(r3)
                return
            L36:
                java.util.List<java.lang.Object> r2 = r1.b
                java.lang.String r3 = r1.f(r4)
                r2.add(r3)
                return
            L40:
                java.util.List<java.lang.Object> r2 = r1.b
                java.lang.Object r3 = r1.e(r4)
                r2.add(r3)
                return
        }

        private java.lang.Object e(java.lang.Object r1) {
                r0 = this;
                return r1
        }

        private java.lang.String f(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.lang.CharSequence
                if (r0 == 0) goto L9
                java.lang.String r4 = r4.toString()
                return r4
            L9:
                boolean r0 = r4 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.j
                if (r0 == 0) goto L12
                com.bumptech.glide.repackaged.com.squareup.javapoet.j r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.j) r4
                java.lang.String r4 = r4.a
                return r4
            L12:
                boolean r0 = r4 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.f
                if (r0 == 0) goto L1b
                com.bumptech.glide.repackaged.com.squareup.javapoet.f r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.f) r4
                java.lang.String r4 = r4.b
                return r4
            L1b:
                boolean r0 = r4 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.i
                if (r0 == 0) goto L24
                com.bumptech.glide.repackaged.com.squareup.javapoet.i r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.i) r4
                java.lang.String r4 = r4.a
                return r4
            L24:
                boolean r0 = r4 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec
                if (r0 == 0) goto L2d
                com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r4
                java.lang.String r4 = r4.b
                return r4
            L2d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "expected name but was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private java.lang.String g(java.lang.Object r1) {
                r0 = this;
                if (r1 == 0) goto L7
                java.lang.String r1 = java.lang.String.valueOf(r1)
                return r1
            L7:
                r1 = 0
                return r1
        }

        private com.bumptech.glide.repackaged.com.squareup.javapoet.l h(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.l
                if (r0 == 0) goto L7
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r4
                return r4
            L7:
                boolean r0 = r4 instanceof javax.lang.model.type.TypeMirror
                if (r0 == 0) goto L12
                javax.lang.model.type.TypeMirror r4 = (javax.lang.model.type.TypeMirror) r4
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.l(r4)
                return r4
            L12:
                boolean r0 = r4 instanceof javax.lang.model.element.Element
                if (r0 == 0) goto L21
                javax.lang.model.element.Element r4 = (javax.lang.model.element.Element) r4
                javax.lang.model.type.TypeMirror r4 = r4.asType()
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.l(r4)
                return r4
            L21:
                boolean r0 = r4 instanceof java.lang.reflect.Type
                if (r0 == 0) goto L2c
                java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
                com.bumptech.glide.repackaged.com.squareup.javapoet.l r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.l.j(r4)
                return r4
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "expected type but was "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        private boolean m(char r2) {
                r1 = this;
                r0 = 36
                if (r2 == r0) goto L1b
                r0 = 62
                if (r2 == r0) goto L1b
                r0 = 60
                if (r2 == r0) goto L1b
                r0 = 91
                if (r2 == r0) goto L1b
                r0 = 93
                if (r2 == r0) goto L1b
                r0 = 87
                if (r2 != r0) goto L19
                goto L1b
            L19:
                r2 = 0
                return r2
            L1b:
                r2 = 1
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b a(com.bumptech.glide.repackaged.com.squareup.javapoet.d r3) {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.a
                java.util.List<java.lang.String> r1 = r3.a
                r0.addAll(r1)
                java.util.List<java.lang.Object> r0 = r2.b
                java.util.List<java.lang.Object> r3 = r3.b
                r0.addAll(r3)
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b b(java.lang.String r20, java.lang.Object... r21) {
                r19 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                int r3 = r2.length
                int[] r3 = new int[r3]
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
            Le:
                int r9 = r1.length()
                java.lang.String r11 = "$"
                r12 = 1
                if (r5 >= r9) goto Lfe
                char r9 = r1.charAt(r5)
                r13 = 36
                if (r9 == r13) goto L37
                int r9 = r5 + 1
                int r9 = r1.indexOf(r13, r9)
                r10 = -1
                if (r9 != r10) goto L2c
                int r9 = r1.length()
            L2c:
                java.util.List<java.lang.String> r10 = r0.a
                java.lang.String r5 = r1.substring(r5, r9)
                r10.add(r5)
                r5 = r9
                goto Le
            L37:
                int r9 = r5 + 1
                r13 = r9
            L3a:
                int r14 = r1.length()
                if (r13 >= r14) goto L42
                r14 = 1
                goto L43
            L42:
                r14 = 0
            L43:
                java.lang.Object[] r15 = new java.lang.Object[r12]
                r15[r4] = r1
                r16 = 1
                java.lang.String r12 = "dangling format characters in '%s'"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r14, r12, r15)
                int r12 = r13 + 1
                char r14 = r1.charAt(r13)
                r15 = 48
                if (r14 < r15) goto L60
                r15 = 57
                if (r14 <= r15) goto L5d
                goto L60
            L5d:
                r13 = r12
                r12 = 1
                goto L3a
            L60:
                boolean r15 = r0.m(r14)
                if (r15 == 0) goto L88
                if (r9 != r13) goto L6a
                r5 = 1
                goto L6b
            L6a:
                r5 = 0
            L6b:
                java.lang.String r9 = "$$, $>, $<, $[, $], and $W may not have an index"
                java.lang.Object[] r10 = new java.lang.Object[r4]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r9, r10)
                java.util.List<java.lang.String> r5 = r0.a
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r11)
                r9.append(r14)
                java.lang.String r9 = r9.toString()
                r5.add(r9)
            L86:
                r5 = r12
                goto Le
            L88:
                if (r9 >= r13) goto La5
                java.lang.String r8 = r1.substring(r9, r13)
                int r8 = java.lang.Integer.parseInt(r8)
                int r8 = r8 + (-1)
                int r9 = r2.length
                if (r9 <= 0) goto La0
                int r9 = r2.length
                int r9 = r8 % r9
                r15 = r3[r9]
                int r15 = r15 + 1
                r3[r9] = r15
            La0:
                r9 = r8
                r8 = r7
                r7 = r9
                r9 = 1
                goto Laa
            La5:
                int r6 = r7 + 1
                r9 = r8
                r8 = r6
                r6 = 1
            Laa:
                if (r7 < 0) goto Lb1
                int r15 = r2.length
                if (r7 >= r15) goto Lb1
                r15 = 1
                goto Lb2
            Lb1:
                r15 = 0
            Lb2:
                int r17 = r7 + 1
                java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
                int r13 = r13 + 1
                java.lang.String r5 = r1.substring(r5, r13)
                int r13 = r2.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r18 = 2
                r10 = 3
                java.lang.Object[] r10 = new java.lang.Object[r10]
                r10[r4] = r17
                r10[r16] = r5
                r10[r18] = r13
                java.lang.String r5 = "index %d for '%s' not in range (received %s arguments)"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r15, r5, r10)
                if (r9 == 0) goto Lda
                if (r6 != 0) goto Ld8
                goto Lda
            Ld8:
                r5 = 0
                goto Ldb
            Lda:
                r5 = 1
            Ldb:
                java.lang.String r10 = "cannot mix indexed and positional parameters"
                java.lang.Object[] r13 = new java.lang.Object[r4]
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r10, r13)
                r5 = r2[r7]
                r0.c(r1, r14, r5)
                java.util.List<java.lang.String> r5 = r0.a
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r11)
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                r5.add(r7)
                r7 = r8
                r8 = r9
                goto L86
            Lfe:
                r16 = 1
                r18 = 2
                if (r6 == 0) goto L11f
                int r1 = r2.length
                if (r7 < r1) goto L109
                r1 = 1
                goto L10a
            L109:
                r1 = 0
            L10a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
                int r6 = r2.length
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7 = 2
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r9[r4] = r5
                r9[r16] = r6
                java.lang.String r5 = "unused arguments: expected %s, received %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r5, r9)
            L11f:
                if (r8 == 0) goto L167
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r5 = 0
            L127:
                int r6 = r2.length
                if (r5 >= r6) goto L145
                r6 = r3[r5]
                if (r6 != 0) goto L142
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r11)
                int r7 = r5 + 1
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r1.add(r6)
            L142:
                int r5 = r5 + 1
                goto L127
            L145:
                int r2 = r1.size()
                r3 = 1
                if (r2 != r3) goto L14f
                java.lang.String r2 = ""
                goto L151
            L14f:
                java.lang.String r2 = "s"
            L151:
                boolean r5 = r1.isEmpty()
                java.lang.String r6 = ", "
                java.lang.String r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.j(r6, r1)
                r7 = 2
                java.lang.Object[] r6 = new java.lang.Object[r7]
                r6[r4] = r2
                r6[r3] = r1
                java.lang.String r1 = "unused argument%s: %s"
                com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r5, r1, r6)
            L167:
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b d(java.lang.String r4, java.lang.Object... r5) {
                r3 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.String r2 = "$["
                r3.b(r2, r1)
                r3.b(r4, r5)
                java.lang.String r4 = ";\n$]"
                java.lang.Object[] r5 = new java.lang.Object[r0]
                r3.b(r4, r5)
                return r3
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b i(java.lang.String r2, java.lang.Object... r3) {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = " {\n"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.b(r2, r3)
                r1.l()
                return r1
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d j() {
                r2 = this;
                com.bumptech.glide.repackaged.com.squareup.javapoet.d r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.d
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b k() {
                r2 = this;
                r2.o()
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "}\n"
                r2.b(r1, r0)
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b l() {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.a
                java.lang.String r1 = "$>"
                r0.add(r1)
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b n(java.lang.String r3, java.lang.Object... r4) {
                r2 = this;
                r2.o()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "} "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " {\n"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.b(r3, r4)
                r2.l()
                return r2
        }

        public com.bumptech.glide.repackaged.com.squareup.javapoet.d.b o() {
                r2 = this;
                java.util.List<java.lang.String> r0 = r2.a
                java.lang.String r1 = "$<"
                r0.add(r1)
                return r2
        }
    }

    static {
            java.lang.String r0 = "\\$(?<argumentName>[\\w_]+):(?<typeChar>[\\w]).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d.c = r0
            java.lang.String r0 = "[a-z]+[\\w_]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d.d = r0
            return
    }

    private d(com.bumptech.glide.repackaged.com.squareup.javapoet.d.b r2) {
            r1 = this;
            r1.<init>()
            java.util.List<java.lang.String> r0 = r2.a
            java.util.List r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r0)
            r1.a = r0
            java.util.List<java.lang.Object> r2 = r2.b
            java.util.List r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.f(r2)
            r1.b = r2
            return
    }

    /* synthetic */ d(com.bumptech.glide.repackaged.com.squareup.javapoet.d.b r1, com.bumptech.glide.repackaged.com.squareup.javapoet.d.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.d.b a() {
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.d$b
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static com.bumptech.glide.repackaged.com.squareup.javapoet.d c(java.lang.String r2, java.lang.Object... r3) {
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r0 = new com.bumptech.glide.repackaged.com.squareup.javapoet.d$b
            r1 = 0
            r0.<init>(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d$b r2 = r0.b(r2, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r2 = r2.j()
            return r2
    }

    public boolean b() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a
            boolean r0 = r0.isEmpty()
            return r0
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
            java.lang.Class<com.bumptech.glide.repackaged.com.squareup.javapoet.d> r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.class
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
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.e     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.a(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L12
            return r0
        L12:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
    }
}
