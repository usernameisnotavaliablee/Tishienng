package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class e0 implements x3.x {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 a(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r4) {
                r3 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r4 instanceof java.lang.Class
                if (r0 == 0) goto L18
                r1 = r4
                java.lang.Class r1 = (java.lang.Class) r1
                boolean r2 = r1.isPrimitive()
                if (r2 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c0 r4 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c0
                r4.<init>(r1)
                return r4
            L18:
                boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
                if (r1 != 0) goto L3a
                if (r0 == 0) goto L28
                r0 = r4
                java.lang.Class r0 = (java.lang.Class) r0
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L28
                goto L3a
            L28:
                boolean r0 = r4 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto L34
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h0
                java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
                r0.<init>(r4)
                return r0
            L34:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s
                r0.<init>(r4)
                return r0
            L3a:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m
                r0.<init>(r4)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0.a = r0
            return
    }

    public e0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.reflect.Type M();

    @org.jetbrains.annotations.Nullable
    public x3.a b(kotlin.reflect.jvm.internal.impl.name.c r5) {
            r4 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Collection r0 = r4.getAnnotations()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            r3 = r1
            x3.a r3 = (x3.a) r3
            kotlin.reflect.jvm.internal.impl.name.b r3 = r3.c()
            if (r3 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.name.c r2 = r3.a()
        L27:
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r5)
            if (r2 == 0) goto Lf
            r2 = r1
        L2e:
            x3.a r2 = (x3.a) r2
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0
            if (r0 == 0) goto L16
            java.lang.reflect.Type r0 = r1.M()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e0) r2
            java.lang.reflect.Type r2 = r2.M()
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.M()
            int r0 = r0.hashCode()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.M()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
