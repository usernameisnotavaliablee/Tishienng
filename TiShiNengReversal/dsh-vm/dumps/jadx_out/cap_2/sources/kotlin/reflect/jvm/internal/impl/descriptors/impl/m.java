package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class m extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements kotlin.reflect.jvm.internal.impl.descriptors.k {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f b;

    public m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            r1.<init>(r2)
            r1.b = r3
            return
    }

    private static /* synthetic */ void T(int r9) {
            r0 = 6
            r1 = 5
            r2 = 3
            r3 = 2
            if (r9 == r3) goto Lf
            if (r9 == r2) goto Lf
            if (r9 == r1) goto Lf
            if (r9 == r0) goto Lf
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L11
        Lf:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L11:
            if (r9 == r3) goto L1b
            if (r9 == r2) goto L1b
            if (r9 == r1) goto L1b
            if (r9 == r0) goto L1b
            r5 = 3
            goto L1c
        L1b:
            r5 = 2
        L1c:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl"
            r7 = 0
            switch(r9) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2e;
                case 4: goto L29;
                case 5: goto L2e;
                case 6: goto L2e;
                default: goto L24;
            }
        L24:
            java.lang.String r8 = "annotations"
            r5[r7] = r8
            goto L35
        L29:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L35
        L2e:
            r5[r7] = r6
            goto L35
        L31:
            java.lang.String r8 = "name"
            r5[r7] = r8
        L35:
            java.lang.String r7 = "toString"
            r8 = 1
            if (r9 == r3) goto L4b
            if (r9 == r2) goto L46
            if (r9 == r1) goto L43
            if (r9 == r0) goto L43
            r5[r8] = r6
            goto L4f
        L43:
            r5[r8] = r7
            goto L4f
        L46:
            java.lang.String r6 = "getOriginal"
            r5[r8] = r6
            goto L4f
        L4b:
            java.lang.String r6 = "getName"
            r5[r8] = r6
        L4f:
            if (r9 == r3) goto L61
            if (r9 == r2) goto L61
            r6 = 4
            if (r9 == r6) goto L5f
            if (r9 == r1) goto L61
            if (r9 == r0) goto L61
            java.lang.String r6 = "<init>"
            r5[r3] = r6
            goto L61
        L5f:
            r5[r3] = r7
        L61:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r9 == r3) goto L73
            if (r9 == r2) goto L73
            if (r9 == r1) goto L73
            if (r9 == r0) goto L73
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            goto L78
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
        L78:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2) {
            if (r2 != 0) goto L6
            r0 = 4
            T(r0)
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r0.<init>()     // Catch: java.lang.Throwable -> L44
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = kotlin.reflect.jvm.internal.impl.renderer.m.k     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.N(r2)     // Catch: java.lang.Throwable -> L44
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "["
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L44
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "@"
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            int r1 = java.lang.System.identityHashCode(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Throwable -> L44
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "]"
            r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L43
            r0 = 5
            T(r0)
        L43:
            return r2
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L6b
            r0 = 6
            T(r0)
        L6b:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r0 = this;
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.b
            if (r0 != 0) goto L8
            r1 = 2
            T(r1)
        L8:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = o0(r1)
            return r0
    }
}
