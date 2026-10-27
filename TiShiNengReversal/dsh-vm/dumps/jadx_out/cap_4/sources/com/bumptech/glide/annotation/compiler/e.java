package com.bumptech.glide.annotation.compiler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class e {
    private final javax.annotation.processing.ProcessingEnvironment a;
    private final com.bumptech.glide.annotation.compiler.i b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.repackaged.com.google.common.base.a<javax.lang.model.element.AnnotationMirror, java.lang.String> {
        final /* synthetic */ com.bumptech.glide.annotation.compiler.e a;

        a(com.bumptech.glide.annotation.compiler.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public java.lang.String a(javax.lang.model.element.AnnotationMirror r1) {
                r0 = this;
                javax.lang.model.type.DeclaredType r1 = r1.getAnnotationType()
                javax.lang.model.element.Element r1 = r1.asElement()
                java.lang.String r1 = r1.toString()
                return r1
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.base.a
        public /* bridge */ /* synthetic */ java.lang.String apply(javax.lang.model.element.AnnotationMirror r1) {
                r0 = this;
                javax.lang.model.element.AnnotationMirror r1 = (javax.lang.model.element.AnnotationMirror) r1
                java.lang.String r1 = r0.a(r1)
                return r1
        }
    }

    e(javax.annotation.processing.ProcessingEnvironment r1, com.bumptech.glide.annotation.compiler.i r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    private static java.util.List<java.lang.String> a(javax.lang.model.element.ExecutableElement r1, boolean r2) {
            java.util.List r1 = r1.getParameters()
            if (r2 == 0) goto Lf
            r2 = 1
            int r0 = r1.size()
            java.util.List r1 = r1.subList(r2, r0)
        Lf:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = r1.size()
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r1.next()
            javax.lang.model.element.VariableElement r0 = (javax.lang.model.element.VariableElement) r0
            javax.lang.model.type.TypeMirror r0 = r0.asType()
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            goto L1c
        L34:
            return r2
    }

    private static java.lang.String b(javax.lang.model.element.Element r0) {
            javax.lang.model.element.Element r0 = r0.getEnclosingElement()
            java.lang.String r0 = r0.toString()
            return r0
    }

    private java.lang.String c(javax.lang.model.element.ExecutableElement r3) {
            r2 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r2.b
            java.lang.Class<com.bumptech.glide.annotation.GlideType> r1 = com.bumptech.glide.annotation.GlideType.class
            java.util.Set r3 = r0.j(r3, r1)
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    private static java.lang.String d(javax.lang.model.element.Element r0) {
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static java.lang.String e(javax.lang.model.element.ExecutableElement r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = b(r2)
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r2 = d(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static boolean f(javax.lang.model.type.TypeMirror r1) {
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "com.bumptech.glide.request.BaseRequestOptions<?>"
            boolean r1 = r1.equals(r0)
            return r1
    }

    private boolean g(javax.lang.model.element.ExecutableElement r8) {
            r7 = this;
            javax.annotation.processing.ProcessingEnvironment r0 = r7.a
            javax.lang.model.util.Elements r0 = r0.getElementUtils()
            java.lang.String r1 = "com.bumptech.glide.request.BaseRequestOptions"
            javax.lang.model.element.TypeElement r0 = r0.getTypeElement(r1)
            r1 = 1
            java.util.List r2 = a(r8, r1)
            javax.lang.model.element.Name r8 = r8.getSimpleName()
            java.lang.String r8 = r8.toString()
            java.util.List r0 = r0.getEnclosedElements()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L52
            java.lang.Object r3 = r0.next()
            javax.lang.model.element.Element r3 = (javax.lang.model.element.Element) r3
            javax.lang.model.element.ElementKind r5 = r3.getKind()
            javax.lang.model.element.ElementKind r6 = javax.lang.model.element.ElementKind.METHOD
            if (r5 == r6) goto L37
            goto L21
        L37:
            javax.lang.model.element.ExecutableElement r3 = (javax.lang.model.element.ExecutableElement) r3
            javax.lang.model.element.Name r5 = r3.getSimpleName()
            java.lang.String r5 = r5.toString()
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L21
            java.util.List r3 = a(r3, r4)
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L21
            return r1
        L52:
            return r4
    }

    private boolean h(javax.lang.model.type.TypeMirror r2) {
            r1 = this;
            javax.annotation.processing.ProcessingEnvironment r0 = r1.a
            javax.lang.model.util.Types r0 = r0.getTypeUtils()
            javax.lang.model.type.TypeMirror r2 = r0.erasure(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "com.bumptech.glide.RequestBuilder"
            boolean r2 = r2.equals(r0)
            return r2
    }

    private boolean i(javax.lang.model.type.TypeMirror r4, javax.lang.model.element.ExecutableElement r5) {
            r3 = this;
            boolean r0 = r4 instanceof javax.lang.model.type.DeclaredType
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.lang.model.type.DeclaredType r4 = (javax.lang.model.type.DeclaredType) r4
            java.util.List r4 = r4.getTypeArguments()
            int r0 = r4.size()
            r2 = 1
            if (r0 == r2) goto L14
            return r1
        L14:
            java.lang.Object r4 = r4.get(r1)
            javax.lang.model.type.TypeMirror r4 = (javax.lang.model.type.TypeMirror) r4
            java.lang.String r5 = r3.c(r5)
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r5)
            return r4
    }

    private void j(javax.lang.model.element.ExecutableElement r4) {
            r3 = this;
            java.util.List r0 = r4.getAnnotationMirrors()
            com.bumptech.glide.repackaged.com.google.common.collect.j r0 = com.bumptech.glide.repackaged.com.google.common.collect.j.e(r0)
            com.bumptech.glide.annotation.compiler.e$a r1 = new com.bumptech.glide.annotation.compiler.e$a
            r1.<init>(r3)
            com.bumptech.glide.repackaged.com.google.common.collect.j r0 = r0.m(r1)
            com.bumptech.glide.repackaged.com.google.common.collect.ImmutableSet r0 = r0.j()
            java.util.List r1 = com.bumptech.glide.annotation.compiler.i.K()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r2 = (com.bumptech.glide.repackaged.com.squareup.javapoet.c) r2
            java.lang.String r2 = r2.F()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L1d
            return
        L34:
            javax.annotation.processing.ProcessingEnvironment r0 = r3.a
            javax.annotation.processing.Messager r0 = r0.getMessager()
            javax.tools.Diagnostic$Kind r1 = javax.tools.Diagnostic.Kind.WARNING
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = e(r4)
            r2.append(r4)
            java.lang.String r4 = " is missing the "
            r2.append(r4)
            com.bumptech.glide.annotation.compiler.i r4 = r3.b
            com.bumptech.glide.repackaged.com.squareup.javapoet.c r4 = r4.J()
            java.lang.String r4 = r4.F()
            r2.append(r4)
            java.lang.String r4 = " annotation, please add it to ensure that your extension methods are always returning non-null values"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.printMessage(r1, r4)
            return
    }

    private static void l(javax.lang.model.element.Element r3) {
            java.util.Set r0 = r3.getModifiers()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.PRIVATE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L35
            r0 = r3
            javax.lang.model.element.ExecutableElement r0 = (javax.lang.model.element.ExecutableElement) r0
            java.util.List r0 = r0.getParameters()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RequestOptionsExtensions must be public, with private constructors and only static methods. Found parameters in the constructor of: "
            r1.append(r2)
            java.lang.String r3 = b(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RequestOptionsExtensions must be public, with private constructors and only static methods. Found a non-private constructor in: "
            r1.append(r2)
            java.lang.String r3 = b(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void m(javax.lang.model.element.ExecutableElement r5) {
            r4 = this;
            r4.n(r5)
            p(r5)
            javax.lang.model.type.TypeMirror r0 = r5.getReturnType()
            boolean r1 = f(r0)
            if (r1 == 0) goto L14
            r4.o(r5)
            return
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@GlideOption methods should return a BaseRequestOptions<?> object, but "
            r2.append(r3)
            java.lang.String r5 = e(r5)
            r2.append(r5)
            java.lang.String r5 = " returns "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ". If you're using old style @GlideOption methods, your method may have a void return type, but doing so is deprecated and support will be removed in a future version"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private void n(javax.lang.model.element.ExecutableElement r1) {
            r0 = this;
            r0.j(r1)
            return
    }

    private void o(javax.lang.model.element.ExecutableElement r4) {
            r3 = this;
            com.bumptech.glide.annotation.compiler.i r0 = r3.b
            int r0 = r0.x(r4)
            boolean r1 = r3.g(r4)
            if (r1 == 0) goto L2a
            if (r0 == 0) goto Lf
            goto L2a
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Accidentally attempting to override a method in BaseRequestOptions. Add an 'override' value in the @GlideOption annotation if this is intentional. Offending method: "
            r1.append(r2)
            java.lang.String r4 = e(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2a:
            if (r1 != 0) goto L4a
            if (r0 != 0) goto L2f
            goto L4a
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested to override an existing method in BaseRequestOptions, but no such method was found. Offending method: "
            r1.append(r2)
            java.lang.String r4 = e(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L4a:
            return
    }

    private static void p(javax.lang.model.element.ExecutableElement r4) {
            java.util.List r0 = r4.getParameters()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            java.util.List r0 = r4.getParameters()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javax.lang.model.element.VariableElement r0 = (javax.lang.model.element.VariableElement) r0
            javax.lang.model.type.TypeMirror r0 = r0.asType()
            boolean r1 = f(r0)
            if (r1 == 0) goto L20
            return
        L20:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@GlideOption methods must take a BaseRequestOptions<?> object as their first parameter, but the first parameter in "
            r2.append(r3)
            java.lang.String r4 = e(r4)
            r2.append(r4)
            java.lang.String r4 = " is "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@GlideOption methods must take a BaseRequestOptions<?> object as their first parameter, but "
            r1.append(r2)
            java.lang.String r4 = e(r4)
            r1.append(r4)
            java.lang.String r4 = " has none"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private void q(javax.lang.model.element.ExecutableElement r6) {
            r5 = this;
            javax.lang.model.type.TypeMirror r0 = r6.getReturnType()
            r5.r(r6)
            boolean r1 = r5.h(r0)
            if (r1 == 0) goto L17
            boolean r1 = r5.i(r0, r6)
            if (r1 == 0) goto L17
            s(r6)
            return
        L17:
            java.lang.String r1 = r5.c(r6)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "@GlideType methods should return a RequestBuilder<"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "> object, but "
            r3.append(r1)
            java.lang.String r6 = e(r6)
            r3.append(r6)
            java.lang.String r6 = " returns: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = ". If you're using old style @GlideType methods, your method may have a void return type, but doing so is deprecated and support will be removed in a future version"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
    }

    private void r(javax.lang.model.element.ExecutableElement r1) {
            r0 = this;
            r0.j(r1)
            return
    }

    private static void s(javax.lang.model.element.ExecutableElement r4) {
            java.util.List r0 = r4.getParameters()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L4a
            java.util.List r0 = r4.getParameters()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javax.lang.model.element.VariableElement r0 = (javax.lang.model.element.VariableElement) r0
            javax.lang.model.type.TypeMirror r0 = r0.asType()
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "com.bumptech.glide.RequestBuilder"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L27
            return
        L27:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@GlideType methods must take a RequestBuilder object as their first and only parameter, but given: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for: "
            r2.append(r0)
            java.lang.String r4 = e(r4)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@GlideType methods must take a RequestBuilder object as their first and only parameter, but given multiple for: "
            r1.append(r2)
            java.lang.String r4 = e(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    void k(javax.lang.model.element.TypeElement r4) {
            r3 = this;
            java.util.Set r0 = r4.getModifiers()
            javax.lang.model.element.Modifier r1 = javax.lang.model.element.Modifier.PUBLIC
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L4f
            java.util.List r4 = r4.getEnclosedElements()
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r4.next()
            javax.lang.model.element.Element r0 = (javax.lang.model.element.Element) r0
            javax.lang.model.element.ElementKind r1 = r0.getKind()
            javax.lang.model.element.ElementKind r2 = javax.lang.model.element.ElementKind.CONSTRUCTOR
            if (r1 != r2) goto L2c
            l(r0)
            goto L14
        L2c:
            javax.lang.model.element.ElementKind r1 = r0.getKind()
            javax.lang.model.element.ElementKind r2 = javax.lang.model.element.ElementKind.METHOD
            if (r1 != r2) goto L14
            javax.lang.model.element.ExecutableElement r0 = (javax.lang.model.element.ExecutableElement) r0
            java.lang.Class<com.bumptech.glide.annotation.GlideOption> r1 = com.bumptech.glide.annotation.GlideOption.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            if (r1 == 0) goto L42
            r3.m(r0)
            goto L14
        L42:
            java.lang.Class<com.bumptech.glide.annotation.GlideType> r1 = com.bumptech.glide.annotation.GlideType.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            if (r1 == 0) goto L14
            r3.q(r0)
            goto L14
        L4e:
            return
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RequestOptionsExtensions must be public, including: "
            r1.append(r2)
            java.lang.String r4 = d(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
