package com.github.aachartmodel.aainfographics.aatools;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public final class AAColorKt {
    public AAColorKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AARgb(int r0, int r1, int r2, float r3) {
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = AARgba(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String AARgb$default(int r0, int r1, int r2, float r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L6
            r3 = 1065353216(0x3f800000, float:1.0)
        L6:
            java.lang.String r0 = AARgb(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AARgba(int r2, int r3, int r4, float r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rgba("
            r0.append(r1)
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static /* synthetic */ java.lang.String AARgba$default(int r0, int r1, int r2, float r3, int r4, java.lang.Object r5) {
            r4 = r4 & 8
            if (r4 == 0) goto L6
            r3 = 1065353216(0x3f800000, float:1.0)
        L6:
            java.lang.String r0 = AARgba(r0, r1, r2, r3)
            return r0
    }
}
