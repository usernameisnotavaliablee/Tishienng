package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDescriptorRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,331:1\n3829#2:332\n4344#2,2:333\n*S KotlinDebug\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n*L\n325#1:332\n325#1:333,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum DescriptorRendererModifier extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier ACTUAL = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> ALL = null;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier ANNOTATIONS = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier CONST = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.a Companion = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier DATA = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier EXPECT = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier FUN = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier INLINE = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier INNER = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier LATEINIT = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier MEMBER_KIND = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier MODALITY = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier OVERRIDE = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier VALUE = null;
    public static final kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier VISIBILITY = null;
    private final boolean includeByDefault;

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
    }

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] $values() {
            r0 = 14
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[r0]
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VISIBILITY
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MODALITY
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.OVERRIDE
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INNER
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MEMBER_KIND
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.DATA
            r2 = 6
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INLINE
            r2 = 7
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.EXPECT
            r2 = 8
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ACTUAL
            r2 = 9
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.CONST
            r2 = 10
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.LATEINIT
            r2 = 11
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.FUN
            r2 = 12
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VALUE
            r2 = 13
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "VISIBILITY"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VISIBILITY = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "MODALITY"
            r0.<init>(r1, r3, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MODALITY = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "OVERRIDE"
            r4 = 2
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.OVERRIDE = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "ANNOTATIONS"
            r4 = 3
            r0.<init>(r1, r4, r2)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ANNOTATIONS = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "INNER"
            r4 = 4
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INNER = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "MEMBER_KIND"
            r4 = 5
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.MEMBER_KIND = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "DATA"
            r4 = 6
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.DATA = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "INLINE"
            r4 = 7
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.INLINE = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "EXPECT"
            r4 = 8
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.EXPECT = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "ACTUAL"
            r4 = 9
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ACTUAL = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "CONST"
            r4 = 10
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.CONST = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "LATEINIT"
            r4 = 11
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.LATEINIT = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "FUN"
            r4 = 12
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.FUN = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier
            java.lang.String r1 = "VALUE"
            r4 = 13
            r0.<init>(r1, r4, r3)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.VALUE = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.$ENTRIES = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$a r0 = new kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.Companion = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = values()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r0.length
        Lb0:
            if (r2 >= r3) goto Lbe
            r4 = r0[r2]
            boolean r5 = r4.includeByDefault
            if (r5 == 0) goto Lbb
            r1.add(r4)
        Lbb:
            int r2 = r2 + 1
            goto Lb0
        Lbe:
            java.util.Set r0 = kotlin.collections.f0.f6(r1)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS = r0
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = values()
            java.util.Set r0 = kotlin.collections.n.Fz(r0)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.ALL = r0
            return
    }

    DescriptorRendererModifier(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.includeByDefault = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier> r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier r1 = (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] values() {
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[] r0 = (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier[]) r0
            return r0
    }
}
