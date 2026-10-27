package com.bumptech.glide.repackaged.com.squareup.javapoet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class e {

    /* renamed from: o, reason: collision with root package name */
    private static final java.lang.String f492o = null;
    private final java.lang.String a;
    private final com.bumptech.glide.repackaged.com.squareup.javapoet.h b;
    private int c;
    private boolean d;
    private boolean e;
    private java.lang.String f;
    private final java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> g;
    private final java.util.Set<java.lang.String> h;
    private final java.util.Set<java.lang.String> i;
    private final java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> j;
    private final java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> k;

    /* renamed from: l, reason: collision with root package name */
    private final java.util.Set<java.lang.String> f493l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f494m;

    /* renamed from: n, reason: collision with root package name */
    int f495n;

    static {
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            com.bumptech.glide.repackaged.com.squareup.javapoet.e.f492o = r0
            return
    }

    e(java.lang.Appendable r3) {
            r2 = this;
            java.lang.String r0 = "  "
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            r2.<init>(r3, r0, r1)
            return
    }

    e(java.lang.Appendable r4, java.lang.String r5, java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r6, java.util.Set<java.lang.String> r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.d = r0
            r3.e = r0
            java.lang.String r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.e.f492o
            r3.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.g = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.k = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r3.f493l = r1
            r1 = -1
            r3.f495n = r1
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r1 = new com.bumptech.glide.repackaged.com.squareup.javapoet.h
            r2 = 100
            r1.<init>(r4, r5, r2)
            r3.b = r1
            java.lang.String r4 = "indent == null"
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r5, r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            r3.a = r4
            java.lang.String r4 = "importedTypes == null"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r6, r4, r5)
            java.util.Map r4 = (java.util.Map) r4
            r3.j = r4
            java.lang.String r4 = "staticImports == null"
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Object r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r7, r4, r5)
            java.util.Set r4 = (java.util.Set) r4
            r3.i = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r3.h = r4
            java.util.Iterator r4 = r7.iterator()
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set<java.lang.String> r6 = r3.h
            r7 = 46
            int r7 = r5.lastIndexOf(r7)
            java.lang.String r5 = r5.substring(r0, r7)
            r6.add(r5)
            goto L5c
        L78:
            return
    }

    e(java.lang.Appendable r2, java.lang.String r3, java.util.Set<java.lang.String> r4) {
            r1 = this;
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r1.<init>(r2, r3, r0, r4)
            return
    }

    private void g() throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.c
            if (r0 >= r1) goto Lf
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r1 = r3.b
            java.lang.String r2 = r3.a
            r1.a(r2)
            int r0 = r0 + 1
            goto L1
        Lf:
            return
    }

    private void i(java.lang.Object r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec
            if (r0 == 0) goto Ld
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r3
            r0 = 0
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            r3.b(r2, r0, r1)
            return
        Ld:
            boolean r0 = r3 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.a
            if (r0 == 0) goto L18
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r3
            r0 = 1
            r3.c(r2, r0)
            return
        L18:
            boolean r0 = r3 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.d
            if (r0 == 0) goto L22
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.d) r3
            r2.a(r3)
            return
        L22:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.d(r3)
            return
    }

    private boolean l(java.lang.String r5, java.lang.String r6) throws java.io.IOException {
            r4 = this;
            r0 = 1
            java.lang.String r6 = r6.substring(r0)
            boolean r1 = r6.isEmpty()
            r2 = 0
            if (r1 == 0) goto Ld
            return r2
        Ld:
            char r1 = r6.charAt(r2)
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r1)
            if (r1 != 0) goto L18
            return r2
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = o(r6)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            java.lang.String r5 = ".*"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.util.Set<java.lang.String> r3 = r4.i
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L53
            java.util.Set<java.lang.String> r1 = r4.i
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L52
            goto L53
        L52:
            return r2
        L53:
            r4.d(r6)
            return r0
    }

    private static java.lang.String o(java.lang.String r5) {
            r0 = 0
            char r1 = r5.charAt(r0)
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r5
            java.lang.String r4 = "not an identifier: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r1, r4, r3)
            r1 = 1
        L14:
            int r3 = r5.length()
            if (r1 > r3) goto L2d
            java.lang.String r3 = r5.substring(r0, r1)
            boolean r3 = javax.lang.model.SourceVersion.isIdentifier(r3)
            if (r3 != 0) goto L2a
            int r1 = r1 - r2
            java.lang.String r5 = r5.substring(r0, r1)
            return r5
        L2a:
            int r1 = r1 + 1
            goto L14
        L2d:
            return r5
    }

    private void p(com.bumptech.glide.repackaged.com.squareup.javapoet.c r3) {
            r2 = this;
            java.lang.String r0 = r3.E()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L22
        Lb:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r3.K()
            java.lang.String r0 = r3.I()
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r1 = r2.k
            java.lang.Object r3 = r1.put(r0, r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r3
            if (r3 == 0) goto L22
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r1 = r2.k
            r1.put(r0, r3)
        L22:
            return
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.c y(java.lang.String r4) {
            r3 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r3.g
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L34
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r1 = r3.g
            java.lang.Object r1 = r1.get(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r1
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r1 = r1.f481o
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r2
            java.lang.String r2 = r2.b
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L18
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = r3.z(r0, r4)
            return r4
        L31:
            int r0 = r0 + (-1)
            goto L8
        L34:
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r3.g
            int r0 = r0.size()
            if (r0 <= 0) goto L56
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r3.g
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r0
            java.lang.String r0 = r0.b
            boolean r0 = java.util.Objects.equals(r0, r4)
            if (r0 == 0) goto L56
            java.lang.String r0 = r3.f
            java.lang.String[] r1 = new java.lang.String[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r0, r4, r1)
            return r4
        L56:
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r0 = r3.j
            java.lang.Object r4 = r0.get(r4)
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r4
            if (r4 == 0) goto L61
            return r4
        L61:
            r4 = 0
            return r4
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.c z(int r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = r3.f
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r1 = r3.g
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r1 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r1
            java.lang.String r1 = r1.b
            java.lang.String[] r2 = new java.lang.String[r2]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r0, r1, r2)
            r1 = 1
        L14:
            if (r1 > r4) goto L27
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r2 = r3.g
            java.lang.Object r2 = r2.get(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec) r2
            java.lang.String r2 = r2.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = r0.D(r2)
            int r1 = r1 + 1
            goto L14
        L27:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = r0.D(r5)
            return r4
    }

    java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> A() {
            r3 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r1 = r3.k
            r0.<init>(r1)
            java.util.Set r1 = r0.keySet()
            java.util.Set<java.lang.String> r2 = r3.f493l
            r1.removeAll(r2)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e B() {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r0 = r1.C(r0)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e C(int r7) {
            r6 = this;
            int r0 = r6.c
            int r0 = r0 - r7
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            int r4 = r6.c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            r5[r2] = r4
            java.lang.String r1 = "cannot unindent %s from %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.b(r0, r1, r5)
            int r0 = r6.c
            int r0 = r0 - r7
            r6.c = r0
            return r6
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e a(com.bumptech.glide.repackaged.com.squareup.javapoet.d r12) throws java.io.IOException {
            r11 = this;
            java.util.List<java.lang.String> r0 = r12.a
            java.util.ListIterator r0 = r0.listIterator()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        La:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L182
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 2
            r8 = -1
            r9 = 1
            switch(r6) {
                case 1152: goto L8d;
                case 1176: goto L82;
                case 1178: goto L77;
                case 1192: goto L6c;
                case 1194: goto L61;
                case 1199: goto L56;
                case 1200: goto L4b;
                case 1203: goto L40;
                case 1207: goto L33;
                case 1209: goto L26;
                default: goto L23;
            }
        L23:
            r6 = -1
            goto L97
        L26:
            java.lang.String r6 = "$]"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L2f
            goto L23
        L2f:
            r6 = 9
            goto L97
        L33:
            java.lang.String r6 = "$["
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L3c
            goto L23
        L3c:
            r6 = 8
            goto L97
        L40:
            java.lang.String r6 = "$W"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L49
            goto L23
        L49:
            r6 = 7
            goto L97
        L4b:
            java.lang.String r6 = "$T"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L54
            goto L23
        L54:
            r6 = 6
            goto L97
        L56:
            java.lang.String r6 = "$S"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L5f
            goto L23
        L5f:
            r6 = 5
            goto L97
        L61:
            java.lang.String r6 = "$N"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L6a
            goto L23
        L6a:
            r6 = 4
            goto L97
        L6c:
            java.lang.String r6 = "$L"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L75
            goto L23
        L75:
            r6 = 3
            goto L97
        L77:
            java.lang.String r6 = "$>"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L80
            goto L23
        L80:
            r6 = 2
            goto L97
        L82:
            java.lang.String r6 = "$<"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L8b
            goto L23
        L8b:
            r6 = 1
            goto L97
        L8d:
            java.lang.String r6 = "$$"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L96
            goto L23
        L96:
            r6 = 0
        L97:
            java.lang.String r10 = "$"
            switch(r6) {
                case 0: goto L17d;
                case 1: goto L178;
                case 2: goto L173;
                case 3: goto L167;
                case 4: goto L159;
                case 5: goto L140;
                case 6: goto Led;
                case 7: goto Le3;
                case 8: goto Ld2;
                case 9: goto Lba;
                default: goto L9c;
            }
        L9c:
            if (r4 == 0) goto Lb5
            java.lang.String r6 = "."
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto Lb1
            java.lang.String r6 = r4.f491x
            boolean r6 = r11.l(r6, r5)
            if (r6 == 0) goto Lb1
            r4 = r2
            goto La
        Lb1:
            r4.h(r11)
            r4 = r2
        Lb5:
            r11.d(r5)
            goto La
        Lba:
            int r5 = r11.f495n
            if (r5 == r8) goto Lbf
            goto Lc0
        Lbf:
            r9 = 0
        Lc0:
            java.lang.String r5 = "statement exit $] has no matching statement enter $["
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r9, r5, r6)
            int r5 = r11.f495n
            if (r5 <= 0) goto Lce
            r11.C(r7)
        Lce:
            r11.f495n = r8
            goto La
        Ld2:
            int r5 = r11.f495n
            if (r5 != r8) goto Ld7
            goto Ld8
        Ld7:
            r9 = 0
        Ld8:
            java.lang.String r5 = "statement enter $[ followed by statement enter $["
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r9, r5, r6)
            r11.f495n = r1
            goto La
        Le3:
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r5 = r11.b
            int r6 = r11.c
            int r6 = r6 + r7
            r5.c(r6)
            goto La
        Led:
            java.util.List<java.lang.Object> r5 = r12.b
            int r6 = r3 + 1
            java.lang.Object r3 = r5.get(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r3
            boolean r5 = r3.n()
            if (r5 == 0) goto L104
            r3.i(r11)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = r3.r()
        L104:
            boolean r5 = r3 instanceof com.bumptech.glide.repackaged.com.squareup.javapoet.c
            if (r5 == 0) goto L13c
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L13c
            java.util.List<java.lang.String> r5 = r12.a
            int r7 = r0.nextIndex()
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.startsWith(r10)
            if (r5 != 0) goto L13c
            r5 = r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r5
            java.util.Set<java.lang.String> r7 = r11.h
            java.lang.String r8 = r5.f491x
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L13c
            if (r4 != 0) goto L130
            goto L131
        L130:
            r9 = 0
        L131:
            java.lang.String r3 = "pending type for static import?!"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r9, r3, r4)
            r4 = r5
        L139:
            r3 = r6
            goto La
        L13c:
            r3.h(r11)
            goto L139
        L140:
            java.util.List<java.lang.Object> r5 = r12.b
            int r6 = r3 + 1
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L153
            java.lang.String r5 = r11.a
            java.lang.String r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.l(r3, r5)
            goto L155
        L153:
            java.lang.String r3 = "null"
        L155:
            r11.d(r3)
            goto L139
        L159:
            java.util.List<java.lang.Object> r5 = r12.b
            int r6 = r3 + 1
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r11.d(r3)
            goto L139
        L167:
            java.util.List<java.lang.Object> r5 = r12.b
            int r6 = r3 + 1
            java.lang.Object r3 = r5.get(r3)
            r11.i(r3)
            goto L139
        L173:
            r11.r()
            goto La
        L178:
            r11.B()
            goto La
        L17d:
            r11.d(r10)
            goto La
        L182:
            return r11
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e b(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = r0.d(r1)
            return r1
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e c(java.lang.String r1, java.lang.Object... r2) throws java.io.IOException {
            r0 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.d r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.d.c(r1, r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r1 = r0.a(r1)
            return r1
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.e d(java.lang.String r10) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "\n"
            r1 = -1
            java.lang.String[] r10 = r10.split(r0, r1)
            int r2 = r10.length
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 1
        Lc:
            if (r5 >= r2) goto L75
            r7 = r10[r5]
            if (r6 != 0) goto L45
            boolean r6 = r9.d
            if (r6 != 0) goto L1a
            boolean r6 = r9.e
            if (r6 == 0) goto L2f
        L1a:
            boolean r6 = r9.f494m
            if (r6 == 0) goto L2f
            r9.g()
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r6 = r9.b
            boolean r8 = r9.d
            if (r8 == 0) goto L2a
            java.lang.String r8 = " *"
            goto L2c
        L2a:
            java.lang.String r8 = "//"
        L2c:
            r6.a(r8)
        L2f:
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r6 = r9.b
            r6.a(r0)
            r9.f494m = r3
            int r6 = r9.f495n
            if (r6 == r1) goto L45
            if (r6 != 0) goto L40
            r6 = 2
            r9.s(r6)
        L40:
            int r6 = r9.f495n
            int r6 = r6 + r3
            r9.f495n = r6
        L45:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L4c
            goto L71
        L4c:
            boolean r6 = r9.f494m
            if (r6 == 0) goto L6a
            r9.g()
            boolean r6 = r9.d
            if (r6 == 0) goto L5f
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r6 = r9.b
            java.lang.String r8 = " * "
            r6.a(r8)
            goto L6a
        L5f:
            boolean r6 = r9.e
            if (r6 == 0) goto L6a
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r6 = r9.b
            java.lang.String r8 = "// "
            r6.a(r8)
        L6a:
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r6 = r9.b
            r6.a(r7)
            r9.f494m = r4
        L71:
            int r5 = r5 + 1
            r6 = 0
            goto Lc
        L75:
            return r9
    }

    public void e(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.a> r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r2.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r0 = (com.bumptech.glide.repackaged.com.squareup.javapoet.a) r0
            r0.c(r1, r3)
            if (r3 == 0) goto L18
            java.lang.String r0 = " "
            goto L1a
        L18:
            java.lang.String r0 = "\n"
        L1a:
            r1.b(r0)
            goto L4
        L1e:
            return
    }

    public void f(com.bumptech.glide.repackaged.com.squareup.javapoet.d r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.f494m = r0
            r1.e = r0
            r0 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "\n"
            r1.b(r2)     // Catch: java.lang.Throwable -> L11
            r1.e = r0
            return
        L11:
            r2 = move-exception
            r1.e = r0
            throw r2
    }

    public void h(com.bumptech.glide.repackaged.com.squareup.javapoet.d r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r2.b()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "/**\n"
            r1.b(r0)
            r0 = 1
            r1.d = r0
            r0 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> L1b
            r1.d = r0
            java.lang.String r2 = " */\n"
            r1.b(r2)
            return
        L1b:
            r2 = move-exception
            r1.d = r0
            throw r2
    }

    public void j(java.util.Set<javax.lang.model.element.Modifier> r2) throws java.io.IOException {
            r1 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            r1.k(r2, r0)
            return
    }

    public void k(java.util.Set<javax.lang.model.element.Modifier> r3, java.util.Set<javax.lang.model.element.Modifier> r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L35
        L7:
            java.util.EnumSet r3 = java.util.EnumSet.copyOf(r3)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            javax.lang.model.element.Modifier r0 = (javax.lang.model.element.Modifier) r0
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L22
            goto Lf
        L22:
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            r2.d(r0)
            java.lang.String r0 = " "
            r2.d(r0)
            goto Lf
        L35:
            return
    }

    public void m(java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.m> r7) throws java.io.IOException {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "<"
            r6.b(r0)
            java.util.Iterator r7 = r7.iterator()
            r0 = 1
            r1 = 1
        L12:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r7.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.m r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.m) r2
            if (r1 != 0) goto L25
            java.lang.String r1 = ", "
            r6.b(r1)
        L25:
            java.lang.String r1 = r2.f510w
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "$L"
            r6.c(r1, r3)
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.l> r1 = r2.f511x
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L38:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r1.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.l r3 = (com.bumptech.glide.repackaged.com.squareup.javapoet.l) r3
            if (r2 == 0) goto L49
            java.lang.String r2 = " extends $T"
            goto L4b
        L49:
            java.lang.String r2 = " & $T"
        L4b:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r4] = r3
            r6.c(r2, r5)
            r2 = 0
            goto L38
        L54:
            r1 = 0
            goto L12
        L56:
            java.lang.String r7 = ">"
            r6.b(r7)
            return
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e n() throws java.io.IOException {
            r2 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.h r0 = r2.b
            int r1 = r2.c
            int r1 = r1 + 2
            r0.c(r1)
            return r2
    }

    public java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> q() {
            r1 = this;
            java.util.Map<java.lang.String, com.bumptech.glide.repackaged.com.squareup.javapoet.c> r0 = r1.j
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e r() {
            r1 = this;
            r0 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.e r0 = r1.s(r0)
            return r0
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e s(int r2) {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + r2
            r1.c = r0
            return r1
    }

    java.lang.String t(com.bumptech.glide.repackaged.com.squareup.javapoet.c r7) {
            r6 = this;
            r0 = 0
            r1 = r7
            r2 = 0
        L3:
            java.lang.String r3 = "."
            if (r1 == 0) goto L3f
            java.lang.String r2 = r1.I()
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = r6.y(r2)
            r4 = 1
            if (r2 == 0) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = 0
        L15:
            boolean r2 = java.util.Objects.equals(r2, r1)
            if (r2 == 0) goto L39
            java.util.List r0 = r1.J()
            int r0 = r0.size()
            int r0 = r0 - r4
            java.util.List r1 = r7.J()
            java.util.List r7 = r7.J()
            int r7 = r7.size()
            java.util.List r7 = r1.subList(r0, r7)
            java.lang.String r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.j(r3, r7)
            return r7
        L39:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r1.v()
            r2 = r5
            goto L3
        L3f:
            if (r2 == 0) goto L44
            java.lang.String r7 = r7.f491x
            return r7
        L44:
            java.lang.String r0 = r6.f
            java.lang.String r1 = r7.E()
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L66
            java.util.Set<java.lang.String> r0 = r6.f493l
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r7.K()
            java.lang.String r1 = r1.I()
            r0.add(r1)
            java.util.List r7 = r7.J()
            java.lang.String r7 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.j(r3, r7)
            return r7
        L66:
            boolean r0 = r6.d
            if (r0 != 0) goto L6d
            r6.p(r7)
        L6d:
            java.lang.String r7 = r7.f491x
            return r7
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e u() {
            r5 = this;
            java.lang.String r0 = r5.f
            java.lang.String r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.e.f492o
            r2 = 0
            r3 = 1
            if (r0 == r1) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = "package already set: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r4, r0, r3)
            r5.f = r1
            return r5
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e v() {
            r2 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r2.g
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return r2
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e w(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.f
            java.lang.String r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.e.f492o
            r2 = 1
            r3 = 0
            if (r0 != r1) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            java.lang.String r0 = "package already set: %s"
            com.bumptech.glide.repackaged.com.squareup.javapoet.n.d(r1, r0, r2)
            java.lang.String r0 = "packageName == null"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Object r5 = com.bumptech.glide.repackaged.com.squareup.javapoet.n.c(r5, r0, r1)
            java.lang.String r5 = (java.lang.String) r5
            r4.f = r5
            return r4
    }

    public com.bumptech.glide.repackaged.com.squareup.javapoet.e x(com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r2) {
            r1 = this;
            java.util.List<com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec> r0 = r1.g
            r0.add(r2)
            return r1
    }
}
