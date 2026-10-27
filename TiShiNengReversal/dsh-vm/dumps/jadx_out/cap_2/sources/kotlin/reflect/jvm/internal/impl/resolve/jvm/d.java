package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class d {
    private final java.lang.String a;
    private kotlin.reflect.jvm.internal.impl.name.c b;

    private d(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 7
            a(r0)
        L6:
            r1.<init>()
            r1.a = r2
            return
    }

    private static /* synthetic */ void a(int r9) {
            r0 = 5
            r1 = 3
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            switch(r9) {
                case 8: goto Lc;
                case 9: goto Lc;
                case 10: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r9 == r1) goto L18
            if (r9 == r0) goto L18
            switch(r9) {
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                default: goto L16;
            }
        L16:
            r4 = 3
            goto L19
        L18:
            r4 = 2
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName"
            r6 = 0
            switch(r9) {
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L26;
                case 5: goto L2b;
                case 6: goto L26;
                case 7: goto L21;
                case 8: goto L2b;
                case 9: goto L2b;
                case 10: goto L2b;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L32
        L26:
            java.lang.String r7 = "fqName"
            r4[r6] = r7
            goto L32
        L2b:
            r4[r6] = r5
            goto L32
        L2e:
            java.lang.String r7 = "classId"
            r4[r6] = r7
        L32:
            java.lang.String r6 = "internalNameByClassId"
            java.lang.String r7 = "byFqNameWithoutInnerClasses"
            r8 = 1
            if (r9 == r1) goto L53
            if (r9 == r0) goto L50
            switch(r9) {
                case 8: goto L4b;
                case 9: goto L46;
                case 10: goto L41;
                default: goto L3e;
            }
        L3e:
            r4[r8] = r5
            goto L55
        L41:
            java.lang.String r5 = "getInternalName"
            r4[r8] = r5
            goto L55
        L46:
            java.lang.String r5 = "getPackageFqName"
            r4[r8] = r5
            goto L55
        L4b:
            java.lang.String r5 = "getFqNameForClassNameWithoutDollars"
            r4[r8] = r5
            goto L55
        L50:
            r4[r8] = r7
            goto L55
        L53:
            r4[r8] = r6
        L55:
            switch(r9) {
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L6c;
                case 4: goto L62;
                case 5: goto L6c;
                case 6: goto L62;
                case 7: goto L5d;
                case 8: goto L6c;
                case 9: goto L6c;
                case 10: goto L6c;
                default: goto L58;
            }
        L58:
            java.lang.String r5 = "byInternalName"
            r4[r3] = r5
            goto L6c
        L5d:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L6c
        L62:
            r4[r3] = r7
            goto L6c
        L65:
            r4[r3] = r6
            goto L6c
        L68:
            java.lang.String r5 = "byClassId"
            r4[r3] = r5
        L6c:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r9 == r1) goto L7d
            if (r9 == r0) goto L7d
            switch(r9) {
                case 8: goto L7d;
                case 9: goto L7d;
                case 10: goto L7d;
                default: goto L77;
            }
        L77:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L82
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L82:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.d b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r1) {
            if (r1 != 0) goto L6
            r0 = 1
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.d
            java.lang.String r1 = h(r1)
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.d c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            if (r4 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.d
            java.lang.String r1 = r4.a()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            r0.<init>(r1)
            r0.b = r4
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.d d(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            if (r1 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r0 = new kotlin.reflect.jvm.internal.impl.resolve.jvm.d
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r4) {
            if (r4 != 0) goto L6
            r0 = 2
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.name.c r0 = r4.f()
            kotlin.reflect.jvm.internal.impl.name.c r4 = r4.g()
            java.lang.String r4 = r4.a()
            r1 = 36
            r2 = 46
            java.lang.String r4 = r4.replace(r2, r1)
            boolean r1 = r0.c()
            if (r1 == 0) goto L21
            goto L3f
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.a()
            r3 = 47
            java.lang.String r0 = r0.replace(r2, r3)
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
        L3f:
            if (r4 != 0) goto L45
            r0 = 3
            a(r0)
        L45:
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c e() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = r4.a
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            java.lang.String r0 = r2.a
            kotlin.reflect.jvm.internal.impl.resolve.jvm.d r3 = (kotlin.reflect.jvm.internal.impl.resolve.jvm.d) r3
            java.lang.String r3 = r3.a
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String f() {
            r2 = this;
            java.lang.String r0 = r2.a
            if (r0 != 0) goto L9
            r1 = 10
            a(r1)
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c g() {
            r4 = this;
            java.lang.String r0 = r4.a
            java.lang.String r1 = "/"
            int r0 = r0.lastIndexOf(r1)
            r1 = -1
            if (r0 != r1) goto L15
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.name.c.d
            if (r0 != 0) goto L14
            r1 = 9
            a(r1)
        L14:
            return r0
        L15:
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = r4.a
            r3 = 0
            java.lang.String r0 = r2.substring(r3, r0)
            r2 = 47
            r3 = 46
            java.lang.String r0 = r0.replace(r2, r3)
            r1.<init>(r0)
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
