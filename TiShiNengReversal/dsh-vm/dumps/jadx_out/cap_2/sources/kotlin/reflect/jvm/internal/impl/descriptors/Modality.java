package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum Modality extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.descriptors.Modality> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.Modality[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality ABSTRACT = null;

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality.a Companion = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality FINAL = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality OPEN = null;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Modality SEALED = null;

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
        public final kotlin.reflect.jvm.internal.impl.descriptors.Modality a(boolean r1, boolean r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L5
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
                return r1
            L5:
                if (r2 == 0) goto La
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
                return r1
            La:
                if (r3 == 0) goto Lf
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
                return r1
            Lf:
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
                return r1
        }
    }

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.Modality[] $values() {
            r0 = 4
            kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality[r0]
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            r2 = 3
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality
            java.lang.String r1 = "FINAL"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL = r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality
            java.lang.String r1 = "SEALED"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED = r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality
            java.lang.String r1 = "OPEN"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN = r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality
            java.lang.String r1 = "ABSTRACT"
            r2 = 3
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT = r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.$ENTRIES = r0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.Modality$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality.Companion = r0
            return
    }

    Modality(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.Modality valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.Modality> r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r1 = (kotlin.reflect.jvm.internal.impl.descriptors.Modality) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.Modality[] values() {
            kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = (kotlin.reflect.jvm.internal.impl.descriptors.Modality[]) r0
            return r0
    }
}
