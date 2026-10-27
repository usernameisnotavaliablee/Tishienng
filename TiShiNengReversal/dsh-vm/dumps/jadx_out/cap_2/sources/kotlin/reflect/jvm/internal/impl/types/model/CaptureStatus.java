package kotlin.reflect.jvm.internal.impl.types.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public enum CaptureStatus extends java.lang.Enum<kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] $VALUES = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FOR_INCORPORATION = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FOR_SUBTYPING = null;
    public static final kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus FROM_EXPRESSION = null;

    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] $values() {
            r0 = 3
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] r0 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[r0]
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            r2 = 0
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_INCORPORATION
            r2 = 1
            r0[r2] = r1
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FROM_EXPRESSION
            r2 = 2
            r0[r2] = r1
            return r0
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r0 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus
            java.lang.String r1 = "FOR_SUBTYPING"
            r2 = 0
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING = r0
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r0 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus
            java.lang.String r1 = "FOR_INCORPORATION"
            r2 = 1
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_INCORPORATION = r0
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r0 = new kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus
            java.lang.String r1 = "FROM_EXPRESSION"
            r2 = 2
            r0.<init>(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FROM_EXPRESSION = r0
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] r0 = $values()
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.$ENTRIES = r0
            return
    }

    CaptureStatus(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus> r0 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r1 = (kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus) r1
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] values() {
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] r0 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[] r0 = (kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus[]) r0
            return r0
    }
}
