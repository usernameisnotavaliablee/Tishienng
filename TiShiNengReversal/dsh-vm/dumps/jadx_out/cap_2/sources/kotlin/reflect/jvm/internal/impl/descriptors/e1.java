package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface e1 {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.e1 a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements kotlin.reflect.jvm.internal.impl.descriptors.e1 {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void d(int r2) {
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1"
                r1 = 0
                r2[r1] = r0
                java.lang.String r0 = "getContainingFile"
                r1 = 1
                r2[r1] = r0
                java.lang.String r0 = "@NotNull method %s.%s must not return null"
                java.lang.String r2 = java.lang.String.format(r0, r2)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r2)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.e1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.f1 b() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.f1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.f1.a
                if (r0 != 0) goto L8
                r1 = 0
                d(r1)
            L8:
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "NO_SOURCE"
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.e1$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.e1$a
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.e1.a = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    kotlin.reflect.jvm.internal.impl.descriptors.f1 b();
}
