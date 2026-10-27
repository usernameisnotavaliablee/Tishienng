package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum RenderingFormat extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat HTML = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat PLAIN = null;



    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] $values() {
            r0 = 2
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] r0 = new kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[r0]
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat$b r0 = new kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat$b
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN = r0
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat$a
            java.lang.String r1 = "HTML"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML = r0
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.$ENTRIES = r0
            return
    }

    RenderingFormat(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ RenderingFormat(java.lang.String r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat> r0 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r1 = (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] values() {
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] r0 = kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[] r0 = (kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String escape(@org.jetbrains.annotations.NotNull java.lang.String r1);
}
