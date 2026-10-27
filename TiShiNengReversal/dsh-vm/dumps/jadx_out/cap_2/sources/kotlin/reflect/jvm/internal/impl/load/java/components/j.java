package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface j {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.j a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.load.java.components.j {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void f(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                switch(r3) {
                    case 1: goto L20;
                    case 2: goto L1b;
                    case 3: goto L16;
                    case 4: goto L1b;
                    case 5: goto L11;
                    case 6: goto L1b;
                    case 7: goto Lc;
                    case 8: goto L1b;
                    default: goto L7;
                }
            L7:
                java.lang.String r2 = "fqName"
                r0[r1] = r2
                goto L24
            Lc:
                java.lang.String r2 = "javaClass"
                r0[r1] = r2
                goto L24
            L11:
                java.lang.String r2 = "field"
                r0[r1] = r2
                goto L24
            L16:
                java.lang.String r2 = "element"
                r0[r1] = r2
                goto L24
            L1b:
                java.lang.String r2 = "descriptor"
                r0[r1] = r2
                goto L24
            L20:
                java.lang.String r2 = "member"
                r0[r1] = r2
            L24:
                r1 = 1
                java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1"
                r0[r1] = r2
                r1 = 2
                switch(r3) {
                    case 1: goto L41;
                    case 2: goto L41;
                    case 3: goto L3c;
                    case 4: goto L3c;
                    case 5: goto L37;
                    case 6: goto L37;
                    case 7: goto L32;
                    case 8: goto L32;
                    default: goto L2d;
                }
            L2d:
                java.lang.String r3 = "getClassResolvedFromSource"
                r0[r1] = r3
                goto L45
            L32:
                java.lang.String r3 = "recordClass"
                r0[r1] = r3
                goto L45
            L37:
                java.lang.String r3 = "recordField"
                r0[r1] = r3
                goto L45
            L3c:
                java.lang.String r3 = "recordConstructor"
                r0[r1] = r3
                goto L45
            L41:
                java.lang.String r3 = "recordMethod"
                r0[r1] = r3
            L45:
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void a(@org.jetbrains.annotations.NotNull x3.n r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 5
                f(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 6
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void b(@org.jetbrains.annotations.NotNull x3.l r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 3
                f(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 4
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        @org.jetbrains.annotations.Nullable
        public kotlin.reflect.jvm.internal.impl.descriptors.d c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 0
                f(r1)
            L6:
                r1 = 0
                return r1
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void d(@org.jetbrains.annotations.NotNull x3.q r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 1
                f(r1)
            L6:
                if (r2 != 0) goto Lc
                r1 = 2
                f(r1)
            Lc:
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.j
        public void e(@org.jetbrains.annotations.NotNull x3.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
                r0 = this;
                if (r1 != 0) goto L6
                r1 = 7
                f(r1)
            L6:
                if (r2 != 0) goto Ld
                r1 = 8
                f(r1)
            Ld:
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.components.j$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.j$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.components.j.a = r0
            return
    }

    void a(@org.jetbrains.annotations.NotNull x3.n r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r2);

    void b(@org.jetbrains.annotations.NotNull x3.l r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j r2);

    @org.jetbrains.annotations.Nullable
    kotlin.reflect.jvm.internal.impl.descriptors.d c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);

    void d(@org.jetbrains.annotations.NotNull x3.q r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d1 r2);

    void e(@org.jetbrains.annotations.NotNull x3.g r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2);
}
