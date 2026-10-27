package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(@org.jetbrains.annotations.NotNull androidx.room.util.FtsTableInfo r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            if (r3 != r4) goto L9
            r3 = 1
            return r3
        L9:
            boolean r0 = r4 instanceof androidx.room.util.FtsTableInfo
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = r3.name
            androidx.room.util.FtsTableInfo r4 = (androidx.room.util.FtsTableInfo) r4
            java.lang.String r2 = r4.name
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.util.Set<java.lang.String> r0 = r3.columns
            java.util.Set<java.lang.String> r2 = r4.columns
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 != 0) goto L27
            return r1
        L27:
            java.util.Set<java.lang.String> r3 = r3.options
            java.util.Set<java.lang.String> r4 = r4.options
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r4)
            return r3
    }

    public static final int hashCodeCommon(@org.jetbrains.annotations.NotNull androidx.room.util.FtsTableInfo r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.name
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Set<java.lang.String> r1 = r2.columns
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set<java.lang.String> r2 = r2.options
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String toStringCommon(@org.jetbrains.annotations.NotNull androidx.room.util.FtsTableInfo r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\n            |FtsTableInfo {\n            |   name = '"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columns = {"
            r0.append(r1)
            java.util.Set<java.lang.String> r1 = r2.columns
            java.util.List r1 = kotlin.collections.f0.v5(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r1 = androidx.room.util.TableInfoKt.formatString(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |   options = {"
            r0.append(r1)
            java.util.Set<java.lang.String> r2 = r2.options
            java.util.List r2 = kotlin.collections.f0.v5(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r2 = androidx.room.util.TableInfoKt.formatString(r2)
            r0.append(r2)
            java.lang.String r2 = "\n            |}\n        "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            r1 = 1
            java.lang.String r2 = kotlin.text.u.x(r2, r0, r1, r0)
            return r2
    }
}
