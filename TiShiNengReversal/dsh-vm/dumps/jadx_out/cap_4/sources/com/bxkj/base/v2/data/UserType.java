package com.bxkj.base.v2.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum UserType extends java.lang.Enum<com.bxkj.base.v2.data.UserType> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ com.bxkj.base.v2.data.UserType[] $VALUES = null;
    public static final com.bxkj.base.v2.data.UserType STUDENT = null;
    public static final com.bxkj.base.v2.data.UserType TEACHER = null;

    private static final /* synthetic */ com.bxkj.base.v2.data.UserType[] $values() {
            r0 = 2
            com.bxkj.base.v2.data.UserType[] r0 = new com.bxkj.base.v2.data.UserType[r0]
            com.bxkj.base.v2.data.UserType r1 = com.bxkj.base.v2.data.UserType.STUDENT
            r2 = 0
            r0[r2] = r1
            com.bxkj.base.v2.data.UserType r1 = com.bxkj.base.v2.data.UserType.TEACHER
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            com.bxkj.base.v2.data.UserType r0 = new com.bxkj.base.v2.data.UserType
            java.lang.String r1 = "STUDENT"
            r2 = 0
            r0.<init>(r1, r2)
            com.bxkj.base.v2.data.UserType.STUDENT = r0
            com.bxkj.base.v2.data.UserType r0 = new com.bxkj.base.v2.data.UserType
            java.lang.String r1 = "TEACHER"
            r2 = 1
            r0.<init>(r1, r2)
            com.bxkj.base.v2.data.UserType.TEACHER = r0
            com.bxkj.base.v2.data.UserType[] r0 = $values()
            com.bxkj.base.v2.data.UserType.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            com.bxkj.base.v2.data.UserType.$ENTRIES = r0
            return
    }

    UserType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<com.bxkj.base.v2.data.UserType> getEntries() {
            kotlin.enums.a r0 = com.bxkj.base.v2.data.UserType.$ENTRIES
            return r0
    }

    public static com.bxkj.base.v2.data.UserType valueOf(java.lang.String r1) {
            java.lang.Class<com.bxkj.base.v2.data.UserType> r0 = com.bxkj.base.v2.data.UserType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bxkj.base.v2.data.UserType r1 = (com.bxkj.base.v2.data.UserType) r1
            return r1
    }

    public static com.bxkj.base.v2.data.UserType[] values() {
            com.bxkj.base.v2.data.UserType[] r0 = com.bxkj.base.v2.data.UserType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bxkj.base.v2.data.UserType[] r0 = (com.bxkj.base.v2.data.UserType[]) r0
            return r0
    }
}
