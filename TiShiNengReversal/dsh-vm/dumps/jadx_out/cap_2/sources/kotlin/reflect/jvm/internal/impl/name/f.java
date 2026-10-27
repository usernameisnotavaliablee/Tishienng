package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.name.f> {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String a;
    private final boolean b;

    private f(@org.jetbrains.annotations.NotNull java.lang.String r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    private static /* synthetic */ void a(int r9) {
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
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
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/name/Name"
            r7 = 0
            if (r9 == r3) goto L2e
            if (r9 == r2) goto L2e
            if (r9 == r1) goto L2e
            if (r9 == r0) goto L2e
            java.lang.String r8 = "name"
            r5[r7] = r8
            goto L30
        L2e:
            r5[r7] = r6
        L30:
            if (r9 == r3) goto L45
            if (r9 == r2) goto L40
            if (r9 == r1) goto L3b
            if (r9 == r0) goto L3b
            r5[r3] = r6
            goto L49
        L3b:
            java.lang.String r6 = "asStringStripSpecialMarkers"
            r5[r3] = r6
            goto L49
        L40:
            java.lang.String r6 = "getIdentifier"
            r5[r3] = r6
            goto L49
        L45:
            java.lang.String r6 = "asString"
            r5[r3] = r6
        L49:
            switch(r9) {
                case 1: goto L69;
                case 2: goto L69;
                case 3: goto L69;
                case 4: goto L69;
                case 5: goto L65;
                case 6: goto L60;
                case 7: goto L5b;
                case 8: goto L56;
                case 9: goto L51;
                default: goto L4c;
            }
        L4c:
            java.lang.String r6 = "<init>"
            r5[r2] = r6
            goto L69
        L51:
            java.lang.String r6 = "guessByFirstCharacter"
            r5[r2] = r6
            goto L69
        L56:
            java.lang.String r6 = "special"
            r5[r2] = r6
            goto L69
        L5b:
            java.lang.String r6 = "identifierIfValid"
            r5[r2] = r6
            goto L69
        L60:
            java.lang.String r6 = "isValidIdentifier"
            r5[r2] = r6
            goto L69
        L65:
            java.lang.String r6 = "identifier"
            r5[r2] = r6
        L69:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r9 == r3) goto L7b
            if (r9 == r2) goto L7b
            if (r9 == r1) goto L7b
            if (r9 == r0) goto L7b
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r4)
            goto L80
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r4)
        L80:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.name.f d(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            if (r1 != 0) goto L7
            r0 = 9
            a(r0)
        L7:
            java.lang.String r0 = "<"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L14
            kotlin.reflect.jvm.internal.impl.name.f r1 = k(r1)
            return r1
        L14:
            kotlin.reflect.jvm.internal.impl.name.f r1 = h(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.name.f h(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            if (r2 != 0) goto L6
            r0 = 5
            a(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.name.f r0 = new kotlin.reflect.jvm.internal.impl.name.f
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static boolean j(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            if (r4 != 0) goto L6
            r0 = 6
            a(r0)
        L6:
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 != 0) goto L34
            java.lang.String r0 = "<"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L16
            goto L34
        L16:
            r0 = 0
        L17:
            int r2 = r4.length()
            if (r0 >= r2) goto L32
            char r2 = r4.charAt(r0)
            r3 = 46
            if (r2 == r3) goto L31
            r3 = 47
            if (r2 == r3) goto L31
            r3 = 92
            if (r2 != r3) goto L2e
            goto L31
        L2e:
            int r0 = r0 + 1
            goto L17
        L31:
            return r1
        L32:
            r4 = 1
            return r4
        L34:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.name.f k(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            if (r3 != 0) goto L7
            r0 = 8
            a(r0)
        L7:
            java.lang.String r0 = "<"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.name.f r0 = new kotlin.reflect.jvm.internal.impl.name.f
            r1 = 1
            r0.<init>(r3, r1)
            return r0
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "special name must start with '<': "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String b() {
            r2 = this;
            java.lang.String r0 = r2.a
            if (r0 != 0) goto L8
            r1 = 1
            a(r1)
        L8:
            return r0
    }

    public int c(kotlin.reflect.jvm.internal.impl.name.f r2) {
            r1 = this;
            java.lang.String r0 = r1.a
            java.lang.String r2 = r2.a
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.reflect.jvm.internal.impl.name.f r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            int r1 = r0.c(r1)
            return r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.name.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.name.f r5 = (kotlin.reflect.jvm.internal.impl.name.f) r5
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.a
            java.lang.String r5 = r5.a
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getIdentifier() {
            r3 = this;
            boolean r0 = r3.b
            if (r0 != 0) goto Lf
            java.lang.String r0 = r3.b()
            if (r0 != 0) goto Le
            r1 = 2
            a(r1)
        Le:
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not identifier: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    public boolean i() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
