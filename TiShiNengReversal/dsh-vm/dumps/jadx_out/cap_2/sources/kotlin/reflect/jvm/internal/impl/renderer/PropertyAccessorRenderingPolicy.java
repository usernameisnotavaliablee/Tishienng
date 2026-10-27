package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum PropertyAccessorRenderingPolicy extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy DEBUG = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy NONE = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy PRETTY = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] r0 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[r0]
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.PRETTY
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy
            java.lang.String r1 = "PRETTY"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.PRETTY = r0
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy
            java.lang.String r1 = "DEBUG"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.DEBUG = r0
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.NONE = r0
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.$ENTRIES = r0
            return
    }

    PropertyAccessorRenderingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy> r0 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy r1 = (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] values() {
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] r0 = kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[] r0 = (kotlin.reflect.jvm.internal.impl.renderer.PropertyAccessorRenderingPolicy[]) r0
            return r0
    }
}
