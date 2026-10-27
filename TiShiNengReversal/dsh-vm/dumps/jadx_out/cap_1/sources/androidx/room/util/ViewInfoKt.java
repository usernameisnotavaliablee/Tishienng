package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewInfoKt {
    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.ViewInfo r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            if (r4 != r5) goto L9
            return r0
        L9:
            boolean r1 = r5 instanceof androidx.room.util.ViewInfo
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            java.lang.String r1 = r4.name
            androidx.room.util.ViewInfo r5 = (androidx.room.util.ViewInfo) r5
            java.lang.String r3 = r5.name
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L30
            java.lang.String r4 = r4.sql
            if (r4 == 0) goto L26
            java.lang.String r5 = r5.sql
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            goto L2d
        L26:
            java.lang.String r4 = r5.sql
            if (r4 != 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 == 0) goto L30
            return r0
        L30:
            return r2
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.ViewInfo r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = r1.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.sql
            if (r1 == 0) goto L16
            int r1 = r1.hashCode()
            goto L17
        L16:
            r1 = 0
        L17:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.ViewInfo r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |ViewInfo {\n            |   name = '"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "',\n            |   sql = '"
            r0.append(r1)
            java.lang.String r2 = r2.sql
            r0.append(r2)
            java.lang.String r2 = "'\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            r1 = 1
            java.lang.String r2 = kotlin.text.u.x(r2, r0, r1, r0)
            return r2
    }
}
