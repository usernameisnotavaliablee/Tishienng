package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class a {
    private final javax.annotation.processing.ProcessingEnvironment a;
    private final com.bumptech.glide.annotation.compiler.i b;

    a(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private boolean a(com.bumptech.glide.repackaged.com.squareup.javapoet.c r6) {
            r5 = this;
            javax.annotation.processing.ProcessingEnvironment r0 = r5.a
            javax.lang.model.util.Elements r0 = r0.getElementUtils()
            java.lang.String r1 = r6.F()
            javax.lang.model.element.TypeElement r0 = r0.getTypeElement(r1)
            java.util.List r0 = r0.getEnclosedElements()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L99
            java.lang.Object r1 = r0.next()
            javax.lang.model.element.Element r1 = (javax.lang.model.element.Element) r1
            javax.lang.model.element.ElementKind r3 = r1.getKind()
            javax.lang.model.element.ElementKind r4 = javax.lang.model.element.ElementKind.CONSTRUCTOR
            if (r3 != r4) goto L16
            javax.lang.model.element.ExecutableElement r1 = (javax.lang.model.element.ExecutableElement) r1
            java.util.List r0 = r1.getParameters()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L38
            return r2
        L38:
            int r1 = r0.size()
            r3 = 1
            if (r1 > r3) goto L7d
            java.lang.Object r6 = r0.get(r2)
            javax.lang.model.element.VariableElement r6 = (javax.lang.model.element.VariableElement) r6
            javax.lang.model.type.TypeMirror r6 = r6.asType()
            javax.annotation.processing.ProcessingEnvironment r0 = r5.a
            javax.lang.model.util.Elements r0 = r0.getElementUtils()
            java.lang.String r1 = "android.content.Context"
            javax.lang.model.element.TypeElement r0 = r0.getTypeElement(r1)
            javax.lang.model.type.TypeMirror r0 = r0.asType()
            javax.annotation.processing.ProcessingEnvironment r1 = r5.a
            javax.lang.model.util.Types r1 = r1.getTypeUtils()
            boolean r0 = r1.isSameType(r6, r0)
            if (r0 == 0) goto L66
            return r3
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized type: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Constructor for "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " accepts too many parameters, it should accept no parameters, or a single Context"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L99:
            return r2
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i c(com.bumptech.glide.repackaged.com.squareup.javapoet.c r11, java.util.Collection<java.lang.String> r12, java.util.Collection<java.lang.String> r13) {
            r10 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.a()
            r1 = 1
            javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r1]
            javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
            r4 = 0
            r2[r4] = r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.u(r2)
            java.lang.String r2 = "Context"
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r5 = "android.content"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r2, r3)
            java.lang.String r3 = "context"
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r2, r3, r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r2 = r2.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.v(r2)
            boolean r2 = r10.a(r11)
            if (r2 == 0) goto L3a
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r4] = r11
            java.lang.String r3 = "appGlideModule = new $T(context)"
            r0.y(r3, r2)
            goto L43
        L3a:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r4] = r11
            java.lang.String r3 = "appGlideModule = new $T()"
            r0.y(r3, r2)
        L43:
            java.lang.String r2 = "Log"
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r5 = "android.util"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r2, r3)
            r3 = 3
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            java.lang.String r6 = "Glide"
            r5[r1] = r6
            r7 = 2
            r5[r7] = r2
            java.lang.String r8 = "if ($T.isLoggable($S, $T.DEBUG))"
            r0.B(r8, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Discovered AppGlideModule from annotation: "
            r5.append(r8)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            r5[r1] = r6
            r5[r7] = r11
            java.lang.String r11 = "$T.d($S, $S)"
            r0.y(r11, r5)
            java.util.Iterator r12 = r12.iterator()
        L80:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto Lcc
            java.lang.Object r5 = r12.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r8 = r13.contains(r5)
            if (r8 == 0) goto Laf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "AppGlideModule excludes LibraryGlideModule from annotation: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r4] = r2
            r8[r1] = r6
            r8[r7] = r5
            r0.y(r11, r8)
            goto L80
        Laf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Discovered LibraryGlideModule from annotation: "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r4] = r2
            r8[r1] = r6
            r8[r7] = r5
            r0.y(r11, r8)
            goto L80
        Lcc:
            r0.D()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r11 = r0.C()
            return r11
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i d(java.util.Collection<java.lang.String> r8) {
            r7 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.o r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.o.w(r0)
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r1)
            r2 = 1
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r3 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r2]
            r4 = 0
            r3[r4] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r1, r3)
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r3 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r2]
            r3[r4] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r1 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r1, r3)
            java.lang.Class<java.util.HashSet> r3 = java.util.HashSet.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.w(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.l[] r5 = new com.bumptech.glide.repackaged.com.squareup.javapoet.l[r2]
            r5[r4] = r0
            com.bumptech.glide.repackaged.com.squareup.javapoet.k r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.k.t(r3, r5)
            java.lang.String r3 = "getExcludedModuleClasses"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r3)
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r2]
            javax.lang.model.element.Modifier r6 = javax.lang.model.element.Modifier.PUBLIC
            r5[r4] = r6
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.u(r5)
            java.lang.Class<java.lang.Override> r5 = java.lang.Override.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.n(r5)
            com.bumptech.glide.annotation.compiler.i r5 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r5 = r5.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.m(r5)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.F(r1)
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L68
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Class<java.util.Collections> r0 = java.util.Collections.class
            r8[r4] = r0
            java.lang.String r0 = "return $T.emptySet()"
            r3.y(r0, r8)
            goto L95
        L68:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r1
            r5[r2] = r0
            java.lang.String r0 = "$T excludedClasses = new $T()"
            r3.y(r0, r5)
            java.util.Iterator r8 = r8.iterator()
        L78:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r0
            java.lang.String r0 = "excludedClasses.add($L.class)"
            r3.y(r0, r1)
            goto L78
        L8e:
            java.lang.String r8 = "return excludedClasses"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.y(r8, r0)
        L95:
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r8 = r3.C()
            return r8
    }

    private com.bumptech.glide.repackaged.com.squareup.javapoet.i e(java.util.Collection<java.lang.String> r8, java.util.Collection<java.lang.String> r9) {
            r7 = this;
            java.lang.String r0 = "registerComponents"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r0)
            r1 = 1
            javax.lang.model.element.Modifier[] r2 = new javax.lang.model.element.Modifier[r1]
            javax.lang.model.element.Modifier r3 = javax.lang.model.element.Modifier.PUBLIC
            r4 = 0
            r2[r4] = r3
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.u(r2)
            java.lang.Class<java.lang.Override> r2 = java.lang.Override.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.n(r2)
            java.lang.String r2 = "Context"
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r5 = "android.content"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r2, r3)
            java.lang.String r3 = "context"
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r2, r3, r5)
            com.bumptech.glide.annotation.compiler.i r3 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r3.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = r2.e(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r2 = r2.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.v(r2)
            java.lang.String r2 = "Glide"
            java.lang.String[] r3 = new java.lang.String[r4]
            java.lang.String r5 = "com.bumptech.glide"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r2, r3)
            java.lang.String r3 = "glide"
            javax.lang.model.element.Modifier[] r6 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r2, r3, r6)
            com.bumptech.glide.annotation.compiler.i r3 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r3.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = r2.e(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r2 = r2.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.v(r2)
            java.lang.String r2 = "Registry"
            java.lang.String[] r3 = new java.lang.String[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r5, r2, r3)
            java.lang.String r3 = "registry"
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r2, r3, r5)
            com.bumptech.glide.annotation.compiler.i r3 = r7.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r3 = r3.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r2 = r2.e(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r2 = r2.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.v(r2)
            java.util.Iterator r8 = r8.iterator()
        L86:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r9.contains(r2)
            if (r3 == 0) goto L99
            goto L86
        L99:
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.t(r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r4] = r2
            java.lang.String r2 = "new $T().registerComponents(context, glide, registry)"
            r0.y(r2, r3)
            goto L86
        La7:
            java.lang.String r8 = "appGlideModule.registerComponents(context, glide, registry)"
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r0.y(r8, r9)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r8 = r0.C()
            return r8
    }

    private java.util.List<java.lang.String> f(javax.lang.model.element.TypeElement r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            java.lang.Class<com.bumptech.glide.annotation.Excludes> r1 = com.bumptech.glide.annotation.Excludes.class
            java.util.Set r3 = r0.j(r3, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Collections.sort(r0)
            return r0
    }

    com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec b(javax.lang.model.element.TypeElement r14, java.util.Set<java.lang.String> r15) {
            r13 = this;
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.y(r14)
            java.util.List r1 = r13.f(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r15)
            java.util.Collections.sort(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r15 = r13.c(r0, r2, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r2 = r13.e(r2, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r1 = r13.d(r1)
            java.lang.String r3 = "applyOptions"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r3)
            r4 = 1
            javax.lang.model.element.Modifier[] r5 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r6 = javax.lang.model.element.Modifier.PUBLIC
            r7 = 0
            r5[r7] = r6
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.u(r5)
            java.lang.Class<java.lang.Override> r5 = java.lang.Override.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.n(r5)
            java.lang.String r6 = "Context"
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.String r9 = "android.content"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r6, r8)
            java.lang.String r8 = "context"
            javax.lang.model.element.Modifier[] r9 = new javax.lang.model.element.Modifier[r7]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r6, r8, r9)
            com.bumptech.glide.annotation.compiler.i r8 = r13.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = r8.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r6 = r6.e(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r6 = r6.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.v(r6)
            java.lang.String r6 = "GlideBuilder"
            java.lang.String[] r8 = new java.lang.String[r7]
            java.lang.String r9 = "com.bumptech.glide"
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r6, r8)
            java.lang.String r8 = "builder"
            javax.lang.model.element.Modifier[] r10 = new javax.lang.model.element.Modifier[r7]
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.j.a(r6, r8, r10)
            com.bumptech.glide.annotation.compiler.i r8 = r13.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = r8.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.j$b r6 = r6.e(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.j r6 = r6.i()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.v(r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r7] = r14
            java.lang.String r8 = "appGlideModule.applyOptions(context, builder)"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r3 = r3.y(r8, r6)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r3 = r3.C()
            java.lang.String r6 = "isManifestParsingEnabled"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r6)
            javax.lang.model.element.Modifier[] r8 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r10 = javax.lang.model.element.Modifier.PUBLIC
            r8[r7] = r10
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r6 = r6.u(r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r6 = r6.n(r5)
            java.lang.Class r8 = java.lang.Boolean.TYPE
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r6 = r6.G(r8)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r7] = r14
            java.lang.String r14 = "return appGlideModule.isManifestParsingEnabled()"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r14 = r6.y(r14, r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r14 = r14.C()
            java.lang.String r6 = "GeneratedAppGlideModuleImpl"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r6 = com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec.a(r6)
            javax.lang.model.element.Modifier[] r8 = new javax.lang.model.element.Modifier[r4]
            javax.lang.model.element.Modifier r10 = javax.lang.model.element.Modifier.FINAL
            r8[r7] = r10
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r6 = r6.x(r8)
            java.lang.Class<java.lang.SuppressWarnings> r8 = java.lang.SuppressWarnings.class
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.a.b(r8)
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = "deprecation"
            r10[r7] = r11
            java.lang.String r11 = "value"
            java.lang.String r12 = "$S"
            com.bumptech.glide.repackaged.com.squareup.javapoet.a$b r8 = r8.d(r11, r12, r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.a r8 = r8.f()
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r6 = r6.q(r8)
            java.lang.String r8 = "GeneratedAppGlideModule"
            java.lang.String[] r10 = new java.lang.String[r7]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r8 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r8, r10)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r6 = r6.C(r8)
            r8 = 2
            javax.lang.model.element.Modifier[] r8 = new javax.lang.model.element.Modifier[r8]
            javax.lang.model.element.Modifier r10 = javax.lang.model.element.Modifier.PRIVATE
            r8[r7] = r10
            javax.lang.model.element.Modifier r10 = javax.lang.model.element.Modifier.FINAL
            r8[r4] = r10
            java.lang.String r10 = "appGlideModule"
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r0 = r6.s(r0, r10, r8)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r15 = r0.v(r15)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r15 = r15.v(r3)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r15 = r15.v(r2)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r14 = r15.v(r14)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec$b r14 = r14.v(r1)
            java.lang.String r15 = "GeneratedRequestManagerFactory"
            java.lang.String[] r0 = new java.lang.String[r7]
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r15 = com.bumptech.glide.repackaged.com.squareup.javapoet.c.x(r9, r15, r0)
            java.lang.String r0 = "getRequestManagerFactory"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = com.bumptech.glide.repackaged.com.squareup.javapoet.i.f(r0)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.n(r5)
            com.bumptech.glide.annotation.compiler.i r1 = r13.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r1 = r1.J()
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.m(r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r0 = r0.F(r15)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r7] = r15
            java.lang.String r15 = "return new $T()"
            com.bumptech.glide.repackaged.com.squareup.javapoet.i$b r15 = r0.y(r15, r1)
            com.bumptech.glide.repackaged.com.squareup.javapoet.i r15 = r15.C()
            r14.v(r15)
            com.bumptech.glide.repackaged.com.squareup.javapoet.TypeSpec r14 = r14.B()
            return r14
    }
}
