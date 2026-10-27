package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.JvmName(name = "StringUtil")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStringUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1611#2,9:84\n1863#2:93\n1864#2:95\n1620#2:96\n1#3:94\n*S KotlinDebug\n*F\n+ 1 StringUtil.kt\nandroidx/room/util/StringUtil\n*L\n64#1:84,9\n64#1:93\n64#1:95\n64#1:96\n64#1:94\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class StringUtil {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.room.util.StringUtil.EMPTY_STRING_ARRAY = r0
            return
    }

    public static final void appendPlaceholders(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r2, int r3) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
        L6:
            if (r0 >= r3) goto L19
            java.lang.String r1 = "?"
            r2.append(r1)
            int r1 = r3 + (-1)
            if (r0 >= r1) goto L16
            java.lang.String r1 = ","
            r2.append(r1)
        L16:
            int r0 = r0 + 1
            goto L6
        L19:
            return
    }

    @kotlin.Deprecated(message = "No longer used by generated code")
    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String joinIntoString(@org.jetbrains.annotations.Nullable java.util.List<java.lang.Integer> r9) {
            if (r9 == 0) goto L14
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 62
            r8 = 0
            java.lang.String r1 = ","
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = kotlin.collections.f0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        L14:
            r9 = 0
            return r9
    }

    @kotlin.Deprecated(message = "No longer used by generated code")
    @org.jetbrains.annotations.NotNull
    public static final java.lang.StringBuilder newStringBuilder() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.util.List<java.lang.Integer> splitToIntList(@org.jetbrains.annotations.Nullable java.lang.String r8) {
            r0 = 0
            if (r8 == 0) goto L3f
            r1 = 1
            char[] r3 = new char[r1]
            r1 = 44
            r2 = 0
            r3[r2] = r1
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            java.util.List r8 = kotlin.text.u.l5(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L3f
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L36
            goto L38
        L36:
            r2 = r0
        L38:
            if (r2 == 0) goto L21
            r1.add(r2)
            goto L21
        L3e:
            return r1
        L3f:
            return r0
    }
}
