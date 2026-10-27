package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h implements x3.b {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h.a b = null;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.f a;

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
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h a(@org.jetbrains.annotations.NotNull java.lang.Object r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r3) {
                r1 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Class r0 = r2.getClass()
                boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.l(r0)
                if (r0 == 0) goto L17
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.v
                java.lang.Enum r2 = (java.lang.Enum) r2
                r0.<init>(r3, r2)
                return r0
            L17:
                boolean r0 = r2 instanceof java.lang.annotation.Annotation
                if (r0 == 0) goto L23
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.i r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.i
                java.lang.annotation.Annotation r2 = (java.lang.annotation.Annotation) r2
                r0.<init>(r3, r2)
                return r0
            L23:
                boolean r0 = r2 instanceof java.lang.Object[]
                if (r0 == 0) goto L2f
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                r0.<init>(r3, r2)
                return r0
            L2f:
                boolean r0 = r2 instanceof java.lang.Class
                if (r0 == 0) goto L3b
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r
                java.lang.Class r2 = (java.lang.Class) r2
                r0.<init>(r3, r2)
                return r0
            L3b:
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x
                r0.<init>(r3, r2)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.h.b = r0
            return
    }

    private h(kotlin.reflect.jvm.internal.impl.name.f r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public /* synthetic */ h(kotlin.reflect.jvm.internal.impl.name.f r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.a
            return r0
    }
}
