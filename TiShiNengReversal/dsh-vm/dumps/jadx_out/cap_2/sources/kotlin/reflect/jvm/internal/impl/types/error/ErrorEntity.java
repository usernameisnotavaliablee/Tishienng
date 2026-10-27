package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ErrorEntity extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_FUNCTION = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_MODULE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_PROPERTY = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity ERROR_TYPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity PARENT_OF_ERROR_SCOPE = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String debugText;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] $values() {
            r0 = 7
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[r0]
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_FUNCTION
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_SCOPE
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_MODULE
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_PROPERTY
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_TYPE
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.PARENT_OF_ERROR_SCOPE
            r2 = 6
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 0
            java.lang.String r2 = "<Error class: %s>"
            java.lang.String r3 = "ERROR_CLASS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_CLASS = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 1
            java.lang.String r2 = "<Error function>"
            java.lang.String r3 = "ERROR_FUNCTION"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_FUNCTION = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 2
            java.lang.String r2 = "<Error scope>"
            java.lang.String r3 = "ERROR_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 3
            java.lang.String r2 = "<Error module>"
            java.lang.String r3 = "ERROR_MODULE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_MODULE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 4
            java.lang.String r2 = "<Error property>"
            java.lang.String r3 = "ERROR_PROPERTY"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_PROPERTY = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 5
            java.lang.String r2 = "[Error type: %s]"
            java.lang.String r3 = "ERROR_TYPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_TYPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity
            r1 = 6
            java.lang.String r2 = "<Fake parent for error lexical scope>"
            java.lang.String r3 = "PARENT_OF_ERROR_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.PARENT_OF_ERROR_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.$ENTRIES = r0
            return
    }

    ErrorEntity(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.debugText = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity> r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r1 = (kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] values() {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[] r0 = (kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDebugText() {
            r1 = this;
            java.lang.String r0 = r1.debugText
            return r0
    }
}
