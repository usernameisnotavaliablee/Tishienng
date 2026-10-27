package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum ErrorScopeKind extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind CAPTURED_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind ERASED_RECEIVER_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind ERROR_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind INTEGER_LITERAL_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind NON_CLASSIFIER_SUPER_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ABBREVIATION_TYPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ERROR_CLASS = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind STUB_TYPE_SCOPE = null;
    public static final kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind UNSUPPORTED_TYPE_SCOPE = null;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String debugMessage;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] $values() {
            r0 = 10
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[r0]
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.CAPTURED_TYPE_SCOPE
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERASED_RECEIVER_TYPE_SCOPE
            r2 = 2
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE
            r2 = 3
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.STUB_TYPE_SCOPE
            r2 = 4
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.NON_CLASSIFIER_SUPER_TYPE_SCOPE
            r2 = 5
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERROR_TYPE_SCOPE
            r2 = 6
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.UNSUPPORTED_TYPE_SCOPE
            r2 = 7
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS
            r2 = 8
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE
            r2 = 9
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 0
            java.lang.String r2 = "No member resolution should be done on captured type, it used only during constraint system resolution"
            java.lang.String r3 = "CAPTURED_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.CAPTURED_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 1
            java.lang.String r2 = "Scope for integer literal type (%s)"
            java.lang.String r3 = "INTEGER_LITERAL_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 2
            java.lang.String r2 = "Error scope for erased receiver type"
            java.lang.String r3 = "ERASED_RECEIVER_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERASED_RECEIVER_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 3
            java.lang.String r2 = "Scope for abbreviation %s"
            java.lang.String r3 = "SCOPE_FOR_ABBREVIATION_TYPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 4
            java.lang.String r2 = "Scope for stub type %s"
            java.lang.String r3 = "STUB_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.STUB_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 5
            java.lang.String r2 = "A scope for common supertype which is not a normal classifier"
            java.lang.String r3 = "NON_CLASSIFIER_SUPER_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.NON_CLASSIFIER_SUPER_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 6
            java.lang.String r2 = "Scope for error type %s"
            java.lang.String r3 = "ERROR_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.ERROR_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 7
            java.lang.String r2 = "Scope for unsupported type %s"
            java.lang.String r3 = "UNSUPPORTED_TYPE_SCOPE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.UNSUPPORTED_TYPE_SCOPE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 8
            java.lang.String r2 = "Error scope for class %s with arguments: %s"
            java.lang.String r3 = "SCOPE_FOR_ERROR_CLASS"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r0 = new kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind
            r1 = 9
            java.lang.String r2 = "Error resolution candidate for call %s"
            java.lang.String r3 = "SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE"
            r0.<init>(r3, r1, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = r0
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.$ENTRIES = r0
            return
    }

    ErrorScopeKind(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.debugMessage = r3
            return
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind> r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r1 = (kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] values() {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[] r0 = (kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind[]) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDebugMessage() {
            r1 = this;
            java.lang.String r0 = r1.debugMessage
            return r0
    }
}
