package kotlin.reflect.jvm.internal.impl.incremental.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ScopeKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind CLASSIFIER = null;
    public static final kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind PACKAGE = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] $values() {
            r0 = 2
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] r0 = new kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[r0]
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r1 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.PACKAGE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r1 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.CLASSIFIER
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r0 = new kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind
            java.lang.String r1 = "PACKAGE"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.PACKAGE = r0
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r0 = new kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind
            java.lang.String r1 = "CLASSIFIER"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.CLASSIFIER = r0
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.$ENTRIES = r0
            return
    }

    ScopeKind(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind> r0 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind r1 = (kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] values() {
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] r0 = kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[] r0 = (kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind[]) r0
            return r0
    }
}
