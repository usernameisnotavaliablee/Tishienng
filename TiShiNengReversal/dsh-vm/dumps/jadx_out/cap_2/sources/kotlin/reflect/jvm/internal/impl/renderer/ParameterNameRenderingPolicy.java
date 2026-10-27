package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ParameterNameRenderingPolicy extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy ALL = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy NONE = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] r0 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[r0]
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy
            java.lang.String r1 = "ALL"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ALL = r0
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy
            java.lang.String r1 = "ONLY_NON_SYNTHESIZED"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED = r0
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = new kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy
            java.lang.String r1 = "NONE"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.NONE = r0
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.$ENTRIES = r0
            return
    }

    ParameterNameRenderingPolicy(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy> r0 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r1 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] values() {
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] r0 = kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[] r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy[]) r0
            return r0
    }
}
